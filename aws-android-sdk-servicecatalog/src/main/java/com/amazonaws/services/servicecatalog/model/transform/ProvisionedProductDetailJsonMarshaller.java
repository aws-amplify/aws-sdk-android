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
 * JSON marshaller for POJO ProvisionedProductDetail
 */
class ProvisionedProductDetailJsonMarshaller {

    public void marshall(ProvisionedProductDetail provisionedProductDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (provisionedProductDetail.getName() != null) {
            String name = provisionedProductDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (provisionedProductDetail.getArn() != null) {
            String arn = provisionedProductDetail.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (provisionedProductDetail.getType() != null) {
            String type = provisionedProductDetail.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (provisionedProductDetail.getId() != null) {
            String id = provisionedProductDetail.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (provisionedProductDetail.getStatus() != null) {
            String status = provisionedProductDetail.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (provisionedProductDetail.getStatusMessage() != null) {
            String statusMessage = provisionedProductDetail.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (provisionedProductDetail.getCreatedTime() != null) {
            java.util.Date createdTime = provisionedProductDetail.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (provisionedProductDetail.getIdempotencyToken() != null) {
            String idempotencyToken = provisionedProductDetail.getIdempotencyToken();
            jsonWriter.name("IdempotencyToken");
            jsonWriter.value(idempotencyToken);
        }
        if (provisionedProductDetail.getLastRecordId() != null) {
            String lastRecordId = provisionedProductDetail.getLastRecordId();
            jsonWriter.name("LastRecordId");
            jsonWriter.value(lastRecordId);
        }
        if (provisionedProductDetail.getProductId() != null) {
            String productId = provisionedProductDetail.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (provisionedProductDetail.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = provisionedProductDetail.getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedProductDetailJsonMarshaller instance;

    public static ProvisionedProductDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductDetailJsonMarshaller();
        return instance;
    }
}
