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
 * JSON marshaller for POJO LaunchTemplateCpuOptions
 */
class LaunchTemplateCpuOptionsJsonMarshaller {

    public void marshall(LaunchTemplateCpuOptions launchTemplateCpuOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateCpuOptions.getCoreCount() != null) {
            Integer coreCount = launchTemplateCpuOptions.getCoreCount();
            jsonWriter.name("CoreCount");
            jsonWriter.value(coreCount);
        }
        if (launchTemplateCpuOptions.getThreadsPerCore() != null) {
            Integer threadsPerCore = launchTemplateCpuOptions.getThreadsPerCore();
            jsonWriter.name("ThreadsPerCore");
            jsonWriter.value(threadsPerCore);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateCpuOptionsJsonMarshaller instance;

    public static LaunchTemplateCpuOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateCpuOptionsJsonMarshaller();
        return instance;
    }
}
