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
 * JSON marshaller for POJO DatasetGroup
 */
class DatasetGroupJsonMarshaller {

    public void marshall(DatasetGroup datasetGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (datasetGroup.getName() != null) {
            String name = datasetGroup.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (datasetGroup.getDatasetGroupArn() != null) {
            String datasetGroupArn = datasetGroup.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (datasetGroup.getStatus() != null) {
            String status = datasetGroup.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (datasetGroup.getRoleArn() != null) {
            String roleArn = datasetGroup.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (datasetGroup.getKmsKeyArn() != null) {
            String kmsKeyArn = datasetGroup.getKmsKeyArn();
            jsonWriter.name("kmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        if (datasetGroup.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetGroup.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetGroup.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetGroup.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (datasetGroup.getFailureReason() != null) {
            String failureReason = datasetGroup.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static DatasetGroupJsonMarshaller instance;

    public static DatasetGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetGroupJsonMarshaller();
        return instance;
    }
}
