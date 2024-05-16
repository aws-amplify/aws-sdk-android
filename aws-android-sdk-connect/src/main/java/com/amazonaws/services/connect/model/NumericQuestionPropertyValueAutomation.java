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
 * Information about the property value used in automation of a numeric
 * questions. Label values are associated with minimum and maximum values for
 * the numeric question.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Sentiment scores have a minimum value of -5 and maximum value of 5.
 * </p>
 * </li>
 * <li>
 * <p>
 * Duration labels, such as <code>NON_TALK_TIME</code>,
 * <code>CONTACT_DURATION</code>, <code>AGENT_INTERACTION_DURATION</code>,
 * <code>CUSTOMER_HOLD_TIME</code> have a minimum value of 0 and maximum value
 * of 28800.
 * </p>
 * </li>
 * <li>
 * <p>
 * Percentages have a minimum value of 0 and maximum value of 100.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NUMBER_OF_INTERRUPTIONS</code> has a minimum value of 0 and maximum
 * value of 1000.
 * </p>
 * </li>
 * </ul>
 */
public class NumericQuestionPropertyValueAutomation implements Serializable {
    /**
     * <p>
     * The property label of the automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERALL_CUSTOMER_SENTIMENT_SCORE,
     * OVERALL_AGENT_SENTIMENT_SCORE, NON_TALK_TIME, NON_TALK_TIME_PERCENTAGE,
     * NUMBER_OF_INTERRUPTIONS, CONTACT_DURATION, AGENT_INTERACTION_DURATION,
     * CUSTOMER_HOLD_TIME
     */
    private String label;

    /**
     * <p>
     * The property label of the automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERALL_CUSTOMER_SENTIMENT_SCORE,
     * OVERALL_AGENT_SENTIMENT_SCORE, NON_TALK_TIME, NON_TALK_TIME_PERCENTAGE,
     * NUMBER_OF_INTERRUPTIONS, CONTACT_DURATION, AGENT_INTERACTION_DURATION,
     * CUSTOMER_HOLD_TIME
     *
     * @return <p>
     *         The property label of the automation.
     *         </p>
     * @see NumericQuestionPropertyAutomationLabel
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * The property label of the automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERALL_CUSTOMER_SENTIMENT_SCORE,
     * OVERALL_AGENT_SENTIMENT_SCORE, NON_TALK_TIME, NON_TALK_TIME_PERCENTAGE,
     * NUMBER_OF_INTERRUPTIONS, CONTACT_DURATION, AGENT_INTERACTION_DURATION,
     * CUSTOMER_HOLD_TIME
     *
     * @param label <p>
     *            The property label of the automation.
     *            </p>
     * @see NumericQuestionPropertyAutomationLabel
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The property label of the automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERALL_CUSTOMER_SENTIMENT_SCORE,
     * OVERALL_AGENT_SENTIMENT_SCORE, NON_TALK_TIME, NON_TALK_TIME_PERCENTAGE,
     * NUMBER_OF_INTERRUPTIONS, CONTACT_DURATION, AGENT_INTERACTION_DURATION,
     * CUSTOMER_HOLD_TIME
     *
     * @param label <p>
     *            The property label of the automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NumericQuestionPropertyAutomationLabel
     */
    public NumericQuestionPropertyValueAutomation withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * <p>
     * The property label of the automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERALL_CUSTOMER_SENTIMENT_SCORE,
     * OVERALL_AGENT_SENTIMENT_SCORE, NON_TALK_TIME, NON_TALK_TIME_PERCENTAGE,
     * NUMBER_OF_INTERRUPTIONS, CONTACT_DURATION, AGENT_INTERACTION_DURATION,
     * CUSTOMER_HOLD_TIME
     *
     * @param label <p>
     *            The property label of the automation.
     *            </p>
     * @see NumericQuestionPropertyAutomationLabel
     */
    public void setLabel(NumericQuestionPropertyAutomationLabel label) {
        this.label = label.toString();
    }

    /**
     * <p>
     * The property label of the automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERALL_CUSTOMER_SENTIMENT_SCORE,
     * OVERALL_AGENT_SENTIMENT_SCORE, NON_TALK_TIME, NON_TALK_TIME_PERCENTAGE,
     * NUMBER_OF_INTERRUPTIONS, CONTACT_DURATION, AGENT_INTERACTION_DURATION,
     * CUSTOMER_HOLD_TIME
     *
     * @param label <p>
     *            The property label of the automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NumericQuestionPropertyAutomationLabel
     */
    public NumericQuestionPropertyValueAutomation withLabel(
            NumericQuestionPropertyAutomationLabel label) {
        this.label = label.toString();
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
        if (getLabel() != null)
            sb.append("Label: " + getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericQuestionPropertyValueAutomation == false)
            return false;
        NumericQuestionPropertyValueAutomation other = (NumericQuestionPropertyValueAutomation) obj;

        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }
}
