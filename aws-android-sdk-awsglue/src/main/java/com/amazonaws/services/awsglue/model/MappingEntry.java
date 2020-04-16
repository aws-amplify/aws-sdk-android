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
 * Defines a mapping.
 * </p>
 */
public class MappingEntry implements Serializable {
    /**
     * <p>
     * The name of the source table.
     * </p>
     */
    private String sourceTable;

    /**
     * <p>
     * The source path.
     * </p>
     */
    private String sourcePath;

    /**
     * <p>
     * The source type.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The target table.
     * </p>
     */
    private String targetTable;

    /**
     * <p>
     * The target path.
     * </p>
     */
    private String targetPath;

    /**
     * <p>
     * The target type.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * The name of the source table.
     * </p>
     *
     * @return <p>
     *         The name of the source table.
     *         </p>
     */
    public String getSourceTable() {
        return sourceTable;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     *
     * @param sourceTable <p>
     *            The name of the source table.
     *            </p>
     */
    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    /**
     * <p>
     * The name of the source table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTable <p>
     *            The name of the source table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingEntry withSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
        return this;
    }

    /**
     * <p>
     * The source path.
     * </p>
     *
     * @return <p>
     *         The source path.
     *         </p>
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * <p>
     * The source path.
     * </p>
     *
     * @param sourcePath <p>
     *            The source path.
     *            </p>
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * The source path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePath <p>
     *            The source path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingEntry withSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     *
     * @return <p>
     *         The source type.
     *         </p>
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     *
     * @param sourceType <p>
     *            The source type.
     *            </p>
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceType <p>
     *            The source type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingEntry withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The target table.
     * </p>
     *
     * @return <p>
     *         The target table.
     *         </p>
     */
    public String getTargetTable() {
        return targetTable;
    }

    /**
     * <p>
     * The target table.
     * </p>
     *
     * @param targetTable <p>
     *            The target table.
     *            </p>
     */
    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * <p>
     * The target table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTable <p>
     *            The target table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingEntry withTargetTable(String targetTable) {
        this.targetTable = targetTable;
        return this;
    }

    /**
     * <p>
     * The target path.
     * </p>
     *
     * @return <p>
     *         The target path.
     *         </p>
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * <p>
     * The target path.
     * </p>
     *
     * @param targetPath <p>
     *            The target path.
     *            </p>
     */
    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    /**
     * <p>
     * The target path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetPath <p>
     *            The target path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingEntry withTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }

    /**
     * <p>
     * The target type.
     * </p>
     *
     * @return <p>
     *         The target type.
     *         </p>
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * <p>
     * The target type.
     * </p>
     *
     * @param targetType <p>
     *            The target type.
     *            </p>
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The target type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetType <p>
     *            The target type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MappingEntry withTargetType(String targetType) {
        this.targetType = targetType;
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
        if (getSourceTable() != null)
            sb.append("SourceTable: " + getSourceTable() + ",");
        if (getSourcePath() != null)
            sb.append("SourcePath: " + getSourcePath() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getTargetTable() != null)
            sb.append("TargetTable: " + getTargetTable() + ",");
        if (getTargetPath() != null)
            sb.append("TargetPath: " + getTargetPath() + ",");
        if (getTargetType() != null)
            sb.append("TargetType: " + getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceTable() == null) ? 0 : getSourceTable().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        hashCode = prime * hashCode + ((getTargetPath() == null) ? 0 : getTargetPath().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappingEntry == false)
            return false;
        MappingEntry other = (MappingEntry) obj;

        if (other.getSourceTable() == null ^ this.getSourceTable() == null)
            return false;
        if (other.getSourceTable() != null
                && other.getSourceTable().equals(this.getSourceTable()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null
                && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getTargetTable() == null ^ this.getTargetTable() == null)
            return false;
        if (other.getTargetTable() != null
                && other.getTargetTable().equals(this.getTargetTable()) == false)
            return false;
        if (other.getTargetPath() == null ^ this.getTargetPath() == null)
            return false;
        if (other.getTargetPath() != null
                && other.getTargetPath().equals(this.getTargetPath()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null
                && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }
}
