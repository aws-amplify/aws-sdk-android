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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalDatabaseParameter
 */
class RelationalDatabaseParameterJsonMarshaller {

    public void marshall(RelationalDatabaseParameter relationalDatabaseParameter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseParameter.getAllowedValues() != null) {
            String allowedValues = relationalDatabaseParameter.getAllowedValues();
            jsonWriter.name("allowedValues");
            jsonWriter.value(allowedValues);
        }
        if (relationalDatabaseParameter.getApplyMethod() != null) {
            String applyMethod = relationalDatabaseParameter.getApplyMethod();
            jsonWriter.name("applyMethod");
            jsonWriter.value(applyMethod);
        }
        if (relationalDatabaseParameter.getApplyType() != null) {
            String applyType = relationalDatabaseParameter.getApplyType();
            jsonWriter.name("applyType");
            jsonWriter.value(applyType);
        }
        if (relationalDatabaseParameter.getDataType() != null) {
            String dataType = relationalDatabaseParameter.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (relationalDatabaseParameter.getDescription() != null) {
            String description = relationalDatabaseParameter.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (relationalDatabaseParameter.getIsModifiable() != null) {
            Boolean isModifiable = relationalDatabaseParameter.getIsModifiable();
            jsonWriter.name("isModifiable");
            jsonWriter.value(isModifiable);
        }
        if (relationalDatabaseParameter.getParameterName() != null) {
            String parameterName = relationalDatabaseParameter.getParameterName();
            jsonWriter.name("parameterName");
            jsonWriter.value(parameterName);
        }
        if (relationalDatabaseParameter.getParameterValue() != null) {
            String parameterValue = relationalDatabaseParameter.getParameterValue();
            jsonWriter.name("parameterValue");
            jsonWriter.value(parameterValue);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseParameterJsonMarshaller instance;

    public static RelationalDatabaseParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseParameterJsonMarshaller();
        return instance;
    }
}
