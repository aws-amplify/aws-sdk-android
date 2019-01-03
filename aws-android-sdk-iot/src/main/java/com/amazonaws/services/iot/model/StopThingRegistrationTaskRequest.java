/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Cancels a bulk thing provisioning task.
 * </p>
 */
public class StopThingRegistrationTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The bulk thing provisioning task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     */
    private String taskId;

    /**
     * <p>
     * The bulk thing provisioning task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @return <p>
     *         The bulk thing provisioning task ID.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The bulk thing provisioning task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @param taskId <p>
     *            The bulk thing provisioning task ID.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The bulk thing provisioning task ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @param taskId <p>
     *            The bulk thing provisioning task ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopThingRegistrationTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopThingRegistrationTaskRequest == false)
            return false;
        StopThingRegistrationTaskRequest other = (StopThingRegistrationTaskRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }
}
