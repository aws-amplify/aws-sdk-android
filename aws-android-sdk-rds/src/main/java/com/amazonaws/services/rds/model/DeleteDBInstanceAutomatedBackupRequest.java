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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes automated backups based on the source instance's
 * <code>DbiResourceId</code> value or the restorable instance's resource ID.
 * </p>
 */
public class DeleteDBInstanceAutomatedBackupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     *
     * @return <p>
     *         The identifier for the source DB instance, which can't be changed
     *         and which is unique to an AWS Region.
     *         </p>
     */
    public String getDbiResourceId() {
        return dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     *
     * @param dbiResourceId <p>
     *            The identifier for the source DB instance, which can't be
     *            changed and which is unique to an AWS Region.
     *            </p>
     */
    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbiResourceId <p>
     *            The identifier for the source DB instance, which can't be
     *            changed and which is unique to an AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBInstanceAutomatedBackupRequest withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
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
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBInstanceAutomatedBackupRequest == false)
            return false;
        DeleteDBInstanceAutomatedBackupRequest other = (DeleteDBInstanceAutomatedBackupRequest) obj;

        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        return true;
    }
}
