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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO ResourceDataSyncItem
 */
class ResourceDataSyncItemJsonUnmarshaller implements Unmarshaller<ResourceDataSyncItem, JsonUnmarshallerContext> {

    public ResourceDataSyncItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceDataSyncItem resourceDataSyncItem = new ResourceDataSyncItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SyncName")) {
                resourceDataSyncItem.setSyncName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SyncType")) {
                resourceDataSyncItem.setSyncType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SyncSource")) {
                resourceDataSyncItem.setSyncSource(ResourceDataSyncSourceWithStateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("S3Destination")) {
                resourceDataSyncItem.setS3Destination(ResourceDataSyncS3DestinationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastSyncTime")) {
                resourceDataSyncItem.setLastSyncTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastSuccessfulSyncTime")) {
                resourceDataSyncItem.setLastSuccessfulSyncTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SyncLastModifiedTime")) {
                resourceDataSyncItem.setSyncLastModifiedTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastStatus")) {
                resourceDataSyncItem.setLastStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SyncCreatedTime")) {
                resourceDataSyncItem.setSyncCreatedTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastSyncStatusMessage")) {
                resourceDataSyncItem.setLastSyncStatusMessage(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceDataSyncItem;
    }

    private static ResourceDataSyncItemJsonUnmarshaller instance;
    public static ResourceDataSyncItemJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncItemJsonUnmarshaller();
        return instance;
    }
}
