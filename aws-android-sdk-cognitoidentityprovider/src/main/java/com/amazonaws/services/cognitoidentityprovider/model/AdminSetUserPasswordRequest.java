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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the specified user's password in a user pool as an administrator. Works
 * on any user.
 * </p>
 * <p>
 * The password can be temporary or permanent. If it is temporary, the user
 * status will be placed into the <code>FORCE_CHANGE_PASSWORD</code> state. When
 * the user next tries to sign in, the InitiateAuth/AdminInitiateAuth response
 * will contain the <code>NEW_PASSWORD_REQUIRED</code> challenge. If the user
 * does not sign in before it expires, the user will not be able to sign in and
 * their password will need to be reset by an administrator.
 * </p>
 * <p>
 * Once the user has set a new password, or the password is permanent, the user
 * status will be set to <code>Confirmed</code>.
 * </p>
 */
public class AdminSetUserPasswordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to set the user's
     * password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The user name of the user whose password you wish to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * The password for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String password;

    /**
     * <p>
     * <code>True</code> if the password is permanent, <code>False</code> if it
     * is temporary.
     * </p>
     */
    private Boolean permanent;

    /**
     * <p>
     * The user pool ID for the user pool where you want to set the user's
     * password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to set the
     *         user's password.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to set the user's
     * password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to set the
     *            user's password.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to set the user's
     * password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to set the
     *            user's password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserPasswordRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The user name of the user whose password you wish to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user whose password you wish to set.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user whose password you wish to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user whose password you wish to set.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user whose password you wish to set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user whose password you wish to set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserPasswordRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The password for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The password for the user.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param password <p>
     *            The password for the user.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param password <p>
     *            The password for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserPasswordRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the password is permanent, <code>False</code> if it
     * is temporary.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the password is permanent,
     *         <code>False</code> if it is temporary.
     *         </p>
     */
    public Boolean isPermanent() {
        return permanent;
    }

    /**
     * <p>
     * <code>True</code> if the password is permanent, <code>False</code> if it
     * is temporary.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the password is permanent,
     *         <code>False</code> if it is temporary.
     *         </p>
     */
    public Boolean getPermanent() {
        return permanent;
    }

    /**
     * <p>
     * <code>True</code> if the password is permanent, <code>False</code> if it
     * is temporary.
     * </p>
     *
     * @param permanent <p>
     *            <code>True</code> if the password is permanent,
     *            <code>False</code> if it is temporary.
     *            </p>
     */
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * <p>
     * <code>True</code> if the password is permanent, <code>False</code> if it
     * is temporary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permanent <p>
     *            <code>True</code> if the password is permanent,
     *            <code>False</code> if it is temporary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminSetUserPasswordRequest withPermanent(Boolean permanent) {
        this.permanent = permanent;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getPermanent() != null)
            sb.append("Permanent: " + getPermanent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminSetUserPasswordRequest == false)
            return false;
        AdminSetUserPasswordRequest other = (AdminSetUserPasswordRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null
                && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        return true;
    }
}
