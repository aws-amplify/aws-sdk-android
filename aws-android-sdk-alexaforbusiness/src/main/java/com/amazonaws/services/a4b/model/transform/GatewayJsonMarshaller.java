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
 * JSON marshaller for POJO Gateway
 */
class GatewayJsonMarshaller {

    public void marshall(Gateway gateway, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gateway.getArn() != null) {
            String arn = gateway.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (gateway.getName() != null) {
            String name = gateway.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (gateway.getDescription() != null) {
            String description = gateway.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (gateway.getGatewayGroupArn() != null) {
            String gatewayGroupArn = gateway.getGatewayGroupArn();
            jsonWriter.name("GatewayGroupArn");
            jsonWriter.value(gatewayGroupArn);
        }
        if (gateway.getSoftwareVersion() != null) {
            String softwareVersion = gateway.getSoftwareVersion();
            jsonWriter.name("SoftwareVersion");
            jsonWriter.value(softwareVersion);
        }
        jsonWriter.endObject();
    }

    private static GatewayJsonMarshaller instance;

    public static GatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GatewayJsonMarshaller();
        return instance;
    }
}
