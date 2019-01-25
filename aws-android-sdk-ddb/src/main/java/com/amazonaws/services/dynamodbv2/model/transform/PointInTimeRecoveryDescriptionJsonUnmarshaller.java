/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PointInTimeRecoveryDescription
 */
class PointInTimeRecoveryDescriptionJsonUnmarshaller implements
        Unmarshaller<PointInTimeRecoveryDescription, JsonUnmarshallerContext> {

    public PointInTimeRecoveryDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PointInTimeRecoveryDescription pointInTimeRecoveryDescription = new PointInTimeRecoveryDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PointInTimeRecoveryStatus")) {
                pointInTimeRecoveryDescription.setPointInTimeRecoveryStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EarliestRestorableDateTime")) {
                pointInTimeRecoveryDescription.setEarliestRestorableDateTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestRestorableDateTime")) {
                pointInTimeRecoveryDescription.setLatestRestorableDateTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return pointInTimeRecoveryDescription;
    }

    private static PointInTimeRecoveryDescriptionJsonUnmarshaller instance;

    public static PointInTimeRecoveryDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PointInTimeRecoveryDescriptionJsonUnmarshaller();
        return instance;
    }
}
