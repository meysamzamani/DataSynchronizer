package com.meysamzamani.datasynchronizer.infrastructure.storage;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class S3Manager implements StorageManager {

    @Autowired
    private AmazonS3 amazonS3;

    @Override
    public List<Bucket> getBuckets() {
        return amazonS3.listBuckets();
    }

    @Override
    public Bucket createBucket(String bucketName) {
        return amazonS3.createBucket(bucketName);
    }

    @Override
    public void deleteBucket(String bucketName) {
        if (isBucketExist(getBuckets(), bucketName)) {
            amazonS3.deleteBucket(bucketName);
        }
    }

    @Override
    public List<PutObjectResult> putObjects(String bucketName, List<String> filePaths) {
        if (!isBucketExist(getBuckets(), bucketName)) {
            createBucket(bucketName);
        }

        List<PutObjectResult> uploadedObjects = new ArrayList<>();
        for (String path : filePaths) {
            File file = new File(path);
            uploadedObjects.add(amazonS3.putObject(bucketName, file.getName(), file));
        }

        return uploadedObjects;
    }

    @Override
    public S3Object getObject(String bucketName, String fileName) {
        return amazonS3.getObject(bucketName, fileName);
    }

    @Override
    public ObjectListing filesList(String bucketName) {
        return amazonS3.listObjects(bucketName);
    }

    private boolean isBucketExist(List<Bucket> buckets, String bucketName) {
        Bucket existBucket = buckets.stream()
                .filter(bucket -> bucketName.equals(bucket.getName()))
                .findAny()
                .orElse(null);
        return existBucket != null;
    }
}
