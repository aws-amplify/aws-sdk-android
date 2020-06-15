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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GatewaySummary
 */
class GatewaySummaryJsonMarshaller {

    public void marshall(GatewaySummary gatewaySummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gatewaySummary.getArn() != null) {
            String arn = gatewaySummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (gatewaySummary.getName() != null) {
            String name = gatewaySummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (gatewaySummary.getDescription() != null) {
            String description = gatewaySummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (gatewaySummary.getGatewayGroupArn() != null) {
            String gatewayGroupArn = gatewaySummary.getGatewayGroupArn();
            jsonWriter.name("GatewayGroupArn");
            jsonWriter.value(gatewayGroupArn);
        }
        if (gatewaySummary.getSoftwareVersion() != null) {
            String softwareVersion = gatewaySummary.getSoftwareVersion();
            jsonWriter.name("SoftwareVersion");
            jsonWriter.value(softwareVersion);
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
