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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the S3 bucket where the raw data of a report are exported.
 * </p>
 */
public class S3ReportExportConfig implements Serializable {
    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String bucket;

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output
     * bucket. This is the default if packaging is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in
     * the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZIP, NONE
     */
    private String packaging;

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String encryptionKey;

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     */
    private Boolean encryptionDisabled;

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the S3 bucket where the raw data of a report are
     *         exported.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param bucket <p>
     *            The name of the S3 bucket where the raw data of a report are
     *            exported.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket where the raw data of a report are exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param bucket <p>
     *            The name of the S3 bucket where the raw data of a report are
     *            exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ReportExportConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     *
     * @return <p>
     *         The path to the exported report's raw data results.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     *
     * @param path <p>
     *            The path to the exported report's raw data results.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the exported report's raw data results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path to the exported report's raw data results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ReportExportConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output
     * bucket. This is the default if packaging is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in
     * the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZIP, NONE
     *
     * @return <p>
     *         The type of build output artifact to create. Valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: AWS CodeBuild creates the raw data in the
     *         output bucket. This is the default if packaging is not specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw
     *         data in the output bucket.
     *         </p>
     *         </li>
     *         </ul>
     * @see ReportPackagingType
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output
     * bucket. This is the default if packaging is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in
     * the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZIP, NONE
     *
     * @param packaging <p>
     *            The type of build output artifact to create. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates the raw data in the
     *            output bucket. This is the default if packaging is not
     *            specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the
     *            raw data in the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReportPackagingType
     */
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output
     * bucket. This is the default if packaging is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in
     * the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZIP, NONE
     *
     * @param packaging <p>
     *            The type of build output artifact to create. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates the raw data in the
     *            output bucket. This is the default if packaging is not
     *            specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the
     *            raw data in the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportPackagingType
     */
    public S3ReportExportConfig withPackaging(String packaging) {
        this.packaging = packaging;
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output
     * bucket. This is the default if packaging is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in
     * the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZIP, NONE
     *
     * @param packaging <p>
     *            The type of build output artifact to create. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates the raw data in the
     *            output bucket. This is the default if packaging is not
     *            specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the
     *            raw data in the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReportPackagingType
     */
    public void setPackaging(ReportPackagingType packaging) {
        this.packaging = packaging.toString();
    }

    /**
     * <p>
     * The type of build output artifact to create. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates the raw data in the output
     * bucket. This is the default if packaging is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the raw data in
     * the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ZIP, NONE
     *
     * @param packaging <p>
     *            The type of build output artifact to create. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates the raw data in the
     *            output bucket. This is the default if packaging is not
     *            specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates a ZIP file with the
     *            raw data in the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportPackagingType
     */
    public S3ReportExportConfig withPackaging(ReportPackagingType packaging) {
        this.packaging = packaging.toString();
        return this;
    }

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The encryption key for the report's encrypted raw data.
     *         </p>
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param encryptionKey <p>
     *            The encryption key for the report's encrypted raw data.
     *            </p>
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the report's encrypted raw data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param encryptionKey <p>
     *            The encryption key for the report's encrypted raw data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ReportExportConfig withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies if the results of a report are
     *         encrypted.
     *         </p>
     */
    public Boolean isEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     *
     * @return <p>
     *         A boolean value that specifies if the results of a report are
     *         encrypted.
     *         </p>
     */
    public Boolean getEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     *
     * @param encryptionDisabled <p>
     *            A boolean value that specifies if the results of a report are
     *            encrypted.
     *            </p>
     */
    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * A boolean value that specifies if the results of a report are encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionDisabled <p>
     *            A boolean value that specifies if the results of a report are
     *            encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3ReportExportConfig withEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
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
        if (getBucket() != null)
            sb.append("bucket: " + getBucket() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getPackaging() != null)
            sb.append("packaging: " + getPackaging() + ",");
        if (getEncryptionKey() != null)
            sb.append("encryptionKey: " + getEncryptionKey() + ",");
        if (getEncryptionDisabled() != null)
            sb.append("encryptionDisabled: " + getEncryptionDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ReportExportConfig == false)
            return false;
        S3ReportExportConfig other = (S3ReportExportConfig) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPackaging() == null ^ this.getPackaging() == null)
            return false;
        if (other.getPackaging() != null
                && other.getPackaging().equals(this.getPackaging()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null
                && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        return true;
    }
}
