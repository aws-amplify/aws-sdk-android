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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicationDetails
 */
class ReplicationDetailsJsonMarshaller {

    public void marshall(ReplicationDetails replicationDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicationDetails.getReplicated() != null) {
            Boolean replicated = replicationDetails.getReplicated();
            jsonWriter.name("replicated");
            jsonWriter.value(replicated);
        }
        if (replicationDetails.getReplicatedExternally() != null) {
            Boolean replicatedExternally = replicationDetails.getReplicatedExternally();
            jsonWriter.name("replicatedExternally");
            jsonWriter.value(replicatedExternally);
        }
        if (replicationDetails.getReplicationAccounts() != null) {
            java.util.List<String> replicationAccounts = replicationDetails
                    .getReplicationAccounts();
            jsonWriter.name("replicationAccounts");
            jsonWriter.beginArray();
            for (String replicationAccountsItem : replicationAccounts) {
                if (replicationAccountsItem != null) {
                    jsonWriter.value(replicationAccountsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReplicationDetailsJsonMarshaller instance;

    public static ReplicationDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationDetailsJsonMarshaller();
        return instance;
    }
}
