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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsJobAbortCriteria
 */
class AwsJobAbortCriteriaJsonUnmarshaller implements
        Unmarshaller<AwsJobAbortCriteria, JsonUnmarshallerContext> {

    public AwsJobAbortCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsJobAbortCriteria awsJobAbortCriteria = new AwsJobAbortCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("failureType")) {
                awsJobAbortCriteria.setFailureType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("action")) {
                awsJobAbortCriteria.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thresholdPercentage")) {
                awsJobAbortCriteria.setThresholdPercentage(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minNumberOfExecutedThings")) {
                awsJobAbortCriteria.setMinNumberOfExecutedThings(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsJobAbortCriteria;
    }

    private static AwsJobAbortCriteriaJsonUnmarshaller instance;

    public static AwsJobAbortCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsJobAbortCriteriaJsonUnmarshaller();
        return instance;
    }
}
