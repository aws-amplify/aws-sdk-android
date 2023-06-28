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
 * JSON marshaller for POJO LastUploaderStatus
 */
class LastUploaderStatusJsonMarshaller {

    public void marshall(LastUploaderStatus lastUploaderStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lastUploaderStatus.getJobStatusDetails() != null) {
            String jobStatusDetails = lastUploaderStatus.getJobStatusDetails();
            jsonWriter.name("JobStatusDetails");
            jsonWriter.value(jobStatusDetails);
        }
        if (lastUploaderStatus.getLastCollectedTime() != null) {
            java.util.Date lastCollectedTime = lastUploaderStatus.getLastCollectedTime();
            jsonWriter.name("LastCollectedTime");
            jsonWriter.value(lastCollectedTime);
        }
        if (lastUploaderStatus.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = lastUploaderStatus.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (lastUploaderStatus.getUploaderStatus() != null) {
            String uploaderStatus = lastUploaderStatus.getUploaderStatus();
            jsonWriter.name("UploaderStatus");
            jsonWriter.value(uploaderStatus);
        }
        jsonWriter.endObject();
    }

    private static LastUploaderStatusJsonMarshaller instance;

    public static LastUploaderStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LastUploaderStatusJsonMarshaller();
        return instance;
    }
}
