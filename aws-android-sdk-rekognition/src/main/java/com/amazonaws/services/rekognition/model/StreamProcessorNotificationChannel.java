/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Simple Notification Service topic to which Amazon Rekognition
 * publishes the object detection results and completion status of a video
 * analysis operation.
 * </p>
 * <p>
 * Amazon Rekognition publishes a notification the first time an object of
 * interest or a person is detected in the video stream. For example, if Amazon
 * Rekognition detects a person at second 2, a pet at second 4, and a person
 * again at second 5, Amazon Rekognition sends 2 object class detected
 * notifications, one for a person at second 2 and one for a pet at second 4.
 * </p>
 * <p>
 * Amazon Rekognition also publishes an an end-of-session notification with a
 * summary when the stream processing session is complete.
 * </p>
 */
public class StreamProcessorNotificationChannel implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Amazon Amazon Simple Notification
     * Service topic to which Amazon Rekognition posts the completion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     */
    private String sNSTopicArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Amazon Amazon Simple Notification
     * Service topic to which Amazon Rekognition posts the completion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the Amazon Amazon Simple
     *         Notification Service topic to which Amazon Rekognition posts the
     *         completion status.
     *         </p>
     */
    public String getSNSTopicArn() {
        return sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Amazon Amazon Simple Notification
     * Service topic to which Amazon Rekognition posts the completion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param sNSTopicArn <p>
     *            The Amazon Resource Number (ARN) of the Amazon Amazon Simple
     *            Notification Service topic to which Amazon Rekognition posts
     *            the completion status.
     *            </p>
     */
    public void setSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Amazon Amazon Simple Notification
     * Service topic to which Amazon Rekognition posts the completion status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:aws:sns:.*:\w{12}:.+$)<br/>
     *
     * @param sNSTopicArn <p>
     *            The Amazon Resource Number (ARN) of the Amazon Amazon Simple
     *            Notification Service topic to which Amazon Rekognition posts
     *            the completion status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorNotificationChannel withSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSNSTopicArn() != null)
            sb.append("SNSTopicArn: " + getSNSTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSNSTopicArn() == null) ? 0 : getSNSTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessorNotificationChannel == false)
            return false;
        StreamProcessorNotificationChannel other = (StreamProcessorNotificationChannel) obj;

        if (other.getSNSTopicArn() == null ^ this.getSNSTopicArn() == null)
            return false;
        if (other.getSNSTopicArn() != null
                && other.getSNSTopicArn().equals(this.getSNSTopicArn()) == false)
            return false;
        return true;
    }
}
