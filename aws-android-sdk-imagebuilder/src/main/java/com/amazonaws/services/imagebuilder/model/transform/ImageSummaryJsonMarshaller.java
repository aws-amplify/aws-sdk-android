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
 * JSON marshaller for POJO ImageSummary
 */
class ImageSummaryJsonMarshaller {

    public void marshall(ImageSummary imageSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageSummary.getArn() != null) {
            String arn = imageSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (imageSummary.getName() != null) {
            String name = imageSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (imageSummary.getVersion() != null) {
            String version = imageSummary.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (imageSummary.getPlatform() != null) {
            String platform = imageSummary.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (imageSummary.getOsVersion() != null) {
            String osVersion = imageSummary.getOsVersion();
            jsonWriter.name("osVersion");
            jsonWriter.value(osVersion);
        }
        if (imageSummary.getState() != null) {
            ImageState state = imageSummary.getState();
            jsonWriter.name("state");
            ImageStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (imageSummary.getOwner() != null) {
            String owner = imageSummary.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (imageSummary.getDateCreated() != null) {
            String dateCreated = imageSummary.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (imageSummary.getOutputResources() != null) {
            OutputResources outputResources = imageSummary.getOutputResources();
            jsonWriter.name("outputResources");
            OutputResourcesJsonMarshaller.getInstance().marshall(outputResources, jsonWriter);
        }
        if (imageSummary.getTags() != null) {
            java.util.Map<String, String> tags = imageSummary.getTags();
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

    private static ImageSummaryJsonMarshaller instance;

    public static ImageSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageSummaryJsonMarshaller();
        return instance;
    }
}
