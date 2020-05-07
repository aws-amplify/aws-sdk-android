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
 * JSON marshaller for POJO BuildArtifacts
 */
class BuildArtifactsJsonMarshaller {

    public void marshall(BuildArtifacts buildArtifacts, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (buildArtifacts.getLocation() != null) {
            String location = buildArtifacts.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (buildArtifacts.getSha256sum() != null) {
            String sha256sum = buildArtifacts.getSha256sum();
            jsonWriter.name("sha256sum");
            jsonWriter.value(sha256sum);
        }
        if (buildArtifacts.getMd5sum() != null) {
            String md5sum = buildArtifacts.getMd5sum();
            jsonWriter.name("md5sum");
            jsonWriter.value(md5sum);
        }
        if (buildArtifacts.getOverrideArtifactName() != null) {
            Boolean overrideArtifactName = buildArtifacts.getOverrideArtifactName();
            jsonWriter.name("overrideArtifactName");
            jsonWriter.value(overrideArtifactName);
        }
        if (buildArtifacts.getEncryptionDisabled() != null) {
            Boolean encryptionDisabled = buildArtifacts.getEncryptionDisabled();
            jsonWriter.name("encryptionDisabled");
            jsonWriter.value(encryptionDisabled);
        }
        if (buildArtifacts.getArtifactIdentifier() != null) {
            String artifactIdentifier = buildArtifacts.getArtifactIdentifier();
            jsonWriter.name("artifactIdentifier");
            jsonWriter.value(artifactIdentifier);
        }
        jsonWriter.endObject();
    }

    private static BuildArtifactsJsonMarshaller instance;

    public static BuildArtifactsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuildArtifactsJsonMarshaller();
        return instance;
    }
}
