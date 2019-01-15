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

package com.amazonaws.services.sqs.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Queue Attribute Name
 */
public enum QueueAttributeName {

    All("All"),
    Policy("Policy"),
    VisibilityTimeout("VisibilityTimeout"),
    MaximumMessageSize("MaximumMessageSize"),
    MessageRetentionPeriod("MessageRetentionPeriod"),
    ApproximateNumberOfMessages("ApproximateNumberOfMessages"),
    ApproximateNumberOfMessagesNotVisible("ApproximateNumberOfMessagesNotVisible"),
    CreatedTimestamp("CreatedTimestamp"),
    LastModifiedTimestamp("LastModifiedTimestamp"),
    QueueArn("QueueArn"),
    ApproximateNumberOfMessagesDelayed("ApproximateNumberOfMessagesDelayed"),
    DelaySeconds("DelaySeconds"),
    ReceiveMessageWaitTimeSeconds("ReceiveMessageWaitTimeSeconds"),
    RedrivePolicy("RedrivePolicy"),
    FifoQueue("FifoQueue"),
    ContentBasedDeduplication("ContentBasedDeduplication");

    private String value;

    private QueueAttributeName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, QueueAttributeName> enumMap;
    static {
        enumMap = new HashMap<String, QueueAttributeName>();
        enumMap.put("All", All);
        enumMap.put("Policy", Policy);
        enumMap.put("VisibilityTimeout", VisibilityTimeout);
        enumMap.put("MaximumMessageSize", MaximumMessageSize);
        enumMap.put("MessageRetentionPeriod", MessageRetentionPeriod);
        enumMap.put("ApproximateNumberOfMessages", ApproximateNumberOfMessages);
        enumMap.put("ApproximateNumberOfMessagesNotVisible", ApproximateNumberOfMessagesNotVisible);
        enumMap.put("CreatedTimestamp", CreatedTimestamp);
        enumMap.put("LastModifiedTimestamp", LastModifiedTimestamp);
        enumMap.put("QueueArn", QueueArn);
        enumMap.put("ApproximateNumberOfMessagesDelayed", ApproximateNumberOfMessagesDelayed);
        enumMap.put("DelaySeconds", DelaySeconds);
        enumMap.put("ReceiveMessageWaitTimeSeconds", ReceiveMessageWaitTimeSeconds);
        enumMap.put("RedrivePolicy", RedrivePolicy);
        enumMap.put("FifoQueue", FifoQueue);
        enumMap.put("ContentBasedDeduplication", ContentBasedDeduplication);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return QueueAttributeName corresponding to the value
     */
    public static QueueAttributeName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
