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
 * JSON marshaller for POJO ProvisionedProductPlanDetails
 */
class ProvisionedProductPlanDetailsJsonMarshaller {

    public void marshall(ProvisionedProductPlanDetails provisionedProductPlanDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisionedProductPlanDetails.getCreatedTime() != null) {
            java.util.Date createdTime = provisionedProductPlanDetails.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (provisionedProductPlanDetails.getPathId() != null) {
            String pathId = provisionedProductPlanDetails.getPathId();
            jsonWriter.name("PathId");
            jsonWriter.value(pathId);
        }
        if (provisionedProductPlanDetails.getProductId() != null) {
            String productId = provisionedProductPlanDetails.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (provisionedProductPlanDetails.getPlanName() != null) {
            String planName = provisionedProductPlanDetails.getPlanName();
            jsonWriter.name("PlanName");
            jsonWriter.value(planName);
        }
        if (provisionedProductPlanDetails.getPlanId() != null) {
            String planId = provisionedProductPlanDetails.getPlanId();
            jsonWriter.name("PlanId");
            jsonWriter.value(planId);
        }
        if (provisionedProductPlanDetails.getProvisionProductId() != null) {
            String provisionProductId = provisionedProductPlanDetails.getProvisionProductId();
            jsonWriter.name("ProvisionProductId");
            jsonWriter.value(provisionProductId);
        }
        if (provisionedProductPlanDetails.getProvisionProductName() != null) {
            String provisionProductName = provisionedProductPlanDetails.getProvisionProductName();
            jsonWriter.name("ProvisionProductName");
            jsonWriter.value(provisionProductName);
        }
        if (provisionedProductPlanDetails.getPlanType() != null) {
            String planType = provisionedProductPlanDetails.getPlanType();
            jsonWriter.name("PlanType");
            jsonWriter.value(planType);
        }
        if (provisionedProductPlanDetails.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = provisionedProductPlanDetails
                    .getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        if (provisionedProductPlanDetails.getStatus() != null) {
            String status = provisionedProductPlanDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (provisionedProductPlanDetails.getUpdatedTime() != null) {
            java.util.Date updatedTime = provisionedProductPlanDetails.getUpdatedTime();
            jsonWriter.name("UpdatedTime");
            jsonWriter.value(updatedTime);
        }
        if (provisionedProductPlanDetails.getNotificationArns() != null) {
            java.util.List<String> notificationArns = provisionedProductPlanDetails
                    .getNotificationArns();
            jsonWriter.name("NotificationArns");
            jsonWriter.beginArray();
            for (String notificationArnsItem : notificationArns) {
                if (notificationArnsItem != null) {
                    jsonWriter.value(notificationArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (provisionedProductPlanDetails.getProvisioningParameters() != null) {
            java.util.List<UpdateProvisioningParameter> provisioningParameters = provisionedProductPlanDetails
                    .getProvisioningParameters();
            jsonWriter.name("ProvisioningParameters");
            jsonWriter.beginArray();
            for (UpdateProvisioningParameter provisioningParametersItem : provisioningParameters) {
                if (provisioningParametersItem != null) {
                    UpdateProvisioningParameterJsonMarshaller.getInstance().marshall(
                            provisioningParametersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (provisionedProductPlanDetails.getTags() != null) {
            java.util.List<Tag> tags = provisionedProductPlanDetails.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (provisionedProductPlanDetails.getStatusMessage() != null) {
            String statusMessage = provisionedProductPlanDetails.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedProductPlanDetailsJsonMarshaller instance;

    public static ProvisionedProductPlanDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductPlanDetailsJsonMarshaller();
        return instance;
    }
}
