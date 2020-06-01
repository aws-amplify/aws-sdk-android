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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataRepositoryTaskStatus
 */
class DataRepositoryTaskStatusJsonUnmarshaller implements
        Unmarshaller<DataRepositoryTaskStatus, JsonUnmarshallerContext> {

    public DataRepositoryTaskStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataRepositoryTaskStatus dataRepositoryTaskStatus = new DataRepositoryTaskStatus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TotalCount")) {
                dataRepositoryTaskStatus.setTotalCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SucceededCount")) {
                dataRepositoryTaskStatus.setSucceededCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailedCount")) {
                dataRepositoryTaskStatus.setFailedCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                dataRepositoryTaskStatus.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataRepositoryTaskStatus;
    }

    private static DataRepositoryTaskStatusJsonUnmarshaller instance;

    public static DataRepositoryTaskStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataRepositoryTaskStatusJsonUnmarshaller();
        return instance;
    }
}
