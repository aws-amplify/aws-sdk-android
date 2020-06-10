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
 * JSON marshaller for POJO ConstraintDetail
 */
class ConstraintDetailJsonMarshaller {

    public void marshall(ConstraintDetail constraintDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (constraintDetail.getConstraintId() != null) {
            String constraintId = constraintDetail.getConstraintId();
            jsonWriter.name("ConstraintId");
            jsonWriter.value(constraintId);
        }
        if (constraintDetail.getType() != null) {
            String type = constraintDetail.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (constraintDetail.getDescription() != null) {
            String description = constraintDetail.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (constraintDetail.getOwner() != null) {
            String owner = constraintDetail.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (constraintDetail.getProductId() != null) {
            String productId = constraintDetail.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (constraintDetail.getPortfolioId() != null) {
            String portfolioId = constraintDetail.getPortfolioId();
            jsonWriter.name("PortfolioId");
            jsonWriter.value(portfolioId);
        }
        jsonWriter.endObject();
    }

    private static ConstraintDetailJsonMarshaller instance;

    public static ConstraintDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConstraintDetailJsonMarshaller();
        return instance;
    }
}
