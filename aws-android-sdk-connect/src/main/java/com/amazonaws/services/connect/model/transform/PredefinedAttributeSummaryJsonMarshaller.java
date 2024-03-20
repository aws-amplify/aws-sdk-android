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
 * JSON marshaller for POJO PredefinedAttributeSummary
 */
class PredefinedAttributeSummaryJsonMarshaller {

    public void marshall(PredefinedAttributeSummary predefinedAttributeSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (predefinedAttributeSummary.getName() != null) {
            String name = predefinedAttributeSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (predefinedAttributeSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = predefinedAttributeSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (predefinedAttributeSummary.getLastModifiedRegion() != null) {
            String lastModifiedRegion = predefinedAttributeSummary.getLastModifiedRegion();
            jsonWriter.name("LastModifiedRegion");
            jsonWriter.value(lastModifiedRegion);
        }
        jsonWriter.endObject();
    }

    private static PredefinedAttributeSummaryJsonMarshaller instance;

    public static PredefinedAttributeSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredefinedAttributeSummaryJsonMarshaller();
        return instance;
    }
}
