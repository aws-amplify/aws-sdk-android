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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EC2ResourceUtilization
 */
class EC2ResourceUtilizationJsonMarshaller {

    public void marshall(EC2ResourceUtilization eC2ResourceUtilization, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eC2ResourceUtilization.getMaxCpuUtilizationPercentage() != null) {
            String maxCpuUtilizationPercentage = eC2ResourceUtilization
                    .getMaxCpuUtilizationPercentage();
            jsonWriter.name("MaxCpuUtilizationPercentage");
            jsonWriter.value(maxCpuUtilizationPercentage);
        }
        if (eC2ResourceUtilization.getMaxMemoryUtilizationPercentage() != null) {
            String maxMemoryUtilizationPercentage = eC2ResourceUtilization
                    .getMaxMemoryUtilizationPercentage();
            jsonWriter.name("MaxMemoryUtilizationPercentage");
            jsonWriter.value(maxMemoryUtilizationPercentage);
        }
        if (eC2ResourceUtilization.getMaxStorageUtilizationPercentage() != null) {
            String maxStorageUtilizationPercentage = eC2ResourceUtilization
                    .getMaxStorageUtilizationPercentage();
            jsonWriter.name("MaxStorageUtilizationPercentage");
            jsonWriter.value(maxStorageUtilizationPercentage);
        }
        jsonWriter.endObject();
    }

    private static EC2ResourceUtilizationJsonMarshaller instance;

    public static EC2ResourceUtilizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2ResourceUtilizationJsonMarshaller();
        return instance;
    }
}
