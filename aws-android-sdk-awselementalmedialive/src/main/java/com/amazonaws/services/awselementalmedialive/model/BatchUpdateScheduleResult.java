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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for BatchUpdateScheduleResponse
 */
public class BatchUpdateScheduleResult implements Serializable {
    /**
     * Schedule actions created in the schedule.
     */
    private BatchScheduleActionCreateResult creates;

    /**
     * Schedule actions deleted from the schedule.
     */
    private BatchScheduleActionDeleteResult deletes;

    /**
     * Schedule actions created in the schedule.
     *
     * @return Schedule actions created in the schedule.
     */
    public BatchScheduleActionCreateResult getCreates() {
        return creates;
    }

    /**
     * Schedule actions created in the schedule.
     *
     * @param creates Schedule actions created in the schedule.
     */
    public void setCreates(BatchScheduleActionCreateResult creates) {
        this.creates = creates;
    }

    /**
     * Schedule actions created in the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creates Schedule actions created in the schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateScheduleResult withCreates(BatchScheduleActionCreateResult creates) {
        this.creates = creates;
        return this;
    }

    /**
     * Schedule actions deleted from the schedule.
     *
     * @return Schedule actions deleted from the schedule.
     */
    public BatchScheduleActionDeleteResult getDeletes() {
        return deletes;
    }

    /**
     * Schedule actions deleted from the schedule.
     *
     * @param deletes Schedule actions deleted from the schedule.
     */
    public void setDeletes(BatchScheduleActionDeleteResult deletes) {
        this.deletes = deletes;
    }

    /**
     * Schedule actions deleted from the schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletes Schedule actions deleted from the schedule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateScheduleResult withDeletes(BatchScheduleActionDeleteResult deletes) {
        this.deletes = deletes;
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
        if (getCreates() != null)
            sb.append("Creates: " + getCreates() + ",");
        if (getDeletes() != null)
            sb.append("Deletes: " + getDeletes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreates() == null) ? 0 : getCreates().hashCode());
        hashCode = prime * hashCode + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateScheduleResult == false)
            return false;
        BatchUpdateScheduleResult other = (BatchUpdateScheduleResult) obj;

        if (other.getCreates() == null ^ this.getCreates() == null)
            return false;
        if (other.getCreates() != null && other.getCreates().equals(this.getCreates()) == false)
            return false;
        if (other.getDeletes() == null ^ this.getDeletes() == null)
            return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false)
            return false;
        return true;
    }
}
