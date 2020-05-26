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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VolumeStatusItem
 */
class VolumeStatusItemJsonUnmarshaller implements
        Unmarshaller<VolumeStatusItem, JsonUnmarshallerContext> {

    public VolumeStatusItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VolumeStatusItem volumeStatusItem = new VolumeStatusItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Actions")) {
                volumeStatusItem.setActions(new ListUnmarshaller<VolumeStatusAction>(
                        VolumeStatusActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                volumeStatusItem.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                volumeStatusItem.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Events")) {
                volumeStatusItem.setEvents(new ListUnmarshaller<VolumeStatusEvent>(
                        VolumeStatusEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VolumeId")) {
                volumeStatusItem.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeStatus")) {
                volumeStatusItem.setVolumeStatus(VolumeStatusInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttachmentStatuses")) {
                volumeStatusItem
                        .setAttachmentStatuses(new ListUnmarshaller<VolumeStatusAttachmentStatus>(
                                VolumeStatusAttachmentStatusJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return volumeStatusItem;
    }

    private static VolumeStatusItemJsonUnmarshaller instance;

    public static VolumeStatusItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusItemJsonUnmarshaller();
        return instance;
    }
}
