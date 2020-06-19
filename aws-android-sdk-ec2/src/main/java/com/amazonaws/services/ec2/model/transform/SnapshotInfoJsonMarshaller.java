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
 * JSON marshaller for POJO SnapshotInfo
 */
class SnapshotInfoJsonMarshaller {

    public void marshall(SnapshotInfo snapshotInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (snapshotInfo.getDescription() != null) {
            String description = snapshotInfo.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (snapshotInfo.getTags() != null) {
            java.util.List<Tag> tags = snapshotInfo.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (snapshotInfo.getEncrypted() != null) {
            Boolean encrypted = snapshotInfo.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (snapshotInfo.getVolumeId() != null) {
            String volumeId = snapshotInfo.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (snapshotInfo.getState() != null) {
            String state = snapshotInfo.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (snapshotInfo.getVolumeSize() != null) {
            Integer volumeSize = snapshotInfo.getVolumeSize();
            jsonWriter.name("VolumeSize");
            jsonWriter.value(volumeSize);
        }
        if (snapshotInfo.getStartTime() != null) {
            java.util.Date startTime = snapshotInfo.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (snapshotInfo.getProgress() != null) {
            String progress = snapshotInfo.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (snapshotInfo.getOwnerId() != null) {
            String ownerId = snapshotInfo.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (snapshotInfo.getSnapshotId() != null) {
            String snapshotId = snapshotInfo.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        jsonWriter.endObject();
    }

    private static SnapshotInfoJsonMarshaller instance;

    public static SnapshotInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotInfoJsonMarshaller();
        return instance;
    }
}
