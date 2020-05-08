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

package com.amazonaws.services.tagging.model.transform;

import com.amazonaws.services.tagging.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceTagMapping
 */
class ResourceTagMappingJsonMarshaller {

    public void marshall(ResourceTagMapping resourceTagMapping, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceTagMapping.getResourceARN() != null) {
            String resourceARN = resourceTagMapping.getResourceARN();
            jsonWriter.name("ResourceARN");
            jsonWriter.value(resourceARN);
        }
        if (resourceTagMapping.getTags() != null) {
            java.util.List<Tag> tags = resourceTagMapping.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (resourceTagMapping.getComplianceDetails() != null) {
            ComplianceDetails complianceDetails = resourceTagMapping.getComplianceDetails();
            jsonWriter.name("ComplianceDetails");
            ComplianceDetailsJsonMarshaller.getInstance().marshall(complianceDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResourceTagMappingJsonMarshaller instance;

    public static ResourceTagMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTagMappingJsonMarshaller();
        return instance;
    }
}
