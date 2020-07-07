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

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.StringUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.ByteArrayInputStream;

@RunWith(RobolectricTestRunner.class)
public class StaxResponseHandlerTest {

    @Test
    public void testHandleWithContent() throws Exception {
        final ByteArrayInputStream bais = new ByteArrayInputStream(
                ("<data>Content</data>").getBytes(StringUtils.UTF8));
        final HttpResponse response = new HttpResponse.Builder().header("testKey", "testValue")
                .header("x-amzn-RequestId", "99")
                .content(bais).build();

        Unmarshaller<String, StaxUnmarshallerContext> unmarshaller = new Unmarshaller<String, StaxUnmarshallerContext>() {

            @Override
            public String unmarshall(StaxUnmarshallerContext in) throws Exception {
                in.nextEvent();
                String content = in.readText();
                assertEquals(content, "Content");
                assertEquals(in.getHeader("testKey"), "testValue");
                return content;
            }

        };

        StaxResponseHandler<String> handler = new StaxResponseHandler<String>(unmarshaller);
        AmazonWebServiceResponse<String> awsr = handler.handle(response);
        assertEquals(awsr.getResponseMetadata().getRequestId(), "99");
        assertEquals(awsr.getResult(), "Content");
    }

    @Test
    public void testHandleWithNullContent() throws Exception {
        final HttpResponse response = new HttpResponse.Builder().header("testKey", "testValue")
                .content(null).build();

        Unmarshaller<String, StaxUnmarshallerContext> unmarshaller = new Unmarshaller<String, StaxUnmarshallerContext>() {

            @Override
            public String unmarshall(StaxUnmarshallerContext in) throws Exception {
                assertEquals(in.getHeader("testKey"), "testValue");
                return "Test";
            }

        };

        StaxResponseHandler<String> handler = new StaxResponseHandler<String>(unmarshaller);
        assertEquals(handler.handle(response).getResult(), "Test");
    }
}
