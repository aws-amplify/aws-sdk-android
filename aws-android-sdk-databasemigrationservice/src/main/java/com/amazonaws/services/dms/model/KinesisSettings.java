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
 * Provides information that describes an Amazon Kinesis Data Stream endpoint.
 * This information includes the output format of records applied to the
 * endpoint and details of transaction and control table data information.
 * </p>
 */
public class KinesisSettings implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams
     * endpoint.
     * </p>
     */
    private String streamArn;

    /**
     * <p>
     * The output format for the records created on the endpoint. The message
     * format is <code>JSON</code> (default) or <code>JSON_UNFORMATTED</code> (a
     * single line with no tab).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, json-unformatted
     */
    private String messageFormat;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management
     * (IAM) role that AWS DMS uses to write to the Kinesis data stream.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * Provides detailed transaction information from the source database. This
     * information includes a commit timestamp, a log position, and values for
     * <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a
     * transaction). The default is <code>False</code>.
     * </p>
     */
    private Boolean includeTransactionDetails;

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the
     * partition type is <code>schema-table-type</code>. The default is
     * <code>False</code>.
     * </p>
     */
    private Boolean includePartitionValue;

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition
     * type is <code>primary-key-type</code>. Doing this increases data
     * distribution among Kinesis shards. For example, suppose that a SysBench
     * schema has thousands of tables and each table has only limited range for
     * a primary key. In this case, the same primary key is sent from thousands
     * of tables to the same shard, which causes throttling. The default is
     * <code>False</code>.
     * </p>
     */
    private Boolean partitionIncludeSchemaTable;

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the
     * table in the control data, such as <code>rename-table</code>,
     * <code>drop-table</code>, <code>add-column</code>,
     * <code>drop-column</code>, and <code>rename-column</code>. The default is
     * <code>False</code>.
     * </p>
     */
    private Boolean includeTableAlterOperations;

    /**
     * <p>
     * Shows detailed control information for table definition, column
     * definition, and table and column changes in the Kinesis message output.
     * The default is <code>False</code>.
     * </p>
     */
    private Boolean includeControlDetails;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the Amazon Kinesis Data
     *         Streams endpoint.
     *         </p>
     */
    public String getStreamArn() {
        return streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams
     * endpoint.
     * </p>
     *
     * @param streamArn <p>
     *            The Amazon Resource Name (ARN) for the Amazon Kinesis Data
     *            Streams endpoint.
     *            </p>
     */
    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamArn <p>
     *            The Amazon Resource Name (ARN) for the Amazon Kinesis Data
     *            Streams endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message
     * format is <code>JSON</code> (default) or <code>JSON_UNFORMATTED</code> (a
     * single line with no tab).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, json-unformatted
     *
     * @return <p>
     *         The output format for the records created on the endpoint. The
     *         message format is <code>JSON</code> (default) or
     *         <code>JSON_UNFORMATTED</code> (a single line with no tab).
     *         </p>
     * @see MessageFormatValue
     */
    public String getMessageFormat() {
        return messageFormat;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message
     * format is <code>JSON</code> (default) or <code>JSON_UNFORMATTED</code> (a
     * single line with no tab).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, json-unformatted
     *
     * @param messageFormat <p>
     *            The output format for the records created on the endpoint. The
     *            message format is <code>JSON</code> (default) or
     *            <code>JSON_UNFORMATTED</code> (a single line with no tab).
     *            </p>
     * @see MessageFormatValue
     */
    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message
     * format is <code>JSON</code> (default) or <code>JSON_UNFORMATTED</code> (a
     * single line with no tab).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, json-unformatted
     *
     * @param messageFormat <p>
     *            The output format for the records created on the endpoint. The
     *            message format is <code>JSON</code> (default) or
     *            <code>JSON_UNFORMATTED</code> (a single line with no tab).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormatValue
     */
    public KinesisSettings withMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
        return this;
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message
     * format is <code>JSON</code> (default) or <code>JSON_UNFORMATTED</code> (a
     * single line with no tab).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, json-unformatted
     *
     * @param messageFormat <p>
     *            The output format for the records created on the endpoint. The
     *            message format is <code>JSON</code> (default) or
     *            <code>JSON_UNFORMATTED</code> (a single line with no tab).
     *            </p>
     * @see MessageFormatValue
     */
    public void setMessageFormat(MessageFormatValue messageFormat) {
        this.messageFormat = messageFormat.toString();
    }

    /**
     * <p>
     * The output format for the records created on the endpoint. The message
     * format is <code>JSON</code> (default) or <code>JSON_UNFORMATTED</code> (a
     * single line with no tab).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, json-unformatted
     *
     * @param messageFormat <p>
     *            The output format for the records created on the endpoint. The
     *            message format is <code>JSON</code> (default) or
     *            <code>JSON_UNFORMATTED</code> (a single line with no tab).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormatValue
     */
    public KinesisSettings withMessageFormat(MessageFormatValue messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management
     * (IAM) role that AWS DMS uses to write to the Kinesis data stream.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the AWS Identity and Access
     *         Management (IAM) role that AWS DMS uses to write to the Kinesis
     *         data stream.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management
     * (IAM) role that AWS DMS uses to write to the Kinesis data stream.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) for the AWS Identity and Access
     *            Management (IAM) role that AWS DMS uses to write to the
     *            Kinesis data stream.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AWS Identity and Access Management
     * (IAM) role that AWS DMS uses to write to the Kinesis data stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) for the AWS Identity and Access
     *            Management (IAM) role that AWS DMS uses to write to the
     *            Kinesis data stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This
     * information includes a commit timestamp, a log position, and values for
     * <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a
     * transaction). The default is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Provides detailed transaction information from the source
     *         database. This information includes a commit timestamp, a log
     *         position, and values for <code>transaction_id</code>, previous
     *         <code>transaction_id</code>, and
     *         <code>transaction_record_id</code> (the record offset within a
     *         transaction). The default is <code>False</code>.
     *         </p>
     */
    public Boolean isIncludeTransactionDetails() {
        return includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This
     * information includes a commit timestamp, a log position, and values for
     * <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a
     * transaction). The default is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Provides detailed transaction information from the source
     *         database. This information includes a commit timestamp, a log
     *         position, and values for <code>transaction_id</code>, previous
     *         <code>transaction_id</code>, and
     *         <code>transaction_record_id</code> (the record offset within a
     *         transaction). The default is <code>False</code>.
     *         </p>
     */
    public Boolean getIncludeTransactionDetails() {
        return includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This
     * information includes a commit timestamp, a log position, and values for
     * <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a
     * transaction). The default is <code>False</code>.
     * </p>
     *
     * @param includeTransactionDetails <p>
     *            Provides detailed transaction information from the source
     *            database. This information includes a commit timestamp, a log
     *            position, and values for <code>transaction_id</code>, previous
     *            <code>transaction_id</code>, and
     *            <code>transaction_record_id</code> (the record offset within a
     *            transaction). The default is <code>False</code>.
     *            </p>
     */
    public void setIncludeTransactionDetails(Boolean includeTransactionDetails) {
        this.includeTransactionDetails = includeTransactionDetails;
    }

    /**
     * <p>
     * Provides detailed transaction information from the source database. This
     * information includes a commit timestamp, a log position, and values for
     * <code>transaction_id</code>, previous <code>transaction_id</code>, and
     * <code>transaction_record_id</code> (the record offset within a
     * transaction). The default is <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeTransactionDetails <p>
     *            Provides detailed transaction information from the source
     *            database. This information includes a commit timestamp, a log
     *            position, and values for <code>transaction_id</code>, previous
     *            <code>transaction_id</code>, and
     *            <code>transaction_record_id</code> (the record offset within a
     *            transaction). The default is <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withIncludeTransactionDetails(Boolean includeTransactionDetails) {
        this.includeTransactionDetails = includeTransactionDetails;
        return this;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the
     * partition type is <code>schema-table-type</code>. The default is
     * <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Shows the partition value within the Kinesis message output,
     *         unless the partition type is <code>schema-table-type</code>. The
     *         default is <code>False</code>.
     *         </p>
     */
    public Boolean isIncludePartitionValue() {
        return includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the
     * partition type is <code>schema-table-type</code>. The default is
     * <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Shows the partition value within the Kinesis message output,
     *         unless the partition type is <code>schema-table-type</code>. The
     *         default is <code>False</code>.
     *         </p>
     */
    public Boolean getIncludePartitionValue() {
        return includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the
     * partition type is <code>schema-table-type</code>. The default is
     * <code>False</code>.
     * </p>
     *
     * @param includePartitionValue <p>
     *            Shows the partition value within the Kinesis message output,
     *            unless the partition type is <code>schema-table-type</code>.
     *            The default is <code>False</code>.
     *            </p>
     */
    public void setIncludePartitionValue(Boolean includePartitionValue) {
        this.includePartitionValue = includePartitionValue;
    }

    /**
     * <p>
     * Shows the partition value within the Kinesis message output, unless the
     * partition type is <code>schema-table-type</code>. The default is
     * <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includePartitionValue <p>
     *            Shows the partition value within the Kinesis message output,
     *            unless the partition type is <code>schema-table-type</code>.
     *            The default is <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withIncludePartitionValue(Boolean includePartitionValue) {
        this.includePartitionValue = includePartitionValue;
        return this;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition
     * type is <code>primary-key-type</code>. Doing this increases data
     * distribution among Kinesis shards. For example, suppose that a SysBench
     * schema has thousands of tables and each table has only limited range for
     * a primary key. In this case, the same primary key is sent from thousands
     * of tables to the same shard, which causes throttling. The default is
     * <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Prefixes schema and table names to partition values, when the
     *         partition type is <code>primary-key-type</code>. Doing this
     *         increases data distribution among Kinesis shards. For example,
     *         suppose that a SysBench schema has thousands of tables and each
     *         table has only limited range for a primary key. In this case, the
     *         same primary key is sent from thousands of tables to the same
     *         shard, which causes throttling. The default is <code>False</code>
     *         .
     *         </p>
     */
    public Boolean isPartitionIncludeSchemaTable() {
        return partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition
     * type is <code>primary-key-type</code>. Doing this increases data
     * distribution among Kinesis shards. For example, suppose that a SysBench
     * schema has thousands of tables and each table has only limited range for
     * a primary key. In this case, the same primary key is sent from thousands
     * of tables to the same shard, which causes throttling. The default is
     * <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Prefixes schema and table names to partition values, when the
     *         partition type is <code>primary-key-type</code>. Doing this
     *         increases data distribution among Kinesis shards. For example,
     *         suppose that a SysBench schema has thousands of tables and each
     *         table has only limited range for a primary key. In this case, the
     *         same primary key is sent from thousands of tables to the same
     *         shard, which causes throttling. The default is <code>False</code>
     *         .
     *         </p>
     */
    public Boolean getPartitionIncludeSchemaTable() {
        return partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition
     * type is <code>primary-key-type</code>. Doing this increases data
     * distribution among Kinesis shards. For example, suppose that a SysBench
     * schema has thousands of tables and each table has only limited range for
     * a primary key. In this case, the same primary key is sent from thousands
     * of tables to the same shard, which causes throttling. The default is
     * <code>False</code>.
     * </p>
     *
     * @param partitionIncludeSchemaTable <p>
     *            Prefixes schema and table names to partition values, when the
     *            partition type is <code>primary-key-type</code>. Doing this
     *            increases data distribution among Kinesis shards. For example,
     *            suppose that a SysBench schema has thousands of tables and
     *            each table has only limited range for a primary key. In this
     *            case, the same primary key is sent from thousands of tables to
     *            the same shard, which causes throttling. The default is
     *            <code>False</code>.
     *            </p>
     */
    public void setPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
    }

    /**
     * <p>
     * Prefixes schema and table names to partition values, when the partition
     * type is <code>primary-key-type</code>. Doing this increases data
     * distribution among Kinesis shards. For example, suppose that a SysBench
     * schema has thousands of tables and each table has only limited range for
     * a primary key. In this case, the same primary key is sent from thousands
     * of tables to the same shard, which causes throttling. The default is
     * <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionIncludeSchemaTable <p>
     *            Prefixes schema and table names to partition values, when the
     *            partition type is <code>primary-key-type</code>. Doing this
     *            increases data distribution among Kinesis shards. For example,
     *            suppose that a SysBench schema has thousands of tables and
     *            each table has only limited range for a primary key. In this
     *            case, the same primary key is sent from thousands of tables to
     *            the same shard, which causes throttling. The default is
     *            <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
        return this;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the
     * table in the control data, such as <code>rename-table</code>,
     * <code>drop-table</code>, <code>add-column</code>,
     * <code>drop-column</code>, and <code>rename-column</code>. The default is
     * <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Includes any data definition language (DDL) operations that
     *         change the table in the control data, such as
     *         <code>rename-table</code>, <code>drop-table</code>,
     *         <code>add-column</code>, <code>drop-column</code>, and
     *         <code>rename-column</code>. The default is <code>False</code>.
     *         </p>
     */
    public Boolean isIncludeTableAlterOperations() {
        return includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the
     * table in the control data, such as <code>rename-table</code>,
     * <code>drop-table</code>, <code>add-column</code>,
     * <code>drop-column</code>, and <code>rename-column</code>. The default is
     * <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Includes any data definition language (DDL) operations that
     *         change the table in the control data, such as
     *         <code>rename-table</code>, <code>drop-table</code>,
     *         <code>add-column</code>, <code>drop-column</code>, and
     *         <code>rename-column</code>. The default is <code>False</code>.
     *         </p>
     */
    public Boolean getIncludeTableAlterOperations() {
        return includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the
     * table in the control data, such as <code>rename-table</code>,
     * <code>drop-table</code>, <code>add-column</code>,
     * <code>drop-column</code>, and <code>rename-column</code>. The default is
     * <code>False</code>.
     * </p>
     *
     * @param includeTableAlterOperations <p>
     *            Includes any data definition language (DDL) operations that
     *            change the table in the control data, such as
     *            <code>rename-table</code>, <code>drop-table</code>,
     *            <code>add-column</code>, <code>drop-column</code>, and
     *            <code>rename-column</code>. The default is <code>False</code>.
     *            </p>
     */
    public void setIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
        this.includeTableAlterOperations = includeTableAlterOperations;
    }

    /**
     * <p>
     * Includes any data definition language (DDL) operations that change the
     * table in the control data, such as <code>rename-table</code>,
     * <code>drop-table</code>, <code>add-column</code>,
     * <code>drop-column</code>, and <code>rename-column</code>. The default is
     * <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeTableAlterOperations <p>
     *            Includes any data definition language (DDL) operations that
     *            change the table in the control data, such as
     *            <code>rename-table</code>, <code>drop-table</code>,
     *            <code>add-column</code>, <code>drop-column</code>, and
     *            <code>rename-column</code>. The default is <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
        this.includeTableAlterOperations = includeTableAlterOperations;
        return this;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column
     * definition, and table and column changes in the Kinesis message output.
     * The default is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Shows detailed control information for table definition, column
     *         definition, and table and column changes in the Kinesis message
     *         output. The default is <code>False</code>.
     *         </p>
     */
    public Boolean isIncludeControlDetails() {
        return includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column
     * definition, and table and column changes in the Kinesis message output.
     * The default is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         Shows detailed control information for table definition, column
     *         definition, and table and column changes in the Kinesis message
     *         output. The default is <code>False</code>.
     *         </p>
     */
    public Boolean getIncludeControlDetails() {
        return includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column
     * definition, and table and column changes in the Kinesis message output.
     * The default is <code>False</code>.
     * </p>
     *
     * @param includeControlDetails <p>
     *            Shows detailed control information for table definition,
     *            column definition, and table and column changes in the Kinesis
     *            message output. The default is <code>False</code>.
     *            </p>
     */
    public void setIncludeControlDetails(Boolean includeControlDetails) {
        this.includeControlDetails = includeControlDetails;
    }

    /**
     * <p>
     * Shows detailed control information for table definition, column
     * definition, and table and column changes in the Kinesis message output.
     * The default is <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeControlDetails <p>
     *            Shows detailed control information for table definition,
     *            column definition, and table and column changes in the Kinesis
     *            message output. The default is <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisSettings withIncludeControlDetails(Boolean includeControlDetails) {
        this.includeControlDetails = includeControlDetails;
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
        if (getStreamArn() != null)
            sb.append("StreamArn: " + getStreamArn() + ",");
        if (getMessageFormat() != null)
            sb.append("MessageFormat: " + getMessageFormat() + ",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getIncludeTransactionDetails() != null)
            sb.append("IncludeTransactionDetails: " + getIncludeTransactionDetails() + ",");
        if (getIncludePartitionValue() != null)
            sb.append("IncludePartitionValue: " + getIncludePartitionValue() + ",");
        if (getPartitionIncludeSchemaTable() != null)
            sb.append("PartitionIncludeSchemaTable: " + getPartitionIncludeSchemaTable() + ",");
        if (getIncludeTableAlterOperations() != null)
            sb.append("IncludeTableAlterOperations: " + getIncludeTableAlterOperations() + ",");
        if (getIncludeControlDetails() != null)
            sb.append("IncludeControlDetails: " + getIncludeControlDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode
                + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeTransactionDetails() == null) ? 0 : getIncludeTransactionDetails()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludePartitionValue() == null) ? 0 : getIncludePartitionValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getPartitionIncludeSchemaTable() == null) ? 0
                        : getPartitionIncludeSchemaTable().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeTableAlterOperations() == null) ? 0
                        : getIncludeTableAlterOperations().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeControlDetails() == null) ? 0 : getIncludeControlDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisSettings == false)
            return false;
        KinesisSettings other = (KinesisSettings) obj;

        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null
                && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null
                && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getIncludeTransactionDetails() == null
                ^ this.getIncludeTransactionDetails() == null)
            return false;
        if (other.getIncludeTransactionDetails() != null
                && other.getIncludeTransactionDetails().equals(this.getIncludeTransactionDetails()) == false)
            return false;
        if (other.getIncludePartitionValue() == null ^ this.getIncludePartitionValue() == null)
            return false;
        if (other.getIncludePartitionValue() != null
                && other.getIncludePartitionValue().equals(this.getIncludePartitionValue()) == false)
            return false;
        if (other.getPartitionIncludeSchemaTable() == null
                ^ this.getPartitionIncludeSchemaTable() == null)
            return false;
        if (other.getPartitionIncludeSchemaTable() != null
                && other.getPartitionIncludeSchemaTable().equals(
                        this.getPartitionIncludeSchemaTable()) == false)
            return false;
        if (other.getIncludeTableAlterOperations() == null
                ^ this.getIncludeTableAlterOperations() == null)
            return false;
        if (other.getIncludeTableAlterOperations() != null
                && other.getIncludeTableAlterOperations().equals(
                        this.getIncludeTableAlterOperations()) == false)
            return false;
        if (other.getIncludeControlDetails() == null ^ this.getIncludeControlDetails() == null)
            return false;
        if (other.getIncludeControlDetails() != null
                && other.getIncludeControlDetails().equals(this.getIncludeControlDetails()) == false)
            return false;
        return true;
    }
}
