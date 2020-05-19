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
 * The member details, such as email address, name, member ID, and member type.
 * </p>
 */
public class Member implements Serializable {
    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String memberId;

    /**
     * <p>
     * The member type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Bot, Webhook
     */
    private String memberType;

    /**
     * <p>
     * The member email address.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The member name.
     * </p>
     */
    private String fullName;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String accountId;

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The member ID (user ID or bot ID).
     *         </p>
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberId <p>
     *            The member ID (user ID or bot ID).
     *            </p>
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The member ID (user ID or bot ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberId <p>
     *            The member ID (user ID or bot ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Bot, Webhook
     *
     * @return <p>
     *         The member type.
     *         </p>
     * @see MemberType
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Bot, Webhook
     *
     * @param memberType <p>
     *            The member type.
     *            </p>
     * @see MemberType
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Bot, Webhook
     *
     * @param memberType <p>
     *            The member type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MemberType
     */
    public Member withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * <p>
     * The member type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Bot, Webhook
     *
     * @param memberType <p>
     *            The member type.
     *            </p>
     * @see MemberType
     */
    public void setMemberType(MemberType memberType) {
        this.memberType = memberType.toString();
    }

    /**
     * <p>
     * The member type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>User, Bot, Webhook
     *
     * @param memberType <p>
     *            The member type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MemberType
     */
    public Member withMemberType(MemberType memberType) {
        this.memberType = memberType.toString();
        return this;
    }

    /**
     * <p>
     * The member email address.
     * </p>
     *
     * @return <p>
     *         The member email address.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The member email address.
     * </p>
     *
     * @param email <p>
     *            The member email address.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The member email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The member email address.
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
     * The member name.
     * </p>
     *
     * @return <p>
     *         The member name.
     *         </p>
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * <p>
     * The member name.
     * </p>
     *
     * @param fullName <p>
     *            The member name.
     *            </p>
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * <p>
     * The member name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullName <p>
     *            The member name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Member withAccountId(String accountId) {
        this.accountId = accountId;
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
        if (getMemberId() != null)
            sb.append("MemberId: " + getMemberId() + ",");
        if (getMemberType() != null)
            sb.append("MemberType: " + getMemberType() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getFullName() != null)
            sb.append("FullName: " + getFullName() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getFullName() == null) ? 0 : getFullName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
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

        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null
                && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getFullName() == null ^ this.getFullName() == null)
            return false;
        if (other.getFullName() != null && other.getFullName().equals(this.getFullName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }
}
