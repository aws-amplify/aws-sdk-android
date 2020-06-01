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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * The data repository configuration object for Lustre file systems returned in
 * the response of the <code>CreateFileSystem</code> operation.
 * </p>
 */
public class DataRepositoryConfiguration implements Serializable {
    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're
     * using as the data repository for your FSx for Lustre file system, for
     * example <code>s3://import-bucket/optional-prefix</code>. If a prefix is
     * specified after the Amazon S3 bucket name, only object keys with that
     * prefix are loaded into the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     */
    private String importPath;

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using
     * to store new and changed Lustre file system files in S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     */
    private String exportPath;

    /**
     * <p>
     * For files imported from a data repository, this value determines the
     * stripe count and maximum amount of data per file (in MiB) stored on a
     * single physical disk. The maximum number of disks that a single file can
     * be striped across is limited by the total number of disks that make up
     * the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000
     * MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 512000<br/>
     */
    private Integer importedFileChunkSize;

    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're
     * using as the data repository for your FSx for Lustre file system, for
     * example <code>s3://import-bucket/optional-prefix</code>. If a prefix is
     * specified after the Amazon S3 bucket name, only object keys with that
     * prefix are loaded into the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @return <p>
     *         The import path to the Amazon S3 bucket (and optional prefix)
     *         that you're using as the data repository for your FSx for Lustre
     *         file system, for example
     *         <code>s3://import-bucket/optional-prefix</code>. If a prefix is
     *         specified after the Amazon S3 bucket name, only object keys with
     *         that prefix are loaded into the file system.
     *         </p>
     */
    public String getImportPath() {
        return importPath;
    }

    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're
     * using as the data repository for your FSx for Lustre file system, for
     * example <code>s3://import-bucket/optional-prefix</code>. If a prefix is
     * specified after the Amazon S3 bucket name, only object keys with that
     * prefix are loaded into the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @param importPath <p>
     *            The import path to the Amazon S3 bucket (and optional prefix)
     *            that you're using as the data repository for your FSx for
     *            Lustre file system, for example
     *            <code>s3://import-bucket/optional-prefix</code>. If a prefix
     *            is specified after the Amazon S3 bucket name, only object keys
     *            with that prefix are loaded into the file system.
     *            </p>
     */
    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're
     * using as the data repository for your FSx for Lustre file system, for
     * example <code>s3://import-bucket/optional-prefix</code>. If a prefix is
     * specified after the Amazon S3 bucket name, only object keys with that
     * prefix are loaded into the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @param importPath <p>
     *            The import path to the Amazon S3 bucket (and optional prefix)
     *            that you're using as the data repository for your FSx for
     *            Lustre file system, for example
     *            <code>s3://import-bucket/optional-prefix</code>. If a prefix
     *            is specified after the Amazon S3 bucket name, only object keys
     *            with that prefix are loaded into the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryConfiguration withImportPath(String importPath) {
        this.importPath = importPath;
        return this;
    }

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using
     * to store new and changed Lustre file system files in S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @return <p>
     *         The export path to the Amazon S3 bucket (and prefix) that you are
     *         using to store new and changed Lustre file system files in S3.
     *         </p>
     */
    public String getExportPath() {
        return exportPath;
    }

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using
     * to store new and changed Lustre file system files in S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @param exportPath <p>
     *            The export path to the Amazon S3 bucket (and prefix) that you
     *            are using to store new and changed Lustre file system files in
     *            S3.
     *            </p>
     */
    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using
     * to store new and changed Lustre file system files in S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @param exportPath <p>
     *            The export path to the Amazon S3 bucket (and prefix) that you
     *            are using to store new and changed Lustre file system files in
     *            S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryConfiguration withExportPath(String exportPath) {
        this.exportPath = exportPath;
        return this;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the
     * stripe count and maximum amount of data per file (in MiB) stored on a
     * single physical disk. The maximum number of disks that a single file can
     * be striped across is limited by the total number of disks that make up
     * the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000
     * MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 512000<br/>
     *
     * @return <p>
     *         For files imported from a data repository, this value determines
     *         the stripe count and maximum amount of data per file (in MiB)
     *         stored on a single physical disk. The maximum number of disks
     *         that a single file can be striped across is limited by the total
     *         number of disks that make up the file system.
     *         </p>
     *         <p>
     *         The default chunk size is 1,024 MiB (1 GiB) and can go as high as
     *         512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5
     *         TB.
     *         </p>
     */
    public Integer getImportedFileChunkSize() {
        return importedFileChunkSize;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the
     * stripe count and maximum amount of data per file (in MiB) stored on a
     * single physical disk. The maximum number of disks that a single file can
     * be striped across is limited by the total number of disks that make up
     * the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000
     * MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 512000<br/>
     *
     * @param importedFileChunkSize <p>
     *            For files imported from a data repository, this value
     *            determines the stripe count and maximum amount of data per
     *            file (in MiB) stored on a single physical disk. The maximum
     *            number of disks that a single file can be striped across is
     *            limited by the total number of disks that make up the file
     *            system.
     *            </p>
     *            <p>
     *            The default chunk size is 1,024 MiB (1 GiB) and can go as high
     *            as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum
     *            size of 5 TB.
     *            </p>
     */
    public void setImportedFileChunkSize(Integer importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the
     * stripe count and maximum amount of data per file (in MiB) stored on a
     * single physical disk. The maximum number of disks that a single file can
     * be striped across is limited by the total number of disks that make up
     * the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000
     * MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 512000<br/>
     *
     * @param importedFileChunkSize <p>
     *            For files imported from a data repository, this value
     *            determines the stripe count and maximum amount of data per
     *            file (in MiB) stored on a single physical disk. The maximum
     *            number of disks that a single file can be striped across is
     *            limited by the total number of disks that make up the file
     *            system.
     *            </p>
     *            <p>
     *            The default chunk size is 1,024 MiB (1 GiB) and can go as high
     *            as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum
     *            size of 5 TB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryConfiguration withImportedFileChunkSize(Integer importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
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
        if (getImportPath() != null)
            sb.append("ImportPath: " + getImportPath() + ",");
        if (getExportPath() != null)
            sb.append("ExportPath: " + getExportPath() + ",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: " + getImportedFileChunkSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportPath() == null) ? 0 : getImportPath().hashCode());
        hashCode = prime * hashCode + ((getExportPath() == null) ? 0 : getExportPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryConfiguration == false)
            return false;
        DataRepositoryConfiguration other = (DataRepositoryConfiguration) obj;

        if (other.getImportPath() == null ^ this.getImportPath() == null)
            return false;
        if (other.getImportPath() != null
                && other.getImportPath().equals(this.getImportPath()) == false)
            return false;
        if (other.getExportPath() == null ^ this.getExportPath() == null)
            return false;
        if (other.getExportPath() != null
                && other.getExportPath().equals(this.getExportPath()) == false)
            return false;
        if (other.getImportedFileChunkSize() == null ^ this.getImportedFileChunkSize() == null)
            return false;
        if (other.getImportedFileChunkSize() != null
                && other.getImportedFileChunkSize().equals(this.getImportedFileChunkSize()) == false)
            return false;
        return true;
    }
}
