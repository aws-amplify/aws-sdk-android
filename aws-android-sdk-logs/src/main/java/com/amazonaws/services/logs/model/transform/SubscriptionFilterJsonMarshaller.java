/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SubscriptionFilter
 */
class SubscriptionFilterJsonMarshaller {

    public void marshall(SubscriptionFilter subscriptionFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (subscriptionFilter.getFilterName() != null) {
            String filterName = subscriptionFilter.getFilterName();
            jsonWriter.name("filterName");
            jsonWriter.value(filterName);
        }
        if (subscriptionFilter.getLogGroupName() != null) {
            String logGroupName = subscriptionFilter.getLogGroupName();
            jsonWriter.name("logGroupName");
            jsonWriter.value(logGroupName);
        }
        if (subscriptionFilter.getFilterPattern() != null) {
            String filterPattern = subscriptionFilter.getFilterPattern();
            jsonWriter.name("filterPattern");
            jsonWriter.value(filterPattern);
        }
        if (subscriptionFilter.getDestinationArn() != null) {
            String destinationArn = subscriptionFilter.getDestinationArn();
            jsonWriter.name("destinationArn");
            jsonWriter.value(destinationArn);
        }
        if (subscriptionFilter.getRoleArn() != null) {
            String roleArn = subscriptionFilter.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (subscriptionFilter.getDistribution() != null) {
            String distribution = subscriptionFilter.getDistribution();
            jsonWriter.name("distribution");
            jsonWriter.value(distribution);
        }
        if (subscriptionFilter.getCreationTime() != null) {
            Long creationTime = subscriptionFilter.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static SubscriptionFilterJsonMarshaller instance;

    public static SubscriptionFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionFilterJsonMarshaller();
        return instance;
    }
}
