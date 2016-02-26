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

import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class HttpResponseTest {

    private HttpResponse response;
    private HttpResponse.Builder builder;
    private String statusText;
    private int statusCode;
    private InputStream content;

    @Before
    public void setup() {
        statusText = "OK";
        statusCode = 200;
        content = new ByteArrayInputStream("content".getBytes(StringUtils.UTF8));
    }

    @Test
    public void testBuilder() throws Exception {
        builder = HttpResponse.builder()
                .statusCode(statusCode)
                .statusText(statusText)
                .content(content);
        for (int i = 0; i < 10; i++) {
            builder.header("key" + i, "value" + i);
        }
        response = builder.build();
        assertEquals("status text", statusText, response.getStatusText());
        assertTrue("status code", statusCode == response.getStatusCode());
        assertTrue("has headers", 10 == response.getHeaders().size());
        assertEquals("content", content, response.getContent());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifierableHeaders() {
        builder = HttpResponse.builder()
                .statusCode(statusCode)
                .statusText(statusText)
                .content(content);
        response = builder.build();
        response.getHeaders().put("key", "value");
    }

    @Test
    public void testContentEncodingGZIP() throws Exception {
        String str = "content to be zipped";
        InputStream zippedContent = getGzippedInputStream(str);
        builder = HttpResponse.builder()
                .header("Content-Encoding", "gzip")
                .content(zippedContent);
        response = builder.build();
        InputStream unzippedContent = response.getContent();
        assertTrue(unzippedContent instanceof GZIPInputStream);
        String result = IOUtils.toString(unzippedContent);
        assertEquals("unzip correctly", str, result);
    }

    @Test
    public void testContentEncodingIdentity() throws Exception {
        builder = HttpResponse.builder()
                .header("Content-Encoding", "identity")
                .content(content);
        response = builder.build();
        assertFalse("Not gzip", response.getContent() instanceof GZIPInputStream);
        assertEquals("same content", "content", IOUtils.toString(response.getContent()));
    }

    @Test
    public void testContentEncodingGZIPRaw() throws Exception {
        String str = "content to be zipped";
        InputStream zippedContent = getGzippedInputStream(str);
        builder = HttpResponse.builder()
                .header("Content-Encoding", "gzip")
                .content(zippedContent);
        response = builder.build();
        InputStream rawContent = response.getRawContent();
        assertFalse("Not gzip", rawContent instanceof GZIPInputStream);
        GZIPInputStream gis = new GZIPInputStream(rawContent);
        String result = IOUtils.toString(gis);
        assertEquals("unzip correctly", str, result);
    }

    private InputStream getGzippedInputStream(String str) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        GZIPOutputStream gos = new GZIPOutputStream(baos);
        gos.write(str.getBytes(StringUtils.UTF8));
        gos.finish();
        byte[] content = baos.toByteArray();
        gos.close();

        return new ByteArrayInputStream(content);
    }
}
