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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataSourceSyncJobMetricTarget
 */
class DataSourceSyncJobMetricTargetJsonMarshaller {

    public void marshall(DataSourceSyncJobMetricTarget dataSourceSyncJobMetricTarget,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataSourceSyncJobMetricTarget.getDataSourceId() != null) {
            String dataSourceId = dataSourceSyncJobMetricTarget.getDataSourceId();
            jsonWriter.name("DataSourceId");
            jsonWriter.value(dataSourceId);
        }
        if (dataSourceSyncJobMetricTarget.getDataSourceSyncJobId() != null) {
            String dataSourceSyncJobId = dataSourceSyncJobMetricTarget.getDataSourceSyncJobId();
            jsonWriter.name("DataSourceSyncJobId");
            jsonWriter.value(dataSourceSyncJobId);
        }
        jsonWriter.endObject();
    }

    private static DataSourceSyncJobMetricTargetJsonMarshaller instance;

    public static DataSourceSyncJobMetricTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceSyncJobMetricTargetJsonMarshaller();
        return instance;
    }
}
