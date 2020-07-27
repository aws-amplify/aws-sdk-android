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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Patch
 */
class PatchJsonMarshaller {

    public void marshall(Patch patch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patch.getId() != null) {
            String id = patch.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (patch.getReleaseDate() != null) {
            java.util.Date releaseDate = patch.getReleaseDate();
            jsonWriter.name("ReleaseDate");
            jsonWriter.value(releaseDate);
        }
        if (patch.getTitle() != null) {
            String title = patch.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (patch.getDescription() != null) {
            String description = patch.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (patch.getContentUrl() != null) {
            String contentUrl = patch.getContentUrl();
            jsonWriter.name("ContentUrl");
            jsonWriter.value(contentUrl);
        }
        if (patch.getVendor() != null) {
            String vendor = patch.getVendor();
            jsonWriter.name("Vendor");
            jsonWriter.value(vendor);
        }
        if (patch.getProductFamily() != null) {
            String productFamily = patch.getProductFamily();
            jsonWriter.name("ProductFamily");
            jsonWriter.value(productFamily);
        }
        if (patch.getProduct() != null) {
            String product = patch.getProduct();
            jsonWriter.name("Product");
            jsonWriter.value(product);
        }
        if (patch.getClassification() != null) {
            String classification = patch.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (patch.getMsrcSeverity() != null) {
            String msrcSeverity = patch.getMsrcSeverity();
            jsonWriter.name("MsrcSeverity");
            jsonWriter.value(msrcSeverity);
        }
        if (patch.getKbNumber() != null) {
            String kbNumber = patch.getKbNumber();
            jsonWriter.name("KbNumber");
            jsonWriter.value(kbNumber);
        }
        if (patch.getMsrcNumber() != null) {
            String msrcNumber = patch.getMsrcNumber();
            jsonWriter.name("MsrcNumber");
            jsonWriter.value(msrcNumber);
        }
        if (patch.getLanguage() != null) {
            String language = patch.getLanguage();
            jsonWriter.name("Language");
            jsonWriter.value(language);
        }
        jsonWriter.endObject();
    }

    private static PatchJsonMarshaller instance;
    public static PatchJsonMarshaller getInstance() {
        if (instance == null) instance = new PatchJsonMarshaller();
        return instance;
    }
}
