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

public class ListSkillsStoreSkillsByCategoryResult implements Serializable {
    /**
     * <p>
     * The skill store skills.
     * </p>
     */
    private java.util.List<SkillsStoreSkill> skillsStoreSkills;

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The skill store skills.
     * </p>
     *
     * @return <p>
     *         The skill store skills.
     *         </p>
     */
    public java.util.List<SkillsStoreSkill> getSkillsStoreSkills() {
        return skillsStoreSkills;
    }

    /**
     * <p>
     * The skill store skills.
     * </p>
     *
     * @param skillsStoreSkills <p>
     *            The skill store skills.
     *            </p>
     */
    public void setSkillsStoreSkills(java.util.Collection<SkillsStoreSkill> skillsStoreSkills) {
        if (skillsStoreSkills == null) {
            this.skillsStoreSkills = null;
            return;
        }

        this.skillsStoreSkills = new java.util.ArrayList<SkillsStoreSkill>(skillsStoreSkills);
    }

    /**
     * <p>
     * The skill store skills.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillsStoreSkills <p>
     *            The skill store skills.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsStoreSkillsByCategoryResult withSkillsStoreSkills(
            SkillsStoreSkill... skillsStoreSkills) {
        if (getSkillsStoreSkills() == null) {
            this.skillsStoreSkills = new java.util.ArrayList<SkillsStoreSkill>(
                    skillsStoreSkills.length);
        }
        for (SkillsStoreSkill value : skillsStoreSkills) {
            this.skillsStoreSkills.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The skill store skills.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillsStoreSkills <p>
     *            The skill store skills.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsStoreSkillsByCategoryResult withSkillsStoreSkills(
            java.util.Collection<SkillsStoreSkill> skillsStoreSkills) {
        setSkillsStoreSkills(skillsStoreSkills);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The tokens used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsStoreSkillsByCategoryResult withNextToken(String nextToken) {
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
        if (getSkillsStoreSkills() != null)
            sb.append("SkillsStoreSkills: " + getSkillsStoreSkills() + ",");
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
                + ((getSkillsStoreSkills() == null) ? 0 : getSkillsStoreSkills().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSkillsStoreSkillsByCategoryResult == false)
            return false;
        ListSkillsStoreSkillsByCategoryResult other = (ListSkillsStoreSkillsByCategoryResult) obj;

        if (other.getSkillsStoreSkills() == null ^ this.getSkillsStoreSkills() == null)
            return false;
        if (other.getSkillsStoreSkills() != null
                && other.getSkillsStoreSkills().equals(this.getSkillsStoreSkills()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
