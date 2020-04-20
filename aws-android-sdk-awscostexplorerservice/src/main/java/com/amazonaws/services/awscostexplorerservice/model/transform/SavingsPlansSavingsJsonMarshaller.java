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
 * JSON marshaller for POJO SavingsPlansSavings
 */
class SavingsPlansSavingsJsonMarshaller {

    public void marshall(SavingsPlansSavings savingsPlansSavings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansSavings.getNetSavings() != null) {
            String netSavings = savingsPlansSavings.getNetSavings();
            jsonWriter.name("NetSavings");
            jsonWriter.value(netSavings);
        }
        if (savingsPlansSavings.getOnDemandCostEquivalent() != null) {
            String onDemandCostEquivalent = savingsPlansSavings.getOnDemandCostEquivalent();
            jsonWriter.name("OnDemandCostEquivalent");
            jsonWriter.value(onDemandCostEquivalent);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansSavingsJsonMarshaller instance;

    public static SavingsPlansSavingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansSavingsJsonMarshaller();
        return instance;
    }
}
