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
 * JSON marshaller for POJO RepositoryExternalConnectionInfo
 */
class RepositoryExternalConnectionInfoJsonMarshaller {

    public void marshall(RepositoryExternalConnectionInfo repositoryExternalConnectionInfo,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (repositoryExternalConnectionInfo.getExternalConnectionName() != null) {
            String externalConnectionName = repositoryExternalConnectionInfo
                    .getExternalConnectionName();
            jsonWriter.name("externalConnectionName");
            jsonWriter.value(externalConnectionName);
        }
        if (repositoryExternalConnectionInfo.getPackageFormat() != null) {
            String packageFormat = repositoryExternalConnectionInfo.getPackageFormat();
            jsonWriter.name("packageFormat");
            jsonWriter.value(packageFormat);
        }
        if (repositoryExternalConnectionInfo.getStatus() != null) {
            String status = repositoryExternalConnectionInfo.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static RepositoryExternalConnectionInfoJsonMarshaller instance;

    public static RepositoryExternalConnectionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryExternalConnectionInfoJsonMarshaller();
        return instance;
    }
}
