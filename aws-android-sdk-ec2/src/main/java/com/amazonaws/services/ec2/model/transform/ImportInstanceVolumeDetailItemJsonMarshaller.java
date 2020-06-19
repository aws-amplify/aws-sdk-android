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
 * JSON marshaller for POJO ImportInstanceVolumeDetailItem
 */
class ImportInstanceVolumeDetailItemJsonMarshaller {

    public void marshall(ImportInstanceVolumeDetailItem importInstanceVolumeDetailItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importInstanceVolumeDetailItem.getAvailabilityZone() != null) {
            String availabilityZone = importInstanceVolumeDetailItem.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (importInstanceVolumeDetailItem.getBytesConverted() != null) {
            Long bytesConverted = importInstanceVolumeDetailItem.getBytesConverted();
            jsonWriter.name("BytesConverted");
            jsonWriter.value(bytesConverted);
        }
        if (importInstanceVolumeDetailItem.getDescription() != null) {
            String description = importInstanceVolumeDetailItem.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (importInstanceVolumeDetailItem.getImage() != null) {
            DiskImageDescription image = importInstanceVolumeDetailItem.getImage();
            jsonWriter.name("Image");
            DiskImageDescriptionJsonMarshaller.getInstance().marshall(image, jsonWriter);
        }
        if (importInstanceVolumeDetailItem.getStatus() != null) {
            String status = importInstanceVolumeDetailItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (importInstanceVolumeDetailItem.getStatusMessage() != null) {
            String statusMessage = importInstanceVolumeDetailItem.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (importInstanceVolumeDetailItem.getVolume() != null) {
            DiskImageVolumeDescription volume = importInstanceVolumeDetailItem.getVolume();
            jsonWriter.name("Volume");
            DiskImageVolumeDescriptionJsonMarshaller.getInstance().marshall(volume, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ImportInstanceVolumeDetailItemJsonMarshaller instance;

    public static ImportInstanceVolumeDetailItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstanceVolumeDetailItemJsonMarshaller();
        return instance;
    }
}
