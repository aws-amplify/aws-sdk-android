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

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.model.GetObjectRequest;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

public class S3QueryStringSignerTest {

    @Test
    public void testSign() throws URISyntaxException {
        final S3QueryStringSigner signer = new S3QueryStringSigner("GET",
                "/test-bucket123456/TestFile.txt", new Date(1431377237312L));
        final GetObjectRequest gr = new GetObjectRequest("test-bucket123456", "TestFile.txt");
        final Request<?> req = new DefaultRequest(gr, Constants.S3_SERVICE_DISPLAY_NAME);
        req.setHttpMethod(HttpMethodName.GET);
        req.setResourcePath("TestFile.txt");
        req.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));

        signer.sign(req, new BasicAWSCredentials(
                "AKIAJD11BOGUS11ACCESS11KEYXMGOZQ", "LYd/ZD4F11BOGUS11SECRET11KEYOM1SiD6"));

        assertEquals(
                "https://test-bucket123456.s3-us-west-2.amazonaws.com/TestFile.txt?AWSAccessKeyId=AKIAJD11BOGUS11ACCESS11KEYXMGOZQ&Expires=1431377237&Signature=vtILMLWYdEalygpKGFv%2FqvP5qp8%3D",
                ServiceUtils.convertRequestToUrl(req, true).toString());

    }
}
