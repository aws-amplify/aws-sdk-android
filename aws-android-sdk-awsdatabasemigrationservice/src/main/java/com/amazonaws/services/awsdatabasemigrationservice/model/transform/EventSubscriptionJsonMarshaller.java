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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventSubscription
 */
class EventSubscriptionJsonMarshaller {

    public void marshall(EventSubscription eventSubscription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventSubscription.getCustomerAwsId() != null) {
            String customerAwsId = eventSubscription.getCustomerAwsId();
            jsonWriter.name("CustomerAwsId");
            jsonWriter.value(customerAwsId);
        }
        if (eventSubscription.getCustSubscriptionId() != null) {
            String custSubscriptionId = eventSubscription.getCustSubscriptionId();
            jsonWriter.name("CustSubscriptionId");
            jsonWriter.value(custSubscriptionId);
        }
        if (eventSubscription.getSnsTopicArn() != null) {
            String snsTopicArn = eventSubscription.getSnsTopicArn();
            jsonWriter.name("SnsTopicArn");
            jsonWriter.value(snsTopicArn);
        }
        if (eventSubscription.getStatus() != null) {
            String status = eventSubscription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (eventSubscription.getSubscriptionCreationTime() != null) {
            String subscriptionCreationTime = eventSubscription.getSubscriptionCreationTime();
            jsonWriter.name("SubscriptionCreationTime");
            jsonWriter.value(subscriptionCreationTime);
        }
        if (eventSubscription.getSourceType() != null) {
            String sourceType = eventSubscription.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (eventSubscription.getSourceIdsList() != null) {
            java.util.List<String> sourceIdsList = eventSubscription.getSourceIdsList();
            jsonWriter.name("SourceIdsList");
            jsonWriter.beginArray();
            for (String sourceIdsListItem : sourceIdsList) {
                if (sourceIdsListItem != null) {
                    jsonWriter.value(sourceIdsListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventSubscription.getEventCategoriesList() != null) {
            java.util.List<String> eventCategoriesList = eventSubscription.getEventCategoriesList();
            jsonWriter.name("EventCategoriesList");
            jsonWriter.beginArray();
            for (String eventCategoriesListItem : eventCategoriesList) {
                if (eventCategoriesListItem != null) {
                    jsonWriter.value(eventCategoriesListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventSubscription.getEnabled() != null) {
            Boolean enabled = eventSubscription.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static EventSubscriptionJsonMarshaller instance;

    public static EventSubscriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventSubscriptionJsonMarshaller();
        return instance;
    }
}
