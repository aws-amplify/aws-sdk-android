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
 * JSON marshaller for POJO ImagePipeline
 */
class ImagePipelineJsonMarshaller {

    public void marshall(ImagePipeline imagePipeline, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imagePipeline.getArn() != null) {
            String arn = imagePipeline.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (imagePipeline.getName() != null) {
            String name = imagePipeline.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (imagePipeline.getDescription() != null) {
            String description = imagePipeline.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (imagePipeline.getPlatform() != null) {
            String platform = imagePipeline.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (imagePipeline.getEnhancedImageMetadataEnabled() != null) {
            Boolean enhancedImageMetadataEnabled = imagePipeline.getEnhancedImageMetadataEnabled();
            jsonWriter.name("enhancedImageMetadataEnabled");
            jsonWriter.value(enhancedImageMetadataEnabled);
        }
        if (imagePipeline.getImageRecipeArn() != null) {
            String imageRecipeArn = imagePipeline.getImageRecipeArn();
            jsonWriter.name("imageRecipeArn");
            jsonWriter.value(imageRecipeArn);
        }
        if (imagePipeline.getInfrastructureConfigurationArn() != null) {
            String infrastructureConfigurationArn = imagePipeline
                    .getInfrastructureConfigurationArn();
            jsonWriter.name("infrastructureConfigurationArn");
            jsonWriter.value(infrastructureConfigurationArn);
        }
        if (imagePipeline.getDistributionConfigurationArn() != null) {
            String distributionConfigurationArn = imagePipeline.getDistributionConfigurationArn();
            jsonWriter.name("distributionConfigurationArn");
            jsonWriter.value(distributionConfigurationArn);
        }
        if (imagePipeline.getImageTestsConfiguration() != null) {
            ImageTestsConfiguration imageTestsConfiguration = imagePipeline
                    .getImageTestsConfiguration();
            jsonWriter.name("imageTestsConfiguration");
            ImageTestsConfigurationJsonMarshaller.getInstance().marshall(imageTestsConfiguration,
                    jsonWriter);
        }
        if (imagePipeline.getSchedule() != null) {
            Schedule schedule = imagePipeline.getSchedule();
            jsonWriter.name("schedule");
            ScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (imagePipeline.getStatus() != null) {
            String status = imagePipeline.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (imagePipeline.getDateCreated() != null) {
            String dateCreated = imagePipeline.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (imagePipeline.getDateUpdated() != null) {
            String dateUpdated = imagePipeline.getDateUpdated();
            jsonWriter.name("dateUpdated");
            jsonWriter.value(dateUpdated);
        }
        if (imagePipeline.getDateLastRun() != null) {
            String dateLastRun = imagePipeline.getDateLastRun();
            jsonWriter.name("dateLastRun");
            jsonWriter.value(dateLastRun);
        }
        if (imagePipeline.getDateNextRun() != null) {
            String dateNextRun = imagePipeline.getDateNextRun();
            jsonWriter.name("dateNextRun");
            jsonWriter.value(dateNextRun);
        }
        if (imagePipeline.getTags() != null) {
            java.util.Map<String, String> tags = imagePipeline.getTags();
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

    private static ImagePipelineJsonMarshaller instance;

    public static ImagePipelineJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImagePipelineJsonMarshaller();
        return instance;
    }
}
