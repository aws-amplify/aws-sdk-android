/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ViewSummary
 */
class ViewSummaryJsonMarshaller {

    public void marshall(ViewSummary viewSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (viewSummary.getId() != null) {
            String id = viewSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (viewSummary.getArn() != null) {
            String arn = viewSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (viewSummary.getName() != null) {
            String name = viewSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (viewSummary.getType() != null) {
            String type = viewSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (viewSummary.getStatus() != null) {
            String status = viewSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (viewSummary.getDescription() != null) {
            String description = viewSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static ViewSummaryJsonMarshaller instance;

    public static ViewSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViewSummaryJsonMarshaller();
        return instance;
    }
}
