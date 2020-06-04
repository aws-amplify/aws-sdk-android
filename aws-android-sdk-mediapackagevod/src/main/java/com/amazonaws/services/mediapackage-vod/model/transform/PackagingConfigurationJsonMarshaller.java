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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackagingConfiguration
 */
class PackagingConfigurationJsonMarshaller {

    public void marshall(PackagingConfiguration packagingConfiguration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packagingConfiguration.getArn() != null) {
            String arn = packagingConfiguration.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (packagingConfiguration.getCmafPackage() != null) {
            CmafPackage cmafPackage = packagingConfiguration.getCmafPackage();
            jsonWriter.name("CmafPackage");
            CmafPackageJsonMarshaller.getInstance().marshall(cmafPackage, jsonWriter);
        }
        if (packagingConfiguration.getDashPackage() != null) {
            DashPackage dashPackage = packagingConfiguration.getDashPackage();
            jsonWriter.name("DashPackage");
            DashPackageJsonMarshaller.getInstance().marshall(dashPackage, jsonWriter);
        }
        if (packagingConfiguration.getHlsPackage() != null) {
            HlsPackage hlsPackage = packagingConfiguration.getHlsPackage();
            jsonWriter.name("HlsPackage");
            HlsPackageJsonMarshaller.getInstance().marshall(hlsPackage, jsonWriter);
        }
        if (packagingConfiguration.getId() != null) {
            String id = packagingConfiguration.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (packagingConfiguration.getMssPackage() != null) {
            MssPackage mssPackage = packagingConfiguration.getMssPackage();
            jsonWriter.name("MssPackage");
            MssPackageJsonMarshaller.getInstance().marshall(mssPackage, jsonWriter);
        }
        if (packagingConfiguration.getPackagingGroupId() != null) {
            String packagingGroupId = packagingConfiguration.getPackagingGroupId();
            jsonWriter.name("PackagingGroupId");
            jsonWriter.value(packagingGroupId);
        }
        if (packagingConfiguration.getTags() != null) {
            java.util.Map<String, String> tags = packagingConfiguration.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
            jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PackagingConfigurationJsonMarshaller instance;
    public static PackagingConfigurationJsonMarshaller getInstance() {
        if (instance == null) instance = new PackagingConfigurationJsonMarshaller();
        return instance;
    }
}
