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
 * JSON unmarshaller for POJO CachediSCSIVolume
 */
class CachediSCSIVolumeJsonUnmarshaller implements
        Unmarshaller<CachediSCSIVolume, JsonUnmarshallerContext> {

    public CachediSCSIVolume unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CachediSCSIVolume cachediSCSIVolume = new CachediSCSIVolume();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VolumeARN")) {
                cachediSCSIVolume.setVolumeARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeId")) {
                cachediSCSIVolume.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeType")) {
                cachediSCSIVolume.setVolumeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeStatus")) {
                cachediSCSIVolume.setVolumeStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeAttachmentStatus")) {
                cachediSCSIVolume.setVolumeAttachmentStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeSizeInBytes")) {
                cachediSCSIVolume.setVolumeSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeProgress")) {
                cachediSCSIVolume.setVolumeProgress(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceSnapshotId")) {
                cachediSCSIVolume.setSourceSnapshotId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeiSCSIAttributes")) {
                cachediSCSIVolume.setVolumeiSCSIAttributes(VolumeiSCSIAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                cachediSCSIVolume.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeUsedInBytes")) {
                cachediSCSIVolume.setVolumeUsedInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSKey")) {
                cachediSCSIVolume.setKMSKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetName")) {
                cachediSCSIVolume.setTargetName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cachediSCSIVolume;
    }

    private static CachediSCSIVolumeJsonUnmarshaller instance;

    public static CachediSCSIVolumeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CachediSCSIVolumeJsonUnmarshaller();
        return instance;
    }
}
