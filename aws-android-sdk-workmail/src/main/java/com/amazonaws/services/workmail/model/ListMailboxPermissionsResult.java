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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class ListMailboxPermissionsResult implements Serializable {
    /**
     * <p>
     * One page of the user, group, or resource mailbox permissions.
     * </p>
     */
    private java.util.List<Permission> permissions;

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * "null" when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * One page of the user, group, or resource mailbox permissions.
     * </p>
     *
     * @return <p>
     *         One page of the user, group, or resource mailbox permissions.
     *         </p>
     */
    public java.util.List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * One page of the user, group, or resource mailbox permissions.
     * </p>
     *
     * @param permissions <p>
     *            One page of the user, group, or resource mailbox permissions.
     *            </p>
     */
    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<Permission>(permissions);
    }

    /**
     * <p>
     * One page of the user, group, or resource mailbox permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            One page of the user, group, or resource mailbox permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMailboxPermissionsResult withPermissions(Permission... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<Permission>(permissions.length);
        }
        for (Permission value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One page of the user, group, or resource mailbox permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            One page of the user, group, or resource mailbox permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMailboxPermissionsResult withPermissions(java.util.Collection<Permission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * "null" when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. The value
     *         is "null" when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * "null" when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. The
     *            value is "null" when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * "null" when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. The
     *            value is "null" when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMailboxPermissionsResult withNextToken(String nextToken) {
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
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions() + ",");
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
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMailboxPermissionsResult == false)
            return false;
        ListMailboxPermissionsResult other = (ListMailboxPermissionsResult) obj;

        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
