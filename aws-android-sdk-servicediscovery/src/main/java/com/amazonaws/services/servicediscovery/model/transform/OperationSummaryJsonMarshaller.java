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

package com.amazonaws.services.servicediscovery.model.transform;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OperationSummary
 */
class OperationSummaryJsonMarshaller {

    public void marshall(OperationSummary operationSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (operationSummary.getId() != null) {
            String id = operationSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (operationSummary.getStatus() != null) {
            String status = operationSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static OperationSummaryJsonMarshaller instance;

    public static OperationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OperationSummaryJsonMarshaller();
        return instance;
    }
}
