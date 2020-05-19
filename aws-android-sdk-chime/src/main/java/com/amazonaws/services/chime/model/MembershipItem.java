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

/**
 * <p>
 * Membership details, such as member ID and member role.
 * </p>
 */
public class MembershipItem implements Serializable {
    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String memberId;

    /**
     * <p>
     * The member role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     */
    private String role;

    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The member ID.
     *         </p>
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberId <p>
     *            The member ID.
     *            </p>
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The member ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param memberId <p>
     *            The member ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MembershipItem withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @return <p>
     *         The member role.
     *         </p>
     * @see RoomMembershipRole
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The member role.
     *            </p>
     * @see RoomMembershipRole
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The member role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoomMembershipRole
     */
    public MembershipItem withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The member role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The member role.
     *            </p>
     * @see RoomMembershipRole
     */
    public void setRole(RoomMembershipRole role) {
        this.role = role.toString();
    }

    /**
     * <p>
     * The member role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The member role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoomMembershipRole
     */
    public MembershipItem withRole(RoomMembershipRole role) {
        this.role = role.toString();
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
        if (getMemberId() != null)
            sb.append("MemberId: " + getMemberId() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MembershipItem == false)
            return false;
        MembershipItem other = (MembershipItem) obj;

        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }
}
