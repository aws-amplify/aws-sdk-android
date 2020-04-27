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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KinesisSettings
 */
class KinesisSettingsJsonMarshaller {

    public void marshall(KinesisSettings kinesisSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (kinesisSettings.getStreamArn() != null) {
            String streamArn = kinesisSettings.getStreamArn();
            jsonWriter.name("StreamArn");
            jsonWriter.value(streamArn);
        }
        if (kinesisSettings.getMessageFormat() != null) {
            String messageFormat = kinesisSettings.getMessageFormat();
            jsonWriter.name("MessageFormat");
            jsonWriter.value(messageFormat);
        }
        if (kinesisSettings.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = kinesisSettings.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        if (kinesisSettings.getIncludeTransactionDetails() != null) {
            Boolean includeTransactionDetails = kinesisSettings.getIncludeTransactionDetails();
            jsonWriter.name("IncludeTransactionDetails");
            jsonWriter.value(includeTransactionDetails);
        }
        if (kinesisSettings.getIncludePartitionValue() != null) {
            Boolean includePartitionValue = kinesisSettings.getIncludePartitionValue();
            jsonWriter.name("IncludePartitionValue");
            jsonWriter.value(includePartitionValue);
        }
        if (kinesisSettings.getPartitionIncludeSchemaTable() != null) {
            Boolean partitionIncludeSchemaTable = kinesisSettings.getPartitionIncludeSchemaTable();
            jsonWriter.name("PartitionIncludeSchemaTable");
            jsonWriter.value(partitionIncludeSchemaTable);
        }
        if (kinesisSettings.getIncludeTableAlterOperations() != null) {
            Boolean includeTableAlterOperations = kinesisSettings.getIncludeTableAlterOperations();
            jsonWriter.name("IncludeTableAlterOperations");
            jsonWriter.value(includeTableAlterOperations);
        }
        if (kinesisSettings.getIncludeControlDetails() != null) {
            Boolean includeControlDetails = kinesisSettings.getIncludeControlDetails();
            jsonWriter.name("IncludeControlDetails");
            jsonWriter.value(includeControlDetails);
        }
        jsonWriter.endObject();
    }

    private static KinesisSettingsJsonMarshaller instance;

    public static KinesisSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisSettingsJsonMarshaller();
        return instance;
    }
}
