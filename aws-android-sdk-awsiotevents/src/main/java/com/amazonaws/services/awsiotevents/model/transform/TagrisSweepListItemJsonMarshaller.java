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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TagrisSweepListItem
 */
class TagrisSweepListItemJsonMarshaller {

    public void marshall(TagrisSweepListItem tagrisSweepListItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tagrisSweepListItem.getTagrisAccountId() != null) {
            String tagrisAccountId = tagrisSweepListItem.getTagrisAccountId();
            jsonWriter.name("TagrisAccountId");
            jsonWriter.value(tagrisAccountId);
        }
        if (tagrisSweepListItem.getTagrisAmazonResourceName() != null) {
            String tagrisAmazonResourceName = tagrisSweepListItem.getTagrisAmazonResourceName();
            jsonWriter.name("TagrisAmazonResourceName");
            jsonWriter.value(tagrisAmazonResourceName);
        }
        if (tagrisSweepListItem.getTagrisInternalId() != null) {
            String tagrisInternalId = tagrisSweepListItem.getTagrisInternalId();
            jsonWriter.name("TagrisInternalId");
            jsonWriter.value(tagrisInternalId);
        }
        if (tagrisSweepListItem.getTagrisVersion() != null) {
            Long tagrisVersion = tagrisSweepListItem.getTagrisVersion();
            jsonWriter.name("TagrisVersion");
            jsonWriter.value(tagrisVersion);
        }
        jsonWriter.endObject();
    }

    private static TagrisSweepListItemJsonMarshaller instance;

    public static TagrisSweepListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagrisSweepListItemJsonMarshaller();
        return instance;
    }
}
