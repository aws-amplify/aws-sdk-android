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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends an Amazon Macie membership invitation to one or more accounts.
 * </p>
 */
public class CreateInvitationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array that lists AWS account IDs, one for each account to send the
     * invitation to.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each
     * account that the invitation will be sent to. This notification is in
     * addition to an alert that the root user receives in AWS Personal Health
     * Dashboard. To send an email notification to the root user of each
     * account, set this value to true.
     * </p>
     */
    private Boolean disableEmailNotification;

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this
     * message to the standard content that it sends for an invitation.
     * </p>
     */
    private String message;

    /**
     * <p>
     * An array that lists AWS account IDs, one for each account to send the
     * invitation to.
     * </p>
     *
     * @return <p>
     *         An array that lists AWS account IDs, one for each account to send
     *         the invitation to.
     *         </p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * An array that lists AWS account IDs, one for each account to send the
     * invitation to.
     * </p>
     *
     * @param accountIds <p>
     *            An array that lists AWS account IDs, one for each account to
     *            send the invitation to.
     *            </p>
     */
    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * An array that lists AWS account IDs, one for each account to send the
     * invitation to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            An array that lists AWS account IDs, one for each account to
     *            send the invitation to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvitationsRequest withAccountIds(String... accountIds) {
        if (getAccountIds() == null) {
            this.accountIds = new java.util.ArrayList<String>(accountIds.length);
        }
        for (String value : accountIds) {
            this.accountIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists AWS account IDs, one for each account to send the
     * invitation to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            An array that lists AWS account IDs, one for each account to
     *            send the invitation to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvitationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each
     * account that the invitation will be sent to. This notification is in
     * addition to an alert that the root user receives in AWS Personal Health
     * Dashboard. To send an email notification to the root user of each
     * account, set this value to true.
     * </p>
     *
     * @return <p>
     *         Specifies whether to send an email notification to the root user
     *         of each account that the invitation will be sent to. This
     *         notification is in addition to an alert that the root user
     *         receives in AWS Personal Health Dashboard. To send an email
     *         notification to the root user of each account, set this value to
     *         true.
     *         </p>
     */
    public Boolean isDisableEmailNotification() {
        return disableEmailNotification;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each
     * account that the invitation will be sent to. This notification is in
     * addition to an alert that the root user receives in AWS Personal Health
     * Dashboard. To send an email notification to the root user of each
     * account, set this value to true.
     * </p>
     *
     * @return <p>
     *         Specifies whether to send an email notification to the root user
     *         of each account that the invitation will be sent to. This
     *         notification is in addition to an alert that the root user
     *         receives in AWS Personal Health Dashboard. To send an email
     *         notification to the root user of each account, set this value to
     *         true.
     *         </p>
     */
    public Boolean getDisableEmailNotification() {
        return disableEmailNotification;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each
     * account that the invitation will be sent to. This notification is in
     * addition to an alert that the root user receives in AWS Personal Health
     * Dashboard. To send an email notification to the root user of each
     * account, set this value to true.
     * </p>
     *
     * @param disableEmailNotification <p>
     *            Specifies whether to send an email notification to the root
     *            user of each account that the invitation will be sent to. This
     *            notification is in addition to an alert that the root user
     *            receives in AWS Personal Health Dashboard. To send an email
     *            notification to the root user of each account, set this value
     *            to true.
     *            </p>
     */
    public void setDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each
     * account that the invitation will be sent to. This notification is in
     * addition to an alert that the root user receives in AWS Personal Health
     * Dashboard. To send an email notification to the root user of each
     * account, set this value to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableEmailNotification <p>
     *            Specifies whether to send an email notification to the root
     *            user of each account that the invitation will be sent to. This
     *            notification is in addition to an alert that the root user
     *            receives in AWS Personal Health Dashboard. To send an email
     *            notification to the root user of each account, set this value
     *            to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvitationsRequest withDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
        return this;
    }

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this
     * message to the standard content that it sends for an invitation.
     * </p>
     *
     * @return <p>
     *         A custom message to include in the invitation. Amazon Macie adds
     *         this message to the standard content that it sends for an
     *         invitation.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this
     * message to the standard content that it sends for an invitation.
     * </p>
     *
     * @param message <p>
     *            A custom message to include in the invitation. Amazon Macie
     *            adds this message to the standard content that it sends for an
     *            invitation.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this
     * message to the standard content that it sends for an invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A custom message to include in the invitation. Amazon Macie
     *            adds this message to the standard content that it sends for an
     *            invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvitationsRequest withMessage(String message) {
        this.message = message;
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
        if (getAccountIds() != null)
            sb.append("accountIds: " + getAccountIds() + ",");
        if (getDisableEmailNotification() != null)
            sb.append("disableEmailNotification: " + getDisableEmailNotification() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableEmailNotification() == null) ? 0 : getDisableEmailNotification()
                        .hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvitationsRequest == false)
            return false;
        CreateInvitationsRequest other = (CreateInvitationsRequest) obj;

        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null
                && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getDisableEmailNotification() == null
                ^ this.getDisableEmailNotification() == null)
            return false;
        if (other.getDisableEmailNotification() != null
                && other.getDisableEmailNotification().equals(this.getDisableEmailNotification()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
