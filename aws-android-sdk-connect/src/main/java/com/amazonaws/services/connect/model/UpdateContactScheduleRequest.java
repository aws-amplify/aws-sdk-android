/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the scheduled time of a task contact that is already scheduled.
 * </p>
 */
public class UpdateContactScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound contact flow. The scheduled time cannot be in the past. It
     * must be within up to 6 days in future.
     * </p>
     */
    private java.util.Date scheduledTime;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactScheduleRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactScheduleRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound contact flow. The scheduled time cannot be in the past. It
     * must be within up to 6 days in future.
     * </p>
     *
     * @return <p>
     *         The timestamp, in Unix Epoch seconds format, at which to start
     *         running the inbound contact flow. The scheduled time cannot be in
     *         the past. It must be within up to 6 days in future.
     *         </p>
     */
    public java.util.Date getScheduledTime() {
        return scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound contact flow. The scheduled time cannot be in the past. It
     * must be within up to 6 days in future.
     * </p>
     *
     * @param scheduledTime <p>
     *            The timestamp, in Unix Epoch seconds format, at which to start
     *            running the inbound contact flow. The scheduled time cannot be
     *            in the past. It must be within up to 6 days in future.
     *            </p>
     */
    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound contact flow. The scheduled time cannot be in the past. It
     * must be within up to 6 days in future.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledTime <p>
     *            The timestamp, in Unix Epoch seconds format, at which to start
     *            running the inbound contact flow. The scheduled time cannot be
     *            in the past. It must be within up to 6 days in future.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactScheduleRequest withScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: " + getScheduledTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactScheduleRequest == false)
            return false;
        UpdateContactScheduleRequest other = (UpdateContactScheduleRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null
                && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
        return true;
    }
}
