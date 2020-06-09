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

public class DescribeUserResult implements Serializable {
    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * An array containing the properties of the user account for the
     * <code>ServerID</code> value that you specified.
     * </p>
     */
    private DescribedUser user;

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         A system-assigned unique identifier for a file transfer
     *         protocol-enabled server that has this user assigned.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server that has this user assigned.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
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
     *            protocol-enabled server that has this user assigned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * An array containing the properties of the user account for the
     * <code>ServerID</code> value that you specified.
     * </p>
     *
     * @return <p>
     *         An array containing the properties of the user account for the
     *         <code>ServerID</code> value that you specified.
     *         </p>
     */
    public DescribedUser getUser() {
        return user;
    }

    /**
     * <p>
     * An array containing the properties of the user account for the
     * <code>ServerID</code> value that you specified.
     * </p>
     *
     * @param user <p>
     *            An array containing the properties of the user account for the
     *            <code>ServerID</code> value that you specified.
     *            </p>
     */
    public void setUser(DescribedUser user) {
        this.user = user;
    }

    /**
     * <p>
     * An array containing the properties of the user account for the
     * <code>ServerID</code> value that you specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            An array containing the properties of the user account for the
     *            <code>ServerID</code> value that you specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withUser(DescribedUser user) {
        this.user = user;
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
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;

        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}
