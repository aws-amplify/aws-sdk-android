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
 * JSON marshaller for POJO AlgorithmSummary
 */
class AlgorithmSummaryJsonMarshaller {

    public void marshall(AlgorithmSummary algorithmSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (algorithmSummary.getAlgorithmName() != null) {
            String algorithmName = algorithmSummary.getAlgorithmName();
            jsonWriter.name("AlgorithmName");
            jsonWriter.value(algorithmName);
        }
        if (algorithmSummary.getAlgorithmArn() != null) {
            String algorithmArn = algorithmSummary.getAlgorithmArn();
            jsonWriter.name("AlgorithmArn");
            jsonWriter.value(algorithmArn);
        }
        if (algorithmSummary.getAlgorithmDescription() != null) {
            String algorithmDescription = algorithmSummary.getAlgorithmDescription();
            jsonWriter.name("AlgorithmDescription");
            jsonWriter.value(algorithmDescription);
        }
        if (algorithmSummary.getCreationTime() != null) {
            java.util.Date creationTime = algorithmSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (algorithmSummary.getAlgorithmStatus() != null) {
            String algorithmStatus = algorithmSummary.getAlgorithmStatus();
            jsonWriter.name("AlgorithmStatus");
            jsonWriter.value(algorithmStatus);
        }
        jsonWriter.endObject();
    }

    private static AlgorithmSummaryJsonMarshaller instance;

    public static AlgorithmSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmSummaryJsonMarshaller();
        return instance;
    }
}
