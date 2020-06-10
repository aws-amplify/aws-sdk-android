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
 * JSON marshaller for POJO SuccessfulPackageVersionInfo
 */
class SuccessfulPackageVersionInfoJsonMarshaller {

    public void marshall(SuccessfulPackageVersionInfo successfulPackageVersionInfo,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (successfulPackageVersionInfo.getRevision() != null) {
            String revision = successfulPackageVersionInfo.getRevision();
            jsonWriter.name("revision");
            jsonWriter.value(revision);
        }
        if (successfulPackageVersionInfo.getStatus() != null) {
            String status = successfulPackageVersionInfo.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static SuccessfulPackageVersionInfoJsonMarshaller instance;

    public static SuccessfulPackageVersionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SuccessfulPackageVersionInfoJsonMarshaller();
        return instance;
    }
}
