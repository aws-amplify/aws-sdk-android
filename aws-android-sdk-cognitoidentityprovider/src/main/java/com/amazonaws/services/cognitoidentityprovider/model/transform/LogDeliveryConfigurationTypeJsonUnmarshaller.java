/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LogDeliveryConfigurationType
 */
class LogDeliveryConfigurationTypeJsonUnmarshaller implements
        Unmarshaller<LogDeliveryConfigurationType, JsonUnmarshallerContext> {

    public LogDeliveryConfigurationType unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LogDeliveryConfigurationType logDeliveryConfigurationType = new LogDeliveryConfigurationType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserPoolId")) {
                logDeliveryConfigurationType.setUserPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogConfigurations")) {
                logDeliveryConfigurationType
                        .setLogConfigurations(new ListUnmarshaller<LogConfigurationType>(
                                LogConfigurationTypeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return logDeliveryConfigurationType;
    }

    private static LogDeliveryConfigurationTypeJsonUnmarshaller instance;

    public static LogDeliveryConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogDeliveryConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
