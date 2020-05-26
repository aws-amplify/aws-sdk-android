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
 * JSON marshaller for POJO Snapshot
 */
class SnapshotJsonMarshaller {

    public void marshall(Snapshot snapshot, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (snapshot.getDataEncryptionKeyId() != null) {
            String dataEncryptionKeyId = snapshot.getDataEncryptionKeyId();
            jsonWriter.name("DataEncryptionKeyId");
            jsonWriter.value(dataEncryptionKeyId);
        }
        if (snapshot.getDescription() != null) {
            String description = snapshot.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (snapshot.getEncrypted() != null) {
            Boolean encrypted = snapshot.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (snapshot.getKmsKeyId() != null) {
            String kmsKeyId = snapshot.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (snapshot.getOwnerId() != null) {
            String ownerId = snapshot.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (snapshot.getProgress() != null) {
            String progress = snapshot.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (snapshot.getSnapshotId() != null) {
            String snapshotId = snapshot.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (snapshot.getStartTime() != null) {
            java.util.Date startTime = snapshot.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (snapshot.getState() != null) {
            String state = snapshot.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (snapshot.getStateMessage() != null) {
            String stateMessage = snapshot.getStateMessage();
            jsonWriter.name("StateMessage");
            jsonWriter.value(stateMessage);
        }
        if (snapshot.getVolumeId() != null) {
            String volumeId = snapshot.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (snapshot.getVolumeSize() != null) {
            Integer volumeSize = snapshot.getVolumeSize();
            jsonWriter.name("VolumeSize");
            jsonWriter.value(volumeSize);
        }
        if (snapshot.getOwnerAlias() != null) {
            String ownerAlias = snapshot.getOwnerAlias();
            jsonWriter.name("OwnerAlias");
            jsonWriter.value(ownerAlias);
        }
        if (snapshot.getTags() != null) {
            java.util.List<Tag> tags = snapshot.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SnapshotJsonMarshaller instance;

    public static SnapshotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotJsonMarshaller();
        return instance;
    }
}
