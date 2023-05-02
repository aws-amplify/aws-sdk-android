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
 * Information about the options in single select questions.
 * </p>
 */
public class EvaluationFormSingleSelectQuestionProperties implements Serializable {
    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     */
    private java.util.List<EvaluationFormSingleSelectQuestionOption> options;

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DROPDOWN, RADIO
     */
    private String displayAs;

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     */
    private EvaluationFormSingleSelectQuestionAutomation automation;

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     *
     * @return <p>
     *         The answer options of the single select question.
     *         </p>
     */
    public java.util.List<EvaluationFormSingleSelectQuestionOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     *
     * @param options <p>
     *            The answer options of the single select question.
     *            </p>
     */
    public void setOptions(java.util.Collection<EvaluationFormSingleSelectQuestionOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<EvaluationFormSingleSelectQuestionOption>(options);
    }

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The answer options of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionProperties withOptions(
            EvaluationFormSingleSelectQuestionOption... options) {
        if (getOptions() == null) {
            this.options = new java.util.ArrayList<EvaluationFormSingleSelectQuestionOption>(
                    options.length);
        }
        for (EvaluationFormSingleSelectQuestionOption value : options) {
            this.options.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The answer options of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionProperties withOptions(
            java.util.Collection<EvaluationFormSingleSelectQuestionOption> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DROPDOWN, RADIO
     *
     * @return <p>
     *         The display mode of the single select question.
     *         </p>
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */
    public String getDisplayAs() {
        return displayAs;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DROPDOWN, RADIO
     *
     * @param displayAs <p>
     *            The display mode of the single select question.
     *            </p>
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */
    public void setDisplayAs(String displayAs) {
        this.displayAs = displayAs;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DROPDOWN, RADIO
     *
     * @param displayAs <p>
     *            The display mode of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */
    public EvaluationFormSingleSelectQuestionProperties withDisplayAs(String displayAs) {
        this.displayAs = displayAs;
        return this;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DROPDOWN, RADIO
     *
     * @param displayAs <p>
     *            The display mode of the single select question.
     *            </p>
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */
    public void setDisplayAs(EvaluationFormSingleSelectQuestionDisplayMode displayAs) {
        this.displayAs = displayAs.toString();
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DROPDOWN, RADIO
     *
     * @param displayAs <p>
     *            The display mode of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */
    public EvaluationFormSingleSelectQuestionProperties withDisplayAs(
            EvaluationFormSingleSelectQuestionDisplayMode displayAs) {
        this.displayAs = displayAs.toString();
        return this;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     *
     * @return <p>
     *         The display mode of the single select question.
     *         </p>
     */
    public EvaluationFormSingleSelectQuestionAutomation getAutomation() {
        return automation;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     *
     * @param automation <p>
     *            The display mode of the single select question.
     *            </p>
     */
    public void setAutomation(EvaluationFormSingleSelectQuestionAutomation automation) {
        this.automation = automation;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automation <p>
     *            The display mode of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionProperties withAutomation(
            EvaluationFormSingleSelectQuestionAutomation automation) {
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
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getDisplayAs() != null)
            sb.append("DisplayAs: " + getDisplayAs() + ",");
        if (getAutomation() != null)
            sb.append("Automation: " + getAutomation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getDisplayAs() == null) ? 0 : getDisplayAs().hashCode());
        hashCode = prime * hashCode + ((getAutomation() == null) ? 0 : getAutomation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSingleSelectQuestionProperties == false)
            return false;
        EvaluationFormSingleSelectQuestionProperties other = (EvaluationFormSingleSelectQuestionProperties) obj;

        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getDisplayAs() == null ^ this.getDisplayAs() == null)
            return false;
        if (other.getDisplayAs() != null
                && other.getDisplayAs().equals(this.getDisplayAs()) == false)
            return false;
        if (other.getAutomation() == null ^ this.getAutomation() == null)
            return false;
        if (other.getAutomation() != null
                && other.getAutomation().equals(this.getAutomation()) == false)
            return false;
        return true;
    }
}
