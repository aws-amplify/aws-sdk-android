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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UsagePlan
 */
class UsagePlanJsonMarshaller {

    public void marshall(UsagePlan usagePlan, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (usagePlan.getId() != null) {
            String id = usagePlan.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (usagePlan.getName() != null) {
            String name = usagePlan.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (usagePlan.getDescription() != null) {
            String description = usagePlan.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (usagePlan.getApiStages() != null) {
            java.util.List<ApiStage> apiStages = usagePlan.getApiStages();
            jsonWriter.name("apiStages");
            jsonWriter.beginArray();
            for (ApiStage apiStagesItem : apiStages) {
                if (apiStagesItem != null) {
                    ApiStageJsonMarshaller.getInstance().marshall(apiStagesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (usagePlan.getThrottle() != null) {
            ThrottleSettings throttle = usagePlan.getThrottle();
            jsonWriter.name("throttle");
            ThrottleSettingsJsonMarshaller.getInstance().marshall(throttle, jsonWriter);
        }
        if (usagePlan.getQuota() != null) {
            QuotaSettings quota = usagePlan.getQuota();
            jsonWriter.name("quota");
            QuotaSettingsJsonMarshaller.getInstance().marshall(quota, jsonWriter);
        }
        if (usagePlan.getProductCode() != null) {
            String productCode = usagePlan.getProductCode();
            jsonWriter.name("productCode");
            jsonWriter.value(productCode);
        }
        if (usagePlan.getTags() != null) {
            java.util.Map<String, String> tags = usagePlan.getTags();
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

    private static UsagePlanJsonMarshaller instance;

    public static UsagePlanJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsagePlanJsonMarshaller();
        return instance;
    }
}
