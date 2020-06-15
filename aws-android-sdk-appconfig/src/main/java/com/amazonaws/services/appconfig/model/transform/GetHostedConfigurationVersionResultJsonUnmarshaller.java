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
 * JSON unmarshaller for response GetHostedConfigurationVersionResult
 */
public class GetHostedConfigurationVersionResultJsonUnmarshaller implements
        Unmarshaller<GetHostedConfigurationVersionResult, JsonUnmarshallerContext> {

    public GetHostedConfigurationVersionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetHostedConfigurationVersionResult getHostedConfigurationVersionResult = new GetHostedConfigurationVersionResult();

        if (context.getHeader("Application-Id") != null)
            getHostedConfigurationVersionResult.setApplicationId(context
                    .getHeader("Application-Id"));
        if (context.getHeader("Configuration-Profile-Id") != null)
            getHostedConfigurationVersionResult.setConfigurationProfileId(context
                    .getHeader("Configuration-Profile-Id"));
        if (context.getHeader("Version-Number") != null)
            getHostedConfigurationVersionResult.setVersionNumber(context
                    .getHeader("Version-Number"));
        if (context.getHeader("Description") != null)
            getHostedConfigurationVersionResult.setDescription(context.getHeader("Description"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getHostedConfigurationVersionResult.setContent(java.nio.ByteBuffer
                    .wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
        }
        if (context.getHeader("Content-Type") != null)
            getHostedConfigurationVersionResult.setContentType(context.getHeader("Content-Type"));
        return getHostedConfigurationVersionResult;
    }

    private static GetHostedConfigurationVersionResultJsonUnmarshaller instance;

    public static GetHostedConfigurationVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetHostedConfigurationVersionResultJsonUnmarshaller();
        return instance;
    }
}
