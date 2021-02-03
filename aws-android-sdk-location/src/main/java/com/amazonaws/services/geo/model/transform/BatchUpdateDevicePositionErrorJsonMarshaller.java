/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchUpdateDevicePositionError
 */
class BatchUpdateDevicePositionErrorJsonMarshaller {

    public void marshall(BatchUpdateDevicePositionError batchUpdateDevicePositionError,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchUpdateDevicePositionError.getDeviceId() != null) {
            String deviceId = batchUpdateDevicePositionError.getDeviceId();
            jsonWriter.name("DeviceId");
            jsonWriter.value(deviceId);
        }
        if (batchUpdateDevicePositionError.getError() != null) {
            BatchItemError error = batchUpdateDevicePositionError.getError();
            jsonWriter.name("Error");
            BatchItemErrorJsonMarshaller.getInstance().marshall(error, jsonWriter);
        }
        if (batchUpdateDevicePositionError.getSampleTime() != null) {
            java.util.Date sampleTime = batchUpdateDevicePositionError.getSampleTime();
            jsonWriter.name("SampleTime");
            jsonWriter.value(DateUtils.formatISO8601Date(sampleTime));
        }
        jsonWriter.endObject();
    }

    private static BatchUpdateDevicePositionErrorJsonMarshaller instance;

    public static BatchUpdateDevicePositionErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchUpdateDevicePositionErrorJsonMarshaller();
        return instance;
    }
}
