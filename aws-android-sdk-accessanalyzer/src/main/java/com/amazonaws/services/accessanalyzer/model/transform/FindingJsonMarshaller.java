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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Finding
 */
class FindingJsonMarshaller {

    public void marshall(Finding finding, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (finding.getAction() != null) {
            java.util.List<String> action = finding.getAction();
            jsonWriter.name("action");
            jsonWriter.beginArray();
            for (String actionItem : action) {
                if (actionItem != null) {
                    jsonWriter.value(actionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (finding.getAnalyzedAt() != null) {
            java.util.Date analyzedAt = finding.getAnalyzedAt();
            jsonWriter.name("analyzedAt");
            jsonWriter.value(analyzedAt);
        }
        if (finding.getCondition() != null) {
            java.util.Map<String, String> condition = finding.getCondition();
            jsonWriter.name("condition");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> conditionEntry : condition.entrySet()) {
                String conditionValue = conditionEntry.getValue();
                if (conditionValue != null) {
                    jsonWriter.name(conditionEntry.getKey());
                    jsonWriter.value(conditionValue);
                }
            }
            jsonWriter.endObject();
        }
        if (finding.getCreatedAt() != null) {
            java.util.Date createdAt = finding.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (finding.getError() != null) {
            String error = finding.getError();
            jsonWriter.name("error");
            jsonWriter.value(error);
        }
        if (finding.getId() != null) {
            String id = finding.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (finding.getIsPublic() != null) {
            Boolean isPublic = finding.getIsPublic();
            jsonWriter.name("isPublic");
            jsonWriter.value(isPublic);
        }
        if (finding.getPrincipal() != null) {
            java.util.Map<String, String> principal = finding.getPrincipal();
            jsonWriter.name("principal");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> principalEntry : principal.entrySet()) {
                String principalValue = principalEntry.getValue();
                if (principalValue != null) {
                    jsonWriter.name(principalEntry.getKey());
                    jsonWriter.value(principalValue);
                }
            }
            jsonWriter.endObject();
        }
        if (finding.getResource() != null) {
            String resource = finding.getResource();
            jsonWriter.name("resource");
            jsonWriter.value(resource);
        }
        if (finding.getResourceOwnerAccount() != null) {
            String resourceOwnerAccount = finding.getResourceOwnerAccount();
            jsonWriter.name("resourceOwnerAccount");
            jsonWriter.value(resourceOwnerAccount);
        }
        if (finding.getResourceType() != null) {
            String resourceType = finding.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (finding.getSources() != null) {
            java.util.List<FindingSource> sources = finding.getSources();
            jsonWriter.name("sources");
            jsonWriter.beginArray();
            for (FindingSource sourcesItem : sources) {
                if (sourcesItem != null) {
                    FindingSourceJsonMarshaller.getInstance().marshall(sourcesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (finding.getStatus() != null) {
            String status = finding.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (finding.getUpdatedAt() != null) {
            java.util.Date updatedAt = finding.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static FindingJsonMarshaller instance;

    public static FindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonMarshaller();
        return instance;
    }
}
