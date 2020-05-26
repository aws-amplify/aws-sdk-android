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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FailureDetails
 */
class FailureDetailsJsonMarshaller {

    public void marshall(FailureDetails failureDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (failureDetails.getFailureStage() != null) {
            String failureStage = failureDetails.getFailureStage();
            jsonWriter.name("FailureStage");
            jsonWriter.value(failureStage);
        }
        if (failureDetails.getFailureType() != null) {
            String failureType = failureDetails.getFailureType();
            jsonWriter.name("FailureType");
            jsonWriter.value(failureType);
        }
        if (failureDetails.getDetails() != null) {
            java.util.Map<String, java.util.List<String>> details = failureDetails.getDetails();
            jsonWriter.name("Details");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> detailsEntry : details
                    .entrySet()) {
                java.util.List<String> detailsValue = detailsEntry.getValue();
                if (detailsValue != null) {
                    jsonWriter.name(detailsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String detailsValueItem : detailsValue) {
                        if (detailsValueItem != null) {
                            jsonWriter.value(detailsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static FailureDetailsJsonMarshaller instance;

    public static FailureDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FailureDetailsJsonMarshaller();
        return instance;
    }
}
