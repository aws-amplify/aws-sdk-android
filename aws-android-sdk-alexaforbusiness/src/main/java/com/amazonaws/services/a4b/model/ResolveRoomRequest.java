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
 * Determines the details for the room from which a skill request was invoked.
 * This operation is used by skill developers.
 * </p>
 */
public class ResolveRoomRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>amzn1\.[A-Za-z0-9+-\/=.]{1,300}<br/>
     */
    private String userId;

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
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
     * The ARN of the user. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>amzn1\.[A-Za-z0-9+-\/=.]{1,300}<br/>
     *
     * @return <p>
     *         The ARN of the user. Required.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>amzn1\.[A-Za-z0-9+-\/=.]{1,300}<br/>
     *
     * @param userId <p>
     *            The ARN of the user. Required.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ARN of the user. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>amzn1\.[A-Za-z0-9+-\/=.]{1,300}<br/>
     *
     * @param userId <p>
     *            The ARN of the user. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveRoomRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @return <p>
     *         The ARN of the skill that was requested. Required.
     *         </p>
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The ARN of the skill that was requested. Required.
     *            </p>
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill that was requested. Required.
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
     *            The ARN of the skill that was requested. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolveRoomRequest withSkillId(String skillId) {
        this.skillId = skillId;
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getSkillId() != null)
            sb.append("SkillId: " + getSkillId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveRoomRequest == false)
            return false;
        ResolveRoomRequest other = (ResolveRoomRequest) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        return true;
    }
}
