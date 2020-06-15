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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for resource targets to receive notifications when Amazon
 * Chime SDK meeting and attendee events occur. The Amazon Chime SDK supports
 * resource targets located in the US East (N. Virginia) AWS Region (
 * <code>us-east-1</code>).
 * </p>
 */
public class MeetingNotificationConfiguration implements Serializable {
    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     */
    private String sqsQueueArn;

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     *
     * @return <p>
     *         The SNS topic ARN.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     *
     * @param snsTopicArn <p>
     *            The SNS topic ARN.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     *
     * @param snsTopicArn <p>
     *            The SNS topic ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeetingNotificationConfiguration withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     *
     * @return <p>
     *         The SQS queue ARN.
     *         </p>
     */
    public String getSqsQueueArn() {
        return sqsQueueArn;
    }

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     *
     * @param sqsQueueArn <p>
     *            The SQS queue ARN.
     *            </p>
     */
    public void setSqsQueueArn(String sqsQueueArn) {
        this.sqsQueueArn = sqsQueueArn;
    }

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^arn[\/\:\-\_\.a-zA-Z0-9]+$<br/>
     *
     * @param sqsQueueArn <p>
     *            The SQS queue ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeetingNotificationConfiguration withSqsQueueArn(String sqsQueueArn) {
        this.sqsQueueArn = sqsQueueArn;
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
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getSqsQueueArn() != null)
            sb.append("SqsQueueArn: " + getSqsQueueArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getSqsQueueArn() == null) ? 0 : getSqsQueueArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingNotificationConfiguration == false)
            return false;
        MeetingNotificationConfiguration other = (MeetingNotificationConfiguration) obj;

        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSqsQueueArn() == null ^ this.getSqsQueueArn() == null)
            return false;
        if (other.getSqsQueueArn() != null
                && other.getSqsQueueArn().equals(this.getSqsQueueArn()) == false)
            return false;
        return true;
    }
}
