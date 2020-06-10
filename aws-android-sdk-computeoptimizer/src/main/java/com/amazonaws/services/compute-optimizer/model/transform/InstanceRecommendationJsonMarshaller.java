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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceRecommendation
 */
class InstanceRecommendationJsonMarshaller {

    public void marshall(InstanceRecommendation instanceRecommendation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceRecommendation.getInstanceArn() != null) {
            String instanceArn = instanceRecommendation.getInstanceArn();
            jsonWriter.name("instanceArn");
            jsonWriter.value(instanceArn);
        }
        if (instanceRecommendation.getAccountId() != null) {
            String accountId = instanceRecommendation.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (instanceRecommendation.getInstanceName() != null) {
            String instanceName = instanceRecommendation.getInstanceName();
            jsonWriter.name("instanceName");
            jsonWriter.value(instanceName);
        }
        if (instanceRecommendation.getCurrentInstanceType() != null) {
            String currentInstanceType = instanceRecommendation.getCurrentInstanceType();
            jsonWriter.name("currentInstanceType");
            jsonWriter.value(currentInstanceType);
        }
        if (instanceRecommendation.getFinding() != null) {
            String finding = instanceRecommendation.getFinding();
            jsonWriter.name("finding");
            jsonWriter.value(finding);
        }
        if (instanceRecommendation.getUtilizationMetrics() != null) {
            java.util.List<UtilizationMetric> utilizationMetrics = instanceRecommendation.getUtilizationMetrics();
            jsonWriter.name("utilizationMetrics");
            jsonWriter.beginArray();
            for (UtilizationMetric utilizationMetricsItem : utilizationMetrics) {
                if (utilizationMetricsItem != null) {
            UtilizationMetricJsonMarshaller.getInstance().marshall(utilizationMetricsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (instanceRecommendation.getLookBackPeriodInDays() != null) {
            Double lookBackPeriodInDays = instanceRecommendation.getLookBackPeriodInDays();
            jsonWriter.name("lookBackPeriodInDays");
            jsonWriter.value(lookBackPeriodInDays);
        }
        if (instanceRecommendation.getRecommendationOptions() != null) {
            java.util.List<InstanceRecommendationOption> recommendationOptions = instanceRecommendation.getRecommendationOptions();
            jsonWriter.name("recommendationOptions");
            jsonWriter.beginArray();
            for (InstanceRecommendationOption recommendationOptionsItem : recommendationOptions) {
                if (recommendationOptionsItem != null) {
            InstanceRecommendationOptionJsonMarshaller.getInstance().marshall(recommendationOptionsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (instanceRecommendation.getRecommendationSources() != null) {
            java.util.List<RecommendationSource> recommendationSources = instanceRecommendation.getRecommendationSources();
            jsonWriter.name("recommendationSources");
            jsonWriter.beginArray();
            for (RecommendationSource recommendationSourcesItem : recommendationSources) {
                if (recommendationSourcesItem != null) {
            RecommendationSourceJsonMarshaller.getInstance().marshall(recommendationSourcesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (instanceRecommendation.getLastRefreshTimestamp() != null) {
            java.util.Date lastRefreshTimestamp = instanceRecommendation.getLastRefreshTimestamp();
            jsonWriter.name("lastRefreshTimestamp");
            jsonWriter.value(lastRefreshTimestamp);
        }
        jsonWriter.endObject();
    }

    private static InstanceRecommendationJsonMarshaller instance;
    public static InstanceRecommendationJsonMarshaller getInstance() {
        if (instance == null) instance = new InstanceRecommendationJsonMarshaller();
        return instance;
    }
}
