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

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class S3ErrorResponseHandlerTest {

    @Test
    public void testHandleErrorResponseWithNoBody() throws IOException {

        HttpResponse errorResponse = new HttpResponse.Builder()
                .statusCode(500)
                .content(null)
                .statusText("testError")
                .header(Headers.REQUEST_ID, "testId")
                .header(Headers.EXTENDED_REQUEST_ID, "extendedId").build();

        S3ErrorResponseHandler handler = new S3ErrorResponseHandler();
        AmazonS3Exception ase = (AmazonS3Exception) handler.handle(errorResponse);

        assertEquals(ase.getErrorMessage(), "testError");
        assertEquals(ase.getErrorType(), ErrorType.Service);
        assertEquals(ase.getRequestId(), "testId");
        assertEquals(ase.getExtendedRequestId(), "extendedId");
        assertEquals(ase.getStatusCode(), 500);
    }

    @Test
    public void testHandleErrorResponse() throws IOException {

        String response = "<Error>"
                + "<Message>testError</Message>"
                + "<Code>testCode</Code>"
                + "<RequestId>testId</RequestId>"
                + "<HostId>testHost</HostId>"
                + "</Error>";

        ByteArrayInputStream content = new ByteArrayInputStream(response.getBytes(StringUtils.UTF8));

        HttpResponse errorResponse = new HttpResponse.Builder()
                .statusCode(200)
                .content(content)
                .statusText("testError").build();

        S3ErrorResponseHandler handler = new S3ErrorResponseHandler();
        AmazonS3Exception ase = (AmazonS3Exception) handler.handle(errorResponse);

        assertEquals(ase.getErrorMessage(), "testError");
        assertEquals(ase.getErrorType(), ErrorType.Client);
        assertEquals(ase.getRequestId(), "testId");
        assertEquals(ase.getExtendedRequestId(), "testHost");
        assertEquals(ase.getStatusCode(), 200);
        assertEquals(ase.getErrorCode(), "testCode");

    }

    @Test
    public void testErrorResponseFromUnparsableXML() throws IOException {
        String response = "<Error>"
                + "<Message>testError";

        ByteArrayInputStream content = new ByteArrayInputStream(response.getBytes(StringUtils.UTF8));

        HttpResponse errorResponse = new HttpResponse.Builder()
                .statusCode(200)
                .content(content)
                .statusText("testError").build();

        S3ErrorResponseHandler handler = new S3ErrorResponseHandler();
        AmazonS3Exception ase = (AmazonS3Exception) handler.handle(errorResponse);

        assertEquals(ase.getStatusCode(), 200);
        assertEquals(ase.getErrorType(), ErrorType.Client);
        assertEquals(ase.getErrorCode(), "200 testError");

    }

}
