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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceTag
 */
class ResourceTagJsonMarshaller {

    public void marshall(ResourceTag resourceTag, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceTag.getResourceArn() != null) {
            String resourceArn = resourceTag.getResourceArn();
            jsonWriter.name("resourceArn");
            jsonWriter.value(resourceArn);
        }
        if (resourceTag.getTags() != null) {
            java.util.List<Tag> tags = resourceTag.getTags();
            jsonWriter.name("tags");
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

    private static ResourceTagJsonMarshaller instance;

    public static ResourceTagJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTagJsonMarshaller();
        return instance;
    }
}
