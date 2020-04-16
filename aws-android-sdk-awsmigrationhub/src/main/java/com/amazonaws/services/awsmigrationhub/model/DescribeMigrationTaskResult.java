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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class DescribeMigrationTaskResult implements Serializable {
    /**
     * <p>
     * Object encapsulating information about the migration task.
     * </p>
     */
    private MigrationTask migrationTask;

    /**
     * <p>
     * Object encapsulating information about the migration task.
     * </p>
     *
     * @return <p>
     *         Object encapsulating information about the migration task.
     *         </p>
     */
    public MigrationTask getMigrationTask() {
        return migrationTask;
    }

    /**
     * <p>
     * Object encapsulating information about the migration task.
     * </p>
     *
     * @param migrationTask <p>
     *            Object encapsulating information about the migration task.
     *            </p>
     */
    public void setMigrationTask(MigrationTask migrationTask) {
        this.migrationTask = migrationTask;
    }

    /**
     * <p>
     * Object encapsulating information about the migration task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param migrationTask <p>
     *            Object encapsulating information about the migration task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMigrationTaskResult withMigrationTask(MigrationTask migrationTask) {
        this.migrationTask = migrationTask;
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
        if (getMigrationTask() != null)
            sb.append("MigrationTask: " + getMigrationTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMigrationTask() == null) ? 0 : getMigrationTask().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMigrationTaskResult == false)
            return false;
        DescribeMigrationTaskResult other = (DescribeMigrationTaskResult) obj;

        if (other.getMigrationTask() == null ^ this.getMigrationTask() == null)
            return false;
        if (other.getMigrationTask() != null
                && other.getMigrationTask().equals(this.getMigrationTask()) == false)
            return false;
        return true;
    }
}
