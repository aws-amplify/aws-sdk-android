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
 * Describes a scheduled event for an instance.
 * </p>
 */
public class InstanceStatusEvent implements Serializable {
    /**
     * <p>
     * The ID of the event.
     * </p>
     */
    private String instanceEventId;

    /**
     * <p>
     * The event code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot,
     * system-maintenance, instance-retirement, instance-stop
     */
    private String code;

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to
     * a week. If the event has been completed, this description starts with the
     * following text: [Completed].
     * </p>
     */
    private String description;

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * The deadline for starting the event.
     * </p>
     */
    private java.util.Date notBeforeDeadline;

    /**
     * <p>
     * The ID of the event.
     * </p>
     *
     * @return <p>
     *         The ID of the event.
     *         </p>
     */
    public String getInstanceEventId() {
        return instanceEventId;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     *
     * @param instanceEventId <p>
     *            The ID of the event.
     *            </p>
     */
    public void setInstanceEventId(String instanceEventId) {
        this.instanceEventId = instanceEventId;
    }

    /**
     * <p>
     * The ID of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceEventId <p>
     *            The ID of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatusEvent withInstanceEventId(String instanceEventId) {
        this.instanceEventId = instanceEventId;
        return this;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot,
     * system-maintenance, instance-retirement, instance-stop
     *
     * @return <p>
     *         The event code.
     *         </p>
     * @see EventCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot,
     * system-maintenance, instance-retirement, instance-stop
     *
     * @param code <p>
     *            The event code.
     *            </p>
     * @see EventCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot,
     * system-maintenance, instance-retirement, instance-stop
     *
     * @param code <p>
     *            The event code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventCode
     */
    public InstanceStatusEvent withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot,
     * system-maintenance, instance-retirement, instance-stop
     *
     * @param code <p>
     *            The event code.
     *            </p>
     * @see EventCode
     */
    public void setCode(EventCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The event code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instance-reboot, system-reboot,
     * system-maintenance, instance-retirement, instance-stop
     *
     * @param code <p>
     *            The event code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventCode
     */
    public InstanceStatusEvent withCode(EventCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to
     * a week. If the event has been completed, this description starts with the
     * following text: [Completed].
     * </p>
     *
     * @return <p>
     *         A description of the event.
     *         </p>
     *         <p>
     *         After a scheduled event is completed, it can still be described
     *         for up to a week. If the event has been completed, this
     *         description starts with the following text: [Completed].
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to
     * a week. If the event has been completed, this description starts with the
     * following text: [Completed].
     * </p>
     *
     * @param description <p>
     *            A description of the event.
     *            </p>
     *            <p>
     *            After a scheduled event is completed, it can still be
     *            described for up to a week. If the event has been completed,
     *            this description starts with the following text: [Completed].
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to
     * a week. If the event has been completed, this description starts with the
     * following text: [Completed].
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the event.
     *            </p>
     *            <p>
     *            After a scheduled event is completed, it can still be
     *            described for up to a week. If the event has been completed,
     *            this description starts with the following text: [Completed].
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatusEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     *
     * @return <p>
     *         The latest scheduled end time for the event.
     *         </p>
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     *
     * @param notAfter <p>
     *            The latest scheduled end time for the event.
     *            </p>
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notAfter <p>
     *            The latest scheduled end time for the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatusEvent withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     *
     * @return <p>
     *         The earliest scheduled start time for the event.
     *         </p>
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     *
     * @param notBefore <p>
     *            The earliest scheduled start time for the event.
     *            </p>
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notBefore <p>
     *            The earliest scheduled start time for the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatusEvent withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * <p>
     * The deadline for starting the event.
     * </p>
     *
     * @return <p>
     *         The deadline for starting the event.
     *         </p>
     */
    public java.util.Date getNotBeforeDeadline() {
        return notBeforeDeadline;
    }

    /**
     * <p>
     * The deadline for starting the event.
     * </p>
     *
     * @param notBeforeDeadline <p>
     *            The deadline for starting the event.
     *            </p>
     */
    public void setNotBeforeDeadline(java.util.Date notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
    }

    /**
     * <p>
     * The deadline for starting the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notBeforeDeadline <p>
     *            The deadline for starting the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatusEvent withNotBeforeDeadline(java.util.Date notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
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
        if (getInstanceEventId() != null)
            sb.append("InstanceEventId: " + getInstanceEventId() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getNotAfter() != null)
            sb.append("NotAfter: " + getNotAfter() + ",");
        if (getNotBefore() != null)
            sb.append("NotBefore: " + getNotBefore() + ",");
        if (getNotBeforeDeadline() != null)
            sb.append("NotBeforeDeadline: " + getNotBeforeDeadline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceEventId() == null) ? 0 : getInstanceEventId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode
                + ((getNotBeforeDeadline() == null) ? 0 : getNotBeforeDeadline().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStatusEvent == false)
            return false;
        InstanceStatusEvent other = (InstanceStatusEvent) obj;

        if (other.getInstanceEventId() == null ^ this.getInstanceEventId() == null)
            return false;
        if (other.getInstanceEventId() != null
                && other.getInstanceEventId().equals(this.getInstanceEventId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null
                && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotBeforeDeadline() == null ^ this.getNotBeforeDeadline() == null)
            return false;
        if (other.getNotBeforeDeadline() != null
                && other.getNotBeforeDeadline().equals(this.getNotBeforeDeadline()) == false)
            return false;
        return true;
    }
}
