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
 * Sends email to a maximum of 50 users, inviting them to the specified Amazon
 * Chime <code>Team</code> account. Only <code>Team</code> account types are
 * currently supported for this action.
 * </p>
 */
public class InviteUsersRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The user email addresses to which to send the email invitation.
     * </p>
     */
    private java.util.List<String> userEmailList;

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     */
    private String userType;

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
    public InviteUsersRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The user email addresses to which to send the email invitation.
     * </p>
     *
     * @return <p>
     *         The user email addresses to which to send the email invitation.
     *         </p>
     */
    public java.util.List<String> getUserEmailList() {
        return userEmailList;
    }

    /**
     * <p>
     * The user email addresses to which to send the email invitation.
     * </p>
     *
     * @param userEmailList <p>
     *            The user email addresses to which to send the email
     *            invitation.
     *            </p>
     */
    public void setUserEmailList(java.util.Collection<String> userEmailList) {
        if (userEmailList == null) {
            this.userEmailList = null;
            return;
        }

        this.userEmailList = new java.util.ArrayList<String>(userEmailList);
    }

    /**
     * <p>
     * The user email addresses to which to send the email invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userEmailList <p>
     *            The user email addresses to which to send the email
     *            invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteUsersRequest withUserEmailList(String... userEmailList) {
        if (getUserEmailList() == null) {
            this.userEmailList = new java.util.ArrayList<String>(userEmailList.length);
        }
        for (String value : userEmailList) {
            this.userEmailList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user email addresses to which to send the email invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userEmailList <p>
     *            The user email addresses to which to send the email
     *            invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteUsersRequest withUserEmailList(java.util.Collection<String> userEmailList) {
        setUserEmailList(userEmailList);
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @return <p>
     *         The user type.
     *         </p>
     * @see UserType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public InviteUsersRequest withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(UserType userType) {
        this.userType = userType.toString();
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public InviteUsersRequest withUserType(UserType userType) {
        this.userType = userType.toString();
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
        if (getUserEmailList() != null)
            sb.append("UserEmailList: " + getUserEmailList() + ",");
        if (getUserType() != null)
            sb.append("UserType: " + getUserType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getUserEmailList() == null) ? 0 : getUserEmailList().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteUsersRequest == false)
            return false;
        InviteUsersRequest other = (InviteUsersRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserEmailList() == null ^ this.getUserEmailList() == null)
            return false;
        if (other.getUserEmailList() != null
                && other.getUserEmailList().equals(this.getUserEmailList()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        return true;
    }
}
