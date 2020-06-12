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

public class GetCatalogImportStatusResult implements Serializable {
    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     */
    private CatalogImportStatus importStatus;

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     *
     * @return <p>
     *         The status of the specified catalog migration.
     *         </p>
     */
    public CatalogImportStatus getImportStatus() {
        return importStatus;
    }

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     *
     * @param importStatus <p>
     *            The status of the specified catalog migration.
     *            </p>
     */
    public void setImportStatus(CatalogImportStatus importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importStatus <p>
     *            The status of the specified catalog migration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCatalogImportStatusResult withImportStatus(CatalogImportStatus importStatus) {
        this.importStatus = importStatus;
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
        if (getImportStatus() != null)
            sb.append("ImportStatus: " + getImportStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCatalogImportStatusResult == false)
            return false;
        GetCatalogImportStatusResult other = (GetCatalogImportStatusResult) obj;

        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null
                && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        return true;
    }
}
