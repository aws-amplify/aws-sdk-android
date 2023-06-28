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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SingleMasterChannelEndpointConfiguration
 */
class SingleMasterChannelEndpointConfigurationJsonMarshaller {

    public void marshall(
            SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (singleMasterChannelEndpointConfiguration.getProtocols() != null) {
            java.util.List<String> protocols = singleMasterChannelEndpointConfiguration
                    .getProtocols();
            jsonWriter.name("Protocols");
            jsonWriter.beginArray();
            for (String protocolsItem : protocols) {
                if (protocolsItem != null) {
                    jsonWriter.value(protocolsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (singleMasterChannelEndpointConfiguration.getRole() != null) {
            String role = singleMasterChannelEndpointConfiguration.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        jsonWriter.endObject();
    }

    private static SingleMasterChannelEndpointConfigurationJsonMarshaller instance;

    public static SingleMasterChannelEndpointConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SingleMasterChannelEndpointConfigurationJsonMarshaller();
        return instance;
    }
}
