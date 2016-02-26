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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class S3ObjectResponseHandlerTest {

    @Test
    public void testNeedsConnectionLeftOpen() {
        S3ObjectResponseHandler handler = new S3ObjectResponseHandler();
        assertTrue(handler.needsConnectionLeftOpen());
    }

    @Test
    public void testHandle() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream("content".getBytes(StringUtils.UTF8));
        HttpResponse response = new HttpResponse.Builder().content(bais)
                .header(Headers.REDIRECT_LOCATION, "redirect")
                .header(Headers.REQUESTER_CHARGED_HEADER, "true").build();
        S3ObjectResponseHandler handler = new S3ObjectResponseHandler();
        AmazonWebServiceResponse<S3Object> object = handler.handle(response);
        S3Object content = object.getResult();
        assertEquals(content.getRedirectLocation(), "redirect");
        assertTrue(content.isRequesterCharged());
        S3ObjectInputStream is = content.getObjectContent();
        int curr = -1;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((curr = is.read()) != -1) {
            baos.write(curr);
        }
        assertArrayEquals(baos.toByteArray(), "content".getBytes(StringUtils.UTF8));
    }

}
