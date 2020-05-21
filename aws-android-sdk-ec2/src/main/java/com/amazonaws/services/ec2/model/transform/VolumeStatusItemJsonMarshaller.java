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
 * JSON marshaller for POJO VolumeStatusItem
 */
class VolumeStatusItemJsonMarshaller {

    public void marshall(VolumeStatusItem volumeStatusItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeStatusItem.getActions() != null) {
            java.util.List<VolumeStatusAction> actions = volumeStatusItem.getActions();
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (VolumeStatusAction actionsItem : actions) {
                if (actionsItem != null) {
                    VolumeStatusActionJsonMarshaller.getInstance()
                            .marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (volumeStatusItem.getAvailabilityZone() != null) {
            String availabilityZone = volumeStatusItem.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (volumeStatusItem.getOutpostArn() != null) {
            String outpostArn = volumeStatusItem.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (volumeStatusItem.getEvents() != null) {
            java.util.List<VolumeStatusEvent> events = volumeStatusItem.getEvents();
            jsonWriter.name("Events");
            jsonWriter.beginArray();
            for (VolumeStatusEvent eventsItem : events) {
                if (eventsItem != null) {
                    VolumeStatusEventJsonMarshaller.getInstance().marshall(eventsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (volumeStatusItem.getVolumeId() != null) {
            String volumeId = volumeStatusItem.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (volumeStatusItem.getVolumeStatus() != null) {
            VolumeStatusInfo volumeStatus = volumeStatusItem.getVolumeStatus();
            jsonWriter.name("VolumeStatus");
            VolumeStatusInfoJsonMarshaller.getInstance().marshall(volumeStatus, jsonWriter);
        }
        if (volumeStatusItem.getAttachmentStatuses() != null) {
            java.util.List<VolumeStatusAttachmentStatus> attachmentStatuses = volumeStatusItem
                    .getAttachmentStatuses();
            jsonWriter.name("AttachmentStatuses");
            jsonWriter.beginArray();
            for (VolumeStatusAttachmentStatus attachmentStatusesItem : attachmentStatuses) {
                if (attachmentStatusesItem != null) {
                    VolumeStatusAttachmentStatusJsonMarshaller.getInstance().marshall(
                            attachmentStatusesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VolumeStatusItemJsonMarshaller instance;

    public static VolumeStatusItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusItemJsonMarshaller();
        return instance;
    }
}
