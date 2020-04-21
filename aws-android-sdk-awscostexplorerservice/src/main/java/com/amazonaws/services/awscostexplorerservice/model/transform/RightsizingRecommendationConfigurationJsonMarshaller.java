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
 * JSON marshaller for POJO RightsizingRecommendationConfiguration
 */
class RightsizingRecommendationConfigurationJsonMarshaller {

    public void marshall(
            RightsizingRecommendationConfiguration rightsizingRecommendationConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rightsizingRecommendationConfiguration.getRecommendationTarget() != null) {
            String recommendationTarget = rightsizingRecommendationConfiguration
                    .getRecommendationTarget();
            jsonWriter.name("RecommendationTarget");
            jsonWriter.value(recommendationTarget);
        }
        if (rightsizingRecommendationConfiguration.getBenefitsConsidered() != null) {
            Boolean benefitsConsidered = rightsizingRecommendationConfiguration
                    .getBenefitsConsidered();
            jsonWriter.name("BenefitsConsidered");
            jsonWriter.value(benefitsConsidered);
        }
        jsonWriter.endObject();
    }

    private static RightsizingRecommendationConfigurationJsonMarshaller instance;

    public static RightsizingRecommendationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RightsizingRecommendationConfigurationJsonMarshaller();
        return instance;
    }
}
