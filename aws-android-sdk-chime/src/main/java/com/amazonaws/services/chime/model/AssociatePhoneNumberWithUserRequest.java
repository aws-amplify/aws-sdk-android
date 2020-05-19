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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates a phone number with the specified Amazon Chime user.
 * </p>
 */
public class AssociatePhoneNumberWithUserRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     */
    private String e164PhoneNumber;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
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
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumberWithUserRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     *
     * @return <p>
     *         The user ID.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumberWithUserRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number, in E.164 format.
     *         </p>
     */
    public String getE164PhoneNumber() {
        return e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param e164PhoneNumber <p>
     *            The phone number, in E.164 format.
     *            </p>
     */
    public void setE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\+?[1-9]\d{1,14}$<br/>
     *
     * @param e164PhoneNumber <p>
     *            The phone number, in E.164 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePhoneNumberWithUserRequest withE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getE164PhoneNumber() != null)
            sb.append("E164PhoneNumber: " + getE164PhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode
                + ((getE164PhoneNumber() == null) ? 0 : getE164PhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatePhoneNumberWithUserRequest == false)
            return false;
        AssociatePhoneNumberWithUserRequest other = (AssociatePhoneNumberWithUserRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getE164PhoneNumber() == null ^ this.getE164PhoneNumber() == null)
            return false;
        if (other.getE164PhoneNumber() != null
                && other.getE164PhoneNumber().equals(this.getE164PhoneNumber()) == false)
            return false;
        return true;
    }
}
