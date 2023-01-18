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
 * JSON marshaller for POJO UserSearchSummary
 */
class UserSearchSummaryJsonMarshaller {

    public void marshall(UserSearchSummary userSearchSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userSearchSummary.getArn() != null) {
            String arn = userSearchSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (userSearchSummary.getDirectoryUserId() != null) {
            String directoryUserId = userSearchSummary.getDirectoryUserId();
            jsonWriter.name("DirectoryUserId");
            jsonWriter.value(directoryUserId);
        }
        if (userSearchSummary.getHierarchyGroupId() != null) {
            String hierarchyGroupId = userSearchSummary.getHierarchyGroupId();
            jsonWriter.name("HierarchyGroupId");
            jsonWriter.value(hierarchyGroupId);
        }
        if (userSearchSummary.getId() != null) {
            String id = userSearchSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (userSearchSummary.getIdentityInfo() != null) {
            UserIdentityInfoLite identityInfo = userSearchSummary.getIdentityInfo();
            jsonWriter.name("IdentityInfo");
            UserIdentityInfoLiteJsonMarshaller.getInstance().marshall(identityInfo, jsonWriter);
        }
        if (userSearchSummary.getPhoneConfig() != null) {
            UserPhoneConfig phoneConfig = userSearchSummary.getPhoneConfig();
            jsonWriter.name("PhoneConfig");
            UserPhoneConfigJsonMarshaller.getInstance().marshall(phoneConfig, jsonWriter);
        }
        if (userSearchSummary.getRoutingProfileId() != null) {
            String routingProfileId = userSearchSummary.getRoutingProfileId();
            jsonWriter.name("RoutingProfileId");
            jsonWriter.value(routingProfileId);
        }
        if (userSearchSummary.getSecurityProfileIds() != null) {
            java.util.List<String> securityProfileIds = userSearchSummary.getSecurityProfileIds();
            jsonWriter.name("SecurityProfileIds");
            jsonWriter.beginArray();
            for (String securityProfileIdsItem : securityProfileIds) {
                if (securityProfileIdsItem != null) {
                    jsonWriter.value(securityProfileIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userSearchSummary.getTags() != null) {
            java.util.Map<String, String> tags = userSearchSummary.getTags();
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
        if (userSearchSummary.getUsername() != null) {
            String username = userSearchSummary.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        jsonWriter.endObject();
    }

    private static UserSearchSummaryJsonMarshaller instance;

    public static UserSearchSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserSearchSummaryJsonMarshaller();
        return instance;
    }
}
