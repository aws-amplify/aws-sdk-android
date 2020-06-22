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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CancelStepsInfo
 */
class CancelStepsInfoJsonMarshaller {

    public void marshall(CancelStepsInfo cancelStepsInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cancelStepsInfo.getStepId() != null) {
            String stepId = cancelStepsInfo.getStepId();
            jsonWriter.name("StepId");
            jsonWriter.value(stepId);
        }
        if (cancelStepsInfo.getStatus() != null) {
            String status = cancelStepsInfo.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (cancelStepsInfo.getReason() != null) {
            String reason = cancelStepsInfo.getReason();
            jsonWriter.name("Reason");
            jsonWriter.value(reason);
        }
        jsonWriter.endObject();
    }

    private static CancelStepsInfoJsonMarshaller instance;

    public static CancelStepsInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CancelStepsInfoJsonMarshaller();
        return instance;
    }
}
