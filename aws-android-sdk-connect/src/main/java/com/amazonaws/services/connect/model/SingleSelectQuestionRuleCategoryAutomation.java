/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the automation option based on a rule category for a single
 * select question.
 * </p>
 */
public class SingleSelectQuestionRuleCategoryAutomation implements Serializable {
    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String category;

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is
     * <code>PRESENT</code>, then the option is applied when the contact data
     * includes the category. Similarly, if the condition is
     * <code>NOT_PRESENT</code>, then the option is applied when the contact
     * data does not include the category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRESENT, NOT_PRESENT
     */
    private String condition;

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String optionRefId;

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The category name, as defined in Rules.
     *         </p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param category <p>
     *            The category name, as defined in Rules.
     *            </p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param category <p>
     *            The category name, as defined in Rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleSelectQuestionRuleCategoryAutomation withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is
     * <code>PRESENT</code>, then the option is applied when the contact data
     * includes the category. Similarly, if the condition is
     * <code>NOT_PRESENT</code>, then the option is applied when the contact
     * data does not include the category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRESENT, NOT_PRESENT
     *
     * @return <p>
     *         The condition to apply for the automation option. If the
     *         condition is <code>PRESENT</code>, then the option is applied
     *         when the contact data includes the category. Similarly, if the
     *         condition is <code>NOT_PRESENT</code>, then the option is applied
     *         when the contact data does not include the category.
     *         </p>
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is
     * <code>PRESENT</code>, then the option is applied when the contact data
     * includes the category. Similarly, if the condition is
     * <code>NOT_PRESENT</code>, then the option is applied when the contact
     * data does not include the category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRESENT, NOT_PRESENT
     *
     * @param condition <p>
     *            The condition to apply for the automation option. If the
     *            condition is <code>PRESENT</code>, then the option is applied
     *            when the contact data includes the category. Similarly, if the
     *            condition is <code>NOT_PRESENT</code>, then the option is
     *            applied when the contact data does not include the category.
     *            </p>
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is
     * <code>PRESENT</code>, then the option is applied when the contact data
     * includes the category. Similarly, if the condition is
     * <code>NOT_PRESENT</code>, then the option is applied when the contact
     * data does not include the category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRESENT, NOT_PRESENT
     *
     * @param condition <p>
     *            The condition to apply for the automation option. If the
     *            condition is <code>PRESENT</code>, then the option is applied
     *            when the contact data includes the category. Similarly, if the
     *            condition is <code>NOT_PRESENT</code>, then the option is
     *            applied when the contact data does not include the category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */
    public SingleSelectQuestionRuleCategoryAutomation withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is
     * <code>PRESENT</code>, then the option is applied when the contact data
     * includes the category. Similarly, if the condition is
     * <code>NOT_PRESENT</code>, then the option is applied when the contact
     * data does not include the category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRESENT, NOT_PRESENT
     *
     * @param condition <p>
     *            The condition to apply for the automation option. If the
     *            condition is <code>PRESENT</code>, then the option is applied
     *            when the contact data includes the category. Similarly, if the
     *            condition is <code>NOT_PRESENT</code>, then the option is
     *            applied when the contact data does not include the category.
     *            </p>
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */
    public void setCondition(SingleSelectQuestionRuleCategoryAutomationCondition condition) {
        this.condition = condition.toString();
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is
     * <code>PRESENT</code>, then the option is applied when the contact data
     * includes the category. Similarly, if the condition is
     * <code>NOT_PRESENT</code>, then the option is applied when the contact
     * data does not include the category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRESENT, NOT_PRESENT
     *
     * @param condition <p>
     *            The condition to apply for the automation option. If the
     *            condition is <code>PRESENT</code>, then the option is applied
     *            when the contact data includes the category. Similarly, if the
     *            condition is <code>NOT_PRESENT</code>, then the option is
     *            applied when the contact data does not include the category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */
    public SingleSelectQuestionRuleCategoryAutomation withCondition(
            SingleSelectQuestionRuleCategoryAutomationCondition condition) {
        this.condition = condition.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return <p>
     *         The identifier of the answer option.
     *         </p>
     */
    public String getOptionRefId() {
        return optionRefId;
    }

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param optionRefId <p>
     *            The identifier of the answer option.
     *            </p>
     */
    public void setOptionRefId(String optionRefId) {
        this.optionRefId = optionRefId;
    }

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param optionRefId <p>
     *            The identifier of the answer option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleSelectQuestionRuleCategoryAutomation withOptionRefId(String optionRefId) {
        this.optionRefId = optionRefId;
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
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getCondition() != null)
            sb.append("Condition: " + getCondition() + ",");
        if (getOptionRefId() != null)
            sb.append("OptionRefId: " + getOptionRefId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode
                + ((getOptionRefId() == null) ? 0 : getOptionRefId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleSelectQuestionRuleCategoryAutomation == false)
            return false;
        SingleSelectQuestionRuleCategoryAutomation other = (SingleSelectQuestionRuleCategoryAutomation) obj;

        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getOptionRefId() == null ^ this.getOptionRefId() == null)
            return false;
        if (other.getOptionRefId() != null
                && other.getOptionRefId().equals(this.getOptionRefId()) == false)
            return false;
        return true;
    }
}
