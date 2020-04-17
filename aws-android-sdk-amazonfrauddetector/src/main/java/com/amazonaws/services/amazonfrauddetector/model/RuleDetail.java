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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The details of the rule.
 * </p>
 */
public class RuleDetail implements Serializable {
    /**
     * <p>
     * The rule ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The rule version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String ruleVersion;

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String expression;

    /**
     * <p>
     * The rule language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     */
    private String language;

    /**
     * <p>
     * The rule outcomes.
     * </p>
     */
    private java.util.List<String> outcomes;

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     */
    private String lastUpdatedTime;

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The rule ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The rule ID.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The rule ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param ruleId <p>
     *            The rule ID.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param ruleId <p>
     *            The rule ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The rule description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The rule description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The rule description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The rule description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The detector for which the rule is associated.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector for which the rule is associated.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector for which the rule is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector for which the rule is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The rule version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The rule version.
     *         </p>
     */
    public String getRuleVersion() {
        return ruleVersion;
    }

    /**
     * <p>
     * The rule version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param ruleVersion <p>
     *            The rule version.
     *            </p>
     */
    public void setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    /**
     * <p>
     * The rule version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param ruleVersion <p>
     *            The rule version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The rule expression.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param expression <p>
     *            The rule expression.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param expression <p>
     *            The rule expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @return <p>
     *         The rule language.
     *         </p>
     * @see Language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The rule language.
     *            </p>
     * @see Language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The rule language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Language
     */
    public RuleDetail withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The rule language.
     *            </p>
     * @see Language
     */
    public void setLanguage(Language language) {
        this.language = language.toString();
    }

    /**
     * <p>
     * The rule language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The rule language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Language
     */
    public RuleDetail withLanguage(Language language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The rule outcomes.
     * </p>
     *
     * @return <p>
     *         The rule outcomes.
     *         </p>
     */
    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The rule outcomes.
     * </p>
     *
     * @param outcomes <p>
     *            The rule outcomes.
     *            </p>
     */
    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The rule outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The rule outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withOutcomes(String... outcomes) {
        if (getOutcomes() == null) {
            this.outcomes = new java.util.ArrayList<String>(outcomes.length);
        }
        for (String value : outcomes) {
            this.outcomes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rule outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The rule outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     *
     * @return <p>
     *         Timestamp of the last time the rule was updated.
     *         </p>
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of the last time the rule was updated.
     *            </p>
     */
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of the last time the rule was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of the last time the rule was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     *
     * @return <p>
     *         The timestamp of when the rule was created.
     *         </p>
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp of when the rule was created.
     *            </p>
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp of when the rule was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp of when the rule was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleDetail withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
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
        if (getRuleId() != null)
            sb.append("ruleId: " + getRuleId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getDetectorId() != null)
            sb.append("detectorId: " + getDetectorId() + ",");
        if (getRuleVersion() != null)
            sb.append("ruleVersion: " + getRuleVersion() + ",");
        if (getExpression() != null)
            sb.append("expression: " + getExpression() + ",");
        if (getLanguage() != null)
            sb.append("language: " + getLanguage() + ",");
        if (getOutcomes() != null)
            sb.append("outcomes: " + getOutcomes() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getCreatedTime() != null)
            sb.append("createdTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getRuleVersion() == null) ? 0 : getRuleVersion().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleDetail == false)
            return false;
        RuleDetail other = (RuleDetail) obj;

        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getRuleVersion() == null ^ this.getRuleVersion() == null)
            return false;
        if (other.getRuleVersion() != null
                && other.getRuleVersion().equals(this.getRuleVersion()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
