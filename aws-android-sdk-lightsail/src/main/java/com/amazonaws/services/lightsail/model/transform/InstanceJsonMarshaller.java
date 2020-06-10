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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Instance
 */
class InstanceJsonMarshaller {

    public void marshall(Instance instance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instance.getName() != null) {
            String name = instance.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (instance.getArn() != null) {
            String arn = instance.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (instance.getSupportCode() != null) {
            String supportCode = instance.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (instance.getCreatedAt() != null) {
            java.util.Date createdAt = instance.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (instance.getLocation() != null) {
            ResourceLocation location = instance.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (instance.getResourceType() != null) {
            String resourceType = instance.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (instance.getTags() != null) {
            java.util.List<Tag> tags = instance.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getBlueprintId() != null) {
            String blueprintId = instance.getBlueprintId();
            jsonWriter.name("blueprintId");
            jsonWriter.value(blueprintId);
        }
        if (instance.getBlueprintName() != null) {
            String blueprintName = instance.getBlueprintName();
            jsonWriter.name("blueprintName");
            jsonWriter.value(blueprintName);
        }
        if (instance.getBundleId() != null) {
            String bundleId = instance.getBundleId();
            jsonWriter.name("bundleId");
            jsonWriter.value(bundleId);
        }
        if (instance.getAddOns() != null) {
            java.util.List<AddOn> addOns = instance.getAddOns();
            jsonWriter.name("addOns");
            jsonWriter.beginArray();
            for (AddOn addOnsItem : addOns) {
                if (addOnsItem != null) {
                    AddOnJsonMarshaller.getInstance().marshall(addOnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instance.getIsStaticIp() != null) {
            Boolean isStaticIp = instance.getIsStaticIp();
            jsonWriter.name("isStaticIp");
            jsonWriter.value(isStaticIp);
        }
        if (instance.getPrivateIpAddress() != null) {
            String privateIpAddress = instance.getPrivateIpAddress();
            jsonWriter.name("privateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (instance.getPublicIpAddress() != null) {
            String publicIpAddress = instance.getPublicIpAddress();
            jsonWriter.name("publicIpAddress");
            jsonWriter.value(publicIpAddress);
        }
        if (instance.getIpv6Address() != null) {
            String ipv6Address = instance.getIpv6Address();
            jsonWriter.name("ipv6Address");
            jsonWriter.value(ipv6Address);
        }
        if (instance.getHardware() != null) {
            InstanceHardware hardware = instance.getHardware();
            jsonWriter.name("hardware");
            InstanceHardwareJsonMarshaller.getInstance().marshall(hardware, jsonWriter);
        }
        if (instance.getNetworking() != null) {
            InstanceNetworking networking = instance.getNetworking();
            jsonWriter.name("networking");
            InstanceNetworkingJsonMarshaller.getInstance().marshall(networking, jsonWriter);
        }
        if (instance.getState() != null) {
            InstanceState state = instance.getState();
            jsonWriter.name("state");
            InstanceStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (instance.getUsername() != null) {
            String username = instance.getUsername();
            jsonWriter.name("username");
            jsonWriter.value(username);
        }
        if (instance.getSshKeyName() != null) {
            String sshKeyName = instance.getSshKeyName();
            jsonWriter.name("sshKeyName");
            jsonWriter.value(sshKeyName);
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
