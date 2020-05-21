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
 * JSON marshaller for POJO Volume
 */
class VolumeJsonMarshaller {

    public void marshall(Volume volume, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (volume.getAttachments() != null) {
            java.util.List<VolumeAttachment> attachments = volume.getAttachments();
            jsonWriter.name("Attachments");
            jsonWriter.beginArray();
            for (VolumeAttachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    VolumeAttachmentJsonMarshaller.getInstance().marshall(attachmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (volume.getAvailabilityZone() != null) {
            String availabilityZone = volume.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (volume.getCreateTime() != null) {
            java.util.Date createTime = volume.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (volume.getEncrypted() != null) {
            Boolean encrypted = volume.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (volume.getKmsKeyId() != null) {
            String kmsKeyId = volume.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (volume.getOutpostArn() != null) {
            String outpostArn = volume.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (volume.getSize() != null) {
            Integer size = volume.getSize();
            jsonWriter.name("Size");
            jsonWriter.value(size);
        }
        if (volume.getSnapshotId() != null) {
            String snapshotId = volume.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (volume.getState() != null) {
            String state = volume.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (volume.getVolumeId() != null) {
            String volumeId = volume.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (volume.getIops() != null) {
            Integer iops = volume.getIops();
            jsonWriter.name("Iops");
            jsonWriter.value(iops);
        }
        if (volume.getTags() != null) {
            java.util.List<Tag> tags = volume.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (volume.getVolumeType() != null) {
            String volumeType = volume.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        if (volume.getFastRestored() != null) {
            Boolean fastRestored = volume.getFastRestored();
            jsonWriter.name("FastRestored");
            jsonWriter.value(fastRestored);
        }
        if (volume.getMultiAttachEnabled() != null) {
            Boolean multiAttachEnabled = volume.getMultiAttachEnabled();
            jsonWriter.name("MultiAttachEnabled");
            jsonWriter.value(multiAttachEnabled);
        }
        jsonWriter.endObject();
    }

    private static VolumeJsonMarshaller instance;

    public static VolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeJsonMarshaller();
        return instance;
    }
}
