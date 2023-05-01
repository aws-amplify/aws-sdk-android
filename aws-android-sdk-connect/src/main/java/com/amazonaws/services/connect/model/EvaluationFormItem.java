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
 * Information about an item from an evaluation form. The item must be either a
 * section or a question.
 * </p>
 */
public class EvaluationFormItem implements Serializable {
    /**
     * <p>
     * The information of the section.
     * </p>
     */
    private EvaluationFormSection section;

    /**
     * <p>
     * The information of the question.
     * </p>
     */
    private EvaluationFormQuestion question;

    /**
     * <p>
     * The information of the section.
     * </p>
     *
     * @return <p>
     *         The information of the section.
     *         </p>
     */
    public EvaluationFormSection getSection() {
        return section;
    }

    /**
     * <p>
     * The information of the section.
     * </p>
     *
     * @param section <p>
     *            The information of the section.
     *            </p>
     */
    public void setSection(EvaluationFormSection section) {
        this.section = section;
    }

    /**
     * <p>
     * The information of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param section <p>
     *            The information of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormItem withSection(EvaluationFormSection section) {
        this.section = section;
        return this;
    }

    /**
     * <p>
     * The information of the question.
     * </p>
     *
     * @return <p>
     *         The information of the question.
     *         </p>
     */
    public EvaluationFormQuestion getQuestion() {
        return question;
    }

    /**
     * <p>
     * The information of the question.
     * </p>
     *
     * @param question <p>
     *            The information of the question.
     *            </p>
     */
    public void setQuestion(EvaluationFormQuestion question) {
        this.question = question;
    }

    /**
     * <p>
     * The information of the question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param question <p>
     *            The information of the question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormItem withQuestion(EvaluationFormQuestion question) {
        this.question = question;
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
        if (getSection() != null)
            sb.append("Section: " + getSection() + ",");
        if (getQuestion() != null)
            sb.append("Question: " + getQuestion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSection() == null) ? 0 : getSection().hashCode());
        hashCode = prime * hashCode + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormItem == false)
            return false;
        EvaluationFormItem other = (EvaluationFormItem) obj;

        if (other.getSection() == null ^ this.getSection() == null)
            return false;
        if (other.getSection() != null && other.getSection().equals(this.getSection()) == false)
            return false;
        if (other.getQuestion() == null ^ this.getQuestion() == null)
            return false;
        if (other.getQuestion() != null && other.getQuestion().equals(this.getQuestion()) == false)
            return false;
        return true;
    }
}
