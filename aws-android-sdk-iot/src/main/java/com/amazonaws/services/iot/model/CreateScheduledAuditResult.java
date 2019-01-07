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

public class CreateScheduledAuditResult implements Serializable {
    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     */
    private String scheduledAuditArn;

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     *
     * @return <p>
     *         The ARN of the scheduled audit.
     *         </p>
     */
    public String getScheduledAuditArn() {
        return scheduledAuditArn;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     *
     * @param scheduledAuditArn <p>
     *            The ARN of the scheduled audit.
     *            </p>
     */
    public void setScheduledAuditArn(String scheduledAuditArn) {
        this.scheduledAuditArn = scheduledAuditArn;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledAuditArn <p>
     *            The ARN of the scheduled audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateScheduledAuditResult withScheduledAuditArn(String scheduledAuditArn) {
        this.scheduledAuditArn = scheduledAuditArn;
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
        if (getScheduledAuditArn() != null)
            sb.append("scheduledAuditArn: " + getScheduledAuditArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduledAuditArn() == null) ? 0 : getScheduledAuditArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScheduledAuditResult == false)
            return false;
        CreateScheduledAuditResult other = (CreateScheduledAuditResult) obj;

        if (other.getScheduledAuditArn() == null ^ this.getScheduledAuditArn() == null)
            return false;
        if (other.getScheduledAuditArn() != null
                && other.getScheduledAuditArn().equals(this.getScheduledAuditArn()) == false)
            return false;
        return true;
    }
}
