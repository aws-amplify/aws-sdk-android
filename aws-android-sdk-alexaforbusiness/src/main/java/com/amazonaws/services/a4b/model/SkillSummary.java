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

/**
 * <p>
 * The summary of skills.
 * </p>
 */
public class SkillSummary implements Serializable {
    /**
     * <p>
     * The ARN of the skill summary.
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
     * The name of the skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String skillName;

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     */
    private Boolean supportsLinking;

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires
     * linking to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     */
    private String enablementType;

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     */
    private String skillType;

    /**
     * <p>
     * The ARN of the skill summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @return <p>
     *         The ARN of the skill summary.
     *         </p>
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * <p>
     * The ARN of the skill summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The ARN of the skill summary.
     *            </p>
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill summary.
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
     *            The ARN of the skill summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillSummary withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * <p>
     * The name of the skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the skill.
     *         </p>
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * <p>
     * The name of the skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param skillName <p>
     *            The name of the skill.
     *            </p>
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    /**
     * <p>
     * The name of the skill.
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
     * @param skillName <p>
     *            The name of the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillSummary withSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     *
     * @return <p>
     *         Linking support for a skill.
     *         </p>
     */
    public Boolean isSupportsLinking() {
        return supportsLinking;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     *
     * @return <p>
     *         Linking support for a skill.
     *         </p>
     */
    public Boolean getSupportsLinking() {
        return supportsLinking;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     *
     * @param supportsLinking <p>
     *            Linking support for a skill.
     *            </p>
     */
    public void setSupportsLinking(Boolean supportsLinking) {
        this.supportsLinking = supportsLinking;
    }

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsLinking <p>
     *            Linking support for a skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillSummary withSupportsLinking(Boolean supportsLinking) {
        this.supportsLinking = supportsLinking;
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires
     * linking to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @return <p>
     *         Whether the skill is enabled under the user's account, or if it
     *         requires linking to be used.
     *         </p>
     * @see EnablementType
     */
    public String getEnablementType() {
        return enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires
     * linking to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account, or if
     *            it requires linking to be used.
     *            </p>
     * @see EnablementType
     */
    public void setEnablementType(String enablementType) {
        this.enablementType = enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires
     * linking to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account, or if
     *            it requires linking to be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnablementType
     */
    public SkillSummary withEnablementType(String enablementType) {
        this.enablementType = enablementType;
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires
     * linking to be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account, or if
     *            it requires linking to be used.
     *            </p>
     * @see EnablementType
     */
    public void setEnablementType(EnablementType enablementType) {
        this.enablementType = enablementType.toString();
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires
     * linking to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING
     *
     * @param enablementType <p>
     *            Whether the skill is enabled under the user's account, or if
     *            it requires linking to be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnablementType
     */
    public SkillSummary withEnablementType(EnablementType enablementType) {
        this.enablementType = enablementType.toString();
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @return <p>
     *         Whether the skill is publicly available or is a private skill.
     *         </p>
     * @see SkillType
     */
    public String getSkillType() {
        return skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @see SkillType
     */
    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SkillType
     */
    public SkillSummary withSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @see SkillType
     */
    public void setSkillType(SkillType skillType) {
        this.skillType = skillType.toString();
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param skillType <p>
     *            Whether the skill is publicly available or is a private skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SkillType
     */
    public SkillSummary withSkillType(SkillType skillType) {
        this.skillType = skillType.toString();
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
        if (getSkillId() != null)
            sb.append("SkillId: " + getSkillId() + ",");
        if (getSkillName() != null)
            sb.append("SkillName: " + getSkillName() + ",");
        if (getSupportsLinking() != null)
            sb.append("SupportsLinking: " + getSupportsLinking() + ",");
        if (getEnablementType() != null)
            sb.append("EnablementType: " + getEnablementType() + ",");
        if (getSkillType() != null)
            sb.append("SkillType: " + getSkillType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getSkillName() == null) ? 0 : getSkillName().hashCode());
        hashCode = prime * hashCode
                + ((getSupportsLinking() == null) ? 0 : getSupportsLinking().hashCode());
        hashCode = prime * hashCode
                + ((getEnablementType() == null) ? 0 : getEnablementType().hashCode());
        hashCode = prime * hashCode + ((getSkillType() == null) ? 0 : getSkillType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillSummary == false)
            return false;
        SkillSummary other = (SkillSummary) obj;

        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getSkillName() == null ^ this.getSkillName() == null)
            return false;
        if (other.getSkillName() != null
                && other.getSkillName().equals(this.getSkillName()) == false)
            return false;
        if (other.getSupportsLinking() == null ^ this.getSupportsLinking() == null)
            return false;
        if (other.getSupportsLinking() != null
                && other.getSupportsLinking().equals(this.getSupportsLinking()) == false)
            return false;
        if (other.getEnablementType() == null ^ this.getEnablementType() == null)
            return false;
        if (other.getEnablementType() != null
                && other.getEnablementType().equals(this.getEnablementType()) == false)
            return false;
        if (other.getSkillType() == null ^ this.getSkillType() == null)
            return false;
        if (other.getSkillType() != null
                && other.getSkillType().equals(this.getSkillType()) == false)
            return false;
        return true;
    }
}
