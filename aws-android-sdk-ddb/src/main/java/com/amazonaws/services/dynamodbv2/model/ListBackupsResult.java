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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class ListBackupsResult implements Serializable {
    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     */
    private java.util.List<BackupSummary> backupSummaries;

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be
     * specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of
     * results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of
     * results has been processed and there are no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not
     * indicate there is more data to be returned. All results are guaranteed to
     * have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String lastEvaluatedBackupArn;

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     *
     * @return <p>
     *         List of <code>BackupSummary</code> objects.
     *         </p>
     */
    public java.util.List<BackupSummary> getBackupSummaries() {
        return backupSummaries;
    }

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     *
     * @param backupSummaries <p>
     *            List of <code>BackupSummary</code> objects.
     *            </p>
     */
    public void setBackupSummaries(java.util.Collection<BackupSummary> backupSummaries) {
        if (backupSummaries == null) {
            this.backupSummaries = null;
            return;
        }

        this.backupSummaries = new java.util.ArrayList<BackupSummary>(backupSummaries);
    }

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSummaries <p>
     *            List of <code>BackupSummary</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsResult withBackupSummaries(BackupSummary... backupSummaries) {
        if (getBackupSummaries() == null) {
            this.backupSummaries = new java.util.ArrayList<BackupSummary>(backupSummaries.length);
        }
        for (BackupSummary value : backupSummaries) {
            this.backupSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>BackupSummary</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSummaries <p>
     *            List of <code>BackupSummary</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsResult withBackupSummaries(java.util.Collection<BackupSummary> backupSummaries) {
        setBackupSummaries(backupSummaries);
        return this;
    }

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be
     * specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of
     * results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of
     * results has been processed and there are no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not
     * indicate there is more data to be returned. All results are guaranteed to
     * have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         The ARN of the backup last evaluated when the current page of
     *         results was returned, inclusive of the current page of results.
     *         This value may be specified as the
     *         <code>ExclusiveStartBackupArn</code> of a new
     *         <code>ListBackups</code> operation in order to fetch the next
     *         page of results.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedBackupArn</code> is empty, then the last
     *         page of results has been processed and there are no more results
     *         to be retrieved.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedBackupArn</code> is not empty, this may or
     *         may not indicate there is more data to be returned. All results
     *         are guaranteed to have been returned if and only if no value for
     *         <code>LastEvaluatedBackupArn</code> is returned.
     *         </p>
     */
    public String getLastEvaluatedBackupArn() {
        return lastEvaluatedBackupArn;
    }

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be
     * specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of
     * results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of
     * results has been processed and there are no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not
     * indicate there is more data to be returned. All results are guaranteed to
     * have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param lastEvaluatedBackupArn <p>
     *            The ARN of the backup last evaluated when the current page of
     *            results was returned, inclusive of the current page of
     *            results. This value may be specified as the
     *            <code>ExclusiveStartBackupArn</code> of a new
     *            <code>ListBackups</code> operation in order to fetch the next
     *            page of results.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedBackupArn</code> is empty, then the last
     *            page of results has been processed and there are no more
     *            results to be retrieved.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedBackupArn</code> is not empty, this may
     *            or may not indicate there is more data to be returned. All
     *            results are guaranteed to have been returned if and only if no
     *            value for <code>LastEvaluatedBackupArn</code> is returned.
     *            </p>
     */
    public void setLastEvaluatedBackupArn(String lastEvaluatedBackupArn) {
        this.lastEvaluatedBackupArn = lastEvaluatedBackupArn;
    }

    /**
     * <p>
     * The ARN of the backup last evaluated when the current page of results was
     * returned, inclusive of the current page of results. This value may be
     * specified as the <code>ExclusiveStartBackupArn</code> of a new
     * <code>ListBackups</code> operation in order to fetch the next page of
     * results.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is empty, then the last page of
     * results has been processed and there are no more results to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not
     * indicate there is more data to be returned. All results are guaranteed to
     * have been returned if and only if no value for
     * <code>LastEvaluatedBackupArn</code> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param lastEvaluatedBackupArn <p>
     *            The ARN of the backup last evaluated when the current page of
     *            results was returned, inclusive of the current page of
     *            results. This value may be specified as the
     *            <code>ExclusiveStartBackupArn</code> of a new
     *            <code>ListBackups</code> operation in order to fetch the next
     *            page of results.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedBackupArn</code> is empty, then the last
     *            page of results has been processed and there are no more
     *            results to be retrieved.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedBackupArn</code> is not empty, this may
     *            or may not indicate there is more data to be returned. All
     *            results are guaranteed to have been returned if and only if no
     *            value for <code>LastEvaluatedBackupArn</code> is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsResult withLastEvaluatedBackupArn(String lastEvaluatedBackupArn) {
        this.lastEvaluatedBackupArn = lastEvaluatedBackupArn;
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
        if (getBackupSummaries() != null)
            sb.append("BackupSummaries: " + getBackupSummaries() + ",");
        if (getLastEvaluatedBackupArn() != null)
            sb.append("LastEvaluatedBackupArn: " + getLastEvaluatedBackupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupSummaries() == null) ? 0 : getBackupSummaries().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastEvaluatedBackupArn() == null) ? 0 : getLastEvaluatedBackupArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupsResult == false)
            return false;
        ListBackupsResult other = (ListBackupsResult) obj;

        if (other.getBackupSummaries() == null ^ this.getBackupSummaries() == null)
            return false;
        if (other.getBackupSummaries() != null
                && other.getBackupSummaries().equals(this.getBackupSummaries()) == false)
            return false;
        if (other.getLastEvaluatedBackupArn() == null ^ this.getLastEvaluatedBackupArn() == null)
            return false;
        if (other.getLastEvaluatedBackupArn() != null
                && other.getLastEvaluatedBackupArn().equals(this.getLastEvaluatedBackupArn()) == false)
            return false;
        return true;
    }
}
