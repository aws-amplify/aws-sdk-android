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

public class GetMemberResult implements Serializable {
    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The email address for the account.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon
     * Macie membership invitation was last sent to the account. This value is
     * null if a Macie invitation hasn't been sent to the account.
     * </p>
     */
    private java.util.Date invitedAt;

    /**
     * <p>
     * The AWS account ID for the master account.
     * </p>
     */
    private String masterAccountId;

    /**
     * <p>
     * The current status of the relationship between the account and the master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     */
    private String relationshipStatus;

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the member account in Amazon Macie.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the relationship between the account and
     * the master account.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the account.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     *
     * @param accountId <p>
     *            The AWS account ID for the account.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The AWS account ID for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the account.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the account.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     *
     * @return <p>
     *         The email address for the account.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     *
     * @param email <p>
     *            The email address for the account.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon
     * Macie membership invitation was last sent to the account. This value is
     * null if a Macie invitation hasn't been sent to the account.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when an
     *         Amazon Macie membership invitation was last sent to the account.
     *         This value is null if a Macie invitation hasn't been sent to the
     *         account.
     *         </p>
     */
    public java.util.Date getInvitedAt() {
        return invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon
     * Macie membership invitation was last sent to the account. This value is
     * null if a Macie invitation hasn't been sent to the account.
     * </p>
     *
     * @param invitedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            an Amazon Macie membership invitation was last sent to the
     *            account. This value is null if a Macie invitation hasn't been
     *            sent to the account.
     *            </p>
     */
    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon
     * Macie membership invitation was last sent to the account. This value is
     * null if a Macie invitation hasn't been sent to the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            an Amazon Macie membership invitation was last sent to the
     *            account. This value is null if a Macie invitation hasn't been
     *            sent to the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the master account.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the master account.
     *         </p>
     */
    public String getMasterAccountId() {
        return masterAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the master account.
     * </p>
     *
     * @param masterAccountId <p>
     *            The AWS account ID for the master account.
     *            </p>
     */
    public void setMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the master account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterAccountId <p>
     *            The AWS account ID for the master account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
        return this;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @return <p>
     *         The current status of the relationship between the account and
     *         the master account.
     *         </p>
     * @see RelationshipStatus
     */
    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The current status of the relationship between the account and
     *            the master account.
     *            </p>
     * @see RelationshipStatus
     */
    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the master
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The current status of the relationship between the account and
     *            the master account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipStatus
     */
    public GetMemberResult withRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The current status of the relationship between the account and
     *            the master account.
     *            </p>
     * @see RelationshipStatus
     */
    public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
    }

    /**
     * <p>
     * The current status of the relationship between the account and the master
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Paused, Invited, Created, Removed,
     * Resigned, EmailVerificationInProgress, EmailVerificationFailed
     *
     * @param relationshipStatus <p>
     *            The current status of the relationship between the account and
     *            the master account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipStatus
     */
    public GetMemberResult withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the member account in Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that identifies the tags (keys and
     *         values) that are associated with the member account in Amazon
     *         Macie.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the member account in Amazon Macie.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the member account in Amazon
     *            Macie.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the member account in Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the member account in Amazon
     *            Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the member account in Amazon Macie.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetMemberResult cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the relationship between the account and
     * the master account.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, of the
     *         most recent change to the status of the relationship between the
     *         account and the master account.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the relationship between the account and
     * the master account.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, of the
     *            most recent change to the status of the relationship between
     *            the account and the master account.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the relationship between the account and
     * the master account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, of the
     *            most recent change to the status of the relationship between
     *            the account and the master account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMemberResult withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getEmail() != null)
            sb.append("email: " + getEmail() + ",");
        if (getInvitedAt() != null)
            sb.append("invitedAt: " + getInvitedAt() + ",");
        if (getMasterAccountId() != null)
            sb.append("masterAccountId: " + getMasterAccountId() + ",");
        if (getRelationshipStatus() != null)
            sb.append("relationshipStatus: " + getRelationshipStatus() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode
                + ((getMasterAccountId() == null) ? 0 : getMasterAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMemberResult == false)
            return false;
        GetMemberResult other = (GetMemberResult) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null
                && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getMasterAccountId() == null ^ this.getMasterAccountId() == null)
            return false;
        if (other.getMasterAccountId() != null
                && other.getMasterAccountId().equals(this.getMasterAccountId()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null
                && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
