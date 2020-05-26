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
 * JSON marshaller for POJO DocumentDefaultVersionDescription
 */
class DocumentDefaultVersionDescriptionJsonMarshaller {

    public void marshall(DocumentDefaultVersionDescription documentDefaultVersionDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentDefaultVersionDescription.getName() != null) {
            String name = documentDefaultVersionDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentDefaultVersionDescription.getDefaultVersion() != null) {
            String defaultVersion = documentDefaultVersionDescription.getDefaultVersion();
            jsonWriter.name("DefaultVersion");
            jsonWriter.value(defaultVersion);
        }
        if (documentDefaultVersionDescription.getDefaultVersionName() != null) {
            String defaultVersionName = documentDefaultVersionDescription.getDefaultVersionName();
            jsonWriter.name("DefaultVersionName");
            jsonWriter.value(defaultVersionName);
        }
        jsonWriter.endObject();
    }

    private static DocumentDefaultVersionDescriptionJsonMarshaller instance;

    public static DocumentDefaultVersionDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDefaultVersionDescriptionJsonMarshaller();
        return instance;
    }
}
