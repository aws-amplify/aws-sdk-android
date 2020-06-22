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

/**
 * <p>
 * Contains the details of a snapshot export to Amazon S3.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeExportTasks</code> action.
 * </p>
 */
public class ExportTask implements Serializable {
    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is exported to.
     * </p>
     */
    private String exportTaskIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     */
    private String sourceArn;

    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
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
     * The time that the snapshot was created.
     * </p>
     */
    private java.util.Date snapshotTime;

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     */
    private java.util.Date taskStartTime;

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     */
    private java.util.Date taskEndTime;

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the
     * exported snapshot.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when
     * exporting a snapshot.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's
     * exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN),
     * the KMS key identifier, or the KMS key alias for the KMS encryption key.
     * The IAM role used for the snapshot export must have encryption and
     * decryption permissions to use this KMS key.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     */
    private Integer percentProgress;

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     */
    private Integer totalExtractedDataInGB;

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     */
    private String failureCause;

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     */
    private String warningMessage;

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is exported to.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the snapshot export task. This ID isn't
     *         an identifier for the Amazon S3 bucket where the snapshot is
     *         exported to.
     *         </p>
     */
    public String getExportTaskIdentifier() {
        return exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is exported to.
     * </p>
     *
     * @param exportTaskIdentifier <p>
     *            A unique identifier for the snapshot export task. This ID
     *            isn't an identifier for the Amazon S3 bucket where the
     *            snapshot is exported to.
     *            </p>
     */
    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an
     * identifier for the Amazon S3 bucket where the snapshot is exported to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportTaskIdentifier <p>
     *            A unique identifier for the snapshot export task. This ID
     *            isn't an identifier for the Amazon S3 bucket where the
     *            snapshot is exported to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the snapshot exported to Amazon
     *         S3.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot exported to
     *            Amazon S3.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot exported to
     *            Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
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
     *         The data exported from the snapshot. Valid values are the
     *         following:
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
     * The data exported from the snapshot. Valid values are the following:
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
     *            The data exported from the snapshot. Valid values are the
     *            following:
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
     * The data exported from the snapshot. Valid values are the following:
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
     *            The data exported from the snapshot. Valid values are the
     *            following:
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
    public ExportTask withExportOnly(String... exportOnly) {
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
     * The data exported from the snapshot. Valid values are the following:
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
     *            The data exported from the snapshot. Valid values are the
     *            following:
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
    public ExportTask withExportOnly(java.util.Collection<String> exportOnly) {
        setExportOnly(exportOnly);
        return this;
    }

    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     *
     * @return <p>
     *         The time that the snapshot was created.
     *         </p>
     */
    public java.util.Date getSnapshotTime() {
        return snapshotTime;
    }

    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     *
     * @param snapshotTime <p>
     *            The time that the snapshot was created.
     *            </p>
     */
    public void setSnapshotTime(java.util.Date snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotTime <p>
     *            The time that the snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withSnapshotTime(java.util.Date snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     *
     * @return <p>
     *         The time that the snapshot export task started.
     *         </p>
     */
    public java.util.Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     *
     * @param taskStartTime <p>
     *            The time that the snapshot export task started.
     *            </p>
     */
    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStartTime <p>
     *            The time that the snapshot export task started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
        return this;
    }

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     *
     * @return <p>
     *         The time that the snapshot export task completed.
     *         </p>
     */
    public java.util.Date getTaskEndTime() {
        return taskEndTime;
    }

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     *
     * @param taskEndTime <p>
     *            The time that the snapshot export task completed.
     *            </p>
     */
    public void setTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskEndTime <p>
     *            The time that the snapshot export task completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket that the snapshot is exported to.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     *
     * @param s3Bucket <p>
     *            The Amazon S3 bucket that the snapshot is exported to.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Bucket <p>
     *            The Amazon S3 bucket that the snapshot is exported to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the
     * exported snapshot.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket prefix that is the file name and path of the
     *         exported snapshot.
     *         </p>
     */
    public String getS3Prefix() {
        return s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the
     * exported snapshot.
     * </p>
     *
     * @param s3Prefix <p>
     *            The Amazon S3 bucket prefix that is the file name and path of
     *            the exported snapshot.
     *            </p>
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the
     * exported snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Prefix <p>
     *            The Amazon S3 bucket prefix that is the file name and path of
     *            the exported snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
        return this;
    }

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when
     * exporting a snapshot.
     * </p>
     *
     * @return <p>
     *         The name of the IAM role that is used to write to Amazon S3 when
     *         exporting a snapshot.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when
     * exporting a snapshot.
     * </p>
     *
     * @param iamRoleArn <p>
     *            The name of the IAM role that is used to write to Amazon S3
     *            when exporting a snapshot.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when
     * exporting a snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoleArn <p>
     *            The name of the IAM role that is used to write to Amazon S3
     *            when exporting a snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's
     * exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN),
     * the KMS key identifier, or the KMS key alias for the KMS encryption key.
     * The IAM role used for the snapshot export must have encryption and
     * decryption permissions to use this KMS key.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS KMS key that is used to encrypt the snapshot
     *         when it's exported to Amazon S3. The KMS key ID is the Amazon
     *         Resource Name (ARN), the KMS key identifier, or the KMS key alias
     *         for the KMS encryption key. The IAM role used for the snapshot
     *         export must have encryption and decryption permissions to use
     *         this KMS key.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's
     * exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN),
     * the KMS key identifier, or the KMS key alias for the KMS encryption key.
     * The IAM role used for the snapshot export must have encryption and
     * decryption permissions to use this KMS key.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS KMS key that is used to encrypt the snapshot
     *            when it's exported to Amazon S3. The KMS key ID is the Amazon
     *            Resource Name (ARN), the KMS key identifier, or the KMS key
     *            alias for the KMS encryption key. The IAM role used for the
     *            snapshot export must have encryption and decryption
     *            permissions to use this KMS key.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's
     * exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN),
     * the KMS key identifier, or the KMS key alias for the KMS encryption key.
     * The IAM role used for the snapshot export must have encryption and
     * decryption permissions to use this KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS KMS key that is used to encrypt the snapshot
     *            when it's exported to Amazon S3. The KMS key ID is the Amazon
     *            Resource Name (ARN), the KMS key identifier, or the KMS key
     *            alias for the KMS encryption key. The IAM role used for the
     *            snapshot export must have encryption and decryption
     *            permissions to use this KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     *
     * @return <p>
     *         The progress status of the export task.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     *
     * @param status <p>
     *            The progress status of the export task.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The progress status of the export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     *
     * @return <p>
     *         The progress of the snapshot export task as a percentage.
     *         </p>
     */
    public Integer getPercentProgress() {
        return percentProgress;
    }

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     *
     * @param percentProgress <p>
     *            The progress of the snapshot export task as a percentage.
     *            </p>
     */
    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentProgress <p>
     *            The progress of the snapshot export task as a percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     *
     * @return <p>
     *         The total amount of data exported, in gigabytes.
     *         </p>
     */
    public Integer getTotalExtractedDataInGB() {
        return totalExtractedDataInGB;
    }

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     *
     * @param totalExtractedDataInGB <p>
     *            The total amount of data exported, in gigabytes.
     *            </p>
     */
    public void setTotalExtractedDataInGB(Integer totalExtractedDataInGB) {
        this.totalExtractedDataInGB = totalExtractedDataInGB;
    }

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalExtractedDataInGB <p>
     *            The total amount of data exported, in gigabytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withTotalExtractedDataInGB(Integer totalExtractedDataInGB) {
        this.totalExtractedDataInGB = totalExtractedDataInGB;
        return this;
    }

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     *
     * @return <p>
     *         The reason the export failed, if it failed.
     *         </p>
     */
    public String getFailureCause() {
        return failureCause;
    }

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     *
     * @param failureCause <p>
     *            The reason the export failed, if it failed.
     *            </p>
     */
    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureCause <p>
     *            The reason the export failed, if it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withFailureCause(String failureCause) {
        this.failureCause = failureCause;
        return this;
    }

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     *
     * @return <p>
     *         A warning about the snapshot export task.
     *         </p>
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     *
     * @param warningMessage <p>
     *            A warning about the snapshot export task.
     *            </p>
     */
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warningMessage <p>
     *            A warning about the snapshot export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTask withWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
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
        if (getExportOnly() != null)
            sb.append("ExportOnly: " + getExportOnly() + ",");
        if (getSnapshotTime() != null)
            sb.append("SnapshotTime: " + getSnapshotTime() + ",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: " + getTaskStartTime() + ",");
        if (getTaskEndTime() != null)
            sb.append("TaskEndTime: " + getTaskEndTime() + ",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: " + getS3Prefix() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getTotalExtractedDataInGB() != null)
            sb.append("TotalExtractedDataInGB: " + getTotalExtractedDataInGB() + ",");
        if (getFailureCause() != null)
            sb.append("FailureCause: " + getFailureCause() + ",");
        if (getWarningMessage() != null)
            sb.append("WarningMessage: " + getWarningMessage());
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
        hashCode = prime * hashCode + ((getExportOnly() == null) ? 0 : getExportOnly().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotTime() == null) ? 0 : getSnapshotTime().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalExtractedDataInGB() == null) ? 0 : getTotalExtractedDataInGB()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        hashCode = prime * hashCode
                + ((getWarningMessage() == null) ? 0 : getWarningMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTask == false)
            return false;
        ExportTask other = (ExportTask) obj;

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
        if (other.getExportOnly() == null ^ this.getExportOnly() == null)
            return false;
        if (other.getExportOnly() != null
                && other.getExportOnly().equals(this.getExportOnly()) == false)
            return false;
        if (other.getSnapshotTime() == null ^ this.getSnapshotTime() == null)
            return false;
        if (other.getSnapshotTime() != null
                && other.getSnapshotTime().equals(this.getSnapshotTime()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null
                && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskEndTime() == null ^ this.getTaskEndTime() == null)
            return false;
        if (other.getTaskEndTime() != null
                && other.getTaskEndTime().equals(this.getTaskEndTime()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null
                && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getTotalExtractedDataInGB() == null ^ this.getTotalExtractedDataInGB() == null)
            return false;
        if (other.getTotalExtractedDataInGB() != null
                && other.getTotalExtractedDataInGB().equals(this.getTotalExtractedDataInGB()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null
                && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        if (other.getWarningMessage() == null ^ this.getWarningMessage() == null)
            return false;
        if (other.getWarningMessage() != null
                && other.getWarningMessage().equals(this.getWarningMessage()) == false)
            return false;
        return true;
    }
}
