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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LedgerSummary
 */
class LedgerSummaryJsonMarshaller {

    public void marshall(LedgerSummary ledgerSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ledgerSummary.getName() != null) {
            String name = ledgerSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (ledgerSummary.getState() != null) {
            String state = ledgerSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (ledgerSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = ledgerSummary.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        jsonWriter.endObject();
    }

    private static LedgerSummaryJsonMarshaller instance;

    public static LedgerSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LedgerSummaryJsonMarshaller();
        return instance;
    }
}
