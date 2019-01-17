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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Simple Notification Service topic to which Amazon Rekognition
 * publishes the completion status of a video analysis operation. For more
 * information, see <a>api-video</a>.
 * </p>
 */
public class NotificationChannel implements Serializable {
    /**
     * <p>
     * The Amazon SNS topic to which Amazon Rekognition to posts the completion
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):sns:.*:\w{12}:.+$)<br/>
     */
    private String sNSTopicArn;

    /**
     * <p>
     * The ARN of an IAM role that gives Amazon Rekognition publishing
     * permissions to the Amazon SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon SNS topic to which Amazon Rekognition to posts the completion
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):sns:.*:\w{12}:.+$)<br/>
     *
     * @return <p>
     *         The Amazon SNS topic to which Amazon Rekognition to posts the
     *         completion status.
     *         </p>
     */
    public String getSNSTopicArn() {
        return sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon SNS topic to which Amazon Rekognition to posts the completion
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):sns:.*:\w{12}:.+$)<br/>
     *
     * @param sNSTopicArn <p>
     *            The Amazon SNS topic to which Amazon Rekognition to posts the
     *            completion status.
     *            </p>
     */
    public void setSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon SNS topic to which Amazon Rekognition to posts the completion
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):sns:.*:\w{12}:.+$)<br/>
     *
     * @param sNSTopicArn <p>
     *            The Amazon SNS topic to which Amazon Rekognition to posts the
     *            completion status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationChannel withSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that gives Amazon Rekognition publishing
     * permissions to the Amazon SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @return <p>
     *         The ARN of an IAM role that gives Amazon Rekognition publishing
     *         permissions to the Amazon SNS topic.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that gives Amazon Rekognition publishing
     * permissions to the Amazon SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that gives Amazon Rekognition
     *            publishing permissions to the Amazon SNS topic.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that gives Amazon Rekognition publishing
     * permissions to the Amazon SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that gives Amazon Rekognition
     *            publishing permissions to the Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationChannel withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
            sb.append("SNSTopicArn: " + getSNSTopicArn() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSNSTopicArn() == null) ? 0 : getSNSTopicArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationChannel == false)
            return false;
        NotificationChannel other = (NotificationChannel) obj;

        if (other.getSNSTopicArn() == null ^ this.getSNSTopicArn() == null)
            return false;
        if (other.getSNSTopicArn() != null
                && other.getSNSTopicArn().equals(this.getSNSTopicArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
