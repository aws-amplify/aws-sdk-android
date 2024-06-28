/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the automation option of a single select question.
 * </p>
 */
public class EvaluationFormSingleSelectQuestionAutomationOption implements Serializable {
    /**
     * <p>
     * The automation option based on a rule category for the single select
     * question.
     * </p>
     */
    private SingleSelectQuestionRuleCategoryAutomation ruleCategory;

    /**
     * <p>
     * The automation option based on a rule category for the single select
     * question.
     * </p>
     *
     * @return <p>
     *         The automation option based on a rule category for the single
     *         select question.
     *         </p>
     */
    public SingleSelectQuestionRuleCategoryAutomation getRuleCategory() {
        return ruleCategory;
    }

    /**
     * <p>
     * The automation option based on a rule category for the single select
     * question.
     * </p>
     *
     * @param ruleCategory <p>
     *            The automation option based on a rule category for the single
     *            select question.
     *            </p>
     */
    public void setRuleCategory(SingleSelectQuestionRuleCategoryAutomation ruleCategory) {
        this.ruleCategory = ruleCategory;
    }

    /**
     * <p>
     * The automation option based on a rule category for the single select
     * question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleCategory <p>
     *            The automation option based on a rule category for the single
     *            select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionAutomationOption withRuleCategory(
            SingleSelectQuestionRuleCategoryAutomation ruleCategory) {
        this.ruleCategory = ruleCategory;
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
        if (getRuleCategory() != null)
            sb.append("RuleCategory: " + getRuleCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleCategory() == null) ? 0 : getRuleCategory().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSingleSelectQuestionAutomationOption == false)
            return false;
        EvaluationFormSingleSelectQuestionAutomationOption other = (EvaluationFormSingleSelectQuestionAutomationOption) obj;

        if (other.getRuleCategory() == null ^ this.getRuleCategory() == null)
            return false;
        if (other.getRuleCategory() != null
                && other.getRuleCategory().equals(this.getRuleCategory()) == false)
            return false;
        return true;
    }
}
