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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataRepositoryTaskStatus
 */
class DataRepositoryTaskStatusJsonMarshaller {

    public void marshall(DataRepositoryTaskStatus dataRepositoryTaskStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataRepositoryTaskStatus.getTotalCount() != null) {
            Long totalCount = dataRepositoryTaskStatus.getTotalCount();
            jsonWriter.name("TotalCount");
            jsonWriter.value(totalCount);
        }
        if (dataRepositoryTaskStatus.getSucceededCount() != null) {
            Long succeededCount = dataRepositoryTaskStatus.getSucceededCount();
            jsonWriter.name("SucceededCount");
            jsonWriter.value(succeededCount);
        }
        if (dataRepositoryTaskStatus.getFailedCount() != null) {
            Long failedCount = dataRepositoryTaskStatus.getFailedCount();
            jsonWriter.name("FailedCount");
            jsonWriter.value(failedCount);
        }
        if (dataRepositoryTaskStatus.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = dataRepositoryTaskStatus.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static DataRepositoryTaskStatusJsonMarshaller instance;

    public static DataRepositoryTaskStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataRepositoryTaskStatusJsonMarshaller();
        return instance;
    }
}
