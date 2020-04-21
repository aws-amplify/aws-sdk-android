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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SavingsPlansUtilizationByTime
 */
class SavingsPlansUtilizationByTimeJsonUnmarshaller implements
        Unmarshaller<SavingsPlansUtilizationByTime, JsonUnmarshallerContext> {

    public SavingsPlansUtilizationByTime unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SavingsPlansUtilizationByTime savingsPlansUtilizationByTime = new SavingsPlansUtilizationByTime();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TimePeriod")) {
                savingsPlansUtilizationByTime.setTimePeriod(DateIntervalJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Utilization")) {
                savingsPlansUtilizationByTime
                        .setUtilization(SavingsPlansUtilizationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Savings")) {
                savingsPlansUtilizationByTime.setSavings(SavingsPlansSavingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AmortizedCommitment")) {
                savingsPlansUtilizationByTime
                        .setAmortizedCommitment(SavingsPlansAmortizedCommitmentJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return savingsPlansUtilizationByTime;
    }

    private static SavingsPlansUtilizationByTimeJsonUnmarshaller instance;

    public static SavingsPlansUtilizationByTimeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationByTimeJsonUnmarshaller();
        return instance;
    }
}
