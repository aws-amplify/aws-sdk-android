/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetSdkResult
 */
public class GetSdkResultJsonUnmarshaller implements
        Unmarshaller<GetSdkResult, JsonUnmarshallerContext> {

    public GetSdkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSdkResult getSdkResult = new GetSdkResult();

        if (context.getHeader("Content-Type") != null)
            getSdkResult.setContentType(context.getHeader("Content-Type"));
        if (context.getHeader("Content-Disposition") != null)
            getSdkResult.setContentDisposition(context.getHeader("Content-Disposition"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getSdkResult.setBody(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        return getSdkResult;
    }

    private static GetSdkResultJsonUnmarshaller instance;

    public static GetSdkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSdkResultJsonUnmarshaller();
        return instance;
    }
}
