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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateEventSubscriptionRequest
 */
public class CreateEventSubscriptionRequestMarshaller implements
        Marshaller<Request<CreateEventSubscriptionRequest>, CreateEventSubscriptionRequest> {

    public Request<CreateEventSubscriptionRequest> marshall(
            CreateEventSubscriptionRequest createEventSubscriptionRequest) {
        if (createEventSubscriptionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateEventSubscriptionRequest)");
        }

        Request<CreateEventSubscriptionRequest> request = new DefaultRequest<CreateEventSubscriptionRequest>(
                createEventSubscriptionRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateEventSubscription");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createEventSubscriptionRequest.getSubscriptionName() != null) {
            prefix = "SubscriptionName";
            String subscriptionName = createEventSubscriptionRequest.getSubscriptionName();
            request.addParameter(prefix, StringUtils.fromString(subscriptionName));
        }
        if (createEventSubscriptionRequest.getSnsTopicArn() != null) {
            prefix = "SnsTopicArn";
            String snsTopicArn = createEventSubscriptionRequest.getSnsTopicArn();
            request.addParameter(prefix, StringUtils.fromString(snsTopicArn));
        }
        if (createEventSubscriptionRequest.getSourceType() != null) {
            prefix = "SourceType";
            String sourceType = createEventSubscriptionRequest.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (createEventSubscriptionRequest.getSourceIds() != null) {
            prefix = "SourceIds";
            java.util.List<String> sourceIds = createEventSubscriptionRequest.getSourceIds();
            int sourceIdsIndex = 1;
            String sourceIdsPrefix = prefix;
            for (String sourceIdsItem : sourceIds) {
                prefix = sourceIdsPrefix + "." + sourceIdsIndex;
                if (sourceIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(sourceIdsItem));
                }
                sourceIdsIndex++;
            }
            prefix = sourceIdsPrefix;
        }
        if (createEventSubscriptionRequest.getEventCategories() != null) {
            prefix = "EventCategories";
            java.util.List<String> eventCategories = createEventSubscriptionRequest
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
        if (createEventSubscriptionRequest.getSeverity() != null) {
            prefix = "Severity";
            String severity = createEventSubscriptionRequest.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
        }
        if (createEventSubscriptionRequest.getEnabled() != null) {
            prefix = "Enabled";
            Boolean enabled = createEventSubscriptionRequest.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (createEventSubscriptionRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createEventSubscriptionRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
