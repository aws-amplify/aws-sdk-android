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
 * Starts an export of a snapshot to Amazon S3. The provided IAM role must have
 * access to the S3 bucket.
 * </p>
 */
public class StartExportTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is to be exported
     * to.
     * </p>
     */
    private String exportTaskIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     */
    private String sourceArn;

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when
     * exporting a snapshot.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to
     * Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key
     * identifier, or the KMS key alias for the KMS encryption key. The IAM role
     * used for the snapshot export must have encryption and decryption
     * permissions to use this KMS key.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the
     * exported snapshot.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not
     * provided, all the snapshot data is exported. Valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data from a specified database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table</code> <i>table-name</i> - Export a table of the
     * snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB,
     * and Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema</code> <i>schema-name</i> - Export a database
     * schema of the snapshot. This format is valid only for RDS for PostgreSQL
     * and Aurora PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table</code> <i>table-name</i> - Export a table of
     * the database schema. This format is valid only for RDS for PostgreSQL and
     * Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> exportOnly;

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is to be exported
     * to.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the snapshot export task. This ID isn't
     *         an identifier for the Amazon S3 bucket where the snapshot is to
     *         be exported to.
     *         </p>
     */
    public String getExportTaskIdentifier() {
        return exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is to be exported
     * to.
     * </p>
     *
     * @param exportTaskIdentifier <p>
     *            A unique identifier for the snapshot export task. This ID
     *            isn't an identifier for the Amazon S3 bucket where the
     *            snapshot is to be exported to.
     *            </p>
     */
    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is to be exported
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTaskIdentifier <p>
     *            A unique identifier for the snapshot export task. This ID
     *            isn't an identifier for the Amazon S3 bucket where the
     *            snapshot is to be exported to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the snapshot to export to
     *         Amazon S3.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot to export to
     *            Amazon S3.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot to export to
     *            Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket to export the snapshot to.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     *
     * @param s3BucketName <p>
     *            The name of the Amazon S3 bucket to export the snapshot to.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketName <p>
     *            The name of the Amazon S3 bucket to export the snapshot to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when
     * exporting a snapshot.
     * </p>
     *
     * @return <p>
     *         The name of the IAM role to use for writing to the Amazon S3
     *         bucket when exporting a snapshot.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when
     * exporting a snapshot.
     * </p>
     *
     * @param iamRoleArn <p>
     *            The name of the IAM role to use for writing to the Amazon S3
     *            bucket when exporting a snapshot.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when
     * exporting a snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoleArn <p>
     *            The name of the IAM role to use for writing to the Amazon S3
     *            bucket when exporting a snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to
     * Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key
     * identifier, or the KMS key alias for the KMS encryption key. The IAM role
     * used for the snapshot export must have encryption and decryption
     * permissions to use this KMS key.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS KMS key to use to encrypt the snapshot exported
     *         to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN),
     *         the KMS key identifier, or the KMS key alias for the KMS
     *         encryption key. The IAM role used for the snapshot export must
     *         have encryption and decryption permissions to use this KMS key.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to
     * Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key
     * identifier, or the KMS key alias for the KMS encryption key. The IAM role
     * used for the snapshot export must have encryption and decryption
     * permissions to use this KMS key.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS KMS key to use to encrypt the snapshot
     *            exported to Amazon S3. The KMS key ID is the Amazon Resource
     *            Name (ARN), the KMS key identifier, or the KMS key alias for
     *            the KMS encryption key. The IAM role used for the snapshot
     *            export must have encryption and decryption permissions to use
     *            this KMS key.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to
     * Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key
     * identifier, or the KMS key alias for the KMS encryption key. The IAM role
     * used for the snapshot export must have encryption and decryption
     * permissions to use this KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS KMS key to use to encrypt the snapshot
     *            exported to Amazon S3. The KMS key ID is the Amazon Resource
     *            Name (ARN), the KMS key identifier, or the KMS key alias for
     *            the KMS encryption key. The IAM role used for the snapshot
     *            export must have encryption and decryption permissions to use
     *            this KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the
     * exported snapshot.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket prefix to use as the file name and path of
     *         the exported snapshot.
     *         </p>
     */
    public String getS3Prefix() {
        return s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the
     * exported snapshot.
     * </p>
     *
     * @param s3Prefix <p>
     *            The Amazon S3 bucket prefix to use as the file name and path
     *            of the exported snapshot.
     *            </p>
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the
     * exported snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Prefix <p>
     *            The Amazon S3 bucket prefix to use as the file name and path
     *            of the exported snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
        return this;
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not
     * provided, all the snapshot data is exported. Valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data from a specified database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table</code> <i>table-name</i> - Export a table of the
     * snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB,
     * and Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema</code> <i>schema-name</i> - Export a database
     * schema of the snapshot. This format is valid only for RDS for PostgreSQL
     * and Aurora PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table</code> <i>table-name</i> - Export a table of
     * the database schema. This format is valid only for RDS for PostgreSQL and
     * Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The data to be exported from the snapshot. If this parameter is
     *         not provided, all the snapshot data is exported. Valid values are
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>database</code> - Export all the data from a specified
     *         database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.table</code> <i>table-name</i> - Export a table of
     *         the snapshot. This format is valid only for RDS for MySQL, RDS
     *         for MariaDB, and Aurora MySQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.schema</code> <i>schema-name</i> - Export a
     *         database schema of the snapshot. This format is valid only for
     *         RDS for PostgreSQL and Aurora PostgreSQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.schema.table</code> <i>table-name</i> - Export a
     *         table of the database schema. This format is valid only for RDS
     *         for PostgreSQL and Aurora PostgreSQL.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getExportOnly() {
        return exportOnly;
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not
     * provided, all the snapshot data is exported. Valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data from a specified database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table</code> <i>table-name</i> - Export a table of the
     * snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB,
     * and Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema</code> <i>schema-name</i> - Export a database
     * schema of the snapshot. This format is valid only for RDS for PostgreSQL
     * and Aurora PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table</code> <i>table-name</i> - Export a table of
     * the database schema. This format is valid only for RDS for PostgreSQL and
     * Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     *
     * @param exportOnly <p>
     *            The data to be exported from the snapshot. If this parameter
     *            is not provided, all the snapshot data is exported. Valid
     *            values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>database</code> - Export all the data from a specified
     *            database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.table</code> <i>table-name</i> - Export a table
     *            of the snapshot. This format is valid only for RDS for MySQL,
     *            RDS for MariaDB, and Aurora MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.schema</code> <i>schema-name</i> - Export a
     *            database schema of the snapshot. This format is valid only for
     *            RDS for PostgreSQL and Aurora PostgreSQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.schema.table</code> <i>table-name</i> - Export
     *            a table of the database schema. This format is valid only for
     *            RDS for PostgreSQL and Aurora PostgreSQL.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setExportOnly(java.util.Collection<String> exportOnly) {
        if (exportOnly == null) {
            this.exportOnly = null;
            return;
        }

        this.exportOnly = new java.util.ArrayList<String>(exportOnly);
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not
     * provided, all the snapshot data is exported. Valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data from a specified database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table</code> <i>table-name</i> - Export a table of the
     * snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB,
     * and Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema</code> <i>schema-name</i> - Export a database
     * schema of the snapshot. This format is valid only for RDS for PostgreSQL
     * and Aurora PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table</code> <i>table-name</i> - Export a table of
     * the database schema. This format is valid only for RDS for PostgreSQL and
     * Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportOnly <p>
     *            The data to be exported from the snapshot. If this parameter
     *            is not provided, all the snapshot data is exported. Valid
     *            values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>database</code> - Export all the data from a specified
     *            database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.table</code> <i>table-name</i> - Export a table
     *            of the snapshot. This format is valid only for RDS for MySQL,
     *            RDS for MariaDB, and Aurora MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.schema</code> <i>schema-name</i> - Export a
     *            database schema of the snapshot. This format is valid only for
     *            RDS for PostgreSQL and Aurora PostgreSQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.schema.table</code> <i>table-name</i> - Export
     *            a table of the database schema. This format is valid only for
     *            RDS for PostgreSQL and Aurora PostgreSQL.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withExportOnly(String... exportOnly) {
        if (getExportOnly() == null) {
            this.exportOnly = new java.util.ArrayList<String>(exportOnly.length);
        }
        for (String value : exportOnly) {
            this.exportOnly.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not
     * provided, all the snapshot data is exported. Valid values are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data from a specified database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table</code> <i>table-name</i> - Export a table of the
     * snapshot. This format is valid only for RDS for MySQL, RDS for MariaDB,
     * and Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema</code> <i>schema-name</i> - Export a database
     * schema of the snapshot. This format is valid only for RDS for PostgreSQL
     * and Aurora PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table</code> <i>table-name</i> - Export a table of
     * the database schema. This format is valid only for RDS for PostgreSQL and
     * Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportOnly <p>
     *            The data to be exported from the snapshot. If this parameter
     *            is not provided, all the snapshot data is exported. Valid
     *            values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>database</code> - Export all the data from a specified
     *            database.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.table</code> <i>table-name</i> - Export a table
     *            of the snapshot. This format is valid only for RDS for MySQL,
     *            RDS for MariaDB, and Aurora MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.schema</code> <i>schema-name</i> - Export a
     *            database schema of the snapshot. This format is valid only for
     *            RDS for PostgreSQL and Aurora PostgreSQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>database.schema.table</code> <i>table-name</i> - Export
     *            a table of the database schema. This format is valid only for
     *            RDS for PostgreSQL and Aurora PostgreSQL.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportTaskRequest withExportOnly(java.util.Collection<String> exportOnly) {
        setExportOnly(exportOnly);
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
        if (getExportTaskIdentifier() != null)
            sb.append("ExportTaskIdentifier: " + getExportTaskIdentifier() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: " + getS3Prefix() + ",");
        if (getExportOnly() != null)
            sb.append("ExportOnly: " + getExportOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportTaskIdentifier() == null) ? 0 : getExportTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getExportOnly() == null) ? 0 : getExportOnly().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportTaskRequest == false)
            return false;
        StartExportTaskRequest other = (StartExportTaskRequest) obj;

        if (other.getExportTaskIdentifier() == null ^ this.getExportTaskIdentifier() == null)
            return false;
        if (other.getExportTaskIdentifier() != null
                && other.getExportTaskIdentifier().equals(this.getExportTaskIdentifier()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getExportOnly() == null ^ this.getExportOnly() == null)
            return false;
        if (other.getExportOnly() != null
                && other.getExportOnly().equals(this.getExportOnly()) == false)
            return false;
        return true;
    }
}
