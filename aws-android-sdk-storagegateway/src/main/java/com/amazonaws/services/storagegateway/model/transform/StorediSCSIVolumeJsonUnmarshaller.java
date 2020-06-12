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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StorediSCSIVolume
 */
class StorediSCSIVolumeJsonUnmarshaller implements
        Unmarshaller<StorediSCSIVolume, JsonUnmarshallerContext> {

    public StorediSCSIVolume unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StorediSCSIVolume storediSCSIVolume = new StorediSCSIVolume();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VolumeARN")) {
                storediSCSIVolume.setVolumeARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeId")) {
                storediSCSIVolume.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeType")) {
                storediSCSIVolume.setVolumeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeStatus")) {
                storediSCSIVolume.setVolumeStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeAttachmentStatus")) {
                storediSCSIVolume.setVolumeAttachmentStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeSizeInBytes")) {
                storediSCSIVolume.setVolumeSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeProgress")) {
                storediSCSIVolume.setVolumeProgress(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeDiskId")) {
                storediSCSIVolume.setVolumeDiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceSnapshotId")) {
                storediSCSIVolume.setSourceSnapshotId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreservedExistingData")) {
                storediSCSIVolume.setPreservedExistingData(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeiSCSIAttributes")) {
                storediSCSIVolume.setVolumeiSCSIAttributes(VolumeiSCSIAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                storediSCSIVolume.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeUsedInBytes")) {
                storediSCSIVolume.setVolumeUsedInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSKey")) {
                storediSCSIVolume.setKMSKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetName")) {
                storediSCSIVolume.setTargetName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return storediSCSIVolume;
    }

    private static StorediSCSIVolumeJsonUnmarshaller instance;

    public static StorediSCSIVolumeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorediSCSIVolumeJsonUnmarshaller();
        return instance;
    }
}
