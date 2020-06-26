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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Settings for exporting data to Amazon S3.
 * </p>
 */
public class S3Settings implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The external table definition.
     * </p>
     */
    private String externalTableDefinition;

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a
     * carriage return (<code>\n</code>).
     * </p>
     */
    private String csvRowDelimiter;

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default
     * is a comma.
     * </p>
     */
    private String csvDelimiter;

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided,
     * tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>.
     * If this parameter isn't specified, then the path used is
     * <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     */
    private String bucketFolder;

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to
     * GZIP to compress the target files. Either set this parameter to NONE (the
     * default) or don't use it to leave the files uncompressed. This parameter
     * applies to both .csv and .parquet file formats.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, gzip
     */
    private String compressionType;

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM)
     * role with permission to allow <code>"arn:aws:s3:::dms-*"</code> to use
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     */
    private String encryptionMode;

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>
     * , provide the AWS KMS key ID. The key that you use needs an attached
     * policy that enables AWS Identity and Access Management (IAM) user
     * permissions and allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     */
    private String serverSideEncryptionKmsKeyId;

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated
     * values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage
     * file format that features efficient compression and provides faster query
     * response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv, parquet
     */
    private String dataFormat;

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     * run-length encoding to store repeated values more efficiently. This is
     * the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they
     * are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     * encountered in a given column. The dictionary is stored in a dictionary
     * page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>plain, plain-dictionary, rle-dictionary
     */
    private String encodingType;

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the
     * dictionary page exceeds this, this column is stored using an encoding
     * type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes
     * (1 MiB), the maximum size of a dictionary page before it reverts to
     * <code>PLAIN</code> encoding. This size is used for .parquet file format
     * only.
     * </p>
     */
    private Integer dictPageSizeLimit;

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides
     * faster reads. But as the number of row groups grows, the slower writes
     * become. This parameter defaults to 10,000 rows. This number is used for
     * .parquet file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum,
     * <code>RowGroupLength</code> is set to the max row group length in bytes
     * (64 * 1024 * 1024).
     * </p>
     */
    private Integer rowGroupLength;

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 *
     * 1024 bytes (1 MiB). This number is used for .parquet file format only.
     * </p>
     */
    private Integer dataPageSize;

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use:
     * <code>parquet_1_0</code> (the default) or <code>parquet_2_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>parquet-1-0, parquet-2-0
     */
    private String parquetVersion;

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose
     * <code>true</code> to enable statistics, <code>false</code> to disable.
     * Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     * <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to
     * <code>true</code>. This value is used for .parquet file format only.
     * </p>
     */
    private Boolean enableStatistics;

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the
     * comma-separated value (.csv) output files only to indicate how the rows
     * were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the
     * <code>false</code> setting), no information is recorded in these output
     * files for a full load to indicate that the rows were inserted at the
     * source database. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of
     * your target records from a full load to be consistent with the target
     * records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the
     * <code>CdcInsertsAndUpdates</code> parameters for output to .csv files
     * only. For more information about how these settings work together, see <a
     * href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     */
    private Boolean includeOpForFullLoad;

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only
     * INSERT operations to .csv or columnar storage (.parquet) output files. By
     * default (the <code>false</code> setting), the first field in a .csv or
     * .parquet record contains the letter I (INSERT), U (UPDATE), or D
     * (DELETE). These values indicate whether the row was inserted, updated, or
     * deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     * <code>y</code>, only INSERTs from the source database are migrated to the
     * .csv or .parquet file. For .csv format only, how these INSERTs are
     * recorded depends on the value of <code>IncludeOpForFullLoad</code>. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the first
     * field of every CDC record is set to I to indicate the INSERT operation at
     * the source. If <code>IncludeOpForFullLoad</code> is set to
     * <code>false</code>, every CDC record is written without a first field to
     * indicate the INSERT operation at the source. For more information about
     * how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the
     * <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     * parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     */
    private Boolean cdcInsertsOnly;

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp
     * information to the endpoint data for an Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or
     * .parquet object files of your migrated data when you set
     * <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp
     * for when the data was transferred from the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column
     * contains the timestamp for the commit of that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is
     * <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the precision of
     * this value is in microseconds. For a CDC load, the rounding of the
     * precision depends on the commit timestamp supported by DMS for the source
     * database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>
     * , DMS also includes a name for the timestamp column that you set with
     * <code>TimestampColumnName</code>.
     * </p>
     */
    private String timestampColumnName;

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column
     * values that are written to an Amazon S3 object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter
     * in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to
     * <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with
     * millisecond precision. Otherwise, DMS writes them with microsecond
     * precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond
     * precision for <code>TIMESTAMP</code> values. Set this parameter to
     * <code>true</code> for S3 endpoint object files that are .parquet
     * formatted only if you plan to query or process the data with Athena or
     * AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3
     * file in .csv format with microsecond precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the
     * string format of the timestamp column value that is inserted by setting
     * the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     */
    private Boolean parquetTimestampInMillisecond;

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and
     * UPDATE operations to .csv or .parquet (columnar storage) output files.
     * The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code>or
     * <code>y</code>, INSERTs and UPDATEs from the source database are migrated
     * to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded
     * depends on the value of the <code>IncludeOpForFullLoad</code> parameter.
     * If <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the
     * first field of every CDC record is set to either <code>I</code> or
     * <code>U</code> to indicate INSERT and UPDATE operations at the source.
     * But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     * CDC records are written without an indication of INSERT or UPDATE
     * operations at the source. For more information about how these settings
     * work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     * parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     */
    private Boolean cdcInsertsAndUpdates;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) used by the service access IAM
     *         role.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) used by the service access IAM
     *            role.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) used by the service access IAM
     *            role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     *
     * @return <p>
     *         The external table definition.
     *         </p>
     */
    public String getExternalTableDefinition() {
        return externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     *
     * @param externalTableDefinition <p>
     *            The external table definition.
     *            </p>
     */
    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalTableDefinition <p>
     *            The external table definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
        return this;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a
     * carriage return (<code>\n</code>).
     * </p>
     *
     * @return <p>
     *         The delimiter used to separate rows in the source files. The
     *         default is a carriage return (<code>\n</code>).
     *         </p>
     */
    public String getCsvRowDelimiter() {
        return csvRowDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a
     * carriage return (<code>\n</code>).
     * </p>
     *
     * @param csvRowDelimiter <p>
     *            The delimiter used to separate rows in the source files. The
     *            default is a carriage return (<code>\n</code>).
     *            </p>
     */
    public void setCsvRowDelimiter(String csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate rows in the source files. The default is a
     * carriage return (<code>\n</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvRowDelimiter <p>
     *            The delimiter used to separate rows in the source files. The
     *            default is a carriage return (<code>\n</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withCsvRowDelimiter(String csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
        return this;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default
     * is a comma.
     * </p>
     *
     * @return <p>
     *         The delimiter used to separate columns in the source files. The
     *         default is a comma.
     *         </p>
     */
    public String getCsvDelimiter() {
        return csvDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default
     * is a comma.
     * </p>
     *
     * @param csvDelimiter <p>
     *            The delimiter used to separate columns in the source files.
     *            The default is a comma.
     *            </p>
     */
    public void setCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
    }

    /**
     * <p>
     * The delimiter used to separate columns in the source files. The default
     * is a comma.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvDelimiter <p>
     *            The delimiter used to separate columns in the source files.
     *            The default is a comma.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
        return this;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided,
     * tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>.
     * If this parameter isn't specified, then the path used is
     * <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     *
     * @return <p>
     *         An optional parameter to set a folder name in the S3 bucket. If
     *         provided, tables are created in the path
     *         <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>
     *         . If this parameter isn't specified, then the path used is
     *         <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     *         </p>
     */
    public String getBucketFolder() {
        return bucketFolder;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided,
     * tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>.
     * If this parameter isn't specified, then the path used is
     * <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     *
     * @param bucketFolder <p>
     *            An optional parameter to set a folder name in the S3 bucket.
     *            If provided, tables are created in the path
     *            <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>
     *            . If this parameter isn't specified, then the path used is
     *            <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     *            </p>
     */
    public void setBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    /**
     * <p>
     * An optional parameter to set a folder name in the S3 bucket. If provided,
     * tables are created in the path
     * <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>.
     * If this parameter isn't specified, then the path used is
     * <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketFolder <p>
     *            An optional parameter to set a folder name in the S3 bucket.
     *            If provided, tables are created in the path
     *            <code> <i>bucketFolder</i>/<i>schema_name</i>/<i>table_name</i>/</code>
     *            . If this parameter isn't specified, then the path used is
     *            <code> <i>schema_name</i>/<i>table_name</i>/</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     *
     * @return <p>
     *         The name of the S3 bucket.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The name of the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to
     * GZIP to compress the target files. Either set this parameter to NONE (the
     * default) or don't use it to leave the files uncompressed. This parameter
     * applies to both .csv and .parquet file formats.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, gzip
     *
     * @return <p>
     *         An optional parameter to use GZIP to compress the target files.
     *         Set to GZIP to compress the target files. Either set this
     *         parameter to NONE (the default) or don't use it to leave the
     *         files uncompressed. This parameter applies to both .csv and
     *         .parquet file formats.
     *         </p>
     * @see CompressionTypeValue
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to
     * GZIP to compress the target files. Either set this parameter to NONE (the
     * default) or don't use it to leave the files uncompressed. This parameter
     * applies to both .csv and .parquet file formats.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, gzip
     *
     * @param compressionType <p>
     *            An optional parameter to use GZIP to compress the target
     *            files. Set to GZIP to compress the target files. Either set
     *            this parameter to NONE (the default) or don't use it to leave
     *            the files uncompressed. This parameter applies to both .csv
     *            and .parquet file formats.
     *            </p>
     * @see CompressionTypeValue
     */
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to
     * GZIP to compress the target files. Either set this parameter to NONE (the
     * default) or don't use it to leave the files uncompressed. This parameter
     * applies to both .csv and .parquet file formats.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, gzip
     *
     * @param compressionType <p>
     *            An optional parameter to use GZIP to compress the target
     *            files. Set to GZIP to compress the target files. Either set
     *            this parameter to NONE (the default) or don't use it to leave
     *            the files uncompressed. This parameter applies to both .csv
     *            and .parquet file formats.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionTypeValue
     */
    public S3Settings withCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to
     * GZIP to compress the target files. Either set this parameter to NONE (the
     * default) or don't use it to leave the files uncompressed. This parameter
     * applies to both .csv and .parquet file formats.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, gzip
     *
     * @param compressionType <p>
     *            An optional parameter to use GZIP to compress the target
     *            files. Set to GZIP to compress the target files. Either set
     *            this parameter to NONE (the default) or don't use it to leave
     *            the files uncompressed. This parameter applies to both .csv
     *            and .parquet file formats.
     *            </p>
     * @see CompressionTypeValue
     */
    public void setCompressionType(CompressionTypeValue compressionType) {
        this.compressionType = compressionType.toString();
    }

    /**
     * <p>
     * An optional parameter to use GZIP to compress the target files. Set to
     * GZIP to compress the target files. Either set this parameter to NONE (the
     * default) or don't use it to leave the files uncompressed. This parameter
     * applies to both .csv and .parquet file formats.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, gzip
     *
     * @param compressionType <p>
     *            An optional parameter to use GZIP to compress the target
     *            files. Set to GZIP to compress the target files. Either set
     *            this parameter to NONE (the default) or don't use it to leave
     *            the files uncompressed. This parameter applies to both .csv
     *            and .parquet file formats.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionTypeValue
     */
    public S3Settings withCompressionType(CompressionTypeValue compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM)
     * role with permission to allow <code>"arn:aws:s3:::dms-*"</code> to use
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @return <p>
     *         The type of server-side encryption that you want to use for your
     *         data. This encryption type is part of the endpoint settings or
     *         the extra connections attributes for Amazon S3. You can choose
     *         either <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>.
     *         To use <code>SSE_S3</code>, you need an AWS Identity and Access
     *         Management (IAM) role with permission to allow
     *         <code>"arn:aws:s3:::dms-*"</code> to use the following actions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3:CreateBucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:ListBucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:DeleteBucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetBucketLocation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:PutObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:DeleteObject</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetObjectVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:GetBucketPolicy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:PutBucketPolicy</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3:DeleteBucketPolicy</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see EncryptionModeValue
     */
    public String getEncryptionMode() {
        return encryptionMode;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM)
     * role with permission to allow <code>"arn:aws:s3:::dms-*"</code> to use
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @param encryptionMode <p>
     *            The type of server-side encryption that you want to use for
     *            your data. This encryption type is part of the endpoint
     *            settings or the extra connections attributes for Amazon S3.
     *            You can choose either <code>SSE_S3</code> (the default) or
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, you need an
     *            AWS Identity and Access Management (IAM) role with permission
     *            to allow <code>"arn:aws:s3:::dms-*"</code> to use the
     *            following actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3:CreateBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:ListBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketLocation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObjectVersion</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucketPolicy</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see EncryptionModeValue
     */
    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM)
     * role with permission to allow <code>"arn:aws:s3:::dms-*"</code> to use
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @param encryptionMode <p>
     *            The type of server-side encryption that you want to use for
     *            your data. This encryption type is part of the endpoint
     *            settings or the extra connections attributes for Amazon S3.
     *            You can choose either <code>SSE_S3</code> (the default) or
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, you need an
     *            AWS Identity and Access Management (IAM) role with permission
     *            to allow <code>"arn:aws:s3:::dms-*"</code> to use the
     *            following actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3:CreateBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:ListBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketLocation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObjectVersion</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucketPolicy</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionModeValue
     */
    public S3Settings withEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM)
     * role with permission to allow <code>"arn:aws:s3:::dms-*"</code> to use
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @param encryptionMode <p>
     *            The type of server-side encryption that you want to use for
     *            your data. This encryption type is part of the endpoint
     *            settings or the extra connections attributes for Amazon S3.
     *            You can choose either <code>SSE_S3</code> (the default) or
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, you need an
     *            AWS Identity and Access Management (IAM) role with permission
     *            to allow <code>"arn:aws:s3:::dms-*"</code> to use the
     *            following actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3:CreateBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:ListBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketLocation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObjectVersion</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucketPolicy</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see EncryptionModeValue
     */
    public void setEncryptionMode(EncryptionModeValue encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, you need an AWS Identity and Access Management (IAM)
     * role with permission to allow <code>"arn:aws:s3:::dms-*"</code> to use
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:CreateBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:ListBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketLocation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:GetBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutBucketPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteBucketPolicy</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @param encryptionMode <p>
     *            The type of server-side encryption that you want to use for
     *            your data. This encryption type is part of the endpoint
     *            settings or the extra connections attributes for Amazon S3.
     *            You can choose either <code>SSE_S3</code> (the default) or
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, you need an
     *            AWS Identity and Access Management (IAM) role with permission
     *            to allow <code>"arn:aws:s3:::dms-*"</code> to use the
     *            following actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3:CreateBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:ListBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketLocation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteObject</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetObjectVersion</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:GetBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:PutBucketPolicy</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3:DeleteBucketPolicy</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionModeValue
     */
    public S3Settings withEncryptionMode(EncryptionModeValue encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>
     * , provide the AWS KMS key ID. The key that you use needs an attached
     * policy that enables AWS Identity and Access Management (IAM) user
     * permissions and allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     *
     * @return <p>
     *         If you are using <code>SSE_KMS</code> for the
     *         <code>EncryptionMode</code>, provide the AWS KMS key ID. The key
     *         that you use needs an attached policy that enables AWS Identity
     *         and Access Management (IAM) user permissions and allows use of
     *         the key.
     *         </p>
     *         <p>
     *         Here is a CLI example:
     *         <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     *         </p>
     */
    public String getServerSideEncryptionKmsKeyId() {
        return serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>
     * , provide the AWS KMS key ID. The key that you use needs an attached
     * policy that enables AWS Identity and Access Management (IAM) user
     * permissions and allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     *
     * @param serverSideEncryptionKmsKeyId <p>
     *            If you are using <code>SSE_KMS</code> for the
     *            <code>EncryptionMode</code>, provide the AWS KMS key ID. The
     *            key that you use needs an attached policy that enables AWS
     *            Identity and Access Management (IAM) user permissions and
     *            allows use of the key.
     *            </p>
     *            <p>
     *            Here is a CLI example:
     *            <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     *            </p>
     */
    public void setServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * If you are using <code>SSE_KMS</code> for the <code>EncryptionMode</code>
     * , provide the AWS KMS key ID. The key that you use needs an attached
     * policy that enables AWS Identity and Access Management (IAM) user
     * permissions and allows use of the key.
     * </p>
     * <p>
     * Here is a CLI example:
     * <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionKmsKeyId <p>
     *            If you are using <code>SSE_KMS</code> for the
     *            <code>EncryptionMode</code>, provide the AWS KMS key ID. The
     *            key that you use needs an attached policy that enables AWS
     *            Identity and Access Management (IAM) user permissions and
     *            allows use of the key.
     *            </p>
     *            <p>
     *            Here is a CLI example:
     *            <code>aws dms create-endpoint --endpoint-identifier <i>value</i> --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=<i>value</i>,BucketFolder=<i>value</i>,BucketName=<i>value</i>,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=<i>value</i> </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
        return this;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated
     * values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage
     * file format that features efficient compression and provides faster query
     * response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv, parquet
     *
     * @return <p>
     *         The format of the data that you want to use for output. You can
     *         choose one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>csv</code> : This is a row-based file format with
     *         comma-separated values (.csv).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>parquet</code> : Apache Parquet (.parquet) is a columnar
     *         storage file format that features efficient compression and
     *         provides faster query response.
     *         </p>
     *         </li>
     *         </ul>
     * @see DataFormatValue
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated
     * values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage
     * file format that features efficient compression and provides faster query
     * response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv, parquet
     *
     * @param dataFormat <p>
     *            The format of the data that you want to use for output. You
     *            can choose one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>csv</code> : This is a row-based file format with
     *            comma-separated values (.csv).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>parquet</code> : Apache Parquet (.parquet) is a columnar
     *            storage file format that features efficient compression and
     *            provides faster query response.
     *            </p>
     *            </li>
     *            </ul>
     * @see DataFormatValue
     */
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated
     * values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage
     * file format that features efficient compression and provides faster query
     * response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv, parquet
     *
     * @param dataFormat <p>
     *            The format of the data that you want to use for output. You
     *            can choose one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>csv</code> : This is a row-based file format with
     *            comma-separated values (.csv).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>parquet</code> : Apache Parquet (.parquet) is a columnar
     *            storage file format that features efficient compression and
     *            provides faster query response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataFormatValue
     */
    public S3Settings withDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated
     * values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage
     * file format that features efficient compression and provides faster query
     * response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv, parquet
     *
     * @param dataFormat <p>
     *            The format of the data that you want to use for output. You
     *            can choose one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>csv</code> : This is a row-based file format with
     *            comma-separated values (.csv).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>parquet</code> : Apache Parquet (.parquet) is a columnar
     *            storage file format that features efficient compression and
     *            provides faster query response.
     *            </p>
     *            </li>
     *            </ul>
     * @see DataFormatValue
     */
    public void setDataFormat(DataFormatValue dataFormat) {
        this.dataFormat = dataFormat.toString();
    }

    /**
     * <p>
     * The format of the data that you want to use for output. You can choose
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>csv</code> : This is a row-based file format with comma-separated
     * values (.csv).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>parquet</code> : Apache Parquet (.parquet) is a columnar storage
     * file format that features efficient compression and provides faster query
     * response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv, parquet
     *
     * @param dataFormat <p>
     *            The format of the data that you want to use for output. You
     *            can choose one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>csv</code> : This is a row-based file format with
     *            comma-separated values (.csv).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>parquet</code> : Apache Parquet (.parquet) is a columnar
     *            storage file format that features efficient compression and
     *            provides faster query response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataFormatValue
     */
    public S3Settings withDataFormat(DataFormatValue dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     * run-length encoding to store repeated values more efficiently. This is
     * the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they
     * are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     * encountered in a given column. The dictionary is stored in a dictionary
     * page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>plain, plain-dictionary, rle-dictionary
     *
     * @return <p>
     *         The type of encoding you are using:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     *         run-length encoding to store repeated values more efficiently.
     *         This is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAIN</code> doesn't use encoding at all. Values are stored
     *         as they are.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     *         encountered in a given column. The dictionary is stored in a
     *         dictionary page for each column chunk.
     *         </p>
     *         </li>
     *         </ul>
     * @see EncodingTypeValue
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     * run-length encoding to store repeated values more efficiently. This is
     * the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they
     * are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     * encountered in a given column. The dictionary is stored in a dictionary
     * page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>plain, plain-dictionary, rle-dictionary
     *
     * @param encodingType <p>
     *            The type of encoding you are using:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RLE_DICTIONARY</code> uses a combination of bit-packing
     *            and run-length encoding to store repeated values more
     *            efficiently. This is the default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN</code> doesn't use encoding at all. Values are
     *            stored as they are.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN_DICTIONARY</code> builds a dictionary of the
     *            values encountered in a given column. The dictionary is stored
     *            in a dictionary page for each column chunk.
     *            </p>
     *            </li>
     *            </ul>
     * @see EncodingTypeValue
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     * run-length encoding to store repeated values more efficiently. This is
     * the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they
     * are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     * encountered in a given column. The dictionary is stored in a dictionary
     * page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>plain, plain-dictionary, rle-dictionary
     *
     * @param encodingType <p>
     *            The type of encoding you are using:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RLE_DICTIONARY</code> uses a combination of bit-packing
     *            and run-length encoding to store repeated values more
     *            efficiently. This is the default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN</code> doesn't use encoding at all. Values are
     *            stored as they are.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN_DICTIONARY</code> builds a dictionary of the
     *            values encountered in a given column. The dictionary is stored
     *            in a dictionary page for each column chunk.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingTypeValue
     */
    public S3Settings withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     * run-length encoding to store repeated values more efficiently. This is
     * the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they
     * are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     * encountered in a given column. The dictionary is stored in a dictionary
     * page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>plain, plain-dictionary, rle-dictionary
     *
     * @param encodingType <p>
     *            The type of encoding you are using:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RLE_DICTIONARY</code> uses a combination of bit-packing
     *            and run-length encoding to store repeated values more
     *            efficiently. This is the default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN</code> doesn't use encoding at all. Values are
     *            stored as they are.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN_DICTIONARY</code> builds a dictionary of the
     *            values encountered in a given column. The dictionary is stored
     *            in a dictionary page for each column chunk.
     *            </p>
     *            </li>
     *            </ul>
     * @see EncodingTypeValue
     */
    public void setEncodingType(EncodingTypeValue encodingType) {
        this.encodingType = encodingType.toString();
    }

    /**
     * <p>
     * The type of encoding you are using:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RLE_DICTIONARY</code> uses a combination of bit-packing and
     * run-length encoding to store repeated values more efficiently. This is
     * the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN</code> doesn't use encoding at all. Values are stored as they
     * are.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAIN_DICTIONARY</code> builds a dictionary of the values
     * encountered in a given column. The dictionary is stored in a dictionary
     * page for each column chunk.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>plain, plain-dictionary, rle-dictionary
     *
     * @param encodingType <p>
     *            The type of encoding you are using:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RLE_DICTIONARY</code> uses a combination of bit-packing
     *            and run-length encoding to store repeated values more
     *            efficiently. This is the default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN</code> doesn't use encoding at all. Values are
     *            stored as they are.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAIN_DICTIONARY</code> builds a dictionary of the
     *            values encountered in a given column. The dictionary is stored
     *            in a dictionary page for each column chunk.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingTypeValue
     */
    public S3Settings withEncodingType(EncodingTypeValue encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the
     * dictionary page exceeds this, this column is stored using an encoding
     * type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes
     * (1 MiB), the maximum size of a dictionary page before it reverts to
     * <code>PLAIN</code> encoding. This size is used for .parquet file format
     * only.
     * </p>
     *
     * @return <p>
     *         The maximum size of an encoded dictionary page of a column. If
     *         the dictionary page exceeds this, this column is stored using an
     *         encoding type of <code>PLAIN</code>. This parameter defaults to
     *         1024 * 1024 bytes (1 MiB), the maximum size of a dictionary page
     *         before it reverts to <code>PLAIN</code> encoding. This size is
     *         used for .parquet file format only.
     *         </p>
     */
    public Integer getDictPageSizeLimit() {
        return dictPageSizeLimit;
    }

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the
     * dictionary page exceeds this, this column is stored using an encoding
     * type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes
     * (1 MiB), the maximum size of a dictionary page before it reverts to
     * <code>PLAIN</code> encoding. This size is used for .parquet file format
     * only.
     * </p>
     *
     * @param dictPageSizeLimit <p>
     *            The maximum size of an encoded dictionary page of a column. If
     *            the dictionary page exceeds this, this column is stored using
     *            an encoding type of <code>PLAIN</code>. This parameter
     *            defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a
     *            dictionary page before it reverts to <code>PLAIN</code>
     *            encoding. This size is used for .parquet file format only.
     *            </p>
     */
    public void setDictPageSizeLimit(Integer dictPageSizeLimit) {
        this.dictPageSizeLimit = dictPageSizeLimit;
    }

    /**
     * <p>
     * The maximum size of an encoded dictionary page of a column. If the
     * dictionary page exceeds this, this column is stored using an encoding
     * type of <code>PLAIN</code>. This parameter defaults to 1024 * 1024 bytes
     * (1 MiB), the maximum size of a dictionary page before it reverts to
     * <code>PLAIN</code> encoding. This size is used for .parquet file format
     * only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dictPageSizeLimit <p>
     *            The maximum size of an encoded dictionary page of a column. If
     *            the dictionary page exceeds this, this column is stored using
     *            an encoding type of <code>PLAIN</code>. This parameter
     *            defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a
     *            dictionary page before it reverts to <code>PLAIN</code>
     *            encoding. This size is used for .parquet file format only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withDictPageSizeLimit(Integer dictPageSizeLimit) {
        this.dictPageSizeLimit = dictPageSizeLimit;
        return this;
    }

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides
     * faster reads. But as the number of row groups grows, the slower writes
     * become. This parameter defaults to 10,000 rows. This number is used for
     * .parquet file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum,
     * <code>RowGroupLength</code> is set to the max row group length in bytes
     * (64 * 1024 * 1024).
     * </p>
     *
     * @return <p>
     *         The number of rows in a row group. A smaller row group size
     *         provides faster reads. But as the number of row groups grows, the
     *         slower writes become. This parameter defaults to 10,000 rows.
     *         This number is used for .parquet file format only.
     *         </p>
     *         <p>
     *         If you choose a value larger than the maximum,
     *         <code>RowGroupLength</code> is set to the max row group length in
     *         bytes (64 * 1024 * 1024).
     *         </p>
     */
    public Integer getRowGroupLength() {
        return rowGroupLength;
    }

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides
     * faster reads. But as the number of row groups grows, the slower writes
     * become. This parameter defaults to 10,000 rows. This number is used for
     * .parquet file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum,
     * <code>RowGroupLength</code> is set to the max row group length in bytes
     * (64 * 1024 * 1024).
     * </p>
     *
     * @param rowGroupLength <p>
     *            The number of rows in a row group. A smaller row group size
     *            provides faster reads. But as the number of row groups grows,
     *            the slower writes become. This parameter defaults to 10,000
     *            rows. This number is used for .parquet file format only.
     *            </p>
     *            <p>
     *            If you choose a value larger than the maximum,
     *            <code>RowGroupLength</code> is set to the max row group length
     *            in bytes (64 * 1024 * 1024).
     *            </p>
     */
    public void setRowGroupLength(Integer rowGroupLength) {
        this.rowGroupLength = rowGroupLength;
    }

    /**
     * <p>
     * The number of rows in a row group. A smaller row group size provides
     * faster reads. But as the number of row groups grows, the slower writes
     * become. This parameter defaults to 10,000 rows. This number is used for
     * .parquet file format only.
     * </p>
     * <p>
     * If you choose a value larger than the maximum,
     * <code>RowGroupLength</code> is set to the max row group length in bytes
     * (64 * 1024 * 1024).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowGroupLength <p>
     *            The number of rows in a row group. A smaller row group size
     *            provides faster reads. But as the number of row groups grows,
     *            the slower writes become. This parameter defaults to 10,000
     *            rows. This number is used for .parquet file format only.
     *            </p>
     *            <p>
     *            If you choose a value larger than the maximum,
     *            <code>RowGroupLength</code> is set to the max row group length
     *            in bytes (64 * 1024 * 1024).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withRowGroupLength(Integer rowGroupLength) {
        this.rowGroupLength = rowGroupLength;
        return this;
    }

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 *
     * 1024 bytes (1 MiB). This number is used for .parquet file format only.
     * </p>
     *
     * @return <p>
     *         The size of one data page in bytes. This parameter defaults to
     *         1024 * 1024 bytes (1 MiB). This number is used for .parquet file
     *         format only.
     *         </p>
     */
    public Integer getDataPageSize() {
        return dataPageSize;
    }

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 *
     * 1024 bytes (1 MiB). This number is used for .parquet file format only.
     * </p>
     *
     * @param dataPageSize <p>
     *            The size of one data page in bytes. This parameter defaults to
     *            1024 * 1024 bytes (1 MiB). This number is used for .parquet
     *            file format only.
     *            </p>
     */
    public void setDataPageSize(Integer dataPageSize) {
        this.dataPageSize = dataPageSize;
    }

    /**
     * <p>
     * The size of one data page in bytes. This parameter defaults to 1024 *
     * 1024 bytes (1 MiB). This number is used for .parquet file format only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataPageSize <p>
     *            The size of one data page in bytes. This parameter defaults to
     *            1024 * 1024 bytes (1 MiB). This number is used for .parquet
     *            file format only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withDataPageSize(Integer dataPageSize) {
        this.dataPageSize = dataPageSize;
        return this;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use:
     * <code>parquet_1_0</code> (the default) or <code>parquet_2_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>parquet-1-0, parquet-2-0
     *
     * @return <p>
     *         The version of the Apache Parquet format that you want to use:
     *         <code>parquet_1_0</code> (the default) or
     *         <code>parquet_2_0</code>.
     *         </p>
     * @see ParquetVersionValue
     */
    public String getParquetVersion() {
        return parquetVersion;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use:
     * <code>parquet_1_0</code> (the default) or <code>parquet_2_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>parquet-1-0, parquet-2-0
     *
     * @param parquetVersion <p>
     *            The version of the Apache Parquet format that you want to use:
     *            <code>parquet_1_0</code> (the default) or
     *            <code>parquet_2_0</code>.
     *            </p>
     * @see ParquetVersionValue
     */
    public void setParquetVersion(String parquetVersion) {
        this.parquetVersion = parquetVersion;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use:
     * <code>parquet_1_0</code> (the default) or <code>parquet_2_0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>parquet-1-0, parquet-2-0
     *
     * @param parquetVersion <p>
     *            The version of the Apache Parquet format that you want to use:
     *            <code>parquet_1_0</code> (the default) or
     *            <code>parquet_2_0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParquetVersionValue
     */
    public S3Settings withParquetVersion(String parquetVersion) {
        this.parquetVersion = parquetVersion;
        return this;
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use:
     * <code>parquet_1_0</code> (the default) or <code>parquet_2_0</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>parquet-1-0, parquet-2-0
     *
     * @param parquetVersion <p>
     *            The version of the Apache Parquet format that you want to use:
     *            <code>parquet_1_0</code> (the default) or
     *            <code>parquet_2_0</code>.
     *            </p>
     * @see ParquetVersionValue
     */
    public void setParquetVersion(ParquetVersionValue parquetVersion) {
        this.parquetVersion = parquetVersion.toString();
    }

    /**
     * <p>
     * The version of the Apache Parquet format that you want to use:
     * <code>parquet_1_0</code> (the default) or <code>parquet_2_0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>parquet-1-0, parquet-2-0
     *
     * @param parquetVersion <p>
     *            The version of the Apache Parquet format that you want to use:
     *            <code>parquet_1_0</code> (the default) or
     *            <code>parquet_2_0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParquetVersionValue
     */
    public S3Settings withParquetVersion(ParquetVersionValue parquetVersion) {
        this.parquetVersion = parquetVersion.toString();
        return this;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose
     * <code>true</code> to enable statistics, <code>false</code> to disable.
     * Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     * <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to
     * <code>true</code>. This value is used for .parquet file format only.
     * </p>
     *
     * @return <p>
     *         A value that enables statistics for Parquet pages and row groups.
     *         Choose <code>true</code> to enable statistics, <code>false</code>
     *         to disable. Statistics include <code>NULL</code>,
     *         <code>DISTINCT</code>, <code>MAX</code>, and <code>MIN</code>
     *         values. This parameter defaults to <code>true</code>. This value
     *         is used for .parquet file format only.
     *         </p>
     */
    public Boolean isEnableStatistics() {
        return enableStatistics;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose
     * <code>true</code> to enable statistics, <code>false</code> to disable.
     * Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     * <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to
     * <code>true</code>. This value is used for .parquet file format only.
     * </p>
     *
     * @return <p>
     *         A value that enables statistics for Parquet pages and row groups.
     *         Choose <code>true</code> to enable statistics, <code>false</code>
     *         to disable. Statistics include <code>NULL</code>,
     *         <code>DISTINCT</code>, <code>MAX</code>, and <code>MIN</code>
     *         values. This parameter defaults to <code>true</code>. This value
     *         is used for .parquet file format only.
     *         </p>
     */
    public Boolean getEnableStatistics() {
        return enableStatistics;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose
     * <code>true</code> to enable statistics, <code>false</code> to disable.
     * Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     * <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to
     * <code>true</code>. This value is used for .parquet file format only.
     * </p>
     *
     * @param enableStatistics <p>
     *            A value that enables statistics for Parquet pages and row
     *            groups. Choose <code>true</code> to enable statistics,
     *            <code>false</code> to disable. Statistics include
     *            <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>,
     *            and <code>MIN</code> values. This parameter defaults to
     *            <code>true</code>. This value is used for .parquet file format
     *            only.
     *            </p>
     */
    public void setEnableStatistics(Boolean enableStatistics) {
        this.enableStatistics = enableStatistics;
    }

    /**
     * <p>
     * A value that enables statistics for Parquet pages and row groups. Choose
     * <code>true</code> to enable statistics, <code>false</code> to disable.
     * Statistics include <code>NULL</code>, <code>DISTINCT</code>,
     * <code>MAX</code>, and <code>MIN</code> values. This parameter defaults to
     * <code>true</code>. This value is used for .parquet file format only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableStatistics <p>
     *            A value that enables statistics for Parquet pages and row
     *            groups. Choose <code>true</code> to enable statistics,
     *            <code>false</code> to disable. Statistics include
     *            <code>NULL</code>, <code>DISTINCT</code>, <code>MAX</code>,
     *            and <code>MIN</code> values. This parameter defaults to
     *            <code>true</code>. This value is used for .parquet file format
     *            only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withEnableStatistics(Boolean enableStatistics) {
        this.enableStatistics = enableStatistics;
        return this;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the
     * comma-separated value (.csv) output files only to indicate how the rows
     * were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the
     * <code>false</code> setting), no information is recorded in these output
     * files for a full load to indicate that the rows were inserted at the
     * source database. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of
     * your target records from a full load to be consistent with the target
     * records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the
     * <code>CdcInsertsAndUpdates</code> parameters for output to .csv files
     * only. For more information about how these settings work together, see <a
     * href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that enables a full load to write INSERT operations to
     *         the comma-separated value (.csv) output files only to indicate
     *         how the rows were added to the source database.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter
     *         in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         For full load, records can only be inserted. By default (the
     *         <code>false</code> setting), no information is recorded in these
     *         output files for a full load to indicate that the rows were
     *         inserted at the source database. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>true</code> or
     *         <code>y</code>, the INSERT is recorded as an I annotation in the
     *         first field of the .csv file. This allows the format of your
     *         target records from a full load to be consistent with the target
     *         records from a CDC load.
     *         </p>
     *         <note>
     *         <p>
     *         This setting works together with the <code>CdcInsertsOnly</code>
     *         and the <code>CdcInsertsAndUpdates</code> parameters for output
     *         to .csv files only. For more information about how these settings
     *         work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>.
     *         </p>
     *         </note>
     */
    public Boolean isIncludeOpForFullLoad() {
        return includeOpForFullLoad;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the
     * comma-separated value (.csv) output files only to indicate how the rows
     * were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the
     * <code>false</code> setting), no information is recorded in these output
     * files for a full load to indicate that the rows were inserted at the
     * source database. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of
     * your target records from a full load to be consistent with the target
     * records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the
     * <code>CdcInsertsAndUpdates</code> parameters for output to .csv files
     * only. For more information about how these settings work together, see <a
     * href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that enables a full load to write INSERT operations to
     *         the comma-separated value (.csv) output files only to indicate
     *         how the rows were added to the source database.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter
     *         in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         For full load, records can only be inserted. By default (the
     *         <code>false</code> setting), no information is recorded in these
     *         output files for a full load to indicate that the rows were
     *         inserted at the source database. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>true</code> or
     *         <code>y</code>, the INSERT is recorded as an I annotation in the
     *         first field of the .csv file. This allows the format of your
     *         target records from a full load to be consistent with the target
     *         records from a CDC load.
     *         </p>
     *         <note>
     *         <p>
     *         This setting works together with the <code>CdcInsertsOnly</code>
     *         and the <code>CdcInsertsAndUpdates</code> parameters for output
     *         to .csv files only. For more information about how these settings
     *         work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>.
     *         </p>
     *         </note>
     */
    public Boolean getIncludeOpForFullLoad() {
        return includeOpForFullLoad;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the
     * comma-separated value (.csv) output files only to indicate how the rows
     * were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the
     * <code>false</code> setting), no information is recorded in these output
     * files for a full load to indicate that the rows were inserted at the
     * source database. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of
     * your target records from a full load to be consistent with the target
     * records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the
     * <code>CdcInsertsAndUpdates</code> parameters for output to .csv files
     * only. For more information about how these settings work together, see <a
     * href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     *
     * @param includeOpForFullLoad <p>
     *            A value that enables a full load to write INSERT operations to
     *            the comma-separated value (.csv) output files only to indicate
     *            how the rows were added to the source database.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>IncludeOpForFullLoad</code>
     *            parameter in versions 3.1.4 and later.
     *            </p>
     *            </note>
     *            <p>
     *            For full load, records can only be inserted. By default (the
     *            <code>false</code> setting), no information is recorded in
     *            these output files for a full load to indicate that the rows
     *            were inserted at the source database. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>true</code>
     *            or <code>y</code>, the INSERT is recorded as an I annotation
     *            in the first field of the .csv file. This allows the format of
     *            your target records from a full load to be consistent with the
     *            target records from a CDC load.
     *            </p>
     *            <note>
     *            <p>
     *            This setting works together with the
     *            <code>CdcInsertsOnly</code> and the
     *            <code>CdcInsertsAndUpdates</code> parameters for output to
     *            .csv files only. For more information about how these settings
     *            work together, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *            >Indicating Source DB Operations in Migrated S3 Data</a> in
     *            the <i>AWS Database Migration Service User Guide.</i>.
     *            </p>
     *            </note>
     */
    public void setIncludeOpForFullLoad(Boolean includeOpForFullLoad) {
        this.includeOpForFullLoad = includeOpForFullLoad;
    }

    /**
     * <p>
     * A value that enables a full load to write INSERT operations to the
     * comma-separated value (.csv) output files only to indicate how the rows
     * were added to the source database.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>IncludeOpForFullLoad</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * For full load, records can only be inserted. By default (the
     * <code>false</code> setting), no information is recorded in these output
     * files for a full load to indicate that the rows were inserted at the
     * source database. If <code>IncludeOpForFullLoad</code> is set to
     * <code>true</code> or <code>y</code>, the INSERT is recorded as an I
     * annotation in the first field of the .csv file. This allows the format of
     * your target records from a full load to be consistent with the target
     * records from a CDC load.
     * </p>
     * <note>
     * <p>
     * This setting works together with the <code>CdcInsertsOnly</code> and the
     * <code>CdcInsertsAndUpdates</code> parameters for output to .csv files
     * only. For more information about how these settings work together, see <a
     * href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeOpForFullLoad <p>
     *            A value that enables a full load to write INSERT operations to
     *            the comma-separated value (.csv) output files only to indicate
     *            how the rows were added to the source database.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>IncludeOpForFullLoad</code>
     *            parameter in versions 3.1.4 and later.
     *            </p>
     *            </note>
     *            <p>
     *            For full load, records can only be inserted. By default (the
     *            <code>false</code> setting), no information is recorded in
     *            these output files for a full load to indicate that the rows
     *            were inserted at the source database. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>true</code>
     *            or <code>y</code>, the INSERT is recorded as an I annotation
     *            in the first field of the .csv file. This allows the format of
     *            your target records from a full load to be consistent with the
     *            target records from a CDC load.
     *            </p>
     *            <note>
     *            <p>
     *            This setting works together with the
     *            <code>CdcInsertsOnly</code> and the
     *            <code>CdcInsertsAndUpdates</code> parameters for output to
     *            .csv files only. For more information about how these settings
     *            work together, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *            >Indicating Source DB Operations in Migrated S3 Data</a> in
     *            the <i>AWS Database Migration Service User Guide.</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withIncludeOpForFullLoad(Boolean includeOpForFullLoad) {
        this.includeOpForFullLoad = includeOpForFullLoad;
        return this;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only
     * INSERT operations to .csv or columnar storage (.parquet) output files. By
     * default (the <code>false</code> setting), the first field in a .csv or
     * .parquet record contains the letter I (INSERT), U (UPDATE), or D
     * (DELETE). These values indicate whether the row was inserted, updated, or
     * deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     * <code>y</code>, only INSERTs from the source database are migrated to the
     * .csv or .parquet file. For .csv format only, how these INSERTs are
     * recorded depends on the value of <code>IncludeOpForFullLoad</code>. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the first
     * field of every CDC record is set to I to indicate the INSERT operation at
     * the source. If <code>IncludeOpForFullLoad</code> is set to
     * <code>false</code>, every CDC record is written without a first field to
     * indicate the INSERT operation at the source. For more information about
     * how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the
     * <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     * parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that enables a change data capture (CDC) load to write
     *         only INSERT operations to .csv or columnar storage (.parquet)
     *         output files. By default (the <code>false</code> setting), the
     *         first field in a .csv or .parquet record contains the letter I
     *         (INSERT), U (UPDATE), or D (DELETE). These values indicate
     *         whether the row was inserted, updated, or deleted at the source
     *         database for a CDC load to the target.
     *         </p>
     *         <p>
     *         If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     *         <code>y</code>, only INSERTs from the source database are
     *         migrated to the .csv or .parquet file. For .csv format only, how
     *         these INSERTs are recorded depends on the value of
     *         <code>IncludeOpForFullLoad</code>. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *         the first field of every CDC record is set to I to indicate the
     *         INSERT operation at the source. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     *         every CDC record is written without a first field to indicate the
     *         INSERT operation at the source. For more information about how
     *         these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the interaction described preceding between the
     *         <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     *         parameters in versions 3.1.4 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code>
     *         can't both be set to <code>true</code> for the same endpoint. Set
     *         either <code>CdcInsertsOnly</code> or
     *         <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *         same endpoint, but not both.
     *         </p>
     *         </note>
     */
    public Boolean isCdcInsertsOnly() {
        return cdcInsertsOnly;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only
     * INSERT operations to .csv or columnar storage (.parquet) output files. By
     * default (the <code>false</code> setting), the first field in a .csv or
     * .parquet record contains the letter I (INSERT), U (UPDATE), or D
     * (DELETE). These values indicate whether the row was inserted, updated, or
     * deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     * <code>y</code>, only INSERTs from the source database are migrated to the
     * .csv or .parquet file. For .csv format only, how these INSERTs are
     * recorded depends on the value of <code>IncludeOpForFullLoad</code>. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the first
     * field of every CDC record is set to I to indicate the INSERT operation at
     * the source. If <code>IncludeOpForFullLoad</code> is set to
     * <code>false</code>, every CDC record is written without a first field to
     * indicate the INSERT operation at the source. For more information about
     * how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the
     * <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     * parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that enables a change data capture (CDC) load to write
     *         only INSERT operations to .csv or columnar storage (.parquet)
     *         output files. By default (the <code>false</code> setting), the
     *         first field in a .csv or .parquet record contains the letter I
     *         (INSERT), U (UPDATE), or D (DELETE). These values indicate
     *         whether the row was inserted, updated, or deleted at the source
     *         database for a CDC load to the target.
     *         </p>
     *         <p>
     *         If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     *         <code>y</code>, only INSERTs from the source database are
     *         migrated to the .csv or .parquet file. For .csv format only, how
     *         these INSERTs are recorded depends on the value of
     *         <code>IncludeOpForFullLoad</code>. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *         the first field of every CDC record is set to I to indicate the
     *         INSERT operation at the source. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     *         every CDC record is written without a first field to indicate the
     *         INSERT operation at the source. For more information about how
     *         these settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the interaction described preceding between the
     *         <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     *         parameters in versions 3.1.4 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code>
     *         can't both be set to <code>true</code> for the same endpoint. Set
     *         either <code>CdcInsertsOnly</code> or
     *         <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *         same endpoint, but not both.
     *         </p>
     *         </note>
     */
    public Boolean getCdcInsertsOnly() {
        return cdcInsertsOnly;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only
     * INSERT operations to .csv or columnar storage (.parquet) output files. By
     * default (the <code>false</code> setting), the first field in a .csv or
     * .parquet record contains the letter I (INSERT), U (UPDATE), or D
     * (DELETE). These values indicate whether the row was inserted, updated, or
     * deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     * <code>y</code>, only INSERTs from the source database are migrated to the
     * .csv or .parquet file. For .csv format only, how these INSERTs are
     * recorded depends on the value of <code>IncludeOpForFullLoad</code>. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the first
     * field of every CDC record is set to I to indicate the INSERT operation at
     * the source. If <code>IncludeOpForFullLoad</code> is set to
     * <code>false</code>, every CDC record is written without a first field to
     * indicate the INSERT operation at the source. For more information about
     * how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the
     * <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     * parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     *
     * @param cdcInsertsOnly <p>
     *            A value that enables a change data capture (CDC) load to write
     *            only INSERT operations to .csv or columnar storage (.parquet)
     *            output files. By default (the <code>false</code> setting), the
     *            first field in a .csv or .parquet record contains the letter I
     *            (INSERT), U (UPDATE), or D (DELETE). These values indicate
     *            whether the row was inserted, updated, or deleted at the
     *            source database for a CDC load to the target.
     *            </p>
     *            <p>
     *            If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     *            <code>y</code>, only INSERTs from the source database are
     *            migrated to the .csv or .parquet file. For .csv format only,
     *            how these INSERTs are recorded depends on the value of
     *            <code>IncludeOpForFullLoad</code>. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *            the first field of every CDC record is set to I to indicate
     *            the INSERT operation at the source. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>false</code>
     *            , every CDC record is written without a first field to
     *            indicate the INSERT operation at the source. For more
     *            information about how these settings work together, see <a
     *            href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *            >Indicating Source DB Operations in Migrated S3 Data</a> in
     *            the <i>AWS Database Migration Service User Guide.</i>.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the interaction described preceding between
     *            the <code>CdcInsertsOnly</code> and
     *            <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4
     *            and later.
     *            </p>
     *            <p>
     *            <code>CdcInsertsOnly</code> and
     *            <code>CdcInsertsAndUpdates</code> can't both be set to
     *            <code>true</code> for the same endpoint. Set either
     *            <code>CdcInsertsOnly</code> or
     *            <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *            same endpoint, but not both.
     *            </p>
     *            </note>
     */
    public void setCdcInsertsOnly(Boolean cdcInsertsOnly) {
        this.cdcInsertsOnly = cdcInsertsOnly;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write only
     * INSERT operations to .csv or columnar storage (.parquet) output files. By
     * default (the <code>false</code> setting), the first field in a .csv or
     * .parquet record contains the letter I (INSERT), U (UPDATE), or D
     * (DELETE). These values indicate whether the row was inserted, updated, or
     * deleted at the source database for a CDC load to the target.
     * </p>
     * <p>
     * If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     * <code>y</code>, only INSERTs from the source database are migrated to the
     * .csv or .parquet file. For .csv format only, how these INSERTs are
     * recorded depends on the value of <code>IncludeOpForFullLoad</code>. If
     * <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the first
     * field of every CDC record is set to I to indicate the INSERT operation at
     * the source. If <code>IncludeOpForFullLoad</code> is set to
     * <code>false</code>, every CDC record is written without a first field to
     * indicate the INSERT operation at the source. For more information about
     * how these settings work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the interaction described preceding between the
     * <code>CdcInsertsOnly</code> and <code>IncludeOpForFullLoad</code>
     * parameters in versions 3.1.4 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdcInsertsOnly <p>
     *            A value that enables a change data capture (CDC) load to write
     *            only INSERT operations to .csv or columnar storage (.parquet)
     *            output files. By default (the <code>false</code> setting), the
     *            first field in a .csv or .parquet record contains the letter I
     *            (INSERT), U (UPDATE), or D (DELETE). These values indicate
     *            whether the row was inserted, updated, or deleted at the
     *            source database for a CDC load to the target.
     *            </p>
     *            <p>
     *            If <code>CdcInsertsOnly</code> is set to <code>true</code> or
     *            <code>y</code>, only INSERTs from the source database are
     *            migrated to the .csv or .parquet file. For .csv format only,
     *            how these INSERTs are recorded depends on the value of
     *            <code>IncludeOpForFullLoad</code>. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *            the first field of every CDC record is set to I to indicate
     *            the INSERT operation at the source. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>false</code>
     *            , every CDC record is written without a first field to
     *            indicate the INSERT operation at the source. For more
     *            information about how these settings work together, see <a
     *            href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *            >Indicating Source DB Operations in Migrated S3 Data</a> in
     *            the <i>AWS Database Migration Service User Guide.</i>.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the interaction described preceding between
     *            the <code>CdcInsertsOnly</code> and
     *            <code>IncludeOpForFullLoad</code> parameters in versions 3.1.4
     *            and later.
     *            </p>
     *            <p>
     *            <code>CdcInsertsOnly</code> and
     *            <code>CdcInsertsAndUpdates</code> can't both be set to
     *            <code>true</code> for the same endpoint. Set either
     *            <code>CdcInsertsOnly</code> or
     *            <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *            same endpoint, but not both.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withCdcInsertsOnly(Boolean cdcInsertsOnly) {
        this.cdcInsertsOnly = cdcInsertsOnly;
        return this;
    }

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp
     * information to the endpoint data for an Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or
     * .parquet object files of your migrated data when you set
     * <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp
     * for when the data was transferred from the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column
     * contains the timestamp for the commit of that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is
     * <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the precision of
     * this value is in microseconds. For a CDC load, the rounding of the
     * precision depends on the commit timestamp supported by DMS for the source
     * database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>
     * , DMS also includes a name for the timestamp column that you set with
     * <code>TimestampColumnName</code>.
     * </p>
     *
     * @return <p>
     *         A value that when nonblank causes AWS DMS to add a column with
     *         timestamp information to the endpoint data for an Amazon S3
     *         target.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>TimestampColumnName</code> parameter
     *         in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         DMS includes an additional <code>STRING</code> column in the .csv
     *         or .parquet object files of your migrated data when you set
     *         <code>TimestampColumnName</code> to a nonblank value.
     *         </p>
     *         <p>
     *         For a full load, each row of this timestamp column contains a
     *         timestamp for when the data was transferred from the source to
     *         the target by DMS.
     *         </p>
     *         <p>
     *         For a change data capture (CDC) load, each row of the timestamp
     *         column contains the timestamp for the commit of that row in the
     *         source database.
     *         </p>
     *         <p>
     *         The string format for this timestamp column value is
     *         <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     *         precision of this value is in microseconds. For a CDC load, the
     *         rounding of the precision depends on the commit timestamp
     *         supported by DMS for the source database.
     *         </p>
     *         <p>
     *         When the <code>AddColumnName</code> parameter is set to
     *         <code>true</code>, DMS also includes a name for the timestamp
     *         column that you set with <code>TimestampColumnName</code>.
     *         </p>
     */
    public String getTimestampColumnName() {
        return timestampColumnName;
    }

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp
     * information to the endpoint data for an Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or
     * .parquet object files of your migrated data when you set
     * <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp
     * for when the data was transferred from the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column
     * contains the timestamp for the commit of that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is
     * <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the precision of
     * this value is in microseconds. For a CDC load, the rounding of the
     * precision depends on the commit timestamp supported by DMS for the source
     * database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>
     * , DMS also includes a name for the timestamp column that you set with
     * <code>TimestampColumnName</code>.
     * </p>
     *
     * @param timestampColumnName <p>
     *            A value that when nonblank causes AWS DMS to add a column with
     *            timestamp information to the endpoint data for an Amazon S3
     *            target.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>TimestampColumnName</code>
     *            parameter in versions 3.1.4 and later.
     *            </p>
     *            </note>
     *            <p>
     *            DMS includes an additional <code>STRING</code> column in the
     *            .csv or .parquet object files of your migrated data when you
     *            set <code>TimestampColumnName</code> to a nonblank value.
     *            </p>
     *            <p>
     *            For a full load, each row of this timestamp column contains a
     *            timestamp for when the data was transferred from the source to
     *            the target by DMS.
     *            </p>
     *            <p>
     *            For a change data capture (CDC) load, each row of the
     *            timestamp column contains the timestamp for the commit of that
     *            row in the source database.
     *            </p>
     *            <p>
     *            The string format for this timestamp column value is
     *            <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     *            precision of this value is in microseconds. For a CDC load,
     *            the rounding of the precision depends on the commit timestamp
     *            supported by DMS for the source database.
     *            </p>
     *            <p>
     *            When the <code>AddColumnName</code> parameter is set to
     *            <code>true</code>, DMS also includes a name for the timestamp
     *            column that you set with <code>TimestampColumnName</code>.
     *            </p>
     */
    public void setTimestampColumnName(String timestampColumnName) {
        this.timestampColumnName = timestampColumnName;
    }

    /**
     * <p>
     * A value that when nonblank causes AWS DMS to add a column with timestamp
     * information to the endpoint data for an Amazon S3 target.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>TimestampColumnName</code> parameter in
     * versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * DMS includes an additional <code>STRING</code> column in the .csv or
     * .parquet object files of your migrated data when you set
     * <code>TimestampColumnName</code> to a nonblank value.
     * </p>
     * <p>
     * For a full load, each row of this timestamp column contains a timestamp
     * for when the data was transferred from the source to the target by DMS.
     * </p>
     * <p>
     * For a change data capture (CDC) load, each row of the timestamp column
     * contains the timestamp for the commit of that row in the source database.
     * </p>
     * <p>
     * The string format for this timestamp column value is
     * <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the precision of
     * this value is in microseconds. For a CDC load, the rounding of the
     * precision depends on the commit timestamp supported by DMS for the source
     * database.
     * </p>
     * <p>
     * When the <code>AddColumnName</code> parameter is set to <code>true</code>
     * , DMS also includes a name for the timestamp column that you set with
     * <code>TimestampColumnName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestampColumnName <p>
     *            A value that when nonblank causes AWS DMS to add a column with
     *            timestamp information to the endpoint data for an Amazon S3
     *            target.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>TimestampColumnName</code>
     *            parameter in versions 3.1.4 and later.
     *            </p>
     *            </note>
     *            <p>
     *            DMS includes an additional <code>STRING</code> column in the
     *            .csv or .parquet object files of your migrated data when you
     *            set <code>TimestampColumnName</code> to a nonblank value.
     *            </p>
     *            <p>
     *            For a full load, each row of this timestamp column contains a
     *            timestamp for when the data was transferred from the source to
     *            the target by DMS.
     *            </p>
     *            <p>
     *            For a change data capture (CDC) load, each row of the
     *            timestamp column contains the timestamp for the commit of that
     *            row in the source database.
     *            </p>
     *            <p>
     *            The string format for this timestamp column value is
     *            <code>yyyy-MM-dd HH:mm:ss.SSSSSS</code>. By default, the
     *            precision of this value is in microseconds. For a CDC load,
     *            the rounding of the precision depends on the commit timestamp
     *            supported by DMS for the source database.
     *            </p>
     *            <p>
     *            When the <code>AddColumnName</code> parameter is set to
     *            <code>true</code>, DMS also includes a name for the timestamp
     *            column that you set with <code>TimestampColumnName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withTimestampColumnName(String timestampColumnName) {
        this.timestampColumnName = timestampColumnName;
        return this;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column
     * values that are written to an Amazon S3 object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter
     * in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to
     * <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with
     * millisecond precision. Otherwise, DMS writes them with microsecond
     * precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond
     * precision for <code>TIMESTAMP</code> values. Set this parameter to
     * <code>true</code> for S3 endpoint object files that are .parquet
     * formatted only if you plan to query or process the data with Athena or
     * AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3
     * file in .csv format with microsecond precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the
     * string format of the timestamp column value that is inserted by setting
     * the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that specifies the precision of any
     *         <code>TIMESTAMP</code> column values that are written to an
     *         Amazon S3 object file in .parquet format.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>ParquetTimestampInMillisecond</code>
     *         parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         When <code>ParquetTimestampInMillisecond</code> is set to
     *         <code>true</code> or <code>y</code>, AWS DMS writes all
     *         <code>TIMESTAMP</code> columns in a .parquet formatted file with
     *         millisecond precision. Otherwise, DMS writes them with
     *         microsecond precision.
     *         </p>
     *         <p>
     *         Currently, Amazon Athena and AWS Glue can handle only millisecond
     *         precision for <code>TIMESTAMP</code> values. Set this parameter
     *         to <code>true</code> for S3 endpoint object files that are
     *         .parquet formatted only if you plan to query or process the data
     *         with Athena or AWS Glue.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS writes any <code>TIMESTAMP</code> column values written
     *         to an S3 file in .csv format with microsecond precision.
     *         </p>
     *         <p>
     *         Setting <code>ParquetTimestampInMillisecond</code> has no effect
     *         on the string format of the timestamp column value that is
     *         inserted by setting the <code>TimestampColumnName</code>
     *         parameter.
     *         </p>
     *         </note>
     */
    public Boolean isParquetTimestampInMillisecond() {
        return parquetTimestampInMillisecond;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column
     * values that are written to an Amazon S3 object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter
     * in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to
     * <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with
     * millisecond precision. Otherwise, DMS writes them with microsecond
     * precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond
     * precision for <code>TIMESTAMP</code> values. Set this parameter to
     * <code>true</code> for S3 endpoint object files that are .parquet
     * formatted only if you plan to query or process the data with Athena or
     * AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3
     * file in .csv format with microsecond precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the
     * string format of the timestamp column value that is inserted by setting
     * the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that specifies the precision of any
     *         <code>TIMESTAMP</code> column values that are written to an
     *         Amazon S3 object file in .parquet format.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>ParquetTimestampInMillisecond</code>
     *         parameter in versions 3.1.4 and later.
     *         </p>
     *         </note>
     *         <p>
     *         When <code>ParquetTimestampInMillisecond</code> is set to
     *         <code>true</code> or <code>y</code>, AWS DMS writes all
     *         <code>TIMESTAMP</code> columns in a .parquet formatted file with
     *         millisecond precision. Otherwise, DMS writes them with
     *         microsecond precision.
     *         </p>
     *         <p>
     *         Currently, Amazon Athena and AWS Glue can handle only millisecond
     *         precision for <code>TIMESTAMP</code> values. Set this parameter
     *         to <code>true</code> for S3 endpoint object files that are
     *         .parquet formatted only if you plan to query or process the data
     *         with Athena or AWS Glue.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS writes any <code>TIMESTAMP</code> column values written
     *         to an S3 file in .csv format with microsecond precision.
     *         </p>
     *         <p>
     *         Setting <code>ParquetTimestampInMillisecond</code> has no effect
     *         on the string format of the timestamp column value that is
     *         inserted by setting the <code>TimestampColumnName</code>
     *         parameter.
     *         </p>
     *         </note>
     */
    public Boolean getParquetTimestampInMillisecond() {
        return parquetTimestampInMillisecond;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column
     * values that are written to an Amazon S3 object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter
     * in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to
     * <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with
     * millisecond precision. Otherwise, DMS writes them with microsecond
     * precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond
     * precision for <code>TIMESTAMP</code> values. Set this parameter to
     * <code>true</code> for S3 endpoint object files that are .parquet
     * formatted only if you plan to query or process the data with Athena or
     * AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3
     * file in .csv format with microsecond precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the
     * string format of the timestamp column value that is inserted by setting
     * the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     *
     * @param parquetTimestampInMillisecond <p>
     *            A value that specifies the precision of any
     *            <code>TIMESTAMP</code> column values that are written to an
     *            Amazon S3 object file in .parquet format.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the
     *            <code>ParquetTimestampInMillisecond</code> parameter in
     *            versions 3.1.4 and later.
     *            </p>
     *            </note>
     *            <p>
     *            When <code>ParquetTimestampInMillisecond</code> is set to
     *            <code>true</code> or <code>y</code>, AWS DMS writes all
     *            <code>TIMESTAMP</code> columns in a .parquet formatted file
     *            with millisecond precision. Otherwise, DMS writes them with
     *            microsecond precision.
     *            </p>
     *            <p>
     *            Currently, Amazon Athena and AWS Glue can handle only
     *            millisecond precision for <code>TIMESTAMP</code> values. Set
     *            this parameter to <code>true</code> for S3 endpoint object
     *            files that are .parquet formatted only if you plan to query or
     *            process the data with Athena or AWS Glue.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS writes any <code>TIMESTAMP</code> column values
     *            written to an S3 file in .csv format with microsecond
     *            precision.
     *            </p>
     *            <p>
     *            Setting <code>ParquetTimestampInMillisecond</code> has no
     *            effect on the string format of the timestamp column value that
     *            is inserted by setting the <code>TimestampColumnName</code>
     *            parameter.
     *            </p>
     *            </note>
     */
    public void setParquetTimestampInMillisecond(Boolean parquetTimestampInMillisecond) {
        this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
    }

    /**
     * <p>
     * A value that specifies the precision of any <code>TIMESTAMP</code> column
     * values that are written to an Amazon S3 object file in .parquet format.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ParquetTimestampInMillisecond</code> parameter
     * in versions 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * When <code>ParquetTimestampInMillisecond</code> is set to
     * <code>true</code> or <code>y</code>, AWS DMS writes all
     * <code>TIMESTAMP</code> columns in a .parquet formatted file with
     * millisecond precision. Otherwise, DMS writes them with microsecond
     * precision.
     * </p>
     * <p>
     * Currently, Amazon Athena and AWS Glue can handle only millisecond
     * precision for <code>TIMESTAMP</code> values. Set this parameter to
     * <code>true</code> for S3 endpoint object files that are .parquet
     * formatted only if you plan to query or process the data with Athena or
     * AWS Glue.
     * </p>
     * <note>
     * <p>
     * AWS DMS writes any <code>TIMESTAMP</code> column values written to an S3
     * file in .csv format with microsecond precision.
     * </p>
     * <p>
     * Setting <code>ParquetTimestampInMillisecond</code> has no effect on the
     * string format of the timestamp column value that is inserted by setting
     * the <code>TimestampColumnName</code> parameter.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parquetTimestampInMillisecond <p>
     *            A value that specifies the precision of any
     *            <code>TIMESTAMP</code> column values that are written to an
     *            Amazon S3 object file in .parquet format.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the
     *            <code>ParquetTimestampInMillisecond</code> parameter in
     *            versions 3.1.4 and later.
     *            </p>
     *            </note>
     *            <p>
     *            When <code>ParquetTimestampInMillisecond</code> is set to
     *            <code>true</code> or <code>y</code>, AWS DMS writes all
     *            <code>TIMESTAMP</code> columns in a .parquet formatted file
     *            with millisecond precision. Otherwise, DMS writes them with
     *            microsecond precision.
     *            </p>
     *            <p>
     *            Currently, Amazon Athena and AWS Glue can handle only
     *            millisecond precision for <code>TIMESTAMP</code> values. Set
     *            this parameter to <code>true</code> for S3 endpoint object
     *            files that are .parquet formatted only if you plan to query or
     *            process the data with Athena or AWS Glue.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS writes any <code>TIMESTAMP</code> column values
     *            written to an S3 file in .csv format with microsecond
     *            precision.
     *            </p>
     *            <p>
     *            Setting <code>ParquetTimestampInMillisecond</code> has no
     *            effect on the string format of the timestamp column value that
     *            is inserted by setting the <code>TimestampColumnName</code>
     *            parameter.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withParquetTimestampInMillisecond(Boolean parquetTimestampInMillisecond) {
        this.parquetTimestampInMillisecond = parquetTimestampInMillisecond;
        return this;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and
     * UPDATE operations to .csv or .parquet (columnar storage) output files.
     * The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code>or
     * <code>y</code>, INSERTs and UPDATEs from the source database are migrated
     * to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded
     * depends on the value of the <code>IncludeOpForFullLoad</code> parameter.
     * If <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the
     * first field of every CDC record is set to either <code>I</code> or
     * <code>U</code> to indicate INSERT and UPDATE operations at the source.
     * But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     * CDC records are written without an indication of INSERT or UPDATE
     * operations at the source. For more information about how these settings
     * work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     * parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that enables a change data capture (CDC) load to write
     *         INSERT and UPDATE operations to .csv or .parquet (columnar
     *         storage) output files. The default setting is <code>false</code>,
     *         but when <code>CdcInsertsAndUpdates</code> is set to
     *         <code>true</code>or <code>y</code>, INSERTs and UPDATEs from the
     *         source database are migrated to the .csv or .parquet file.
     *         </p>
     *         <p>
     *         For .csv file format only, how these INSERTs and UPDATEs are
     *         recorded depends on the value of the
     *         <code>IncludeOpForFullLoad</code> parameter. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *         the first field of every CDC record is set to either
     *         <code>I</code> or <code>U</code> to indicate INSERT and UPDATE
     *         operations at the source. But if
     *         <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     *         CDC records are written without an indication of INSERT or UPDATE
     *         operations at the source. For more information about how these
     *         settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     *         parameter in versions 3.3.1 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code>
     *         can't both be set to <code>true</code> for the same endpoint. Set
     *         either <code>CdcInsertsOnly</code> or
     *         <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *         same endpoint, but not both.
     *         </p>
     *         </note>
     */
    public Boolean isCdcInsertsAndUpdates() {
        return cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and
     * UPDATE operations to .csv or .parquet (columnar storage) output files.
     * The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code>or
     * <code>y</code>, INSERTs and UPDATEs from the source database are migrated
     * to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded
     * depends on the value of the <code>IncludeOpForFullLoad</code> parameter.
     * If <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the
     * first field of every CDC record is set to either <code>I</code> or
     * <code>U</code> to indicate INSERT and UPDATE operations at the source.
     * But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     * CDC records are written without an indication of INSERT or UPDATE
     * operations at the source. For more information about how these settings
     * work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     * parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that enables a change data capture (CDC) load to write
     *         INSERT and UPDATE operations to .csv or .parquet (columnar
     *         storage) output files. The default setting is <code>false</code>,
     *         but when <code>CdcInsertsAndUpdates</code> is set to
     *         <code>true</code>or <code>y</code>, INSERTs and UPDATEs from the
     *         source database are migrated to the .csv or .parquet file.
     *         </p>
     *         <p>
     *         For .csv file format only, how these INSERTs and UPDATEs are
     *         recorded depends on the value of the
     *         <code>IncludeOpForFullLoad</code> parameter. If
     *         <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *         the first field of every CDC record is set to either
     *         <code>I</code> or <code>U</code> to indicate INSERT and UPDATE
     *         operations at the source. But if
     *         <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     *         CDC records are written without an indication of INSERT or UPDATE
     *         operations at the source. For more information about how these
     *         settings work together, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *         >Indicating Source DB Operations in Migrated S3 Data</a> in the
     *         <i>AWS Database Migration Service User Guide.</i>.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     *         parameter in versions 3.3.1 and later.
     *         </p>
     *         <p>
     *         <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code>
     *         can't both be set to <code>true</code> for the same endpoint. Set
     *         either <code>CdcInsertsOnly</code> or
     *         <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *         same endpoint, but not both.
     *         </p>
     *         </note>
     */
    public Boolean getCdcInsertsAndUpdates() {
        return cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and
     * UPDATE operations to .csv or .parquet (columnar storage) output files.
     * The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code>or
     * <code>y</code>, INSERTs and UPDATEs from the source database are migrated
     * to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded
     * depends on the value of the <code>IncludeOpForFullLoad</code> parameter.
     * If <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the
     * first field of every CDC record is set to either <code>I</code> or
     * <code>U</code> to indicate INSERT and UPDATE operations at the source.
     * But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     * CDC records are written without an indication of INSERT or UPDATE
     * operations at the source. For more information about how these settings
     * work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     * parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     *
     * @param cdcInsertsAndUpdates <p>
     *            A value that enables a change data capture (CDC) load to write
     *            INSERT and UPDATE operations to .csv or .parquet (columnar
     *            storage) output files. The default setting is
     *            <code>false</code>, but when <code>CdcInsertsAndUpdates</code>
     *            is set to <code>true</code>or <code>y</code>, INSERTs and
     *            UPDATEs from the source database are migrated to the .csv or
     *            .parquet file.
     *            </p>
     *            <p>
     *            For .csv file format only, how these INSERTs and UPDATEs are
     *            recorded depends on the value of the
     *            <code>IncludeOpForFullLoad</code> parameter. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *            the first field of every CDC record is set to either
     *            <code>I</code> or <code>U</code> to indicate INSERT and UPDATE
     *            operations at the source. But if
     *            <code>IncludeOpForFullLoad</code> is set to <code>false</code>
     *            , CDC records are written without an indication of INSERT or
     *            UPDATE operations at the source. For more information about
     *            how these settings work together, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *            >Indicating Source DB Operations in Migrated S3 Data</a> in
     *            the <i>AWS Database Migration Service User Guide.</i>.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the use of the
     *            <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1
     *            and later.
     *            </p>
     *            <p>
     *            <code>CdcInsertsOnly</code> and
     *            <code>CdcInsertsAndUpdates</code> can't both be set to
     *            <code>true</code> for the same endpoint. Set either
     *            <code>CdcInsertsOnly</code> or
     *            <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *            same endpoint, but not both.
     *            </p>
     *            </note>
     */
    public void setCdcInsertsAndUpdates(Boolean cdcInsertsAndUpdates) {
        this.cdcInsertsAndUpdates = cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * A value that enables a change data capture (CDC) load to write INSERT and
     * UPDATE operations to .csv or .parquet (columnar storage) output files.
     * The default setting is <code>false</code>, but when
     * <code>CdcInsertsAndUpdates</code> is set to <code>true</code>or
     * <code>y</code>, INSERTs and UPDATEs from the source database are migrated
     * to the .csv or .parquet file.
     * </p>
     * <p>
     * For .csv file format only, how these INSERTs and UPDATEs are recorded
     * depends on the value of the <code>IncludeOpForFullLoad</code> parameter.
     * If <code>IncludeOpForFullLoad</code> is set to <code>true</code>, the
     * first field of every CDC record is set to either <code>I</code> or
     * <code>U</code> to indicate INSERT and UPDATE operations at the source.
     * But if <code>IncludeOpForFullLoad</code> is set to <code>false</code>,
     * CDC records are written without an indication of INSERT or UPDATE
     * operations at the source. For more information about how these settings
     * work together, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     * >Indicating Source DB Operations in Migrated S3 Data</a> in the <i>AWS
     * Database Migration Service User Guide.</i>.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the use of the <code>CdcInsertsAndUpdates</code>
     * parameter in versions 3.3.1 and later.
     * </p>
     * <p>
     * <code>CdcInsertsOnly</code> and <code>CdcInsertsAndUpdates</code> can't
     * both be set to <code>true</code> for the same endpoint. Set either
     * <code>CdcInsertsOnly</code> or <code>CdcInsertsAndUpdates</code> to
     * <code>true</code> for the same endpoint, but not both.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdcInsertsAndUpdates <p>
     *            A value that enables a change data capture (CDC) load to write
     *            INSERT and UPDATE operations to .csv or .parquet (columnar
     *            storage) output files. The default setting is
     *            <code>false</code>, but when <code>CdcInsertsAndUpdates</code>
     *            is set to <code>true</code>or <code>y</code>, INSERTs and
     *            UPDATEs from the source database are migrated to the .csv or
     *            .parquet file.
     *            </p>
     *            <p>
     *            For .csv file format only, how these INSERTs and UPDATEs are
     *            recorded depends on the value of the
     *            <code>IncludeOpForFullLoad</code> parameter. If
     *            <code>IncludeOpForFullLoad</code> is set to <code>true</code>,
     *            the first field of every CDC record is set to either
     *            <code>I</code> or <code>U</code> to indicate INSERT and UPDATE
     *            operations at the source. But if
     *            <code>IncludeOpForFullLoad</code> is set to <code>false</code>
     *            , CDC records are written without an indication of INSERT or
     *            UPDATE operations at the source. For more information about
     *            how these settings work together, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html#CHAP_Target.S3.Configuring.InsertOps"
     *            >Indicating Source DB Operations in Migrated S3 Data</a> in
     *            the <i>AWS Database Migration Service User Guide.</i>.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the use of the
     *            <code>CdcInsertsAndUpdates</code> parameter in versions 3.3.1
     *            and later.
     *            </p>
     *            <p>
     *            <code>CdcInsertsOnly</code> and
     *            <code>CdcInsertsAndUpdates</code> can't both be set to
     *            <code>true</code> for the same endpoint. Set either
     *            <code>CdcInsertsOnly</code> or
     *            <code>CdcInsertsAndUpdates</code> to <code>true</code> for the
     *            same endpoint, but not both.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Settings withCdcInsertsAndUpdates(Boolean cdcInsertsAndUpdates) {
        this.cdcInsertsAndUpdates = cdcInsertsAndUpdates;
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
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: " + getExternalTableDefinition() + ",");
        if (getCsvRowDelimiter() != null)
            sb.append("CsvRowDelimiter: " + getCsvRowDelimiter() + ",");
        if (getCsvDelimiter() != null)
            sb.append("CsvDelimiter: " + getCsvDelimiter() + ",");
        if (getBucketFolder() != null)
            sb.append("BucketFolder: " + getBucketFolder() + ",");
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getCompressionType() != null)
            sb.append("CompressionType: " + getCompressionType() + ",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: " + getEncryptionMode() + ",");
        if (getServerSideEncryptionKmsKeyId() != null)
            sb.append("ServerSideEncryptionKmsKeyId: " + getServerSideEncryptionKmsKeyId() + ",");
        if (getDataFormat() != null)
            sb.append("DataFormat: " + getDataFormat() + ",");
        if (getEncodingType() != null)
            sb.append("EncodingType: " + getEncodingType() + ",");
        if (getDictPageSizeLimit() != null)
            sb.append("DictPageSizeLimit: " + getDictPageSizeLimit() + ",");
        if (getRowGroupLength() != null)
            sb.append("RowGroupLength: " + getRowGroupLength() + ",");
        if (getDataPageSize() != null)
            sb.append("DataPageSize: " + getDataPageSize() + ",");
        if (getParquetVersion() != null)
            sb.append("ParquetVersion: " + getParquetVersion() + ",");
        if (getEnableStatistics() != null)
            sb.append("EnableStatistics: " + getEnableStatistics() + ",");
        if (getIncludeOpForFullLoad() != null)
            sb.append("IncludeOpForFullLoad: " + getIncludeOpForFullLoad() + ",");
        if (getCdcInsertsOnly() != null)
            sb.append("CdcInsertsOnly: " + getCdcInsertsOnly() + ",");
        if (getTimestampColumnName() != null)
            sb.append("TimestampColumnName: " + getTimestampColumnName() + ",");
        if (getParquetTimestampInMillisecond() != null)
            sb.append("ParquetTimestampInMillisecond: " + getParquetTimestampInMillisecond() + ",");
        if (getCdcInsertsAndUpdates() != null)
            sb.append("CdcInsertsAndUpdates: " + getCdcInsertsAndUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCsvRowDelimiter() == null) ? 0 : getCsvRowDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getCsvDelimiter() == null) ? 0 : getCsvDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getBucketFolder() == null) ? 0 : getBucketFolder().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode
                + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionKmsKeyId() == null) ? 0
                        : getServerSideEncryptionKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode
                + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
        hashCode = prime * hashCode
                + ((getDictPageSizeLimit() == null) ? 0 : getDictPageSizeLimit().hashCode());
        hashCode = prime * hashCode
                + ((getRowGroupLength() == null) ? 0 : getRowGroupLength().hashCode());
        hashCode = prime * hashCode
                + ((getDataPageSize() == null) ? 0 : getDataPageSize().hashCode());
        hashCode = prime * hashCode
                + ((getParquetVersion() == null) ? 0 : getParquetVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEnableStatistics() == null) ? 0 : getEnableStatistics().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeOpForFullLoad() == null) ? 0 : getIncludeOpForFullLoad().hashCode());
        hashCode = prime * hashCode
                + ((getCdcInsertsOnly() == null) ? 0 : getCdcInsertsOnly().hashCode());
        hashCode = prime * hashCode
                + ((getTimestampColumnName() == null) ? 0 : getTimestampColumnName().hashCode());
        hashCode = prime
                * hashCode
                + ((getParquetTimestampInMillisecond() == null) ? 0
                        : getParquetTimestampInMillisecond().hashCode());
        hashCode = prime * hashCode
                + ((getCdcInsertsAndUpdates() == null) ? 0 : getCdcInsertsAndUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Settings == false)
            return false;
        S3Settings other = (S3Settings) obj;

        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getExternalTableDefinition() == null ^ this.getExternalTableDefinition() == null)
            return false;
        if (other.getExternalTableDefinition() != null
                && other.getExternalTableDefinition().equals(this.getExternalTableDefinition()) == false)
            return false;
        if (other.getCsvRowDelimiter() == null ^ this.getCsvRowDelimiter() == null)
            return false;
        if (other.getCsvRowDelimiter() != null
                && other.getCsvRowDelimiter().equals(this.getCsvRowDelimiter()) == false)
            return false;
        if (other.getCsvDelimiter() == null ^ this.getCsvDelimiter() == null)
            return false;
        if (other.getCsvDelimiter() != null
                && other.getCsvDelimiter().equals(this.getCsvDelimiter()) == false)
            return false;
        if (other.getBucketFolder() == null ^ this.getBucketFolder() == null)
            return false;
        if (other.getBucketFolder() != null
                && other.getBucketFolder().equals(this.getBucketFolder()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null
                && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null
                && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() == null
                ^ this.getServerSideEncryptionKmsKeyId() == null)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() != null
                && other.getServerSideEncryptionKmsKeyId().equals(
                        this.getServerSideEncryptionKmsKeyId()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null
                && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getEncodingType() == null ^ this.getEncodingType() == null)
            return false;
        if (other.getEncodingType() != null
                && other.getEncodingType().equals(this.getEncodingType()) == false)
            return false;
        if (other.getDictPageSizeLimit() == null ^ this.getDictPageSizeLimit() == null)
            return false;
        if (other.getDictPageSizeLimit() != null
                && other.getDictPageSizeLimit().equals(this.getDictPageSizeLimit()) == false)
            return false;
        if (other.getRowGroupLength() == null ^ this.getRowGroupLength() == null)
            return false;
        if (other.getRowGroupLength() != null
                && other.getRowGroupLength().equals(this.getRowGroupLength()) == false)
            return false;
        if (other.getDataPageSize() == null ^ this.getDataPageSize() == null)
            return false;
        if (other.getDataPageSize() != null
                && other.getDataPageSize().equals(this.getDataPageSize()) == false)
            return false;
        if (other.getParquetVersion() == null ^ this.getParquetVersion() == null)
            return false;
        if (other.getParquetVersion() != null
                && other.getParquetVersion().equals(this.getParquetVersion()) == false)
            return false;
        if (other.getEnableStatistics() == null ^ this.getEnableStatistics() == null)
            return false;
        if (other.getEnableStatistics() != null
                && other.getEnableStatistics().equals(this.getEnableStatistics()) == false)
            return false;
        if (other.getIncludeOpForFullLoad() == null ^ this.getIncludeOpForFullLoad() == null)
            return false;
        if (other.getIncludeOpForFullLoad() != null
                && other.getIncludeOpForFullLoad().equals(this.getIncludeOpForFullLoad()) == false)
            return false;
        if (other.getCdcInsertsOnly() == null ^ this.getCdcInsertsOnly() == null)
            return false;
        if (other.getCdcInsertsOnly() != null
                && other.getCdcInsertsOnly().equals(this.getCdcInsertsOnly()) == false)
            return false;
        if (other.getTimestampColumnName() == null ^ this.getTimestampColumnName() == null)
            return false;
        if (other.getTimestampColumnName() != null
                && other.getTimestampColumnName().equals(this.getTimestampColumnName()) == false)
            return false;
        if (other.getParquetTimestampInMillisecond() == null
                ^ this.getParquetTimestampInMillisecond() == null)
            return false;
        if (other.getParquetTimestampInMillisecond() != null
                && other.getParquetTimestampInMillisecond().equals(
                        this.getParquetTimestampInMillisecond()) == false)
            return false;
        if (other.getCdcInsertsAndUpdates() == null ^ this.getCdcInsertsAndUpdates() == null)
            return false;
        if (other.getCdcInsertsAndUpdates() != null
                && other.getCdcInsertsAndUpdates().equals(this.getCdcInsertsAndUpdates()) == false)
            return false;
        return true;
    }
}
