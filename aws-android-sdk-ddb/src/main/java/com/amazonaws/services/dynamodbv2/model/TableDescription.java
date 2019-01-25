/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the properties of a table.
 * </p>
 */
public class TableDescription implements Serializable {
    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these
     * objects describes one attribute in the table and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed
     * of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The primary key structure for the table. Each
     * <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based on
     * their partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The
     * term "range attribute" derives from the way DynamoDB stores items with
     * the same partition key physically close together, in sorted order by the
     * sort key value.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     */
    private String tableStatus;

    /**
     * <p>
     * The date and time when the table was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and
     * write capacity units, along with data about increases and decreases.
     * </p>
     */
    private ProvisionedThroughputDescription provisionedThroughput;

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     */
    private Long tableSizeBytes;

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     */
    private Long itemCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     */
    private String tableArn;

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String tableId;

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index
     * is scoped to a given partition key value. Tables with one or more local
     * secondary indexes are subject to an item collection size limit, where the
     * amount of data within a given item collection cannot exceed 10 GB. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in
     * bytes. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index.
     * DynamoDB updates this value approximately every six hours. Recent changes
     * might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     */
    private java.util.List<LocalSecondaryIndexDescription> localSecondaryIndexes;

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped
     * to a given partition key value. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the
     * backfilling phase. Backfilling occurs only when a new global secondary
     * index is added to the table; it is the process by which DynamoDB
     * populates the new index with data from the table. (This attribute does
     * not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary
     * index, in bytes. DynamoDB updates this value approximately every six
     * hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary
     * index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary
     * index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings
     * for the global secondary index, consisting of read and write capacity
     * units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexDescription> globalSecondaryIndexes;

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     */
    private StreamSpecification streamSpecification;

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for
     * the stream, because it is possible that a stream from another table might
     * have the same timestamp. However, the combination of the following three
     * elements is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String latestStreamLabel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream
     * for this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String latestStreamArn;

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     */
    private RestoreSummary restoreSummary;

    /**
     * <p>
     * The description of the server-side encryption status on the specified
     * table.
     * </p>
     */
    private SSEDescription sSEDescription;

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these
     * objects describes one attribute in the table and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed
     * of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of <code>AttributeDefinition</code> objects. Each of
     *         these objects describes one attribute in the table and index key
     *         schema.
     *         </p>
     *         <p>
     *         Each <code>AttributeDefinition</code> object in this array is
     *         composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AttributeName</code> - The name of the attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AttributeType</code> - The data type for the attribute.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these
     * objects describes one attribute in the table and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed
     * of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     *
     * @param attributeDefinitions <p>
     *            An array of <code>AttributeDefinition</code> objects. Each of
     *            these objects describes one attribute in the table and index
     *            key schema.
     *            </p>
     *            <p>
     *            Each <code>AttributeDefinition</code> object in this array is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of the attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributeType</code> - The data type for the attribute.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAttributeDefinitions(
            java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }

        this.attributeDefinitions = new java.util.ArrayList<AttributeDefinition>(
                attributeDefinitions);
    }

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these
     * objects describes one attribute in the table and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed
     * of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeDefinitions <p>
     *            An array of <code>AttributeDefinition</code> objects. Each of
     *            these objects describes one attribute in the table and index
     *            key schema.
     *            </p>
     *            <p>
     *            Each <code>AttributeDefinition</code> object in this array is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of the attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributeType</code> - The data type for the attribute.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
        if (getAttributeDefinitions() == null) {
            this.attributeDefinitions = new java.util.ArrayList<AttributeDefinition>(
                    attributeDefinitions.length);
        }
        for (AttributeDefinition value : attributeDefinitions) {
            this.attributeDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these
     * objects describes one attribute in the table and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed
     * of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeDefinitions <p>
     *            An array of <code>AttributeDefinition</code> objects. Each of
     *            these objects describes one attribute in the table and index
     *            key schema.
     *            </p>
     *            <p>
     *            Each <code>AttributeDefinition</code> object in this array is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of the attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributeType</code> - The data type for the attribute.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withAttributeDefinitions(
            java.util.Collection<AttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The primary key structure for the table. Each
     * <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based on
     * their partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The
     * term "range attribute" derives from the way DynamoDB stores items with
     * the same partition key physically close together, in sorted order by the
     * sort key value.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The primary key structure for the table. Each
     *         <code>KeySchemaElement</code> consists of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AttributeName</code> - The name of the attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeyType</code> - The role of the attribute:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HASH</code> - partition key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RANGE</code> - sort key
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The partition key of an item is also known as its <i>hash
     *         attribute</i>. The term "hash attribute" derives from DynamoDB'
     *         usage of an internal hash function to evenly distribute data
     *         items across partitions, based on their partition key values.
     *         </p>
     *         <p>
     *         The sort key of an item is also known as its <i>range
     *         attribute</i>. The term "range attribute" derives from the way
     *         DynamoDB stores items with the same partition key physically
     *         close together, in sorted order by the sort key value.
     *         </p>
     *         </note></li>
     *         </ul>
     *         <p>
     *         For more information about primary keys, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *         >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The primary key structure for the table. Each
     * <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based on
     * their partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The
     * term "range attribute" derives from the way DynamoDB stores items with
     * the same partition key physically close together, in sorted order by the
     * sort key value.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param keySchema <p>
     *            The primary key structure for the table. Each
     *            <code>KeySchemaElement</code> consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of the attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeyType</code> - The role of the attribute:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HASH</code> - partition key
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RANGE</code> - sort key
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The partition key of an item is also known as its <i>hash
     *            attribute</i>. The term "hash attribute" derives from
     *            DynamoDB' usage of an internal hash function to evenly
     *            distribute data items across partitions, based on their
     *            partition key values.
     *            </p>
     *            <p>
     *            The sort key of an item is also known as its <i>range
     *            attribute</i>. The term "range attribute" derives from the way
     *            DynamoDB stores items with the same partition key physically
     *            close together, in sorted order by the sort key value.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<KeySchemaElement>(keySchema);
    }

    /**
     * <p>
     * The primary key structure for the table. Each
     * <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based on
     * their partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The
     * term "range attribute" derives from the way DynamoDB stores items with
     * the same partition key physically close together, in sorted order by the
     * sort key value.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            The primary key structure for the table. Each
     *            <code>KeySchemaElement</code> consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of the attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeyType</code> - The role of the attribute:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HASH</code> - partition key
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RANGE</code> - sort key
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The partition key of an item is also known as its <i>hash
     *            attribute</i>. The term "hash attribute" derives from
     *            DynamoDB' usage of an internal hash function to evenly
     *            distribute data items across partitions, based on their
     *            partition key values.
     *            </p>
     *            <p>
     *            The sort key of an item is also known as its <i>range
     *            attribute</i>. The term "range attribute" derives from the way
     *            DynamoDB stores items with the same partition key physically
     *            close together, in sorted order by the sort key value.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withKeySchema(KeySchemaElement... keySchema) {
        if (getKeySchema() == null) {
            this.keySchema = new java.util.ArrayList<KeySchemaElement>(keySchema.length);
        }
        for (KeySchemaElement value : keySchema) {
            this.keySchema.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The primary key structure for the table. Each
     * <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>.
     * The term "hash attribute" derives from DynamoDB' usage of an internal
     * hash function to evenly distribute data items across partitions, based on
     * their partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The
     * term "range attribute" derives from the way DynamoDB stores items with
     * the same partition key physically close together, in sorted order by the
     * sort key value.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            The primary key structure for the table. Each
     *            <code>KeySchemaElement</code> consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AttributeName</code> - The name of the attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeyType</code> - The role of the attribute:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HASH</code> - partition key
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RANGE</code> - sort key
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            The partition key of an item is also known as its <i>hash
     *            attribute</i>. The term "hash attribute" derives from
     *            DynamoDB' usage of an internal hash function to evenly
     *            distribute data items across partitions, based on their
     *            partition key values.
     *            </p>
     *            <p>
     *            The sort key of an item is also known as its <i>range
     *            attribute</i>. The term "range attribute" derives from the way
     *            DynamoDB stores items with the same partition key physically
     *            close together, in sorted order by the sort key value.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            For more information about primary keys, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *            >Primary Key</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @return <p>
     *         The current state of the table:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The table is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The table is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The table is ready for use.
     *         </p>
     *         </li>
     *         </ul>
     * @see TableStatus
     */
    public String getTableStatus() {
        return tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see TableStatus
     */
    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TableStatus
     */
    public TableDescription withTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see TableStatus
     */
    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TableStatus
     */
    public TableDescription withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the table was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     *
     * @return <p>
     *         The date and time when the table was created, in <a
     *         href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time when the table was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time when the table was created, in <a
     *            href="http://www.epochconverter.com/">UNIX epoch time</a>
     *            format.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the table was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time when the table was created, in <a
     *            href="http://www.epochconverter.com/">UNIX epoch time</a>
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and
     * write capacity units, along with data about increases and decreases.
     * </p>
     *
     * @return <p>
     *         The provisioned throughput settings for the table, consisting of
     *         read and write capacity units, along with data about increases
     *         and decreases.
     *         </p>
     */
    public ProvisionedThroughputDescription getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and
     * write capacity units, along with data about increases and decreases.
     * </p>
     *
     * @param provisionedThroughput <p>
     *            The provisioned throughput settings for the table, consisting
     *            of read and write capacity units, along with data about
     *            increases and decreases.
     *            </p>
     */
    public void setProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and
     * write capacity units, along with data about increases and decreases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughput <p>
     *            The provisioned throughput settings for the table, consisting
     *            of read and write capacity units, along with data about
     *            increases and decreases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withProvisionedThroughput(
            ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     *
     * @return <p>
     *         The total size of the specified table, in bytes. DynamoDB updates
     *         this value approximately every six hours. Recent changes might
     *         not be reflected in this value.
     *         </p>
     */
    public Long getTableSizeBytes() {
        return tableSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     *
     * @param tableSizeBytes <p>
     *            The total size of the specified table, in bytes. DynamoDB
     *            updates this value approximately every six hours. Recent
     *            changes might not be reflected in this value.
     *            </p>
     */
    public void setTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableSizeBytes <p>
     *            The total size of the specified table, in bytes. DynamoDB
     *            updates this value approximately every six hours. Recent
     *            changes might not be reflected in this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
        return this;
    }

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     *
     * @return <p>
     *         The number of items in the specified table. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     *         </p>
     */
    public Long getItemCount() {
        return itemCount;
    }

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     *
     * @param itemCount <p>
     *            The number of items in the specified table. DynamoDB updates
     *            this value approximately every six hours. Recent changes might
     *            not be reflected in this value.
     *            </p>
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param itemCount <p>
     *            The number of items in the specified table. DynamoDB updates
     *            this value approximately every six hours. Recent changes might
     *            not be reflected in this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the
     *         table.
     *         </p>
     */
    public String getTableArn() {
        return tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     *
     * @param tableArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            table.
     *            </p>
     */
    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withTableArn(String tableArn) {
        this.tableArn = tableArn;
        return this;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         Unique identifier for the table for which the backup was created.
     *         </p>
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param tableId <p>
     *            Unique identifier for the table for which the backup was
     *            created.
     *            </p>
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param tableId <p>
     *            Unique identifier for the table for which the backup was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index
     * is scoped to a given partition key value. Tables with one or more local
     * secondary indexes are subject to an item collection size limit, where the
     * amount of data within a given item collection cannot exceed 10 GB. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in
     * bytes. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index.
     * DynamoDB updates this value approximately every six hours. Recent changes
     * might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     *
     * @return <p>
     *         Represents one or more local secondary indexes on the table. Each
     *         index is scoped to a given partition key value. Tables with one
     *         or more local secondary indexes are subject to an item collection
     *         size limit, where the amount of data within a given item
     *         collection cannot exceed 10 GB. Each element is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IndexName</code> - The name of the local secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeySchema</code> - Specifies the complete index key schema.
     *         The attribute names in the key schema must be between 1 and 255
     *         characters (inclusive). The key schema must begin with the same
     *         partition key as the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Projection</code> - Specifies attributes that are copied
     *         (projected) from the table into the index. These are in addition
     *         to the primary key attributes and index key attributes, which are
     *         automatically projected. Each attribute specification is composed
     *         of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ProjectionType</code> - One of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - Only the index and primary keys are
     *         projected into the index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCLUDE</code> - Only the specified table attributes are
     *         projected into the index. The list of projected attributes are in
     *         <code>NonKeyAttributes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - All of the table attributes are projected into
     *         the index.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NonKeyAttributes</code> - A list of one or more non-key
     *         attribute names that are projected into the secondary index. The
     *         total count of attributes provided in
     *         <code>NonKeyAttributes</code>, summed across all of the secondary
     *         indexes, must not exceed 20. If you project the same attribute
     *         into two different indexes, this counts as two distinct
     *         attributes when determining the total.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexSizeBytes</code> - Represents the total size of the
     *         index, in bytes. DynamoDB updates this value approximately every
     *         six hours. Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ItemCount</code> - Represents the number of items in the
     *         index. DynamoDB updates this value approximately every six hours.
     *         Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the table is in the <code>DELETING</code> state, no
     *         information about indexes will be returned.
     *         </p>
     */
    public java.util.List<LocalSecondaryIndexDescription> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index
     * is scoped to a given partition key value. Tables with one or more local
     * secondary indexes are subject to an item collection size limit, where the
     * amount of data within a given item collection cannot exceed 10 GB. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in
     * bytes. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index.
     * DynamoDB updates this value approximately every six hours. Recent changes
     * might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     *
     * @param localSecondaryIndexes <p>
     *            Represents one or more local secondary indexes on the table.
     *            Each index is scoped to a given partition key value. Tables
     *            with one or more local secondary indexes are subject to an
     *            item collection size limit, where the amount of data within a
     *            given item collection cannot exceed 10 GB. Each element is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IndexName</code> - The name of the local secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema</code> - Specifies the complete index key
     *            schema. The attribute names in the key schema must be between
     *            1 and 255 characters (inclusive). The key schema must begin
     *            with the same partition key as the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection</code> - Specifies attributes that are copied
     *            (projected) from the table into the index. These are in
     *            addition to the primary key attributes and index key
     *            attributes, which are automatically projected. Each attribute
     *            specification is composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ProjectionType</code> - One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEYS_ONLY</code> - Only the index and primary keys are
     *            projected into the index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INCLUDE</code> - Only the specified table attributes are
     *            projected into the index. The list of projected attributes are
     *            in <code>NonKeyAttributes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code> - All of the table attributes are projected
     *            into the index.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NonKeyAttributes</code> - A list of one or more non-key
     *            attribute names that are projected into the secondary index.
     *            The total count of attributes provided in
     *            <code>NonKeyAttributes</code>, summed across all of the
     *            secondary indexes, must not exceed 20. If you project the same
     *            attribute into two different indexes, this counts as two
     *            distinct attributes when determining the total.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexSizeBytes</code> - Represents the total size of the
     *            index, in bytes. DynamoDB updates this value approximately
     *            every six hours. Recent changes might not be reflected in this
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ItemCount</code> - Represents the number of items in the
     *            index. DynamoDB updates this value approximately every six
     *            hours. Recent changes might not be reflected in this value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the table is in the <code>DELETING</code> state, no
     *            information about indexes will be returned.
     *            </p>
     */
    public void setLocalSecondaryIndexes(
            java.util.Collection<LocalSecondaryIndexDescription> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndexDescription>(
                localSecondaryIndexes);
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index
     * is scoped to a given partition key value. Tables with one or more local
     * secondary indexes are subject to an item collection size limit, where the
     * amount of data within a given item collection cannot exceed 10 GB. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in
     * bytes. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index.
     * DynamoDB updates this value approximately every six hours. Recent changes
     * might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexes <p>
     *            Represents one or more local secondary indexes on the table.
     *            Each index is scoped to a given partition key value. Tables
     *            with one or more local secondary indexes are subject to an
     *            item collection size limit, where the amount of data within a
     *            given item collection cannot exceed 10 GB. Each element is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IndexName</code> - The name of the local secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema</code> - Specifies the complete index key
     *            schema. The attribute names in the key schema must be between
     *            1 and 255 characters (inclusive). The key schema must begin
     *            with the same partition key as the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection</code> - Specifies attributes that are copied
     *            (projected) from the table into the index. These are in
     *            addition to the primary key attributes and index key
     *            attributes, which are automatically projected. Each attribute
     *            specification is composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ProjectionType</code> - One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEYS_ONLY</code> - Only the index and primary keys are
     *            projected into the index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INCLUDE</code> - Only the specified table attributes are
     *            projected into the index. The list of projected attributes are
     *            in <code>NonKeyAttributes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code> - All of the table attributes are projected
     *            into the index.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NonKeyAttributes</code> - A list of one or more non-key
     *            attribute names that are projected into the secondary index.
     *            The total count of attributes provided in
     *            <code>NonKeyAttributes</code>, summed across all of the
     *            secondary indexes, must not exceed 20. If you project the same
     *            attribute into two different indexes, this counts as two
     *            distinct attributes when determining the total.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexSizeBytes</code> - Represents the total size of the
     *            index, in bytes. DynamoDB updates this value approximately
     *            every six hours. Recent changes might not be reflected in this
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ItemCount</code> - Represents the number of items in the
     *            index. DynamoDB updates this value approximately every six
     *            hours. Recent changes might not be reflected in this value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the table is in the <code>DELETING</code> state, no
     *            information about indexes will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withLocalSecondaryIndexes(
            LocalSecondaryIndexDescription... localSecondaryIndexes) {
        if (getLocalSecondaryIndexes() == null) {
            this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndexDescription>(
                    localSecondaryIndexes.length);
        }
        for (LocalSecondaryIndexDescription value : localSecondaryIndexes) {
            this.localSecondaryIndexes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index
     * is scoped to a given partition key value. Tables with one or more local
     * secondary indexes are subject to an item collection size limit, where the
     * amount of data within a given item collection cannot exceed 10 GB. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in
     * bytes. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index.
     * DynamoDB updates this value approximately every six hours. Recent changes
     * might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localSecondaryIndexes <p>
     *            Represents one or more local secondary indexes on the table.
     *            Each index is scoped to a given partition key value. Tables
     *            with one or more local secondary indexes are subject to an
     *            item collection size limit, where the amount of data within a
     *            given item collection cannot exceed 10 GB. Each element is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IndexName</code> - The name of the local secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema</code> - Specifies the complete index key
     *            schema. The attribute names in the key schema must be between
     *            1 and 255 characters (inclusive). The key schema must begin
     *            with the same partition key as the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection</code> - Specifies attributes that are copied
     *            (projected) from the table into the index. These are in
     *            addition to the primary key attributes and index key
     *            attributes, which are automatically projected. Each attribute
     *            specification is composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ProjectionType</code> - One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEYS_ONLY</code> - Only the index and primary keys are
     *            projected into the index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INCLUDE</code> - Only the specified table attributes are
     *            projected into the index. The list of projected attributes are
     *            in <code>NonKeyAttributes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code> - All of the table attributes are projected
     *            into the index.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NonKeyAttributes</code> - A list of one or more non-key
     *            attribute names that are projected into the secondary index.
     *            The total count of attributes provided in
     *            <code>NonKeyAttributes</code>, summed across all of the
     *            secondary indexes, must not exceed 20. If you project the same
     *            attribute into two different indexes, this counts as two
     *            distinct attributes when determining the total.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexSizeBytes</code> - Represents the total size of the
     *            index, in bytes. DynamoDB updates this value approximately
     *            every six hours. Recent changes might not be reflected in this
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ItemCount</code> - Represents the number of items in the
     *            index. DynamoDB updates this value approximately every six
     *            hours. Recent changes might not be reflected in this value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the table is in the <code>DELETING</code> state, no
     *            information about indexes will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withLocalSecondaryIndexes(
            java.util.Collection<LocalSecondaryIndexDescription> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped
     * to a given partition key value. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the
     * backfilling phase. Backfilling occurs only when a new global secondary
     * index is added to the table; it is the process by which DynamoDB
     * populates the new index with data from the table. (This attribute does
     * not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary
     * index, in bytes. DynamoDB updates this value approximately every six
     * hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary
     * index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary
     * index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings
     * for the global secondary index, consisting of read and write capacity
     * units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     *
     * @return <p>
     *         The global secondary indexes, if any, on the table. Each index is
     *         scoped to a given partition key value. Each element is composed
     *         of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Backfilling</code> - If true, then the index is currently
     *         in the backfilling phase. Backfilling occurs only when a new
     *         global secondary index is added to the table; it is the process
     *         by which DynamoDB populates the new index with data from the
     *         table. (This attribute does not appear for indexes that were
     *         created during a <code>CreateTable</code> operation.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexName</code> - The name of the global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexSizeBytes</code> - The total size of the global
     *         secondary index, in bytes. DynamoDB updates this value
     *         approximately every six hours. Recent changes might not be
     *         reflected in this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexStatus</code> - The current status of the global
     *         secondary index:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The index is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The index is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The index is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The index is ready for use.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ItemCount</code> - The number of items in the global
     *         secondary index. DynamoDB updates this value approximately every
     *         six hours. Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeySchema</code> - Specifies the complete index key schema.
     *         The attribute names in the key schema must be between 1 and 255
     *         characters (inclusive). The key schema must begin with the same
     *         partition key as the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Projection</code> - Specifies attributes that are copied
     *         (projected) from the table into the index. These are in addition
     *         to the primary key attributes and index key attributes, which are
     *         automatically projected. Each attribute specification is composed
     *         of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ProjectionType</code> - One of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - Only the index and primary keys are
     *         projected into the index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCLUDE</code> - Only the specified table attributes are
     *         projected into the index. The list of projected attributes are in
     *         <code>NonKeyAttributes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - All of the table attributes are projected into
     *         the index.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NonKeyAttributes</code> - A list of one or more non-key
     *         attribute names that are projected into the secondary index. The
     *         total count of attributes provided in
     *         <code>NonKeyAttributes</code>, summed across all of the secondary
     *         indexes, must not exceed 20. If you project the same attribute
     *         into two different indexes, this counts as two distinct
     *         attributes when determining the total.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProvisionedThroughput</code> - The provisioned throughput
     *         settings for the global secondary index, consisting of read and
     *         write capacity units, along with data about increases and
     *         decreases.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the table is in the <code>DELETING</code> state, no
     *         information about indexes will be returned.
     *         </p>
     */
    public java.util.List<GlobalSecondaryIndexDescription> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped
     * to a given partition key value. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the
     * backfilling phase. Backfilling occurs only when a new global secondary
     * index is added to the table; it is the process by which DynamoDB
     * populates the new index with data from the table. (This attribute does
     * not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary
     * index, in bytes. DynamoDB updates this value approximately every six
     * hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary
     * index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary
     * index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings
     * for the global secondary index, consisting of read and write capacity
     * units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     *
     * @param globalSecondaryIndexes <p>
     *            The global secondary indexes, if any, on the table. Each index
     *            is scoped to a given partition key value. Each element is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Backfilling</code> - If true, then the index is
     *            currently in the backfilling phase. Backfilling occurs only
     *            when a new global secondary index is added to the table; it is
     *            the process by which DynamoDB populates the new index with
     *            data from the table. (This attribute does not appear for
     *            indexes that were created during a <code>CreateTable</code>
     *            operation.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexName</code> - The name of the global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexSizeBytes</code> - The total size of the global
     *            secondary index, in bytes. DynamoDB updates this value
     *            approximately every six hours. Recent changes might not be
     *            reflected in this value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexStatus</code> - The current status of the global
     *            secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The index is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The index is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The index is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The index is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ItemCount</code> - The number of items in the global
     *            secondary index. DynamoDB updates this value approximately
     *            every six hours. Recent changes might not be reflected in this
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema</code> - Specifies the complete index key
     *            schema. The attribute names in the key schema must be between
     *            1 and 255 characters (inclusive). The key schema must begin
     *            with the same partition key as the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection</code> - Specifies attributes that are copied
     *            (projected) from the table into the index. These are in
     *            addition to the primary key attributes and index key
     *            attributes, which are automatically projected. Each attribute
     *            specification is composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ProjectionType</code> - One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEYS_ONLY</code> - Only the index and primary keys are
     *            projected into the index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INCLUDE</code> - Only the specified table attributes are
     *            projected into the index. The list of projected attributes are
     *            in <code>NonKeyAttributes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code> - All of the table attributes are projected
     *            into the index.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NonKeyAttributes</code> - A list of one or more non-key
     *            attribute names that are projected into the secondary index.
     *            The total count of attributes provided in
     *            <code>NonKeyAttributes</code>, summed across all of the
     *            secondary indexes, must not exceed 20. If you project the same
     *            attribute into two different indexes, this counts as two
     *            distinct attributes when determining the total.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProvisionedThroughput</code> - The provisioned
     *            throughput settings for the global secondary index, consisting
     *            of read and write capacity units, along with data about
     *            increases and decreases.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the table is in the <code>DELETING</code> state, no
     *            information about indexes will be returned.
     *            </p>
     */
    public void setGlobalSecondaryIndexes(
            java.util.Collection<GlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndexDescription>(
                globalSecondaryIndexes);
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped
     * to a given partition key value. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the
     * backfilling phase. Backfilling occurs only when a new global secondary
     * index is added to the table; it is the process by which DynamoDB
     * populates the new index with data from the table. (This attribute does
     * not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary
     * index, in bytes. DynamoDB updates this value approximately every six
     * hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary
     * index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary
     * index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings
     * for the global secondary index, consisting of read and write capacity
     * units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            The global secondary indexes, if any, on the table. Each index
     *            is scoped to a given partition key value. Each element is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Backfilling</code> - If true, then the index is
     *            currently in the backfilling phase. Backfilling occurs only
     *            when a new global secondary index is added to the table; it is
     *            the process by which DynamoDB populates the new index with
     *            data from the table. (This attribute does not appear for
     *            indexes that were created during a <code>CreateTable</code>
     *            operation.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexName</code> - The name of the global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexSizeBytes</code> - The total size of the global
     *            secondary index, in bytes. DynamoDB updates this value
     *            approximately every six hours. Recent changes might not be
     *            reflected in this value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexStatus</code> - The current status of the global
     *            secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The index is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The index is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The index is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The index is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ItemCount</code> - The number of items in the global
     *            secondary index. DynamoDB updates this value approximately
     *            every six hours. Recent changes might not be reflected in this
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema</code> - Specifies the complete index key
     *            schema. The attribute names in the key schema must be between
     *            1 and 255 characters (inclusive). The key schema must begin
     *            with the same partition key as the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection</code> - Specifies attributes that are copied
     *            (projected) from the table into the index. These are in
     *            addition to the primary key attributes and index key
     *            attributes, which are automatically projected. Each attribute
     *            specification is composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ProjectionType</code> - One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEYS_ONLY</code> - Only the index and primary keys are
     *            projected into the index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INCLUDE</code> - Only the specified table attributes are
     *            projected into the index. The list of projected attributes are
     *            in <code>NonKeyAttributes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code> - All of the table attributes are projected
     *            into the index.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NonKeyAttributes</code> - A list of one or more non-key
     *            attribute names that are projected into the secondary index.
     *            The total count of attributes provided in
     *            <code>NonKeyAttributes</code>, summed across all of the
     *            secondary indexes, must not exceed 20. If you project the same
     *            attribute into two different indexes, this counts as two
     *            distinct attributes when determining the total.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProvisionedThroughput</code> - The provisioned
     *            throughput settings for the global secondary index, consisting
     *            of read and write capacity units, along with data about
     *            increases and decreases.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the table is in the <code>DELETING</code> state, no
     *            information about indexes will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withGlobalSecondaryIndexes(
            GlobalSecondaryIndexDescription... globalSecondaryIndexes) {
        if (getGlobalSecondaryIndexes() == null) {
            this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndexDescription>(
                    globalSecondaryIndexes.length);
        }
        for (GlobalSecondaryIndexDescription value : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped
     * to a given partition key value. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the
     * backfilling phase. Backfilling occurs only when a new global secondary
     * index is added to the table; it is the process by which DynamoDB
     * populates the new index with data from the table. (This attribute does
     * not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary
     * index, in bytes. DynamoDB updates this value approximately every six
     * hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary
     * index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary
     * index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The
     * attribute names in the key schema must be between 1 and 255 characters
     * (inclusive). The key schema must begin with the same partition key as the
     * table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically
     * projected. Each attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected
     * into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected
     * into the index. The list of projected attributes are in
     * <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the
     * index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute
     * names that are projected into the secondary index. The total count of
     * attributes provided in <code>NonKeyAttributes</code>, summed across all
     * of the secondary indexes, must not exceed 20. If you project the same
     * attribute into two different indexes, this counts as two distinct
     * attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings
     * for the global secondary index, consisting of read and write capacity
     * units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about
     * indexes will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexes <p>
     *            The global secondary indexes, if any, on the table. Each index
     *            is scoped to a given partition key value. Each element is
     *            composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Backfilling</code> - If true, then the index is
     *            currently in the backfilling phase. Backfilling occurs only
     *            when a new global secondary index is added to the table; it is
     *            the process by which DynamoDB populates the new index with
     *            data from the table. (This attribute does not appear for
     *            indexes that were created during a <code>CreateTable</code>
     *            operation.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexName</code> - The name of the global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexSizeBytes</code> - The total size of the global
     *            secondary index, in bytes. DynamoDB updates this value
     *            approximately every six hours. Recent changes might not be
     *            reflected in this value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IndexStatus</code> - The current status of the global
     *            secondary index:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The index is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The index is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The index is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The index is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ItemCount</code> - The number of items in the global
     *            secondary index. DynamoDB updates this value approximately
     *            every six hours. Recent changes might not be reflected in this
     *            value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema</code> - Specifies the complete index key
     *            schema. The attribute names in the key schema must be between
     *            1 and 255 characters (inclusive). The key schema must begin
     *            with the same partition key as the table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection</code> - Specifies attributes that are copied
     *            (projected) from the table into the index. These are in
     *            addition to the primary key attributes and index key
     *            attributes, which are automatically projected. Each attribute
     *            specification is composed of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ProjectionType</code> - One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEYS_ONLY</code> - Only the index and primary keys are
     *            projected into the index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INCLUDE</code> - Only the specified table attributes are
     *            projected into the index. The list of projected attributes are
     *            in <code>NonKeyAttributes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code> - All of the table attributes are projected
     *            into the index.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NonKeyAttributes</code> - A list of one or more non-key
     *            attribute names that are projected into the secondary index.
     *            The total count of attributes provided in
     *            <code>NonKeyAttributes</code>, summed across all of the
     *            secondary indexes, must not exceed 20. If you project the same
     *            attribute into two different indexes, this counts as two
     *            distinct attributes when determining the total.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProvisionedThroughput</code> - The provisioned
     *            throughput settings for the global secondary index, consisting
     *            of read and write capacity units, along with data about
     *            increases and decreases.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the table is in the <code>DELETING</code> state, no
     *            information about indexes will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withGlobalSecondaryIndexes(
            java.util.Collection<GlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     *
     * @return <p>
     *         The current DynamoDB Streams configuration for the table.
     *         </p>
     */
    public StreamSpecification getStreamSpecification() {
        return streamSpecification;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     *
     * @param streamSpecification <p>
     *            The current DynamoDB Streams configuration for the table.
     *            </p>
     */
    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamSpecification <p>
     *            The current DynamoDB Streams configuration for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
        return this;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for
     * the stream, because it is possible that a stream from another table might
     * have the same timestamp. However, the combination of the following three
     * elements is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A timestamp, in ISO 8601 format, for this stream.
     *         </p>
     *         <p>
     *         Note that <code>LatestStreamLabel</code> is not a unique
     *         identifier for the stream, because it is possible that a stream
     *         from another table might have the same timestamp. However, the
     *         combination of the following three elements is guaranteed to be
     *         unique:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         the AWS customer ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the table name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the <code>StreamLabel</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getLatestStreamLabel() {
        return latestStreamLabel;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for
     * the stream, because it is possible that a stream from another table might
     * have the same timestamp. However, the combination of the following three
     * elements is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param latestStreamLabel <p>
     *            A timestamp, in ISO 8601 format, for this stream.
     *            </p>
     *            <p>
     *            Note that <code>LatestStreamLabel</code> is not a unique
     *            identifier for the stream, because it is possible that a
     *            stream from another table might have the same timestamp.
     *            However, the combination of the following three elements is
     *            guaranteed to be unique:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            the AWS customer ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            the table name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            the <code>StreamLabel</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLatestStreamLabel(String latestStreamLabel) {
        this.latestStreamLabel = latestStreamLabel;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for
     * the stream, because it is possible that a stream from another table might
     * have the same timestamp. However, the combination of the following three
     * elements is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestStreamLabel <p>
     *            A timestamp, in ISO 8601 format, for this stream.
     *            </p>
     *            <p>
     *            Note that <code>LatestStreamLabel</code> is not a unique
     *            identifier for the stream, because it is possible that a
     *            stream from another table might have the same timestamp.
     *            However, the combination of the following three elements is
     *            guaranteed to be unique:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            the AWS customer ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            the table name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            the <code>StreamLabel</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withLatestStreamLabel(String latestStreamLabel) {
        this.latestStreamLabel = latestStreamLabel;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream
     * for this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the
     *         latest stream for this table.
     *         </p>
     */
    public String getLatestStreamArn() {
        return latestStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream
     * for this table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param latestStreamArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            latest stream for this table.
     *            </p>
     */
    public void setLatestStreamArn(String latestStreamArn) {
        this.latestStreamArn = latestStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream
     * for this table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param latestStreamArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            latest stream for this table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withLatestStreamArn(String latestStreamArn) {
        this.latestStreamArn = latestStreamArn;
        return this;
    }

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     *
     * @return <p>
     *         Contains details for the restore.
     *         </p>
     */
    public RestoreSummary getRestoreSummary() {
        return restoreSummary;
    }

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     *
     * @param restoreSummary <p>
     *            Contains details for the restore.
     *            </p>
     */
    public void setRestoreSummary(RestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
    }

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreSummary <p>
     *            Contains details for the restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withRestoreSummary(RestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
        return this;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified
     * table.
     * </p>
     *
     * @return <p>
     *         The description of the server-side encryption status on the
     *         specified table.
     *         </p>
     */
    public SSEDescription getSSEDescription() {
        return sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified
     * table.
     * </p>
     *
     * @param sSEDescription <p>
     *            The description of the server-side encryption status on the
     *            specified table.
     *            </p>
     */
    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified
     * table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSEDescription <p>
     *            The description of the server-side encryption status on the
     *            specified table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableDescription withSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
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
        if (getAttributeDefinitions() != null)
            sb.append("AttributeDefinitions: " + getAttributeDefinitions() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getKeySchema() != null)
            sb.append("KeySchema: " + getKeySchema() + ",");
        if (getTableStatus() != null)
            sb.append("TableStatus: " + getTableStatus() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getTableSizeBytes() != null)
            sb.append("TableSizeBytes: " + getTableSizeBytes() + ",");
        if (getItemCount() != null)
            sb.append("ItemCount: " + getItemCount() + ",");
        if (getTableArn() != null)
            sb.append("TableArn: " + getTableArn() + ",");
        if (getTableId() != null)
            sb.append("TableId: " + getTableId() + ",");
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() + ",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: " + getStreamSpecification() + ",");
        if (getLatestStreamLabel() != null)
            sb.append("LatestStreamLabel: " + getLatestStreamLabel() + ",");
        if (getLatestStreamArn() != null)
            sb.append("LatestStreamArn: " + getLatestStreamArn() + ",");
        if (getRestoreSummary() != null)
            sb.append("RestoreSummary: " + getRestoreSummary() + ",");
        if (getSSEDescription() != null)
            sb.append("SSEDescription: " + getSSEDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode
                + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode
                + ((getTableSizeBytes() == null) ? 0 : getTableSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getLatestStreamLabel() == null) ? 0 : getLatestStreamLabel().hashCode());
        hashCode = prime * hashCode
                + ((getLatestStreamArn() == null) ? 0 : getLatestStreamArn().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreSummary() == null) ? 0 : getRestoreSummary().hashCode());
        hashCode = prime * hashCode
                + ((getSSEDescription() == null) ? 0 : getSSEDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableDescription == false)
            return false;
        TableDescription other = (TableDescription) obj;

        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null)
            return false;
        if (other.getAttributeDefinitions() != null
                && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null
                && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getTableStatus() == null ^ this.getTableStatus() == null)
            return false;
        if (other.getTableStatus() != null
                && other.getTableStatus().equals(this.getTableStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null
                && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getTableSizeBytes() == null ^ this.getTableSizeBytes() == null)
            return false;
        if (other.getTableSizeBytes() != null
                && other.getTableSizeBytes().equals(this.getTableSizeBytes()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null
                && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null
                && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null
                && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getStreamSpecification() == null ^ this.getStreamSpecification() == null)
            return false;
        if (other.getStreamSpecification() != null
                && other.getStreamSpecification().equals(this.getStreamSpecification()) == false)
            return false;
        if (other.getLatestStreamLabel() == null ^ this.getLatestStreamLabel() == null)
            return false;
        if (other.getLatestStreamLabel() != null
                && other.getLatestStreamLabel().equals(this.getLatestStreamLabel()) == false)
            return false;
        if (other.getLatestStreamArn() == null ^ this.getLatestStreamArn() == null)
            return false;
        if (other.getLatestStreamArn() != null
                && other.getLatestStreamArn().equals(this.getLatestStreamArn()) == false)
            return false;
        if (other.getRestoreSummary() == null ^ this.getRestoreSummary() == null)
            return false;
        if (other.getRestoreSummary() != null
                && other.getRestoreSummary().equals(this.getRestoreSummary()) == false)
            return false;
        if (other.getSSEDescription() == null ^ this.getSSEDescription() == null)
            return false;
        if (other.getSSEDescription() != null
                && other.getSSEDescription().equals(this.getSSEDescription()) == false)
            return false;
        return true;
    }
}
