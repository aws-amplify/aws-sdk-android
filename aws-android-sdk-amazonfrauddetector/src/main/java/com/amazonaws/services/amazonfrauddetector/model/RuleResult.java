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
 * The rule results.
 * </p>
 */
public class RuleResult implements Serializable {
    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     */
    private java.util.List<String> outcomes;

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     *
     * @return <p>
     *         The rule ID that was matched, based on the rule execution mode.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     *
     * @param ruleId <p>
     *            The rule ID that was matched, based on the rule execution
     *            mode.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The rule ID that was matched, based on the rule execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleId <p>
     *            The rule ID that was matched, based on the rule execution
     *            mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleResult withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     *
     * @return <p>
     *         The outcomes of the matched rule, based on the rule execution
     *         mode.
     *         </p>
     */
    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     *
     * @param outcomes <p>
     *            The outcomes of the matched rule, based on the rule execution
     *            mode.
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
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The outcomes of the matched rule, based on the rule execution
     *            mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleResult withOutcomes(String... outcomes) {
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
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The outcomes of the matched rule, based on the rule execution
     *            mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleResult withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
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
        if (getOutcomes() != null)
            sb.append("outcomes: " + getOutcomes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleResult == false)
            return false;
        RuleResult other = (RuleResult) obj;

        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        return true;
    }
}
