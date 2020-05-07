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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Blueprint
 */
class BlueprintJsonMarshaller {

    public void marshall(Blueprint blueprint, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blueprint.getBlueprintId() != null) {
            String blueprintId = blueprint.getBlueprintId();
            jsonWriter.name("blueprintId");
            jsonWriter.value(blueprintId);
        }
        if (blueprint.getName() != null) {
            String name = blueprint.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (blueprint.getGroup() != null) {
            String group = blueprint.getGroup();
            jsonWriter.name("group");
            jsonWriter.value(group);
        }
        if (blueprint.getType() != null) {
            String type = blueprint.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (blueprint.getDescription() != null) {
            String description = blueprint.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (blueprint.getIsActive() != null) {
            Boolean isActive = blueprint.getIsActive();
            jsonWriter.name("isActive");
            jsonWriter.value(isActive);
        }
        if (blueprint.getMinPower() != null) {
            Integer minPower = blueprint.getMinPower();
            jsonWriter.name("minPower");
            jsonWriter.value(minPower);
        }
        if (blueprint.getVersion() != null) {
            String version = blueprint.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (blueprint.getVersionCode() != null) {
            String versionCode = blueprint.getVersionCode();
            jsonWriter.name("versionCode");
            jsonWriter.value(versionCode);
        }
        if (blueprint.getProductUrl() != null) {
            String productUrl = blueprint.getProductUrl();
            jsonWriter.name("productUrl");
            jsonWriter.value(productUrl);
        }
        if (blueprint.getLicenseUrl() != null) {
            String licenseUrl = blueprint.getLicenseUrl();
            jsonWriter.name("licenseUrl");
            jsonWriter.value(licenseUrl);
        }
        if (blueprint.getPlatform() != null) {
            String platform = blueprint.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        jsonWriter.endObject();
    }

    private static BlueprintJsonMarshaller instance;

    public static BlueprintJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlueprintJsonMarshaller();
        return instance;
    }
}
