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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO PackagingConfiguration
 */
class PackagingConfigurationJsonUnmarshaller implements Unmarshaller<PackagingConfiguration, JsonUnmarshallerContext> {

    public PackagingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PackagingConfiguration packagingConfiguration = new PackagingConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                packagingConfiguration.setArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CmafPackage")) {
                packagingConfiguration.setCmafPackage(CmafPackageJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DashPackage")) {
                packagingConfiguration.setDashPackage(DashPackageJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("HlsPackage")) {
                packagingConfiguration.setHlsPackage(HlsPackageJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Id")) {
                packagingConfiguration.setId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MssPackage")) {
                packagingConfiguration.setMssPackage(MssPackageJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PackagingGroupId")) {
                packagingConfiguration.setPackagingGroupId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                packagingConfiguration.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return packagingConfiguration;
    }

    private static PackagingConfigurationJsonUnmarshaller instance;
    public static PackagingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PackagingConfigurationJsonUnmarshaller();
        return instance;
    }
}
