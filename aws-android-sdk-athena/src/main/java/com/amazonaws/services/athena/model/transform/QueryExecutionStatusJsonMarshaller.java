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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QueryExecutionStatus
 */
class QueryExecutionStatusJsonMarshaller {

    public void marshall(QueryExecutionStatus queryExecutionStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queryExecutionStatus.getState() != null) {
            String state = queryExecutionStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (queryExecutionStatus.getStateChangeReason() != null) {
            String stateChangeReason = queryExecutionStatus.getStateChangeReason();
            jsonWriter.name("StateChangeReason");
            jsonWriter.value(stateChangeReason);
        }
        if (queryExecutionStatus.getSubmissionDateTime() != null) {
            java.util.Date submissionDateTime = queryExecutionStatus.getSubmissionDateTime();
            jsonWriter.name("SubmissionDateTime");
            jsonWriter.value(submissionDateTime);
        }
        if (queryExecutionStatus.getCompletionDateTime() != null) {
            java.util.Date completionDateTime = queryExecutionStatus.getCompletionDateTime();
            jsonWriter.name("CompletionDateTime");
            jsonWriter.value(completionDateTime);
        }
        jsonWriter.endObject();
    }

    private static QueryExecutionStatusJsonMarshaller instance;

    public static QueryExecutionStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryExecutionStatusJsonMarshaller();
        return instance;
    }
}
