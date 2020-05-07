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
 * JSON marshaller for POJO EnvironmentImage
 */
class EnvironmentImageJsonMarshaller {

    public void marshall(EnvironmentImage environmentImage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (environmentImage.getName() != null) {
            String name = environmentImage.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (environmentImage.getDescription() != null) {
            String description = environmentImage.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (environmentImage.getVersions() != null) {
            java.util.List<String> versions = environmentImage.getVersions();
            jsonWriter.name("versions");
            jsonWriter.beginArray();
            for (String versionsItem : versions) {
                if (versionsItem != null) {
                    jsonWriter.value(versionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EnvironmentImageJsonMarshaller instance;

    public static EnvironmentImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentImageJsonMarshaller();
        return instance;
    }
}
