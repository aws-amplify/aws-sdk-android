/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Date;

/**
 * Integration tests verifying that bucket names which are incompatible with
 * virtual host style addressing can still be used successfully with the S3 Android
 * client.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
@Ignore
public class V1BucketAddressingIntegrationTest extends S3IntegrationTestBase {

    /** A non-V2 compatible bucket name used by these tests */
    private final String bucketName = "Android_v1_Bucket_Addressing_Integ_Test.." + new Date().getTime();

    /** The object key used by these tests */
    private final String key = "key";

    /** Temp file with random test data for uploading to S3 */
    private File file;

    /** Releases all resources used in this test */
    @After
    public void tearDown() {
        deleteBucketAndAllContents(bucketName);
        file.delete();
    }

    /**
     * Tests a wide range of S3 operations on a bucket with a non-V2 compatible
     * bucket name, to ensure that requests involving legacy buckets can be
     * executed correctly.
     */
    @Test
    public void testV1BucketAddressing() throws Exception {
        createV1AddressedBucket(bucketName);
        file = super.getRandomTempFile("v1-addressing-integ-test", 333L);

        s3.getBucketAcl(bucketName);

        s3.putObject(bucketName, key, file);
        s3.getObjectMetadata(bucketName, key);
        s3.getObject(bucketName, key);
        s3.setObjectAcl(bucketName, key, CannedAccessControlList.PublicRead);
        s3.getObjectAcl(bucketName, key);

        s3.setBucketAcl(bucketName, CannedAccessControlList.LogDeliveryWrite);
        s3.setBucketLoggingConfiguration(
                new SetBucketLoggingConfigurationRequest(
                        bucketName, new BucketLoggingConfiguration(bucketName, "log-file-prefix")));
        s3.getBucketLoggingConfiguration(bucketName);
        s3.setBucketLoggingConfiguration(
                new SetBucketLoggingConfigurationRequest(
                        bucketName, new BucketLoggingConfiguration()));

        s3.copyObject(bucketName, key, bucketName, "key-copy");

        final URL generatePresignedUrl = s3.generatePresignedUrl(
                bucketName, key, new Date(new Date().getTime() + 1000 * 60 * 60));
        assertFileEqualsStream(file, generatePresignedUrl.openStream());

        s3.listObjects(bucketName);

        s3.listObjects(new ListObjectsRequest().withBucketName(bucketName).withPrefix(key)
                .withDelimiter("/"));
    }

    /*
     * Private Test Utility Methods
     */

    /**
     * Creates the specified bucket, including buckets with non-V2 compatible
     * bucket names. The Java client explicitly disallows creating buckets with
     * non-V2 compatible names, so this method lets us work around that
     * restriction so that we can create a non-V2 compatible bucket so that we
     * can test our compatibility with older bucket names.
     *
     * @param bucketName The name of the bucket to create.
     */
    @SuppressWarnings("static-access")
    private void createV1AddressedBucket(String bucketName) throws Exception {
        new AmazonS3Client(AWSTestBase.credentials, Region.getRegion(Regions.DEFAULT_REGION)) {
            public void createV1AddressedBucket(String bucketName) throws Exception {
                final Request<Void> request = new DefaultRequest<Void>(
                        Constants.S3_SERVICE_DISPLAY_NAME);
                request.setResourcePath(bucketName + "/");
                request.setEndpoint(new URI("https://" + Constants.S3_HOSTNAME));
                request.setHttpMethod(HttpMethodName.PUT);
                request.addHeader("Content-Type",
                        "application/x-www-form-urlencoded; charset=utf-8");
                createSigner(request, bucketName, null).sign(request, credentials);

                client.execute(request,
                        new S3XmlResponseHandler<Void>(null),
                        new S3ErrorResponseHandler(), new ExecutionContext());
            }
        }.createV1AddressedBucket(bucketName);
    }

}
