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
 * JSON marshaller for POJO ReservationPurchaseRecommendation
 */
class ReservationPurchaseRecommendationJsonMarshaller {

    public void marshall(ReservationPurchaseRecommendation reservationPurchaseRecommendation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservationPurchaseRecommendation.getAccountScope() != null) {
            String accountScope = reservationPurchaseRecommendation.getAccountScope();
            jsonWriter.name("AccountScope");
            jsonWriter.value(accountScope);
        }
        if (reservationPurchaseRecommendation.getLookbackPeriodInDays() != null) {
            String lookbackPeriodInDays = reservationPurchaseRecommendation
                    .getLookbackPeriodInDays();
            jsonWriter.name("LookbackPeriodInDays");
            jsonWriter.value(lookbackPeriodInDays);
        }
        if (reservationPurchaseRecommendation.getTermInYears() != null) {
            String termInYears = reservationPurchaseRecommendation.getTermInYears();
            jsonWriter.name("TermInYears");
            jsonWriter.value(termInYears);
        }
        if (reservationPurchaseRecommendation.getPaymentOption() != null) {
            String paymentOption = reservationPurchaseRecommendation.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (reservationPurchaseRecommendation.getServiceSpecification() != null) {
            ServiceSpecification serviceSpecification = reservationPurchaseRecommendation
                    .getServiceSpecification();
            jsonWriter.name("ServiceSpecification");
            ServiceSpecificationJsonMarshaller.getInstance().marshall(serviceSpecification,
                    jsonWriter);
        }
        if (reservationPurchaseRecommendation.getRecommendationDetails() != null) {
            java.util.List<ReservationPurchaseRecommendationDetail> recommendationDetails = reservationPurchaseRecommendation
                    .getRecommendationDetails();
            jsonWriter.name("RecommendationDetails");
            jsonWriter.beginArray();
            for (ReservationPurchaseRecommendationDetail recommendationDetailsItem : recommendationDetails) {
                if (recommendationDetailsItem != null) {
                    ReservationPurchaseRecommendationDetailJsonMarshaller.getInstance().marshall(
                            recommendationDetailsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservationPurchaseRecommendation.getRecommendationSummary() != null) {
            ReservationPurchaseRecommendationSummary recommendationSummary = reservationPurchaseRecommendation
                    .getRecommendationSummary();
            jsonWriter.name("RecommendationSummary");
            ReservationPurchaseRecommendationSummaryJsonMarshaller.getInstance().marshall(
                    recommendationSummary, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReservationPurchaseRecommendationJsonMarshaller instance;

    public static ReservationPurchaseRecommendationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPurchaseRecommendationJsonMarshaller();
        return instance;
    }
}
