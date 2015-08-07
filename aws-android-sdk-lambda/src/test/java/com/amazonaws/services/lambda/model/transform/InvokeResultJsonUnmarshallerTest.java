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

package com.amazonaws.services.lambda.model.transform;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

public class InvokeResultJsonUnmarshallerTest {

    @Test
    public void testUnmarshall() throws Exception {
        int statusCode = 299;
        String error = "error";
        String log = "a very long log";
        String content = "some content";

        HttpResponse response = HttpResponse.builder()
                .statusCode(statusCode)
                .statusCode(statusCode)
                .header("X-Amz-Function-Error", error)
                .header("X-Amz-Log-Result", log)
                .content(new ByteArrayInputStream(content.getBytes(StringUtils.UTF8)))
                .build();
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(null, response);

        InvokeResultJsonUnmarshaller unmarshaller = InvokeResultJsonUnmarshaller.getInstance();
        InvokeResult result = unmarshaller.unmarshall(context);
        assertTrue("status code", statusCode == result.getStatusCode());
        assertEquals("error", error, result.getFunctionError());
        assertEquals("log", log, result.getLogResult());
        ByteBuffer payload = result.getPayload();
        assertArrayEquals("same payload", content.getBytes(StringUtils.UTF8), payload.array());
    }
}
