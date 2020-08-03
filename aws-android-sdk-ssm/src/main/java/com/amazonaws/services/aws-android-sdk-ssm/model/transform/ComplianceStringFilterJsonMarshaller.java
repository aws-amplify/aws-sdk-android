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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComplianceStringFilter
 */
class ComplianceStringFilterJsonMarshaller {

    public void marshall(ComplianceStringFilter complianceStringFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (complianceStringFilter.getKey() != null) {
            String key = complianceStringFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (complianceStringFilter.getValues() != null) {
            java.util.List<String> values = complianceStringFilter.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
            jsonWriter.value(valuesItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (complianceStringFilter.getType() != null) {
            String type = complianceStringFilter.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static ComplianceStringFilterJsonMarshaller instance;
    public static ComplianceStringFilterJsonMarshaller getInstance() {
        if (instance == null) instance = new ComplianceStringFilterJsonMarshaller();
        return instance;
    }
}
