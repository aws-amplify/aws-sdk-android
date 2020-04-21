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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetInstance
 */
class TargetInstanceJsonMarshaller {

    public void marshall(TargetInstance targetInstance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetInstance.getEstimatedMonthlyCost() != null) {
            String estimatedMonthlyCost = targetInstance.getEstimatedMonthlyCost();
            jsonWriter.name("EstimatedMonthlyCost");
            jsonWriter.value(estimatedMonthlyCost);
        }
        if (targetInstance.getEstimatedMonthlySavings() != null) {
            String estimatedMonthlySavings = targetInstance.getEstimatedMonthlySavings();
            jsonWriter.name("EstimatedMonthlySavings");
            jsonWriter.value(estimatedMonthlySavings);
        }
        if (targetInstance.getCurrencyCode() != null) {
            String currencyCode = targetInstance.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (targetInstance.getDefaultTargetInstance() != null) {
            Boolean defaultTargetInstance = targetInstance.getDefaultTargetInstance();
            jsonWriter.name("DefaultTargetInstance");
            jsonWriter.value(defaultTargetInstance);
        }
        if (targetInstance.getResourceDetails() != null) {
            ResourceDetails resourceDetails = targetInstance.getResourceDetails();
            jsonWriter.name("ResourceDetails");
            ResourceDetailsJsonMarshaller.getInstance().marshall(resourceDetails, jsonWriter);
        }
        if (targetInstance.getExpectedResourceUtilization() != null) {
            ResourceUtilization expectedResourceUtilization = targetInstance
                    .getExpectedResourceUtilization();
            jsonWriter.name("ExpectedResourceUtilization");
            ResourceUtilizationJsonMarshaller.getInstance().marshall(expectedResourceUtilization,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TargetInstanceJsonMarshaller instance;

    public static TargetInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetInstanceJsonMarshaller();
        return instance;
    }
}
