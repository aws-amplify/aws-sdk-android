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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The details about a member account.
 * </p>
 */
public class Member implements Serializable {
    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String email;

    /**
     * <p>
     * The AWS account ID of the Security Hub master account associated with
     * this member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String masterId;

    /**
     * <p>
     * The status of the relationship between the member account and its master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String memberStatus;

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the
     * member account.
     * </p>
     */
    private java.util.Date invitedAt;

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the member account.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     *
     * @param accountId <p>
     *            The AWS account ID of the member account.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The AWS account ID of the member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The email address of the member account.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param email <p>
     *            The email address of the member account.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param email <p>
     *            The email address of the member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the Security Hub master account associated with
     * this member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The AWS account ID of the Security Hub master account associated
     *         with this member account.
     *         </p>
     */
    public String getMasterId() {
        return masterId;
    }

    /**
     * <p>
     * The AWS account ID of the Security Hub master account associated with
     * this member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterId <p>
     *            The AWS account ID of the Security Hub master account
     *            associated with this member account.
     *            </p>
     */
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The AWS account ID of the Security Hub master account associated with
     * this member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param masterId <p>
     *            The AWS account ID of the Security Hub master account
     *            associated with this member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the member account and its master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The status of the relationship between the member account and its
     *         master account.
     *         </p>
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member account and its master
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberStatus <p>
     *            The status of the relationship between the member account and
     *            its master account.
     *            </p>
     */
    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member account and its master
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberStatus <p>
     *            The status of the relationship between the member account and
     *            its master account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the
     * member account.
     * </p>
     *
     * @return <p>
     *         A timestamp for the date and time when the invitation was sent to
     *         the member account.
     *         </p>
     */
    public java.util.Date getInvitedAt() {
        return invitedAt;
    }

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the
     * member account.
     * </p>
     *
     * @param invitedAt <p>
     *            A timestamp for the date and time when the invitation was sent
     *            to the member account.
     *            </p>
     */
    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * A timestamp for the date and time when the invitation was sent to the
     * member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitedAt <p>
     *            A timestamp for the date and time when the invitation was sent
     *            to the member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
        return this;
    }

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     *
     * @return <p>
     *         The timestamp for the date and time when the member account was
     *         updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The timestamp for the date and time when the member account
     *            was updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp for the date and time when the member account was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The timestamp for the date and time when the member account
     *            was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withUpdatedAt(java.util.Date updatedAt) {
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
            sb.append("AccountId: " + getAccountId() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getMasterId() != null)
            sb.append("MasterId: " + getMasterId() + ",");
        if (getMemberStatus() != null)
            sb.append("MemberStatus: " + getMemberStatus() + ",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: " + getInvitedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode
                + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Member == false)
            return false;
        Member other = (Member) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getMemberStatus() == null ^ this.getMemberStatus() == null)
            return false;
        if (other.getMemberStatus() != null
                && other.getMemberStatus().equals(this.getMemberStatus()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null
                && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
