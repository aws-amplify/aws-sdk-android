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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DatasetGroupSummary
 */
class DatasetGroupSummaryJsonMarshaller {

    public void marshall(DatasetGroupSummary datasetGroupSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetGroupSummary.getName() != null) {
            String name = datasetGroupSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (datasetGroupSummary.getDatasetGroupArn() != null) {
            String datasetGroupArn = datasetGroupSummary.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (datasetGroupSummary.getStatus() != null) {
            String status = datasetGroupSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (datasetGroupSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetGroupSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetGroupSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetGroupSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (datasetGroupSummary.getFailureReason() != null) {
            String failureReason = datasetGroupSummary.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static DatasetGroupSummaryJsonMarshaller instance;

    public static DatasetGroupSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetGroupSummaryJsonMarshaller();
        return instance;
    }
}
