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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LifecyclePolicyPreviewResult
 */
class LifecyclePolicyPreviewResultJsonMarshaller {

    public void marshall(LifecyclePolicyPreviewResult lifecyclePolicyPreviewResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lifecyclePolicyPreviewResult.getImageTags() != null) {
            java.util.List<String> imageTags = lifecyclePolicyPreviewResult.getImageTags();
            jsonWriter.name("imageTags");
            jsonWriter.beginArray();
            for (String imageTagsItem : imageTags) {
                if (imageTagsItem != null) {
                    jsonWriter.value(imageTagsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (lifecyclePolicyPreviewResult.getImageDigest() != null) {
            String imageDigest = lifecyclePolicyPreviewResult.getImageDigest();
            jsonWriter.name("imageDigest");
            jsonWriter.value(imageDigest);
        }
        if (lifecyclePolicyPreviewResult.getImagePushedAt() != null) {
            java.util.Date imagePushedAt = lifecyclePolicyPreviewResult.getImagePushedAt();
            jsonWriter.name("imagePushedAt");
            jsonWriter.value(imagePushedAt);
        }
        if (lifecyclePolicyPreviewResult.getAction() != null) {
            LifecyclePolicyRuleAction action = lifecyclePolicyPreviewResult.getAction();
            jsonWriter.name("action");
            LifecyclePolicyRuleActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (lifecyclePolicyPreviewResult.getAppliedRulePriority() != null) {
            Integer appliedRulePriority = lifecyclePolicyPreviewResult.getAppliedRulePriority();
            jsonWriter.name("appliedRulePriority");
            jsonWriter.value(appliedRulePriority);
        }
        jsonWriter.endObject();
    }

    private static LifecyclePolicyPreviewResultJsonMarshaller instance;

    public static LifecyclePolicyPreviewResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LifecyclePolicyPreviewResultJsonMarshaller();
        return instance;
    }
}
