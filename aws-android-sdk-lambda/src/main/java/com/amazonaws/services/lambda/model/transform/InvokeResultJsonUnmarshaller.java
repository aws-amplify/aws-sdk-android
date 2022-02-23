/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response InvokeResult
 */
public class InvokeResultJsonUnmarshaller implements
        Unmarshaller<InvokeResult, JsonUnmarshallerContext> {

    public InvokeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InvokeResult invokeResult = new InvokeResult();

        invokeResult.setStatusCode(context.getHttpResponse().getStatusCode());
        if (context.getHeader("X-Amz-Function-Error") != null)
            invokeResult.setFunctionError(context.getHeader("X-Amz-Function-Error"));
        if (context.getHeader("X-Amz-Log-Result") != null)
            invokeResult.setLogResult(context.getHeader("X-Amz-Log-Result"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            invokeResult.setPayload(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        if (context.getHeader("X-Amz-Executed-Version") != null)
            invokeResult.setExecutedVersion(context.getHeader("X-Amz-Executed-Version"));
        return invokeResult;
    }

    private static InvokeResultJsonUnmarshaller instance;

    public static InvokeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvokeResultJsonUnmarshaller();
        return instance;
    }
}
