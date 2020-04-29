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

package com.amazonaws.services.awswafregional.model.transform;

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TagInfoForResource
 */
class TagInfoForResourceJsonMarshaller {

    public void marshall(TagInfoForResource tagInfoForResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tagInfoForResource.getResourceARN() != null) {
            String resourceARN = tagInfoForResource.getResourceARN();
            jsonWriter.name("ResourceARN");
            jsonWriter.value(resourceARN);
        }
        if (tagInfoForResource.getTagList() != null) {
            java.util.List<Tag> tagList = tagInfoForResource.getTagList();
            jsonWriter.name("TagList");
            jsonWriter.beginArray();
            for (Tag tagListItem : tagList) {
                if (tagListItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TagInfoForResourceJsonMarshaller instance;

    public static TagInfoForResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagInfoForResourceJsonMarshaller();
        return instance;
    }
}
