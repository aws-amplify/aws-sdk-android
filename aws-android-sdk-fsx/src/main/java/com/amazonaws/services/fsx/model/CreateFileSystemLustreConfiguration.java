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
 * The Lustre configuration for the file system being created.
 * </p>
 */
public class CreateFileSystemLustreConfiguration implements Serializable {
    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String weeklyMaintenanceStartTime;

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional
     * prefix) that you're using as the data repository for your Amazon FSx for
     * Lustre file system. The root of your FSx for Lustre file system will be
     * mapped to the root of the Amazon S3 bucket you select. An example is
     * <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix
     * after the Amazon S3 bucket name, only object keys with that prefix are
     * loaded into the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     */
    private String importPath;

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file
     * system is exported. The path must use the same Amazon S3 bucket as
     * specified in ImportPath. You can provide an optional prefix to which new
     * and changed data is to be exported from your Amazon FSx for Lustre file
     * system. If an <code>ExportPath</code> value is not provided, Amazon FSx
     * sets a default export path,
     * <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The
     * timestamp is in UTC format, for example
     * <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket
     * specified by <code>ImportPath</code>. If you only specify a bucket name,
     * such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     * system objects to S3 bucket objects. This mapping means that the input
     * data in S3 is overwritten on export. If you provide a custom prefix in
     * the export path, such as
     * <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the
     * Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     */
    private String exportPath;

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value
     * determines the stripe count and maximum amount of data per file (in MiB)
     * stored on a single physical disk. The maximum number of disks that a
     * single file can be striped across is limited by the total number of disks
     * that make up the file system.
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
     * (Optional) Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     * deployment types when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage
     * and workloads and encryption of data in transit. To learn more about
     * deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a
     * <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file system from
     * Amazon EC2 instances that <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     * >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types is supported when accessed
     * from supported instance types in supported AWS Regions. To learn more, <a
     * href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     * >Encrypting Data in Transit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     */
    private String deploymentType;

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the
     * amount of read and write throughput for each 1 tebibyte of storage, in
     * MB/s/TiB. File system throughput capacity is calculated by multiplying
     * ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput
     * (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of
     * PerUnitStorageThroughput yields 117 MB/s of ﬁle system throughput. You
     * pay for the amount of throughput that you provision.
     * </p>
     * <p>
     * Valid values are 50, 100, 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     */
    private Integer perUnitStorageThroughput;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The preferred start time to perform weekly maintenance, formatted
     *         d:HH:MM in the UTC time zone, where d is the weekday number, from
     *         1 through 7, beginning with Monday and ending with Sunday.
     *         </p>
     */
    public String getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The preferred start time to perform weekly maintenance,
     *            formatted d:HH:MM in the UTC time zone, where d is the weekday
     *            number, from 1 through 7, beginning with Monday and ending
     *            with Sunday.
     *            </p>
     */
    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM
     * in the UTC time zone, where d is the weekday number, from 1 through 7,
     * beginning with Monday and ending with Sunday.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The preferred start time to perform weekly maintenance,
     *            formatted d:HH:MM in the UTC time zone, where d is the weekday
     *            number, from 1 through 7, beginning with Monday and ending
     *            with Sunday.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemLustreConfiguration withWeeklyMaintenanceStartTime(
            String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional
     * prefix) that you're using as the data repository for your Amazon FSx for
     * Lustre file system. The root of your FSx for Lustre file system will be
     * mapped to the root of the Amazon S3 bucket you select. An example is
     * <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix
     * after the Amazon S3 bucket name, only object keys with that prefix are
     * loaded into the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @return <p>
     *         (Optional) The path to the Amazon S3 bucket (including the
     *         optional prefix) that you're using as the data repository for
     *         your Amazon FSx for Lustre file system. The root of your FSx for
     *         Lustre file system will be mapped to the root of the Amazon S3
     *         bucket you select. An example is
     *         <code>s3://import-bucket/optional-prefix</code>. If you specify a
     *         prefix after the Amazon S3 bucket name, only object keys with
     *         that prefix are loaded into the file system.
     *         </p>
     */
    public String getImportPath() {
        return importPath;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional
     * prefix) that you're using as the data repository for your Amazon FSx for
     * Lustre file system. The root of your FSx for Lustre file system will be
     * mapped to the root of the Amazon S3 bucket you select. An example is
     * <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix
     * after the Amazon S3 bucket name, only object keys with that prefix are
     * loaded into the file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @param importPath <p>
     *            (Optional) The path to the Amazon S3 bucket (including the
     *            optional prefix) that you're using as the data repository for
     *            your Amazon FSx for Lustre file system. The root of your FSx
     *            for Lustre file system will be mapped to the root of the
     *            Amazon S3 bucket you select. An example is
     *            <code>s3://import-bucket/optional-prefix</code>. If you
     *            specify a prefix after the Amazon S3 bucket name, only object
     *            keys with that prefix are loaded into the file system.
     *            </p>
     */
    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional
     * prefix) that you're using as the data repository for your Amazon FSx for
     * Lustre file system. The root of your FSx for Lustre file system will be
     * mapped to the root of the Amazon S3 bucket you select. An example is
     * <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix
     * after the Amazon S3 bucket name, only object keys with that prefix are
     * loaded into the file system.
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
     *            (Optional) The path to the Amazon S3 bucket (including the
     *            optional prefix) that you're using as the data repository for
     *            your Amazon FSx for Lustre file system. The root of your FSx
     *            for Lustre file system will be mapped to the root of the
     *            Amazon S3 bucket you select. An example is
     *            <code>s3://import-bucket/optional-prefix</code>. If you
     *            specify a prefix after the Amazon S3 bucket name, only object
     *            keys with that prefix are loaded into the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemLustreConfiguration withImportPath(String importPath) {
        this.importPath = importPath;
        return this;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file
     * system is exported. The path must use the same Amazon S3 bucket as
     * specified in ImportPath. You can provide an optional prefix to which new
     * and changed data is to be exported from your Amazon FSx for Lustre file
     * system. If an <code>ExportPath</code> value is not provided, Amazon FSx
     * sets a default export path,
     * <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The
     * timestamp is in UTC format, for example
     * <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket
     * specified by <code>ImportPath</code>. If you only specify a bucket name,
     * such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     * system objects to S3 bucket objects. This mapping means that the input
     * data in S3 is overwritten on export. If you provide a custom prefix in
     * the export path, such as
     * <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the
     * Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @return <p>
     *         (Optional) The path in Amazon S3 where the root of your Amazon
     *         FSx file system is exported. The path must use the same Amazon S3
     *         bucket as specified in ImportPath. You can provide an optional
     *         prefix to which new and changed data is to be exported from your
     *         Amazon FSx for Lustre file system. If an <code>ExportPath</code>
     *         value is not provided, Amazon FSx sets a default export path,
     *         <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     *         The timestamp is in UTC format, for example
     *         <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     *         </p>
     *         <p>
     *         The Amazon S3 export bucket must be the same as the import bucket
     *         specified by <code>ImportPath</code>. If you only specify a
     *         bucket name, such as <code>s3://import-bucket</code>, you get a
     *         1:1 mapping of file system objects to S3 bucket objects. This
     *         mapping means that the input data in S3 is overwritten on export.
     *         If you provide a custom prefix in the export path, such as
     *         <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon
     *         FSx exports the contents of your file system to that export
     *         prefix in the Amazon S3 bucket.
     *         </p>
     */
    public String getExportPath() {
        return exportPath;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file
     * system is exported. The path must use the same Amazon S3 bucket as
     * specified in ImportPath. You can provide an optional prefix to which new
     * and changed data is to be exported from your Amazon FSx for Lustre file
     * system. If an <code>ExportPath</code> value is not provided, Amazon FSx
     * sets a default export path,
     * <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The
     * timestamp is in UTC format, for example
     * <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket
     * specified by <code>ImportPath</code>. If you only specify a bucket name,
     * such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     * system objects to S3 bucket objects. This mapping means that the input
     * data in S3 is overwritten on export. If you provide a custom prefix in
     * the export path, such as
     * <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the
     * Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 900<br/>
     * <b>Pattern: </b>^.{3,900}$<br/>
     *
     * @param exportPath <p>
     *            (Optional) The path in Amazon S3 where the root of your Amazon
     *            FSx file system is exported. The path must use the same Amazon
     *            S3 bucket as specified in ImportPath. You can provide an
     *            optional prefix to which new and changed data is to be
     *            exported from your Amazon FSx for Lustre file system. If an
     *            <code>ExportPath</code> value is not provided, Amazon FSx sets
     *            a default export path,
     *            <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     *            The timestamp is in UTC format, for example
     *            <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     *            </p>
     *            <p>
     *            The Amazon S3 export bucket must be the same as the import
     *            bucket specified by <code>ImportPath</code>. If you only
     *            specify a bucket name, such as <code>s3://import-bucket</code>
     *            , you get a 1:1 mapping of file system objects to S3 bucket
     *            objects. This mapping means that the input data in S3 is
     *            overwritten on export. If you provide a custom prefix in the
     *            export path, such as
     *            <code>s3://import-bucket/[custom-optional-prefix]</code>,
     *            Amazon FSx exports the contents of your file system to that
     *            export prefix in the Amazon S3 bucket.
     *            </p>
     */
    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file
     * system is exported. The path must use the same Amazon S3 bucket as
     * specified in ImportPath. You can provide an optional prefix to which new
     * and changed data is to be exported from your Amazon FSx for Lustre file
     * system. If an <code>ExportPath</code> value is not provided, Amazon FSx
     * sets a default export path,
     * <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The
     * timestamp is in UTC format, for example
     * <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket
     * specified by <code>ImportPath</code>. If you only specify a bucket name,
     * such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     * system objects to S3 bucket objects. This mapping means that the input
     * data in S3 is overwritten on export. If you provide a custom prefix in
     * the export path, such as
     * <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the
     * Amazon S3 bucket.
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
     *            (Optional) The path in Amazon S3 where the root of your Amazon
     *            FSx file system is exported. The path must use the same Amazon
     *            S3 bucket as specified in ImportPath. You can provide an
     *            optional prefix to which new and changed data is to be
     *            exported from your Amazon FSx for Lustre file system. If an
     *            <code>ExportPath</code> value is not provided, Amazon FSx sets
     *            a default export path,
     *            <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     *            The timestamp is in UTC format, for example
     *            <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     *            </p>
     *            <p>
     *            The Amazon S3 export bucket must be the same as the import
     *            bucket specified by <code>ImportPath</code>. If you only
     *            specify a bucket name, such as <code>s3://import-bucket</code>
     *            , you get a 1:1 mapping of file system objects to S3 bucket
     *            objects. This mapping means that the input data in S3 is
     *            overwritten on export. If you provide a custom prefix in the
     *            export path, such as
     *            <code>s3://import-bucket/[custom-optional-prefix]</code>,
     *            Amazon FSx exports the contents of your file system to that
     *            export prefix in the Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemLustreConfiguration withExportPath(String exportPath) {
        this.exportPath = exportPath;
        return this;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value
     * determines the stripe count and maximum amount of data per file (in MiB)
     * stored on a single physical disk. The maximum number of disks that a
     * single file can be striped across is limited by the total number of disks
     * that make up the file system.
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
     *         (Optional) For files imported from a data repository, this value
     *         determines the stripe count and maximum amount of data per file
     *         (in MiB) stored on a single physical disk. The maximum number of
     *         disks that a single file can be striped across is limited by the
     *         total number of disks that make up the file system.
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
     * (Optional) For files imported from a data repository, this value
     * determines the stripe count and maximum amount of data per file (in MiB)
     * stored on a single physical disk. The maximum number of disks that a
     * single file can be striped across is limited by the total number of disks
     * that make up the file system.
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
     *            (Optional) For files imported from a data repository, this
     *            value determines the stripe count and maximum amount of data
     *            per file (in MiB) stored on a single physical disk. The
     *            maximum number of disks that a single file can be striped
     *            across is limited by the total number of disks that make up
     *            the file system.
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
     * (Optional) For files imported from a data repository, this value
     * determines the stripe count and maximum amount of data per file (in MiB)
     * stored on a single physical disk. The maximum number of disks that a
     * single file can be striped across is limited by the total number of disks
     * that make up the file system.
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
     *            (Optional) For files imported from a data repository, this
     *            value determines the stripe count and maximum amount of data
     *            per file (in MiB) stored on a single physical disk. The
     *            maximum number of disks that a single file can be striped
     *            across is limited by the total number of disks that make up
     *            the file system.
     *            </p>
     *            <p>
     *            The default chunk size is 1,024 MiB (1 GiB) and can go as high
     *            as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum
     *            size of 5 TB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemLustreConfiguration withImportedFileChunkSize(
            Integer importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
        return this;
    }

    /**
     * <p>
     * (Optional) Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     * deployment types when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage
     * and workloads and encryption of data in transit. To learn more about
     * deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a
     * <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file system from
     * Amazon EC2 instances that <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     * >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types is supported when accessed
     * from supported instance types in supported AWS Regions. To learn more, <a
     * href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     * >Encrypting Data in Transit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @return <p>
     *         (Optional) Choose <code>SCRATCH_1</code> and
     *         <code>SCRATCH_2</code> deployment types when you need temporary
     *         storage and shorter-term processing of data. The
     *         <code>SCRATCH_2</code> deployment type provides in-transit
     *         encryption of data and higher burst throughput capacity than
     *         <code>SCRATCH_1</code>.
     *         </p>
     *         <p>
     *         Choose <code>PERSISTENT_1</code> deployment type for longer-term
     *         storage and workloads and encryption of data in transit. To learn
     *         more about deployment types, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *         > FSx for Lustre Deployment Options</a>.
     *         </p>
     *         <p>
     *         Encryption of data in-transit is automatically enabled when you
     *         access a <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file
     *         system from Amazon EC2 instances that <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     *         >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     *         </p>
     *         <p>
     *         Encryption of data in-transit for <code>SCRATCH_2</code> and
     *         <code>PERSISTENT_1</code> deployment types is supported when
     *         accessed from supported instance types in supported AWS Regions.
     *         To learn more, <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     *         >Encrypting Data in Transit</a>.
     *         </p>
     * @see LustreDeploymentType
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * <p>
     * (Optional) Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     * deployment types when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage
     * and workloads and encryption of data in transit. To learn more about
     * deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a
     * <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file system from
     * Amazon EC2 instances that <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     * >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types is supported when accessed
     * from supported instance types in supported AWS Regions. To learn more, <a
     * href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     * >Encrypting Data in Transit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            (Optional) Choose <code>SCRATCH_1</code> and
     *            <code>SCRATCH_2</code> deployment types when you need
     *            temporary storage and shorter-term processing of data. The
     *            <code>SCRATCH_2</code> deployment type provides in-transit
     *            encryption of data and higher burst throughput capacity than
     *            <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            Choose <code>PERSISTENT_1</code> deployment type for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>.
     *            </p>
     *            <p>
     *            Encryption of data in-transit is automatically enabled when
     *            you access a <code>SCRATCH_2</code> or
     *            <code>PERSISTENT_1</code> file system from Amazon EC2
     *            instances that <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     *            >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     *            </p>
     *            <p>
     *            Encryption of data in-transit for <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types is supported when
     *            accessed from supported instance types in supported AWS
     *            Regions. To learn more, <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     *            >Encrypting Data in Transit</a>.
     *            </p>
     * @see LustreDeploymentType
     */
    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * (Optional) Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     * deployment types when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage
     * and workloads and encryption of data in transit. To learn more about
     * deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a
     * <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file system from
     * Amazon EC2 instances that <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     * >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types is supported when accessed
     * from supported instance types in supported AWS Regions. To learn more, <a
     * href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     * >Encrypting Data in Transit</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            (Optional) Choose <code>SCRATCH_1</code> and
     *            <code>SCRATCH_2</code> deployment types when you need
     *            temporary storage and shorter-term processing of data. The
     *            <code>SCRATCH_2</code> deployment type provides in-transit
     *            encryption of data and higher burst throughput capacity than
     *            <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            Choose <code>PERSISTENT_1</code> deployment type for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>.
     *            </p>
     *            <p>
     *            Encryption of data in-transit is automatically enabled when
     *            you access a <code>SCRATCH_2</code> or
     *            <code>PERSISTENT_1</code> file system from Amazon EC2
     *            instances that <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     *            >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     *            </p>
     *            <p>
     *            Encryption of data in-transit for <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types is supported when
     *            accessed from supported instance types in supported AWS
     *            Regions. To learn more, <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     *            >Encrypting Data in Transit</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LustreDeploymentType
     */
    public CreateFileSystemLustreConfiguration withDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * <p>
     * (Optional) Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     * deployment types when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage
     * and workloads and encryption of data in transit. To learn more about
     * deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a
     * <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file system from
     * Amazon EC2 instances that <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     * >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types is supported when accessed
     * from supported instance types in supported AWS Regions. To learn more, <a
     * href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     * >Encrypting Data in Transit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            (Optional) Choose <code>SCRATCH_1</code> and
     *            <code>SCRATCH_2</code> deployment types when you need
     *            temporary storage and shorter-term processing of data. The
     *            <code>SCRATCH_2</code> deployment type provides in-transit
     *            encryption of data and higher burst throughput capacity than
     *            <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            Choose <code>PERSISTENT_1</code> deployment type for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>.
     *            </p>
     *            <p>
     *            Encryption of data in-transit is automatically enabled when
     *            you access a <code>SCRATCH_2</code> or
     *            <code>PERSISTENT_1</code> file system from Amazon EC2
     *            instances that <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     *            >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     *            </p>
     *            <p>
     *            Encryption of data in-transit for <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types is supported when
     *            accessed from supported instance types in supported AWS
     *            Regions. To learn more, <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     *            >Encrypting Data in Transit</a>.
     *            </p>
     * @see LustreDeploymentType
     */
    public void setDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
    }

    /**
     * <p>
     * (Optional) Choose <code>SCRATCH_1</code> and <code>SCRATCH_2</code>
     * deployment types when you need temporary storage and shorter-term
     * processing of data. The <code>SCRATCH_2</code> deployment type provides
     * in-transit encryption of data and higher burst throughput capacity than
     * <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * Choose <code>PERSISTENT_1</code> deployment type for longer-term storage
     * and workloads and encryption of data in transit. To learn more about
     * deployment types, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     * > FSx for Lustre Deployment Options</a>.
     * </p>
     * <p>
     * Encryption of data in-transit is automatically enabled when you access a
     * <code>SCRATCH_2</code> or <code>PERSISTENT_1</code> file system from
     * Amazon EC2 instances that <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     * >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * <p>
     * Encryption of data in-transit for <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types is supported when accessed
     * from supported instance types in supported AWS Regions. To learn more, <a
     * href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     * >Encrypting Data in Transit</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            (Optional) Choose <code>SCRATCH_1</code> and
     *            <code>SCRATCH_2</code> deployment types when you need
     *            temporary storage and shorter-term processing of data. The
     *            <code>SCRATCH_2</code> deployment type provides in-transit
     *            encryption of data and higher burst throughput capacity than
     *            <code>SCRATCH_1</code>.
     *            </p>
     *            <p>
     *            Choose <code>PERSISTENT_1</code> deployment type for
     *            longer-term storage and workloads and encryption of data in
     *            transit. To learn more about deployment types, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"
     *            > FSx for Lustre Deployment Options</a>.
     *            </p>
     *            <p>
     *            Encryption of data in-transit is automatically enabled when
     *            you access a <code>SCRATCH_2</code> or
     *            <code>PERSISTENT_1</code> file system from Amazon EC2
     *            instances that <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/data- protection.html"
     *            >support this feature</a>. (Default = <code>SCRATCH_1</code>)
     *            </p>
     *            <p>
     *            Encryption of data in-transit for <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types is supported when
     *            accessed from supported instance types in supported AWS
     *            Regions. To learn more, <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html"
     *            >Encrypting Data in Transit</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LustreDeploymentType
     */
    public CreateFileSystemLustreConfiguration withDeploymentType(
            LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the
     * amount of read and write throughput for each 1 tebibyte of storage, in
     * MB/s/TiB. File system throughput capacity is calculated by multiplying
     * ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput
     * (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of
     * PerUnitStorageThroughput yields 117 MB/s of ﬁle system throughput. You
     * pay for the amount of throughput that you provision.
     * </p>
     * <p>
     * Valid values are 50, 100, 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @return <p>
     *         Required for the <code>PERSISTENT_1</code> deployment type,
     *         describes the amount of read and write throughput for each 1
     *         tebibyte of storage, in MB/s/TiB. File system throughput capacity
     *         is calculated by multiplying ﬁle system storage capacity (TiB) by
     *         the PerUnitStorageThroughput (MB/s/TiB). For a 2.4 TiB ﬁle
     *         system, provisioning 50 MB/s/TiB of PerUnitStorageThroughput
     *         yields 117 MB/s of ﬁle system throughput. You pay for the amount
     *         of throughput that you provision.
     *         </p>
     *         <p>
     *         Valid values are 50, 100, 200.
     *         </p>
     */
    public Integer getPerUnitStorageThroughput() {
        return perUnitStorageThroughput;
    }

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the
     * amount of read and write throughput for each 1 tebibyte of storage, in
     * MB/s/TiB. File system throughput capacity is calculated by multiplying
     * ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput
     * (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of
     * PerUnitStorageThroughput yields 117 MB/s of ﬁle system throughput. You
     * pay for the amount of throughput that you provision.
     * </p>
     * <p>
     * Valid values are 50, 100, 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @param perUnitStorageThroughput <p>
     *            Required for the <code>PERSISTENT_1</code> deployment type,
     *            describes the amount of read and write throughput for each 1
     *            tebibyte of storage, in MB/s/TiB. File system throughput
     *            capacity is calculated by multiplying ﬁle system storage
     *            capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For
     *            a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of
     *            PerUnitStorageThroughput yields 117 MB/s of ﬁle system
     *            throughput. You pay for the amount of throughput that you
     *            provision.
     *            </p>
     *            <p>
     *            Valid values are 50, 100, 200.
     *            </p>
     */
    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Required for the <code>PERSISTENT_1</code> deployment type, describes the
     * amount of read and write throughput for each 1 tebibyte of storage, in
     * MB/s/TiB. File system throughput capacity is calculated by multiplying
     * ﬁle system storage capacity (TiB) by the PerUnitStorageThroughput
     * (MB/s/TiB). For a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of
     * PerUnitStorageThroughput yields 117 MB/s of ﬁle system throughput. You
     * pay for the amount of throughput that you provision.
     * </p>
     * <p>
     * Valid values are 50, 100, 200.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @param perUnitStorageThroughput <p>
     *            Required for the <code>PERSISTENT_1</code> deployment type,
     *            describes the amount of read and write throughput for each 1
     *            tebibyte of storage, in MB/s/TiB. File system throughput
     *            capacity is calculated by multiplying ﬁle system storage
     *            capacity (TiB) by the PerUnitStorageThroughput (MB/s/TiB). For
     *            a 2.4 TiB ﬁle system, provisioning 50 MB/s/TiB of
     *            PerUnitStorageThroughput yields 117 MB/s of ﬁle system
     *            throughput. You pay for the amount of throughput that you
     *            provision.
     *            </p>
     *            <p>
     *            Valid values are 50, 100, 200.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemLustreConfiguration withPerUnitStorageThroughput(
            Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: " + getWeeklyMaintenanceStartTime() + ",");
        if (getImportPath() != null)
            sb.append("ImportPath: " + getImportPath() + ",");
        if (getExportPath() != null)
            sb.append("ExportPath: " + getExportPath() + ",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: " + getImportedFileChunkSize() + ",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: " + getDeploymentType() + ",");
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: " + getPerUnitStorageThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime()
                        .hashCode());
        hashCode = prime * hashCode + ((getImportPath() == null) ? 0 : getImportPath().hashCode());
        hashCode = prime * hashCode + ((getExportPath() == null) ? 0 : getExportPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemLustreConfiguration == false)
            return false;
        CreateFileSystemLustreConfiguration other = (CreateFileSystemLustreConfiguration) obj;

        if (other.getWeeklyMaintenanceStartTime() == null
                ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null
                && other.getWeeklyMaintenanceStartTime().equals(
                        this.getWeeklyMaintenanceStartTime()) == false)
            return false;
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
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null
                && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getPerUnitStorageThroughput() == null
                ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null
                && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        return true;
    }
}
