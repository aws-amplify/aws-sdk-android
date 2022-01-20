/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListUsersResult implements Serializable {
    /**
     * <p>
     * Information about the users.
     * </p>
     */
    private java.util.List<UserSummary> userSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the users.
     * </p>
     *
     * @return <p>
     *         Information about the users.
     *         </p>
     */
    public java.util.List<UserSummary> getUserSummaryList() {
        return userSummaryList;
    }

    /**
     * <p>
     * Information about the users.
     * </p>
     *
     * @param userSummaryList <p>
     *            Information about the users.
     *            </p>
     */
    public void setUserSummaryList(java.util.Collection<UserSummary> userSummaryList) {
        if (userSummaryList == null) {
            this.userSummaryList = null;
            return;
        }

        this.userSummaryList = new java.util.ArrayList<UserSummary>(userSummaryList);
    }

    /**
     * <p>
     * Information about the users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userSummaryList <p>
     *            Information about the users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withUserSummaryList(UserSummary... userSummaryList) {
        if (getUserSummaryList() == null) {
            this.userSummaryList = new java.util.ArrayList<UserSummary>(userSummaryList.length);
        }
        for (UserSummary value : userSummaryList) {
            this.userSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userSummaryList <p>
     *            Information about the users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withUserSummaryList(java.util.Collection<UserSummary> userSummaryList) {
        setUserSummaryList(userSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getUserSummaryList() != null)
            sb.append("UserSummaryList: " + getUserSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserSummaryList() == null) ? 0 : getUserSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersResult == false)
            return false;
        ListUsersResult other = (ListUsersResult) obj;

        if (other.getUserSummaryList() == null ^ this.getUserSummaryList() == null)
            return false;
        if (other.getUserSummaryList() != null
                && other.getUserSummaryList().equals(this.getUserSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
