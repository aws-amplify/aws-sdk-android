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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AffectedEntity
 */
class AffectedEntityJsonMarshaller {

    public void marshall(AffectedEntity affectedEntity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (affectedEntity.getEntityArn() != null) {
            String entityArn = affectedEntity.getEntityArn();
            jsonWriter.name("entityArn");
            jsonWriter.value(entityArn);
        }
        if (affectedEntity.getEventArn() != null) {
            String eventArn = affectedEntity.getEventArn();
            jsonWriter.name("eventArn");
            jsonWriter.value(eventArn);
        }
        if (affectedEntity.getEntityValue() != null) {
            String entityValue = affectedEntity.getEntityValue();
            jsonWriter.name("entityValue");
            jsonWriter.value(entityValue);
        }
        if (affectedEntity.getEntityUrl() != null) {
            String entityUrl = affectedEntity.getEntityUrl();
            jsonWriter.name("entityUrl");
            jsonWriter.value(entityUrl);
        }
        if (affectedEntity.getAwsAccountId() != null) {
            String awsAccountId = affectedEntity.getAwsAccountId();
            jsonWriter.name("awsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (affectedEntity.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = affectedEntity.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (affectedEntity.getStatusCode() != null) {
            String statusCode = affectedEntity.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        if (affectedEntity.getTags() != null) {
            java.util.Map<String, String> tags = affectedEntity.getTags();
            jsonWriter.name("tags");
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

    private static AffectedEntityJsonMarshaller instance;

    public static AffectedEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AffectedEntityJsonMarshaller();
        return instance;
    }
}
