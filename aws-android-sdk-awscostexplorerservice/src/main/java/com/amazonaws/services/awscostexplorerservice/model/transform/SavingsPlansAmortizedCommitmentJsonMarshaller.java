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
 * JSON marshaller for POJO SavingsPlansAmortizedCommitment
 */
class SavingsPlansAmortizedCommitmentJsonMarshaller {

    public void marshall(SavingsPlansAmortizedCommitment savingsPlansAmortizedCommitment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansAmortizedCommitment.getAmortizedRecurringCommitment() != null) {
            String amortizedRecurringCommitment = savingsPlansAmortizedCommitment
                    .getAmortizedRecurringCommitment();
            jsonWriter.name("AmortizedRecurringCommitment");
            jsonWriter.value(amortizedRecurringCommitment);
        }
        if (savingsPlansAmortizedCommitment.getAmortizedUpfrontCommitment() != null) {
            String amortizedUpfrontCommitment = savingsPlansAmortizedCommitment
                    .getAmortizedUpfrontCommitment();
            jsonWriter.name("AmortizedUpfrontCommitment");
            jsonWriter.value(amortizedUpfrontCommitment);
        }
        if (savingsPlansAmortizedCommitment.getTotalAmortizedCommitment() != null) {
            String totalAmortizedCommitment = savingsPlansAmortizedCommitment
                    .getTotalAmortizedCommitment();
            jsonWriter.name("TotalAmortizedCommitment");
            jsonWriter.value(totalAmortizedCommitment);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansAmortizedCommitmentJsonMarshaller instance;

    public static SavingsPlansAmortizedCommitmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansAmortizedCommitmentJsonMarshaller();
        return instance;
    }
}
