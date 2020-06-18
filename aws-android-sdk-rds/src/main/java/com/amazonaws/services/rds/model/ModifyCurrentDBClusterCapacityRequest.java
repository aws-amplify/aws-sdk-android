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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Set the capacity of an Aurora Serverless DB cluster to a specific value.
 * </p>
 * <p>
 * Aurora Serverless scales seamlessly based on the workload on the DB cluster.
 * In some cases, the capacity might not scale fast enough to meet a sudden
 * change in workload, such as a large number of new transactions. Call
 * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
 * </p>
 * <p>
 * After this call sets the DB cluster capacity, Aurora Serverless can
 * automatically scale the DB cluster based on the cooldown period for scaling
 * up and the cooldown period for scaling down.
 * </p>
 * <p>
 * For more information about Aurora Serverless, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
 * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * <important>
 * <p>
 * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default
 * <code>TimeoutAction</code>, connections that prevent Aurora Serverless from
 * finding a scaling point might be dropped. For more information about scaling
 * points, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
 * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User
 * Guide</i>.
 * </p>
 * </important> <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class ModifyCurrentDBClusterCapacityRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it
     * automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer capacity;

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a
     * scaling point to perform seamless scaling before enforcing the timeout
     * action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     */
    private Integer secondsBeforeTimeout;

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to
     * the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a
     * scaling point isn't found in the timeout period.
     * </p>
     */
    private String timeoutAction;

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB cluster identifier for the cluster being modified. This
     *         parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DB cluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier for the cluster being modified. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DB cluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier for the cluster being modified. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DB cluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it
     * automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB cluster capacity.
     *         </p>
     *         <p>
     *         When you change the capacity of a paused Aurora Serverless DB
     *         cluster, it automatically resumes.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Aurora MySQL, valid capacity values are <code>1</code>,
     *         <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     *         <code>32</code>, <code>64</code>, <code>128</code>, and
     *         <code>256</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     *         <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     *         <code>64</code>, <code>192</code>, and <code>384</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it
     * automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param capacity <p>
     *            The DB cluster capacity.
     *            </p>
     *            <p>
     *            When you change the capacity of a paused Aurora Serverless DB
     *            cluster, it automatically resumes.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For Aurora MySQL, valid capacity values are <code>1</code>,
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>128</code>, and <code>256</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Aurora PostgreSQL, valid capacity values are
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>192</code>, and <code>384</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The DB cluster capacity.
     * </p>
     * <p>
     * When you change the capacity of a paused Aurora Serverless DB cluster, it
     * automatically resumes.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Aurora MySQL, valid capacity values are <code>1</code>,
     * <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>,
     * <code>32</code>, <code>64</code>, <code>128</code>, and <code>256</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Aurora PostgreSQL, valid capacity values are <code>2</code>,
     * <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>,
     * <code>64</code>, <code>192</code>, and <code>384</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacity <p>
     *            The DB cluster capacity.
     *            </p>
     *            <p>
     *            When you change the capacity of a paused Aurora Serverless DB
     *            cluster, it automatically resumes.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For Aurora MySQL, valid capacity values are <code>1</code>,
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>128</code>, and <code>256</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Aurora PostgreSQL, valid capacity values are
     *            <code>2</code>, <code>4</code>, <code>8</code>,
     *            <code>16</code>, <code>32</code>, <code>64</code>,
     *            <code>192</code>, and <code>384</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityRequest withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a
     * scaling point to perform seamless scaling before enforcing the timeout
     * action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The amount of time, in seconds, that Aurora Serverless tries to
     *         find a scaling point to perform seamless scaling before enforcing
     *         the timeout action. The default is 300.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Value must be from 10 through 600.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getSecondsBeforeTimeout() {
        return secondsBeforeTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a
     * scaling point to perform seamless scaling before enforcing the timeout
     * action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     *
     * @param secondsBeforeTimeout <p>
     *            The amount of time, in seconds, that Aurora Serverless tries
     *            to find a scaling point to perform seamless scaling before
     *            enforcing the timeout action. The default is 300.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Value must be from 10 through 600.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Aurora Serverless tries to find a
     * scaling point to perform seamless scaling before enforcing the timeout
     * action. The default is 300.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Value must be from 10 through 600.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondsBeforeTimeout <p>
     *            The amount of time, in seconds, that Aurora Serverless tries
     *            to find a scaling point to perform seamless scaling before
     *            enforcing the timeout action. The default is 300.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Value must be from 10 through 600.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityRequest withSecondsBeforeTimeout(
            Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
        return this;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to
     * the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a
     * scaling point isn't found in the timeout period.
     * </p>
     *
     * @return <p>
     *         The action to take when the timeout is reached, either
     *         <code>ForceApplyCapacityChange</code> or
     *         <code>RollbackCapacityChange</code>.
     *         </p>
     *         <p>
     *         <code>ForceApplyCapacityChange</code>, the default, sets the
     *         capacity to the specified value as soon as possible.
     *         </p>
     *         <p>
     *         <code>RollbackCapacityChange</code> ignores the capacity change
     *         if a scaling point isn't found in the timeout period.
     *         </p>
     */
    public String getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to
     * the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a
     * scaling point isn't found in the timeout period.
     * </p>
     *
     * @param timeoutAction <p>
     *            The action to take when the timeout is reached, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     *            <p>
     *            <code>ForceApplyCapacityChange</code>, the default, sets the
     *            capacity to the specified value as soon as possible.
     *            </p>
     *            <p>
     *            <code>RollbackCapacityChange</code> ignores the capacity
     *            change if a scaling point isn't found in the timeout period.
     *            </p>
     */
    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The action to take when the timeout is reached, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * <code>ForceApplyCapacityChange</code>, the default, sets the capacity to
     * the specified value as soon as possible.
     * </p>
     * <p>
     * <code>RollbackCapacityChange</code> ignores the capacity change if a
     * scaling point isn't found in the timeout period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutAction <p>
     *            The action to take when the timeout is reached, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     *            <p>
     *            <code>ForceApplyCapacityChange</code>, the default, sets the
     *            capacity to the specified value as soon as possible.
     *            </p>
     *            <p>
     *            <code>RollbackCapacityChange</code> ignores the capacity
     *            change if a scaling point isn't found in the timeout period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityRequest withTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getCapacity() != null)
            sb.append("Capacity: " + getCapacity() + ",");
        if (getSecondsBeforeTimeout() != null)
            sb.append("SecondsBeforeTimeout: " + getSecondsBeforeTimeout() + ",");
        if (getTimeoutAction() != null)
            sb.append("TimeoutAction: " + getTimeoutAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getSecondsBeforeTimeout() == null) ? 0 : getSecondsBeforeTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCurrentDBClusterCapacityRequest == false)
            return false;
        ModifyCurrentDBClusterCapacityRequest other = (ModifyCurrentDBClusterCapacityRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getSecondsBeforeTimeout() == null ^ this.getSecondsBeforeTimeout() == null)
            return false;
        if (other.getSecondsBeforeTimeout() != null
                && other.getSecondsBeforeTimeout().equals(this.getSecondsBeforeTimeout()) == false)
            return false;
        if (other.getTimeoutAction() == null ^ this.getTimeoutAction() == null)
            return false;
        if (other.getTimeoutAction() != null
                && other.getTimeoutAction().equals(this.getTimeoutAction()) == false)
            return false;
        return true;
    }
}
