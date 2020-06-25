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
 * JSON marshaller for POJO FpgaInfo
 */
class FpgaInfoJsonMarshaller {

    public void marshall(FpgaInfo fpgaInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fpgaInfo.getFpgas() != null) {
            java.util.List<FpgaDeviceInfo> fpgas = fpgaInfo.getFpgas();
            jsonWriter.name("Fpgas");
            jsonWriter.beginArray();
            for (FpgaDeviceInfo fpgasItem : fpgas) {
                if (fpgasItem != null) {
                    FpgaDeviceInfoJsonMarshaller.getInstance().marshall(fpgasItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fpgaInfo.getTotalFpgaMemoryInMiB() != null) {
            Integer totalFpgaMemoryInMiB = fpgaInfo.getTotalFpgaMemoryInMiB();
            jsonWriter.name("TotalFpgaMemoryInMiB");
            jsonWriter.value(totalFpgaMemoryInMiB);
        }
        jsonWriter.endObject();
    }

    private static FpgaInfoJsonMarshaller instance;

    public static FpgaInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FpgaInfoJsonMarshaller();
        return instance;
    }
}
