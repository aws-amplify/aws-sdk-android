/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LastRecorderStatus
 */
class LastRecorderStatusJsonMarshaller {

    public void marshall(LastRecorderStatus lastRecorderStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lastRecorderStatus.getJobStatusDetails() != null) {
            String jobStatusDetails = lastRecorderStatus.getJobStatusDetails();
            jsonWriter.name("JobStatusDetails");
            jsonWriter.value(jobStatusDetails);
        }
        if (lastRecorderStatus.getLastCollectedTime() != null) {
            java.util.Date lastCollectedTime = lastRecorderStatus.getLastCollectedTime();
            jsonWriter.name("LastCollectedTime");
            jsonWriter.value(lastCollectedTime);
        }
        if (lastRecorderStatus.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = lastRecorderStatus.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (lastRecorderStatus.getRecorderStatus() != null) {
            String recorderStatus = lastRecorderStatus.getRecorderStatus();
            jsonWriter.name("RecorderStatus");
            jsonWriter.value(recorderStatus);
        }
        jsonWriter.endObject();
    }

    private static LastRecorderStatusJsonMarshaller instance;

    public static LastRecorderStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LastRecorderStatusJsonMarshaller();
        return instance;
    }
}
