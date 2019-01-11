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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RestoreSummary
 */
class RestoreSummaryJsonMarshaller {

    public void marshall(RestoreSummary restoreSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (restoreSummary.getSourceBackupArn() != null) {
            String sourceBackupArn = restoreSummary.getSourceBackupArn();
            jsonWriter.name("SourceBackupArn");
            jsonWriter.value(sourceBackupArn);
        }
        if (restoreSummary.getSourceTableArn() != null) {
            String sourceTableArn = restoreSummary.getSourceTableArn();
            jsonWriter.name("SourceTableArn");
            jsonWriter.value(sourceTableArn);
        }
        if (restoreSummary.getRestoreDateTime() != null) {
            java.util.Date restoreDateTime = restoreSummary.getRestoreDateTime();
            jsonWriter.name("RestoreDateTime");
            jsonWriter.value(restoreDateTime);
        }
        if (restoreSummary.getRestoreInProgress() != null) {
            Boolean restoreInProgress = restoreSummary.getRestoreInProgress();
            jsonWriter.name("RestoreInProgress");
            jsonWriter.value(restoreInProgress);
        }
        jsonWriter.endObject();
    }

    private static RestoreSummaryJsonMarshaller instance;

    public static RestoreSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RestoreSummaryJsonMarshaller();
        return instance;
    }
}
