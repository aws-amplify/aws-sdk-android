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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SmsMfaConfigType
 */
class SmsMfaConfigTypeJsonMarshaller {

    public void marshall(SmsMfaConfigType smsMfaConfigType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (smsMfaConfigType.getSmsAuthenticationMessage() != null) {
            String smsAuthenticationMessage = smsMfaConfigType.getSmsAuthenticationMessage();
            jsonWriter.name("SmsAuthenticationMessage");
            jsonWriter.value(smsAuthenticationMessage);
        }
        if (smsMfaConfigType.getSmsConfiguration() != null) {
            SmsConfigurationType smsConfiguration = smsMfaConfigType.getSmsConfiguration();
            jsonWriter.name("SmsConfiguration");
            SmsConfigurationTypeJsonMarshaller.getInstance().marshall(smsConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SmsMfaConfigTypeJsonMarshaller instance;

    public static SmsMfaConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SmsMfaConfigTypeJsonMarshaller();
        return instance;
    }
}
