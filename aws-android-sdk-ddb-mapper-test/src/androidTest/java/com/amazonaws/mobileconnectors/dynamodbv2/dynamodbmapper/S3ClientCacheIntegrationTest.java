/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.mobileconnectors.s3.transfermanager.TransferManager;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Region;

import org.junit.Before;
import org.junit.Test;

public class S3ClientCacheIntegrationTest {
    // private static final long ONE_HOUR_MILLIS = 60 * 60 * 1000;
    private AWSCredentials credentials;

    @Before
    public void setUp() {
        credentials = new BasicAWSCredentials("mock", "mock");
    }

    @Test
    public void testClientReuse() {
        S3ClientCache s3cc = new S3ClientCache(credentials);

        TransferManager tmEast = s3cc.getTransferManager(Region.US_Standard);
        AmazonS3Client s3East = s3cc.getClient(Region.US_Standard);

        assertNotNull(tmEast);
        assertNotNull(s3East);
        assertSame(s3East, tmEast.getAmazonS3Client());

        assertSame(s3East, s3cc.getClient(Region.US_Standard));
        assertSame(tmEast, s3cc.getTransferManager(Region.US_Standard));
    }

    @Test
    public void testUserProvidedClients() {
        S3ClientCache s3cc = new S3ClientCache(credentials);
        AmazonS3Client s3East1 = new AmazonS3Client(credentials,
                com.amazonaws.regions.Region.getRegion(Regions.US_EAST_1));

        s3East1.setRegion(Region.US_Standard.toAWSRegion());
        AmazonS3Client s3West1 = new AmazonS3Client(credentials,
                com.amazonaws.regions.Region.getRegion(Regions.US_WEST_1));

        s3West1.setRegion(Region.US_West.toAWSRegion());
        AmazonS3Client s3West2 = new AmazonS3Client(credentials,
                com.amazonaws.regions.Region.getRegion(Regions.US_WEST_2));

        s3West2.setRegion(Region.US_West_2.toAWSRegion());

        s3cc.useClient(s3East1);
        s3cc.useClient(s3West1);
        s3cc.useClient(s3West2);

        TransferManager tmEast1 = s3cc.getTransferManager(Region.US_Standard);
        TransferManager tmWest1 = s3cc.getTransferManager(Region.US_West);
        TransferManager tmWest2 = s3cc.getTransferManager(Region.US_West_2);

        assertNotSame(tmEast1, tmWest1);
        assertNotSame(tmEast1, tmWest2);
        assertNotSame(tmWest1, tmWest2);

        assertSame(s3cc.getClient(Region.US_Standard), tmEast1.getAmazonS3Client());
        assertSame(s3cc.getClient(Region.US_West), tmWest1.getAmazonS3Client());
        assertSame(s3cc.getClient(Region.US_West_2), tmWest2.getAmazonS3Client());
    }

    @Test
    public void testReplaceClient() {
        S3ClientCache s3cc = new S3ClientCache(credentials);

        TransferManager tmEast1 = s3cc.getTransferManager(Region.US_Standard);
        assertNotNull(tmEast1);

        AmazonS3Client newS3East = new AmazonS3Client(credentials,
                com.amazonaws.regions.Region.getRegion(Regions.US_EAST_1));
        newS3East.setRegion(Region.US_Standard.toAWSRegion());
        s3cc.useClient(newS3East); // should remove old TM

        TransferManager tmEast2 = s3cc.getTransferManager(Region.US_Standard);
        assertNotNull(tmEast2);
        assertNotSame(tmEast2, tmEast1);
        assertNotSame(tmEast2.getAmazonS3Client(), tmEast1.getAmazonS3Client());
    }

    @Test
    public void testBadClientCache() {
        S3ClientCache s3cc = new S3ClientCache(credentials);
        AmazonS3Client notAnAWSEndpoint = new AmazonS3Client(credentials,
                com.amazonaws.regions.Region.getRegion(Regions.US_EAST_1));
        notAnAWSEndpoint.setEndpoint("i.am.an.invalid.aws.endpoint.com");
        try {
            s3cc.useClient(notAnAWSEndpoint);
        } catch (IllegalStateException e) {
            assertEquals("S3 client with invalid S3 endpoint configured", e.getMessage());
            return;
        }

        fail("Expected exception to be thrown");
    }

    @Test
    public void testNonExistentRegion() {
        S3ClientCache s3cc = new S3ClientCache(credentials);
        AmazonS3Client notAnAWSEndpoint = new AmazonS3Client(credentials,
                com.amazonaws.regions.Region.getRegion(Regions.US_EAST_1));
        notAnAWSEndpoint.setEndpoint("s3-mordor.amazonaws.com");
        try {
            s3cc.useClient(notAnAWSEndpoint);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot create enum from mordor value!", e.getMessage());
            return;
        }

        fail("Expected S3LinkAttributeException to be thrown");
    }
}
