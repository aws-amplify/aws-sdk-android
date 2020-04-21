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
 * JSON marshaller for POJO SavingsPlansUtilizationDetail
 */
class SavingsPlansUtilizationDetailJsonMarshaller {

    public void marshall(SavingsPlansUtilizationDetail savingsPlansUtilizationDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansUtilizationDetail.getSavingsPlanArn() != null) {
            String savingsPlanArn = savingsPlansUtilizationDetail.getSavingsPlanArn();
            jsonWriter.name("SavingsPlanArn");
            jsonWriter.value(savingsPlanArn);
        }
        if (savingsPlansUtilizationDetail.getAttributes() != null) {
            java.util.Map<String, String> attributes = savingsPlansUtilizationDetail
                    .getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (savingsPlansUtilizationDetail.getUtilization() != null) {
            SavingsPlansUtilization utilization = savingsPlansUtilizationDetail.getUtilization();
            jsonWriter.name("Utilization");
            SavingsPlansUtilizationJsonMarshaller.getInstance().marshall(utilization, jsonWriter);
        }
        if (savingsPlansUtilizationDetail.getSavings() != null) {
            SavingsPlansSavings savings = savingsPlansUtilizationDetail.getSavings();
            jsonWriter.name("Savings");
            SavingsPlansSavingsJsonMarshaller.getInstance().marshall(savings, jsonWriter);
        }
        if (savingsPlansUtilizationDetail.getAmortizedCommitment() != null) {
            SavingsPlansAmortizedCommitment amortizedCommitment = savingsPlansUtilizationDetail
                    .getAmortizedCommitment();
            jsonWriter.name("AmortizedCommitment");
            SavingsPlansAmortizedCommitmentJsonMarshaller.getInstance().marshall(
                    amortizedCommitment, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansUtilizationDetailJsonMarshaller instance;

    public static SavingsPlansUtilizationDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationDetailJsonMarshaller();
        return instance;
    }
}
