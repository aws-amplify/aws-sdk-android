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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * A configuration that shifts traffic from one version of a Lambda function or
 * ECS task set to another in two increments. The original and target Lambda
 * function versions or ECS task sets are specified in the deployment's AppSpec
 * file.
 * </p>
 */
public class TimeBasedCanary implements Serializable {
    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     */
    private Integer canaryPercentage;

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     */
    private Integer canaryInterval;

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     *
     * @return <p>
     *         The percentage of traffic to shift in the first increment of a
     *         <code>TimeBasedCanary</code> deployment.
     *         </p>
     */
    public Integer getCanaryPercentage() {
        return canaryPercentage;
    }

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     *
     * @param canaryPercentage <p>
     *            The percentage of traffic to shift in the first increment of a
     *            <code>TimeBasedCanary</code> deployment.
     *            </p>
     */
    public void setCanaryPercentage(Integer canaryPercentage) {
        this.canaryPercentage = canaryPercentage;
    }

    /**
     * <p>
     * The percentage of traffic to shift in the first increment of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canaryPercentage <p>
     *            The percentage of traffic to shift in the first increment of a
     *            <code>TimeBasedCanary</code> deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeBasedCanary withCanaryPercentage(Integer canaryPercentage) {
        this.canaryPercentage = canaryPercentage;
        return this;
    }

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     *
     * @return <p>
     *         The number of minutes between the first and second traffic shifts
     *         of a <code>TimeBasedCanary</code> deployment.
     *         </p>
     */
    public Integer getCanaryInterval() {
        return canaryInterval;
    }

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     *
     * @param canaryInterval <p>
     *            The number of minutes between the first and second traffic
     *            shifts of a <code>TimeBasedCanary</code> deployment.
     *            </p>
     */
    public void setCanaryInterval(Integer canaryInterval) {
        this.canaryInterval = canaryInterval;
    }

    /**
     * <p>
     * The number of minutes between the first and second traffic shifts of a
     * <code>TimeBasedCanary</code> deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canaryInterval <p>
     *            The number of minutes between the first and second traffic
     *            shifts of a <code>TimeBasedCanary</code> deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeBasedCanary withCanaryInterval(Integer canaryInterval) {
        this.canaryInterval = canaryInterval;
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
        if (getCanaryPercentage() != null)
            sb.append("canaryPercentage: " + getCanaryPercentage() + ",");
        if (getCanaryInterval() != null)
            sb.append("canaryInterval: " + getCanaryInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCanaryPercentage() == null) ? 0 : getCanaryPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getCanaryInterval() == null) ? 0 : getCanaryInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedCanary == false)
            return false;
        TimeBasedCanary other = (TimeBasedCanary) obj;

        if (other.getCanaryPercentage() == null ^ this.getCanaryPercentage() == null)
            return false;
        if (other.getCanaryPercentage() != null
                && other.getCanaryPercentage().equals(this.getCanaryPercentage()) == false)
            return false;
        if (other.getCanaryInterval() == null ^ this.getCanaryInterval() == null)
            return false;
        if (other.getCanaryInterval() != null
                && other.getCanaryInterval().equals(this.getCanaryInterval()) == false)
            return false;
        return true;
    }
}
