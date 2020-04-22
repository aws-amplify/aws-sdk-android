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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Designates the IAM role and Amazon Simple Notification Service (SNS) topic
 * that AWS Firewall Manager uses to record SNS logs.
 * </p>
 */
public class PutNotificationChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String snsRoleName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SNS topic that collects
     *         notifications from AWS Firewall Manager.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param snsTopicArn <p>
     *            The Amazon Resource Name (ARN) of the SNS topic that collects
     *            notifications from AWS Firewall Manager.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param snsTopicArn <p>
     *            The Amazon Resource Name (ARN) of the SNS topic that collects
     *            notifications from AWS Firewall Manager.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutNotificationChannelRequest withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that allows Amazon
     *         SNS to record AWS Firewall Manager activity.
     *         </p>
     */
    public String getSnsRoleName() {
        return snsRoleName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param snsRoleName <p>
     *            The Amazon Resource Name (ARN) of the IAM role that allows
     *            Amazon SNS to record AWS Firewall Manager activity.
     *            </p>
     */
    public void setSnsRoleName(String snsRoleName) {
        this.snsRoleName = snsRoleName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param snsRoleName <p>
     *            The Amazon Resource Name (ARN) of the IAM role that allows
     *            Amazon SNS to record AWS Firewall Manager activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutNotificationChannelRequest withSnsRoleName(String snsRoleName) {
        this.snsRoleName = snsRoleName;
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
        if (getSnsRoleName() != null)
            sb.append("SnsRoleName: " + getSnsRoleName());
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
                + ((getSnsRoleName() == null) ? 0 : getSnsRoleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutNotificationChannelRequest == false)
            return false;
        PutNotificationChannelRequest other = (PutNotificationChannelRequest) obj;

        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsRoleName() == null ^ this.getSnsRoleName() == null)
            return false;
        if (other.getSnsRoleName() != null
                && other.getSnsRoleName().equals(this.getSnsRoleName()) == false)
            return false;
        return true;
    }
}
