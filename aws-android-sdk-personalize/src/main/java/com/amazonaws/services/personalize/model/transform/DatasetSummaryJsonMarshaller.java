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
 * JSON marshaller for POJO DatasetSummary
 */
class DatasetSummaryJsonMarshaller {

    public void marshall(DatasetSummary datasetSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (datasetSummary.getName() != null) {
            String name = datasetSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (datasetSummary.getDatasetArn() != null) {
            String datasetArn = datasetSummary.getDatasetArn();
            jsonWriter.name("datasetArn");
            jsonWriter.value(datasetArn);
        }
        if (datasetSummary.getDatasetType() != null) {
            String datasetType = datasetSummary.getDatasetType();
            jsonWriter.name("datasetType");
            jsonWriter.value(datasetType);
        }
        if (datasetSummary.getStatus() != null) {
            String status = datasetSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (datasetSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static DatasetSummaryJsonMarshaller instance;

    public static DatasetSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetSummaryJsonMarshaller();
        return instance;
    }
}
