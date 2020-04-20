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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DevEndpointCustomLibraries
 */
class DevEndpointCustomLibrariesJsonMarshaller {

    public void marshall(DevEndpointCustomLibraries devEndpointCustomLibraries,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (devEndpointCustomLibraries.getExtraPythonLibsS3Path() != null) {
            String extraPythonLibsS3Path = devEndpointCustomLibraries.getExtraPythonLibsS3Path();
            jsonWriter.name("ExtraPythonLibsS3Path");
            jsonWriter.value(extraPythonLibsS3Path);
        }
        if (devEndpointCustomLibraries.getExtraJarsS3Path() != null) {
            String extraJarsS3Path = devEndpointCustomLibraries.getExtraJarsS3Path();
            jsonWriter.name("ExtraJarsS3Path");
            jsonWriter.value(extraJarsS3Path);
        }
        jsonWriter.endObject();
    }

    private static DevEndpointCustomLibrariesJsonMarshaller instance;

    public static DevEndpointCustomLibrariesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DevEndpointCustomLibrariesJsonMarshaller();
        return instance;
    }
}
