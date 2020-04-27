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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SecondaryStatusTransition
 */
class SecondaryStatusTransitionJsonMarshaller {

    public void marshall(SecondaryStatusTransition secondaryStatusTransition,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (secondaryStatusTransition.getStatus() != null) {
            String status = secondaryStatusTransition.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (secondaryStatusTransition.getStartTime() != null) {
            java.util.Date startTime = secondaryStatusTransition.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (secondaryStatusTransition.getEndTime() != null) {
            java.util.Date endTime = secondaryStatusTransition.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (secondaryStatusTransition.getStatusMessage() != null) {
            String statusMessage = secondaryStatusTransition.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        jsonWriter.endObject();
    }

    private static SecondaryStatusTransitionJsonMarshaller instance;

    public static SecondaryStatusTransitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecondaryStatusTransitionJsonMarshaller();
        return instance;
    }
}
