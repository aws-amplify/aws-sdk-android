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
 * JSON marshaller for POJO JobProcessDetails
 */
class JobProcessDetailsJsonMarshaller {

    public void marshall(JobProcessDetails jobProcessDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobProcessDetails.getProcessingTargets() != null) {
            java.util.List<String> processingTargets = jobProcessDetails.getProcessingTargets();
            jsonWriter.name("processingTargets");
            jsonWriter.beginArray();
            for (String processingTargetsItem : processingTargets) {
                if (processingTargetsItem != null) {
                    jsonWriter.value(processingTargetsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (jobProcessDetails.getNumberOfCanceledThings() != null) {
            Integer numberOfCanceledThings = jobProcessDetails.getNumberOfCanceledThings();
            jsonWriter.name("numberOfCanceledThings");
            jsonWriter.value(numberOfCanceledThings);
        }
        if (jobProcessDetails.getNumberOfSucceededThings() != null) {
            Integer numberOfSucceededThings = jobProcessDetails.getNumberOfSucceededThings();
            jsonWriter.name("numberOfSucceededThings");
            jsonWriter.value(numberOfSucceededThings);
        }
        if (jobProcessDetails.getNumberOfFailedThings() != null) {
            Integer numberOfFailedThings = jobProcessDetails.getNumberOfFailedThings();
            jsonWriter.name("numberOfFailedThings");
            jsonWriter.value(numberOfFailedThings);
        }
        if (jobProcessDetails.getNumberOfRejectedThings() != null) {
            Integer numberOfRejectedThings = jobProcessDetails.getNumberOfRejectedThings();
            jsonWriter.name("numberOfRejectedThings");
            jsonWriter.value(numberOfRejectedThings);
        }
        if (jobProcessDetails.getNumberOfQueuedThings() != null) {
            Integer numberOfQueuedThings = jobProcessDetails.getNumberOfQueuedThings();
            jsonWriter.name("numberOfQueuedThings");
            jsonWriter.value(numberOfQueuedThings);
        }
        if (jobProcessDetails.getNumberOfInProgressThings() != null) {
            Integer numberOfInProgressThings = jobProcessDetails.getNumberOfInProgressThings();
            jsonWriter.name("numberOfInProgressThings");
            jsonWriter.value(numberOfInProgressThings);
        }
        if (jobProcessDetails.getNumberOfRemovedThings() != null) {
            Integer numberOfRemovedThings = jobProcessDetails.getNumberOfRemovedThings();
            jsonWriter.name("numberOfRemovedThings");
            jsonWriter.value(numberOfRemovedThings);
        }
        if (jobProcessDetails.getNumberOfTimedOutThings() != null) {
            Integer numberOfTimedOutThings = jobProcessDetails.getNumberOfTimedOutThings();
            jsonWriter.name("numberOfTimedOutThings");
            jsonWriter.value(numberOfTimedOutThings);
        }
        jsonWriter.endObject();
    }

    private static JobProcessDetailsJsonMarshaller instance;

    public static JobProcessDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobProcessDetailsJsonMarshaller();
        return instance;
    }
}
