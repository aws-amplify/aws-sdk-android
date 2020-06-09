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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

public class ListUsersResult implements Serializable {
    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call,
     * a <code>NextToken</code> parameter is returned in the output. You can
     * then pass in a subsequent command to the <code>NextToken</code> parameter
     * to continue listing additional users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that the users are assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * Returns the user accounts and their properties for the
     * <code>ServerId</code> value that you specify.
     * </p>
     */
    private java.util.List<ListedUser> users;

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call,
     * a <code>NextToken</code> parameter is returned in the output. You can
     * then pass in a subsequent command to the <code>NextToken</code> parameter
     * to continue listing additional users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         When you can get additional results from the
     *         <code>ListUsers</code> call, a <code>NextToken</code> parameter
     *         is returned in the output. You can then pass in a subsequent
     *         command to the <code>NextToken</code> parameter to continue
     *         listing additional users.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call,
     * a <code>NextToken</code> parameter is returned in the output. You can
     * then pass in a subsequent command to the <code>NextToken</code> parameter
     * to continue listing additional users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you can get additional results from the
     *            <code>ListUsers</code> call, a <code>NextToken</code>
     *            parameter is returned in the output. You can then pass in a
     *            subsequent command to the <code>NextToken</code> parameter to
     *            continue listing additional users.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call,
     * a <code>NextToken</code> parameter is returned in the output. You can
     * then pass in a subsequent command to the <code>NextToken</code> parameter
     * to continue listing additional users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you can get additional results from the
     *            <code>ListUsers</code> call, a <code>NextToken</code>
     *            parameter is returned in the output. You can then pass in a
     *            subsequent command to the <code>NextToken</code> parameter to
     *            continue listing additional users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that the users are assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         A system-assigned unique identifier for a file transfer
     *         protocol-enabled server that the users are assigned to.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that the users are assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server that the users are assigned to.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that the users are assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server that the users are assigned to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the
     * <code>ServerId</code> value that you specify.
     * </p>
     *
     * @return <p>
     *         Returns the user accounts and their properties for the
     *         <code>ServerId</code> value that you specify.
     *         </p>
     */
    public java.util.List<ListedUser> getUsers() {
        return users;
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the
     * <code>ServerId</code> value that you specify.
     * </p>
     *
     * @param users <p>
     *            Returns the user accounts and their properties for the
     *            <code>ServerId</code> value that you specify.
     *            </p>
     */
    public void setUsers(java.util.Collection<ListedUser> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<ListedUser>(users);
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the
     * <code>ServerId</code> value that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            Returns the user accounts and their properties for the
     *            <code>ServerId</code> value that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withUsers(ListedUser... users) {
        if (getUsers() == null) {
            this.users = new java.util.ArrayList<ListedUser>(users.length);
        }
        for (ListedUser value : users) {
            this.users.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the
     * <code>ServerId</code> value that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            Returns the user accounts and their properties for the
     *            <code>ServerId</code> value that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withUsers(java.util.Collection<ListedUser> users) {
        setUsers(users);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getUsers() != null)
            sb.append("Users: " + getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
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

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }
}
