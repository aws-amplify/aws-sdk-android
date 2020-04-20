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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * A structure containing migration status information.
 * </p>
 */
public class CatalogImportStatus implements Serializable {
    /**
     * <p>
     * <code>True</code> if the migration has completed, or <code>False</code>
     * otherwise.
     * </p>
     */
    private Boolean importCompleted;

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     */
    private java.util.Date importTime;

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String importedBy;

    /**
     * <p>
     * <code>True</code> if the migration has completed, or <code>False</code>
     * otherwise.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the migration has completed, or
     *         <code>False</code> otherwise.
     *         </p>
     */
    public Boolean isImportCompleted() {
        return importCompleted;
    }

    /**
     * <p>
     * <code>True</code> if the migration has completed, or <code>False</code>
     * otherwise.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the migration has completed, or
     *         <code>False</code> otherwise.
     *         </p>
     */
    public Boolean getImportCompleted() {
        return importCompleted;
    }

    /**
     * <p>
     * <code>True</code> if the migration has completed, or <code>False</code>
     * otherwise.
     * </p>
     *
     * @param importCompleted <p>
     *            <code>True</code> if the migration has completed, or
     *            <code>False</code> otherwise.
     *            </p>
     */
    public void setImportCompleted(Boolean importCompleted) {
        this.importCompleted = importCompleted;
    }

    /**
     * <p>
     * <code>True</code> if the migration has completed, or <code>False</code>
     * otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importCompleted <p>
     *            <code>True</code> if the migration has completed, or
     *            <code>False</code> otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CatalogImportStatus withImportCompleted(Boolean importCompleted) {
        this.importCompleted = importCompleted;
        return this;
    }

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     *
     * @return <p>
     *         The time that the migration was started.
     *         </p>
     */
    public java.util.Date getImportTime() {
        return importTime;
    }

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     *
     * @param importTime <p>
     *            The time that the migration was started.
     *            </p>
     */
    public void setImportTime(java.util.Date importTime) {
        this.importTime = importTime;
    }

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTime <p>
     *            The time that the migration was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CatalogImportStatus withImportTime(java.util.Date importTime) {
        this.importTime = importTime;
        return this;
    }

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the person who initiated the migration.
     *         </p>
     */
    public String getImportedBy() {
        return importedBy;
    }

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param importedBy <p>
     *            The name of the person who initiated the migration.
     *            </p>
     */
    public void setImportedBy(String importedBy) {
        this.importedBy = importedBy;
    }

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param importedBy <p>
     *            The name of the person who initiated the migration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CatalogImportStatus withImportedBy(String importedBy) {
        this.importedBy = importedBy;
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
        if (getImportCompleted() != null)
            sb.append("ImportCompleted: " + getImportCompleted() + ",");
        if (getImportTime() != null)
            sb.append("ImportTime: " + getImportTime() + ",");
        if (getImportedBy() != null)
            sb.append("ImportedBy: " + getImportedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImportCompleted() == null) ? 0 : getImportCompleted().hashCode());
        hashCode = prime * hashCode + ((getImportTime() == null) ? 0 : getImportTime().hashCode());
        hashCode = prime * hashCode + ((getImportedBy() == null) ? 0 : getImportedBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogImportStatus == false)
            return false;
        CatalogImportStatus other = (CatalogImportStatus) obj;

        if (other.getImportCompleted() == null ^ this.getImportCompleted() == null)
            return false;
        if (other.getImportCompleted() != null
                && other.getImportCompleted().equals(this.getImportCompleted()) == false)
            return false;
        if (other.getImportTime() == null ^ this.getImportTime() == null)
            return false;
        if (other.getImportTime() != null
                && other.getImportTime().equals(this.getImportTime()) == false)
            return false;
        if (other.getImportedBy() == null ^ this.getImportedBy() == null)
            return false;
        if (other.getImportedBy() != null
                && other.getImportedBy().equals(this.getImportedBy()) == false)
            return false;
        return true;
    }
}
