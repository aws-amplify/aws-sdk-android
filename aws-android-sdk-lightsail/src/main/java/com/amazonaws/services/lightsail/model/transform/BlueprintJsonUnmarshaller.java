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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Blueprint
 */
class BlueprintJsonUnmarshaller implements Unmarshaller<Blueprint, JsonUnmarshallerContext> {

    public Blueprint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Blueprint blueprint = new Blueprint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("blueprintId")) {
                blueprint.setBlueprintId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                blueprint.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("group")) {
                blueprint.setGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                blueprint.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                blueprint.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isActive")) {
                blueprint.setIsActive(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minPower")) {
                blueprint.setMinPower(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                blueprint.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionCode")) {
                blueprint.setVersionCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("productUrl")) {
                blueprint.setProductUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("licenseUrl")) {
                blueprint.setLicenseUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platform")) {
                blueprint.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return blueprint;
    }

    private static BlueprintJsonUnmarshaller instance;

    public static BlueprintJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlueprintJsonUnmarshaller();
        return instance;
    }
}
