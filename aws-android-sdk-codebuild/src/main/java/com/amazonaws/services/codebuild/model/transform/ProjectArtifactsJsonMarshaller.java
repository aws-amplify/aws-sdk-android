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
 * JSON marshaller for POJO ProjectArtifacts
 */
class ProjectArtifactsJsonMarshaller {

    public void marshall(ProjectArtifacts projectArtifacts, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (projectArtifacts.getType() != null) {
            String type = projectArtifacts.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (projectArtifacts.getLocation() != null) {
            String location = projectArtifacts.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (projectArtifacts.getPath() != null) {
            String path = projectArtifacts.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (projectArtifacts.getNamespaceType() != null) {
            String namespaceType = projectArtifacts.getNamespaceType();
            jsonWriter.name("namespaceType");
            jsonWriter.value(namespaceType);
        }
        if (projectArtifacts.getName() != null) {
            String name = projectArtifacts.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (projectArtifacts.getPackaging() != null) {
            String packaging = projectArtifacts.getPackaging();
            jsonWriter.name("packaging");
            jsonWriter.value(packaging);
        }
        if (projectArtifacts.getOverrideArtifactName() != null) {
            Boolean overrideArtifactName = projectArtifacts.getOverrideArtifactName();
            jsonWriter.name("overrideArtifactName");
            jsonWriter.value(overrideArtifactName);
        }
        if (projectArtifacts.getEncryptionDisabled() != null) {
            Boolean encryptionDisabled = projectArtifacts.getEncryptionDisabled();
            jsonWriter.name("encryptionDisabled");
            jsonWriter.value(encryptionDisabled);
        }
        if (projectArtifacts.getArtifactIdentifier() != null) {
            String artifactIdentifier = projectArtifacts.getArtifactIdentifier();
            jsonWriter.name("artifactIdentifier");
            jsonWriter.value(artifactIdentifier);
        }
        jsonWriter.endObject();
    }

    private static ProjectArtifactsJsonMarshaller instance;

    public static ProjectArtifactsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectArtifactsJsonMarshaller();
        return instance;
    }
}
