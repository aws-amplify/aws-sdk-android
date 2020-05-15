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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class ResetJobBookmarkResult implements Serializable {
    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     */
    private JobBookmarkEntry jobBookmarkEntry;

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     *
     * @return <p>
     *         The reset bookmark entry.
     *         </p>
     */
    public JobBookmarkEntry getJobBookmarkEntry() {
        return jobBookmarkEntry;
    }

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     *
     * @param jobBookmarkEntry <p>
     *            The reset bookmark entry.
     *            </p>
     */
    public void setJobBookmarkEntry(JobBookmarkEntry jobBookmarkEntry) {
        this.jobBookmarkEntry = jobBookmarkEntry;
    }

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobBookmarkEntry <p>
     *            The reset bookmark entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetJobBookmarkResult withJobBookmarkEntry(JobBookmarkEntry jobBookmarkEntry) {
        this.jobBookmarkEntry = jobBookmarkEntry;
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
        if (getJobBookmarkEntry() != null)
            sb.append("JobBookmarkEntry: " + getJobBookmarkEntry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobBookmarkEntry() == null) ? 0 : getJobBookmarkEntry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetJobBookmarkResult == false)
            return false;
        ResetJobBookmarkResult other = (ResetJobBookmarkResult) obj;

        if (other.getJobBookmarkEntry() == null ^ this.getJobBookmarkEntry() == null)
            return false;
        if (other.getJobBookmarkEntry() != null
                && other.getJobBookmarkEntry().equals(this.getJobBookmarkEntry()) == false)
            return false;
        return true;
    }
}
