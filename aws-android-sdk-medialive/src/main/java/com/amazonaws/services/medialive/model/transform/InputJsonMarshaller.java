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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Input
 */
class InputJsonMarshaller {

    public void marshall(Input input, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (input.getArn() != null) {
            String arn = input.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (input.getAttachedChannels() != null) {
            java.util.List<String> attachedChannels = input.getAttachedChannels();
            jsonWriter.name("AttachedChannels");
            jsonWriter.beginArray();
            for (String attachedChannelsItem : attachedChannels) {
                if (attachedChannelsItem != null) {
                    jsonWriter.value(attachedChannelsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getDestinations() != null) {
            java.util.List<InputDestination> destinations = input.getDestinations();
            jsonWriter.name("Destinations");
            jsonWriter.beginArray();
            for (InputDestination destinationsItem : destinations) {
                if (destinationsItem != null) {
                    InputDestinationJsonMarshaller.getInstance().marshall(destinationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getId() != null) {
            String id = input.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (input.getInputClass() != null) {
            String inputClass = input.getInputClass();
            jsonWriter.name("InputClass");
            jsonWriter.value(inputClass);
        }
        if (input.getInputDevices() != null) {
            java.util.List<InputDeviceSettings> inputDevices = input.getInputDevices();
            jsonWriter.name("InputDevices");
            jsonWriter.beginArray();
            for (InputDeviceSettings inputDevicesItem : inputDevices) {
                if (inputDevicesItem != null) {
                    InputDeviceSettingsJsonMarshaller.getInstance().marshall(inputDevicesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getInputSourceType() != null) {
            String inputSourceType = input.getInputSourceType();
            jsonWriter.name("InputSourceType");
            jsonWriter.value(inputSourceType);
        }
        if (input.getMediaConnectFlows() != null) {
            java.util.List<MediaConnectFlow> mediaConnectFlows = input.getMediaConnectFlows();
            jsonWriter.name("MediaConnectFlows");
            jsonWriter.beginArray();
            for (MediaConnectFlow mediaConnectFlowsItem : mediaConnectFlows) {
                if (mediaConnectFlowsItem != null) {
                    MediaConnectFlowJsonMarshaller.getInstance().marshall(mediaConnectFlowsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getName() != null) {
            String name = input.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (input.getRoleArn() != null) {
            String roleArn = input.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (input.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = input.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getSources() != null) {
            java.util.List<InputSource> sources = input.getSources();
            jsonWriter.name("Sources");
            jsonWriter.beginArray();
            for (InputSource sourcesItem : sources) {
                if (sourcesItem != null) {
                    InputSourceJsonMarshaller.getInstance().marshall(sourcesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getState() != null) {
            String state = input.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (input.getTags() != null) {
            java.util.Map<String, String> tags = input.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (input.getType() != null) {
            String type = input.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static InputJsonMarshaller instance;

    public static InputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonMarshaller();
        return instance;
    }
}
