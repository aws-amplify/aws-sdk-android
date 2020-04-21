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
 * JSON unmarshaller for POJO ReservationPurchaseRecommendation
 */
class ReservationPurchaseRecommendationJsonUnmarshaller implements
        Unmarshaller<ReservationPurchaseRecommendation, JsonUnmarshallerContext> {

    public ReservationPurchaseRecommendation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservationPurchaseRecommendation reservationPurchaseRecommendation = new ReservationPurchaseRecommendation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccountScope")) {
                reservationPurchaseRecommendation.setAccountScope(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LookbackPeriodInDays")) {
                reservationPurchaseRecommendation.setLookbackPeriodInDays(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TermInYears")) {
                reservationPurchaseRecommendation.setTermInYears(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaymentOption")) {
                reservationPurchaseRecommendation.setPaymentOption(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceSpecification")) {
                reservationPurchaseRecommendation
                        .setServiceSpecification(ServiceSpecificationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendationDetails")) {
                reservationPurchaseRecommendation
                        .setRecommendationDetails(new ListUnmarshaller<ReservationPurchaseRecommendationDetail>(
                                ReservationPurchaseRecommendationDetailJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RecommendationSummary")) {
                reservationPurchaseRecommendation
                        .setRecommendationSummary(ReservationPurchaseRecommendationSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservationPurchaseRecommendation;
    }

    private static ReservationPurchaseRecommendationJsonUnmarshaller instance;

    public static ReservationPurchaseRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPurchaseRecommendationJsonUnmarshaller();
        return instance;
    }
}
