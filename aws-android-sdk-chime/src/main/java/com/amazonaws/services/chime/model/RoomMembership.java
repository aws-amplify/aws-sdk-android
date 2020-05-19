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
 * The room membership details.
 * </p>
 */
public class RoomMembership implements Serializable {
    /**
     * <p>
     * The room ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String roomId;

    /**
     * <p>
     * The member details, such as email address, name, member ID, and member
     * type.
     * </p>
     */
    private Member member;

    /**
     * <p>
     * The membership role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     */
    private String role;

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String invitedBy;

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The room ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The room ID.
     *         </p>
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param roomId <p>
     *            The room ID.
     *            </p>
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param roomId <p>
     *            The room ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoomMembership withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * <p>
     * The member details, such as email address, name, member ID, and member
     * type.
     * </p>
     *
     * @return <p>
     *         The member details, such as email address, name, member ID, and
     *         member type.
     *         </p>
     */
    public Member getMember() {
        return member;
    }

    /**
     * <p>
     * The member details, such as email address, name, member ID, and member
     * type.
     * </p>
     *
     * @param member <p>
     *            The member details, such as email address, name, member ID,
     *            and member type.
     *            </p>
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * <p>
     * The member details, such as email address, name, member ID, and member
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param member <p>
     *            The member details, such as email address, name, member ID,
     *            and member type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoomMembership withMember(Member member) {
        this.member = member;
        return this;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @return <p>
     *         The membership role.
     *         </p>
     * @see RoomMembershipRole
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The membership role.
     *            </p>
     * @see RoomMembershipRole
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The membership role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoomMembershipRole
     */
    public RoomMembership withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The membership role.
     *            </p>
     * @see RoomMembershipRole
     */
    public void setRole(RoomMembershipRole role) {
        this.role = role.toString();
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The membership role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoomMembershipRole
     */
    public RoomMembership withRole(RoomMembershipRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the user that invited the room member.
     *         </p>
     */
    public String getInvitedBy() {
        return invitedBy;
    }

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param invitedBy <p>
     *            The identifier of the user that invited the room member.
     *            </p>
     */
    public void setInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
    }

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param invitedBy <p>
     *            The identifier of the user that invited the room member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoomMembership withInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The room membership update timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The room membership update timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The room membership update timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoomMembership withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
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
        if (getRoomId() != null)
            sb.append("RoomId: " + getRoomId() + ",");
        if (getMember() != null)
            sb.append("Member: " + getMember() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getInvitedBy() != null)
            sb.append("InvitedBy: " + getInvitedBy() + ",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: " + getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getInvitedBy() == null) ? 0 : getInvitedBy().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoomMembership == false)
            return false;
        RoomMembership other = (RoomMembership) obj;

        if (other.getRoomId() == null ^ this.getRoomId() == null)
            return false;
        if (other.getRoomId() != null && other.getRoomId().equals(this.getRoomId()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getInvitedBy() == null ^ this.getInvitedBy() == null)
            return false;
        if (other.getInvitedBy() != null
                && other.getInvitedBy().equals(this.getInvitedBy()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}
