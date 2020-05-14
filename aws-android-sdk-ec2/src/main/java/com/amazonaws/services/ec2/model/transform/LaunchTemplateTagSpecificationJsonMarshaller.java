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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LaunchTemplateTagSpecification
 */
class LaunchTemplateTagSpecificationJsonMarshaller {

    public void marshall(LaunchTemplateTagSpecification launchTemplateTagSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateTagSpecification.getResourceType() != null) {
            String resourceType = launchTemplateTagSpecification.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (launchTemplateTagSpecification.getTags() != null) {
            java.util.List<Tag> tags = launchTemplateTagSpecification.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateTagSpecificationJsonMarshaller instance;

    public static LaunchTemplateTagSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateTagSpecificationJsonMarshaller();
        return instance;
    }
}
