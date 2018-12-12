/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO EmailChannelRequest
 */
class EmailChannelRequestJsonMarshaller {

    public void marshall(EmailChannelRequest emailChannelRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (emailChannelRequest.getConfigurationSet() != null) {
            String configurationSet = emailChannelRequest.getConfigurationSet();
            jsonWriter.name("ConfigurationSet");
            jsonWriter.value(configurationSet);
        }
        if (emailChannelRequest.getEnabled() != null) {
            Boolean enabled = emailChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (emailChannelRequest.getFromAddress() != null) {
            String fromAddress = emailChannelRequest.getFromAddress();
            jsonWriter.name("FromAddress");
            jsonWriter.value(fromAddress);
        }
        if (emailChannelRequest.getIdentity() != null) {
            String identity = emailChannelRequest.getIdentity();
            jsonWriter.name("Identity");
            jsonWriter.value(identity);
        }
        if (emailChannelRequest.getRoleArn() != null) {
            String roleArn = emailChannelRequest.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static EmailChannelRequestJsonMarshaller instance;

    public static EmailChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailChannelRequestJsonMarshaller();
        return instance;
    }
}
