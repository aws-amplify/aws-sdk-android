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

public class DescribeBackupResult implements Serializable {
    /**
     * <p>
     * Contains the description of the backup created for the table.
     * </p>
     */
    private BackupDescription backupDescription;

    /**
     * <p>
     * Contains the description of the backup created for the table.
     * </p>
     *
     * @return <p>
     *         Contains the description of the backup created for the table.
     *         </p>
     */
    public BackupDescription getBackupDescription() {
        return backupDescription;
    }

    /**
     * <p>
     * Contains the description of the backup created for the table.
     * </p>
     *
     * @param backupDescription <p>
     *            Contains the description of the backup created for the table.
     *            </p>
     */
    public void setBackupDescription(BackupDescription backupDescription) {
        this.backupDescription = backupDescription;
    }

    /**
     * <p>
     * Contains the description of the backup created for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupDescription <p>
     *            Contains the description of the backup created for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBackupResult withBackupDescription(BackupDescription backupDescription) {
        this.backupDescription = backupDescription;
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
        if (getBackupDescription() != null)
            sb.append("BackupDescription: " + getBackupDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupDescription() == null) ? 0 : getBackupDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupResult == false)
            return false;
        DescribeBackupResult other = (DescribeBackupResult) obj;

        if (other.getBackupDescription() == null ^ this.getBackupDescription() == null)
            return false;
        if (other.getBackupDescription() != null
                && other.getBackupDescription().equals(this.getBackupDescription()) == false)
            return false;
        return true;
    }
}
