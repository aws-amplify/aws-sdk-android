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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResourceDataSyncS3Destination
 */
class ResourceDataSyncS3DestinationJsonUnmarshaller implements
        Unmarshaller<ResourceDataSyncS3Destination, JsonUnmarshallerContext> {

    public ResourceDataSyncS3Destination unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceDataSyncS3Destination resourceDataSyncS3Destination = new ResourceDataSyncS3Destination();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BucketName")) {
                resourceDataSyncS3Destination.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Prefix")) {
                resourceDataSyncS3Destination.setPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncFormat")) {
                resourceDataSyncS3Destination.setSyncFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                resourceDataSyncS3Destination.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AWSKMSKeyARN")) {
                resourceDataSyncS3Destination.setAWSKMSKeyARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationDataSharing")) {
                resourceDataSyncS3Destination
                        .setDestinationDataSharing(ResourceDataSyncDestinationDataSharingJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceDataSyncS3Destination;
    }

    private static ResourceDataSyncS3DestinationJsonUnmarshaller instance;

    public static ResourceDataSyncS3DestinationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDataSyncS3DestinationJsonUnmarshaller();
        return instance;
    }
}
