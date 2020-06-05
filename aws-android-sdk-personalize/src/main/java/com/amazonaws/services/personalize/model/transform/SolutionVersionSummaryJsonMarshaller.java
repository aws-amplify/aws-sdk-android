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
 * JSON marshaller for POJO SolutionVersionSummary
 */
class SolutionVersionSummaryJsonMarshaller {

    public void marshall(SolutionVersionSummary solutionVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (solutionVersionSummary.getSolutionVersionArn() != null) {
            String solutionVersionArn = solutionVersionSummary.getSolutionVersionArn();
            jsonWriter.name("solutionVersionArn");
            jsonWriter.value(solutionVersionArn);
        }
        if (solutionVersionSummary.getStatus() != null) {
            String status = solutionVersionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (solutionVersionSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = solutionVersionSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (solutionVersionSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = solutionVersionSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (solutionVersionSummary.getFailureReason() != null) {
            String failureReason = solutionVersionSummary.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static SolutionVersionSummaryJsonMarshaller instance;

    public static SolutionVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SolutionVersionSummaryJsonMarshaller();
        return instance;
    }
}
