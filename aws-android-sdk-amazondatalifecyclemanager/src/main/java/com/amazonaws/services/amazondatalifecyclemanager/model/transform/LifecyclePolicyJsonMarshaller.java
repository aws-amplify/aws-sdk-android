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

package com.amazonaws.services.amazondatalifecyclemanager.model.transform;

import com.amazonaws.services.amazondatalifecyclemanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LifecyclePolicy
 */
class LifecyclePolicyJsonMarshaller {

    public void marshall(LifecyclePolicy lifecyclePolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lifecyclePolicy.getPolicyId() != null) {
            String policyId = lifecyclePolicy.getPolicyId();
            jsonWriter.name("PolicyId");
            jsonWriter.value(policyId);
        }
        if (lifecyclePolicy.getDescription() != null) {
            String description = lifecyclePolicy.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (lifecyclePolicy.getState() != null) {
            String state = lifecyclePolicy.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (lifecyclePolicy.getStatusMessage() != null) {
            String statusMessage = lifecyclePolicy.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (lifecyclePolicy.getExecutionRoleArn() != null) {
            String executionRoleArn = lifecyclePolicy.getExecutionRoleArn();
            jsonWriter.name("ExecutionRoleArn");
            jsonWriter.value(executionRoleArn);
        }
        if (lifecyclePolicy.getDateCreated() != null) {
            java.util.Date dateCreated = lifecyclePolicy.getDateCreated();
            jsonWriter.name("DateCreated");
            jsonWriter.value(dateCreated);
        }
        if (lifecyclePolicy.getDateModified() != null) {
            java.util.Date dateModified = lifecyclePolicy.getDateModified();
            jsonWriter.name("DateModified");
            jsonWriter.value(dateModified);
        }
        if (lifecyclePolicy.getPolicyDetails() != null) {
            PolicyDetails policyDetails = lifecyclePolicy.getPolicyDetails();
            jsonWriter.name("PolicyDetails");
            PolicyDetailsJsonMarshaller.getInstance().marshall(policyDetails, jsonWriter);
        }
        if (lifecyclePolicy.getTags() != null) {
            java.util.Map<String, String> tags = lifecyclePolicy.getTags();
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
        if (lifecyclePolicy.getPolicyArn() != null) {
            String policyArn = lifecyclePolicy.getPolicyArn();
            jsonWriter.name("PolicyArn");
            jsonWriter.value(policyArn);
        }
        jsonWriter.endObject();
    }

    private static LifecyclePolicyJsonMarshaller instance;

    public static LifecyclePolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LifecyclePolicyJsonMarshaller();
        return instance;
    }
}
