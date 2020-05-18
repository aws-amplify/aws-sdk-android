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
 * JSON marshaller for POJO SnapshotTaskDetail
 */
class SnapshotTaskDetailJsonMarshaller {

    public void marshall(SnapshotTaskDetail snapshotTaskDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (snapshotTaskDetail.getDescription() != null) {
            String description = snapshotTaskDetail.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (snapshotTaskDetail.getDiskImageSize() != null) {
            Double diskImageSize = snapshotTaskDetail.getDiskImageSize();
            jsonWriter.name("DiskImageSize");
            jsonWriter.value(diskImageSize);
        }
        if (snapshotTaskDetail.getEncrypted() != null) {
            Boolean encrypted = snapshotTaskDetail.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (snapshotTaskDetail.getFormat() != null) {
            String format = snapshotTaskDetail.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (snapshotTaskDetail.getKmsKeyId() != null) {
            String kmsKeyId = snapshotTaskDetail.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (snapshotTaskDetail.getProgress() != null) {
            String progress = snapshotTaskDetail.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (snapshotTaskDetail.getSnapshotId() != null) {
            String snapshotId = snapshotTaskDetail.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (snapshotTaskDetail.getStatus() != null) {
            String status = snapshotTaskDetail.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (snapshotTaskDetail.getStatusMessage() != null) {
            String statusMessage = snapshotTaskDetail.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (snapshotTaskDetail.getUrl() != null) {
            String url = snapshotTaskDetail.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (snapshotTaskDetail.getUserBucket() != null) {
            UserBucketDetails userBucket = snapshotTaskDetail.getUserBucket();
            jsonWriter.name("UserBucket");
            UserBucketDetailsJsonMarshaller.getInstance().marshall(userBucket, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SnapshotTaskDetailJsonMarshaller instance;

    public static SnapshotTaskDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotTaskDetailJsonMarshaller();
        return instance;
    }
}
