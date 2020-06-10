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
 * JSON marshaller for POJO ProvisionedProductPlanSummary
 */
class ProvisionedProductPlanSummaryJsonMarshaller {

    public void marshall(ProvisionedProductPlanSummary provisionedProductPlanSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisionedProductPlanSummary.getPlanName() != null) {
            String planName = provisionedProductPlanSummary.getPlanName();
            jsonWriter.name("PlanName");
            jsonWriter.value(planName);
        }
        if (provisionedProductPlanSummary.getPlanId() != null) {
            String planId = provisionedProductPlanSummary.getPlanId();
            jsonWriter.name("PlanId");
            jsonWriter.value(planId);
        }
        if (provisionedProductPlanSummary.getProvisionProductId() != null) {
            String provisionProductId = provisionedProductPlanSummary.getProvisionProductId();
            jsonWriter.name("ProvisionProductId");
            jsonWriter.value(provisionProductId);
        }
        if (provisionedProductPlanSummary.getProvisionProductName() != null) {
            String provisionProductName = provisionedProductPlanSummary.getProvisionProductName();
            jsonWriter.name("ProvisionProductName");
            jsonWriter.value(provisionProductName);
        }
        if (provisionedProductPlanSummary.getPlanType() != null) {
            String planType = provisionedProductPlanSummary.getPlanType();
            jsonWriter.name("PlanType");
            jsonWriter.value(planType);
        }
        if (provisionedProductPlanSummary.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = provisionedProductPlanSummary
                    .getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedProductPlanSummaryJsonMarshaller instance;

    public static ProvisionedProductPlanSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductPlanSummaryJsonMarshaller();
        return instance;
    }
}
