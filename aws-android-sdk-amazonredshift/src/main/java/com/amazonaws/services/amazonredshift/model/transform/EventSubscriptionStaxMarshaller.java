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

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO EventSubscription
 */
class EventSubscriptionStaxMarshaller {

    public void marshall(EventSubscription _eventSubscription, Request<?> request, String _prefix) {
        String prefix;
        if (_eventSubscription.getCustomerAwsId() != null) {
            prefix = _prefix + "CustomerAwsId";
            String customerAwsId = _eventSubscription.getCustomerAwsId();
            request.addParameter(prefix, StringUtils.fromString(customerAwsId));
        }
        if (_eventSubscription.getCustSubscriptionId() != null) {
            prefix = _prefix + "CustSubscriptionId";
            String custSubscriptionId = _eventSubscription.getCustSubscriptionId();
            request.addParameter(prefix, StringUtils.fromString(custSubscriptionId));
        }
        if (_eventSubscription.getSnsTopicArn() != null) {
            prefix = _prefix + "SnsTopicArn";
            String snsTopicArn = _eventSubscription.getSnsTopicArn();
            request.addParameter(prefix, StringUtils.fromString(snsTopicArn));
        }
        if (_eventSubscription.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _eventSubscription.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_eventSubscription.getSubscriptionCreationTime() != null) {
            prefix = _prefix + "SubscriptionCreationTime";
            java.util.Date subscriptionCreationTime = _eventSubscription
                    .getSubscriptionCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(subscriptionCreationTime));
        }
        if (_eventSubscription.getSourceType() != null) {
            prefix = _prefix + "SourceType";
            String sourceType = _eventSubscription.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (_eventSubscription.getSourceIdsList() != null) {
            prefix = _prefix + "SourceIdsList";
            java.util.List<String> sourceIdsList = _eventSubscription.getSourceIdsList();
            int sourceIdsListIndex = 1;
            String sourceIdsListPrefix = prefix;
            for (String sourceIdsListItem : sourceIdsList) {
                prefix = sourceIdsListPrefix + "." + sourceIdsListIndex;
                if (sourceIdsListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(sourceIdsListItem));
                }
                sourceIdsListIndex++;
            }
            prefix = sourceIdsListPrefix;
        }
        if (_eventSubscription.getEventCategoriesList() != null) {
            prefix = _prefix + "EventCategoriesList";
            java.util.List<String> eventCategoriesList = _eventSubscription
                    .getEventCategoriesList();
            int eventCategoriesListIndex = 1;
            String eventCategoriesListPrefix = prefix;
            for (String eventCategoriesListItem : eventCategoriesList) {
                prefix = eventCategoriesListPrefix + "." + eventCategoriesListIndex;
                if (eventCategoriesListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(eventCategoriesListItem));
                }
                eventCategoriesListIndex++;
            }
            prefix = eventCategoriesListPrefix;
        }
        if (_eventSubscription.getSeverity() != null) {
            prefix = _prefix + "Severity";
            String severity = _eventSubscription.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
        }
        if (_eventSubscription.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _eventSubscription.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_eventSubscription.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _eventSubscription.getTags();
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
    }

    private static EventSubscriptionStaxMarshaller instance;

    public static EventSubscriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EventSubscriptionStaxMarshaller();
        return instance;
    }
}
