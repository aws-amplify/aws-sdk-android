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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobFlowExecutionStatusDetail
 */
class JobFlowExecutionStatusDetailJsonUnmarshaller implements
        Unmarshaller<JobFlowExecutionStatusDetail, JsonUnmarshallerContext> {

    public JobFlowExecutionStatusDetail unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobFlowExecutionStatusDetail jobFlowExecutionStatusDetail = new JobFlowExecutionStatusDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("State")) {
                jobFlowExecutionStatusDetail.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDateTime")) {
                jobFlowExecutionStatusDetail.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDateTime")) {
                jobFlowExecutionStatusDetail.setStartDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReadyDateTime")) {
                jobFlowExecutionStatusDetail.setReadyDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndDateTime")) {
                jobFlowExecutionStatusDetail.setEndDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastStateChangeReason")) {
                jobFlowExecutionStatusDetail.setLastStateChangeReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobFlowExecutionStatusDetail;
    }

    private static JobFlowExecutionStatusDetailJsonUnmarshaller instance;

    public static JobFlowExecutionStatusDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowExecutionStatusDetailJsonUnmarshaller();
        return instance;
    }
}
