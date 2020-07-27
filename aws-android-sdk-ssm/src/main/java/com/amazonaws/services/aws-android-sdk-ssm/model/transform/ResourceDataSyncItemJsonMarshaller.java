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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDataSyncItem
 */
class ResourceDataSyncItemJsonMarshaller {

    public void marshall(ResourceDataSyncItem resourceDataSyncItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceDataSyncItem.getSyncName() != null) {
            String syncName = resourceDataSyncItem.getSyncName();
            jsonWriter.name("SyncName");
            jsonWriter.value(syncName);
        }
        if (resourceDataSyncItem.getSyncType() != null) {
            String syncType = resourceDataSyncItem.getSyncType();
            jsonWriter.name("SyncType");
            jsonWriter.value(syncType);
        }
        if (resourceDataSyncItem.getSyncSource() != null) {
            ResourceDataSyncSourceWithState syncSource = resourceDataSyncItem.getSyncSource();
            jsonWriter.name("SyncSource");
            ResourceDataSyncSourceWithStateJsonMarshaller.getInstance().marshall(syncSource, jsonWriter);
        }
        if (resourceDataSyncItem.getS3Destination() != null) {
            ResourceDataSyncS3Destination s3Destination = resourceDataSyncItem.getS3Destination();
            jsonWriter.name("S3Destination");
            ResourceDataSyncS3DestinationJsonMarshaller.getInstance().marshall(s3Destination, jsonWriter);
        }
        if (resourceDataSyncItem.getLastSyncTime() != null) {
            java.util.Date lastSyncTime = resourceDataSyncItem.getLastSyncTime();
            jsonWriter.name("LastSyncTime");
            jsonWriter.value(lastSyncTime);
        }
        if (resourceDataSyncItem.getLastSuccessfulSyncTime() != null) {
            java.util.Date lastSuccessfulSyncTime = resourceDataSyncItem.getLastSuccessfulSyncTime();
            jsonWriter.name("LastSuccessfulSyncTime");
            jsonWriter.value(lastSuccessfulSyncTime);
        }
        if (resourceDataSyncItem.getSyncLastModifiedTime() != null) {
            java.util.Date syncLastModifiedTime = resourceDataSyncItem.getSyncLastModifiedTime();
            jsonWriter.name("SyncLastModifiedTime");
            jsonWriter.value(syncLastModifiedTime);
        }
        if (resourceDataSyncItem.getLastStatus() != null) {
            String lastStatus = resourceDataSyncItem.getLastStatus();
            jsonWriter.name("LastStatus");
            jsonWriter.value(lastStatus);
        }
        if (resourceDataSyncItem.getSyncCreatedTime() != null) {
            java.util.Date syncCreatedTime = resourceDataSyncItem.getSyncCreatedTime();
            jsonWriter.name("SyncCreatedTime");
            jsonWriter.value(syncCreatedTime);
        }
        if (resourceDataSyncItem.getLastSyncStatusMessage() != null) {
            String lastSyncStatusMessage = resourceDataSyncItem.getLastSyncStatusMessage();
            jsonWriter.name("LastSyncStatusMessage");
            jsonWriter.value(lastSyncStatusMessage);
        }
        jsonWriter.endObject();
    }

    private static ResourceDataSyncItemJsonMarshaller instance;
    public static ResourceDataSyncItemJsonMarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncItemJsonMarshaller();
        return instance;
    }
}
