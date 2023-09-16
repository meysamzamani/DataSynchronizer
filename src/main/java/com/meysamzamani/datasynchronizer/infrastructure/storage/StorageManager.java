package com.meysamzamani.datasynchronizer.infrastructure.storage;

import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;

import java.io.File;
import java.util.List;

public interface StorageManager {

    public List<Bucket> getBuckets();
    public Bucket createBucket(String bucketName);
    public void deleteBucket(String bucketName);
    public PutObjectResult putObject(String bucketName, String fileName, File file);
    public S3Object getObject(String bucketName, String fileName);
    public ObjectListing filesList(String bucketName);

}
