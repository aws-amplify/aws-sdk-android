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
 * JSON marshaller for POJO SavingsPlansCoverageData
 */
class SavingsPlansCoverageDataJsonMarshaller {

    public void marshall(SavingsPlansCoverageData savingsPlansCoverageData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansCoverageData.getSpendCoveredBySavingsPlans() != null) {
            String spendCoveredBySavingsPlans = savingsPlansCoverageData
                    .getSpendCoveredBySavingsPlans();
            jsonWriter.name("SpendCoveredBySavingsPlans");
            jsonWriter.value(spendCoveredBySavingsPlans);
        }
        if (savingsPlansCoverageData.getOnDemandCost() != null) {
            String onDemandCost = savingsPlansCoverageData.getOnDemandCost();
            jsonWriter.name("OnDemandCost");
            jsonWriter.value(onDemandCost);
        }
        if (savingsPlansCoverageData.getTotalCost() != null) {
            String totalCost = savingsPlansCoverageData.getTotalCost();
            jsonWriter.name("TotalCost");
            jsonWriter.value(totalCost);
        }
        if (savingsPlansCoverageData.getCoveragePercentage() != null) {
            String coveragePercentage = savingsPlansCoverageData.getCoveragePercentage();
            jsonWriter.name("CoveragePercentage");
            jsonWriter.value(coveragePercentage);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansCoverageDataJsonMarshaller instance;

    public static SavingsPlansCoverageDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansCoverageDataJsonMarshaller();
        return instance;
    }
}
