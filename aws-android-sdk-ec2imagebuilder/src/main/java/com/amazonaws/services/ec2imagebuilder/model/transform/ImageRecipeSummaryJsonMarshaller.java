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
 * JSON marshaller for POJO ImageRecipeSummary
 */
class ImageRecipeSummaryJsonMarshaller {

    public void marshall(ImageRecipeSummary imageRecipeSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (imageRecipeSummary.getArn() != null) {
            String arn = imageRecipeSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (imageRecipeSummary.getName() != null) {
            String name = imageRecipeSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (imageRecipeSummary.getPlatform() != null) {
            String platform = imageRecipeSummary.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (imageRecipeSummary.getOwner() != null) {
            String owner = imageRecipeSummary.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (imageRecipeSummary.getParentImage() != null) {
            String parentImage = imageRecipeSummary.getParentImage();
            jsonWriter.name("parentImage");
            jsonWriter.value(parentImage);
        }
        if (imageRecipeSummary.getDateCreated() != null) {
            String dateCreated = imageRecipeSummary.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (imageRecipeSummary.getTags() != null) {
            java.util.Map<String, String> tags = imageRecipeSummary.getTags();
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

    private static ImageRecipeSummaryJsonMarshaller instance;

    public static ImageRecipeSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageRecipeSummaryJsonMarshaller();
        return instance;
    }
}
