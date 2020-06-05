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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * CPU utilization metrics for an instance.
 * </p>
 */
public class CPUUtilization implements Serializable {
    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state
     * over the last 10 seconds.
     * </p>
     */
    private Double user;

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state
     * over the last 10 seconds.
     * </p>
     */
    private Double nice;

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code>
     * state over the last 10 seconds.
     * </p>
     */
    private Double system;

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state
     * over the last 10 seconds.
     * </p>
     */
    private Double idle;

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code>
     * state over the last 10 seconds.
     * </p>
     */
    private Double iOWait;

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state
     * over the last 10 seconds.
     * </p>
     */
    private Double iRQ;

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code>
     * state over the last 10 seconds.
     * </p>
     */
    private Double softIRQ;

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code>
     * state over the last 10 seconds.
     * </p>
     */
    private Double privileged;

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>User</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getUser() {
        return user;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @param user <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>User</code> state over the last 10 seconds.
     *            </p>
     */
    public void setUser(Double user) {
        this.user = user;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state
     * over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>User</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withUser(Double user) {
        this.user = user;
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Available on Linux environments only.
     *         </p>
     *         <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>Nice</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getNice() {
        return nice;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @param nice <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>Nice</code> state over the last 10 seconds.
     *            </p>
     */
    public void setNice(Double nice) {
        this.nice = nice;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state
     * over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nice <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>Nice</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withNice(Double nice) {
        this.nice = nice;
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Available on Linux environments only.
     *         </p>
     *         <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>System</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getSystem() {
        return system;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @param system <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>System</code> state over the last 10 seconds.
     *            </p>
     */
    public void setSystem(Double system) {
        this.system = system;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code>
     * state over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param system <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>System</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withSystem(Double system) {
        this.system = system;
        return this;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>Idle</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getIdle() {
        return idle;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @param idle <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>Idle</code> state over the last 10 seconds.
     *            </p>
     */
    public void setIdle(Double idle) {
        this.idle = idle;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state
     * over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idle <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>Idle</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withIdle(Double idle) {
        this.idle = idle;
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Available on Linux environments only.
     *         </p>
     *         <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>I/O Wait</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getIOWait() {
        return iOWait;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @param iOWait <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>I/O Wait</code> state over the last 10 seconds.
     *            </p>
     */
    public void setIOWait(Double iOWait) {
        this.iOWait = iOWait;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code>
     * state over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iOWait <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>I/O Wait</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withIOWait(Double iOWait) {
        this.iOWait = iOWait;
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Available on Linux environments only.
     *         </p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>IRQ</code>
     *         state over the last 10 seconds.
     *         </p>
     */
    public Double getIRQ() {
        return iRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state
     * over the last 10 seconds.
     * </p>
     *
     * @param iRQ <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>IRQ</code> state over the last 10 seconds.
     *            </p>
     */
    public void setIRQ(Double iRQ) {
        this.iRQ = iRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state
     * over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iRQ <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>IRQ</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withIRQ(Double iRQ) {
        this.iRQ = iRQ;
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Available on Linux environments only.
     *         </p>
     *         <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>SoftIRQ</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getSoftIRQ() {
        return softIRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @param softIRQ <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>SoftIRQ</code> state over the last 10 seconds.
     *            </p>
     */
    public void setSoftIRQ(Double softIRQ) {
        this.softIRQ = softIRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code>
     * state over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softIRQ <p>
     *            Available on Linux environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>SoftIRQ</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withSoftIRQ(Double softIRQ) {
        this.softIRQ = softIRQ;
        return this;
    }

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Available on Windows environments only.
     *         </p>
     *         <p>
     *         Percentage of time that the CPU has spent in the
     *         <code>Privileged</code> state over the last 10 seconds.
     *         </p>
     */
    public Double getPrivileged() {
        return privileged;
    }

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code>
     * state over the last 10 seconds.
     * </p>
     *
     * @param privileged <p>
     *            Available on Windows environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>Privileged</code> state over the last 10 seconds.
     *            </p>
     */
    public void setPrivileged(Double privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code>
     * state over the last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privileged <p>
     *            Available on Windows environments only.
     *            </p>
     *            <p>
     *            Percentage of time that the CPU has spent in the
     *            <code>Privileged</code> state over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CPUUtilization withPrivileged(Double privileged) {
        this.privileged = privileged;
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
        if (getUser() != null)
            sb.append("User: " + getUser() + ",");
        if (getNice() != null)
            sb.append("Nice: " + getNice() + ",");
        if (getSystem() != null)
            sb.append("System: " + getSystem() + ",");
        if (getIdle() != null)
            sb.append("Idle: " + getIdle() + ",");
        if (getIOWait() != null)
            sb.append("IOWait: " + getIOWait() + ",");
        if (getIRQ() != null)
            sb.append("IRQ: " + getIRQ() + ",");
        if (getSoftIRQ() != null)
            sb.append("SoftIRQ: " + getSoftIRQ() + ",");
        if (getPrivileged() != null)
            sb.append("Privileged: " + getPrivileged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getNice() == null) ? 0 : getNice().hashCode());
        hashCode = prime * hashCode + ((getSystem() == null) ? 0 : getSystem().hashCode());
        hashCode = prime * hashCode + ((getIdle() == null) ? 0 : getIdle().hashCode());
        hashCode = prime * hashCode + ((getIOWait() == null) ? 0 : getIOWait().hashCode());
        hashCode = prime * hashCode + ((getIRQ() == null) ? 0 : getIRQ().hashCode());
        hashCode = prime * hashCode + ((getSoftIRQ() == null) ? 0 : getSoftIRQ().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CPUUtilization == false)
            return false;
        CPUUtilization other = (CPUUtilization) obj;

        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getNice() == null ^ this.getNice() == null)
            return false;
        if (other.getNice() != null && other.getNice().equals(this.getNice()) == false)
            return false;
        if (other.getSystem() == null ^ this.getSystem() == null)
            return false;
        if (other.getSystem() != null && other.getSystem().equals(this.getSystem()) == false)
            return false;
        if (other.getIdle() == null ^ this.getIdle() == null)
            return false;
        if (other.getIdle() != null && other.getIdle().equals(this.getIdle()) == false)
            return false;
        if (other.getIOWait() == null ^ this.getIOWait() == null)
            return false;
        if (other.getIOWait() != null && other.getIOWait().equals(this.getIOWait()) == false)
            return false;
        if (other.getIRQ() == null ^ this.getIRQ() == null)
            return false;
        if (other.getIRQ() != null && other.getIRQ().equals(this.getIRQ()) == false)
            return false;
        if (other.getSoftIRQ() == null ^ this.getSoftIRQ() == null)
            return false;
        if (other.getSoftIRQ() != null && other.getSoftIRQ().equals(this.getSoftIRQ()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null
                && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        return true;
    }
}
