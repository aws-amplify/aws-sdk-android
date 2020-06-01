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
 * JSON marshaller for POJO FailureDetails
 */
class FailureDetailsJsonMarshaller {

    public void marshall(FailureDetails failureDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (failureDetails.getReason() != null) {
            String reason = failureDetails.getReason();
            jsonWriter.name("Reason");
            jsonWriter.value(reason);
        }
        if (failureDetails.getMessage() != null) {
            String message = failureDetails.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (failureDetails.getLogFile() != null) {
            String logFile = failureDetails.getLogFile();
            jsonWriter.name("LogFile");
            jsonWriter.value(logFile);
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
