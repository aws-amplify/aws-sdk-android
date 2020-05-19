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

public class ListRoomMembershipsResult implements Serializable {
    /**
     * <p>
     * The room membership details.
     * </p>
     */
    private java.util.List<RoomMembership> roomMemberships;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The room membership details.
     * </p>
     *
     * @return <p>
     *         The room membership details.
     *         </p>
     */
    public java.util.List<RoomMembership> getRoomMemberships() {
        return roomMemberships;
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     *
     * @param roomMemberships <p>
     *            The room membership details.
     *            </p>
     */
    public void setRoomMemberships(java.util.Collection<RoomMembership> roomMemberships) {
        if (roomMemberships == null) {
            this.roomMemberships = null;
            return;
        }

        this.roomMemberships = new java.util.ArrayList<RoomMembership>(roomMemberships);
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomMemberships <p>
     *            The room membership details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoomMembershipsResult withRoomMemberships(RoomMembership... roomMemberships) {
        if (getRoomMemberships() == null) {
            this.roomMemberships = new java.util.ArrayList<RoomMembership>(roomMemberships.length);
        }
        for (RoomMembership value : roomMemberships) {
            this.roomMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The room membership details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomMemberships <p>
     *            The room membership details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoomMembershipsResult withRoomMemberships(
            java.util.Collection<RoomMembership> roomMemberships) {
        setRoomMemberships(roomMemberships);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoomMembershipsResult withNextToken(String nextToken) {
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
        if (getRoomMemberships() != null)
            sb.append("RoomMemberships: " + getRoomMemberships() + ",");
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
                + ((getRoomMemberships() == null) ? 0 : getRoomMemberships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoomMembershipsResult == false)
            return false;
        ListRoomMembershipsResult other = (ListRoomMembershipsResult) obj;

        if (other.getRoomMemberships() == null ^ this.getRoomMemberships() == null)
            return false;
        if (other.getRoomMemberships() != null
                && other.getRoomMemberships().equals(this.getRoomMemberships()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
