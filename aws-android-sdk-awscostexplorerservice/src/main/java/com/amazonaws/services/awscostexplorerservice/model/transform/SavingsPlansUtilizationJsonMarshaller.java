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
 * JSON marshaller for POJO SavingsPlansUtilization
 */
class SavingsPlansUtilizationJsonMarshaller {

    public void marshall(SavingsPlansUtilization savingsPlansUtilization, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansUtilization.getTotalCommitment() != null) {
            String totalCommitment = savingsPlansUtilization.getTotalCommitment();
            jsonWriter.name("TotalCommitment");
            jsonWriter.value(totalCommitment);
        }
        if (savingsPlansUtilization.getUsedCommitment() != null) {
            String usedCommitment = savingsPlansUtilization.getUsedCommitment();
            jsonWriter.name("UsedCommitment");
            jsonWriter.value(usedCommitment);
        }
        if (savingsPlansUtilization.getUnusedCommitment() != null) {
            String unusedCommitment = savingsPlansUtilization.getUnusedCommitment();
            jsonWriter.name("UnusedCommitment");
            jsonWriter.value(unusedCommitment);
        }
        if (savingsPlansUtilization.getUtilizationPercentage() != null) {
            String utilizationPercentage = savingsPlansUtilization.getUtilizationPercentage();
            jsonWriter.name("UtilizationPercentage");
            jsonWriter.value(utilizationPercentage);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansUtilizationJsonMarshaller instance;

    public static SavingsPlansUtilizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationJsonMarshaller();
        return instance;
    }
}
