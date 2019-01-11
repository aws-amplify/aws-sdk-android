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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ADMChannelRequest
 */
class ADMChannelRequestJsonMarshaller {

    public void marshall(ADMChannelRequest aDMChannelRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aDMChannelRequest.getClientId() != null) {
            String clientId = aDMChannelRequest.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        if (aDMChannelRequest.getClientSecret() != null) {
            String clientSecret = aDMChannelRequest.getClientSecret();
            jsonWriter.name("ClientSecret");
            jsonWriter.value(clientSecret);
        }
        if (aDMChannelRequest.getEnabled() != null) {
            Boolean enabled = aDMChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static ADMChannelRequestJsonMarshaller instance;

    public static ADMChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ADMChannelRequestJsonMarshaller();
        return instance;
    }
}
