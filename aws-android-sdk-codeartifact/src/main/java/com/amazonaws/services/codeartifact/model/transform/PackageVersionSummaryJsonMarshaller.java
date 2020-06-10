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
 * JSON marshaller for POJO PackageVersionSummary
 */
class PackageVersionSummaryJsonMarshaller {

    public void marshall(PackageVersionSummary packageVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (packageVersionSummary.getVersion() != null) {
            String version = packageVersionSummary.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (packageVersionSummary.getRevision() != null) {
            String revision = packageVersionSummary.getRevision();
            jsonWriter.name("revision");
            jsonWriter.value(revision);
        }
        if (packageVersionSummary.getStatus() != null) {
            String status = packageVersionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static PackageVersionSummaryJsonMarshaller instance;

    public static PackageVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PackageVersionSummaryJsonMarshaller();
        return instance;
    }
}
