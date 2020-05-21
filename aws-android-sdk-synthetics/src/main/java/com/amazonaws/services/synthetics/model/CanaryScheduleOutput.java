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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * How long, in seconds, for the canary to continue making regular runs
 * according to the schedule in the <code>Expression</code> value.
 * </p>
 */
public class CanaryScheduleOutput implements Serializable {
    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax
     * is <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be
     * <code>minute</code>, <code>minutes</code>, or <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute,
     * <code>rate(10 minutes)</code> runs it once every 10 minutes, and
     * <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a
     * special value that causes the canary to run only once when it is started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String expression;

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs
     * after it was created. The runs are performed according to the schedule in
     * the <code>Expression</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 31622400<br/>
     */
    private Long durationInSeconds;

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax
     * is <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be
     * <code>minute</code>, <code>minutes</code>, or <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute,
     * <code>rate(10 minutes)</code> runs it once every 10 minutes, and
     * <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a
     * special value that causes the canary to run only once when it is started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A rate expression that defines how often the canary is to run.
     *         The syntax is <code>rate(<i>number unit</i>)</code>. <i>unit</i>
     *         can be <code>minute</code>, <code>minutes</code>, or
     *         <code>hour</code>.
     *         </p>
     *         <p>
     *         For example, <code>rate(1 minute)</code> runs the canary once a
     *         minute, <code>rate(10 minutes)</code> runs it once every 10
     *         minutes, and <code>rate(1 hour)</code> runs it once every hour.
     *         </p>
     *         <p>
     *         Specifying <code>rate(0 minute)</code> or
     *         <code>rate(0 hour)</code> is a special value that causes the
     *         canary to run only once when it is started.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax
     * is <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be
     * <code>minute</code>, <code>minutes</code>, or <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute,
     * <code>rate(10 minutes)</code> runs it once every 10 minutes, and
     * <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a
     * special value that causes the canary to run only once when it is started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param expression <p>
     *            A rate expression that defines how often the canary is to run.
     *            The syntax is <code>rate(<i>number unit</i>)</code>.
     *            <i>unit</i> can be <code>minute</code>, <code>minutes</code>,
     *            or <code>hour</code>.
     *            </p>
     *            <p>
     *            For example, <code>rate(1 minute)</code> runs the canary once
     *            a minute, <code>rate(10 minutes)</code> runs it once every 10
     *            minutes, and <code>rate(1 hour)</code> runs it once every
     *            hour.
     *            </p>
     *            <p>
     *            Specifying <code>rate(0 minute)</code> or
     *            <code>rate(0 hour)</code> is a special value that causes the
     *            canary to run only once when it is started.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A rate expression that defines how often the canary is to run. The syntax
     * is <code>rate(<i>number unit</i>)</code>. <i>unit</i> can be
     * <code>minute</code>, <code>minutes</code>, or <code>hour</code>.
     * </p>
     * <p>
     * For example, <code>rate(1 minute)</code> runs the canary once a minute,
     * <code>rate(10 minutes)</code> runs it once every 10 minutes, and
     * <code>rate(1 hour)</code> runs it once every hour.
     * </p>
     * <p>
     * Specifying <code>rate(0 minute)</code> or <code>rate(0 hour)</code> is a
     * special value that causes the canary to run only once when it is started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param expression <p>
     *            A rate expression that defines how often the canary is to run.
     *            The syntax is <code>rate(<i>number unit</i>)</code>.
     *            <i>unit</i> can be <code>minute</code>, <code>minutes</code>,
     *            or <code>hour</code>.
     *            </p>
     *            <p>
     *            For example, <code>rate(1 minute)</code> runs the canary once
     *            a minute, <code>rate(10 minutes)</code> runs it once every 10
     *            minutes, and <code>rate(1 hour)</code> runs it once every
     *            hour.
     *            </p>
     *            <p>
     *            Specifying <code>rate(0 minute)</code> or
     *            <code>rate(0 hour)</code> is a special value that causes the
     *            canary to run only once when it is started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryScheduleOutput withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs
     * after it was created. The runs are performed according to the schedule in
     * the <code>Expression</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 31622400<br/>
     *
     * @return <p>
     *         How long, in seconds, for the canary to continue making regular
     *         runs after it was created. The runs are performed according to
     *         the schedule in the <code>Expression</code> value.
     *         </p>
     */
    public Long getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs
     * after it was created. The runs are performed according to the schedule in
     * the <code>Expression</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 31622400<br/>
     *
     * @param durationInSeconds <p>
     *            How long, in seconds, for the canary to continue making
     *            regular runs after it was created. The runs are performed
     *            according to the schedule in the <code>Expression</code>
     *            value.
     *            </p>
     */
    public void setDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * How long, in seconds, for the canary to continue making regular runs
     * after it was created. The runs are performed according to the schedule in
     * the <code>Expression</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 31622400<br/>
     *
     * @param durationInSeconds <p>
     *            How long, in seconds, for the canary to continue making
     *            regular runs after it was created. The runs are performed
     *            according to the schedule in the <code>Expression</code>
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryScheduleOutput withDurationInSeconds(Long durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
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
        if (getExpression() != null)
            sb.append("Expression: " + getExpression() + ",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryScheduleOutput == false)
            return false;
        CanaryScheduleOutput other = (CanaryScheduleOutput) obj;

        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }
}
