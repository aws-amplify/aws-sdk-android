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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Image
 */
class ImageJsonMarshaller {

    public void marshall(Image image, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (image.getArn() != null) {
            String arn = image.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (image.getName() != null) {
            String name = image.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (image.getVersion() != null) {
            String version = image.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (image.getPlatform() != null) {
            String platform = image.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (image.getEnhancedImageMetadataEnabled() != null) {
            Boolean enhancedImageMetadataEnabled = image.getEnhancedImageMetadataEnabled();
            jsonWriter.name("enhancedImageMetadataEnabled");
            jsonWriter.value(enhancedImageMetadataEnabled);
        }
        if (image.getOsVersion() != null) {
            String osVersion = image.getOsVersion();
            jsonWriter.name("osVersion");
            jsonWriter.value(osVersion);
        }
        if (image.getState() != null) {
            ImageState state = image.getState();
            jsonWriter.name("state");
            ImageStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (image.getImageRecipe() != null) {
            ImageRecipe imageRecipe = image.getImageRecipe();
            jsonWriter.name("imageRecipe");
            ImageRecipeJsonMarshaller.getInstance().marshall(imageRecipe, jsonWriter);
        }
        if (image.getSourcePipelineName() != null) {
            String sourcePipelineName = image.getSourcePipelineName();
            jsonWriter.name("sourcePipelineName");
            jsonWriter.value(sourcePipelineName);
        }
        if (image.getSourcePipelineArn() != null) {
            String sourcePipelineArn = image.getSourcePipelineArn();
            jsonWriter.name("sourcePipelineArn");
            jsonWriter.value(sourcePipelineArn);
        }
        if (image.getInfrastructureConfiguration() != null) {
            InfrastructureConfiguration infrastructureConfiguration = image
                    .getInfrastructureConfiguration();
            jsonWriter.name("infrastructureConfiguration");
            InfrastructureConfigurationJsonMarshaller.getInstance().marshall(
                    infrastructureConfiguration, jsonWriter);
        }
        if (image.getDistributionConfiguration() != null) {
            DistributionConfiguration distributionConfiguration = image
                    .getDistributionConfiguration();
            jsonWriter.name("distributionConfiguration");
            DistributionConfigurationJsonMarshaller.getInstance().marshall(
                    distributionConfiguration, jsonWriter);
        }
        if (image.getImageTestsConfiguration() != null) {
            ImageTestsConfiguration imageTestsConfiguration = image.getImageTestsConfiguration();
            jsonWriter.name("imageTestsConfiguration");
            ImageTestsConfigurationJsonMarshaller.getInstance().marshall(imageTestsConfiguration,
                    jsonWriter);
        }
        if (image.getDateCreated() != null) {
            String dateCreated = image.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (image.getOutputResources() != null) {
            OutputResources outputResources = image.getOutputResources();
            jsonWriter.name("outputResources");
            OutputResourcesJsonMarshaller.getInstance().marshall(outputResources, jsonWriter);
        }
        if (image.getTags() != null) {
            java.util.Map<String, String> tags = image.getTags();
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

    private static ImageJsonMarshaller instance;

    public static ImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonMarshaller();
        return instance;
    }
}
