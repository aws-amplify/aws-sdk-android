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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RefreshSchemasStatus
 */
class RefreshSchemasStatusJsonMarshaller {

    public void marshall(RefreshSchemasStatus refreshSchemasStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (refreshSchemasStatus.getEndpointArn() != null) {
            String endpointArn = refreshSchemasStatus.getEndpointArn();
            jsonWriter.name("EndpointArn");
            jsonWriter.value(endpointArn);
        }
        if (refreshSchemasStatus.getReplicationInstanceArn() != null) {
            String replicationInstanceArn = refreshSchemasStatus.getReplicationInstanceArn();
            jsonWriter.name("ReplicationInstanceArn");
            jsonWriter.value(replicationInstanceArn);
        }
        if (refreshSchemasStatus.getStatus() != null) {
            String status = refreshSchemasStatus.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (refreshSchemasStatus.getLastRefreshDate() != null) {
            java.util.Date lastRefreshDate = refreshSchemasStatus.getLastRefreshDate();
            jsonWriter.name("LastRefreshDate");
            jsonWriter.value(lastRefreshDate);
        }
        if (refreshSchemasStatus.getLastFailureMessage() != null) {
            String lastFailureMessage = refreshSchemasStatus.getLastFailureMessage();
            jsonWriter.name("LastFailureMessage");
            jsonWriter.value(lastFailureMessage);
        }
        jsonWriter.endObject();
    }

    private static RefreshSchemasStatusJsonMarshaller instance;

    public static RefreshSchemasStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RefreshSchemasStatusJsonMarshaller();
        return instance;
    }
}
