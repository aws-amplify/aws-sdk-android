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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Instance
 */
class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Instance instance = new Instance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                instance.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                instance.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                instance.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                instance.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                instance.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                instance.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                instance.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("blueprintId")) {
                instance.setBlueprintId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("blueprintName")) {
                instance.setBlueprintName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bundleId")) {
                instance.setBundleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("addOns")) {
                instance.setAddOns(new ListUnmarshaller<AddOn>(AddOnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("isStaticIp")) {
                instance.setIsStaticIp(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("privateIpAddress")) {
                instance.setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("publicIpAddress")) {
                instance.setPublicIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ipv6Address")) {
                instance.setIpv6Address(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hardware")) {
                instance.setHardware(InstanceHardwareJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networking")) {
                instance.setNetworking(InstanceNetworkingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                instance.setState(InstanceStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("username")) {
                instance.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sshKeyName")) {
                instance.setSshKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
