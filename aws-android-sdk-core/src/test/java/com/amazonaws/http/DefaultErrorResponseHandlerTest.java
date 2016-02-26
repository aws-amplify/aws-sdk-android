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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.StringUtils;

import org.junit.Test;
import org.w3c.dom.Node;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DefaultErrorResponseHandlerTest {

    @Test
    public void testDefaultErrorResponseHandler() throws Exception {
        List<Unmarshaller<AmazonServiceException, Node>> unmarshallerList = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        String xmlResponse = "<error>TestError</error>";
        HttpResponse errorResponse = new HttpResponse.Builder()
                .statusCode(400)
                .statusText("Error")
                .content(new ByteArrayInputStream(xmlResponse.getBytes(StringUtils.UTF8)))
                .build();

        final List<Boolean> called = new ArrayList<Boolean>();

        Unmarshaller<AmazonServiceException, Node> incorrectUnmarshaller = new Unmarshaller<AmazonServiceException, Node>() {
            @Override
            public AmazonServiceException unmarshall(Node in) throws Exception {
                called.add(true);
                return null;
            }
        };

        Unmarshaller<AmazonServiceException, Node> correctUnmarshaller = new Unmarshaller<AmazonServiceException, Node>() {
            @Override
            public AmazonServiceException unmarshall(Node in) throws Exception {
                called.add(true);
                in = in.getFirstChild();
                assertEquals(in.getNodeName(), "error");
                assertEquals(
                        in.getTextContent(), "TestError");
                AmazonServiceException ase = new AmazonServiceException("TestAse");
                return ase;
            }
        };

        unmarshallerList.add(incorrectUnmarshaller);
        unmarshallerList.add(correctUnmarshaller);

        DefaultErrorResponseHandler handler = new DefaultErrorResponseHandler(unmarshallerList);
        AmazonServiceException e = handler.handle(errorResponse);
        assertEquals(e.getErrorMessage(), "TestAse");
        assertEquals(e.getStatusCode(), 400);
        assertEquals(called.size(), 2);
        assertTrue(called.get(0));
        assertTrue(called.get(1));
    }

    @Test(expected = AmazonClientException.class)
    public void testDefaultErrorResponseHandlerNoUsefulUnmarshallers() throws Exception {
        List<Unmarshaller<AmazonServiceException, Node>> unmarshallerList = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        String xmlResponse = "<error>TestError</error>";
        HttpResponse errorResponse = new HttpResponse.Builder()
                .statusCode(400)
                .statusText("Error")
                .content(new ByteArrayInputStream(xmlResponse.getBytes(StringUtils.UTF8)))
                .build();

        final List<Boolean> called = new ArrayList<Boolean>();

        Unmarshaller<AmazonServiceException, Node> incorrectUnmarshaller = new Unmarshaller<AmazonServiceException, Node>() {
            @Override
            public AmazonServiceException unmarshall(Node in) throws Exception {
                called.add(true);
                return null;
            }
        };

        unmarshallerList.add(incorrectUnmarshaller);

        DefaultErrorResponseHandler handler = new DefaultErrorResponseHandler(unmarshallerList);
        try {
            handler.handle(errorResponse);
        } finally {
            assertEquals(called.size(), 1);
            assertTrue(called.get(0));
        }
    }

    @Test
    public void testDefaultErrorResponseHandlerCannotGetContent() throws Exception {
        List<Unmarshaller<AmazonServiceException, Node>> unmarshallerList = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        HttpResponse errorResponse = new HttpResponse.Builder()
                .statusCode(400)
                .statusText("Error")
                .content(new InputStream() {

                    @Override
                    public int read() throws IOException {
                        throw new IOException("Test IOException");
                    }

                })
                .build();

        DefaultErrorResponseHandler handler = new DefaultErrorResponseHandler(unmarshallerList);
        AmazonServiceException e = handler.handle(errorResponse);
        assertEquals(e.getErrorCode(),
                errorResponse.getStatusCode() + " " + errorResponse.getStatusText());
        assertEquals(e.getStatusCode(), 400);
        assertEquals(e.getErrorType(), ErrorType.Unknown);
    }

    @Test
    public void testDefaultErrorResponseHandlerDoesNotNeedConnectionLeftOpen() throws Exception {
        DefaultErrorResponseHandler handler = new DefaultErrorResponseHandler(null);
        assertFalse(handler.needsConnectionLeftOpen());
    }
}
