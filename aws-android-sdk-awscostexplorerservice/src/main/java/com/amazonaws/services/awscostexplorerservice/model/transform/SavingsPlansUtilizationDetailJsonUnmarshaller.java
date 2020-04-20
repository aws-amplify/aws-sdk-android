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
 * JSON unmarshaller for POJO SavingsPlansUtilizationDetail
 */
class SavingsPlansUtilizationDetailJsonUnmarshaller implements
        Unmarshaller<SavingsPlansUtilizationDetail, JsonUnmarshallerContext> {

    public SavingsPlansUtilizationDetail unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SavingsPlansUtilizationDetail savingsPlansUtilizationDetail = new SavingsPlansUtilizationDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SavingsPlanArn")) {
                savingsPlansUtilizationDetail.setSavingsPlanArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                savingsPlansUtilizationDetail.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Utilization")) {
                savingsPlansUtilizationDetail
                        .setUtilization(SavingsPlansUtilizationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Savings")) {
                savingsPlansUtilizationDetail.setSavings(SavingsPlansSavingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AmortizedCommitment")) {
                savingsPlansUtilizationDetail
                        .setAmortizedCommitment(SavingsPlansAmortizedCommitmentJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return savingsPlansUtilizationDetail;
    }

    private static SavingsPlansUtilizationDetailJsonUnmarshaller instance;

    public static SavingsPlansUtilizationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationDetailJsonUnmarshaller();
        return instance;
    }
}
