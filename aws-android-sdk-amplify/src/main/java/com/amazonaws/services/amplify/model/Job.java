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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an execution job for an Amplify app.
 * </p>
 */
public class Job implements Serializable {
    /**
     * <p>
     * Describes the summary for an execution job for an Amplify app.
     * </p>
     */
    private JobSummary summary;

    /**
     * <p>
     * The execution steps for an execution job, for an Amplify app.
     * </p>
     */
    private java.util.List<Step> steps;

    /**
     * <p>
     * Describes the summary for an execution job for an Amplify app.
     * </p>
     *
     * @return <p>
     *         Describes the summary for an execution job for an Amplify app.
     *         </p>
     */
    public JobSummary getSummary() {
        return summary;
    }

    /**
     * <p>
     * Describes the summary for an execution job for an Amplify app.
     * </p>
     *
     * @param summary <p>
     *            Describes the summary for an execution job for an Amplify app.
     *            </p>
     */
    public void setSummary(JobSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Describes the summary for an execution job for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            Describes the summary for an execution job for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withSummary(JobSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * <p>
     * The execution steps for an execution job, for an Amplify app.
     * </p>
     *
     * @return <p>
     *         The execution steps for an execution job, for an Amplify app.
     *         </p>
     */
    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * <p>
     * The execution steps for an execution job, for an Amplify app.
     * </p>
     *
     * @param steps <p>
     *            The execution steps for an execution job, for an Amplify app.
     *            </p>
     */
    public void setSteps(java.util.Collection<Step> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<Step>(steps);
    }

    /**
     * <p>
     * The execution steps for an execution job, for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            The execution steps for an execution job, for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withSteps(Step... steps) {
        if (getSteps() == null) {
            this.steps = new java.util.ArrayList<Step>(steps.length);
        }
        for (Step value : steps) {
            this.steps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The execution steps for an execution job, for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            The execution steps for an execution job, for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Job withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
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
        if (getSummary() != null)
            sb.append("summary: " + getSummary() + ",");
        if (getSteps() != null)
            sb.append("steps: " + getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;

        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }
}
