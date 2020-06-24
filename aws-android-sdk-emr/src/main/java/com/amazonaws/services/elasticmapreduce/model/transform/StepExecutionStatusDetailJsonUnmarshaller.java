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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StepExecutionStatusDetail
 */
class StepExecutionStatusDetailJsonUnmarshaller implements
        Unmarshaller<StepExecutionStatusDetail, JsonUnmarshallerContext> {

    public StepExecutionStatusDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StepExecutionStatusDetail stepExecutionStatusDetail = new StepExecutionStatusDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("State")) {
                stepExecutionStatusDetail.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDateTime")) {
                stepExecutionStatusDetail.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDateTime")) {
                stepExecutionStatusDetail.setStartDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndDateTime")) {
                stepExecutionStatusDetail.setEndDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastStateChangeReason")) {
                stepExecutionStatusDetail.setLastStateChangeReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return stepExecutionStatusDetail;
    }

    private static StepExecutionStatusDetailJsonUnmarshaller instance;

    public static StepExecutionStatusDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionStatusDetailJsonUnmarshaller();
        return instance;
    }
}
