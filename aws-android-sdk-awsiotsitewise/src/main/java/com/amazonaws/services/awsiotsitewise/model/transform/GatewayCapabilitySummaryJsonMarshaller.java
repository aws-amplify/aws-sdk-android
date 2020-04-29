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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GatewayCapabilitySummary
 */
class GatewayCapabilitySummaryJsonMarshaller {

    public void marshall(GatewayCapabilitySummary gatewayCapabilitySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (gatewayCapabilitySummary.getCapabilityNamespace() != null) {
            String capabilityNamespace = gatewayCapabilitySummary.getCapabilityNamespace();
            jsonWriter.name("capabilityNamespace");
            jsonWriter.value(capabilityNamespace);
        }
        if (gatewayCapabilitySummary.getCapabilitySyncStatus() != null) {
            String capabilitySyncStatus = gatewayCapabilitySummary.getCapabilitySyncStatus();
            jsonWriter.name("capabilitySyncStatus");
            jsonWriter.value(capabilitySyncStatus);
        }
        jsonWriter.endObject();
    }

    private static GatewayCapabilitySummaryJsonMarshaller instance;

    public static GatewayCapabilitySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GatewayCapabilitySummaryJsonMarshaller();
        return instance;
    }
}
