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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Parameter
 */
class ParameterJsonMarshaller {

    public void marshall(Parameter parameter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parameter.getName() != null) {
            String name = parameter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (parameter.getType() != null) {
            String type = parameter.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (parameter.getValue() != null) {
            String value = parameter.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (parameter.getVersion() != null) {
            Long version = parameter.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (parameter.getSelector() != null) {
            String selector = parameter.getSelector();
            jsonWriter.name("Selector");
            jsonWriter.value(selector);
        }
        if (parameter.getSourceResult() != null) {
            String sourceResult = parameter.getSourceResult();
            jsonWriter.name("SourceResult");
            jsonWriter.value(sourceResult);
        }
        if (parameter.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = parameter.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (parameter.getARN() != null) {
            String aRN = parameter.getARN();
            jsonWriter.name("ARN");
            jsonWriter.value(aRN);
        }
        if (parameter.getDataType() != null) {
            String dataType = parameter.getDataType();
            jsonWriter.name("DataType");
            jsonWriter.value(dataType);
        }
        jsonWriter.endObject();
    }

    private static ParameterJsonMarshaller instance;

    public static ParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterJsonMarshaller();
        return instance;
    }
}
