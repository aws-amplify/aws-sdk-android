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
 * JSON marshaller for POJO PackageSummary
 */
class PackageSummaryJsonMarshaller {

    public void marshall(PackageSummary packageSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packageSummary.getPackageName() != null) {
            String packageName = packageSummary.getPackageName();
            jsonWriter.name("packageName");
            jsonWriter.value(packageName);
        }
        if (packageSummary.getDefaultVersionName() != null) {
            String defaultVersionName = packageSummary.getDefaultVersionName();
            jsonWriter.name("defaultVersionName");
            jsonWriter.value(defaultVersionName);
        }
        if (packageSummary.getCreationDate() != null) {
            java.util.Date creationDate = packageSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (packageSummary.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = packageSummary.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
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
