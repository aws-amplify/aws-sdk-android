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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates a skill group from a specified room. This disables all skills
 * in the skill group on all devices in the room.
 * </p>
 */
public class DisassociateSkillGroupFromRoomRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String skillGroupArn;

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated.
     * Required.
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
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the skill group to disassociate from a room. Required.
     *         </p>
     */
    public String getSkillGroupArn() {
        return skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param skillGroupArn <p>
     *            The ARN of the skill group to disassociate from a room.
     *            Required.
     *            </p>
     */
    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group to disassociate from a room. Required.
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
     * @param skillGroupArn <p>
     *            The ARN of the skill group to disassociate from a room.
     *            Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateSkillGroupFromRoomRequest withSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the room from which the skill group is to be
     *         disassociated. Required.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room from which the skill group is to be
     *            disassociated. Required.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room from which the skill group is to be disassociated.
     * Required.
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
     *            The ARN of the room from which the skill group is to be
     *            disassociated. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateSkillGroupFromRoomRequest withRoomArn(String roomArn) {
        this.roomArn = roomArn;
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
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: " + getSkillGroupArn() + ",");
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateSkillGroupFromRoomRequest == false)
            return false;
        DisassociateSkillGroupFromRoomRequest other = (DisassociateSkillGroupFromRoomRequest) obj;

        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null
                && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        return true;
    }
}
