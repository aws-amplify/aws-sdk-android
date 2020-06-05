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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a condition to evaluate for an activity path in a journey.
 * </p>
 */
public class MultiConditionalBranch implements Serializable {
    /**
     * <p>
     * The condition to evaluate for the activity path.
     * </p>
     */
    private SimpleCondition condition;

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     */
    private String nextActivity;

    /**
     * <p>
     * The condition to evaluate for the activity path.
     * </p>
     *
     * @return <p>
     *         The condition to evaluate for the activity path.
     *         </p>
     */
    public SimpleCondition getCondition() {
        return condition;
    }

    /**
     * <p>
     * The condition to evaluate for the activity path.
     * </p>
     *
     * @param condition <p>
     *            The condition to evaluate for the activity path.
     *            </p>
     */
    public void setCondition(SimpleCondition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition to evaluate for the activity path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param condition <p>
     *            The condition to evaluate for the activity path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiConditionalBranch withCondition(SimpleCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the next activity to perform, after
     *         completing the activity for the path.
     *         </p>
     */
    public String getNextActivity() {
        return nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            completing the activity for the path.
     *            </p>
     */
    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after completing
     * the activity for the path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            completing the activity for the path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiConditionalBranch withNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
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
        if (getCondition() != null)
            sb.append("Condition: " + getCondition() + ",");
        if (getNextActivity() != null)
            sb.append("NextActivity: " + getNextActivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode
                + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiConditionalBranch == false)
            return false;
        MultiConditionalBranch other = (MultiConditionalBranch) obj;

        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null
                && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        return true;
    }
}
