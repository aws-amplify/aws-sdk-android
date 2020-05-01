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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RootDirectory
 */
class RootDirectoryJsonMarshaller {

    public void marshall(RootDirectory rootDirectory, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rootDirectory.getPath() != null) {
            String path = rootDirectory.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (rootDirectory.getCreationInfo() != null) {
            CreationInfo creationInfo = rootDirectory.getCreationInfo();
            jsonWriter.name("CreationInfo");
            CreationInfoJsonMarshaller.getInstance().marshall(creationInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RootDirectoryJsonMarshaller instance;

    public static RootDirectoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RootDirectoryJsonMarshaller();
        return instance;
    }
}
