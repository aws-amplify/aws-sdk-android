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
 * JSON marshaller for POJO VpcPeeringConnection
 */
class VpcPeeringConnectionJsonMarshaller {

    public void marshall(VpcPeeringConnection vpcPeeringConnection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (vpcPeeringConnection.getAccepterVpcInfo() != null) {
            VpcPeeringConnectionVpcInfo accepterVpcInfo = vpcPeeringConnection.getAccepterVpcInfo();
            jsonWriter.name("AccepterVpcInfo");
            VpcPeeringConnectionVpcInfoJsonMarshaller.getInstance().marshall(accepterVpcInfo,
                    jsonWriter);
        }
        if (vpcPeeringConnection.getExpirationTime() != null) {
            java.util.Date expirationTime = vpcPeeringConnection.getExpirationTime();
            jsonWriter.name("ExpirationTime");
            jsonWriter.value(expirationTime);
        }
        if (vpcPeeringConnection.getRequesterVpcInfo() != null) {
            VpcPeeringConnectionVpcInfo requesterVpcInfo = vpcPeeringConnection
                    .getRequesterVpcInfo();
            jsonWriter.name("RequesterVpcInfo");
            VpcPeeringConnectionVpcInfoJsonMarshaller.getInstance().marshall(requesterVpcInfo,
                    jsonWriter);
        }
        if (vpcPeeringConnection.getStatus() != null) {
            VpcPeeringConnectionStateReason status = vpcPeeringConnection.getStatus();
            jsonWriter.name("Status");
            VpcPeeringConnectionStateReasonJsonMarshaller.getInstance()
                    .marshall(status, jsonWriter);
        }
        if (vpcPeeringConnection.getTags() != null) {
            java.util.List<Tag> tags = vpcPeeringConnection.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcPeeringConnection.getVpcPeeringConnectionId() != null) {
            String vpcPeeringConnectionId = vpcPeeringConnection.getVpcPeeringConnectionId();
            jsonWriter.name("VpcPeeringConnectionId");
            jsonWriter.value(vpcPeeringConnectionId);
        }
        jsonWriter.endObject();
    }

    private static VpcPeeringConnectionJsonMarshaller instance;

    public static VpcPeeringConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcPeeringConnectionJsonMarshaller();
        return instance;
    }
}
