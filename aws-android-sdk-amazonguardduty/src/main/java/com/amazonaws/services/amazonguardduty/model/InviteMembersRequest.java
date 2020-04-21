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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Invites other AWS accounts (created as members of the current AWS account by
 * CreateMembers) to enable GuardDuty, and allow the current AWS account to view
 * and manage these accounts' GuardDuty findings on their behalf as the master
 * account.
 * </p>
 */
public class InviteMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * invite members with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * A list of account IDs of the accounts that you want to invite to
     * GuardDuty as members.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * A Boolean value that specifies whether you want to disable email
     * notification to the accounts that you’re inviting to GuardDuty as
     * members.
     * </p>
     */
    private Boolean disableEmailNotification;

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * invite members with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector of the GuardDuty account that you
     *         want to invite members with.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * invite members with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to invite members with.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * invite members with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to invite members with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteMembersRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the accounts that you want to invite to
     * GuardDuty as members.
     * </p>
     *
     * @return <p>
     *         A list of account IDs of the accounts that you want to invite to
     *         GuardDuty as members.
     *         </p>
     */
    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * A list of account IDs of the accounts that you want to invite to
     * GuardDuty as members.
     * </p>
     *
     * @param accountIds <p>
     *            A list of account IDs of the accounts that you want to invite
     *            to GuardDuty as members.
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
     * A list of account IDs of the accounts that you want to invite to
     * GuardDuty as members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            A list of account IDs of the accounts that you want to invite
     *            to GuardDuty as members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteMembersRequest withAccountIds(String... accountIds) {
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
     * A list of account IDs of the accounts that you want to invite to
     * GuardDuty as members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountIds <p>
     *            A list of account IDs of the accounts that you want to invite
     *            to GuardDuty as members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteMembersRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether you want to disable email
     * notification to the accounts that you’re inviting to GuardDuty as
     * members.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether you want to disable email
     *         notification to the accounts that you’re inviting to GuardDuty as
     *         members.
     *         </p>
     */
    public Boolean isDisableEmailNotification() {
        return disableEmailNotification;
    }

    /**
     * <p>
     * A Boolean value that specifies whether you want to disable email
     * notification to the accounts that you’re inviting to GuardDuty as
     * members.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether you want to disable email
     *         notification to the accounts that you’re inviting to GuardDuty as
     *         members.
     *         </p>
     */
    public Boolean getDisableEmailNotification() {
        return disableEmailNotification;
    }

    /**
     * <p>
     * A Boolean value that specifies whether you want to disable email
     * notification to the accounts that you’re inviting to GuardDuty as
     * members.
     * </p>
     *
     * @param disableEmailNotification <p>
     *            A Boolean value that specifies whether you want to disable
     *            email notification to the accounts that you’re inviting to
     *            GuardDuty as members.
     *            </p>
     */
    public void setDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
    }

    /**
     * <p>
     * A Boolean value that specifies whether you want to disable email
     * notification to the accounts that you’re inviting to GuardDuty as
     * members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableEmailNotification <p>
     *            A Boolean value that specifies whether you want to disable
     *            email notification to the accounts that you’re inviting to
     *            GuardDuty as members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteMembersRequest withDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
        return this;
    }

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     *
     * @return <p>
     *         The invitation message that you want to send to the accounts that
     *         you’re inviting to GuardDuty as members.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     *
     * @param message <p>
     *            The invitation message that you want to send to the accounts
     *            that you’re inviting to GuardDuty as members.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The invitation message that you want to send to the accounts
     *            that you’re inviting to GuardDuty as members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteMembersRequest withMessage(String message) {
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getAccountIds() != null)
            sb.append("AccountIds: " + getAccountIds() + ",");
        if (getDisableEmailNotification() != null)
            sb.append("DisableEmailNotification: " + getDisableEmailNotification() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
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

        if (obj instanceof InviteMembersRequest == false)
            return false;
        InviteMembersRequest other = (InviteMembersRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
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
