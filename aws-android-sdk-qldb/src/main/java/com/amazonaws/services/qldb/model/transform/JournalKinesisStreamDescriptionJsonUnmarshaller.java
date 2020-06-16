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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JournalKinesisStreamDescription
 */
class JournalKinesisStreamDescriptionJsonUnmarshaller implements
        Unmarshaller<JournalKinesisStreamDescription, JsonUnmarshallerContext> {

    public JournalKinesisStreamDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JournalKinesisStreamDescription journalKinesisStreamDescription = new JournalKinesisStreamDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LedgerName")) {
                journalKinesisStreamDescription.setLedgerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                journalKinesisStreamDescription.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InclusiveStartTime")) {
                journalKinesisStreamDescription.setInclusiveStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExclusiveEndTime")) {
                journalKinesisStreamDescription.setExclusiveEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                journalKinesisStreamDescription.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamId")) {
                journalKinesisStreamDescription.setStreamId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                journalKinesisStreamDescription.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                journalKinesisStreamDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KinesisConfiguration")) {
                journalKinesisStreamDescription
                        .setKinesisConfiguration(KinesisConfigurationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ErrorCause")) {
                journalKinesisStreamDescription.setErrorCause(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamName")) {
                journalKinesisStreamDescription.setStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return journalKinesisStreamDescription;
    }

    private static JournalKinesisStreamDescriptionJsonUnmarshaller instance;

    public static JournalKinesisStreamDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JournalKinesisStreamDescriptionJsonUnmarshaller();
        return instance;
    }
}
