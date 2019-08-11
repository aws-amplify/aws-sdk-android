/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EnableIoTLoggingParams
 */
class EnableIoTLoggingParamsJsonMarshaller {

    public void marshall(EnableIoTLoggingParams enableIoTLoggingParams, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (enableIoTLoggingParams.getRoleArnForLogging() != null) {
            String roleArnForLogging = enableIoTLoggingParams.getRoleArnForLogging();
            jsonWriter.name("roleArnForLogging");
            jsonWriter.value(roleArnForLogging);
        }
        if (enableIoTLoggingParams.getLogLevel() != null) {
            String logLevel = enableIoTLoggingParams.getLogLevel();
            jsonWriter.name("logLevel");
            jsonWriter.value(logLevel);
        }
        jsonWriter.endObject();
    }

    private static EnableIoTLoggingParamsJsonMarshaller instance;

    public static EnableIoTLoggingParamsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnableIoTLoggingParamsJsonMarshaller();
        return instance;
    }
}
