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
 * Disassociates a skill from a skill group.
 * </p>
 */
public class DisassociateSkillFromSkillGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier of a skill. Required.
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
     * The ARN of a skill group to associate to a skill.
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
     * The unique identifier of a skill. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The unique identifier of a skill. Required.
     *         </p>
     */
    public String getSkillGroupArn() {
        return skillGroupArn;
    }

    /**
     * <p>
     * The unique identifier of a skill. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param skillGroupArn <p>
     *            The unique identifier of a skill. Required.
     *            </p>
     */
    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The unique identifier of a skill. Required.
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
     *            The unique identifier of a skill. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateSkillFromSkillGroupRequest withSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
        return this;
    }

    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @return <p>
     *         The ARN of a skill group to associate to a skill.
     *         </p>
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The ARN of a skill group to associate to a skill.
     *            </p>
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of a skill group to associate to a skill.
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
     *            The ARN of a skill group to associate to a skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateSkillFromSkillGroupRequest withSkillId(String skillId) {
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
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: " + getSkillGroupArn() + ",");
        if (getSkillId() != null)
            sb.append("SkillId: " + getSkillId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateSkillFromSkillGroupRequest == false)
            return false;
        DisassociateSkillFromSkillGroupRequest other = (DisassociateSkillFromSkillGroupRequest) obj;

        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null
                && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        return true;
    }
}
