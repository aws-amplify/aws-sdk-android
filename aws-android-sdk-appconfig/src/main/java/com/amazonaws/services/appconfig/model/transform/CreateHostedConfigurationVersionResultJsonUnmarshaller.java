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
 * JSON unmarshaller for response CreateHostedConfigurationVersionResult
 */
public class CreateHostedConfigurationVersionResultJsonUnmarshaller implements
        Unmarshaller<CreateHostedConfigurationVersionResult, JsonUnmarshallerContext> {

    public CreateHostedConfigurationVersionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateHostedConfigurationVersionResult createHostedConfigurationVersionResult = new CreateHostedConfigurationVersionResult();

        if (context.getHeader("Application-Id") != null)
            createHostedConfigurationVersionResult.setApplicationId(context
                    .getHeader("Application-Id"));
        if (context.getHeader("Configuration-Profile-Id") != null)
            createHostedConfigurationVersionResult.setConfigurationProfileId(context
                    .getHeader("Configuration-Profile-Id"));
        if (context.getHeader("Version-Number") != null)
            createHostedConfigurationVersionResult.setVersionNumber(context
                    .getHeader("Version-Number"));
        if (context.getHeader("Description") != null)
            createHostedConfigurationVersionResult.setDescription(context.getHeader("Description"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            createHostedConfigurationVersionResult.setContent(java.nio.ByteBuffer
                    .wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
        }
        if (context.getHeader("Content-Type") != null)
            createHostedConfigurationVersionResult
                    .setContentType(context.getHeader("Content-Type"));
        return createHostedConfigurationVersionResult;
    }

    private static CreateHostedConfigurationVersionResultJsonUnmarshaller instance;

    public static CreateHostedConfigurationVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateHostedConfigurationVersionResultJsonUnmarshaller();
        return instance;
    }
}
