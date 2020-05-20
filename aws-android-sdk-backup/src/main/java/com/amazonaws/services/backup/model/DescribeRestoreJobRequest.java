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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns metadata associated with a restore job that is specified by a job ID.
 * </p>
 */
public class DescribeRestoreJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     */
    private String restoreJobId;

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies the job that restores a recovery point.
     *         </p>
     */
    public String getRestoreJobId() {
        return restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     *
     * @param restoreJobId <p>
     *            Uniquely identifies the job that restores a recovery point.
     *            </p>
     */
    public void setRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreJobId <p>
     *            Uniquely identifies the job that restores a recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobRequest withRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
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
        if (getRestoreJobId() != null)
            sb.append("RestoreJobId: " + getRestoreJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestoreJobId() == null) ? 0 : getRestoreJobId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRestoreJobRequest == false)
            return false;
        DescribeRestoreJobRequest other = (DescribeRestoreJobRequest) obj;

        if (other.getRestoreJobId() == null ^ this.getRestoreJobId() == null)
            return false;
        if (other.getRestoreJobId() != null
                && other.getRestoreJobId().equals(this.getRestoreJobId()) == false)
            return false;
        return true;
    }
}
