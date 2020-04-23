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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GatewayInfo
 */
class GatewayInfoJsonMarshaller {

    public void marshall(GatewayInfo gatewayInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gatewayInfo.getGatewayId() != null) {
            String gatewayId = gatewayInfo.getGatewayId();
            jsonWriter.name("GatewayId");
            jsonWriter.value(gatewayId);
        }
        if (gatewayInfo.getGatewayARN() != null) {
            String gatewayARN = gatewayInfo.getGatewayARN();
            jsonWriter.name("GatewayARN");
            jsonWriter.value(gatewayARN);
        }
        if (gatewayInfo.getGatewayType() != null) {
            String gatewayType = gatewayInfo.getGatewayType();
            jsonWriter.name("GatewayType");
            jsonWriter.value(gatewayType);
        }
        if (gatewayInfo.getGatewayOperationalState() != null) {
            String gatewayOperationalState = gatewayInfo.getGatewayOperationalState();
            jsonWriter.name("GatewayOperationalState");
            jsonWriter.value(gatewayOperationalState);
        }
        if (gatewayInfo.getGatewayName() != null) {
            String gatewayName = gatewayInfo.getGatewayName();
            jsonWriter.name("GatewayName");
            jsonWriter.value(gatewayName);
        }
        if (gatewayInfo.getEc2InstanceId() != null) {
            String ec2InstanceId = gatewayInfo.getEc2InstanceId();
            jsonWriter.name("Ec2InstanceId");
            jsonWriter.value(ec2InstanceId);
        }
        if (gatewayInfo.getEc2InstanceRegion() != null) {
            String ec2InstanceRegion = gatewayInfo.getEc2InstanceRegion();
            jsonWriter.name("Ec2InstanceRegion");
            jsonWriter.value(ec2InstanceRegion);
        }
        jsonWriter.endObject();
    }

    private static GatewayInfoJsonMarshaller instance;

    public static GatewayInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GatewayInfoJsonMarshaller();
        return instance;
    }
}
