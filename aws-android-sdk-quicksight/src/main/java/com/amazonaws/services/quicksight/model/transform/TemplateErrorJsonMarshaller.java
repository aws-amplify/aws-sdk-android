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
 * JSON marshaller for POJO TemplateError
 */
class TemplateErrorJsonMarshaller {

    public void marshall(TemplateError templateError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (templateError.getType() != null) {
            String type = templateError.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (templateError.getMessage() != null) {
            String message = templateError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static TemplateErrorJsonMarshaller instance;

    public static TemplateErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateErrorJsonMarshaller();
        return instance;
    }
}
