/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO User
 */
class UserJsonMarshaller {

    public void marshall(User user, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (user.getId() != null) {
            String id = user.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (user.getArn() != null) {
            String arn = user.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (user.getUsername() != null) {
            String username = user.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (user.getIdentityInfo() != null) {
            UserIdentityInfo identityInfo = user.getIdentityInfo();
            jsonWriter.name("IdentityInfo");
            UserIdentityInfoJsonMarshaller.getInstance().marshall(identityInfo, jsonWriter);
        }
        if (user.getPhoneConfig() != null) {
            UserPhoneConfig phoneConfig = user.getPhoneConfig();
            jsonWriter.name("PhoneConfig");
            UserPhoneConfigJsonMarshaller.getInstance().marshall(phoneConfig, jsonWriter);
        }
        if (user.getDirectoryUserId() != null) {
            String directoryUserId = user.getDirectoryUserId();
            jsonWriter.name("DirectoryUserId");
            jsonWriter.value(directoryUserId);
        }
        if (user.getSecurityProfileIds() != null) {
            java.util.List<String> securityProfileIds = user.getSecurityProfileIds();
            jsonWriter.name("SecurityProfileIds");
            jsonWriter.beginArray();
            for (String securityProfileIdsItem : securityProfileIds) {
                if (securityProfileIdsItem != null) {
                    jsonWriter.value(securityProfileIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (user.getRoutingProfileId() != null) {
            String routingProfileId = user.getRoutingProfileId();
            jsonWriter.name("RoutingProfileId");
            jsonWriter.value(routingProfileId);
        }
        if (user.getHierarchyGroupId() != null) {
            String hierarchyGroupId = user.getHierarchyGroupId();
            jsonWriter.name("HierarchyGroupId");
            jsonWriter.value(hierarchyGroupId);
        }
        if (user.getTags() != null) {
            java.util.Map<String, String> tags = user.getTags();
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
        jsonWriter.endObject();
    }

    private static UserJsonMarshaller instance;

    public static UserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonMarshaller();
        return instance;
    }
}
