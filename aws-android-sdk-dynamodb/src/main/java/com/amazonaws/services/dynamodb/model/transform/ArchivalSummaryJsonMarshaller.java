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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ArchivalSummary
 */
class ArchivalSummaryJsonMarshaller {

    public void marshall(ArchivalSummary archivalSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (archivalSummary.getArchivalDateTime() != null) {
            java.util.Date archivalDateTime = archivalSummary.getArchivalDateTime();
            jsonWriter.name("ArchivalDateTime");
            jsonWriter.value(archivalDateTime);
        }
        if (archivalSummary.getArchivalReason() != null) {
            String archivalReason = archivalSummary.getArchivalReason();
            jsonWriter.name("ArchivalReason");
            jsonWriter.value(archivalReason);
        }
        if (archivalSummary.getArchivalBackupArn() != null) {
            String archivalBackupArn = archivalSummary.getArchivalBackupArn();
            jsonWriter.name("ArchivalBackupArn");
            jsonWriter.value(archivalBackupArn);
        }
        jsonWriter.endObject();
    }

    private static ArchivalSummaryJsonMarshaller instance;

    public static ArchivalSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ArchivalSummaryJsonMarshaller();
        return instance;
    }
}
