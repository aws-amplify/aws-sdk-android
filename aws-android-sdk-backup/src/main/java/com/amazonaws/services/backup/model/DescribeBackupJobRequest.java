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
 * Returns metadata associated with creating a backup of a resource.
 * </p>
 */
public class DescribeBackupJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     */
    private String backupJobId;

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a request to AWS Backup to back up a
     *         resource.
     *         </p>
     */
    public String getBackupJobId() {
        return backupJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     *
     * @param backupJobId <p>
     *            Uniquely identifies a request to AWS Backup to back up a
     *            resource.
     *            </p>
     */
    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupJobId <p>
     *            Uniquely identifies a request to AWS Backup to back up a
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupJobRequest withBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
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
        if (getBackupJobId() != null)
            sb.append("BackupJobId: " + getBackupJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupJobRequest == false)
            return false;
        DescribeBackupJobRequest other = (DescribeBackupJobRequest) obj;

        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null
                && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        return true;
    }
}
