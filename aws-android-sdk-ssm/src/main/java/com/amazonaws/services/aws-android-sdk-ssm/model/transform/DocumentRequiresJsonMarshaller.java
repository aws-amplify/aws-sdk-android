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
 * JSON marshaller for POJO DocumentRequires
 */
class DocumentRequiresJsonMarshaller {

    public void marshall(DocumentRequires documentRequires, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentRequires.getName() != null) {
            String name = documentRequires.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentRequires.getVersion() != null) {
            String version = documentRequires.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static DocumentRequiresJsonMarshaller instance;
    public static DocumentRequiresJsonMarshaller getInstance() {
        if (instance == null) instance = new DocumentRequiresJsonMarshaller();
        return instance;
    }
}
