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

public class GetSkillGroupResult implements Serializable {
    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     */
    private SkillGroup skillGroup;

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     *
     * @return <p>
     *         The details of the skill group requested. Required.
     *         </p>
     */
    public SkillGroup getSkillGroup() {
        return skillGroup;
    }

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     *
     * @param skillGroup <p>
     *            The details of the skill group requested. Required.
     *            </p>
     */
    public void setSkillGroup(SkillGroup skillGroup) {
        this.skillGroup = skillGroup;
    }

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillGroup <p>
     *            The details of the skill group requested. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSkillGroupResult withSkillGroup(SkillGroup skillGroup) {
        this.skillGroup = skillGroup;
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
        if (getSkillGroup() != null)
            sb.append("SkillGroup: " + getSkillGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroup() == null) ? 0 : getSkillGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSkillGroupResult == false)
            return false;
        GetSkillGroupResult other = (GetSkillGroupResult) obj;

        if (other.getSkillGroup() == null ^ this.getSkillGroup() == null)
            return false;
        if (other.getSkillGroup() != null
                && other.getSkillGroup().equals(this.getSkillGroup()) == false)
            return false;
        return true;
    }
}
