/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserData
 */
class UserDataJsonMarshaller {

    public void marshall(UserData userData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userData.getUser() != null) {
            UserReference user = userData.getUser();
            jsonWriter.name("User");
            UserReferenceJsonMarshaller.getInstance().marshall(user, jsonWriter);
        }
        if (userData.getRoutingProfile() != null) {
            RoutingProfileReference routingProfile = userData.getRoutingProfile();
            jsonWriter.name("RoutingProfile");
            RoutingProfileReferenceJsonMarshaller.getInstance()
                    .marshall(routingProfile, jsonWriter);
        }
        if (userData.getHierarchyPath() != null) {
            HierarchyPathReference hierarchyPath = userData.getHierarchyPath();
            jsonWriter.name("HierarchyPath");
            HierarchyPathReferenceJsonMarshaller.getInstance().marshall(hierarchyPath, jsonWriter);
        }
        if (userData.getStatus() != null) {
            AgentStatusReference status = userData.getStatus();
            jsonWriter.name("Status");
            AgentStatusReferenceJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (userData.getAvailableSlotsByChannel() != null) {
            java.util.Map<String, Integer> availableSlotsByChannel = userData
                    .getAvailableSlotsByChannel();
            jsonWriter.name("AvailableSlotsByChannel");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> availableSlotsByChannelEntry : availableSlotsByChannel
                    .entrySet()) {
                Integer availableSlotsByChannelValue = availableSlotsByChannelEntry.getValue();
                if (availableSlotsByChannelValue != null) {
                    jsonWriter.name(availableSlotsByChannelEntry.getKey());
                    jsonWriter.value(availableSlotsByChannelValue);
                }
            }
            jsonWriter.endObject();
        }
        if (userData.getMaxSlotsByChannel() != null) {
            java.util.Map<String, Integer> maxSlotsByChannel = userData.getMaxSlotsByChannel();
            jsonWriter.name("MaxSlotsByChannel");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> maxSlotsByChannelEntry : maxSlotsByChannel
                    .entrySet()) {
                Integer maxSlotsByChannelValue = maxSlotsByChannelEntry.getValue();
                if (maxSlotsByChannelValue != null) {
                    jsonWriter.name(maxSlotsByChannelEntry.getKey());
                    jsonWriter.value(maxSlotsByChannelValue);
                }
            }
            jsonWriter.endObject();
        }
        if (userData.getActiveSlotsByChannel() != null) {
            java.util.Map<String, Integer> activeSlotsByChannel = userData
                    .getActiveSlotsByChannel();
            jsonWriter.name("ActiveSlotsByChannel");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> activeSlotsByChannelEntry : activeSlotsByChannel
                    .entrySet()) {
                Integer activeSlotsByChannelValue = activeSlotsByChannelEntry.getValue();
                if (activeSlotsByChannelValue != null) {
                    jsonWriter.name(activeSlotsByChannelEntry.getKey());
                    jsonWriter.value(activeSlotsByChannelValue);
                }
            }
            jsonWriter.endObject();
        }
        if (userData.getContacts() != null) {
            java.util.List<AgentContactReference> contacts = userData.getContacts();
            jsonWriter.name("Contacts");
            jsonWriter.beginArray();
            for (AgentContactReference contactsItem : contacts) {
                if (contactsItem != null) {
                    AgentContactReferenceJsonMarshaller.getInstance().marshall(contactsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (userData.getNextStatus() != null) {
            String nextStatus = userData.getNextStatus();
            jsonWriter.name("NextStatus");
            jsonWriter.value(nextStatus);
        }
        jsonWriter.endObject();
    }

    private static UserDataJsonMarshaller instance;

    public static UserDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserDataJsonMarshaller();
        return instance;
    }
}
