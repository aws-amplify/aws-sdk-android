/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SecurityProfile
 */
class SecurityProfileJsonMarshaller {

    public void marshall(SecurityProfile securityProfile, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (securityProfile.getId() != null) {
            String id = securityProfile.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (securityProfile.getOrganizationResourceId() != null) {
            String organizationResourceId = securityProfile.getOrganizationResourceId();
            jsonWriter.name("OrganizationResourceId");
            jsonWriter.value(organizationResourceId);
        }
        if (securityProfile.getArn() != null) {
            String arn = securityProfile.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (securityProfile.getSecurityProfileName() != null) {
            String securityProfileName = securityProfile.getSecurityProfileName();
            jsonWriter.name("SecurityProfileName");
            jsonWriter.value(securityProfileName);
        }
        if (securityProfile.getDescription() != null) {
            String description = securityProfile.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (securityProfile.getTags() != null) {
            java.util.Map<String, String> tags = securityProfile.getTags();
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
        if (securityProfile.getAllowedAccessControlTags() != null) {
            java.util.Map<String, String> allowedAccessControlTags = securityProfile
                    .getAllowedAccessControlTags();
            jsonWriter.name("AllowedAccessControlTags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> allowedAccessControlTagsEntry : allowedAccessControlTags
                    .entrySet()) {
                String allowedAccessControlTagsValue = allowedAccessControlTagsEntry.getValue();
                if (allowedAccessControlTagsValue != null) {
                    jsonWriter.name(allowedAccessControlTagsEntry.getKey());
                    jsonWriter.value(allowedAccessControlTagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (securityProfile.getTagRestrictedResources() != null) {
            java.util.List<String> tagRestrictedResources = securityProfile
                    .getTagRestrictedResources();
            jsonWriter.name("TagRestrictedResources");
            jsonWriter.beginArray();
            for (String tagRestrictedResourcesItem : tagRestrictedResources) {
                if (tagRestrictedResourcesItem != null) {
                    jsonWriter.value(tagRestrictedResourcesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (securityProfile.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = securityProfile.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (securityProfile.getLastModifiedRegion() != null) {
            String lastModifiedRegion = securityProfile.getLastModifiedRegion();
            jsonWriter.name("LastModifiedRegion");
            jsonWriter.value(lastModifiedRegion);
        }
        jsonWriter.endObject();
    }

    private static SecurityProfileJsonMarshaller instance;

    public static SecurityProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityProfileJsonMarshaller();
        return instance;
    }
}
