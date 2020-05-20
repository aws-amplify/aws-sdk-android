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
 * ECS task set to another in equal increments, with an equal number of minutes
 * between each increment. The original and target Lambda function versions or
 * ECS task sets are specified in the deployment's AppSpec file.
 * </p>
 */
public class TimeBasedLinear implements Serializable {
    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment
     * of a <code>TimeBasedLinear</code> deployment.
     * </p>
     */
    private Integer linearPercentage;

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a
     * <code>TimeBasedLinear</code> deployment.
     * </p>
     */
    private Integer linearInterval;

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment
     * of a <code>TimeBasedLinear</code> deployment.
     * </p>
     *
     * @return <p>
     *         The percentage of traffic that is shifted at the start of each
     *         increment of a <code>TimeBasedLinear</code> deployment.
     *         </p>
     */
    public Integer getLinearPercentage() {
        return linearPercentage;
    }

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment
     * of a <code>TimeBasedLinear</code> deployment.
     * </p>
     *
     * @param linearPercentage <p>
     *            The percentage of traffic that is shifted at the start of each
     *            increment of a <code>TimeBasedLinear</code> deployment.
     *            </p>
     */
    public void setLinearPercentage(Integer linearPercentage) {
        this.linearPercentage = linearPercentage;
    }

    /**
     * <p>
     * The percentage of traffic that is shifted at the start of each increment
     * of a <code>TimeBasedLinear</code> deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param linearPercentage <p>
     *            The percentage of traffic that is shifted at the start of each
     *            increment of a <code>TimeBasedLinear</code> deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeBasedLinear withLinearPercentage(Integer linearPercentage) {
        this.linearPercentage = linearPercentage;
        return this;
    }

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a
     * <code>TimeBasedLinear</code> deployment.
     * </p>
     *
     * @return <p>
     *         The number of minutes between each incremental traffic shift of a
     *         <code>TimeBasedLinear</code> deployment.
     *         </p>
     */
    public Integer getLinearInterval() {
        return linearInterval;
    }

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a
     * <code>TimeBasedLinear</code> deployment.
     * </p>
     *
     * @param linearInterval <p>
     *            The number of minutes between each incremental traffic shift
     *            of a <code>TimeBasedLinear</code> deployment.
     *            </p>
     */
    public void setLinearInterval(Integer linearInterval) {
        this.linearInterval = linearInterval;
    }

    /**
     * <p>
     * The number of minutes between each incremental traffic shift of a
     * <code>TimeBasedLinear</code> deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param linearInterval <p>
     *            The number of minutes between each incremental traffic shift
     *            of a <code>TimeBasedLinear</code> deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeBasedLinear withLinearInterval(Integer linearInterval) {
        this.linearInterval = linearInterval;
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
        if (getLinearPercentage() != null)
            sb.append("linearPercentage: " + getLinearPercentage() + ",");
        if (getLinearInterval() != null)
            sb.append("linearInterval: " + getLinearInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLinearPercentage() == null) ? 0 : getLinearPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getLinearInterval() == null) ? 0 : getLinearInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedLinear == false)
            return false;
        TimeBasedLinear other = (TimeBasedLinear) obj;

        if (other.getLinearPercentage() == null ^ this.getLinearPercentage() == null)
            return false;
        if (other.getLinearPercentage() != null
                && other.getLinearPercentage().equals(this.getLinearPercentage()) == false)
            return false;
        if (other.getLinearInterval() == null ^ this.getLinearInterval() == null)
            return false;
        if (other.getLinearInterval() != null
                && other.getLinearInterval().equals(this.getLinearInterval()) == false)
            return false;
        return true;
    }
}
