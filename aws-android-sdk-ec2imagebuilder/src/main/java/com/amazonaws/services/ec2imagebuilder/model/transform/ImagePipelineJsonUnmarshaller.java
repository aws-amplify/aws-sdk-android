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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImagePipeline
 */
class ImagePipelineJsonUnmarshaller implements Unmarshaller<ImagePipeline, JsonUnmarshallerContext> {

    public ImagePipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImagePipeline imagePipeline = new ImagePipeline();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                imagePipeline.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                imagePipeline.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                imagePipeline.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platform")) {
                imagePipeline.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enhancedImageMetadataEnabled")) {
                imagePipeline.setEnhancedImageMetadataEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageRecipeArn")) {
                imagePipeline.setImageRecipeArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("infrastructureConfigurationArn")) {
                imagePipeline.setInfrastructureConfigurationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("distributionConfigurationArn")) {
                imagePipeline.setDistributionConfigurationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageTestsConfiguration")) {
                imagePipeline.setImageTestsConfiguration(ImageTestsConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("schedule")) {
                imagePipeline.setSchedule(ScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                imagePipeline.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateCreated")) {
                imagePipeline.setDateCreated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateUpdated")) {
                imagePipeline.setDateUpdated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateLastRun")) {
                imagePipeline.setDateLastRun(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateNextRun")) {
                imagePipeline.setDateNextRun(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                imagePipeline.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imagePipeline;
    }

    private static ImagePipelineJsonUnmarshaller instance;

    public static ImagePipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImagePipelineJsonUnmarshaller();
        return instance;
    }
}
