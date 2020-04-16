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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Product
 */
class ProductJsonMarshaller {

    public void marshall(Product product, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (product.getProductArn() != null) {
            String productArn = product.getProductArn();
            jsonWriter.name("ProductArn");
            jsonWriter.value(productArn);
        }
        if (product.getProductName() != null) {
            String productName = product.getProductName();
            jsonWriter.name("ProductName");
            jsonWriter.value(productName);
        }
        if (product.getCompanyName() != null) {
            String companyName = product.getCompanyName();
            jsonWriter.name("CompanyName");
            jsonWriter.value(companyName);
        }
        if (product.getDescription() != null) {
            String description = product.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (product.getCategories() != null) {
            java.util.List<String> categories = product.getCategories();
            jsonWriter.name("Categories");
            jsonWriter.beginArray();
            for (String categoriesItem : categories) {
                if (categoriesItem != null) {
                    jsonWriter.value(categoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (product.getIntegrationTypes() != null) {
            java.util.List<String> integrationTypes = product.getIntegrationTypes();
            jsonWriter.name("IntegrationTypes");
            jsonWriter.beginArray();
            for (String integrationTypesItem : integrationTypes) {
                if (integrationTypesItem != null) {
                    jsonWriter.value(integrationTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (product.getMarketplaceUrl() != null) {
            String marketplaceUrl = product.getMarketplaceUrl();
            jsonWriter.name("MarketplaceUrl");
            jsonWriter.value(marketplaceUrl);
        }
        if (product.getActivationUrl() != null) {
            String activationUrl = product.getActivationUrl();
            jsonWriter.name("ActivationUrl");
            jsonWriter.value(activationUrl);
        }
        if (product.getProductSubscriptionResourcePolicy() != null) {
            String productSubscriptionResourcePolicy = product
                    .getProductSubscriptionResourcePolicy();
            jsonWriter.name("ProductSubscriptionResourcePolicy");
            jsonWriter.value(productSubscriptionResourcePolicy);
        }
        jsonWriter.endObject();
    }

    private static ProductJsonMarshaller instance;

    public static ProductJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductJsonMarshaller();
        return instance;
    }
}
