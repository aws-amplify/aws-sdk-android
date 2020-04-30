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
 * JSON marshaller for POJO Tape
 */
class TapeJsonMarshaller {

    public void marshall(Tape tape, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tape.getTapeARN() != null) {
            String tapeARN = tape.getTapeARN();
            jsonWriter.name("TapeARN");
            jsonWriter.value(tapeARN);
        }
        if (tape.getTapeBarcode() != null) {
            String tapeBarcode = tape.getTapeBarcode();
            jsonWriter.name("TapeBarcode");
            jsonWriter.value(tapeBarcode);
        }
        if (tape.getTapeCreatedDate() != null) {
            java.util.Date tapeCreatedDate = tape.getTapeCreatedDate();
            jsonWriter.name("TapeCreatedDate");
            jsonWriter.value(tapeCreatedDate);
        }
        if (tape.getTapeSizeInBytes() != null) {
            Long tapeSizeInBytes = tape.getTapeSizeInBytes();
            jsonWriter.name("TapeSizeInBytes");
            jsonWriter.value(tapeSizeInBytes);
        }
        if (tape.getTapeStatus() != null) {
            String tapeStatus = tape.getTapeStatus();
            jsonWriter.name("TapeStatus");
            jsonWriter.value(tapeStatus);
        }
        if (tape.getVTLDevice() != null) {
            String vTLDevice = tape.getVTLDevice();
            jsonWriter.name("VTLDevice");
            jsonWriter.value(vTLDevice);
        }
        if (tape.getProgress() != null) {
            Double progress = tape.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (tape.getTapeUsedInBytes() != null) {
            Long tapeUsedInBytes = tape.getTapeUsedInBytes();
            jsonWriter.name("TapeUsedInBytes");
            jsonWriter.value(tapeUsedInBytes);
        }
        if (tape.getKMSKey() != null) {
            String kMSKey = tape.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (tape.getPoolId() != null) {
            String poolId = tape.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        jsonWriter.endObject();
    }

    private static TapeJsonMarshaller instance;

    public static TapeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeJsonMarshaller();
        return instance;
    }
}
