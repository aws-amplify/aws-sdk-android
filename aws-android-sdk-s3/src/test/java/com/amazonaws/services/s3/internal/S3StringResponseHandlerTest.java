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

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class S3StringResponseHandlerTest {

    @Test
    public void testHandle() throws Exception {

        S3StringResponseHandler handler = new S3StringResponseHandler();
        ByteArrayInputStream bais = new ByteArrayInputStream("content".getBytes(StringUtils.UTF8));
        HttpResponse response = new HttpResponse.Builder().content(bais).build();
        AmazonWebServiceResponse<String> awsr = handler.handle(response);
        assertEquals(awsr.getResult(), "content");
    }
}
