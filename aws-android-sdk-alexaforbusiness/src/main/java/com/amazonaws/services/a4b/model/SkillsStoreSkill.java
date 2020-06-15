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
 * The detailed information about an Alexa skill.
 * </p>
 */
public class SkillsStoreSkill implements Serializable {
    /**
     * <p>
     * The ARN of the skill.
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
     * Short description about the skill.
     * </p>
     */
    private String shortDescription;

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     */
    private String iconUrl;

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     */
    private java.util.List<String> sampleUtterances;

    /**
     * <p>
     * Information about the skill.
     * </p>
     */
    private SkillDetails skillDetails;

    /**
     * <p>
     * Linking support for a skill.
     * </p>
     */
    private Boolean supportsLinking;

    /**
     * <p>
     * The ARN of the skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @return <p>
     *         The ARN of the skill.
     *         </p>
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * <p>
     * The ARN of the skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The ARN of the skill.
     *            </p>
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The ARN of the skill.
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
     *            The ARN of the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillsStoreSkill withSkillId(String skillId) {
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
    public SkillsStoreSkill withSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }

    /**
     * <p>
     * Short description about the skill.
     * </p>
     *
     * @return <p>
     *         Short description about the skill.
     *         </p>
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * <p>
     * Short description about the skill.
     * </p>
     *
     * @param shortDescription <p>
     *            Short description about the skill.
     *            </p>
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * Short description about the skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shortDescription <p>
     *            Short description about the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillsStoreSkill withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     *
     * @return <p>
     *         The URL where the skill icon resides.
     *         </p>
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     *
     * @param iconUrl <p>
     *            The URL where the skill icon resides.
     *            </p>
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * <p>
     * The URL where the skill icon resides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iconUrl <p>
     *            The URL where the skill icon resides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillsStoreSkill withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     *
     * @return <p>
     *         Sample utterances that interact with the skill.
     *         </p>
     */
    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     *
     * @param sampleUtterances <p>
     *            Sample utterances that interact with the skill.
     *            </p>
     */
    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            Sample utterances that interact with the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillsStoreSkill withSampleUtterances(String... sampleUtterances) {
        if (getSampleUtterances() == null) {
            this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances.length);
        }
        for (String value : sampleUtterances) {
            this.sampleUtterances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Sample utterances that interact with the skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            Sample utterances that interact with the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillsStoreSkill withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * Information about the skill.
     * </p>
     *
     * @return <p>
     *         Information about the skill.
     *         </p>
     */
    public SkillDetails getSkillDetails() {
        return skillDetails;
    }

    /**
     * <p>
     * Information about the skill.
     * </p>
     *
     * @param skillDetails <p>
     *            Information about the skill.
     *            </p>
     */
    public void setSkillDetails(SkillDetails skillDetails) {
        this.skillDetails = skillDetails;
    }

    /**
     * <p>
     * Information about the skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skillDetails <p>
     *            Information about the skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkillsStoreSkill withSkillDetails(SkillDetails skillDetails) {
        this.skillDetails = skillDetails;
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
    public SkillsStoreSkill withSupportsLinking(Boolean supportsLinking) {
        this.supportsLinking = supportsLinking;
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
        if (getShortDescription() != null)
            sb.append("ShortDescription: " + getShortDescription() + ",");
        if (getIconUrl() != null)
            sb.append("IconUrl: " + getIconUrl() + ",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: " + getSampleUtterances() + ",");
        if (getSkillDetails() != null)
            sb.append("SkillDetails: " + getSkillDetails() + ",");
        if (getSupportsLinking() != null)
            sb.append("SupportsLinking: " + getSupportsLinking());
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
                + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode
                + ((getSkillDetails() == null) ? 0 : getSkillDetails().hashCode());
        hashCode = prime * hashCode
                + ((getSupportsLinking() == null) ? 0 : getSupportsLinking().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkillsStoreSkill == false)
            return false;
        SkillsStoreSkill other = (SkillsStoreSkill) obj;

        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getSkillName() == null ^ this.getSkillName() == null)
            return false;
        if (other.getSkillName() != null
                && other.getSkillName().equals(this.getSkillName()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null
                && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getIconUrl() == null ^ this.getIconUrl() == null)
            return false;
        if (other.getIconUrl() != null && other.getIconUrl().equals(this.getIconUrl()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null
                && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getSkillDetails() == null ^ this.getSkillDetails() == null)
            return false;
        if (other.getSkillDetails() != null
                && other.getSkillDetails().equals(this.getSkillDetails()) == false)
            return false;
        if (other.getSupportsLinking() == null ^ this.getSupportsLinking() == null)
            return false;
        if (other.getSupportsLinking() != null
                && other.getSupportsLinking().equals(this.getSupportsLinking()) == false)
            return false;
        return true;
    }
}
