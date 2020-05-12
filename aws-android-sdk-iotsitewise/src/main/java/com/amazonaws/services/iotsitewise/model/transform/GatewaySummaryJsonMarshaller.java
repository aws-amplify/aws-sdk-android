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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GatewaySummary
 */
class GatewaySummaryJsonMarshaller {

    public void marshall(GatewaySummary gatewaySummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gatewaySummary.getGatewayId() != null) {
            String gatewayId = gatewaySummary.getGatewayId();
            jsonWriter.name("gatewayId");
            jsonWriter.value(gatewayId);
        }
        if (gatewaySummary.getGatewayName() != null) {
            String gatewayName = gatewaySummary.getGatewayName();
            jsonWriter.name("gatewayName");
            jsonWriter.value(gatewayName);
        }
        if (gatewaySummary.getGatewayCapabilitySummaries() != null) {
            java.util.List<GatewayCapabilitySummary> gatewayCapabilitySummaries = gatewaySummary
                    .getGatewayCapabilitySummaries();
            jsonWriter.name("gatewayCapabilitySummaries");
            jsonWriter.beginArray();
            for (GatewayCapabilitySummary gatewayCapabilitySummariesItem : gatewayCapabilitySummaries) {
                if (gatewayCapabilitySummariesItem != null) {
                    GatewayCapabilitySummaryJsonMarshaller.getInstance().marshall(
                            gatewayCapabilitySummariesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (gatewaySummary.getCreationDate() != null) {
            java.util.Date creationDate = gatewaySummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (gatewaySummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = gatewaySummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        jsonWriter.endObject();
    }

    private static GatewaySummaryJsonMarshaller instance;

    public static GatewaySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GatewaySummaryJsonMarshaller();
        return instance;
    }
}
