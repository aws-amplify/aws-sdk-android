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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetNetwork
 */
class TargetNetworkJsonMarshaller {

    public void marshall(TargetNetwork targetNetwork, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetNetwork.getAssociationId() != null) {
            String associationId = targetNetwork.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (targetNetwork.getVpcId() != null) {
            String vpcId = targetNetwork.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (targetNetwork.getTargetNetworkId() != null) {
            String targetNetworkId = targetNetwork.getTargetNetworkId();
            jsonWriter.name("TargetNetworkId");
            jsonWriter.value(targetNetworkId);
        }
        if (targetNetwork.getClientVpnEndpointId() != null) {
            String clientVpnEndpointId = targetNetwork.getClientVpnEndpointId();
            jsonWriter.name("ClientVpnEndpointId");
            jsonWriter.value(clientVpnEndpointId);
        }
        if (targetNetwork.getStatus() != null) {
            AssociationStatus status = targetNetwork.getStatus();
            jsonWriter.name("Status");
            AssociationStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (targetNetwork.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = targetNetwork.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TargetNetworkJsonMarshaller instance;

    public static TargetNetworkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetNetworkJsonMarshaller();
        return instance;
    }
}
