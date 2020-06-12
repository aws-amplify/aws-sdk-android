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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TapeInfo
 */
class TapeInfoJsonMarshaller {

    public void marshall(TapeInfo tapeInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tapeInfo.getTapeARN() != null) {
            String tapeARN = tapeInfo.getTapeARN();
            jsonWriter.name("TapeARN");
            jsonWriter.value(tapeARN);
        }
        if (tapeInfo.getTapeBarcode() != null) {
            String tapeBarcode = tapeInfo.getTapeBarcode();
            jsonWriter.name("TapeBarcode");
            jsonWriter.value(tapeBarcode);
        }
        if (tapeInfo.getTapeSizeInBytes() != null) {
            Long tapeSizeInBytes = tapeInfo.getTapeSizeInBytes();
            jsonWriter.name("TapeSizeInBytes");
            jsonWriter.value(tapeSizeInBytes);
        }
        if (tapeInfo.getTapeStatus() != null) {
            String tapeStatus = tapeInfo.getTapeStatus();
            jsonWriter.name("TapeStatus");
            jsonWriter.value(tapeStatus);
        }
        if (tapeInfo.getGatewayARN() != null) {
            String gatewayARN = tapeInfo.getGatewayARN();
            jsonWriter.name("GatewayARN");
            jsonWriter.value(gatewayARN);
        }
        if (tapeInfo.getPoolId() != null) {
            String poolId = tapeInfo.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        jsonWriter.endObject();
    }

    private static TapeInfoJsonMarshaller instance;

    public static TapeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeInfoJsonMarshaller();
        return instance;
    }
}
