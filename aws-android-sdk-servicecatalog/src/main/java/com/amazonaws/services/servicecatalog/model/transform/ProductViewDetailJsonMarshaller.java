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
 * JSON marshaller for POJO ProductViewDetail
 */
class ProductViewDetailJsonMarshaller {

    public void marshall(ProductViewDetail productViewDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (productViewDetail.getProductViewSummary() != null) {
            ProductViewSummary productViewSummary = productViewDetail.getProductViewSummary();
            jsonWriter.name("ProductViewSummary");
            ProductViewSummaryJsonMarshaller.getInstance().marshall(productViewSummary, jsonWriter);
        }
        if (productViewDetail.getStatus() != null) {
            String status = productViewDetail.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (productViewDetail.getProductARN() != null) {
            String productARN = productViewDetail.getProductARN();
            jsonWriter.name("ProductARN");
            jsonWriter.value(productARN);
        }
        if (productViewDetail.getCreatedTime() != null) {
            java.util.Date createdTime = productViewDetail.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static ProductViewDetailJsonMarshaller instance;

    public static ProductViewDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductViewDetailJsonMarshaller();
        return instance;
    }
}
