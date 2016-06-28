/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.lambda.model.transform;

import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.IOUtils;

import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * Invoke Result JSON Unmarshaller
 */
public class InvokeResultJsonUnmarshaller implements
        Unmarshaller<InvokeResult, JsonUnmarshallerContext> {

    private static final ByteBuffer EMPTY_BYTEBUFFER = ByteBuffer.allocate(0);

    @Override
    public InvokeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InvokeResult invokeResult = new InvokeResult();

        if (context.getHeader("X-Amz-Function-Error") != null)
            invokeResult.setFunctionError(context.getHeader("X-Amz-Function-Error"));
        if (context.getHeader("X-Amz-Log-Result") != null)
            invokeResult.setLogResult(context.getHeader("X-Amz-Log-Result"));

        invokeResult.setStatusCode(context.getHttpResponse().getStatusCode());
        ByteBuffer payload = EMPTY_BYTEBUFFER;
        InputStream content = context.getHttpResponse().getContent();
        if (content != null) {
            payload = ByteBuffer.wrap(IOUtils.toByteArray(content));
        }
        invokeResult.setPayload(payload);

        return invokeResult;
    }

    private static InvokeResultJsonUnmarshaller instance;

    public static InvokeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvokeResultJsonUnmarshaller();
        return instance;
    }
}
