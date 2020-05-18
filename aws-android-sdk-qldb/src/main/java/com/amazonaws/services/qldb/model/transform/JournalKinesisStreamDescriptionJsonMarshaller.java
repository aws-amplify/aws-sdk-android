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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JournalKinesisStreamDescription
 */
class JournalKinesisStreamDescriptionJsonMarshaller {

    public void marshall(JournalKinesisStreamDescription journalKinesisStreamDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (journalKinesisStreamDescription.getLedgerName() != null) {
            String ledgerName = journalKinesisStreamDescription.getLedgerName();
            jsonWriter.name("LedgerName");
            jsonWriter.value(ledgerName);
        }
        if (journalKinesisStreamDescription.getCreationTime() != null) {
            java.util.Date creationTime = journalKinesisStreamDescription.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (journalKinesisStreamDescription.getInclusiveStartTime() != null) {
            java.util.Date inclusiveStartTime = journalKinesisStreamDescription
                    .getInclusiveStartTime();
            jsonWriter.name("InclusiveStartTime");
            jsonWriter.value(inclusiveStartTime);
        }
        if (journalKinesisStreamDescription.getExclusiveEndTime() != null) {
            java.util.Date exclusiveEndTime = journalKinesisStreamDescription.getExclusiveEndTime();
            jsonWriter.name("ExclusiveEndTime");
            jsonWriter.value(exclusiveEndTime);
        }
        if (journalKinesisStreamDescription.getRoleArn() != null) {
            String roleArn = journalKinesisStreamDescription.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (journalKinesisStreamDescription.getStreamId() != null) {
            String streamId = journalKinesisStreamDescription.getStreamId();
            jsonWriter.name("StreamId");
            jsonWriter.value(streamId);
        }
        if (journalKinesisStreamDescription.getArn() != null) {
            String arn = journalKinesisStreamDescription.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (journalKinesisStreamDescription.getStatus() != null) {
            String status = journalKinesisStreamDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (journalKinesisStreamDescription.getKinesisConfiguration() != null) {
            KinesisConfiguration kinesisConfiguration = journalKinesisStreamDescription
                    .getKinesisConfiguration();
            jsonWriter.name("KinesisConfiguration");
            KinesisConfigurationJsonMarshaller.getInstance().marshall(kinesisConfiguration,
                    jsonWriter);
        }
        if (journalKinesisStreamDescription.getErrorCause() != null) {
            String errorCause = journalKinesisStreamDescription.getErrorCause();
            jsonWriter.name("ErrorCause");
            jsonWriter.value(errorCause);
        }
        if (journalKinesisStreamDescription.getStreamName() != null) {
            String streamName = journalKinesisStreamDescription.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        jsonWriter.endObject();
    }

    private static JournalKinesisStreamDescriptionJsonMarshaller instance;

    public static JournalKinesisStreamDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JournalKinesisStreamDescriptionJsonMarshaller();
        return instance;
    }
}
