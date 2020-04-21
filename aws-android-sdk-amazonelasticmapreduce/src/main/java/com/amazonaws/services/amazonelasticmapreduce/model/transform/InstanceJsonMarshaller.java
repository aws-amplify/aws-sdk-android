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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Instance
 */
class InstanceJsonMarshaller {

    public void marshall(Instance instance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instance.getId() != null) {
            String id = instance.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (instance.getEc2InstanceId() != null) {
            String ec2InstanceId = instance.getEc2InstanceId();
            jsonWriter.name("Ec2InstanceId");
            jsonWriter.value(ec2InstanceId);
        }
        if (instance.getPublicDnsName() != null) {
            String publicDnsName = instance.getPublicDnsName();
            jsonWriter.name("PublicDnsName");
            jsonWriter.value(publicDnsName);
        }
        if (instance.getPublicIpAddress() != null) {
            String publicIpAddress = instance.getPublicIpAddress();
            jsonWriter.name("PublicIpAddress");
            jsonWriter.value(publicIpAddress);
        }
        if (instance.getPrivateDnsName() != null) {
            String privateDnsName = instance.getPrivateDnsName();
            jsonWriter.name("PrivateDnsName");
            jsonWriter.value(privateDnsName);
        }
        if (instance.getPrivateIpAddress() != null) {
            String privateIpAddress = instance.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (instance.getStatus() != null) {
            InstanceStatus status = instance.getStatus();
            jsonWriter.name("Status");
            InstanceStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (instance.getInstanceGroupId() != null) {
            String instanceGroupId = instance.getInstanceGroupId();
            jsonWriter.name("InstanceGroupId");
            jsonWriter.value(instanceGroupId);
        }
        if (instance.getInstanceFleetId() != null) {
            String instanceFleetId = instance.getInstanceFleetId();
            jsonWriter.name("InstanceFleetId");
            jsonWriter.value(instanceFleetId);
        }
        if (instance.getMarket() != null) {
            String market = instance.getMarket();
            jsonWriter.name("Market");
            jsonWriter.value(market);
        }
        if (instance.getInstanceType() != null) {
            String instanceType = instance.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instance.getEbsVolumes() != null) {
            java.util.List<EbsVolume> ebsVolumes = instance.getEbsVolumes();
            jsonWriter.name("EbsVolumes");
            jsonWriter.beginArray();
            for (EbsVolume ebsVolumesItem : ebsVolumes) {
                if (ebsVolumesItem != null) {
                    EbsVolumeJsonMarshaller.getInstance().marshall(ebsVolumesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }
}
