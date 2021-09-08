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

package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RetainedMessageSummary
 */
class RetainedMessageSummaryJsonUnmarshaller implements
        Unmarshaller<RetainedMessageSummary, JsonUnmarshallerContext> {

    public RetainedMessageSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RetainedMessageSummary retainedMessageSummary = new RetainedMessageSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("topic")) {
                retainedMessageSummary.setTopic(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("payloadSize")) {
                retainedMessageSummary.setPayloadSize(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("qos")) {
                retainedMessageSummary.setQos(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedTime")) {
                retainedMessageSummary.setLastModifiedTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return retainedMessageSummary;
    }

    private static RetainedMessageSummaryJsonUnmarshaller instance;

    public static RetainedMessageSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RetainedMessageSummaryJsonUnmarshaller();
        return instance;
    }
}
