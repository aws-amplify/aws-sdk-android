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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageDiskContainer
 */
class ImageDiskContainerJsonMarshaller {

    public void marshall(ImageDiskContainer imageDiskContainer, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (imageDiskContainer.getDescription() != null) {
            String description = imageDiskContainer.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (imageDiskContainer.getDeviceName() != null) {
            String deviceName = imageDiskContainer.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (imageDiskContainer.getFormat() != null) {
            String format = imageDiskContainer.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (imageDiskContainer.getSnapshotId() != null) {
            String snapshotId = imageDiskContainer.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (imageDiskContainer.getUrl() != null) {
            String url = imageDiskContainer.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (imageDiskContainer.getUserBucket() != null) {
            UserBucket userBucket = imageDiskContainer.getUserBucket();
            jsonWriter.name("UserBucket");
            UserBucketJsonMarshaller.getInstance().marshall(userBucket, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ImageDiskContainerJsonMarshaller instance;

    public static ImageDiskContainerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageDiskContainerJsonMarshaller();
        return instance;
    }
}
