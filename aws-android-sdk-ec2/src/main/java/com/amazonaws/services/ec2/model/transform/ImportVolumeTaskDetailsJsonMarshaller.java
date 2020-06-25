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
 * JSON marshaller for POJO ImportVolumeTaskDetails
 */
class ImportVolumeTaskDetailsJsonMarshaller {

    public void marshall(ImportVolumeTaskDetails importVolumeTaskDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (importVolumeTaskDetails.getAvailabilityZone() != null) {
            String availabilityZone = importVolumeTaskDetails.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (importVolumeTaskDetails.getBytesConverted() != null) {
            Long bytesConverted = importVolumeTaskDetails.getBytesConverted();
            jsonWriter.name("BytesConverted");
            jsonWriter.value(bytesConverted);
        }
        if (importVolumeTaskDetails.getDescription() != null) {
            String description = importVolumeTaskDetails.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (importVolumeTaskDetails.getImage() != null) {
            DiskImageDescription image = importVolumeTaskDetails.getImage();
            jsonWriter.name("Image");
            DiskImageDescriptionJsonMarshaller.getInstance().marshall(image, jsonWriter);
        }
        if (importVolumeTaskDetails.getVolume() != null) {
            DiskImageVolumeDescription volume = importVolumeTaskDetails.getVolume();
            jsonWriter.name("Volume");
            DiskImageVolumeDescriptionJsonMarshaller.getInstance().marshall(volume, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ImportVolumeTaskDetailsJsonMarshaller instance;

    public static ImportVolumeTaskDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportVolumeTaskDetailsJsonMarshaller();
        return instance;
    }
}
