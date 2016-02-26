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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

public class JsonResponseHandlerTest {

    @Test
    public void testHandleWithCRC32() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(
                "{\"key\" :\"Content\"}".getBytes(StringUtils.UTF8));

        CRC32 crc32 = new CRC32();
        crc32.update("{\"key\" :\"Content\"}".getBytes(StringUtils.UTF8));
        HttpResponse response = new HttpResponse.Builder().statusText("testResponse")
                .statusCode(200).header("testKey", "testValue")
                .header("x-amz-crc32", String.valueOf(crc32.getValue())).content(bais).build();

        Unmarshaller<String, JsonUnmarshallerContext> unmarshaller = new Unmarshaller<String, JsonUnmarshallerContext>() {

            @Override
            public String unmarshall(JsonUnmarshallerContext in) throws Exception {
                in.getReader().beginObject();
                in.getReader().nextName();
                return in.getReader().nextString();
            }

        };

        JsonResponseHandler<String> toTest = new JsonResponseHandler<String>(unmarshaller);

        // Is a no-op. just adding for code coverage of the no-op
        toTest.registerAdditionalMetadataExpressions(null);

        AmazonWebServiceResponse<String> awsResponse = toTest.handle(response);
        assertEquals(awsResponse.getResult(), "Content");
    }

    @Test
    public void testHandleWithNoCRC32() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(
                "{\"key\" :\"Content\"}".getBytes(StringUtils.UTF8));

        HttpResponse response = new HttpResponse.Builder().statusText("testResponse")
                .statusCode(200).header("testKey", "testValue").content(bais).build();

        Unmarshaller<String, JsonUnmarshallerContext> unmarshaller = new Unmarshaller<String, JsonUnmarshallerContext>() {

            @Override
            public String unmarshall(JsonUnmarshallerContext in) throws Exception {
                in.getReader().beginObject();
                in.getReader().nextName();
                return in.getReader().nextString();
            }

        };

        JsonResponseHandler<String> toTest = new JsonResponseHandler<String>(unmarshaller);

        AmazonWebServiceResponse<String> awsResponse = toTest.handle(response);
        assertEquals(awsResponse.getResult(), "Content");
    }

    @Test
    public void testHandleWithNullContent() throws Exception {

        HttpResponse response = new HttpResponse.Builder().statusText("testResponse")
                .statusCode(200).header("testKey", "testValue").content(null).build();

        Unmarshaller<String, JsonUnmarshallerContext> unmarshaller = new Unmarshaller<String, JsonUnmarshallerContext>() {

            @Override
            public String unmarshall(JsonUnmarshallerContext in) throws Exception {
                in.getReader().beginObject();
                assertFalse(in.getReader().hasNext());
                return "NullContent";
            }

        };

        JsonResponseHandler<String> toTest = new JsonResponseHandler<String>(unmarshaller);

        AmazonWebServiceResponse<String> awsResponse = toTest.handle(response);
        assertEquals(awsResponse.getResult(), "NullContent");
    }

    @Test
    public void testHandleNeedsConnectionLeftOpen() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(
                "{\"key\" :\"Content\"}".getBytes(StringUtils.UTF8));
        CRC32 crc32 = new CRC32();
        crc32.update("{\"key\" :\"Content\"}".getBytes(StringUtils.UTF8));
        HttpResponse response = new HttpResponse.Builder().statusText("testResponse")
                .statusCode(200).header("testKey", "testValue").content(bais).build();

        final List<InputStream> capture = new ArrayList<InputStream>();

        Unmarshaller<String, JsonUnmarshallerContext> unmarshaller = new Unmarshaller<String, JsonUnmarshallerContext>() {

            @Override
            public String unmarshall(JsonUnmarshallerContext in) throws Exception {
                capture.add(in.getHttpResponse().getContent());
                return "OpenConnection";
            }

        };

        JsonResponseHandler<String> toTest = new JsonResponseHandler<String>(unmarshaller);
        toTest.needsConnectionLeftOpen = true;
        assertTrue(toTest.needsConnectionLeftOpen());

        AmazonWebServiceResponse<String> awsResponse = toTest.handle(response);
        assertEquals(awsResponse.getResult(), "OpenConnection");
        assertSame(capture.get(0), bais);
    }
}
