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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that defines an Amazon Neptune endpoint.
 * </p>
 */
public class NeptuneSettings implements Serializable {
    /**
     * <p>
     * The ARN of the service role you have created for the Neptune target
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.
     * html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS Database Migration
     * Service User Guide.</i>
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The name of the S3 bucket for AWS DMS to temporarily store migrated graph
     * data in CSV files before bulk-loading it to the Neptune target database.
     * AWS DMS maps the SQL source data to graph data before storing it in these
     * CSV files.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * A folder path where you where you want AWS DMS to store migrated graph
     * data in the S3 bucket specified by <code>S3BucketName</code>
     * </p>
     */
    private String s3BucketFolder;

    /**
     * <p>
     * The number of milliseconds for AWS DMS to wait to retry a bulk-load of
     * migrated graph data to the Neptune target database before raising an
     * error. The default is 250.
     * </p>
     */
    private Integer errorRetryDuration;

    /**
     * <p>
     * The maximum size in KB of migrated graph data stored in a CSV file before
     * AWS DMS bulk-loads the data to the Neptune target database. The default
     * is 1048576 KB. If successful, AWS DMS clears the bucket, ready to store
     * the next batch of migrated graph data.
     * </p>
     */
    private Integer maxFileSize;

    /**
     * <p>
     * The number of times for AWS DMS to retry a bulk-load of migrated graph
     * data to the Neptune target database before raising an error. The default
     * is 5.
     * </p>
     */
    private Integer maxRetryCount;

    /**
     * <p>
     * If you want IAM authorization enabled for this endpoint, set this
     * parameter to <code>true</code> and attach the appropriate role policy
     * document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     */
    private Boolean iamAuthEnabled;

    /**
     * <p>
     * The ARN of the service role you have created for the Neptune target
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.
     * html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS Database Migration
     * Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         The ARN of the service role you have created for the Neptune
     *         target endpoint. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     *         >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.
     *         Neptune.html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS
     *         Database Migration Service User Guide.</i>
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the service role you have created for the Neptune target
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.
     * html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS Database Migration
     * Service User Guide.</i>
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The ARN of the service role you have created for the Neptune
     *            target endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     *            >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.
     *            Neptune.html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS
     *            Database Migration Service User Guide.</i>
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the service role you have created for the Neptune target
     * endpoint. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.
     * html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS Database Migration
     * Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The ARN of the service role you have created for the Neptune
     *            target endpoint. For more information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     *            >https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.
     *            Neptune.html#CHAP_Target.Neptune.ServiceRole</a> in the <i>AWS
     *            Database Migration Service User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket for AWS DMS to temporarily store migrated graph
     * data in CSV files before bulk-loading it to the Neptune target database.
     * AWS DMS maps the SQL source data to graph data before storing it in these
     * CSV files.
     * </p>
     *
     * @return <p>
     *         The name of the S3 bucket for AWS DMS to temporarily store
     *         migrated graph data in CSV files before bulk-loading it to the
     *         Neptune target database. AWS DMS maps the SQL source data to
     *         graph data before storing it in these CSV files.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket for AWS DMS to temporarily store migrated graph
     * data in CSV files before bulk-loading it to the Neptune target database.
     * AWS DMS maps the SQL source data to graph data before storing it in these
     * CSV files.
     * </p>
     *
     * @param s3BucketName <p>
     *            The name of the S3 bucket for AWS DMS to temporarily store
     *            migrated graph data in CSV files before bulk-loading it to the
     *            Neptune target database. AWS DMS maps the SQL source data to
     *            graph data before storing it in these CSV files.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket for AWS DMS to temporarily store migrated graph
     * data in CSV files before bulk-loading it to the Neptune target database.
     * AWS DMS maps the SQL source data to graph data before storing it in these
     * CSV files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketName <p>
     *            The name of the S3 bucket for AWS DMS to temporarily store
     *            migrated graph data in CSV files before bulk-loading it to the
     *            Neptune target database. AWS DMS maps the SQL source data to
     *            graph data before storing it in these CSV files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * A folder path where you where you want AWS DMS to store migrated graph
     * data in the S3 bucket specified by <code>S3BucketName</code>
     * </p>
     *
     * @return <p>
     *         A folder path where you where you want AWS DMS to store migrated
     *         graph data in the S3 bucket specified by
     *         <code>S3BucketName</code>
     *         </p>
     */
    public String getS3BucketFolder() {
        return s3BucketFolder;
    }

    /**
     * <p>
     * A folder path where you where you want AWS DMS to store migrated graph
     * data in the S3 bucket specified by <code>S3BucketName</code>
     * </p>
     *
     * @param s3BucketFolder <p>
     *            A folder path where you where you want AWS DMS to store
     *            migrated graph data in the S3 bucket specified by
     *            <code>S3BucketName</code>
     *            </p>
     */
    public void setS3BucketFolder(String s3BucketFolder) {
        this.s3BucketFolder = s3BucketFolder;
    }

