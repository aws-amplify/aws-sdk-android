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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TapeRecoveryPointInfo
 */
class TapeRecoveryPointInfoJsonMarshaller {

    public void marshall(TapeRecoveryPointInfo tapeRecoveryPointInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tapeRecoveryPointInfo.getTapeARN() != null) {
            String tapeARN = tapeRecoveryPointInfo.getTapeARN();
            jsonWriter.name("TapeARN");
            jsonWriter.value(tapeARN);
        }
        if (tapeRecoveryPointInfo.getTapeRecoveryPointTime() != null) {
            java.util.Date tapeRecoveryPointTime = tapeRecoveryPointInfo.getTapeRecoveryPointTime();
            jsonWriter.name("TapeRecoveryPointTime");
            jsonWriter.value(tapeRecoveryPointTime);
        }
        if (tapeRecoveryPointInfo.getTapeSizeInBytes() != null) {
            Long tapeSizeInBytes = tapeRecoveryPointInfo.getTapeSizeInBytes();
            jsonWriter.name("TapeSizeInBytes");
            jsonWriter.value(tapeSizeInBytes);
        }
        if (tapeRecoveryPointInfo.getTapeStatus() != null) {
            String tapeStatus = tapeRecoveryPointInfo.getTapeStatus();
            jsonWriter.name("TapeStatus");
            jsonWriter.value(tapeStatus);
        }
        jsonWriter.endObject();
    }

    private static TapeRecoveryPointInfoJsonMarshaller instance;

    public static TapeRecoveryPointInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeRecoveryPointInfoJsonMarshaller();
        return instance;
    }
}
