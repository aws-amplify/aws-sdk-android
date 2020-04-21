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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * An automatic scaling policy for a core instance group or task instance group
 * in an Amazon EMR cluster. An automatic scaling policy defines how an instance
 * group dynamically adds and terminates EC2 instances in response to the value
 * of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
 * </p>
 */
public class AutoScalingPolicy implements Serializable {
    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy.
     * Automatic scaling activity will not cause an instance group to grow above
     * or below these limits.
     * </p>
     */
    private ScalingConstraints constraints;

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling
     * policy.
     * </p>
     */
    private java.util.List<ScalingRule> rules;

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy.
     * Automatic scaling activity will not cause an instance group to grow above
     * or below these limits.
     * </p>
     *
     * @return <p>
     *         The upper and lower EC2 instance limits for an automatic scaling
     *         policy. Automatic scaling activity will not cause an instance
     *         group to grow above or below these limits.
     *         </p>
     */
    public ScalingConstraints getConstraints() {
        return constraints;
    }

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy.
     * Automatic scaling activity will not cause an instance group to grow above
     * or below these limits.
     * </p>
     *
     * @param constraints <p>
     *            The upper and lower EC2 instance limits for an automatic
     *            scaling policy. Automatic scaling activity will not cause an
     *            instance group to grow above or below these limits.
     *            </p>
     */
    public void setConstraints(ScalingConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy.
     * Automatic scaling activity will not cause an instance group to grow above
     * or below these limits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraints <p>
     *            The upper and lower EC2 instance limits for an automatic
     *            scaling policy. Automatic scaling activity will not cause an
     *            instance group to grow above or below these limits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingPolicy withConstraints(ScalingConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling
     * policy.
     * </p>
     *
     * @return <p>
     *         The scale-in and scale-out rules that comprise the automatic
     *         scaling policy.
     *         </p>
     */
    public java.util.List<ScalingRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling
     * policy.
     * </p>
     *
     * @param rules <p>
     *            The scale-in and scale-out rules that comprise the automatic
     *            scaling policy.
     *            </p>
     */
    public void setRules(java.util.Collection<ScalingRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ScalingRule>(rules);
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The scale-in and scale-out rules that comprise the automatic
     *            scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingPolicy withRules(ScalingRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<ScalingRule>(rules.length);
        }
        for (ScalingRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The scale-in and scale-out rules that comprise the automatic
     *            scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingPolicy withRules(java.util.Collection<ScalingRule> rules) {
        setRules(rules);
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
        if (getConstraints() != null)
            sb.append("Constraints: " + getConstraints() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicy == false)
            return false;
        AutoScalingPolicy other = (AutoScalingPolicy) obj;

        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null
                && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