    /**
     * <p>
     * A folder path where you where you want AWS DMS to store migrated graph
     * data in the S3 bucket specified by <code>S3BucketName</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketFolder <p>
     *            A folder path where you where you want AWS DMS to store
     *            migrated graph data in the S3 bucket specified by
     *            <code>S3BucketName</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withS3BucketFolder(String s3BucketFolder) {
        this.s3BucketFolder = s3BucketFolder;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds for AWS DMS to wait to retry a bulk-load of
     * migrated graph data to the Neptune target database before raising an
     * error. The default is 250.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds for AWS DMS to wait to retry a
     *         bulk-load of migrated graph data to the Neptune target database
     *         before raising an error. The default is 250.
     *         </p>
     */
    public Integer getErrorRetryDuration() {
        return errorRetryDuration;
    }

    /**
     * <p>
     * The number of milliseconds for AWS DMS to wait to retry a bulk-load of
     * migrated graph data to the Neptune target database before raising an
     * error. The default is 250.
     * </p>
     *
     * @param errorRetryDuration <p>
     *            The number of milliseconds for AWS DMS to wait to retry a
     *            bulk-load of migrated graph data to the Neptune target
     *            database before raising an error. The default is 250.
     *            </p>
     */
    public void setErrorRetryDuration(Integer errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
    }

    /**
     * <p>
     * The number of milliseconds for AWS DMS to wait to retry a bulk-load of
     * migrated graph data to the Neptune target database before raising an
     * error. The default is 250.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorRetryDuration <p>
     *            The number of milliseconds for AWS DMS to wait to retry a
     *            bulk-load of migrated graph data to the Neptune target
     *            database before raising an error. The default is 250.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withErrorRetryDuration(Integer errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
        return this;
    }

    /**
     * <p>
     * The maximum size in KB of migrated graph data stored in a CSV file before
     * AWS DMS bulk-loads the data to the Neptune target database. The default
     * is 1048576 KB. If successful, AWS DMS clears the bucket, ready to store
     * the next batch of migrated graph data.
     * </p>
     *
     * @return <p>
     *         The maximum size in KB of migrated graph data stored in a CSV
     *         file before AWS DMS bulk-loads the data to the Neptune target
     *         database. The default is 1048576 KB. If successful, AWS DMS
     *         clears the bucket, ready to store the next batch of migrated
     *         graph data.
     *         </p>
     */
    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * <p>
     * The maximum size in KB of migrated graph data stored in a CSV file before
     * AWS DMS bulk-loads the data to the Neptune target database. The default
     * is 1048576 KB. If successful, AWS DMS clears the bucket, ready to store
     * the next batch of migrated graph data.
     * </p>
     *
     * @param maxFileSize <p>
     *            The maximum size in KB of migrated graph data stored in a CSV
     *            file before AWS DMS bulk-loads the data to the Neptune target
     *            database. The default is 1048576 KB. If successful, AWS DMS
     *            clears the bucket, ready to store the next batch of migrated
     *            graph data.
     *            </p>
     */
    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * <p>
     * The maximum size in KB of migrated graph data stored in a CSV file before
     * AWS DMS bulk-loads the data to the Neptune target database. The default
     * is 1048576 KB. If successful, AWS DMS clears the bucket, ready to store
     * the next batch of migrated graph data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxFileSize <p>
     *            The maximum size in KB of migrated graph data stored in a CSV
     *            file before AWS DMS bulk-loads the data to the Neptune target
     *            database. The default is 1048576 KB. If successful, AWS DMS
     *            clears the bucket, ready to store the next batch of migrated
     *            graph data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * <p>
     * The number of times for AWS DMS to retry a bulk-load of migrated graph
     * data to the Neptune target database before raising an error. The default
     * is 5.
     * </p>
     *
     * @return <p>
     *         The number of times for AWS DMS to retry a bulk-load of migrated
     *         graph data to the Neptune target database before raising an
     *         error. The default is 5.
     *         </p>
     */
    public Integer getMaxRetryCount() {
        return maxRetryCount;
    }

