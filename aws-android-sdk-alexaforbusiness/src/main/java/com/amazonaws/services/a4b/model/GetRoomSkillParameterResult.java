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

public class GetRoomSkillParameterResult implements Serializable {
    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     */
    private RoomSkillParameter roomSkillParameter;

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     *
     * @return <p>
     *         The details of the room skill parameter requested. Required.
     *         </p>
     */
    public RoomSkillParameter getRoomSkillParameter() {
        return roomSkillParameter;
    }

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     *
     * @param roomSkillParameter <p>
     *            The details of the room skill parameter requested. Required.
     *            </p>
     */
    public void setRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
        this.roomSkillParameter = roomSkillParameter;
    }

    /**
     * <p>
     * The details of the room skill parameter requested. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomSkillParameter <p>
     *            The details of the room skill parameter requested. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRoomSkillParameterResult withRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
        this.roomSkillParameter = roomSkillParameter;
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
        if (getRoomSkillParameter() != null)
            sb.append("RoomSkillParameter: " + getRoomSkillParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoomSkillParameter() == null) ? 0 : getRoomSkillParameter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoomSkillParameterResult == false)
            return false;
        GetRoomSkillParameterResult other = (GetRoomSkillParameterResult) obj;

        if (other.getRoomSkillParameter() == null ^ this.getRoomSkillParameter() == null)
            return false;
        if (other.getRoomSkillParameter() != null
                && other.getRoomSkillParameter().equals(this.getRoomSkillParameter()) == false)
            return false;
        return true;
    }
}
