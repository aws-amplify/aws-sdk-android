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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MultiConditionalSplitActivity
 */
class MultiConditionalSplitActivityJsonMarshaller {

    public void marshall(MultiConditionalSplitActivity multiConditionalSplitActivity,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (multiConditionalSplitActivity.getBranches() != null) {
            java.util.List<MultiConditionalBranch> branches = multiConditionalSplitActivity
                    .getBranches();
            jsonWriter.name("Branches");
            jsonWriter.beginArray();
            for (MultiConditionalBranch branchesItem : branches) {
                if (branchesItem != null) {
                    MultiConditionalBranchJsonMarshaller.getInstance().marshall(branchesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (multiConditionalSplitActivity.getDefaultActivity() != null) {
            String defaultActivity = multiConditionalSplitActivity.getDefaultActivity();
            jsonWriter.name("DefaultActivity");
            jsonWriter.value(defaultActivity);
        }
        if (multiConditionalSplitActivity.getEvaluationWaitTime() != null) {
            WaitTime evaluationWaitTime = multiConditionalSplitActivity.getEvaluationWaitTime();
            jsonWriter.name("EvaluationWaitTime");
            WaitTimeJsonMarshaller.getInstance().marshall(evaluationWaitTime, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MultiConditionalSplitActivityJsonMarshaller instance;

    public static MultiConditionalSplitActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiConditionalSplitActivityJsonMarshaller();
        return instance;
    }
}
