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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LifecyclePolicySummary
 */
class LifecyclePolicySummaryJsonMarshaller {

    public void marshall(LifecyclePolicySummary lifecyclePolicySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lifecyclePolicySummary.getPolicyId() != null) {
            String policyId = lifecyclePolicySummary.getPolicyId();
            jsonWriter.name("PolicyId");
            jsonWriter.value(policyId);
        }
        if (lifecyclePolicySummary.getDescription() != null) {
            String description = lifecyclePolicySummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (lifecyclePolicySummary.getState() != null) {
            String state = lifecyclePolicySummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (lifecyclePolicySummary.getTags() != null) {
            java.util.Map<String, String> tags = lifecyclePolicySummary.getTags();
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

    private static LifecyclePolicySummaryJsonMarshaller instance;

    public static LifecyclePolicySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LifecyclePolicySummaryJsonMarshaller();
        return instance;
    }
}
