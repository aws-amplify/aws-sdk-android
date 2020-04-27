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
 * JSON marshaller for POJO ReplicationInstanceTaskLog
 */
class ReplicationInstanceTaskLogJsonMarshaller {

    public void marshall(ReplicationInstanceTaskLog replicationInstanceTaskLog,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicationInstanceTaskLog.getReplicationTaskName() != null) {
            String replicationTaskName = replicationInstanceTaskLog.getReplicationTaskName();
            jsonWriter.name("ReplicationTaskName");
            jsonWriter.value(replicationTaskName);
        }
        if (replicationInstanceTaskLog.getReplicationTaskArn() != null) {
            String replicationTaskArn = replicationInstanceTaskLog.getReplicationTaskArn();
            jsonWriter.name("ReplicationTaskArn");
            jsonWriter.value(replicationTaskArn);
        }
        if (replicationInstanceTaskLog.getReplicationInstanceTaskLogSize() != null) {
            Long replicationInstanceTaskLogSize = replicationInstanceTaskLog
                    .getReplicationInstanceTaskLogSize();
            jsonWriter.name("ReplicationInstanceTaskLogSize");
            jsonWriter.value(replicationInstanceTaskLogSize);
        }
        jsonWriter.endObject();
    }

    private static ReplicationInstanceTaskLogJsonMarshaller instance;

    public static ReplicationInstanceTaskLogJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationInstanceTaskLogJsonMarshaller();
        return instance;
    }
}
