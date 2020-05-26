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
 * JSON marshaller for POJO VolumeStatusInfo
 */
class VolumeStatusInfoJsonMarshaller {

    public void marshall(VolumeStatusInfo volumeStatusInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeStatusInfo.getDetails() != null) {
            java.util.List<VolumeStatusDetails> details = volumeStatusInfo.getDetails();
            jsonWriter.name("Details");
            jsonWriter.beginArray();
            for (VolumeStatusDetails detailsItem : details) {
                if (detailsItem != null) {
                    VolumeStatusDetailsJsonMarshaller.getInstance().marshall(detailsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (volumeStatusInfo.getStatus() != null) {
            String status = volumeStatusInfo.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static VolumeStatusInfoJsonMarshaller instance;

    public static VolumeStatusInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusInfoJsonMarshaller();
        return instance;
    }
}
