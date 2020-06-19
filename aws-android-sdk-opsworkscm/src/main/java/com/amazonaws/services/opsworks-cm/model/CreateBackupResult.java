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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;


public class CreateBackupResult implements Serializable {
    /**
     * <p>Backup created by request.</p>
     */
    private Backup backup;

    /**
     * <p>Backup created by request.</p>
     *
     * @return <p>Backup created by request.</p>
     */
    public Backup getBackup() {
        return backup;
    }

    /**
     * <p>Backup created by request.</p>
     *
     * @param backup <p>Backup created by request.</p>
     */
    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    /**
     * <p>Backup created by request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backup <p>Backup created by request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateBackupResult withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBackup() != null) sb.append("Backup: " + getBackup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackup() == null) ? 0 : getBackup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateBackupResult == false) return false;
        CreateBackupResult other = (CreateBackupResult)obj;

        if (other.getBackup() == null ^ this.getBackup() == null) return false;
        if (other.getBackup() != null && other.getBackup().equals(this.getBackup()) == false) return false;
        return true;
    }
}
