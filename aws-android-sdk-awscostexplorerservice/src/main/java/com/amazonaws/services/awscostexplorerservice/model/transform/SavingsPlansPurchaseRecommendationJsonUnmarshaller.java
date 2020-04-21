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
 * JSON unmarshaller for POJO SavingsPlansPurchaseRecommendation
 */
class SavingsPlansPurchaseRecommendationJsonUnmarshaller implements
        Unmarshaller<SavingsPlansPurchaseRecommendation, JsonUnmarshallerContext> {

    public SavingsPlansPurchaseRecommendation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation = new SavingsPlansPurchaseRecommendation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccountScope")) {
                savingsPlansPurchaseRecommendation.setAccountScope(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SavingsPlansType")) {
                savingsPlansPurchaseRecommendation.setSavingsPlansType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TermInYears")) {
                savingsPlansPurchaseRecommendation.setTermInYears(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaymentOption")) {
                savingsPlansPurchaseRecommendation.setPaymentOption(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LookbackPeriodInDays")) {
                savingsPlansPurchaseRecommendation.setLookbackPeriodInDays(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SavingsPlansPurchaseRecommendationDetails")) {
                savingsPlansPurchaseRecommendation
                        .setSavingsPlansPurchaseRecommendationDetails(new ListUnmarshaller<SavingsPlansPurchaseRecommendationDetail>(
                                SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SavingsPlansPurchaseRecommendationSummary")) {
                savingsPlansPurchaseRecommendation
                        .setSavingsPlansPurchaseRecommendationSummary(SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return savingsPlansPurchaseRecommendation;
    }

    private static SavingsPlansPurchaseRecommendationJsonUnmarshaller instance;

    public static SavingsPlansPurchaseRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationJsonUnmarshaller();
        return instance;
    }
}
