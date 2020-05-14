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
 * JSON marshaller for POJO VCpuInfo
 */
class VCpuInfoJsonMarshaller {

    public void marshall(VCpuInfo vCpuInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vCpuInfo.getDefaultVCpus() != null) {
            Integer defaultVCpus = vCpuInfo.getDefaultVCpus();
            jsonWriter.name("DefaultVCpus");
            jsonWriter.value(defaultVCpus);
        }
        if (vCpuInfo.getDefaultCores() != null) {
            Integer defaultCores = vCpuInfo.getDefaultCores();
            jsonWriter.name("DefaultCores");
            jsonWriter.value(defaultCores);
        }
        if (vCpuInfo.getDefaultThreadsPerCore() != null) {
            Integer defaultThreadsPerCore = vCpuInfo.getDefaultThreadsPerCore();
            jsonWriter.name("DefaultThreadsPerCore");
            jsonWriter.value(defaultThreadsPerCore);
        }
        if (vCpuInfo.getValidCores() != null) {
            java.util.List<Integer> validCores = vCpuInfo.getValidCores();
            jsonWriter.name("ValidCores");
            jsonWriter.beginArray();
            for (Integer validCoresItem : validCores) {
                if (validCoresItem != null) {
                    jsonWriter.value(validCoresItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vCpuInfo.getValidThreadsPerCore() != null) {
            java.util.List<Integer> validThreadsPerCore = vCpuInfo.getValidThreadsPerCore();
            jsonWriter.name("ValidThreadsPerCore");
            jsonWriter.beginArray();
            for (Integer validThreadsPerCoreItem : validThreadsPerCore) {
                if (validThreadsPerCoreItem != null) {
                    jsonWriter.value(validThreadsPerCoreItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VCpuInfoJsonMarshaller instance;

    public static VCpuInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VCpuInfoJsonMarshaller();
        return instance;
    }
}
