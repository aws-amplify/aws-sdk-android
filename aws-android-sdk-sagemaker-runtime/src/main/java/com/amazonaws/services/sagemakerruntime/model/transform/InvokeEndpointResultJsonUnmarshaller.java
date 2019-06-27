/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sagemakerruntime.model.transform;

import com.amazonaws.services.sagemakerruntime.model.*;
import com.amazonaws.transform.*;

/**
 * JSON unmarshaller for response InvokeEndpointResult
 */
public class InvokeEndpointResultJsonUnmarshaller implements
        Unmarshaller<InvokeEndpointResult, JsonUnmarshallerContext> {

    public InvokeEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InvokeEndpointResult invokeEndpointResult = new InvokeEndpointResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            invokeEndpointResult.setBody(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        if (context.getHeader("Content-Type") != null)
            invokeEndpointResult.setContentType(context.getHeader("Content-Type"));
        if (context.getHeader("x-Amzn-Invoked-Production-Variant") != null)
            invokeEndpointResult.setInvokedProductionVariant(context
                    .getHeader("x-Amzn-Invoked-Production-Variant"));
        if (context.getHeader("X-Amzn-SageMaker-Custom-Attributes") != null)
            invokeEndpointResult.setCustomAttributes(context
                    .getHeader("X-Amzn-SageMaker-Custom-Attributes"));
        return invokeEndpointResult;
    }

    private static InvokeEndpointResultJsonUnmarshaller instance;

    public static InvokeEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvokeEndpointResultJsonUnmarshaller();
        return instance;
    }
}
