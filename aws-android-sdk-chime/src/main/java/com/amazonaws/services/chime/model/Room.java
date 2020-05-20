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
 * The Amazon Chime chat room details.
 * </p>
 */
public class Room implements Serializable {
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
     * The room name.
     * </p>
     */
    private String name;

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
     * The identifier of the room creator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String createdBy;

    /**
     * <p>
     * The room creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The room update timestamp, in ISO 8601 format.
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
    public Room withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * <p>
     * The room name.
     * </p>
     *
     * @return <p>
     *         The room name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The room name.
     * </p>
     *
     * @param name <p>
     *            The room name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The room name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The room name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Room withName(String name) {
        this.name = name;
        return this;
    }

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
    public Room withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The identifier of the room creator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the room creator.
     *         </p>
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * The identifier of the room creator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdBy <p>
     *            The identifier of the room creator.
     *            </p>
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier of the room creator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdBy <p>
     *            The identifier of the room creator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Room withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * The room creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The room creation timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The room creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The room creation timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The room creation timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The room creation timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Room withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The room update timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The room update timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The room update timestamp, in ISO 8601 format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The room update timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The room update timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The room update timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Room withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
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

        if (obj instanceof Room == false)
            return false;
        Room other = (Room) obj;

        if (other.getRoomId() == null ^ this.getRoomId() == null)
            return false;
        if (other.getRoomId() != null && other.getRoomId().equals(this.getRoomId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}
