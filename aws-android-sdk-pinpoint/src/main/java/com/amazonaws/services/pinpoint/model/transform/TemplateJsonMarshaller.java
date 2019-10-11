/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Template
 */
class TemplateJsonMarshaller {

    public void marshall(Template template, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (template.getName() != null) {
            String name = template.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static TemplateJsonMarshaller instance;

    public static TemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateJsonMarshaller();
        return instance;
    }
}
