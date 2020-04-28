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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageScanFinding
 */
class ImageScanFindingJsonMarshaller {

    public void marshall(ImageScanFinding imageScanFinding, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (imageScanFinding.getName() != null) {
            String name = imageScanFinding.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (imageScanFinding.getDescription() != null) {
            String description = imageScanFinding.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (imageScanFinding.getUri() != null) {
            String uri = imageScanFinding.getUri();
            jsonWriter.name("uri");
            jsonWriter.value(uri);
        }
        if (imageScanFinding.getSeverity() != null) {
            String severity = imageScanFinding.getSeverity();
            jsonWriter.name("severity");
            jsonWriter.value(severity);
        }
        if (imageScanFinding.getAttributes() != null) {
            java.util.List<Attribute> attributes = imageScanFinding.getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginArray();
            for (Attribute attributesItem : attributes) {
                if (attributesItem != null) {
                    AttributeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ImageScanFindingJsonMarshaller instance;

    public static ImageScanFindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageScanFindingJsonMarshaller();
        return instance;
    }
}
