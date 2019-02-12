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

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.GetObjectRequest;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

/**
 * TODO:
 *
 * Skipping the execution of this test due to the removal of
 * SigV2. Once SigV2 support is removed from the AmazonS3Client,
 * delete these tests.
 */
public class S3SignerTest {

    @Ignore
    @Test
    public void testSign() throws URISyntaxException {
        final GetObjectRequest gr = new GetObjectRequest("test-bucket123456", "TestFile.txt");
        final Request<?> req = new DefaultRequest(gr, Constants.S3_SERVICE_DISPLAY_NAME);
        req.setHttpMethod(HttpMethodName.GET);
        req.setResourcePath("/test-bucket123456/TestFile.txt");
        req.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        req.addHeader(Headers.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=utf-8");
        final S3Signer signer = new S3Signer("GET", "/test-bucket123456/TestFile.txt");
        // These are fake bogus credentials just for tesitng
        signer.sign(req, new BasicAWSCredentials(
                "AKI11BOGUS11ACCESS11KEYOZQ", "LYd/ZD611BOGUS11SECRET11KEYSiD6"), new Date(
                1431374979760L));
        assertEquals(getSignature(req), "kD6n4rzH5+82Nw5wFIhaD1pKXNM=");
    }

    private String getSignature(Request<?> req) {
        final String header = req.getHeaders().get("Authorization");
        final int colonIndex = header.indexOf(':') + 1;
        return header.substring(colonIndex);
    }
}
