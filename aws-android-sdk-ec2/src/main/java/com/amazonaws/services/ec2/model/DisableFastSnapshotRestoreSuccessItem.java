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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes fast snapshot restores that were successfully disabled.
 * </p>
 */
public class DisableFastSnapshotRestoreSuccessItem implements Serializable {
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The state of fast snapshot restores for the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, optimizing, enabled, disabling, disabled
     */
    private String state;

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned
     * to <code>enabling</code> or <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The
     * state successfully transitioned to <code>optimizing</code>,
     * <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String stateTransitionReason;

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     */
    private String ownerAlias;

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>enabling</code> state.
     * </p>
     */
    private java.util.Date enablingTime;

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>optimizing</code> state.
     * </p>
     */
    private java.util.Date optimizingTime;

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code>
     * state.
     * </p>
     */
    private java.util.Date enabledTime;

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabling</code> state.
     * </p>
     */
    private java.util.Date disablingTime;

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabled</code> state.
     * </p>
     */
    private java.util.Date disabledTime;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @return <p>
     *         The Availability Zone.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The state of fast snapshot restores for the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, optimizing, enabled, disabling, disabled
     *
     * @return <p>
     *         The state of fast snapshot restores for the snapshot.
     *         </p>
     * @see FastSnapshotRestoreStateCode
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of fast snapshot restores for the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, optimizing, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of fast snapshot restores for the snapshot.
     *            </p>
     * @see FastSnapshotRestoreStateCode
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of fast snapshot restores for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, optimizing, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of fast snapshot restores for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FastSnapshotRestoreStateCode
     */
    public DisableFastSnapshotRestoreSuccessItem withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of fast snapshot restores for the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, optimizing, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of fast snapshot restores for the snapshot.
     *            </p>
     * @see FastSnapshotRestoreStateCode
     */
    public void setState(FastSnapshotRestoreStateCode state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of fast snapshot restores for the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, optimizing, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of fast snapshot restores for the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FastSnapshotRestoreStateCode
     */
    public DisableFastSnapshotRestoreSuccessItem withState(FastSnapshotRestoreStateCode state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned
     * to <code>enabling</code> or <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The
     * state successfully transitioned to <code>optimizing</code>,
     * <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The reason for the state transition. The possible values are as
     *         follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiated</code> - The state successfully
     *         transitioned to <code>enabling</code> or <code>disabling</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiated - Lifecycle state transition</code> -
     *         The state successfully transitioned to <code>optimizing</code>,
     *         <code>enabled</code>, or <code>disabled</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStateTransitionReason() {
        return stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned
     * to <code>enabling</code> or <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The
     * state successfully transitioned to <code>optimizing</code>,
     * <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param stateTransitionReason <p>
     *            The reason for the state transition. The possible values are
     *            as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiated</code> - The state successfully
     *            transitioned to <code>enabling</code> or
     *            <code>disabling</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiated - Lifecycle state transition</code>
     *            - The state successfully transitioned to
     *            <code>optimizing</code>, <code>enabled</code>, or
     *            <code>disabled</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned
     * to <code>enabling</code> or <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The
     * state successfully transitioned to <code>optimizing</code>,
     * <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateTransitionReason <p>
     *            The reason for the state transition. The possible values are
     *            as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiated</code> - The state successfully
     *            transitioned to <code>enabling</code> or
     *            <code>disabling</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiated - Lifecycle state transition</code>
     *            - The state successfully transitioned to
     *            <code>optimizing</code>, <code>enabled</code>, or
     *            <code>disabled</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withStateTransitionReason(
            String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the snapshot.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the snapshot.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     *
     * @return <p>
     *         The alias of the snapshot owner.
     *         </p>
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     *
     * @param ownerAlias <p>
     *            The alias of the snapshot owner.
     *            </p>
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAlias <p>
     *            The alias of the snapshot owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>enabling</code> state.
     * </p>
     *
     * @return <p>
     *         The time at which fast snapshot restores entered the
     *         <code>enabling</code> state.
     *         </p>
     */
    public java.util.Date getEnablingTime() {
        return enablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>enabling</code> state.
     * </p>
     *
     * @param enablingTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>enabling</code> state.
     *            </p>
     */
    public void setEnablingTime(java.util.Date enablingTime) {
        this.enablingTime = enablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>enabling</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablingTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>enabling</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withEnablingTime(java.util.Date enablingTime) {
        this.enablingTime = enablingTime;
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>optimizing</code> state.
     * </p>
     *
     * @return <p>
     *         The time at which fast snapshot restores entered the
     *         <code>optimizing</code> state.
     *         </p>
     */
    public java.util.Date getOptimizingTime() {
        return optimizingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>optimizing</code> state.
     * </p>
     *
     * @param optimizingTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>optimizing</code> state.
     *            </p>
     */
    public void setOptimizingTime(java.util.Date optimizingTime) {
        this.optimizingTime = optimizingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>optimizing</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optimizingTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>optimizing</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withOptimizingTime(java.util.Date optimizingTime) {
        this.optimizingTime = optimizingTime;
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code>
     * state.
     * </p>
     *
     * @return <p>
     *         The time at which fast snapshot restores entered the
     *         <code>enabled</code> state.
     *         </p>
     */
    public java.util.Date getEnabledTime() {
        return enabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code>
     * state.
     * </p>
     *
     * @param enabledTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>enabled</code> state.
     *            </p>
     */
    public void setEnabledTime(java.util.Date enabledTime) {
        this.enabledTime = enabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code>
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>enabled</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withEnabledTime(java.util.Date enabledTime) {
        this.enabledTime = enabledTime;
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabling</code> state.
     * </p>
     *
     * @return <p>
     *         The time at which fast snapshot restores entered the
     *         <code>disabling</code> state.
     *         </p>
     */
    public java.util.Date getDisablingTime() {
        return disablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabling</code> state.
     * </p>
     *
     * @param disablingTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>disabling</code> state.
     *            </p>
     */
    public void setDisablingTime(java.util.Date disablingTime) {
        this.disablingTime = disablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabling</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disablingTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>disabling</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withDisablingTime(java.util.Date disablingTime) {
        this.disablingTime = disablingTime;
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabled</code> state.
     * </p>
     *
     * @return <p>
     *         The time at which fast snapshot restores entered the
     *         <code>disabled</code> state.
     *         </p>
     */
    public java.util.Date getDisabledTime() {
        return disabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabled</code> state.
     * </p>
     *
     * @param disabledTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>disabled</code> state.
     *            </p>
     */
    public void setDisabledTime(java.util.Date disabledTime) {
        this.disabledTime = disabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the
     * <code>disabled</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabledTime <p>
     *            The time at which fast snapshot restores entered the
     *            <code>disabled</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoreSuccessItem withDisabledTime(java.util.Date disabledTime) {
        this.disabledTime = disabledTime;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: " + getStateTransitionReason() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: " + getOwnerAlias() + ",");
        if (getEnablingTime() != null)
            sb.append("EnablingTime: " + getEnablingTime() + ",");
        if (getOptimizingTime() != null)
            sb.append("OptimizingTime: " + getOptimizingTime() + ",");
        if (getEnabledTime() != null)
            sb.append("EnabledTime: " + getEnabledTime() + ",");
        if (getDisablingTime() != null)
            sb.append("DisablingTime: " + getDisablingTime() + ",");
        if (getDisabledTime() != null)
            sb.append("DisabledTime: " + getDisabledTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode
                + ((getEnablingTime() == null) ? 0 : getEnablingTime().hashCode());
        hashCode = prime * hashCode
                + ((getOptimizingTime() == null) ? 0 : getOptimizingTime().hashCode());
        hashCode = prime * hashCode
                + ((getEnabledTime() == null) ? 0 : getEnabledTime().hashCode());
        hashCode = prime * hashCode
                + ((getDisablingTime() == null) ? 0 : getDisablingTime().hashCode());
        hashCode = prime * hashCode
                + ((getDisabledTime() == null) ? 0 : getDisabledTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastSnapshotRestoreSuccessItem == false)
            return false;
        DisableFastSnapshotRestoreSuccessItem other = (DisableFastSnapshotRestoreSuccessItem) obj;

        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null
                && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null
                && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getEnablingTime() == null ^ this.getEnablingTime() == null)
            return false;
        if (other.getEnablingTime() != null
                && other.getEnablingTime().equals(this.getEnablingTime()) == false)
            return false;
        if (other.getOptimizingTime() == null ^ this.getOptimizingTime() == null)
            return false;
        if (other.getOptimizingTime() != null
                && other.getOptimizingTime().equals(this.getOptimizingTime()) == false)
            return false;
        if (other.getEnabledTime() == null ^ this.getEnabledTime() == null)
            return false;
        if (other.getEnabledTime() != null
                && other.getEnabledTime().equals(this.getEnabledTime()) == false)
            return false;
        if (other.getDisablingTime() == null ^ this.getDisablingTime() == null)
            return false;
        if (other.getDisablingTime() != null
                && other.getDisablingTime().equals(this.getDisablingTime()) == false)
            return false;
        if (other.getDisabledTime() == null ^ this.getDisabledTime() == null)
            return false;
        if (other.getDisabledTime() != null
                && other.getDisabledTime().equals(this.getDisabledTime()) == false)
            return false;
        return true;
    }
}
