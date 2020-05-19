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
 * Updates room membership details, such as the member role, for a room in an
 * Amazon Chime Enterprise account. The member role designates whether the
 * member is a chat room administrator or a general chat room member. The member
 * role can be updated only for user IDs.
 * </p>
 */
public class UpdateRoomMembershipRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The room ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String roomId;

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
     * The role of the member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     */
    private String role;

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
    public UpdateRoomMembershipRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

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
    public UpdateRoomMembershipRequest withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

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
    public UpdateRoomMembershipRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * <p>
     * The role of the member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @return <p>
     *         The role of the member.
     *         </p>
     * @see RoomMembershipRole
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The role of the member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The role of the member.
     *            </p>
     * @see RoomMembershipRole
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role of the member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The role of the member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoomMembershipRole
     */
    public UpdateRoomMembershipRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The role of the member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The role of the member.
     *            </p>
     * @see RoomMembershipRole
     */
    public void setRole(RoomMembershipRole role) {
        this.role = role.toString();
    }

    /**
     * <p>
     * The role of the member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Administrator, Member
     *
     * @param role <p>
     *            The role of the member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoomMembershipRole
     */
    public UpdateRoomMembershipRequest withRole(RoomMembershipRole role) {
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getRoomId() != null)
            sb.append("RoomId: " + getRoomId() + ",");
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
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

        if (obj instanceof UpdateRoomMembershipRequest == false)
            return false;
        UpdateRoomMembershipRequest other = (UpdateRoomMembershipRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRoomId() == null ^ this.getRoomId() == null)
            return false;
        if (other.getRoomId() != null && other.getRoomId().equals(this.getRoomId()) == false)
            return false;
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
