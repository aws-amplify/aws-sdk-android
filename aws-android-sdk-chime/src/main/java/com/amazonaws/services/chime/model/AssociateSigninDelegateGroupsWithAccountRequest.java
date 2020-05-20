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
 * Associates the specified sign-in delegate groups with the specified Amazon
 * Chime account.
 * </p>
 */
public class AssociateSigninDelegateGroupsWithAccountRequest extends AmazonWebServiceRequest
        implements Serializable {
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
     * The sign-in delegate groups.
     * </p>
     */
    private java.util.List<SigninDelegateGroup> signinDelegateGroups;

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
    public AssociateSigninDelegateGroupsWithAccountRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     *
     * @return <p>
     *         The sign-in delegate groups.
     *         </p>
     */
    public java.util.List<SigninDelegateGroup> getSigninDelegateGroups() {
        return signinDelegateGroups;
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     *
     * @param signinDelegateGroups <p>
     *            The sign-in delegate groups.
     *            </p>
     */
    public void setSigninDelegateGroups(
            java.util.Collection<SigninDelegateGroup> signinDelegateGroups) {
        if (signinDelegateGroups == null) {
            this.signinDelegateGroups = null;
            return;
        }

        this.signinDelegateGroups = new java.util.ArrayList<SigninDelegateGroup>(
                signinDelegateGroups);
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signinDelegateGroups <p>
     *            The sign-in delegate groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSigninDelegateGroupsWithAccountRequest withSigninDelegateGroups(
            SigninDelegateGroup... signinDelegateGroups) {
        if (getSigninDelegateGroups() == null) {
            this.signinDelegateGroups = new java.util.ArrayList<SigninDelegateGroup>(
                    signinDelegateGroups.length);
        }
        for (SigninDelegateGroup value : signinDelegateGroups) {
            this.signinDelegateGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signinDelegateGroups <p>
     *            The sign-in delegate groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSigninDelegateGroupsWithAccountRequest withSigninDelegateGroups(
            java.util.Collection<SigninDelegateGroup> signinDelegateGroups) {
        setSigninDelegateGroups(signinDelegateGroups);
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
        if (getSigninDelegateGroups() != null)
            sb.append("SigninDelegateGroups: " + getSigninDelegateGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getSigninDelegateGroups() == null) ? 0 : getSigninDelegateGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSigninDelegateGroupsWithAccountRequest == false)
            return false;
        AssociateSigninDelegateGroupsWithAccountRequest other = (AssociateSigninDelegateGroupsWithAccountRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSigninDelegateGroups() == null ^ this.getSigninDelegateGroups() == null)
            return false;
        if (other.getSigninDelegateGroups() != null
                && other.getSigninDelegateGroups().equals(this.getSigninDelegateGroups()) == false)
            return false;
        return true;
    }
}
