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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoggingOptions
 */
class LoggingOptionsJsonMarshaller {

    public void marshall(LoggingOptions loggingOptions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loggingOptions.getRoleArn() != null) {
            String roleArn = loggingOptions.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (loggingOptions.getLevel() != null) {
            String level = loggingOptions.getLevel();
            jsonWriter.name("level");
            jsonWriter.value(level);
        }
        if (loggingOptions.getEnabled() != null) {
            Boolean enabled = loggingOptions.getEnabled();
            jsonWriter.name("enabled");
            jsonWriter.value(enabled);
        }
        if (loggingOptions.getDetectorDebugOptions() != null) {
            java.util.List<DetectorDebugOption> detectorDebugOptions = loggingOptions
                    .getDetectorDebugOptions();
            jsonWriter.name("detectorDebugOptions");
            jsonWriter.beginArray();
            for (DetectorDebugOption detectorDebugOptionsItem : detectorDebugOptions) {
                if (detectorDebugOptionsItem != null) {
                    DetectorDebugOptionJsonMarshaller.getInstance().marshall(
                            detectorDebugOptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LoggingOptionsJsonMarshaller instance;

    public static LoggingOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoggingOptionsJsonMarshaller();
        return instance;
    }
}
