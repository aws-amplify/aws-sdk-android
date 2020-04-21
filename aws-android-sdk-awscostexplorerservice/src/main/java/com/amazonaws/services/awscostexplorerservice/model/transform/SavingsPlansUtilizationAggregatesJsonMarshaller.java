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
 * JSON marshaller for POJO SavingsPlansUtilizationAggregates
 */
class SavingsPlansUtilizationAggregatesJsonMarshaller {

    public void marshall(SavingsPlansUtilizationAggregates savingsPlansUtilizationAggregates,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansUtilizationAggregates.getUtilization() != null) {
            SavingsPlansUtilization utilization = savingsPlansUtilizationAggregates
                    .getUtilization();
            jsonWriter.name("Utilization");
            SavingsPlansUtilizationJsonMarshaller.getInstance().marshall(utilization, jsonWriter);
        }
        if (savingsPlansUtilizationAggregates.getSavings() != null) {
            SavingsPlansSavings savings = savingsPlansUtilizationAggregates.getSavings();
            jsonWriter.name("Savings");
            SavingsPlansSavingsJsonMarshaller.getInstance().marshall(savings, jsonWriter);
        }
        if (savingsPlansUtilizationAggregates.getAmortizedCommitment() != null) {
            SavingsPlansAmortizedCommitment amortizedCommitment = savingsPlansUtilizationAggregates
                    .getAmortizedCommitment();
            jsonWriter.name("AmortizedCommitment");
            SavingsPlansAmortizedCommitmentJsonMarshaller.getInstance().marshall(
                    amortizedCommitment, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansUtilizationAggregatesJsonMarshaller instance;

    public static SavingsPlansUtilizationAggregatesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationAggregatesJsonMarshaller();
        return instance;
    }
}
