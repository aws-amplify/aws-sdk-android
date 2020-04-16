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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsSnsTopicDetails
 */
class AwsSnsTopicDetailsJsonMarshaller {

    public void marshall(AwsSnsTopicDetails awsSnsTopicDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsSnsTopicDetails.getKmsMasterKeyId() != null) {
            String kmsMasterKeyId = awsSnsTopicDetails.getKmsMasterKeyId();
            jsonWriter.name("KmsMasterKeyId");
            jsonWriter.value(kmsMasterKeyId);
        }
        if (awsSnsTopicDetails.getSubscription() != null) {
            java.util.List<AwsSnsTopicSubscription> subscription = awsSnsTopicDetails
                    .getSubscription();
            jsonWriter.name("Subscription");
            jsonWriter.beginArray();
            for (AwsSnsTopicSubscription subscriptionItem : subscription) {
                if (subscriptionItem != null) {
                    AwsSnsTopicSubscriptionJsonMarshaller.getInstance().marshall(subscriptionItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSnsTopicDetails.getTopicName() != null) {
            String topicName = awsSnsTopicDetails.getTopicName();
            jsonWriter.name("TopicName");
            jsonWriter.value(topicName);
        }
        if (awsSnsTopicDetails.getOwner() != null) {
            String owner = awsSnsTopicDetails.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        jsonWriter.endObject();
    }

    private static AwsSnsTopicDetailsJsonMarshaller instance;

    public static AwsSnsTopicDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsSnsTopicDetailsJsonMarshaller();
        return instance;
    }
}
