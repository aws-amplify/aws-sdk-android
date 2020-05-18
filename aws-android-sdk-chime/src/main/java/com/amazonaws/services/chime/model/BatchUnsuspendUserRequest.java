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
 * Removes the suspension from up to 50 previously suspended users for the
 * specified Amazon Chime <code>EnterpriseLWA</code> account. Only users on
 * <code>EnterpriseLWA</code> accounts can be unsuspended using this action. For
 * more information about different account types, see <a href=
 * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
 * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
 * Administration Guide</i>.
 * </p>
 * <p>
 * Previously suspended users who are unsuspended using this action are returned
 * to <code>Registered</code> status. Users who are not previously suspended are
 * ignored.
 * </p>
 */
public class BatchUnsuspendUserRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The request containing the user IDs to unsuspend.
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
    public BatchUnsuspendUserRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs to unsuspend.
     * </p>
     *
     * @return <p>
     *         The request containing the user IDs to unsuspend.
     *         </p>
     */
    public java.util.List<String> getUserIdList() {
        return userIdList;
    }

    /**
     * <p>
     * The request containing the user IDs to unsuspend.
     * </p>
     *
     * @param userIdList <p>
     *            The request containing the user IDs to unsuspend.
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
     * The request containing the user IDs to unsuspend.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdList <p>
     *            The request containing the user IDs to unsuspend.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUnsuspendUserRequest withUserIdList(String... userIdList) {
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
     * The request containing the user IDs to unsuspend.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdList <p>
     *            The request containing the user IDs to unsuspend.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUnsuspendUserRequest withUserIdList(java.util.Collection<String> userIdList) {
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

        if (obj instanceof BatchUnsuspendUserRequest == false)
            return false;
        BatchUnsuspendUserRequest other = (BatchUnsuspendUserRequest) obj;

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
