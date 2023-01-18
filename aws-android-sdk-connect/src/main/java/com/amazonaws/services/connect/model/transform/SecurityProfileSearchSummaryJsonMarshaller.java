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
 * JSON marshaller for POJO SecurityProfileSearchSummary
 */
class SecurityProfileSearchSummaryJsonMarshaller {

    public void marshall(SecurityProfileSearchSummary securityProfileSearchSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (securityProfileSearchSummary.getId() != null) {
            String id = securityProfileSearchSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (securityProfileSearchSummary.getOrganizationResourceId() != null) {
            String organizationResourceId = securityProfileSearchSummary
                    .getOrganizationResourceId();
            jsonWriter.name("OrganizationResourceId");
            jsonWriter.value(organizationResourceId);
        }
        if (securityProfileSearchSummary.getArn() != null) {
            String arn = securityProfileSearchSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (securityProfileSearchSummary.getSecurityProfileName() != null) {
            String securityProfileName = securityProfileSearchSummary.getSecurityProfileName();
            jsonWriter.name("SecurityProfileName");
            jsonWriter.value(securityProfileName);
        }
        if (securityProfileSearchSummary.getDescription() != null) {
            String description = securityProfileSearchSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (securityProfileSearchSummary.getTags() != null) {
            java.util.Map<String, String> tags = securityProfileSearchSummary.getTags();
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

    private static SecurityProfileSearchSummaryJsonMarshaller instance;

    public static SecurityProfileSearchSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityProfileSearchSummaryJsonMarshaller();
        return instance;
    }
}
