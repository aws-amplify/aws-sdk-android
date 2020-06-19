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
 * JSON marshaller for POJO NatGateway
 */
class NatGatewayJsonMarshaller {

    public void marshall(NatGateway natGateway, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (natGateway.getCreateTime() != null) {
            java.util.Date createTime = natGateway.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (natGateway.getDeleteTime() != null) {
            java.util.Date deleteTime = natGateway.getDeleteTime();
            jsonWriter.name("DeleteTime");
            jsonWriter.value(deleteTime);
        }
        if (natGateway.getFailureCode() != null) {
            String failureCode = natGateway.getFailureCode();
            jsonWriter.name("FailureCode");
            jsonWriter.value(failureCode);
        }
        if (natGateway.getFailureMessage() != null) {
            String failureMessage = natGateway.getFailureMessage();
            jsonWriter.name("FailureMessage");
            jsonWriter.value(failureMessage);
        }
        if (natGateway.getNatGatewayAddresses() != null) {
            java.util.List<NatGatewayAddress> natGatewayAddresses = natGateway
                    .getNatGatewayAddresses();
            jsonWriter.name("NatGatewayAddresses");
            jsonWriter.beginArray();
            for (NatGatewayAddress natGatewayAddressesItem : natGatewayAddresses) {
                if (natGatewayAddressesItem != null) {
                    NatGatewayAddressJsonMarshaller.getInstance().marshall(natGatewayAddressesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (natGateway.getNatGatewayId() != null) {
            String natGatewayId = natGateway.getNatGatewayId();
            jsonWriter.name("NatGatewayId");
            jsonWriter.value(natGatewayId);
        }
        if (natGateway.getProvisionedBandwidth() != null) {
            ProvisionedBandwidth provisionedBandwidth = natGateway.getProvisionedBandwidth();
            jsonWriter.name("ProvisionedBandwidth");
            ProvisionedBandwidthJsonMarshaller.getInstance().marshall(provisionedBandwidth,
                    jsonWriter);
        }
        if (natGateway.getState() != null) {
            String state = natGateway.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (natGateway.getSubnetId() != null) {
            String subnetId = natGateway.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (natGateway.getVpcId() != null) {
            String vpcId = natGateway.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (natGateway.getTags() != null) {
            java.util.List<Tag> tags = natGateway.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NatGatewayJsonMarshaller instance;

    public static NatGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NatGatewayJsonMarshaller();
        return instance;
    }
}
