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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class SearchUsersResult implements Serializable {
    /**
     * <p>
     * The users that meet the specified set of filter criteria, in sort order.
     * </p>
     */
    private java.util.List<UserData> users;

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of users returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The users that meet the specified set of filter criteria, in sort order.
     * </p>
     *
     * @return <p>
     *         The users that meet the specified set of filter criteria, in sort
     *         order.
     *         </p>
     */
    public java.util.List<UserData> getUsers() {
        return users;
    }

    /**
     * <p>
     * The users that meet the specified set of filter criteria, in sort order.
     * </p>
     *
     * @param users <p>
     *            The users that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     */
    public void setUsers(java.util.Collection<UserData> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<UserData>(users);
    }

    /**
     * <p>
     * The users that meet the specified set of filter criteria, in sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            The users that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersResult withUsers(UserData... users) {
        if (getUsers() == null) {
            this.users = new java.util.ArrayList<UserData>(users.length);
        }
        for (UserData value : users) {
            this.users.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The users that meet the specified set of filter criteria, in sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            The users that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersResult withUsers(java.util.Collection<UserData> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The token returned to indicate that there is more data available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of users returned.
     * </p>
     *
     * @return <p>
     *         The total number of users returned.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of users returned.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of users returned.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of users returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of users returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        if (getUsers() != null)
            sb.append("Users: " + getUsers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTotalCount() != null)
            sb.append("TotalCount: " + getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersResult == false)
            return false;
        SearchUsersResult other = (SearchUsersResult) obj;

        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }
}
