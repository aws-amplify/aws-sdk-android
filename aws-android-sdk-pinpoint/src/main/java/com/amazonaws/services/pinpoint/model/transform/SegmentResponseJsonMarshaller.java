/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SegmentResponse
 */
class SegmentResponseJsonMarshaller {

    public void marshall(SegmentResponse segmentResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (segmentResponse.getApplicationId() != null) {
            String applicationId = segmentResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (segmentResponse.getCreationDate() != null) {
            String creationDate = segmentResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (segmentResponse.getDimensions() != null) {
            SegmentDimensions dimensions = segmentResponse.getDimensions();
            jsonWriter.name("Dimensions");
            SegmentDimensionsJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (segmentResponse.getId() != null) {
            String id = segmentResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (segmentResponse.getImportDefinition() != null) {
            SegmentImportResource importDefinition = segmentResponse.getImportDefinition();
            jsonWriter.name("ImportDefinition");
            SegmentImportResourceJsonMarshaller.getInstance()
                    .marshall(importDefinition, jsonWriter);
        }
        if (segmentResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = segmentResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (segmentResponse.getName() != null) {
            String name = segmentResponse.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (segmentResponse.getSegmentGroups() != null) {
            SegmentGroupList segmentGroups = segmentResponse.getSegmentGroups();
            jsonWriter.name("SegmentGroups");
            SegmentGroupListJsonMarshaller.getInstance().marshall(segmentGroups, jsonWriter);
        }
        if (segmentResponse.getSegmentType() != null) {
            String segmentType = segmentResponse.getSegmentType();
            jsonWriter.name("SegmentType");
            jsonWriter.value(segmentType);
        }
        if (segmentResponse.getVersion() != null) {
            Integer version = segmentResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static SegmentResponseJsonMarshaller instance;

    public static SegmentResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentResponseJsonMarshaller();
        return instance;
    }
}
