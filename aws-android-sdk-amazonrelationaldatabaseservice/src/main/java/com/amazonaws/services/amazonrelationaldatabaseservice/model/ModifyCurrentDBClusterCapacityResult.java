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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

public class ModifyCurrentDBClusterCapacityResult implements Serializable {
    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key
     * that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     */
    private Integer pendingCapacity;

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     */
    private Integer currentCapacity;

    /**
     * <p>
     * The number of seconds before a call to
     * <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     */
    private Integer secondsBeforeTimeout;

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     */
    private String timeoutAction;

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key
     * that identifies a DB cluster.
     * </p>
     *
     * @return <p>
     *         A user-supplied DB cluster identifier. This identifier is the
     *         unique key that identifies a DB cluster.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key
     * that identifies a DB cluster.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            A user-supplied DB cluster identifier. This identifier is the
     *            unique key that identifies a DB cluster.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * A user-supplied DB cluster identifier. This identifier is the unique key
     * that identifies a DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            A user-supplied DB cluster identifier. This identifier is the
     *            unique key that identifies a DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityResult withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     *
     * @return <p>
     *         A value that specifies the capacity that the DB cluster scales to
     *         next.
     *         </p>
     */
    public Integer getPendingCapacity() {
        return pendingCapacity;
    }

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     *
     * @param pendingCapacity <p>
     *            A value that specifies the capacity that the DB cluster scales
     *            to next.
     *            </p>
     */
    public void setPendingCapacity(Integer pendingCapacity) {
        this.pendingCapacity = pendingCapacity;
    }

    /**
     * <p>
     * A value that specifies the capacity that the DB cluster scales to next.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingCapacity <p>
     *            A value that specifies the capacity that the DB cluster scales
     *            to next.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityResult withPendingCapacity(Integer pendingCapacity) {
        this.pendingCapacity = pendingCapacity;
        return this;
    }

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     *
     * @return <p>
     *         The current capacity of the DB cluster.
     *         </p>
     */
    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     *
     * @param currentCapacity <p>
     *            The current capacity of the DB cluster.
     *            </p>
     */
    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    /**
     * <p>
     * The current capacity of the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentCapacity <p>
     *            The current capacity of the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityResult withCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this;
    }

    /**
     * <p>
     * The number of seconds before a call to
     * <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     *
     * @return <p>
     *         The number of seconds before a call to
     *         <code>ModifyCurrentDBClusterCapacity</code> times out.
     *         </p>
     */
    public Integer getSecondsBeforeTimeout() {
        return secondsBeforeTimeout;
    }

    /**
     * <p>
     * The number of seconds before a call to
     * <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     *
     * @param secondsBeforeTimeout <p>
     *            The number of seconds before a call to
     *            <code>ModifyCurrentDBClusterCapacity</code> times out.
     *            </p>
     */
    public void setSecondsBeforeTimeout(Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
    }

    /**
     * <p>
     * The number of seconds before a call to
     * <code>ModifyCurrentDBClusterCapacity</code> times out.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondsBeforeTimeout <p>
     *            The number of seconds before a call to
     *            <code>ModifyCurrentDBClusterCapacity</code> times out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityResult withSecondsBeforeTimeout(
            Integer secondsBeforeTimeout) {
        this.secondsBeforeTimeout = secondsBeforeTimeout;
        return this;
    }

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     *
     * @return <p>
     *         The timeout action of a call to
     *         <code>ModifyCurrentDBClusterCapacity</code>, either
     *         <code>ForceApplyCapacityChange</code> or
     *         <code>RollbackCapacityChange</code>.
     *         </p>
     */
    public String getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     *
     * @param timeoutAction <p>
     *            The timeout action of a call to
     *            <code>ModifyCurrentDBClusterCapacity</code>, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     */
    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutAction <p>
     *            The timeout action of a call to
     *            <code>ModifyCurrentDBClusterCapacity</code>, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCurrentDBClusterCapacityResult withTimeoutAction(String timeoutAction) {
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
        if (getPendingCapacity() != null)
            sb.append("PendingCapacity: " + getPendingCapacity() + ",");
        if (getCurrentCapacity() != null)
            sb.append("CurrentCapacity: " + getCurrentCapacity() + ",");
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
        hashCode = prime * hashCode
                + ((getPendingCapacity() == null) ? 0 : getPendingCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentCapacity() == null) ? 0 : getCurrentCapacity().hashCode());
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

        if (obj instanceof ModifyCurrentDBClusterCapacityResult == false)
            return false;
        ModifyCurrentDBClusterCapacityResult other = (ModifyCurrentDBClusterCapacityResult) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getPendingCapacity() == null ^ this.getPendingCapacity() == null)
            return false;
        if (other.getPendingCapacity() != null
                && other.getPendingCapacity().equals(this.getPendingCapacity()) == false)
            return false;
        if (other.getCurrentCapacity() == null ^ this.getCurrentCapacity() == null)
            return false;
        if (other.getCurrentCapacity() != null
                && other.getCurrentCapacity().equals(this.getCurrentCapacity()) == false)
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
