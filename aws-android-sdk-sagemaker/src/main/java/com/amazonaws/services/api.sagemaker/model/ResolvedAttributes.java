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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * The resolved attributes.
 * </p>
 */
public class ResolvedAttributes implements Serializable {
    /**
     * <p>
     * Applies a metric to minimize or maximize for the job's objective.
     * </p>
     */
    private AutoMLJobObjective autoMLJobObjective;

    /**
     * <p>
     * The problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     */
    private String problemType;

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     */
    private AutoMLJobCompletionCriteria completionCriteria;

    /**
     * <p>
     * Applies a metric to minimize or maximize for the job's objective.
     * </p>
     *
     * @return <p>
     *         Applies a metric to minimize or maximize for the job's objective.
     *         </p>
     */
    public AutoMLJobObjective getAutoMLJobObjective() {
        return autoMLJobObjective;
    }

    /**
     * <p>
     * Applies a metric to minimize or maximize for the job's objective.
     * </p>
     *
     * @param autoMLJobObjective <p>
     *            Applies a metric to minimize or maximize for the job's
     *            objective.
     *            </p>
     */
    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Applies a metric to minimize or maximize for the job's objective.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLJobObjective <p>
     *            Applies a metric to minimize or maximize for the job's
     *            objective.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolvedAttributes withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
        return this;
    }

    /**
     * <p>
     * The problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @return <p>
     *         The problem type.
     *         </p>
     * @see ProblemType
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * <p>
     * The problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            The problem type.
     *            </p>
     * @see ProblemType
     */
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * The problem type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            The problem type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProblemType
     */
    public ResolvedAttributes withProblemType(String problemType) {
        this.problemType = problemType;
        return this;
    }

    /**
     * <p>
     * The problem type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            The problem type.
     *            </p>
     * @see ProblemType
     */
    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
    }

    /**
     * <p>
     * The problem type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BinaryClassification, MulticlassClassification,
     * Regression
     *
     * @param problemType <p>
     *            The problem type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProblemType
     */
    public ResolvedAttributes withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     *
     * @return <p>
     *         How long a job is allowed to run, or how many candidates a job is
     *         allowed to generate.
     *         </p>
     */
    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     *
     * @param completionCriteria <p>
     *            How long a job is allowed to run, or how many candidates a job
     *            is allowed to generate.
     *            </p>
     */
    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionCriteria <p>
     *            How long a job is allowed to run, or how many candidates a job
     *            is allowed to generate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResolvedAttributes withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
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
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: " + getAutoMLJobObjective() + ",");
        if (getProblemType() != null)
            sb.append("ProblemType: " + getProblemType() + ",");
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: " + getCompletionCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode
                + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolvedAttributes == false)
            return false;
        ResolvedAttributes other = (ResolvedAttributes) obj;

        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null
                && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null
                && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null
                && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        return true;
    }
}
