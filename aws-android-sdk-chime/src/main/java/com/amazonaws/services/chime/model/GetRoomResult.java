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

public class GetRoomResult implements Serializable {
    /**
     * <p>
     * The room details.
     * </p>
     */
    private Room room;

    /**
     * <p>
     * The room details.
     * </p>
     *
     * @return <p>
     *         The room details.
     *         </p>
     */
    public Room getRoom() {
        return room;
    }

    /**
     * <p>
     * The room details.
     * </p>
     *
     * @param room <p>
     *            The room details.
     *            </p>
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * <p>
     * The room details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param room <p>
     *            The room details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRoomResult withRoom(Room room) {
        this.room = room;
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
        if (getRoom() != null)
            sb.append("Room: " + getRoom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoom() == null) ? 0 : getRoom().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoomResult == false)
            return false;
        GetRoomResult other = (GetRoomResult) obj;

        if (other.getRoom() == null ^ this.getRoom() == null)
            return false;
        if (other.getRoom() != null && other.getRoom().equals(this.getRoom()) == false)
            return false;
        return true;
    }
}
