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
 * Information about the automation configuration in single select questions.
 * Automation options are evaluated in order, and the first matched option is
 * applied. If no automation option matches, and there is a default option, then
 * the default option is applied.
 * </p>
 */
public class EvaluationFormSingleSelectQuestionAutomation implements Serializable {
    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     */
    private java.util.List<EvaluationFormSingleSelectQuestionAutomationOption> options;

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation
     * options match the criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String defaultOptionRefId;

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     *
     * @return <p>
     *         The automation options of the single select question.
     *         </p>
     */
    public java.util.List<EvaluationFormSingleSelectQuestionAutomationOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     *
     * @param options <p>
     *            The automation options of the single select question.
     *            </p>
     */
    public void setOptions(
            java.util.Collection<EvaluationFormSingleSelectQuestionAutomationOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<EvaluationFormSingleSelectQuestionAutomationOption>(
                options);
    }

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The automation options of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionAutomation withOptions(
            EvaluationFormSingleSelectQuestionAutomationOption... options) {
        if (getOptions() == null) {
            this.options = new java.util.ArrayList<EvaluationFormSingleSelectQuestionAutomationOption>(
                    options.length);
        }
        for (EvaluationFormSingleSelectQuestionAutomationOption value : options) {
            this.options.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The automation options of the single select question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionAutomation withOptions(
            java.util.Collection<EvaluationFormSingleSelectQuestionAutomationOption> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation
     * options match the criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return <p>
     *         The identifier of the default answer option, when none of the
     *         automation options match the criteria.
     *         </p>
     */
    public String getDefaultOptionRefId() {
        return defaultOptionRefId;
    }

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation
     * options match the criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param defaultOptionRefId <p>
     *            The identifier of the default answer option, when none of the
     *            automation options match the criteria.
     *            </p>
     */
    public void setDefaultOptionRefId(String defaultOptionRefId) {
        this.defaultOptionRefId = defaultOptionRefId;
    }

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation
     * options match the criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param defaultOptionRefId <p>
     *            The identifier of the default answer option, when none of the
     *            automation options match the criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSingleSelectQuestionAutomation withDefaultOptionRefId(
            String defaultOptionRefId) {
        this.defaultOptionRefId = defaultOptionRefId;
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
        if (getDefaultOptionRefId() != null)
            sb.append("DefaultOptionRefId: " + getDefaultOptionRefId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultOptionRefId() == null) ? 0 : getDefaultOptionRefId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSingleSelectQuestionAutomation == false)
            return false;
        EvaluationFormSingleSelectQuestionAutomation other = (EvaluationFormSingleSelectQuestionAutomation) obj;

        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getDefaultOptionRefId() == null ^ this.getDefaultOptionRefId() == null)
            return false;
        if (other.getDefaultOptionRefId() != null
                && other.getDefaultOptionRefId().equals(this.getDefaultOptionRefId()) == false)
            return false;
        return true;
    }
}
