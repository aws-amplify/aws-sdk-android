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
 * JSON marshaller for POJO SnapshotDetail
 */
class SnapshotDetailJsonMarshaller {

    public void marshall(SnapshotDetail snapshotDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (snapshotDetail.getDescription() != null) {
            String description = snapshotDetail.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (snapshotDetail.getDeviceName() != null) {
            String deviceName = snapshotDetail.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (snapshotDetail.getDiskImageSize() != null) {
            Double diskImageSize = snapshotDetail.getDiskImageSize();
            jsonWriter.name("DiskImageSize");
            jsonWriter.value(diskImageSize);
        }
        if (snapshotDetail.getFormat() != null) {
            String format = snapshotDetail.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (snapshotDetail.getProgress() != null) {
            String progress = snapshotDetail.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (snapshotDetail.getSnapshotId() != null) {
            String snapshotId = snapshotDetail.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (snapshotDetail.getStatus() != null) {
            String status = snapshotDetail.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (snapshotDetail.getStatusMessage() != null) {
            String statusMessage = snapshotDetail.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (snapshotDetail.getUrl() != null) {
            String url = snapshotDetail.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (snapshotDetail.getUserBucket() != null) {
            UserBucketDetails userBucket = snapshotDetail.getUserBucket();
            jsonWriter.name("UserBucket");
            UserBucketDetailsJsonMarshaller.getInstance().marshall(userBucket, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SnapshotDetailJsonMarshaller instance;

    public static SnapshotDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotDetailJsonMarshaller();
        return instance;
    }
}
