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
import static org.junit.Assert.assertTrue;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class S3XmlResponseHandlerTest {

    @Test
    public void testS3XmlResponseHandlerTest() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream("content".getBytes(StringUtils.UTF8));
        HttpResponse response = new HttpResponse.Builder().content(bais)
                .header("testKey", "testValue").build();

        final List<Boolean> handleCalled = new ArrayList<Boolean>();

        S3XmlResponseHandler<String> handler = new S3XmlResponseHandler<String>(
                new Unmarshaller<String, InputStream>() {

                    @Override
                    public String unmarshall(InputStream in) throws Exception {
                        assertEquals("content", IOUtils.toString(in));
                        handleCalled.add(true);
                        return null;
                    }
                });

        handler.handle(response);

        assertEquals(handleCalled.size(), 1);
        assertTrue(handleCalled.get(0));

    }

}
