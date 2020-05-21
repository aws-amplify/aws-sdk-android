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
 * JSON marshaller for POJO TagSpecification
 */
class TagSpecificationJsonMarshaller {

    public void marshall(TagSpecification tagSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tagSpecification.getResourceType() != null) {
            String resourceType = tagSpecification.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (tagSpecification.getTags() != null) {
            java.util.List<Tag> tags = tagSpecification.getTags();
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

    private static TagSpecificationJsonMarshaller instance;

    public static TagSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagSpecificationJsonMarshaller();
        return instance;
    }
}
