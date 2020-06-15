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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class SearchRoomsResult implements Serializable {
    /**
     * <p>
     * The rooms that meet the specified set of filter criteria, in sort order.
     * </p>
     */
    private java.util.List<RoomData> rooms;

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of rooms returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The rooms that meet the specified set of filter criteria, in sort order.
     * </p>
     *
     * @return <p>
     *         The rooms that meet the specified set of filter criteria, in sort
     *         order.
     *         </p>
     */
    public java.util.List<RoomData> getRooms() {
        return rooms;
    }

    /**
     * <p>
     * The rooms that meet the specified set of filter criteria, in sort order.
     * </p>
     *
     * @param rooms <p>
     *            The rooms that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     */
    public void setRooms(java.util.Collection<RoomData> rooms) {
        if (rooms == null) {
            this.rooms = null;
            return;
        }

        this.rooms = new java.util.ArrayList<RoomData>(rooms);
    }

    /**
     * <p>
     * The rooms that meet the specified set of filter criteria, in sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rooms <p>
     *            The rooms that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoomsResult withRooms(RoomData... rooms) {
        if (getRooms() == null) {
            this.rooms = new java.util.ArrayList<RoomData>(rooms.length);
        }
        for (RoomData value : rooms) {
            this.rooms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rooms that meet the specified set of filter criteria, in sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rooms <p>
     *            The rooms that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoomsResult withRooms(java.util.Collection<RoomData> rooms) {
        setRooms(rooms);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The token returned to indicate that there is more data available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoomsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of rooms returned.
     * </p>
     *
     * @return <p>
     *         The total number of rooms returned.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of rooms returned.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of rooms returned.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of rooms returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of rooms returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoomsResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        if (getRooms() != null)
            sb.append("Rooms: " + getRooms() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTotalCount() != null)
            sb.append("TotalCount: " + getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRooms() == null) ? 0 : getRooms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRoomsResult == false)
            return false;
        SearchRoomsResult other = (SearchRoomsResult) obj;

        if (other.getRooms() == null ^ this.getRooms() == null)
            return false;
        if (other.getRooms() != null && other.getRooms().equals(this.getRooms()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }
}
