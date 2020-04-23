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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyEventSubscriptionRequest
 */
public class ModifyEventSubscriptionRequestMarshaller implements
        Marshaller<Request<ModifyEventSubscriptionRequest>, ModifyEventSubscriptionRequest> {

    public Request<ModifyEventSubscriptionRequest> marshall(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) {
        if (modifyEventSubscriptionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyEventSubscriptionRequest)");
        }

        Request<ModifyEventSubscriptionRequest> request = new DefaultRequest<ModifyEventSubscriptionRequest>(
                modifyEventSubscriptionRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyEventSubscription");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyEventSubscriptionRequest.getSubscriptionName() != null) {
            prefix = "SubscriptionName";
            String subscriptionName = modifyEventSubscriptionRequest.getSubscriptionName();
            request.addParameter(prefix, StringUtils.fromString(subscriptionName));
        }
        if (modifyEventSubscriptionRequest.getSnsTopicArn() != null) {
            prefix = "SnsTopicArn";
            String snsTopicArn = modifyEventSubscriptionRequest.getSnsTopicArn();
            request.addParameter(prefix, StringUtils.fromString(snsTopicArn));
        }
        if (modifyEventSubscriptionRequest.getSourceType() != null) {
            prefix = "SourceType";
            String sourceType = modifyEventSubscriptionRequest.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (modifyEventSubscriptionRequest.getEventCategories() != null) {
            prefix = "EventCategories";
            java.util.List<String> eventCategories = modifyEventSubscriptionRequest
                    .getEventCategories();
            int eventCategoriesIndex = 1;
            String eventCategoriesPrefix = prefix;
            for (String eventCategoriesItem : eventCategories) {
                prefix = eventCategoriesPrefix + "." + eventCategoriesIndex;
                if (eventCategoriesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(eventCategoriesItem));
                }
                eventCategoriesIndex++;
            }
            prefix = eventCategoriesPrefix;
        }
        if (modifyEventSubscriptionRequest.getEnabled() != null) {
            prefix = "Enabled";
            Boolean enabled = modifyEventSubscriptionRequest.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }

        return request;
    }
}
