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

public class ResolveRoomResult implements Serializable {
    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roomArn;

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String roomName;

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     */
    private java.util.List<RoomSkillParameter> roomSkillParameters;

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the room from which the skill request was invoked.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room from which the skill request was invoked.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill request was invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room from which the skill request was invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveRoomResult withRoomArn(String roomArn) {
        this.roomArn = roomArn;
        return this;
    }

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the room from which the skill request was invoked.
     *         </p>
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param roomName <p>
     *            The name of the room from which the skill request was invoked.
     *            </p>
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The name of the room from which the skill request was invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param roomName <p>
     *            The name of the room from which the skill request was invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveRoomResult withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     *
     * @return <p>
     *         Response to get the room profile request. Required.
     *         </p>
     */
    public java.util.List<RoomSkillParameter> getRoomSkillParameters() {
        return roomSkillParameters;
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     *
     * @param roomSkillParameters <p>
     *            Response to get the room profile request. Required.
     *            </p>
     */
    public void setRoomSkillParameters(java.util.Collection<RoomSkillParameter> roomSkillParameters) {
        if (roomSkillParameters == null) {
            this.roomSkillParameters = null;
            return;
        }

        this.roomSkillParameters = new java.util.ArrayList<RoomSkillParameter>(roomSkillParameters);
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomSkillParameters <p>
     *            Response to get the room profile request. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveRoomResult withRoomSkillParameters(RoomSkillParameter... roomSkillParameters) {
        if (getRoomSkillParameters() == null) {
            this.roomSkillParameters = new java.util.ArrayList<RoomSkillParameter>(
                    roomSkillParameters.length);
        }
        for (RoomSkillParameter value : roomSkillParameters) {
            this.roomSkillParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Response to get the room profile request. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomSkillParameters <p>
     *            Response to get the room profile request. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveRoomResult withRoomSkillParameters(
            java.util.Collection<RoomSkillParameter> roomSkillParameters) {
        setRoomSkillParameters(roomSkillParameters);
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
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn() + ",");
        if (getRoomName() != null)
            sb.append("RoomName: " + getRoomName() + ",");
        if (getRoomSkillParameters() != null)
            sb.append("RoomSkillParameters: " + getRoomSkillParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode
                + ((getRoomSkillParameters() == null) ? 0 : getRoomSkillParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveRoomResult == false)
            return false;
        ResolveRoomResult other = (ResolveRoomResult) obj;

        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getRoomSkillParameters() == null ^ this.getRoomSkillParameters() == null)
            return false;
        if (other.getRoomSkillParameters() != null
                && other.getRoomSkillParameters().equals(this.getRoomSkillParameters()) == false)
            return false;
        return true;
    }
}
