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

public class CreateRoomMembershipResult implements Serializable {
    /**
     * <p>
     * The room membership details.
     * </p>
     */
    private RoomMembership roomMembership;

    /**
     * <p>
     * The room membership details.
     * </p>
     *
     * @return <p>
     *         The room membership details.
     *         </p>
     */
    public RoomMembership getRoomMembership() {
        return roomMembership;
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     *
     * @param roomMembership <p>
     *            The room membership details.
     *            </p>
     */
    public void setRoomMembership(RoomMembership roomMembership) {
        this.roomMembership = roomMembership;
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomMembership <p>
     *            The room membership details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoomMembershipResult withRoomMembership(RoomMembership roomMembership) {
        this.roomMembership = roomMembership;
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
        if (getRoomMembership() != null)
            sb.append("RoomMembership: " + getRoomMembership());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoomMembership() == null) ? 0 : getRoomMembership().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoomMembershipResult == false)
            return false;
        CreateRoomMembershipResult other = (CreateRoomMembershipResult) obj;

        if (other.getRoomMembership() == null ^ this.getRoomMembership() == null)
            return false;
        if (other.getRoomMembership() != null
                && other.getRoomMembership().equals(this.getRoomMembership()) == false)
            return false;
        return true;
    }
}
