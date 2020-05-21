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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanaryLastRun
 */
class CanaryLastRunJsonMarshaller {

    public void marshall(CanaryLastRun canaryLastRun, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (canaryLastRun.getCanaryName() != null) {
            String canaryName = canaryLastRun.getCanaryName();
            jsonWriter.name("CanaryName");
            jsonWriter.value(canaryName);
        }
        if (canaryLastRun.getLastRun() != null) {
            CanaryRun lastRun = canaryLastRun.getLastRun();
            jsonWriter.name("LastRun");
            CanaryRunJsonMarshaller.getInstance().marshall(lastRun, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CanaryLastRunJsonMarshaller instance;

    public static CanaryLastRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryLastRunJsonMarshaller();
        return instance;
    }
}
