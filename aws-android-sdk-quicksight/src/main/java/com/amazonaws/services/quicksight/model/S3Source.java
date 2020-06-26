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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A physical table type for as S3 data source.
 * </p>
 */
public class S3Source implements Serializable {
    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     */
    private String dataSourceArn;

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     */
    private UploadSettings uploadSettings;

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     */
    private java.util.List<InputColumn> inputColumns;

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     *
     * @return <p>
     *         The amazon Resource Name (ARN) for the data source.
     *         </p>
     */
    public String getDataSourceArn() {
        return dataSourceArn;
    }

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     *
     * @param dataSourceArn <p>
     *            The amazon Resource Name (ARN) for the data source.
     *            </p>
     */
    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceArn <p>
     *            The amazon Resource Name (ARN) for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Source withDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
        return this;
    }

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     *
     * @return <p>
     *         Information about the format for the S3 source file or files.
     *         </p>
     */
    public UploadSettings getUploadSettings() {
        return uploadSettings;
    }

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     *
     * @param uploadSettings <p>
     *            Information about the format for the S3 source file or files.
     *            </p>
     */
    public void setUploadSettings(UploadSettings uploadSettings) {
        this.uploadSettings = uploadSettings;
    }

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadSettings <p>
     *            Information about the format for the S3 source file or files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Source withUploadSettings(UploadSettings uploadSettings) {
        this.uploadSettings = uploadSettings;
        return this;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     *
     * @return <p>
     *         A physical table type for as S3 data source.
     *         </p>
     */
    public java.util.List<InputColumn> getInputColumns() {
        return inputColumns;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     *
     * @param inputColumns <p>
     *            A physical table type for as S3 data source.
     *            </p>
     */
    public void setInputColumns(java.util.Collection<InputColumn> inputColumns) {
        if (inputColumns == null) {
            this.inputColumns = null;
            return;
        }

        this.inputColumns = new java.util.ArrayList<InputColumn>(inputColumns);
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputColumns <p>
     *            A physical table type for as S3 data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Source withInputColumns(InputColumn... inputColumns) {
        if (getInputColumns() == null) {
            this.inputColumns = new java.util.ArrayList<InputColumn>(inputColumns.length);
        }
        for (InputColumn value : inputColumns) {
            this.inputColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputColumns <p>
     *            A physical table type for as S3 data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Source withInputColumns(java.util.Collection<InputColumn> inputColumns) {
        setInputColumns(inputColumns);
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
        if (getDataSourceArn() != null)
            sb.append("DataSourceArn: " + getDataSourceArn() + ",");
        if (getUploadSettings() != null)
            sb.append("UploadSettings: " + getUploadSettings() + ",");
        if (getInputColumns() != null)
            sb.append("InputColumns: " + getInputColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getUploadSettings() == null) ? 0 : getUploadSettings().hashCode());
        hashCode = prime * hashCode
                + ((getInputColumns() == null) ? 0 : getInputColumns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Source == false)
            return false;
        S3Source other = (S3Source) obj;

        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null
                && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
            return false;
        if (other.getUploadSettings() == null ^ this.getUploadSettings() == null)
            return false;
        if (other.getUploadSettings() != null
                && other.getUploadSettings().equals(this.getUploadSettings()) == false)
            return false;
        if (other.getInputColumns() == null ^ this.getInputColumns() == null)
            return false;
        if (other.getInputColumns() != null
                && other.getInputColumns().equals(this.getInputColumns()) == false)
            return false;
        return true;
    }
}
