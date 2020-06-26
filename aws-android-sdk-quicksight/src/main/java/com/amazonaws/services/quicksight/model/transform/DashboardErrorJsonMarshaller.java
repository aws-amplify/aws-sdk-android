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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DashboardError
 */
class DashboardErrorJsonMarshaller {

    public void marshall(DashboardError dashboardError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dashboardError.getType() != null) {
            String type = dashboardError.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (dashboardError.getMessage() != null) {
            String message = dashboardError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static DashboardErrorJsonMarshaller instance;

    public static DashboardErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashboardErrorJsonMarshaller();
        return instance;
    }
}
