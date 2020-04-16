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

package com.amazonaws.services.ec2imagebuilder.model.transform;

import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComponentVersion
 */
class ComponentVersionJsonMarshaller {

    public void marshall(ComponentVersion componentVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (componentVersion.getArn() != null) {
            String arn = componentVersion.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (componentVersion.getName() != null) {
            String name = componentVersion.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (componentVersion.getVersion() != null) {
            String version = componentVersion.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (componentVersion.getDescription() != null) {
            String description = componentVersion.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (componentVersion.getPlatform() != null) {
            String platform = componentVersion.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (componentVersion.getType() != null) {
            String type = componentVersion.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (componentVersion.getOwner() != null) {
            String owner = componentVersion.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (componentVersion.getDateCreated() != null) {
            String dateCreated = componentVersion.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        jsonWriter.endObject();
    }

    private static ComponentVersionJsonMarshaller instance;

    public static ComponentVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComponentVersionJsonMarshaller();
        return instance;
    }
}
