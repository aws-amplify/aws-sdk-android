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
 * JSON marshaller for POJO LabelCounters
 */
class LabelCountersJsonMarshaller {

    public void marshall(LabelCounters labelCounters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelCounters.getTotalLabeled() != null) {
            Integer totalLabeled = labelCounters.getTotalLabeled();
            jsonWriter.name("TotalLabeled");
            jsonWriter.value(totalLabeled);
        }
        if (labelCounters.getHumanLabeled() != null) {
            Integer humanLabeled = labelCounters.getHumanLabeled();
            jsonWriter.name("HumanLabeled");
            jsonWriter.value(humanLabeled);
        }
        if (labelCounters.getMachineLabeled() != null) {
            Integer machineLabeled = labelCounters.getMachineLabeled();
            jsonWriter.name("MachineLabeled");
            jsonWriter.value(machineLabeled);
        }
        if (labelCounters.getFailedNonRetryableError() != null) {
            Integer failedNonRetryableError = labelCounters.getFailedNonRetryableError();
            jsonWriter.name("FailedNonRetryableError");
            jsonWriter.value(failedNonRetryableError);
        }
        if (labelCounters.getUnlabeled() != null) {
            Integer unlabeled = labelCounters.getUnlabeled();
            jsonWriter.name("Unlabeled");
            jsonWriter.value(unlabeled);
        }
        jsonWriter.endObject();
    }

    private static LabelCountersJsonMarshaller instance;

    public static LabelCountersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelCountersJsonMarshaller();
        return instance;
    }
}
