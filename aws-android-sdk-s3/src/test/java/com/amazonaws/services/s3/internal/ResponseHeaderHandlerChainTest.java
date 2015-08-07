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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;

import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ResponseHeaderHandlerChainTest {

    @Test
    public void testResponseHeaderHandlerChain() throws Exception {

        final List<Boolean> called = new ArrayList<Boolean>();
        final HttpResponse testResponse = new HttpResponse.Builder().build();

        @SuppressWarnings("unchecked")
        ResponseHeaderHandlerChain<AmazonWebServiceResponse<String>> chain =
                new ResponseHeaderHandlerChain<AmazonWebServiceResponse<String>>(
                        new Unmarshaller<AmazonWebServiceResponse<String>, InputStream>() {

                            @Override
                            public AmazonWebServiceResponse<String> unmarshall(InputStream in)
                                    throws Exception {

                                called.add(true);
                                return new AmazonWebServiceResponse<String>();
                            }

                        },
                        new HeaderHandler<AmazonWebServiceResponse<String>>() {

                            @Override
                            public void handle(AmazonWebServiceResponse<String> result,
                                    HttpResponse response) {
                                assertSame(response, testResponse);
                                called.add(true);
                            }
                        },
                        new HeaderHandler<AmazonWebServiceResponse<String>>() {

                            @Override
                            public void handle(AmazonWebServiceResponse<String> result,
                                    HttpResponse response) {
                                assertSame(response, testResponse);
                                called.add(true);
                            }
                        });

        chain.handle(testResponse);
        assertEquals(called.size(), 3);
        assertTrue(called.get(0));
        assertTrue(called.get(1));
        assertTrue(called.get(2));

    }
}
