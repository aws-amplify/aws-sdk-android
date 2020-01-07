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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a scheduled audit.
 * </p>
 */
public class DeleteScheduledAuditRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the scheduled audit you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String scheduledAuditName;

    /**
     * <p>
     * The name of the scheduled audit you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The name of the scheduled audit you want to delete.
     *         </p>
     */
    public String getScheduledAuditName() {
        return scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param scheduledAuditName <p>
     *            The name of the scheduled audit you want to delete.
     *            </p>
     */
    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param scheduledAuditName <p>
     *            The name of the scheduled audit you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteScheduledAuditRequest withScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
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
        if (getScheduledAuditName() != null)
            sb.append("scheduledAuditName: " + getScheduledAuditName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteScheduledAuditRequest == false)
            return false;
        DeleteScheduledAuditRequest other = (DeleteScheduledAuditRequest) obj;

        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null
                && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        return true;
    }
}
