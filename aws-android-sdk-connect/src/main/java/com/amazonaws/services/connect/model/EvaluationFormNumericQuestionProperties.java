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
 * Information about properties for a numeric question in an evaluation form.
 * </p>
 */
public class EvaluationFormNumericQuestionProperties implements Serializable {
    /**
     * <p>
     * The minimum answer value.
     * </p>
     */
    private Integer minValue;

    /**
     * <p>
     * The maximum answer value.
     * </p>
     */
    private Integer maxValue;

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     */
    private java.util.List<EvaluationFormNumericQuestionOption> options;

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     */
    private EvaluationFormNumericQuestionAutomation automation;

    /**
     * <p>
     * The minimum answer value.
     * </p>
     *
     * @return <p>
     *         The minimum answer value.
     *         </p>
     */
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * <p>
     * The minimum answer value.
     * </p>
     *
     * @param minValue <p>
     *            The minimum answer value.
     *            </p>
     */
    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum answer value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minValue <p>
     *            The minimum answer value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionProperties withMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * <p>
     * The maximum answer value.
     * </p>
     *
     * @return <p>
     *         The maximum answer value.
     *         </p>
     */
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * <p>
     * The maximum answer value.
     * </p>
     *
     * @param maxValue <p>
     *            The maximum answer value.
     *            </p>
     */
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum answer value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxValue <p>
     *            The maximum answer value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionProperties withMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     *
     * @return <p>
     *         The scoring options of the numeric question.
     *         </p>
     */
    public java.util.List<EvaluationFormNumericQuestionOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     *
     * @param options <p>
     *            The scoring options of the numeric question.
     *            </p>
     */
    public void setOptions(java.util.Collection<EvaluationFormNumericQuestionOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<EvaluationFormNumericQuestionOption>(options);
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The scoring options of the numeric question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionProperties withOptions(
            EvaluationFormNumericQuestionOption... options) {
        if (getOptions() == null) {
            this.options = new java.util.ArrayList<EvaluationFormNumericQuestionOption>(
                    options.length);
        }
        for (EvaluationFormNumericQuestionOption value : options) {
            this.options.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The scoring options of the numeric question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionProperties withOptions(
            java.util.Collection<EvaluationFormNumericQuestionOption> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     *
     * @return <p>
     *         The automation properties of the numeric question.
     *         </p>
     */
    public EvaluationFormNumericQuestionAutomation getAutomation() {
        return automation;
    }

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     *
     * @param automation <p>
     *            The automation properties of the numeric question.
     *            </p>
     */
    public void setAutomation(EvaluationFormNumericQuestionAutomation automation) {
        this.automation = automation;
    }

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automation <p>
     *            The automation properties of the numeric question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionProperties withAutomation(
            EvaluationFormNumericQuestionAutomation automation) {
        this.automation = automation;
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
        if (getMinValue() != null)
            sb.append("MinValue: " + getMinValue() + ",");
        if (getMaxValue() != null)
            sb.append("MaxValue: " + getMaxValue() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getAutomation() != null)
            sb.append("Automation: " + getAutomation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getAutomation() == null) ? 0 : getAutomation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormNumericQuestionProperties == false)
            return false;
        EvaluationFormNumericQuestionProperties other = (EvaluationFormNumericQuestionProperties) obj;

        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getAutomation() == null ^ this.getAutomation() == null)
            return false;
        if (other.getAutomation() != null
                && other.getAutomation().equals(this.getAutomation()) == false)
            return false;
        return true;
    }
}
