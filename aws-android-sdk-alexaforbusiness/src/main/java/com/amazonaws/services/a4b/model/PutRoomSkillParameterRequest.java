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
 * Updates room skill parameter details by room, skill, and parameter key ID.
 * Not all skills have a room skill parameter.
 * </p>
 */
public class PutRoomSkillParameterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
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
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     */
    private String skillId;

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     */
    private RoomSkillParameter roomSkillParameter;

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the room associated with the room skill parameter.
     *         Required.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room associated with the room skill parameter.
     *            Required.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room associated with the room skill parameter. Required.
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
     *            The ARN of the room associated with the room skill parameter.
     *            Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRoomSkillParameterRequest withRoomArn(String roomArn) {
        this.roomArn = roomArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @return <p>
     *         The ARN of the skill associated with the room skill parameter.
     *         Required.
     *         </p>
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The ARN of the skill associated with the room skill parameter.
     *            Required.
     *            </p>
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill associated with the room skill parameter. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The ARN of the skill associated with the room skill parameter.
     *            Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRoomSkillParameterRequest withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     *
     * @return <p>
     *         The updated room skill parameter. Required.
     *         </p>
     */
    public RoomSkillParameter getRoomSkillParameter() {
        return roomSkillParameter;
    }

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     *
     * @param roomSkillParameter <p>
     *            The updated room skill parameter. Required.
     *            </p>
     */
    public void setRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
        this.roomSkillParameter = roomSkillParameter;
    }

    /**
     * <p>
     * The updated room skill parameter. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomSkillParameter <p>
     *            The updated room skill parameter. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRoomSkillParameterRequest withRoomSkillParameter(RoomSkillParameter roomSkillParameter) {
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
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn() + ",");
        if (getSkillId() != null)
            sb.append("SkillId: " + getSkillId() + ",");
        if (getRoomSkillParameter() != null)
            sb.append("RoomSkillParameter: " + getRoomSkillParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
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

        if (obj instanceof PutRoomSkillParameterRequest == false)
            return false;
        PutRoomSkillParameterRequest other = (PutRoomSkillParameterRequest) obj;

        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getRoomSkillParameter() == null ^ this.getRoomSkillParameter() == null)
            return false;
        if (other.getRoomSkillParameter() != null
                && other.getRoomSkillParameter().equals(this.getRoomSkillParameter()) == false)
            return false;
        return true;
    }
}
