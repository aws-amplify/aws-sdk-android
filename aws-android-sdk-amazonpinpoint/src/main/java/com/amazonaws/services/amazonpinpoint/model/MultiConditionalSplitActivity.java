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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the settings for a multivariate split activity in a journey. This
 * type of activity sends participants down one of as many as five paths
 * (including a default <i>Else</i> path) in a journey, based on conditions that
 * you specify.
 * </p>
 */
public class MultiConditionalSplitActivity implements Serializable {
    /**
     * <p>
     * The paths for the activity, including the conditions for entering each
     * path and the activity to perform for each path.
     * </p>
     */
    private java.util.List<MultiConditionalBranch> branches;

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who
     * don't meet any of the conditions specified for other paths in the
     * activity.
     * </p>
     */
    private String defaultActivity;

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint
     * determines whether the conditions are met.
     * </p>
     */
    private WaitTime evaluationWaitTime;

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each
     * path and the activity to perform for each path.
     * </p>
     *
     * @return <p>
     *         The paths for the activity, including the conditions for entering
     *         each path and the activity to perform for each path.
     *         </p>
     */
    public java.util.List<MultiConditionalBranch> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each
     * path and the activity to perform for each path.
     * </p>
     *
     * @param branches <p>
     *            The paths for the activity, including the conditions for
     *            entering each path and the activity to perform for each path.
     *            </p>
     */
    public void setBranches(java.util.Collection<MultiConditionalBranch> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<MultiConditionalBranch>(branches);
    }

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each
     * path and the activity to perform for each path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            The paths for the activity, including the conditions for
     *            entering each path and the activity to perform for each path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiConditionalSplitActivity withBranches(MultiConditionalBranch... branches) {
        if (getBranches() == null) {
            this.branches = new java.util.ArrayList<MultiConditionalBranch>(branches.length);
        }
        for (MultiConditionalBranch value : branches) {
            this.branches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each
     * path and the activity to perform for each path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            The paths for the activity, including the conditions for
     *            entering each path and the activity to perform for each path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiConditionalSplitActivity withBranches(
            java.util.Collection<MultiConditionalBranch> branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who
     * don't meet any of the conditions specified for other paths in the
     * activity.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the activity to perform for
     *         participants who don't meet any of the conditions specified for
     *         other paths in the activity.
     *         </p>
     */
    public String getDefaultActivity() {
        return defaultActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who
     * don't meet any of the conditions specified for other paths in the
     * activity.
     * </p>
     *
     * @param defaultActivity <p>
     *            The unique identifier for the activity to perform for
     *            participants who don't meet any of the conditions specified
     *            for other paths in the activity.
     *            </p>
     */
    public void setDefaultActivity(String defaultActivity) {
        this.defaultActivity = defaultActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who
     * don't meet any of the conditions specified for other paths in the
     * activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultActivity <p>
     *            The unique identifier for the activity to perform for
     *            participants who don't meet any of the conditions specified
     *            for other paths in the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiConditionalSplitActivity withDefaultActivity(String defaultActivity) {
        this.defaultActivity = defaultActivity;
        return this;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint
     * determines whether the conditions are met.
     * </p>
     *
     * @return <p>
     *         The amount of time to wait or the date and time when Amazon
     *         Pinpoint determines whether the conditions are met.
     *         </p>
     */
    public WaitTime getEvaluationWaitTime() {
        return evaluationWaitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint
     * determines whether the conditions are met.
     * </p>
     *
     * @param evaluationWaitTime <p>
     *            The amount of time to wait or the date and time when Amazon
     *            Pinpoint determines whether the conditions are met.
     *            </p>
     */
    public void setEvaluationWaitTime(WaitTime evaluationWaitTime) {
        this.evaluationWaitTime = evaluationWaitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint
     * determines whether the conditions are met.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationWaitTime <p>
     *            The amount of time to wait or the date and time when Amazon
     *            Pinpoint determines whether the conditions are met.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiConditionalSplitActivity withEvaluationWaitTime(WaitTime evaluationWaitTime) {
        this.evaluationWaitTime = evaluationWaitTime;
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
        if (getBranches() != null)
            sb.append("Branches: " + getBranches() + ",");
        if (getDefaultActivity() != null)
            sb.append("DefaultActivity: " + getDefaultActivity() + ",");
        if (getEvaluationWaitTime() != null)
            sb.append("EvaluationWaitTime: " + getEvaluationWaitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultActivity() == null) ? 0 : getDefaultActivity().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationWaitTime() == null) ? 0 : getEvaluationWaitTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiConditionalSplitActivity == false)
            return false;
        MultiConditionalSplitActivity other = (MultiConditionalSplitActivity) obj;

        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getDefaultActivity() == null ^ this.getDefaultActivity() == null)
            return false;
        if (other.getDefaultActivity() != null
                && other.getDefaultActivity().equals(this.getDefaultActivity()) == false)
            return false;
        if (other.getEvaluationWaitTime() == null ^ this.getEvaluationWaitTime() == null)
            return false;
        if (other.getEvaluationWaitTime() != null
                && other.getEvaluationWaitTime().equals(this.getEvaluationWaitTime()) == false)
            return false;
        return true;
    }
}
