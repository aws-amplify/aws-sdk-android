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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ExportApiResult
 */
public class ExportApiResultJsonUnmarshaller implements
        Unmarshaller<ExportApiResult, JsonUnmarshallerContext> {

    public ExportApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportApiResult exportApiResult = new ExportApiResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            exportApiResult.setBody(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        return exportApiResult;
    }

    private static ExportApiResultJsonUnmarshaller instance;

    public static ExportApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportApiResultJsonUnmarshaller();
        return instance;
    }
}
