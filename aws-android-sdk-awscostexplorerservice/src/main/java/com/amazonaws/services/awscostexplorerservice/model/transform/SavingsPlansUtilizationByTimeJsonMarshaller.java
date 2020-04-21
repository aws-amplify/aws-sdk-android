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
 * JSON marshaller for POJO SavingsPlansUtilizationByTime
 */
class SavingsPlansUtilizationByTimeJsonMarshaller {

    public void marshall(SavingsPlansUtilizationByTime savingsPlansUtilizationByTime,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansUtilizationByTime.getTimePeriod() != null) {
            DateInterval timePeriod = savingsPlansUtilizationByTime.getTimePeriod();
            jsonWriter.name("TimePeriod");
            DateIntervalJsonMarshaller.getInstance().marshall(timePeriod, jsonWriter);
        }
        if (savingsPlansUtilizationByTime.getUtilization() != null) {
            SavingsPlansUtilization utilization = savingsPlansUtilizationByTime.getUtilization();
            jsonWriter.name("Utilization");
            SavingsPlansUtilizationJsonMarshaller.getInstance().marshall(utilization, jsonWriter);
        }
        if (savingsPlansUtilizationByTime.getSavings() != null) {
            SavingsPlansSavings savings = savingsPlansUtilizationByTime.getSavings();
            jsonWriter.name("Savings");
            SavingsPlansSavingsJsonMarshaller.getInstance().marshall(savings, jsonWriter);
        }
        if (savingsPlansUtilizationByTime.getAmortizedCommitment() != null) {
            SavingsPlansAmortizedCommitment amortizedCommitment = savingsPlansUtilizationByTime
                    .getAmortizedCommitment();
            jsonWriter.name("AmortizedCommitment");
            SavingsPlansAmortizedCommitmentJsonMarshaller.getInstance().marshall(
                    amortizedCommitment, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansUtilizationByTimeJsonMarshaller instance;

    public static SavingsPlansUtilizationByTimeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationByTimeJsonMarshaller();
        return instance;
    }
}
