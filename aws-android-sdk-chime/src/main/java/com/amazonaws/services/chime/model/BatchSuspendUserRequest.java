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
 * Suspends up to 50 users from a <code>Team</code> or
 * <code>EnterpriseLWA</code> Amazon Chime account. For more information about
 * different account types, see <a href=
 * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
 * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
 * Administration Guide</i>.
 * </p>
 * <p>
 * Users suspended from a <code>Team</code> account are disassociated from the
 * account, but they can continue to use Amazon Chime as free users. To remove
 * the suspension from suspended <code>Team</code> account users, invite them to
 * the <code>Team</code> account again. You can use the <a>InviteUsers</a>
 * action to do so.
 * </p>
 * <p>
 * Users suspended from an <code>EnterpriseLWA</code> account are immediately
 * signed out of Amazon Chime and can no longer sign in. To remove the
 * suspension from suspended <code>EnterpriseLWA</code> account users, use the
 * <a>BatchUnsuspendUser</a> action.
 * </p>
 * <p>
 * To sign out users without suspending them, use the <a>LogoutUser</a> action.
 * </p>
 */
public class BatchSuspendUserRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The request containing the user IDs to suspend.
     * </p>
     */
    private java.util.List<String> userIdList;

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
    public BatchSuspendUserRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs to suspend.
     * </p>
     *
     * @return <p>
     *         The request containing the user IDs to suspend.
     *         </p>
     */
    public java.util.List<String> getUserIdList() {
        return userIdList;
    }

    /**
     * <p>
     * The request containing the user IDs to suspend.
     * </p>
     *
     * @param userIdList <p>
     *            The request containing the user IDs to suspend.
     *            </p>
     */
    public void setUserIdList(java.util.Collection<String> userIdList) {
        if (userIdList == null) {
            this.userIdList = null;
            return;
        }

        this.userIdList = new java.util.ArrayList<String>(userIdList);
    }

    /**
     * <p>
     * The request containing the user IDs to suspend.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdList <p>
     *            The request containing the user IDs to suspend.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchSuspendUserRequest withUserIdList(String... userIdList) {
        if (getUserIdList() == null) {
            this.userIdList = new java.util.ArrayList<String>(userIdList.length);
        }
        for (String value : userIdList) {
            this.userIdList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs to suspend.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdList <p>
     *            The request containing the user IDs to suspend.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchSuspendUserRequest withUserIdList(java.util.Collection<String> userIdList) {
        setUserIdList(userIdList);
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
        if (getUserIdList() != null)
            sb.append("UserIdList: " + getUserIdList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserIdList() == null) ? 0 : getUserIdList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchSuspendUserRequest == false)
            return false;
        BatchSuspendUserRequest other = (BatchSuspendUserRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserIdList() == null ^ this.getUserIdList() == null)
            return false;
        if (other.getUserIdList() != null
                && other.getUserIdList().equals(this.getUserIdList()) == false)
            return false;
        return true;
    }
}
