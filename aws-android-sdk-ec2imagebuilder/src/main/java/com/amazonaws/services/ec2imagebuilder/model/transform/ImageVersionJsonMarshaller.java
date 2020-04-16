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
 * JSON marshaller for POJO ImageVersion
 */
class ImageVersionJsonMarshaller {

    public void marshall(ImageVersion imageVersion, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageVersion.getArn() != null) {
            String arn = imageVersion.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (imageVersion.getName() != null) {
            String name = imageVersion.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (imageVersion.getVersion() != null) {
            String version = imageVersion.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (imageVersion.getPlatform() != null) {
            String platform = imageVersion.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (imageVersion.getOsVersion() != null) {
            String osVersion = imageVersion.getOsVersion();
            jsonWriter.name("osVersion");
            jsonWriter.value(osVersion);
        }
        if (imageVersion.getOwner() != null) {
            String owner = imageVersion.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (imageVersion.getDateCreated() != null) {
            String dateCreated = imageVersion.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        jsonWriter.endObject();
    }

    private static ImageVersionJsonMarshaller instance;

    public static ImageVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageVersionJsonMarshaller();
        return instance;
    }
}
