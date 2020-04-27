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
 * JSON marshaller for POJO FindingSummary
 */
class FindingSummaryJsonMarshaller {

    public void marshall(FindingSummary findingSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (findingSummary.getAction() != null) {
            java.util.List<String> action = findingSummary.getAction();
            jsonWriter.name("action");
            jsonWriter.beginArray();
            for (String actionItem : action) {
                if (actionItem != null) {
                    jsonWriter.value(actionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (findingSummary.getAnalyzedAt() != null) {
            java.util.Date analyzedAt = findingSummary.getAnalyzedAt();
            jsonWriter.name("analyzedAt");
            jsonWriter.value(analyzedAt);
        }
        if (findingSummary.getCondition() != null) {
            java.util.Map<String, String> condition = findingSummary.getCondition();
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
        if (findingSummary.getCreatedAt() != null) {
            java.util.Date createdAt = findingSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (findingSummary.getError() != null) {
            String error = findingSummary.getError();
            jsonWriter.name("error");
            jsonWriter.value(error);
        }
        if (findingSummary.getId() != null) {
            String id = findingSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (findingSummary.getIsPublic() != null) {
            Boolean isPublic = findingSummary.getIsPublic();
            jsonWriter.name("isPublic");
            jsonWriter.value(isPublic);
        }
        if (findingSummary.getPrincipal() != null) {
            java.util.Map<String, String> principal = findingSummary.getPrincipal();
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
        if (findingSummary.getResource() != null) {
            String resource = findingSummary.getResource();
            jsonWriter.name("resource");
            jsonWriter.value(resource);
        }
        if (findingSummary.getResourceOwnerAccount() != null) {
            String resourceOwnerAccount = findingSummary.getResourceOwnerAccount();
            jsonWriter.name("resourceOwnerAccount");
            jsonWriter.value(resourceOwnerAccount);
        }
        if (findingSummary.getResourceType() != null) {
            String resourceType = findingSummary.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (findingSummary.getSources() != null) {
            java.util.List<FindingSource> sources = findingSummary.getSources();
            jsonWriter.name("sources");
            jsonWriter.beginArray();
            for (FindingSource sourcesItem : sources) {
                if (sourcesItem != null) {
                    FindingSourceJsonMarshaller.getInstance().marshall(sourcesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (findingSummary.getStatus() != null) {
            String status = findingSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (findingSummary.getUpdatedAt() != null) {
            java.util.Date updatedAt = findingSummary.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static FindingSummaryJsonMarshaller instance;

    public static FindingSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingSummaryJsonMarshaller();
        return instance;
    }
}
