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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Activity
 */
class ActivityJsonUnmarshaller implements Unmarshaller<Activity, JsonUnmarshallerContext> {

    public Activity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Activity activity = new Activity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CUSTOM")) {
                activity.setCUSTOM(CustomMessageActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConditionalSplit")) {
                activity.setConditionalSplit(ConditionalSplitActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                activity.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EMAIL")) {
                activity.setEMAIL(EmailMessageActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Holdout")) {
                activity.setHoldout(HoldoutActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiCondition")) {
                activity.setMultiCondition(MultiConditionalSplitActivityJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PUSH")) {
                activity.setPUSH(PushMessageActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RandomSplit")) {
                activity.setRandomSplit(RandomSplitActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SMS")) {
                activity.setSMS(SMSMessageActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Wait")) {
                activity.setWait(WaitActivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return activity;
    }

    private static ActivityJsonUnmarshaller instance;

    public static ActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivityJsonUnmarshaller();
        return instance;
    }
}
