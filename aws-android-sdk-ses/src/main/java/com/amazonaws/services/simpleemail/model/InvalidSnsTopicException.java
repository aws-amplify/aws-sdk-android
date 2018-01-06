/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES
 * could not publish to the topic, possibly due to permissions issues. For
 * information about giving permissions, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class InvalidSnsTopicException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String topic;

    /**
     * Constructs a new InvalidSnsTopicException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidSnsTopicException(String message) {
        super(message);
    }

    /**
     * Returns the value of the topic property for this object.
     *
     * @return The value of the topic property for this object.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of topic
     *
     * @param topic The new value for the topic property for this object.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
}