    /**
     * <p>
     * The number of times for AWS DMS to retry a bulk-load of migrated graph
     * data to the Neptune target database before raising an error. The default
     * is 5.
     * </p>
     *
     * @param maxRetryCount <p>
     *            The number of times for AWS DMS to retry a bulk-load of
     *            migrated graph data to the Neptune target database before
     *            raising an error. The default is 5.
     *            </p>
     */
    public void setMaxRetryCount(Integer maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    /**
     * <p>
     * The number of times for AWS DMS to retry a bulk-load of migrated graph
     * data to the Neptune target database before raising an error. The default
     * is 5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRetryCount <p>
     *            The number of times for AWS DMS to retry a bulk-load of
     *            migrated graph data to the Neptune target database before
     *            raising an error. The default is 5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withMaxRetryCount(Integer maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
        return this;
    }

    /**
     * <p>
     * If you want IAM authorization enabled for this endpoint, set this
     * parameter to <code>true</code> and attach the appropriate role policy
     * document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If you want IAM authorization enabled for this endpoint, set this
     *         parameter to <code>true</code> and attach the appropriate role
     *         policy document to your service role specified by
     *         <code>ServiceAccessRoleArn</code>. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isIamAuthEnabled() {
        return iamAuthEnabled;
    }

    /**
     * <p>
     * If you want IAM authorization enabled for this endpoint, set this
     * parameter to <code>true</code> and attach the appropriate role policy
     * document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If you want IAM authorization enabled for this endpoint, set this
     *         parameter to <code>true</code> and attach the appropriate role
     *         policy document to your service role specified by
     *         <code>ServiceAccessRoleArn</code>. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getIamAuthEnabled() {
        return iamAuthEnabled;
    }

    /**
     * <p>
     * If you want IAM authorization enabled for this endpoint, set this
     * parameter to <code>true</code> and attach the appropriate role policy
     * document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     *
     * @param iamAuthEnabled <p>
     *            If you want IAM authorization enabled for this endpoint, set
     *            this parameter to <code>true</code> and attach the appropriate
     *            role policy document to your service role specified by
     *            <code>ServiceAccessRoleArn</code>. The default is
     *            <code>false</code>.
     *            </p>
     */
    public void setIamAuthEnabled(Boolean iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
    }

    /**
     * <p>
     * If you want IAM authorization enabled for this endpoint, set this
     * parameter to <code>true</code> and attach the appropriate role policy
     * document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamAuthEnabled <p>
     *            If you want IAM authorization enabled for this endpoint, set
     *            this parameter to <code>true</code> and attach the appropriate
     *            role policy document to your service role specified by
     *            <code>ServiceAccessRoleArn</code>. The default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NeptuneSettings withIamAuthEnabled(Boolean iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3BucketFolder() != null)
            sb.append("S3BucketFolder: " + getS3BucketFolder() + ",");
        if (getErrorRetryDuration() != null)
            sb.append("ErrorRetryDuration: " + getErrorRetryDuration() + ",");
        if (getMaxFileSize() != null)
            sb.append("MaxFileSize: " + getMaxFileSize() + ",");
        if (getMaxRetryCount() != null)
            sb.append("MaxRetryCount: " + getMaxRetryCount() + ",");
        if (getIamAuthEnabled() != null)
            sb.append("IamAuthEnabled: " + getIamAuthEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketFolder() == null) ? 0 : getS3BucketFolder().hashCode());
        hashCode = prime * hashCode
                + ((getErrorRetryDuration() == null) ? 0 : getErrorRetryDuration().hashCode());
        hashCode = prime * hashCode
                + ((getMaxFileSize() == null) ? 0 : getMaxFileSize().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRetryCount() == null) ? 0 : getMaxRetryCount().hashCode());
        hashCode = prime * hashCode
                + ((getIamAuthEnabled() == null) ? 0 : getIamAuthEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NeptuneSettings == false)
            return false;
        NeptuneSettings other = (NeptuneSettings) obj;

        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3BucketFolder() == null ^ this.getS3BucketFolder() == null)
            return false;
        if (other.getS3BucketFolder() != null
                && other.getS3BucketFolder().equals(this.getS3BucketFolder()) == false)
            return false;
        if (other.getErrorRetryDuration() == null ^ this.getErrorRetryDuration() == null)
            return false;
        if (other.getErrorRetryDuration() != null
                && other.getErrorRetryDuration().equals(this.getErrorRetryDuration()) == false)
            return false;
        if (other.getMaxFileSize() == null ^ this.getMaxFileSize() == null)
            return false;
        if (other.getMaxFileSize() != null
                && other.getMaxFileSize().equals(this.getMaxFileSize()) == false)
            return false;
        if (other.getMaxRetryCount() == null ^ this.getMaxRetryCount() == null)
            return false;
        if (other.getMaxRetryCount() != null
                && other.getMaxRetryCount().equals(this.getMaxRetryCount()) == false)
            return false;
        if (other.getIamAuthEnabled() == null ^ this.getIamAuthEnabled() == null)
            return false;
        if (other.getIamAuthEnabled() != null
                && other.getIamAuthEnabled().equals(this.getIamAuthEnabled()) == false)
            return false;
        return true;
    }
}
