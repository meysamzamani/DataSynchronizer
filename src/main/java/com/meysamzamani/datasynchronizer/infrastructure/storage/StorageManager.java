package com.meysamzamani.datasynchronizer.infrastructure.storage;

import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;

import java.io.File;
import java.util.List;

public interface StorageManager {

    List<Bucket> getBuckets();
    Bucket createBucket(String bucketName);
    void deleteBucket(String bucketName);
    List<PutObjectResult> putObjects(String bucketName, List<String> filePaths);
    S3Object getObject(String bucketName, String fileName);
    ObjectListing filesList(String bucketName);

}
