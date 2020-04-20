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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JWTConfiguration
 */
class JWTConfigurationJsonMarshaller {

    public void marshall(JWTConfiguration jWTConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jWTConfiguration.getAudience() != null) {
            java.util.List<String> audience = jWTConfiguration.getAudience();
            jsonWriter.name("Audience");
            jsonWriter.beginArray();
            for (String audienceItem : audience) {
                if (audienceItem != null) {
                    jsonWriter.value(audienceItem);
                }
            }
            jsonWriter.endArray();
        }
        if (jWTConfiguration.getIssuer() != null) {
            String issuer = jWTConfiguration.getIssuer();
            jsonWriter.name("Issuer");
            jsonWriter.value(issuer);
        }
        jsonWriter.endObject();
    }

    private static JWTConfigurationJsonMarshaller instance;

    public static JWTConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JWTConfigurationJsonMarshaller();
        return instance;
    }
}
