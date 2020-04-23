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
 * JSON marshaller for POJO Activity
 */
class ActivityJsonMarshaller {

    public void marshall(Activity activity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activity.getConditionalSplit() != null) {
            ConditionalSplitActivity conditionalSplit = activity.getConditionalSplit();
            jsonWriter.name("ConditionalSplit");
            ConditionalSplitActivityJsonMarshaller.getInstance().marshall(conditionalSplit,
                    jsonWriter);
        }
        if (activity.getDescription() != null) {
            String description = activity.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (activity.getEMAIL() != null) {
            EmailMessageActivity eMAIL = activity.getEMAIL();
            jsonWriter.name("EMAIL");
            EmailMessageActivityJsonMarshaller.getInstance().marshall(eMAIL, jsonWriter);
        }
        if (activity.getHoldout() != null) {
            HoldoutActivity holdout = activity.getHoldout();
            jsonWriter.name("Holdout");
            HoldoutActivityJsonMarshaller.getInstance().marshall(holdout, jsonWriter);
        }
        if (activity.getMultiCondition() != null) {
            MultiConditionalSplitActivity multiCondition = activity.getMultiCondition();
            jsonWriter.name("MultiCondition");
            MultiConditionalSplitActivityJsonMarshaller.getInstance().marshall(multiCondition,
                    jsonWriter);
        }
        if (activity.getRandomSplit() != null) {
            RandomSplitActivity randomSplit = activity.getRandomSplit();
            jsonWriter.name("RandomSplit");
            RandomSplitActivityJsonMarshaller.getInstance().marshall(randomSplit, jsonWriter);
        }
        if (activity.getWait() != null) {
            WaitActivity wait = activity.getWait();
            jsonWriter.name("Wait");
            WaitActivityJsonMarshaller.getInstance().marshall(wait, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ActivityJsonMarshaller instance;

    public static ActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityJsonMarshaller();
        return instance;
    }
}
