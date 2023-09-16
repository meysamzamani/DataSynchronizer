package com.meysamzamani.datasynchronizer.infrastructure.storage;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Configuration {

    @Value("${com.meysamzamani.data_synchronizer.storage.access_key}")
    private String accessKey;

    @Value("${com.meysamzamani.data_synchronizer.storage.secret_key}")
    private String secretKey;

    @Value("${com.meysamzamani.data_synchronizer.storage.endpoint}")
    private String endpoint;

    @Value("${com.meysamzamani.data_synchronizer.storage.region}")
    private String region;

    @Bean
    public AmazonS3 s3() {
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region))
                .build();
    }
}
