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
package com.amazonaws.services.application-autoscaling.model;

import java.io.Serializable;


/**
 * <p>Specifies whether the scaling activities for a scalable target are in a suspended state. </p>
 */
public class SuspendedState implements Serializable {
    /**
     * <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    private Boolean dynamicScalingInSuspended;

    /**
     * <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    private Boolean dynamicScalingOutSuspended;

    /**
     * <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     */
    private Boolean scheduledScalingSuspended;

    /**
     * <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @return <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    public Boolean isDynamicScalingInSuspended() {
        return dynamicScalingInSuspended;
    }

    /**
     * <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @return <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    public Boolean getDynamicScalingInSuspended() {
        return dynamicScalingInSuspended;
    }

    /**
     * <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @param dynamicScalingInSuspended <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    public void setDynamicScalingInSuspended(Boolean dynamicScalingInSuspended) {
        this.dynamicScalingInSuspended = dynamicScalingInSuspended;
    }

    /**
     * <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dynamicScalingInSuspended <p>Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SuspendedState withDynamicScalingInSuspended(Boolean dynamicScalingInSuspended) {
        this.dynamicScalingInSuspended = dynamicScalingInSuspended;
        return this;
    }

    /**
     * <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @return <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    public Boolean isDynamicScalingOutSuspended() {
        return dynamicScalingOutSuspended;
    }

    /**
     * <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @return <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    public Boolean getDynamicScalingOutSuspended() {
        return dynamicScalingOutSuspended;
    }

    /**
     * <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @param dynamicScalingOutSuspended <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     */
    public void setDynamicScalingOutSuspended(Boolean dynamicScalingOutSuspended) {
        this.dynamicScalingOutSuspended = dynamicScalingOutSuspended;
    }

    /**
     * <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dynamicScalingOutSuspended <p>Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is <code>false</code>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SuspendedState withDynamicScalingOutSuspended(Boolean dynamicScalingOutSuspended) {
        this.dynamicScalingOutSuspended = dynamicScalingOutSuspended;
        return this;
    }

    /**
     * <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     *
     * @return <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     */
    public Boolean isScheduledScalingSuspended() {
        return scheduledScalingSuspended;
    }

    /**
     * <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     *
     * @return <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     */
    public Boolean getScheduledScalingSuspended() {
        return scheduledScalingSuspended;
    }

    /**
     * <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     *
     * @param scheduledScalingSuspended <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     */
    public void setScheduledScalingSuspended(Boolean scheduledScalingSuspended) {
        this.scheduledScalingSuspended = scheduledScalingSuspended;
    }

    /**
     * <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledScalingSuspended <p>Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SuspendedState withScheduledScalingSuspended(Boolean scheduledScalingSuspended) {
        this.scheduledScalingSuspended = scheduledScalingSuspended;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDynamicScalingInSuspended() != null) sb.append("DynamicScalingInSuspended: " + getDynamicScalingInSuspended() + ",");
        if (getDynamicScalingOutSuspended() != null) sb.append("DynamicScalingOutSuspended: " + getDynamicScalingOutSuspended() + ",");
        if (getScheduledScalingSuspended() != null) sb.append("ScheduledScalingSuspended: " + getScheduledScalingSuspended());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicScalingInSuspended() == null) ? 0 : getDynamicScalingInSuspended().hashCode());
        hashCode = prime * hashCode + ((getDynamicScalingOutSuspended() == null) ? 0 : getDynamicScalingOutSuspended().hashCode());
        hashCode = prime * hashCode + ((getScheduledScalingSuspended() == null) ? 0 : getScheduledScalingSuspended().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuspendedState == false) return false;
        SuspendedState other = (SuspendedState)obj;

        if (other.getDynamicScalingInSuspended() == null ^ this.getDynamicScalingInSuspended() == null) return false;
        if (other.getDynamicScalingInSuspended() != null && other.getDynamicScalingInSuspended().equals(this.getDynamicScalingInSuspended()) == false) return false;
        if (other.getDynamicScalingOutSuspended() == null ^ this.getDynamicScalingOutSuspended() == null) return false;
        if (other.getDynamicScalingOutSuspended() != null && other.getDynamicScalingOutSuspended().equals(this.getDynamicScalingOutSuspended()) == false) return false;
        if (other.getScheduledScalingSuspended() == null ^ this.getScheduledScalingSuspended() == null) return false;
        if (other.getScheduledScalingSuspended() != null && other.getScheduledScalingSuspended().equals(this.getScheduledScalingSuspended()) == false) return false;
        return true;
    }
}
