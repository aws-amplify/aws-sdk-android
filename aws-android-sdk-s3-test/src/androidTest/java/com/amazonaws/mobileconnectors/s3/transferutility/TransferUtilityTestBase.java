/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

@RunWith(AndroidJUnit4.class)
public abstract class TransferUtilityTestBase extends AWSTestBase {

    protected static Context appContext;
    protected static CognitoCachingCredentialsProvider sCredProvider;
    protected static AmazonS3Client sS3Client;
    protected static TransferUtility transferUtility;
    protected static TransferObserver transferObserver;

    protected static String bucketName;
    protected static String bucketRegion;
    protected static String identityPoolId;
    protected static String identityPoolRegion;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        bucketName = getPackageConfigure("s3").getString("bucket");
        bucketRegion = getPackageConfigure("s3").getString("bucket_region");
        identityPoolId = getPackageConfigure("s3").getString("identity_pool_id");
        identityPoolRegion = getPackageConfigure("s3").getString("identity_pool_id_region");

        appContext = InstrumentationRegistry.getTargetContext();
        sCredProvider = new CognitoCachingCredentialsProvider(
                appContext,
                identityPoolId,
                Regions.fromName(identityPoolRegion));

        sS3Client = new AmazonS3Client(sCredProvider, Region.getRegion(bucketRegion));

        transferUtility = TransferUtility.builder()
                .context(appContext)
                .defaultBucket(bucketName)
                .s3Client(sS3Client)
                .build();

        appContext.startService(new Intent(appContext, TransferService.class));
    }

    void fillFile(File file, long size) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        int bufLength = 128 * 1024;
        byte[] buf = new byte[bufLength];
        Random rand = new Random();
        long bytesLeft = size;
        while (bytesLeft > 0) {
            rand.nextBytes(buf);
            int len = bytesLeft < bufLength ? (int) bytesLeft : bufLength;
            fos.write(buf, 0, len);
            bytesLeft -= len;
        }
        fos.close();

    }
}