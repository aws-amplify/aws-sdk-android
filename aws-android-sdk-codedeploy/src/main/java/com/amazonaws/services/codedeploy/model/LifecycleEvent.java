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
 * Information about a deployment lifecycle event.
 * </p>
 */
public class LifecycleEvent implements Serializable {
    /**
     * <p>
     * The deployment lifecycle event name, such as <code>ApplicationStop</code>, <code>BeforeInstall</code>, <code>AfterInstall</code>,
     * <code>ApplicationStart</code>, or <code>ValidateService</code>.
     * </p>
     */
    private String lifecycleEventName;

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     */
    private Diagnostics diagnostics;

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     */
    private String status;

    /**
     * <p>
     * The deployment lifecycle event name, such as <code>ApplicationStop</code>, <code>BeforeInstall</code>, <code>AfterInstall</code>,
     * <code>ApplicationStart</code>, or <code>ValidateService</code>.
     * </p>
     *
     * @return <p>
     *         The deployment lifecycle event name, such as
     *         <code>ApplicationStop</code>, <code>BeforeInstall</code>,
     *         <code>AfterInstall</code>, <code>ApplicationStart</code>, or
     *         <code>ValidateService</code>.
     *         </p>
     */
    public String getLifecycleEventName() {
        return lifecycleEventName;
    }

    /**
     * <p>
     * The deployment lifecycle event name, such as <code>ApplicationStop</code>, <code>BeforeInstall</code>, <code>AfterInstall</code>,
     * <code>ApplicationStart</code>, or <code>ValidateService</code>.
     * </p>
     *
     * @param lifecycleEventName <p>
     *            The deployment lifecycle event name, such as
     *            <code>ApplicationStop</code>, <code>BeforeInstall</code>,
     *            <code>AfterInstall</code>, <code>ApplicationStart</code>, or
     *            <code>ValidateService</code>.
     *            </p>
     */
    public void setLifecycleEventName(String lifecycleEventName) {
        this.lifecycleEventName = lifecycleEventName;
    }

    /**
     * <p>
     * The deployment lifecycle event name, such as <code>ApplicationStop</code>, <code>BeforeInstall</code>, <code>AfterInstall</code>,
     * <code>ApplicationStart</code>, or <code>ValidateService</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEventName <p>
     *            The deployment lifecycle event name, such as
     *            <code>ApplicationStop</code>, <code>BeforeInstall</code>,
     *            <code>AfterInstall</code>, <code>ApplicationStart</code>, or
     *            <code>ValidateService</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleEvent withLifecycleEventName(String lifecycleEventName) {
        this.lifecycleEventName = lifecycleEventName;
        return this;
    }

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     *
     * @return <p>
     *         Diagnostic information about the deployment lifecycle event.
     *         </p>
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     *
     * @param diagnostics <p>
     *            Diagnostic information about the deployment lifecycle event.
     *            </p>
     */
    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * <p>
     * Diagnostic information about the deployment lifecycle event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diagnostics <p>
     *            Diagnostic information about the deployment lifecycle event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleEvent withDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the deployment lifecycle event
     *         started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that indicates when the deployment lifecycle event
     *            started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that indicates when the deployment lifecycle event
     *            started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleEvent withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the deployment lifecycle event
     *         ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     *
     * @param endTime <p>
     *            A timestamp that indicates when the deployment lifecycle event
     *            ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment lifecycle event ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A timestamp that indicates when the deployment lifecycle event
     *            ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleEvent withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @return <p>
     *         The deployment lifecycle event status:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The deployment lifecycle event is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InProgress: The deployment lifecycle event is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The deployment lifecycle event ran successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The deployment lifecycle event has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Skipped: The deployment lifecycle event has been skipped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unknown: The deployment lifecycle event is unknown.
     *         </p>
     *         </li>
     *         </ul>
     * @see LifecycleEventStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The deployment lifecycle event status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The deployment lifecycle event is pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InProgress: The deployment lifecycle event is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Succeeded: The deployment lifecycle event ran successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The deployment lifecycle event has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Skipped: The deployment lifecycle event has been skipped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unknown: The deployment lifecycle event is unknown.
     *            </p>
     *            </li>
     *            </ul>
     * @see LifecycleEventStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The deployment lifecycle event status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The deployment lifecycle event is pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InProgress: The deployment lifecycle event is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Succeeded: The deployment lifecycle event ran successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The deployment lifecycle event has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Skipped: The deployment lifecycle event has been skipped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unknown: The deployment lifecycle event is unknown.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifecycleEventStatus
     */
    public LifecycleEvent withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The deployment lifecycle event status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The deployment lifecycle event is pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InProgress: The deployment lifecycle event is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Succeeded: The deployment lifecycle event ran successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The deployment lifecycle event has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Skipped: The deployment lifecycle event has been skipped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unknown: The deployment lifecycle event is unknown.
     *            </p>
     *            </li>
     *            </ul>
     * @see LifecycleEventStatus
     */
    public void setStatus(LifecycleEventStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The deployment lifecycle event status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment lifecycle event is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * InProgress: The deployment lifecycle event is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment lifecycle event ran successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment lifecycle event has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment lifecycle event has been skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment lifecycle event is unknown.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped,
     * Unknown
     *
     * @param status <p>
     *            The deployment lifecycle event status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The deployment lifecycle event is pending.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InProgress: The deployment lifecycle event is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Succeeded: The deployment lifecycle event ran successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The deployment lifecycle event has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Skipped: The deployment lifecycle event has been skipped.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unknown: The deployment lifecycle event is unknown.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifecycleEventStatus
     */
    public LifecycleEvent withStatus(LifecycleEventStatus status) {
        this.status = status.toString();
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
        if (getLifecycleEventName() != null)
            sb.append("lifecycleEventName: " + getLifecycleEventName() + ",");
        if (getDiagnostics() != null)
            sb.append("diagnostics: " + getDiagnostics() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLifecycleEventName() == null) ? 0 : getLifecycleEventName().hashCode());
        hashCode = prime * hashCode
                + ((getDiagnostics() == null) ? 0 : getDiagnostics().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleEvent == false)
            return false;
        LifecycleEvent other = (LifecycleEvent) obj;

        if (other.getLifecycleEventName() == null ^ this.getLifecycleEventName() == null)
            return false;
        if (other.getLifecycleEventName() != null
                && other.getLifecycleEventName().equals(this.getLifecycleEventName()) == false)
            return false;
        if (other.getDiagnostics() == null ^ this.getDiagnostics() == null)
            return false;
        if (other.getDiagnostics() != null
                && other.getDiagnostics().equals(this.getDiagnostics()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
