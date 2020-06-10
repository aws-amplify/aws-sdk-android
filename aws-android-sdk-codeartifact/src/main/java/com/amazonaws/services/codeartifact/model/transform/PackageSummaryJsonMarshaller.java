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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackageSummary
 */
class PackageSummaryJsonMarshaller {

    public void marshall(PackageSummary packageSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packageSummary.getFormat() != null) {
            String format = packageSummary.getFormat();
            jsonWriter.name("format");
            jsonWriter.value(format);
        }
        if (packageSummary.getNamespace() != null) {
            String namespace = packageSummary.getNamespace();
            jsonWriter.name("namespace");
            jsonWriter.value(namespace);
        }
        if (packageSummary.getPackage() != null) {
            String package = packageSummary.getPackage();
            jsonWriter.name("package");
            jsonWriter.value(package);
        }
        jsonWriter.endObject();
    }

    private static PackageSummaryJsonMarshaller instance;

    public static PackageSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PackageSummaryJsonMarshaller();
        return instance;
    }
}
