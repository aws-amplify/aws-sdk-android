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
 * JSON unmarshaller for response GetExportResult
 */
public class GetExportResultJsonUnmarshaller implements
        Unmarshaller<GetExportResult, JsonUnmarshallerContext> {

    public GetExportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetExportResult getExportResult = new GetExportResult();

        if (context.getHeader("Content-Type") != null)
            getExportResult.setContentType(context.getHeader("Content-Type"));
        if (context.getHeader("Content-Disposition") != null)
            getExportResult.setContentDisposition(context.getHeader("Content-Disposition"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getExportResult.setBody(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        return getExportResult;
    }

    private static GetExportResultJsonUnmarshaller instance;

    public static GetExportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetExportResultJsonUnmarshaller();
        return instance;
    }
}
