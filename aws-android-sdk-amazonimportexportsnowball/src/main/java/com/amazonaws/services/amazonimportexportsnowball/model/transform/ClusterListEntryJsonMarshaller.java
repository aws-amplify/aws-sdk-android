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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClusterListEntry
 */
class ClusterListEntryJsonMarshaller {

    public void marshall(ClusterListEntry clusterListEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clusterListEntry.getClusterId() != null) {
            String clusterId = clusterListEntry.getClusterId();
            jsonWriter.name("ClusterId");
            jsonWriter.value(clusterId);
        }
        if (clusterListEntry.getClusterState() != null) {
            String clusterState = clusterListEntry.getClusterState();
            jsonWriter.name("ClusterState");
            jsonWriter.value(clusterState);
        }
        if (clusterListEntry.getCreationDate() != null) {
            java.util.Date creationDate = clusterListEntry.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (clusterListEntry.getDescription() != null) {
            String description = clusterListEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static ClusterListEntryJsonMarshaller instance;

    public static ClusterListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterListEntryJsonMarshaller();
        return instance;
    }
}
