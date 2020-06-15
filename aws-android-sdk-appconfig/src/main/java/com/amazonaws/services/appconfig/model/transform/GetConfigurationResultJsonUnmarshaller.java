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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetConfigurationResult
 */
public class GetConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetConfigurationResult, JsonUnmarshallerContext> {

    public GetConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetConfigurationResult getConfigurationResult = new GetConfigurationResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getConfigurationResult.setContent(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        if (context.getHeader("Configuration-Version") != null)
            getConfigurationResult.setConfigurationVersion(context
                    .getHeader("Configuration-Version"));
        if (context.getHeader("Content-Type") != null)
            getConfigurationResult.setContentType(context.getHeader("Content-Type"));
        return getConfigurationResult;
    }

    private static GetConfigurationResultJsonUnmarshaller instance;

    public static GetConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
