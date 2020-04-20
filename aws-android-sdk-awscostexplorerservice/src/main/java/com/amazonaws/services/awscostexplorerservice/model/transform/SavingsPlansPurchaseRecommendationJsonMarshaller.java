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
 * JSON marshaller for POJO SavingsPlansPurchaseRecommendation
 */
class SavingsPlansPurchaseRecommendationJsonMarshaller {

    public void marshall(SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansPurchaseRecommendation.getAccountScope() != null) {
            String accountScope = savingsPlansPurchaseRecommendation.getAccountScope();
            jsonWriter.name("AccountScope");
            jsonWriter.value(accountScope);
        }
        if (savingsPlansPurchaseRecommendation.getSavingsPlansType() != null) {
            String savingsPlansType = savingsPlansPurchaseRecommendation.getSavingsPlansType();
            jsonWriter.name("SavingsPlansType");
            jsonWriter.value(savingsPlansType);
        }
        if (savingsPlansPurchaseRecommendation.getTermInYears() != null) {
            String termInYears = savingsPlansPurchaseRecommendation.getTermInYears();
            jsonWriter.name("TermInYears");
            jsonWriter.value(termInYears);
        }
        if (savingsPlansPurchaseRecommendation.getPaymentOption() != null) {
            String paymentOption = savingsPlansPurchaseRecommendation.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (savingsPlansPurchaseRecommendation.getLookbackPeriodInDays() != null) {
            String lookbackPeriodInDays = savingsPlansPurchaseRecommendation
                    .getLookbackPeriodInDays();
            jsonWriter.name("LookbackPeriodInDays");
            jsonWriter.value(lookbackPeriodInDays);
        }
        if (savingsPlansPurchaseRecommendation.getSavingsPlansPurchaseRecommendationDetails() != null) {
            java.util.List<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails = savingsPlansPurchaseRecommendation
                    .getSavingsPlansPurchaseRecommendationDetails();
            jsonWriter.name("SavingsPlansPurchaseRecommendationDetails");
            jsonWriter.beginArray();
            for (SavingsPlansPurchaseRecommendationDetail savingsPlansPurchaseRecommendationDetailsItem : savingsPlansPurchaseRecommendationDetails) {
                if (savingsPlansPurchaseRecommendationDetailsItem != null) {
                    SavingsPlansPurchaseRecommendationDetailJsonMarshaller.getInstance().marshall(
                            savingsPlansPurchaseRecommendationDetailsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (savingsPlansPurchaseRecommendation.getSavingsPlansPurchaseRecommendationSummary() != null) {
            SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary = savingsPlansPurchaseRecommendation
                    .getSavingsPlansPurchaseRecommendationSummary();
            jsonWriter.name("SavingsPlansPurchaseRecommendationSummary");
            SavingsPlansPurchaseRecommendationSummaryJsonMarshaller.getInstance().marshall(
                    savingsPlansPurchaseRecommendationSummary, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansPurchaseRecommendationJsonMarshaller instance;

    public static SavingsPlansPurchaseRecommendationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationJsonMarshaller();
        return instance;
    }
}
