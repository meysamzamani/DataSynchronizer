package com.meysamzamani.datasynchronizer.infrastructure.storage;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

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
        amazonS3.deleteBucket(bucketName);
    }

    @Override
    public PutObjectResult putObject(String bucketName, String fileName, File file) {
        return amazonS3.putObject(bucketName, fileName, file);
    }

    @Override
    public S3Object getObject(String bucketName, String fileName) {
        return amazonS3.getObject(bucketName, fileName);
    }

    @Override
    public ObjectListing filesList(String bucketName) {
        return amazonS3.listObjects(bucketName);
    }
}
