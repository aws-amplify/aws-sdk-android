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

public class InviteUsersResult implements Serializable {
    /**
     * <p>
     * The email invitation details.
     * </p>
     */
    private java.util.List<Invite> invites;

    /**
     * <p>
     * The email invitation details.
     * </p>
     *
     * @return <p>
     *         The email invitation details.
     *         </p>
     */
    public java.util.List<Invite> getInvites() {
        return invites;
    }

    /**
     * <p>
     * The email invitation details.
     * </p>
     *
     * @param invites <p>
     *            The email invitation details.
     *            </p>
     */
    public void setInvites(java.util.Collection<Invite> invites) {
        if (invites == null) {
            this.invites = null;
            return;
        }

        this.invites = new java.util.ArrayList<Invite>(invites);
    }

    /**
     * <p>
     * The email invitation details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invites <p>
     *            The email invitation details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteUsersResult withInvites(Invite... invites) {
        if (getInvites() == null) {
            this.invites = new java.util.ArrayList<Invite>(invites.length);
        }
        for (Invite value : invites) {
            this.invites.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The email invitation details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invites <p>
     *            The email invitation details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteUsersResult withInvites(java.util.Collection<Invite> invites) {
        setInvites(invites);
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
        if (getInvites() != null)
            sb.append("Invites: " + getInvites());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvites() == null) ? 0 : getInvites().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteUsersResult == false)
            return false;
        InviteUsersResult other = (InviteUsersResult) obj;

        if (other.getInvites() == null ^ this.getInvites() == null)
            return false;
        if (other.getInvites() != null && other.getInvites().equals(this.getInvites()) == false)
            return false;
        return true;
    }
}
