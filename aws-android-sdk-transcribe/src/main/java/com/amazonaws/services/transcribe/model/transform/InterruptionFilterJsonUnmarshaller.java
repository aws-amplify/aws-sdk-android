/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InterruptionFilter
 */
class InterruptionFilterJsonUnmarshaller implements
        Unmarshaller<InterruptionFilter, JsonUnmarshallerContext> {

    public InterruptionFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InterruptionFilter interruptionFilter = new InterruptionFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Threshold")) {
                interruptionFilter.setThreshold(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantRole")) {
                interruptionFilter.setParticipantRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AbsoluteTimeRange")) {
                interruptionFilter.setAbsoluteTimeRange(AbsoluteTimeRangeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelativeTimeRange")) {
                interruptionFilter.setRelativeTimeRange(RelativeTimeRangeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Negate")) {
                interruptionFilter.setNegate(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return interruptionFilter;
    }

    private static InterruptionFilterJsonUnmarshaller instance;

    public static InterruptionFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InterruptionFilterJsonUnmarshaller();
        return instance;
    }
}
