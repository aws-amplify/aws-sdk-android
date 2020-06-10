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
 * JSON marshaller for POJO AutoScalingGroupRecommendation
 */
class AutoScalingGroupRecommendationJsonMarshaller {

    public void marshall(AutoScalingGroupRecommendation autoScalingGroupRecommendation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingGroupRecommendation.getAccountId() != null) {
            String accountId = autoScalingGroupRecommendation.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (autoScalingGroupRecommendation.getAutoScalingGroupArn() != null) {
            String autoScalingGroupArn = autoScalingGroupRecommendation.getAutoScalingGroupArn();
            jsonWriter.name("autoScalingGroupArn");
            jsonWriter.value(autoScalingGroupArn);
        }
        if (autoScalingGroupRecommendation.getAutoScalingGroupName() != null) {
            String autoScalingGroupName = autoScalingGroupRecommendation.getAutoScalingGroupName();
            jsonWriter.name("autoScalingGroupName");
            jsonWriter.value(autoScalingGroupName);
        }
        if (autoScalingGroupRecommendation.getFinding() != null) {
            String finding = autoScalingGroupRecommendation.getFinding();
            jsonWriter.name("finding");
            jsonWriter.value(finding);
        }
        if (autoScalingGroupRecommendation.getUtilizationMetrics() != null) {
            java.util.List<UtilizationMetric> utilizationMetrics = autoScalingGroupRecommendation.getUtilizationMetrics();
            jsonWriter.name("utilizationMetrics");
            jsonWriter.beginArray();
            for (UtilizationMetric utilizationMetricsItem : utilizationMetrics) {
                if (utilizationMetricsItem != null) {
            UtilizationMetricJsonMarshaller.getInstance().marshall(utilizationMetricsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (autoScalingGroupRecommendation.getLookBackPeriodInDays() != null) {
            Double lookBackPeriodInDays = autoScalingGroupRecommendation.getLookBackPeriodInDays();
            jsonWriter.name("lookBackPeriodInDays");
            jsonWriter.value(lookBackPeriodInDays);
        }
        if (autoScalingGroupRecommendation.getCurrentConfiguration() != null) {
            AutoScalingGroupConfiguration currentConfiguration = autoScalingGroupRecommendation.getCurrentConfiguration();
            jsonWriter.name("currentConfiguration");
            AutoScalingGroupConfigurationJsonMarshaller.getInstance().marshall(currentConfiguration, jsonWriter);
        }
        if (autoScalingGroupRecommendation.getRecommendationOptions() != null) {
            java.util.List<AutoScalingGroupRecommendationOption> recommendationOptions = autoScalingGroupRecommendation.getRecommendationOptions();
            jsonWriter.name("recommendationOptions");
            jsonWriter.beginArray();
            for (AutoScalingGroupRecommendationOption recommendationOptionsItem : recommendationOptions) {
                if (recommendationOptionsItem != null) {
            AutoScalingGroupRecommendationOptionJsonMarshaller.getInstance().marshall(recommendationOptionsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (autoScalingGroupRecommendation.getLastRefreshTimestamp() != null) {
            java.util.Date lastRefreshTimestamp = autoScalingGroupRecommendation.getLastRefreshTimestamp();
            jsonWriter.name("lastRefreshTimestamp");
            jsonWriter.value(lastRefreshTimestamp);
        }
        jsonWriter.endObject();
    }

    private static AutoScalingGroupRecommendationJsonMarshaller instance;
    public static AutoScalingGroupRecommendationJsonMarshaller getInstance() {
        if (instance == null) instance = new AutoScalingGroupRecommendationJsonMarshaller();
        return instance;
    }
}
