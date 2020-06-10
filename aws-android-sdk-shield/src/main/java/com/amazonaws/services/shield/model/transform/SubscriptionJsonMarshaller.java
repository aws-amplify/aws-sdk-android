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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Subscription
 */
class SubscriptionJsonMarshaller {

    public void marshall(Subscription subscription, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (subscription.getStartTime() != null) {
            java.util.Date startTime = subscription.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (subscription.getEndTime() != null) {
            java.util.Date endTime = subscription.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (subscription.getTimeCommitmentInSeconds() != null) {
            Long timeCommitmentInSeconds = subscription.getTimeCommitmentInSeconds();
            jsonWriter.name("TimeCommitmentInSeconds");
            jsonWriter.value(timeCommitmentInSeconds);
        }
        if (subscription.getAutoRenew() != null) {
            String autoRenew = subscription.getAutoRenew();
            jsonWriter.name("AutoRenew");
            jsonWriter.value(autoRenew);
        }
        if (subscription.getLimits() != null) {
            java.util.List<Limit> limits = subscription.getLimits();
            jsonWriter.name("Limits");
            jsonWriter.beginArray();
            for (Limit limitsItem : limits) {
                if (limitsItem != null) {
                    LimitJsonMarshaller.getInstance().marshall(limitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (subscription.getProactiveEngagementStatus() != null) {
            String proactiveEngagementStatus = subscription.getProactiveEngagementStatus();
            jsonWriter.name("ProactiveEngagementStatus");
            jsonWriter.value(proactiveEngagementStatus);
        }
        jsonWriter.endObject();
    }

    private static SubscriptionJsonMarshaller instance;

    public static SubscriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionJsonMarshaller();
        return instance;
    }
}
