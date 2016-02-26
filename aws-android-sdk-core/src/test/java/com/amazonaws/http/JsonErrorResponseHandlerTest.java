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

package com.amazonaws.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonErrorResponseHandlerTest {

    private JsonErrorResponseHandler handler;
    private HttpResponse response;

    @Before
    public void setup() {
        handler = new JsonErrorResponseHandler(Arrays.asList(new JsonErrorUnmarshaller()));
    }

    @Test
    public void testRestJsonErrorResponse() throws Exception {
        String body = "{\"message\":\"Clock is skewed\"}";
        ByteArrayInputStream content = new ByteArrayInputStream(body.getBytes(StringUtils.UTF8));
        response = HttpResponse.builder()
                .content(content)
                .statusCode(403)
                .header("x-amzn-ErrorType", "InvalidSignatureException")
                .build();
        AmazonServiceException ase = handler.handle(response);
        assertEquals(ase.getErrorCode(), "InvalidSignatureException");
    }

    @Test
    public void testJsonErrorResponse() throws Exception {
        String body = "{\"__type\":\"InvalidSignatureException\",\"message\":\"Clock is skewed\"}";
        ByteArrayInputStream content = new ByteArrayInputStream(body.getBytes(StringUtils.UTF8));
        response = HttpResponse.builder()
                .content(content)
                .statusCode(403)
                .build();
        AmazonServiceException ase = handler.handle(response);
        assertEquals(ase.getErrorCode(), "InvalidSignatureException");
    }

    @Test
    public void testJsonErrorResponseReturnsNullIfExceptionIsNull() throws Exception {
        List<JsonErrorUnmarshaller> exceptionUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller() {

            @Override
            public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {
                return null;
            }

        });
        handler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        response = HttpResponse.builder()
                .statusCode(403)
                .content(new ByteArrayInputStream("{}".getBytes(StringUtils.UTF8)))
                .build();
        assertNull(handler.handle(response));
    }

    @Test
    public void testJsonErrorResponseReturnsServiceErrorTypeIfErrorStatus5XX() throws Exception {
        List<JsonErrorUnmarshaller> exceptionUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller() {

            @Override
            public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {
                return new AmazonServiceException("TestException");
            }

        });
        handler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        response = HttpResponse.builder()
                .statusCode(500)
                .content(new ByteArrayInputStream("{}".getBytes(StringUtils.UTF8)))
                .build();
        AmazonServiceException returnedException = handler.handle(response);
        assertEquals(returnedException.getErrorType(), ErrorType.Service);
    }

    @Test
    public void testJsonErrorResponseReturnsXAmzRequestId() throws Exception {
        List<JsonErrorUnmarshaller> exceptionUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller() {

            @Override
            public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {
                return new AmazonServiceException("TestException");
            }

        });
        handler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        response = HttpResponse.builder()
                .statusCode(500)
                .header("X-Amzn-RequestId", "55")
                .content(new ByteArrayInputStream("{}".getBytes(StringUtils.UTF8)))
                .build();
        AmazonServiceException returnedException = handler.handle(response);
        assertEquals(returnedException.getRequestId(), "55");
    }
}
