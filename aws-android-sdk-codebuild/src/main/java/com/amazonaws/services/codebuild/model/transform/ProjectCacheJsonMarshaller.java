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
 * JSON marshaller for POJO ProjectCache
 */
class ProjectCacheJsonMarshaller {

    public void marshall(ProjectCache projectCache, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectCache.getType() != null) {
            String type = projectCache.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (projectCache.getLocation() != null) {
            String location = projectCache.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (projectCache.getModes() != null) {
            java.util.List<String> modes = projectCache.getModes();
            jsonWriter.name("modes");
            jsonWriter.beginArray();
            for (String modesItem : modes) {
                if (modesItem != null) {
                    jsonWriter.value(modesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProjectCacheJsonMarshaller instance;

    public static ProjectCacheJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectCacheJsonMarshaller();
        return instance;
    }
}
