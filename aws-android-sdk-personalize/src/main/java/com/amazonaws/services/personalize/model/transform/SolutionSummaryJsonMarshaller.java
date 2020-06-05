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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SolutionSummary
 */
class SolutionSummaryJsonMarshaller {

    public void marshall(SolutionSummary solutionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (solutionSummary.getName() != null) {
            String name = solutionSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (solutionSummary.getSolutionArn() != null) {
            String solutionArn = solutionSummary.getSolutionArn();
            jsonWriter.name("solutionArn");
            jsonWriter.value(solutionArn);
        }
        if (solutionSummary.getStatus() != null) {
            String status = solutionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (solutionSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = solutionSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (solutionSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = solutionSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static SolutionSummaryJsonMarshaller instance;

    public static SolutionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SolutionSummaryJsonMarshaller();
        return instance;
    }
}
