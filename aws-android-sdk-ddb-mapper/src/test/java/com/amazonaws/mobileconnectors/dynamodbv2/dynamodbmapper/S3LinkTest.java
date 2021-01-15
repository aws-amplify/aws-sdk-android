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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.eq;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.StringUtils;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class S3LinkTest
{
    private DynamoDBMapper mapper;
    private AmazonDynamoDB mockDDB;
    private AmazonS3Client mockS3;
    private final String bucket = "test-bucket";
    private final String key = "test-object";

    @Before
    public void setUp() {
        AWSCredentials credentials = new BasicAWSCredentials("mock", "mock");
        StaticCredentialsProvider s3CredentialProvider = new StaticCredentialsProvider(credentials);

        mockDDB = EasyMock.createMock(AmazonDynamoDB.class);
        mockS3 = EasyMock.createMock(AmazonS3Client.class);
        mapper = DynamoDBMapper.builder()
                .dynamoDBClient(mockDDB)
                .awsCredentialsProviderForS3(s3CredentialProvider)
                .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullKey() {
        mapper.createS3Link("bucket", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullBucketName() {
        mapper.createS3Link(null, "key");
    }

    @Test
    public void testToJson() {
        S3Link testLink = mapper.createS3Link("bucket", "key");
        String json = testLink.toJson();

        assertEquals(json,
                "{\"s3\":{\"bucket\":\"bucket\",\"key\":\"key\",\"region\":null}}",
                json);
        testLink = mapper.createS3Link("bucket", "testKey");
        json = testLink.toJson();
        assertEquals(json,
                "{\"s3\":{\"bucket\":\"bucket\",\"key\":\"testKey\",\"region\":null}}",
                json);

        testLink = mapper.createS3Link(Region.AP_Sydney, "bucket", "testKey");
        json = testLink.toJson();
        assertEquals(
                json,
                "{\"s3\":{\"bucket\":\"bucket\",\"key\":\"testKey\",\"region\":\"ap-southeast-2\"}}",
                json);

        testLink = mapper.createS3Link(Region.AP_Sydney, "test-bucket", "testKey");
        json = testLink.toJson();
        assertEquals(
                json,
                "{\"s3\":{\"bucket\":\"test-bucket\",\"key\":\"testKey\",\"region\":\"ap-southeast-2\"}}",
                json);

        testLink = mapper.createS3Link(Region.AP_Sydney, "test-bucket", "test/key/with/slashes");
        json = testLink.toJson();
        assertEquals(
                json,
                "{\"s3\":{\"bucket\":\"test-bucket\",\"key\":\"test/key/with/slashes\",\"region\":\"ap-southeast-2\"}}",
                json);

        testLink = mapper.createS3Link("test-bucket", "test/key/with/slashes");
        json = testLink.toJson();
        assertEquals(
                json,
                "{\"s3\":{\"bucket\":\"test-bucket\",\"key\":\"test/key/with/slashes\",\"region\":null}}",
                json);
        testLink = mapper.createS3Link(Region.AP_Sydney, "test-bucket", "test/key/with/slashes");
        json = testLink.toJson();
        assertEquals(
                json,
                "{\"s3\":{\"bucket\":\"test-bucket\",\"key\":\"test/key/with/slashes\",\"region\":\"ap-southeast-2\"}}",
                json);
    }

    @Test
    public void testFromJason() {
        String json = "{\"s3\":{\"region\":\"ap-southeast-2\",\"bucket\":\"test-bucket\",\"key\":\"testKey\"}}";
        S3Link s3link = S3Link.fromJson(mapper.getS3ClientCache(), json);
        assertEquals("test-bucket", s3link.getBucketName());
        assertEquals("ap-southeast-2", s3link.getS3Region().getFirstRegionId());
        assertEquals("testKey", s3link.getKey());
    }

    @Test
    public void testDefaultRegion() {
        S3Link testLink1 = mapper.createS3Link("bucket", "key");
        String json = testLink1.toJson();
        // Default to US_STANDARD if not specified
        assertEquals(json,
                "{\"s3\":{\"bucket\":\"bucket\",\"key\":\"key\",\"region\":null}}",
                json);
        // Default region changed to GovCloud
        testLink1 = mapper.createS3Link(Region.US_GovCloud, "bucket", "key");
        json = testLink1.toJson();
        assertEquals(json,
                "{\"s3\":{\"bucket\":\"bucket\",\"key\":\"key\",\"region\":\"s3-us-gov-west-1\"}}",
                json);
    }

    @Test
    public void testDownloadToOutstream() {
        EasyMock.reset(mockS3);

        EasyMock.expect(mockS3.getRegion()).andReturn(Region.US_Standard);

        byte[] mockResponseBytes = "MyData".getBytes(StringUtils.UTF8);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        S3Object mockObj = EasyMock.createMock(S3Object.class);

        ByteArrayInputStream bis = new ByteArrayInputStream(mockResponseBytes);
        S3ObjectInputStream s3is = new S3ObjectInputStream(bis);

        EasyMock.expect(mockS3.getObject(anyObject(GetObjectRequest.class))).andReturn(mockObj);
        EasyMock.expect(mockObj.getObjectContent()).andReturn(s3is);
        EasyMock.expect(mockObj.getObjectMetadata()).andReturn(new ObjectMetadata());

        EasyMock.replay(mockS3, mockObj);

        mapper.getS3ClientCache().useClient(mockS3);
        S3Link link = mapper.createS3Link(bucket, key);
        link.downloadTo(bos);

        EasyMock.verify(mockS3, mockObj);
        assertArrayEquals(mockResponseBytes, bos.toByteArray());
    }

    @Test
    public void testDownloadToFile() throws IOException {
        EasyMock.reset(mockS3);

        EasyMock.expect(mockS3.getRegion()).andReturn(Region.US_Standard);

        File testFile = new File("S3LinkTest");
        if (testFile.exists()) {
            assertTrue(testFile.delete());
        }
        assertTrue(testFile.createNewFile());

        S3Object mockObj = EasyMock.createMock(S3Object.class);

        EasyMock.expect(mockS3.getObject(anyObject(GetObjectRequest.class), eq(testFile)))
                .andReturn(null);

        EasyMock.replay(mockS3, mockObj);

        mapper.getS3ClientCache().useClient(mockS3);
        S3Link link = mapper.createS3Link(bucket, key);
        link.downloadTo(testFile);

        EasyMock.verify(mockS3, mockObj);
        assertTrue(testFile.delete());
    }

    @Test
    public void testUploadFromByteArray() throws IOException {
        EasyMock.reset(mockS3);

        EasyMock.expect(mockS3.getRegion()).andReturn(Region.US_Standard);

        Capture<PutObjectRequest> por = new Capture<PutObjectRequest>();
        EasyMock.expect(mockS3.putObject(EasyMock.capture(por))).andReturn(null);
        EasyMock.replay(mockS3);

        mapper.getS3ClientCache().useClient(mockS3);
        S3Link link = mapper.createS3Link(bucket, key);
        link.uploadFrom("Test".getBytes(StringUtils.UTF8));

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        InputStream is = por.getValue().getInputStream();
        int currByte = -1;
        while ((currByte = is.read()) != -1) {
            bos.write(currByte);
        }

        assertArrayEquals(bos.toByteArray(), "Test".getBytes(StringUtils.UTF8));

        EasyMock.verify();
    }

    @Test
    public void testUploadFromFile() throws IOException {
        EasyMock.reset(mockS3);

        EasyMock.expect(mockS3.getRegion()).andReturn(Region.US_Standard);

        Capture<PutObjectRequest> por = new Capture<PutObjectRequest>();
        EasyMock.expect(mockS3.putObject(EasyMock.capture(por))).andReturn(null);
        EasyMock.replay(mockS3);

        mapper.getS3ClientCache().useClient(mockS3);
        S3Link link = mapper.createS3Link(bucket, key);

        File temp = new File("testUpload");
        if (temp.exists()) {
            assertTrue(temp.delete());
        }

        temp.createNewFile();
        FileOutputStream fos = new FileOutputStream(temp);
        fos.write("Test".getBytes(StringUtils.UTF8));
        fos.close();

        link.uploadFrom(temp);

        File sent = por.getValue().getFile();
        assertEquals(temp, sent);
        assertTrue(temp.delete());

        EasyMock.verify();
    }

    @Test
    public void testGetURL() {

        AWSCredentials credentials = new BasicAWSCredentials("mock", "mock");
        StaticCredentialsProvider s3CredentialProvider = new StaticCredentialsProvider(credentials);
        AmazonS3Client realS3 = new AmazonS3Client(s3CredentialProvider,
                com.amazonaws.regions.Region.getRegion(Regions.US_WEST_2));

        mapper.getS3ClientCache().useClient(realS3);
        S3Link link = mapper.createS3Link(Region.US_West_2, bucket, key);

        URL createdURL = realS3.getUrl(bucket, key);
        URL retrievedURL = link.getUrl();

        assertEquals(createdURL, retrievedURL);
    }

    @Test
    public void testSetACL() {
        AccessControlList acl = new AccessControlList();

        EasyMock.reset(mockS3);
        EasyMock.expect(mockS3.getRegion()).andReturn(Region.US_Standard);

        mockS3.setObjectAcl(anyObject(String.class), anyObject(String.class),
                anyObject(String.class), eq(acl), eq((RequestMetricCollector) null));
        EasyMock.expectLastCall().once();

        EasyMock.replay(mockS3);

        mapper.getS3ClientCache().useClient(mockS3);
        S3Link link = mapper.createS3Link(bucket, key);
        link.setAcl(acl);

        EasyMock.verify(mockS3);
    }

    @Test
    public void testSetCannedACL() {

        EasyMock.reset(mockS3);
        EasyMock.expect(mockS3.getRegion()).andReturn(Region.US_Standard);

        CannedAccessControlList cannedACL = CannedAccessControlList.Private;

        mockS3.setObjectAcl(anyObject(String.class), anyObject(String.class),
                anyObject(String.class), eq(cannedACL), eq((RequestMetricCollector) null));
        EasyMock.expectLastCall().once();

        EasyMock.replay(mockS3);

        mapper.getS3ClientCache().useClient(mockS3);
        S3Link link = mapper.createS3Link(bucket, key);
        link.setAcl(cannedACL);

        EasyMock.verify(mockS3);
    }
}
