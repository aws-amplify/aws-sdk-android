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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProjectSourceVersion
 */
class ProjectSourceVersionJsonMarshaller {

    public void marshall(ProjectSourceVersion projectSourceVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (projectSourceVersion.getSourceIdentifier() != null) {
            String sourceIdentifier = projectSourceVersion.getSourceIdentifier();
            jsonWriter.name("sourceIdentifier");
            jsonWriter.value(sourceIdentifier);
        }
        if (projectSourceVersion.getSourceVersion() != null) {
            String sourceVersion = projectSourceVersion.getSourceVersion();
            jsonWriter.name("sourceVersion");
            jsonWriter.value(sourceVersion);
        }
        jsonWriter.endObject();
    }

    private static ProjectSourceVersionJsonMarshaller instance;

    public static ProjectSourceVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectSourceVersionJsonMarshaller();
        return instance;
    }
}
