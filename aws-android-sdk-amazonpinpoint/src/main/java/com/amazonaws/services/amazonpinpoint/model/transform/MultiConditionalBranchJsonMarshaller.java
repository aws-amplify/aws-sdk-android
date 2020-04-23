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
 * JSON marshaller for POJO MultiConditionalBranch
 */
class MultiConditionalBranchJsonMarshaller {

    public void marshall(MultiConditionalBranch multiConditionalBranch, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (multiConditionalBranch.getCondition() != null) {
            SimpleCondition condition = multiConditionalBranch.getCondition();
            jsonWriter.name("Condition");
            SimpleConditionJsonMarshaller.getInstance().marshall(condition, jsonWriter);
        }
        if (multiConditionalBranch.getNextActivity() != null) {
            String nextActivity = multiConditionalBranch.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        jsonWriter.endObject();
    }

    private static MultiConditionalBranchJsonMarshaller instance;

    public static MultiConditionalBranchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiConditionalBranchJsonMarshaller();
        return instance;
    }
}
