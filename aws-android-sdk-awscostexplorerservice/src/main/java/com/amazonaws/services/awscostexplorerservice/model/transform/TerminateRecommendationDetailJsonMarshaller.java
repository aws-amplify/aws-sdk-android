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
 * JSON marshaller for POJO TerminateRecommendationDetail
 */
class TerminateRecommendationDetailJsonMarshaller {

    public void marshall(TerminateRecommendationDetail terminateRecommendationDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (terminateRecommendationDetail.getEstimatedMonthlySavings() != null) {
            String estimatedMonthlySavings = terminateRecommendationDetail
                    .getEstimatedMonthlySavings();
            jsonWriter.name("EstimatedMonthlySavings");
            jsonWriter.value(estimatedMonthlySavings);
        }
        if (terminateRecommendationDetail.getCurrencyCode() != null) {
            String currencyCode = terminateRecommendationDetail.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        jsonWriter.endObject();
    }

    private static TerminateRecommendationDetailJsonMarshaller instance;

    public static TerminateRecommendationDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TerminateRecommendationDetailJsonMarshaller();
        return instance;
    }
}
