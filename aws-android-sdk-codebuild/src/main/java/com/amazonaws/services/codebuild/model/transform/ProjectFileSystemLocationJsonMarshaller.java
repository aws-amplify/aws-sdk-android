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
 * JSON marshaller for POJO ProjectFileSystemLocation
 */
class ProjectFileSystemLocationJsonMarshaller {

    public void marshall(ProjectFileSystemLocation projectFileSystemLocation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectFileSystemLocation.getType() != null) {
            String type = projectFileSystemLocation.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (projectFileSystemLocation.getLocation() != null) {
            String location = projectFileSystemLocation.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (projectFileSystemLocation.getMountPoint() != null) {
            String mountPoint = projectFileSystemLocation.getMountPoint();
            jsonWriter.name("mountPoint");
            jsonWriter.value(mountPoint);
        }
        if (projectFileSystemLocation.getIdentifier() != null) {
            String identifier = projectFileSystemLocation.getIdentifier();
            jsonWriter.name("identifier");
            jsonWriter.value(identifier);
        }
        if (projectFileSystemLocation.getMountOptions() != null) {
            String mountOptions = projectFileSystemLocation.getMountOptions();
            jsonWriter.name("mountOptions");
            jsonWriter.value(mountOptions);
        }
        jsonWriter.endObject();
    }

    private static ProjectFileSystemLocationJsonMarshaller instance;

    public static ProjectFileSystemLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectFileSystemLocationJsonMarshaller();
        return instance;
    }
}
