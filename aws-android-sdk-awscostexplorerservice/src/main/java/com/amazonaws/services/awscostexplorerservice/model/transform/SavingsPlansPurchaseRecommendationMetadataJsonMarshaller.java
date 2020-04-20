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
 * JSON marshaller for POJO SavingsPlansPurchaseRecommendationMetadata
 */
class SavingsPlansPurchaseRecommendationMetadataJsonMarshaller {

    public void marshall(
            SavingsPlansPurchaseRecommendationMetadata savingsPlansPurchaseRecommendationMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansPurchaseRecommendationMetadata.getRecommendationId() != null) {
            String recommendationId = savingsPlansPurchaseRecommendationMetadata
                    .getRecommendationId();
            jsonWriter.name("RecommendationId");
            jsonWriter.value(recommendationId);
        }
        if (savingsPlansPurchaseRecommendationMetadata.getGenerationTimestamp() != null) {
            String generationTimestamp = savingsPlansPurchaseRecommendationMetadata
                    .getGenerationTimestamp();
            jsonWriter.name("GenerationTimestamp");
            jsonWriter.value(generationTimestamp);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansPurchaseRecommendationMetadataJsonMarshaller instance;

    public static SavingsPlansPurchaseRecommendationMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationMetadataJsonMarshaller();
        return instance;
    }
}
