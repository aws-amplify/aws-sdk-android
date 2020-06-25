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
 * JSON unmarshaller for POJO VolumeModification
 */
class VolumeModificationJsonUnmarshaller implements
        Unmarshaller<VolumeModification, JsonUnmarshallerContext> {

    public VolumeModification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VolumeModification volumeModification = new VolumeModification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VolumeId")) {
                volumeModification.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModificationState")) {
                volumeModification.setModificationState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                volumeModification.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetSize")) {
                volumeModification.setTargetSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetIops")) {
                volumeModification.setTargetIops(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetVolumeType")) {
                volumeModification.setTargetVolumeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginalSize")) {
                volumeModification.setOriginalSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginalIops")) {
                volumeModification.setOriginalIops(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginalVolumeType")) {
                volumeModification.setOriginalVolumeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Progress")) {
                volumeModification.setProgress(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                volumeModification.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                volumeModification.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return volumeModification;
    }

    private static VolumeModificationJsonUnmarshaller instance;

    public static VolumeModificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeModificationJsonUnmarshaller();
        return instance;
    }
}
