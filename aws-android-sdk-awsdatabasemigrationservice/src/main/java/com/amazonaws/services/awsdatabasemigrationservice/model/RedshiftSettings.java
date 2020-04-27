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
 * Provides information that defines an Amazon Redshift endpoint.
 * </p>
 */
public class RedshiftSettings implements Serializable {
    /**
     * <p>
     * A value that indicates to allow any date format, including invalid
     * formats such as 00/00/00 00:00:00, to be loaded without generating an
     * error. You can choose <code>true</code> or <code>false</code> (the
     * default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use
     * ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the
     * data doesn't match the DATEFORMAT specification, Amazon Redshift inserts
     * a NULL value into that field.
     * </p>
     */
    private Boolean acceptAnyDate;

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code
     * itself, not the name of a file containing the code.
     * </p>
     */
    private String afterConnectScript;

    /**
     * <p>
     * The location where the comma-separated value (.csv) files are stored
     * before being uploaded to the S3 bucket.
     * </p>
     */
    private String bucketFolder;

    /**
     * <p>
     * The name of the S3 bucket you want to use
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before
     * timing out, beginning from when you initially establish a connection.
     * </p>
     */
    private Integer connectionTimeout;

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are
     * working with.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code>
     * (case-sensitive), your date format string enclosed in quotes, or NULL. If
     * this parameter is left unset (NULL), it defaults to a format of
     * 'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some
     * that aren't supported when you use a date format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this to <code>auto</code>.
     * </p>
     */
    private String dateFormat;

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and
     * VARCHAR fields as NULL. A value of <code>true</code> sets empty CHAR and
     * VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     */
    private Boolean emptyAsNull;

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM)
     * role with a policy that allows <code>"arn:aws:s3:::*"</code> to use the
     * following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     */
    private String encryptionMode;

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter
     * accepts a value from 1 through 64. It defaults to 10.
     * </p>
     */
    private Integer fileTransferUploadStreams;

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out, beginning
     * from when you begin loading.
     * </p>
     */
    private Integer loadTimeout;

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to transfer data to Amazon
     * Redshift. This accepts a value from 1 through 1,048,576. It defaults to
     * 32,768 KB (32 MB).
     * </p>
     */
    private Integer maxFileSize;

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings
     * in the incoming data. All characters within the quotation marks,
     * including delimiters, are retained. Choose <code>true</code> to remove
     * quotation marks. The default is <code>false</code>.
     * </p>
     */
    private Boolean removeQuotes;

    /**
     * <p>
     * A list of characters that you want to replace. Use with
     * <code>ReplaceChars</code>.
     * </p>
     */
    private String replaceInvalidChars;

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in
     * <code>ReplaceInvalidChars</code>, substituting the specified characters
     * instead. The default is <code>"?"</code>.
     * </p>
     */
    private String replaceChars;

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the
     * Amazon Redshift service.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the
     * <code>EncryptionMode</code>, provide this key ID. The key that you use
     * needs an attached policy that enables IAM user permissions and allows use
     * of the key.
     * </p>
     */
    private String serverSideEncryptionKmsKeyId;

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code>
     * (case-sensitive), <code>'timeformat_string'</code>,
     * <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     * to 10. Using <code>auto</code> recognizes most strings, even some that
     * aren't supported when you use a time format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this parameter to <code>auto</code>.
     * </p>
     */
    private String timeFormat;

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from
     * a VARCHAR string. This parameter applies only to columns with a VARCHAR
     * data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     */
    private Boolean trimBlanks;

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate
     * number of characters, so that the data fits in the column. This parameter
     * applies only to columns with a VARCHAR or CHAR data type, and rows with a
     * size of 4 MB or less. Choose <code>true</code> to truncate data. The
     * default is <code>false</code>.
     * </p>
     */
    private Boolean truncateColumns;

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The size of the write buffer to use in rows. Valid values range from 1
     * through 2,048. The default is 1,024. Use this setting to tune
     * performance.
     * </p>
     */
    private Integer writeBufferSize;

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid
     * formats such as 00/00/00 00:00:00, to be loaded without generating an
     * error. You can choose <code>true</code> or <code>false</code> (the
     * default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use
     * ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the
     * data doesn't match the DATEFORMAT specification, Amazon Redshift inserts
     * a NULL value into that field.
     * </p>
     *
     * @return <p>
     *         A value that indicates to allow any date format, including
     *         invalid formats such as 00/00/00 00:00:00, to be loaded without
     *         generating an error. You can choose <code>true</code> or
     *         <code>false</code> (the default).
     *         </p>
     *         <p>
     *         This parameter applies only to TIMESTAMP and DATE columns. Always
     *         use ACCEPTANYDATE with the DATEFORMAT parameter. If the date
     *         format for the data doesn't match the DATEFORMAT specification,
     *         Amazon Redshift inserts a NULL value into that field.
     *         </p>
     */
    public Boolean isAcceptAnyDate() {
        return acceptAnyDate;
    }

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid
     * formats such as 00/00/00 00:00:00, to be loaded without generating an
     * error. You can choose <code>true</code> or <code>false</code> (the
     * default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use
     * ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the
     * data doesn't match the DATEFORMAT specification, Amazon Redshift inserts
     * a NULL value into that field.
     * </p>
     *
     * @return <p>
     *         A value that indicates to allow any date format, including
     *         invalid formats such as 00/00/00 00:00:00, to be loaded without
     *         generating an error. You can choose <code>true</code> or
     *         <code>false</code> (the default).
     *         </p>
     *         <p>
     *         This parameter applies only to TIMESTAMP and DATE columns. Always
     *         use ACCEPTANYDATE with the DATEFORMAT parameter. If the date
     *         format for the data doesn't match the DATEFORMAT specification,
     *         Amazon Redshift inserts a NULL value into that field.
     *         </p>
     */
    public Boolean getAcceptAnyDate() {
        return acceptAnyDate;
    }

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid
     * formats such as 00/00/00 00:00:00, to be loaded without generating an
     * error. You can choose <code>true</code> or <code>false</code> (the
     * default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use
     * ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the
     * data doesn't match the DATEFORMAT specification, Amazon Redshift inserts
     * a NULL value into that field.
     * </p>
     *
     * @param acceptAnyDate <p>
     *            A value that indicates to allow any date format, including
     *            invalid formats such as 00/00/00 00:00:00, to be loaded
     *            without generating an error. You can choose <code>true</code>
     *            or <code>false</code> (the default).
     *            </p>
     *            <p>
     *            This parameter applies only to TIMESTAMP and DATE columns.
     *            Always use ACCEPTANYDATE with the DATEFORMAT parameter. If the
     *            date format for the data doesn't match the DATEFORMAT
     *            specification, Amazon Redshift inserts a NULL value into that
     *            field.
     *            </p>
     */
    public void setAcceptAnyDate(Boolean acceptAnyDate) {
        this.acceptAnyDate = acceptAnyDate;
    }

    /**
     * <p>
     * A value that indicates to allow any date format, including invalid
     * formats such as 00/00/00 00:00:00, to be loaded without generating an
     * error. You can choose <code>true</code> or <code>false</code> (the
     * default).
     * </p>
     * <p>
     * This parameter applies only to TIMESTAMP and DATE columns. Always use
     * ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the
     * data doesn't match the DATEFORMAT specification, Amazon Redshift inserts
     * a NULL value into that field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptAnyDate <p>
     *            A value that indicates to allow any date format, including
     *            invalid formats such as 00/00/00 00:00:00, to be loaded
     *            without generating an error. You can choose <code>true</code>
     *            or <code>false</code> (the default).
     *            </p>
     *            <p>
     *            This parameter applies only to TIMESTAMP and DATE columns.
     *            Always use ACCEPTANYDATE with the DATEFORMAT parameter. If the
     *            date format for the data doesn't match the DATEFORMAT
     *            specification, Amazon Redshift inserts a NULL value into that
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withAcceptAnyDate(Boolean acceptAnyDate) {
        this.acceptAnyDate = acceptAnyDate;
        return this;
    }

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code
     * itself, not the name of a file containing the code.
     * </p>
     *
     * @return <p>
     *         Code to run after connecting. This parameter should contain the
     *         code itself, not the name of a file containing the code.
     *         </p>
     */
    public String getAfterConnectScript() {
        return afterConnectScript;
    }

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code
     * itself, not the name of a file containing the code.
     * </p>
     *
     * @param afterConnectScript <p>
     *            Code to run after connecting. This parameter should contain
     *            the code itself, not the name of a file containing the code.
     *            </p>
     */
    public void setAfterConnectScript(String afterConnectScript) {
        this.afterConnectScript = afterConnectScript;
    }

    /**
     * <p>
     * Code to run after connecting. This parameter should contain the code
     * itself, not the name of a file containing the code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterConnectScript <p>
     *            Code to run after connecting. This parameter should contain
     *            the code itself, not the name of a file containing the code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withAfterConnectScript(String afterConnectScript) {
        this.afterConnectScript = afterConnectScript;
        return this;
    }

    /**
     * <p>
     * The location where the comma-separated value (.csv) files are stored
     * before being uploaded to the S3 bucket.
     * </p>
     *
     * @return <p>
     *         The location where the comma-separated value (.csv) files are
     *         stored before being uploaded to the S3 bucket.
     *         </p>
     */
    public String getBucketFolder() {
        return bucketFolder;
    }

    /**
     * <p>
     * The location where the comma-separated value (.csv) files are stored
     * before being uploaded to the S3 bucket.
     * </p>
     *
     * @param bucketFolder <p>
     *            The location where the comma-separated value (.csv) files are
     *            stored before being uploaded to the S3 bucket.
     *            </p>
     */
    public void setBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    /**
     * <p>
     * The location where the comma-separated value (.csv) files are stored
     * before being uploaded to the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketFolder <p>
     *            The location where the comma-separated value (.csv) files are
     *            stored before being uploaded to the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket you want to use
     * </p>
     *
     * @return <p>
     *         The name of the S3 bucket you want to use
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket you want to use
     * </p>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket you want to use
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket you want to use
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The name of the S3 bucket you want to use
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before
     * timing out, beginning from when you initially establish a connection.
     * </p>
     *
     * @return <p>
     *         A value that sets the amount of time to wait (in milliseconds)
     *         before timing out, beginning from when you initially establish a
     *         connection.
     *         </p>
     */
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before
     * timing out, beginning from when you initially establish a connection.
     * </p>
     *
     * @param connectionTimeout <p>
     *            A value that sets the amount of time to wait (in milliseconds)
     *            before timing out, beginning from when you initially establish
     *            a connection.
     *            </p>
     */
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * <p>
     * A value that sets the amount of time to wait (in milliseconds) before
     * timing out, beginning from when you initially establish a connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionTimeout <p>
     *            A value that sets the amount of time to wait (in milliseconds)
     *            before timing out, beginning from when you initially establish
     *            a connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are
     * working with.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon Redshift data warehouse (service) that you
     *         are working with.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are
     * working with.
     * </p>
     *
     * @param databaseName <p>
     *            The name of the Amazon Redshift data warehouse (service) that
     *            you are working with.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift data warehouse (service) that you are
     * working with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name of the Amazon Redshift data warehouse (service) that
     *            you are working with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code>
     * (case-sensitive), your date format string enclosed in quotes, or NULL. If
     * this parameter is left unset (NULL), it defaults to a format of
     * 'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some
     * that aren't supported when you use a date format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this to <code>auto</code>.
     * </p>
     *
     * @return <p>
     *         The date format that you are using. Valid values are
     *         <code>auto</code> (case-sensitive), your date format string
     *         enclosed in quotes, or NULL. If this parameter is left unset
     *         (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
     *         <code>auto</code> recognizes most strings, even some that aren't
     *         supported when you use a date format string.
     *         </p>
     *         <p>
     *         If your date and time values use formats different from each
     *         other, set this to <code>auto</code>.
     *         </p>
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code>
     * (case-sensitive), your date format string enclosed in quotes, or NULL. If
     * this parameter is left unset (NULL), it defaults to a format of
     * 'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some
     * that aren't supported when you use a date format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this to <code>auto</code>.
     * </p>
     *
     * @param dateFormat <p>
     *            The date format that you are using. Valid values are
     *            <code>auto</code> (case-sensitive), your date format string
     *            enclosed in quotes, or NULL. If this parameter is left unset
     *            (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
     *            <code>auto</code> recognizes most strings, even some that
     *            aren't supported when you use a date format string.
     *            </p>
     *            <p>
     *            If your date and time values use formats different from each
     *            other, set this to <code>auto</code>.
     *            </p>
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * <p>
     * The date format that you are using. Valid values are <code>auto</code>
     * (case-sensitive), your date format string enclosed in quotes, or NULL. If
     * this parameter is left unset (NULL), it defaults to a format of
     * 'YYYY-MM-DD'. Using <code>auto</code> recognizes most strings, even some
     * that aren't supported when you use a date format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this to <code>auto</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateFormat <p>
     *            The date format that you are using. Valid values are
     *            <code>auto</code> (case-sensitive), your date format string
     *            enclosed in quotes, or NULL. If this parameter is left unset
     *            (NULL), it defaults to a format of 'YYYY-MM-DD'. Using
     *            <code>auto</code> recognizes most strings, even some that
     *            aren't supported when you use a date format string.
     *            </p>
     *            <p>
     *            If your date and time values use formats different from each
     *            other, set this to <code>auto</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and
     * VARCHAR fields as NULL. A value of <code>true</code> sets empty CHAR and
     * VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies whether AWS DMS should migrate empty CHAR
     *         and VARCHAR fields as NULL. A value of <code>true</code> sets
     *         empty CHAR and VARCHAR fields to null. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isEmptyAsNull() {
        return emptyAsNull;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and
     * VARCHAR fields as NULL. A value of <code>true</code> sets empty CHAR and
     * VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies whether AWS DMS should migrate empty CHAR
     *         and VARCHAR fields as NULL. A value of <code>true</code> sets
     *         empty CHAR and VARCHAR fields to null. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getEmptyAsNull() {
        return emptyAsNull;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and
     * VARCHAR fields as NULL. A value of <code>true</code> sets empty CHAR and
     * VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     *
     * @param emptyAsNull <p>
     *            A value that specifies whether AWS DMS should migrate empty
     *            CHAR and VARCHAR fields as NULL. A value of <code>true</code>
     *            sets empty CHAR and VARCHAR fields to null. The default is
     *            <code>false</code>.
     *            </p>
     */
    public void setEmptyAsNull(Boolean emptyAsNull) {
        this.emptyAsNull = emptyAsNull;
    }

    /**
     * <p>
     * A value that specifies whether AWS DMS should migrate empty CHAR and
     * VARCHAR fields as NULL. A value of <code>true</code> sets empty CHAR and
     * VARCHAR fields to null. The default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emptyAsNull <p>
     *            A value that specifies whether AWS DMS should migrate empty
     *            CHAR and VARCHAR fields as NULL. A value of <code>true</code>
     *            sets empty CHAR and VARCHAR fields to null. The default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withEmptyAsNull(Boolean emptyAsNull) {
        this.emptyAsNull = emptyAsNull;
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM)
     * role with a policy that allows <code>"arn:aws:s3:::*"</code> to use the
     * following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @return <p>
     *         The type of server-side encryption that you want to use for your
     *         data. This encryption type is part of the endpoint settings or
     *         the extra connections attributes for Amazon S3. You can choose
     *         either <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>.
     *         To use <code>SSE_S3</code>, create an AWS Identity and Access
     *         Management (IAM) role with a policy that allows
     *         <code>"arn:aws:s3:::*"</code> to use the following actions:
     *         <code>"s3:PutObject", "s3:ListBucket"</code>
     *         </p>
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
     * <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM)
     * role with a policy that allows <code>"arn:aws:s3:::*"</code> to use the
     * following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @param encryptionMode <p>
     *            The type of server-side encryption that you want to use for
     *            your data. This encryption type is part of the endpoint
     *            settings or the extra connections attributes for Amazon S3.
     *            You can choose either <code>SSE_S3</code> (the default) or
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, create an
     *            AWS Identity and Access Management (IAM) role with a policy
     *            that allows <code>"arn:aws:s3:::*"</code> to use the following
     *            actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     *            </p>
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
     * <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM)
     * role with a policy that allows <code>"arn:aws:s3:::*"</code> to use the
     * following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
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
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, create an
     *            AWS Identity and Access Management (IAM) role with a policy
     *            that allows <code>"arn:aws:s3:::*"</code> to use the following
     *            actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionModeValue
     */
    public RedshiftSettings withEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that you want to use for your data.
     * This encryption type is part of the endpoint settings or the extra
     * connections attributes for Amazon S3. You can choose either
     * <code>SSE_S3</code> (the default) or <code>SSE_KMS</code>. To use
     * <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM)
     * role with a policy that allows <code>"arn:aws:s3:::*"</code> to use the
     * following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sse-s3, sse-kms
     *
     * @param encryptionMode <p>
     *            The type of server-side encryption that you want to use for
     *            your data. This encryption type is part of the endpoint
     *            settings or the extra connections attributes for Amazon S3.
     *            You can choose either <code>SSE_S3</code> (the default) or
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, create an
     *            AWS Identity and Access Management (IAM) role with a policy
     *            that allows <code>"arn:aws:s3:::*"</code> to use the following
     *            actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     *            </p>
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
     * <code>SSE_S3</code>, create an AWS Identity and Access Management (IAM)
     * role with a policy that allows <code>"arn:aws:s3:::*"</code> to use the
     * following actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     * </p>
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
     *            <code>SSE_KMS</code>. To use <code>SSE_S3</code>, create an
     *            AWS Identity and Access Management (IAM) role with a policy
     *            that allows <code>"arn:aws:s3:::*"</code> to use the following
     *            actions: <code>"s3:PutObject", "s3:ListBucket"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionModeValue
     */
    public RedshiftSettings withEncryptionMode(EncryptionModeValue encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter
     * accepts a value from 1 through 64. It defaults to 10.
     * </p>
     *
     * @return <p>
     *         The number of threads used to upload a single file. This
     *         parameter accepts a value from 1 through 64. It defaults to 10.
     *         </p>
     */
    public Integer getFileTransferUploadStreams() {
        return fileTransferUploadStreams;
    }

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter
     * accepts a value from 1 through 64. It defaults to 10.
     * </p>
     *
     * @param fileTransferUploadStreams <p>
     *            The number of threads used to upload a single file. This
     *            parameter accepts a value from 1 through 64. It defaults to
     *            10.
     *            </p>
     */
    public void setFileTransferUploadStreams(Integer fileTransferUploadStreams) {
        this.fileTransferUploadStreams = fileTransferUploadStreams;
    }

    /**
     * <p>
     * The number of threads used to upload a single file. This parameter
     * accepts a value from 1 through 64. It defaults to 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileTransferUploadStreams <p>
     *            The number of threads used to upload a single file. This
     *            parameter accepts a value from 1 through 64. It defaults to
     *            10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withFileTransferUploadStreams(Integer fileTransferUploadStreams) {
        this.fileTransferUploadStreams = fileTransferUploadStreams;
        return this;
    }

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out, beginning
     * from when you begin loading.
     * </p>
     *
     * @return <p>
     *         The amount of time to wait (in milliseconds) before timing out,
     *         beginning from when you begin loading.
     *         </p>
     */
    public Integer getLoadTimeout() {
        return loadTimeout;
    }

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out, beginning
     * from when you begin loading.
     * </p>
     *
     * @param loadTimeout <p>
     *            The amount of time to wait (in milliseconds) before timing
     *            out, beginning from when you begin loading.
     *            </p>
     */
    public void setLoadTimeout(Integer loadTimeout) {
        this.loadTimeout = loadTimeout;
    }

    /**
     * <p>
     * The amount of time to wait (in milliseconds) before timing out, beginning
     * from when you begin loading.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadTimeout <p>
     *            The amount of time to wait (in milliseconds) before timing
     *            out, beginning from when you begin loading.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withLoadTimeout(Integer loadTimeout) {
        this.loadTimeout = loadTimeout;
        return this;
    }

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to transfer data to Amazon
     * Redshift. This accepts a value from 1 through 1,048,576. It defaults to
     * 32,768 KB (32 MB).
     * </p>
     *
     * @return <p>
     *         The maximum size (in KB) of any .csv file used to transfer data
     *         to Amazon Redshift. This accepts a value from 1 through
     *         1,048,576. It defaults to 32,768 KB (32 MB).
     *         </p>
     */
    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to transfer data to Amazon
     * Redshift. This accepts a value from 1 through 1,048,576. It defaults to
     * 32,768 KB (32 MB).
     * </p>
     *
     * @param maxFileSize <p>
     *            The maximum size (in KB) of any .csv file used to transfer
     *            data to Amazon Redshift. This accepts a value from 1 through
     *            1,048,576. It defaults to 32,768 KB (32 MB).
     *            </p>
     */
    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * <p>
     * The maximum size (in KB) of any .csv file used to transfer data to Amazon
     * Redshift. This accepts a value from 1 through 1,048,576. It defaults to
     * 32,768 KB (32 MB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxFileSize <p>
     *            The maximum size (in KB) of any .csv file used to transfer
     *            data to Amazon Redshift. This accepts a value from 1 through
     *            1,048,576. It defaults to 32,768 KB (32 MB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     *
     * @return <p>
     *         The password for the user named in the <code>username</code>
     *         property.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     *
     * @param password <p>
     *            The password for the user named in the <code>username</code>
     *            property.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user named in the <code>username</code> property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param password <p>
     *            The password for the user named in the <code>username</code>
     *            property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     *
     * @return <p>
     *         The port number for Amazon Redshift. The default value is 5439.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     *
     * @param port <p>
     *            The port number for Amazon Redshift. The default value is
     *            5439.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number for Amazon Redshift. The default value is 5439.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number for Amazon Redshift. The default value is
     *            5439.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings
     * in the incoming data. All characters within the quotation marks,
     * including delimiters, are retained. Choose <code>true</code> to remove
     * quotation marks. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to remove surrounding quotation marks from
     *         strings in the incoming data. All characters within the quotation
     *         marks, including delimiters, are retained. Choose
     *         <code>true</code> to remove quotation marks. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isRemoveQuotes() {
        return removeQuotes;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings
     * in the incoming data. All characters within the quotation marks,
     * including delimiters, are retained. Choose <code>true</code> to remove
     * quotation marks. The default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to remove surrounding quotation marks from
     *         strings in the incoming data. All characters within the quotation
     *         marks, including delimiters, are retained. Choose
     *         <code>true</code> to remove quotation marks. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getRemoveQuotes() {
        return removeQuotes;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings
     * in the incoming data. All characters within the quotation marks,
     * including delimiters, are retained. Choose <code>true</code> to remove
     * quotation marks. The default is <code>false</code>.
     * </p>
     *
     * @param removeQuotes <p>
     *            A value that specifies to remove surrounding quotation marks
     *            from strings in the incoming data. All characters within the
     *            quotation marks, including delimiters, are retained. Choose
     *            <code>true</code> to remove quotation marks. The default is
     *            <code>false</code>.
     *            </p>
     */
    public void setRemoveQuotes(Boolean removeQuotes) {
        this.removeQuotes = removeQuotes;
    }

    /**
     * <p>
     * A value that specifies to remove surrounding quotation marks from strings
     * in the incoming data. All characters within the quotation marks,
     * including delimiters, are retained. Choose <code>true</code> to remove
     * quotation marks. The default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeQuotes <p>
     *            A value that specifies to remove surrounding quotation marks
     *            from strings in the incoming data. All characters within the
     *            quotation marks, including delimiters, are retained. Choose
     *            <code>true</code> to remove quotation marks. The default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withRemoveQuotes(Boolean removeQuotes) {
        this.removeQuotes = removeQuotes;
        return this;
    }

    /**
     * <p>
     * A list of characters that you want to replace. Use with
     * <code>ReplaceChars</code>.
     * </p>
     *
     * @return <p>
     *         A list of characters that you want to replace. Use with
     *         <code>ReplaceChars</code>.
     *         </p>
     */
    public String getReplaceInvalidChars() {
        return replaceInvalidChars;
    }

    /**
     * <p>
     * A list of characters that you want to replace. Use with
     * <code>ReplaceChars</code>.
     * </p>
     *
     * @param replaceInvalidChars <p>
     *            A list of characters that you want to replace. Use with
     *            <code>ReplaceChars</code>.
     *            </p>
     */
    public void setReplaceInvalidChars(String replaceInvalidChars) {
        this.replaceInvalidChars = replaceInvalidChars;
    }

    /**
     * <p>
     * A list of characters that you want to replace. Use with
     * <code>ReplaceChars</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceInvalidChars <p>
     *            A list of characters that you want to replace. Use with
     *            <code>ReplaceChars</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withReplaceInvalidChars(String replaceInvalidChars) {
        this.replaceInvalidChars = replaceInvalidChars;
        return this;
    }

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in
     * <code>ReplaceInvalidChars</code>, substituting the specified characters
     * instead. The default is <code>"?"</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to replaces the invalid characters
     *         specified in <code>ReplaceInvalidChars</code>, substituting the
     *         specified characters instead. The default is <code>"?"</code>.
     *         </p>
     */
    public String getReplaceChars() {
        return replaceChars;
    }

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in
     * <code>ReplaceInvalidChars</code>, substituting the specified characters
     * instead. The default is <code>"?"</code>.
     * </p>
     *
     * @param replaceChars <p>
     *            A value that specifies to replaces the invalid characters
     *            specified in <code>ReplaceInvalidChars</code>, substituting
     *            the specified characters instead. The default is
     *            <code>"?"</code>.
     *            </p>
     */
    public void setReplaceChars(String replaceChars) {
        this.replaceChars = replaceChars;
    }

    /**
     * <p>
     * A value that specifies to replaces the invalid characters specified in
     * <code>ReplaceInvalidChars</code>, substituting the specified characters
     * instead. The default is <code>"?"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceChars <p>
     *            A value that specifies to replaces the invalid characters
     *            specified in <code>ReplaceInvalidChars</code>, substituting
     *            the specified characters instead. The default is
     *            <code>"?"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withReplaceChars(String replaceChars) {
        this.replaceChars = replaceChars;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon Redshift cluster you are using.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     *
     * @param serverName <p>
     *            The name of the Amazon Redshift cluster you are using.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the Amazon Redshift cluster you are using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverName <p>
     *            The name of the Amazon Redshift cluster you are using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the
     * Amazon Redshift service.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that has access to
     *         the Amazon Redshift service.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the
     * Amazon Redshift service.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that has access
     *            to the Amazon Redshift service.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has access to the
     * Amazon Redshift service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that has access
     *            to the Amazon Redshift service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the
     * <code>EncryptionMode</code>, provide this key ID. The key that you use
     * needs an attached policy that enables IAM user permissions and allows use
     * of the key.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the
     *         <code>EncryptionMode</code>, provide this key ID. The key that
     *         you use needs an attached policy that enables IAM user
     *         permissions and allows use of the key.
     *         </p>
     */
    public String getServerSideEncryptionKmsKeyId() {
        return serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the
     * <code>EncryptionMode</code>, provide this key ID. The key that you use
     * needs an attached policy that enables IAM user permissions and allows use
     * of the key.
     * </p>
     *
     * @param serverSideEncryptionKmsKeyId <p>
     *            The AWS KMS key ID. If you are using <code>SSE_KMS</code> for
     *            the <code>EncryptionMode</code>, provide this key ID. The key
     *            that you use needs an attached policy that enables IAM user
     *            permissions and allows use of the key.
     *            </p>
     */
    public void setServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID. If you are using <code>SSE_KMS</code> for the
     * <code>EncryptionMode</code>, provide this key ID. The key that you use
     * needs an attached policy that enables IAM user permissions and allows use
     * of the key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionKmsKeyId <p>
     *            The AWS KMS key ID. If you are using <code>SSE_KMS</code> for
     *            the <code>EncryptionMode</code>, provide this key ID. The key
     *            that you use needs an attached policy that enables IAM user
     *            permissions and allows use of the key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withServerSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
        this.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
        return this;
    }

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code>
     * (case-sensitive), <code>'timeformat_string'</code>,
     * <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     * to 10. Using <code>auto</code> recognizes most strings, even some that
     * aren't supported when you use a time format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this parameter to <code>auto</code>.
     * </p>
     *
     * @return <p>
     *         The time format that you want to use. Valid values are
     *         <code>auto</code> (case-sensitive),
     *         <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or
     *         <code>'epochmillisecs'</code>. It defaults to 10. Using
     *         <code>auto</code> recognizes most strings, even some that aren't
     *         supported when you use a time format string.
     *         </p>
     *         <p>
     *         If your date and time values use formats different from each
     *         other, set this parameter to <code>auto</code>.
     *         </p>
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code>
     * (case-sensitive), <code>'timeformat_string'</code>,
     * <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     * to 10. Using <code>auto</code> recognizes most strings, even some that
     * aren't supported when you use a time format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this parameter to <code>auto</code>.
     * </p>
     *
     * @param timeFormat <p>
     *            The time format that you want to use. Valid values are
     *            <code>auto</code> (case-sensitive),
     *            <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or
     *            <code>'epochmillisecs'</code>. It defaults to 10. Using
     *            <code>auto</code> recognizes most strings, even some that
     *            aren't supported when you use a time format string.
     *            </p>
     *            <p>
     *            If your date and time values use formats different from each
     *            other, set this parameter to <code>auto</code>.
     *            </p>
     */
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * <p>
     * The time format that you want to use. Valid values are <code>auto</code>
     * (case-sensitive), <code>'timeformat_string'</code>,
     * <code>'epochsecs'</code>, or <code>'epochmillisecs'</code>. It defaults
     * to 10. Using <code>auto</code> recognizes most strings, even some that
     * aren't supported when you use a time format string.
     * </p>
     * <p>
     * If your date and time values use formats different from each other, set
     * this parameter to <code>auto</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeFormat <p>
     *            The time format that you want to use. Valid values are
     *            <code>auto</code> (case-sensitive),
     *            <code>'timeformat_string'</code>, <code>'epochsecs'</code>, or
     *            <code>'epochmillisecs'</code>. It defaults to 10. Using
     *            <code>auto</code> recognizes most strings, even some that
     *            aren't supported when you use a time format string.
     *            </p>
     *            <p>
     *            If your date and time values use formats different from each
     *            other, set this parameter to <code>auto</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from
     * a VARCHAR string. This parameter applies only to columns with a VARCHAR
     * data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to remove the trailing white space
     *         characters from a VARCHAR string. This parameter applies only to
     *         columns with a VARCHAR data type. Choose <code>true</code> to
     *         remove unneeded white space. The default is <code>false</code>.
     *         </p>
     */
    public Boolean isTrimBlanks() {
        return trimBlanks;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from
     * a VARCHAR string. This parameter applies only to columns with a VARCHAR
     * data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to remove the trailing white space
     *         characters from a VARCHAR string. This parameter applies only to
     *         columns with a VARCHAR data type. Choose <code>true</code> to
     *         remove unneeded white space. The default is <code>false</code>.
     *         </p>
     */
    public Boolean getTrimBlanks() {
        return trimBlanks;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from
     * a VARCHAR string. This parameter applies only to columns with a VARCHAR
     * data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     *
     * @param trimBlanks <p>
     *            A value that specifies to remove the trailing white space
     *            characters from a VARCHAR string. This parameter applies only
     *            to columns with a VARCHAR data type. Choose <code>true</code>
     *            to remove unneeded white space. The default is
     *            <code>false</code>.
     *            </p>
     */
    public void setTrimBlanks(Boolean trimBlanks) {
        this.trimBlanks = trimBlanks;
    }

    /**
     * <p>
     * A value that specifies to remove the trailing white space characters from
     * a VARCHAR string. This parameter applies only to columns with a VARCHAR
     * data type. Choose <code>true</code> to remove unneeded white space. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trimBlanks <p>
     *            A value that specifies to remove the trailing white space
     *            characters from a VARCHAR string. This parameter applies only
     *            to columns with a VARCHAR data type. Choose <code>true</code>
     *            to remove unneeded white space. The default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withTrimBlanks(Boolean trimBlanks) {
        this.trimBlanks = trimBlanks;
        return this;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate
     * number of characters, so that the data fits in the column. This parameter
     * applies only to columns with a VARCHAR or CHAR data type, and rows with a
     * size of 4 MB or less. Choose <code>true</code> to truncate data. The
     * default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to truncate data in columns to the
     *         appropriate number of characters, so that the data fits in the
     *         column. This parameter applies only to columns with a VARCHAR or
     *         CHAR data type, and rows with a size of 4 MB or less. Choose
     *         <code>true</code> to truncate data. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isTruncateColumns() {
        return truncateColumns;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate
     * number of characters, so that the data fits in the column. This parameter
     * applies only to columns with a VARCHAR or CHAR data type, and rows with a
     * size of 4 MB or less. Choose <code>true</code> to truncate data. The
     * default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A value that specifies to truncate data in columns to the
     *         appropriate number of characters, so that the data fits in the
     *         column. This parameter applies only to columns with a VARCHAR or
     *         CHAR data type, and rows with a size of 4 MB or less. Choose
     *         <code>true</code> to truncate data. The default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getTruncateColumns() {
        return truncateColumns;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate
     * number of characters, so that the data fits in the column. This parameter
     * applies only to columns with a VARCHAR or CHAR data type, and rows with a
     * size of 4 MB or less. Choose <code>true</code> to truncate data. The
     * default is <code>false</code>.
     * </p>
     *
     * @param truncateColumns <p>
     *            A value that specifies to truncate data in columns to the
     *            appropriate number of characters, so that the data fits in the
     *            column. This parameter applies only to columns with a VARCHAR
     *            or CHAR data type, and rows with a size of 4 MB or less.
     *            Choose <code>true</code> to truncate data. The default is
     *            <code>false</code>.
     *            </p>
     */
    public void setTruncateColumns(Boolean truncateColumns) {
        this.truncateColumns = truncateColumns;
    }

    /**
     * <p>
     * A value that specifies to truncate data in columns to the appropriate
     * number of characters, so that the data fits in the column. This parameter
     * applies only to columns with a VARCHAR or CHAR data type, and rows with a
     * size of 4 MB or less. Choose <code>true</code> to truncate data. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param truncateColumns <p>
     *            A value that specifies to truncate data in columns to the
     *            appropriate number of characters, so that the data fits in the
     *            column. This parameter applies only to columns with a VARCHAR
     *            or CHAR data type, and rows with a size of 4 MB or less.
     *            Choose <code>true</code> to truncate data. The default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withTruncateColumns(Boolean truncateColumns) {
        this.truncateColumns = truncateColumns;
        return this;
    }

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     *
     * @return <p>
     *         An Amazon Redshift user name for a registered user.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     *
     * @param username <p>
     *            An Amazon Redshift user name for a registered user.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * An Amazon Redshift user name for a registered user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            An Amazon Redshift user name for a registered user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The size of the write buffer to use in rows. Valid values range from 1
     * through 2,048. The default is 1,024. Use this setting to tune
     * performance.
     * </p>
     *
     * @return <p>
     *         The size of the write buffer to use in rows. Valid values range
     *         from 1 through 2,048. The default is 1,024. Use this setting to
     *         tune performance.
     *         </p>
     */
    public Integer getWriteBufferSize() {
        return writeBufferSize;
    }

    /**
     * <p>
     * The size of the write buffer to use in rows. Valid values range from 1
     * through 2,048. The default is 1,024. Use this setting to tune
     * performance.
     * </p>
     *
     * @param writeBufferSize <p>
     *            The size of the write buffer to use in rows. Valid values
     *            range from 1 through 2,048. The default is 1,024. Use this
     *            setting to tune performance.
     *            </p>
     */
    public void setWriteBufferSize(Integer writeBufferSize) {
        this.writeBufferSize = writeBufferSize;
    }

    /**
     * <p>
     * The size of the write buffer to use in rows. Valid values range from 1
     * through 2,048. The default is 1,024. Use this setting to tune
     * performance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeBufferSize <p>
     *            The size of the write buffer to use in rows. Valid values
     *            range from 1 through 2,048. The default is 1,024. Use this
     *            setting to tune performance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftSettings withWriteBufferSize(Integer writeBufferSize) {
        this.writeBufferSize = writeBufferSize;
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
        if (getAcceptAnyDate() != null)
            sb.append("AcceptAnyDate: " + getAcceptAnyDate() + ",");
        if (getAfterConnectScript() != null)
            sb.append("AfterConnectScript: " + getAfterConnectScript() + ",");
        if (getBucketFolder() != null)
            sb.append("BucketFolder: " + getBucketFolder() + ",");
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getConnectionTimeout() != null)
            sb.append("ConnectionTimeout: " + getConnectionTimeout() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDateFormat() != null)
            sb.append("DateFormat: " + getDateFormat() + ",");
        if (getEmptyAsNull() != null)
            sb.append("EmptyAsNull: " + getEmptyAsNull() + ",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: " + getEncryptionMode() + ",");
        if (getFileTransferUploadStreams() != null)
            sb.append("FileTransferUploadStreams: " + getFileTransferUploadStreams() + ",");
        if (getLoadTimeout() != null)
            sb.append("LoadTimeout: " + getLoadTimeout() + ",");
        if (getMaxFileSize() != null)
            sb.append("MaxFileSize: " + getMaxFileSize() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getRemoveQuotes() != null)
            sb.append("RemoveQuotes: " + getRemoveQuotes() + ",");
        if (getReplaceInvalidChars() != null)
            sb.append("ReplaceInvalidChars: " + getReplaceInvalidChars() + ",");
        if (getReplaceChars() != null)
            sb.append("ReplaceChars: " + getReplaceChars() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getServerSideEncryptionKmsKeyId() != null)
            sb.append("ServerSideEncryptionKmsKeyId: " + getServerSideEncryptionKmsKeyId() + ",");
        if (getTimeFormat() != null)
            sb.append("TimeFormat: " + getTimeFormat() + ",");
        if (getTrimBlanks() != null)
            sb.append("TrimBlanks: " + getTrimBlanks() + ",");
        if (getTruncateColumns() != null)
            sb.append("TruncateColumns: " + getTruncateColumns() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getWriteBufferSize() != null)
            sb.append("WriteBufferSize: " + getWriteBufferSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptAnyDate() == null) ? 0 : getAcceptAnyDate().hashCode());
        hashCode = prime * hashCode
                + ((getAfterConnectScript() == null) ? 0 : getAfterConnectScript().hashCode());
        hashCode = prime * hashCode
                + ((getBucketFolder() == null) ? 0 : getBucketFolder().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionTimeout() == null) ? 0 : getConnectionTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDateFormat() == null) ? 0 : getDateFormat().hashCode());
        hashCode = prime * hashCode
                + ((getEmptyAsNull() == null) ? 0 : getEmptyAsNull().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getFileTransferUploadStreams() == null) ? 0 : getFileTransferUploadStreams()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLoadTimeout() == null) ? 0 : getLoadTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getMaxFileSize() == null) ? 0 : getMaxFileSize().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveQuotes() == null) ? 0 : getRemoveQuotes().hashCode());
        hashCode = prime * hashCode
                + ((getReplaceInvalidChars() == null) ? 0 : getReplaceInvalidChars().hashCode());
        hashCode = prime * hashCode
                + ((getReplaceChars() == null) ? 0 : getReplaceChars().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionKmsKeyId() == null) ? 0
                        : getServerSideEncryptionKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTimeFormat() == null) ? 0 : getTimeFormat().hashCode());
        hashCode = prime * hashCode + ((getTrimBlanks() == null) ? 0 : getTrimBlanks().hashCode());
        hashCode = prime * hashCode
                + ((getTruncateColumns() == null) ? 0 : getTruncateColumns().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getWriteBufferSize() == null) ? 0 : getWriteBufferSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftSettings == false)
            return false;
        RedshiftSettings other = (RedshiftSettings) obj;

        if (other.getAcceptAnyDate() == null ^ this.getAcceptAnyDate() == null)
            return false;
        if (other.getAcceptAnyDate() != null
                && other.getAcceptAnyDate().equals(this.getAcceptAnyDate()) == false)
            return false;
        if (other.getAfterConnectScript() == null ^ this.getAfterConnectScript() == null)
            return false;
        if (other.getAfterConnectScript() != null
                && other.getAfterConnectScript().equals(this.getAfterConnectScript()) == false)
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
        if (other.getConnectionTimeout() == null ^ this.getConnectionTimeout() == null)
            return false;
        if (other.getConnectionTimeout() != null
                && other.getConnectionTimeout().equals(this.getConnectionTimeout()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDateFormat() == null ^ this.getDateFormat() == null)
            return false;
        if (other.getDateFormat() != null
                && other.getDateFormat().equals(this.getDateFormat()) == false)
            return false;
        if (other.getEmptyAsNull() == null ^ this.getEmptyAsNull() == null)
            return false;
        if (other.getEmptyAsNull() != null
                && other.getEmptyAsNull().equals(this.getEmptyAsNull()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null
                && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getFileTransferUploadStreams() == null
                ^ this.getFileTransferUploadStreams() == null)
            return false;
        if (other.getFileTransferUploadStreams() != null
                && other.getFileTransferUploadStreams().equals(this.getFileTransferUploadStreams()) == false)
            return false;
        if (other.getLoadTimeout() == null ^ this.getLoadTimeout() == null)
            return false;
        if (other.getLoadTimeout() != null
                && other.getLoadTimeout().equals(this.getLoadTimeout()) == false)
            return false;
        if (other.getMaxFileSize() == null ^ this.getMaxFileSize() == null)
            return false;
        if (other.getMaxFileSize() != null
                && other.getMaxFileSize().equals(this.getMaxFileSize()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getRemoveQuotes() == null ^ this.getRemoveQuotes() == null)
            return false;
        if (other.getRemoveQuotes() != null
                && other.getRemoveQuotes().equals(this.getRemoveQuotes()) == false)
            return false;
        if (other.getReplaceInvalidChars() == null ^ this.getReplaceInvalidChars() == null)
            return false;
        if (other.getReplaceInvalidChars() != null
                && other.getReplaceInvalidChars().equals(this.getReplaceInvalidChars()) == false)
            return false;
        if (other.getReplaceChars() == null ^ this.getReplaceChars() == null)
            return false;
        if (other.getReplaceChars() != null
                && other.getReplaceChars().equals(this.getReplaceChars()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() == null
                ^ this.getServerSideEncryptionKmsKeyId() == null)
            return false;
        if (other.getServerSideEncryptionKmsKeyId() != null
                && other.getServerSideEncryptionKmsKeyId().equals(
                        this.getServerSideEncryptionKmsKeyId()) == false)
            return false;
        if (other.getTimeFormat() == null ^ this.getTimeFormat() == null)
            return false;
        if (other.getTimeFormat() != null
                && other.getTimeFormat().equals(this.getTimeFormat()) == false)
            return false;
        if (other.getTrimBlanks() == null ^ this.getTrimBlanks() == null)
            return false;
        if (other.getTrimBlanks() != null
                && other.getTrimBlanks().equals(this.getTrimBlanks()) == false)
            return false;
        if (other.getTruncateColumns() == null ^ this.getTruncateColumns() == null)
            return false;
        if (other.getTruncateColumns() != null
                && other.getTruncateColumns().equals(this.getTruncateColumns()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getWriteBufferSize() == null ^ this.getWriteBufferSize() == null)
            return false;
        if (other.getWriteBufferSize() != null
                && other.getWriteBufferSize().equals(this.getWriteBufferSize()) == false)
            return false;
        return true;
    }
}
