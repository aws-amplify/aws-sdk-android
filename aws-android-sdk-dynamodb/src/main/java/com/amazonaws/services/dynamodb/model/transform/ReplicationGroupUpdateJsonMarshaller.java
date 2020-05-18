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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicationGroupUpdate
 */
class ReplicationGroupUpdateJsonMarshaller {

    public void marshall(ReplicationGroupUpdate replicationGroupUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicationGroupUpdate.getCreate() != null) {
            CreateReplicationGroupMemberAction create = replicationGroupUpdate.getCreate();
            jsonWriter.name("Create");
            CreateReplicationGroupMemberActionJsonMarshaller.getInstance().marshall(create,
                    jsonWriter);
        }
        if (replicationGroupUpdate.getUpdate() != null) {
            UpdateReplicationGroupMemberAction update = replicationGroupUpdate.getUpdate();
            jsonWriter.name("Update");
            UpdateReplicationGroupMemberActionJsonMarshaller.getInstance().marshall(update,
                    jsonWriter);
        }
        if (replicationGroupUpdate.getDelete() != null) {
            DeleteReplicationGroupMemberAction delete = replicationGroupUpdate.getDelete();
            jsonWriter.name("Delete");
            DeleteReplicationGroupMemberActionJsonMarshaller.getInstance().marshall(delete,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReplicationGroupUpdateJsonMarshaller instance;

    public static ReplicationGroupUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationGroupUpdateJsonMarshaller();
        return instance;
    }
}
