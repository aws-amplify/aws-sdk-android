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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BuildArtifacts
 */
class BuildArtifactsJsonUnmarshaller implements
        Unmarshaller<BuildArtifacts, JsonUnmarshallerContext> {

    public BuildArtifacts unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BuildArtifacts buildArtifacts = new BuildArtifacts();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("location")) {
                buildArtifacts.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sha256sum")) {
                buildArtifacts.setSha256sum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("md5sum")) {
                buildArtifacts.setMd5sum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("overrideArtifactName")) {
                buildArtifacts.setOverrideArtifactName(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("encryptionDisabled")) {
                buildArtifacts.setEncryptionDisabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("artifactIdentifier")) {
                buildArtifacts.setArtifactIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return buildArtifacts;
    }

    private static BuildArtifactsJsonUnmarshaller instance;

    public static BuildArtifactsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildArtifactsJsonUnmarshaller();
        return instance;
    }
}
