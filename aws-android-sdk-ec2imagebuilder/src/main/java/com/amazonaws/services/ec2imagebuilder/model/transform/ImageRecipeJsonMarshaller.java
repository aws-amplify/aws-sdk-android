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
 * JSON marshaller for POJO ImageRecipe
 */
class ImageRecipeJsonMarshaller {

    public void marshall(ImageRecipe imageRecipe, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageRecipe.getArn() != null) {
            String arn = imageRecipe.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (imageRecipe.getName() != null) {
            String name = imageRecipe.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (imageRecipe.getDescription() != null) {
            String description = imageRecipe.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (imageRecipe.getPlatform() != null) {
            String platform = imageRecipe.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (imageRecipe.getOwner() != null) {
            String owner = imageRecipe.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (imageRecipe.getVersion() != null) {
            String version = imageRecipe.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (imageRecipe.getComponents() != null) {
            java.util.List<ComponentConfiguration> components = imageRecipe.getComponents();
            jsonWriter.name("components");
            jsonWriter.beginArray();
            for (ComponentConfiguration componentsItem : components) {
                if (componentsItem != null) {
                    ComponentConfigurationJsonMarshaller.getInstance().marshall(componentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (imageRecipe.getParentImage() != null) {
            String parentImage = imageRecipe.getParentImage();
            jsonWriter.name("parentImage");
            jsonWriter.value(parentImage);
        }
        if (imageRecipe.getBlockDeviceMappings() != null) {
            java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings = imageRecipe
                    .getBlockDeviceMappings();
            jsonWriter.name("blockDeviceMappings");
            jsonWriter.beginArray();
            for (InstanceBlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                if (blockDeviceMappingsItem != null) {
                    InstanceBlockDeviceMappingJsonMarshaller.getInstance().marshall(
                            blockDeviceMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (imageRecipe.getDateCreated() != null) {
            String dateCreated = imageRecipe.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (imageRecipe.getTags() != null) {
            java.util.Map<String, String> tags = imageRecipe.getTags();
            jsonWriter.name("tags");
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

    private static ImageRecipeJsonMarshaller instance;

    public static ImageRecipeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageRecipeJsonMarshaller();
        return instance;
    }
}
