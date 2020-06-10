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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProductViewSummary
 */
class ProductViewSummaryJsonMarshaller {

    public void marshall(ProductViewSummary productViewSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (productViewSummary.getId() != null) {
            String id = productViewSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (productViewSummary.getProductId() != null) {
            String productId = productViewSummary.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (productViewSummary.getName() != null) {
            String name = productViewSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (productViewSummary.getOwner() != null) {
            String owner = productViewSummary.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (productViewSummary.getShortDescription() != null) {
            String shortDescription = productViewSummary.getShortDescription();
            jsonWriter.name("ShortDescription");
            jsonWriter.value(shortDescription);
        }
        if (productViewSummary.getType() != null) {
            String type = productViewSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (productViewSummary.getDistributor() != null) {
            String distributor = productViewSummary.getDistributor();
            jsonWriter.name("Distributor");
            jsonWriter.value(distributor);
        }
        if (productViewSummary.getHasDefaultPath() != null) {
            Boolean hasDefaultPath = productViewSummary.getHasDefaultPath();
            jsonWriter.name("HasDefaultPath");
            jsonWriter.value(hasDefaultPath);
        }
        if (productViewSummary.getSupportEmail() != null) {
            String supportEmail = productViewSummary.getSupportEmail();
            jsonWriter.name("SupportEmail");
            jsonWriter.value(supportEmail);
        }
        if (productViewSummary.getSupportDescription() != null) {
            String supportDescription = productViewSummary.getSupportDescription();
            jsonWriter.name("SupportDescription");
            jsonWriter.value(supportDescription);
        }
        if (productViewSummary.getSupportUrl() != null) {
            String supportUrl = productViewSummary.getSupportUrl();
            jsonWriter.name("SupportUrl");
            jsonWriter.value(supportUrl);
        }
        jsonWriter.endObject();
    }

    private static ProductViewSummaryJsonMarshaller instance;

    public static ProductViewSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductViewSummaryJsonMarshaller();
        return instance;
    }
}
