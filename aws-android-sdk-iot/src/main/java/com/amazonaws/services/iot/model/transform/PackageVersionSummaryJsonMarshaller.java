/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackageVersionSummary
 */
class PackageVersionSummaryJsonMarshaller {

    public void marshall(PackageVersionSummary packageVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (packageVersionSummary.getPackageName() != null) {
            String packageName = packageVersionSummary.getPackageName();
            jsonWriter.name("packageName");
            jsonWriter.value(packageName);
        }
        if (packageVersionSummary.getVersionName() != null) {
            String versionName = packageVersionSummary.getVersionName();
            jsonWriter.name("versionName");
            jsonWriter.value(versionName);
        }
        if (packageVersionSummary.getStatus() != null) {
            String status = packageVersionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (packageVersionSummary.getCreationDate() != null) {
            java.util.Date creationDate = packageVersionSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (packageVersionSummary.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = packageVersionSummary.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
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
