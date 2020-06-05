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
 * JSON marshaller for POJO ProvisionedProductAttribute
 */
class ProvisionedProductAttributeJsonMarshaller {

    public void marshall(ProvisionedProductAttribute provisionedProductAttribute,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisionedProductAttribute.getName() != null) {
            String name = provisionedProductAttribute.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (provisionedProductAttribute.getArn() != null) {
            String arn = provisionedProductAttribute.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (provisionedProductAttribute.getType() != null) {
            String type = provisionedProductAttribute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (provisionedProductAttribute.getId() != null) {
            String id = provisionedProductAttribute.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (provisionedProductAttribute.getStatus() != null) {
            String status = provisionedProductAttribute.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (provisionedProductAttribute.getStatusMessage() != null) {
            String statusMessage = provisionedProductAttribute.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (provisionedProductAttribute.getCreatedTime() != null) {
            java.util.Date createdTime = provisionedProductAttribute.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (provisionedProductAttribute.getIdempotencyToken() != null) {
            String idempotencyToken = provisionedProductAttribute.getIdempotencyToken();
            jsonWriter.name("IdempotencyToken");
            jsonWriter.value(idempotencyToken);
        }
        if (provisionedProductAttribute.getLastRecordId() != null) {
            String lastRecordId = provisionedProductAttribute.getLastRecordId();
            jsonWriter.name("LastRecordId");
            jsonWriter.value(lastRecordId);
        }
        if (provisionedProductAttribute.getTags() != null) {
            java.util.List<Tag> tags = provisionedProductAttribute.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (provisionedProductAttribute.getPhysicalId() != null) {
            String physicalId = provisionedProductAttribute.getPhysicalId();
            jsonWriter.name("PhysicalId");
            jsonWriter.value(physicalId);
        }
        if (provisionedProductAttribute.getProductId() != null) {
            String productId = provisionedProductAttribute.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (provisionedProductAttribute.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = provisionedProductAttribute.getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        if (provisionedProductAttribute.getUserArn() != null) {
            String userArn = provisionedProductAttribute.getUserArn();
            jsonWriter.name("UserArn");
            jsonWriter.value(userArn);
        }
        if (provisionedProductAttribute.getUserArnSession() != null) {
            String userArnSession = provisionedProductAttribute.getUserArnSession();
            jsonWriter.name("UserArnSession");
            jsonWriter.value(userArnSession);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedProductAttributeJsonMarshaller instance;

    public static ProvisionedProductAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductAttributeJsonMarshaller();
        return instance;
    }
}
