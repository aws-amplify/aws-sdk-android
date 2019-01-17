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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the provisioned throughput settings, global secondary indexes, or
 * DynamoDB Streams settings for a given table.
 * </p>
 * <p>
 * You can only perform one of the following operations at once:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Modify the provisioned throughput settings of the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Enable or disable Streams on the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove a global secondary index from the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a new global secondary index on the table. Once the index begins
 * backfilling, you can use <code>UpdateTable</code> to perform other
 * operations.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <code>UpdateTable</code> is an asynchronous operation; while it is executing,
 * the table status changes from <code>ACTIVE</code> to <code>UPDATING</code>.
 * While it is <code>UPDATING</code>, you cannot issue another
 * <code>UpdateTable</code> request. When the table returns to the
 * <code>ACTIVE</code> state, the <code>UpdateTable</code> operation is
 * complete.
 * </p>
 */
public class UpdateTableRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of attributes that describe the key schema for the table and
     * indexes. If you are adding a new global secondary index to the table,
     * <code>AttributeDefinitions</code> must include the key element(s) of the
     * new index.
     * </p>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;

    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each
     * index in the array, you can request one action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an
     * existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     * >Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates;

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <code>ResourceInUseException</code> if you attempt to
     * enable a stream on a table that already has a stream, or if you attempt
     * to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     */
    private StreamSpecification streamSpecification;

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     */
    private SSESpecification sSESpecification;

    /**
     * Default constructor for UpdateTableRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public UpdateTableRequest() {
    }

    /**
     * Constructs a new UpdateTableRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table to be updated.
     *            </p>
     * @param provisionedThroughput <p>
     *            The new provisioned throughput settings for the specified
     *            table or index.
     *            </p>
     */
    public UpdateTableRequest(String tableName, ProvisionedThroughput provisionedThroughput) {
        setTableName(tableName);
        setProvisionedThroughput(provisionedThroughput);
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and
     * indexes. If you are adding a new global secondary index to the table,
     * <code>AttributeDefinitions</code> must include the key element(s) of the
     * new index.
     * </p>
     *
     * @return <p>
     *         An array of attributes that describe the key schema for the table
     *         and indexes. If you are adding a new global secondary index to
     *         the table, <code>AttributeDefinitions</code> must include the key
     *         element(s) of the new index.
     *         </p>
     */
    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and
     * indexes. If you are adding a new global secondary index to the table,
     * <code>AttributeDefinitions</code> must include the key element(s) of the
     * new index.
     * </p>
     *
     * @param attributeDefinitions <p>
     *            An array of attributes that describe the key schema for the
     *            table and indexes. If you are adding a new global secondary
     *            index to the table, <code>AttributeDefinitions</code> must
     *            include the key element(s) of the new index.
     *            </p>
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
     * An array of attributes that describe the key schema for the table and
     * indexes. If you are adding a new global secondary index to the table,
     * <code>AttributeDefinitions</code> must include the key element(s) of the
     * new index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeDefinitions <p>
     *            An array of attributes that describe the key schema for the
     *            table and indexes. If you are adding a new global secondary
     *            index to the table, <code>AttributeDefinitions</code> must
     *            include the key element(s) of the new index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
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
     * An array of attributes that describe the key schema for the table and
     * indexes. If you are adding a new global secondary index to the table,
     * <code>AttributeDefinitions</code> must include the key element(s) of the
     * new index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeDefinitions <p>
     *            An array of attributes that describe the key schema for the
     *            table and indexes. If you are adding a new global secondary
     *            index to the table, <code>AttributeDefinitions</code> must
     *            include the key element(s) of the new index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withAttributeDefinitions(
            java.util.Collection<AttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table to be updated.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table to be updated.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to be updated.
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
     *            The name of the table to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     *
     * @return <p>
     *         The new provisioned throughput settings for the specified table
     *         or index.
     *         </p>
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     *
     * @param provisionedThroughput <p>
     *            The new provisioned throughput settings for the specified
     *            table or index.
     *            </p>
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * The new provisioned throughput settings for the specified table or index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughput <p>
     *            The new provisioned throughput settings for the specified
     *            table or index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each
     * index in the array, you can request one action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an
     * existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     * >Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         An array of one or more global secondary indexes for the table.
     *         For each index in the array, you can request one action:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Create</code> - add a new global secondary index to the
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Update</code> - modify the provisioned throughput settings
     *         of an existing global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Delete</code> - remove a global secondary index from the
     *         table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     *         >Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     *         </p>
     */
    public java.util.List<GlobalSecondaryIndexUpdate> getGlobalSecondaryIndexUpdates() {
        return globalSecondaryIndexUpdates;
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each
     * index in the array, you can request one action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an
     * existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     * >Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     *
     * @param globalSecondaryIndexUpdates <p>
     *            An array of one or more global secondary indexes for the
     *            table. For each index in the array, you can request one
     *            action:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Create</code> - add a new global secondary index to the
     *            table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Update</code> - modify the provisioned throughput
     *            settings of an existing global secondary index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Delete</code> - remove a global secondary index from the
     *            table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     *            >Managing Global Secondary Indexes</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setGlobalSecondaryIndexUpdates(
            java.util.Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        if (globalSecondaryIndexUpdates == null) {
            this.globalSecondaryIndexUpdates = null;
            return;
        }

        this.globalSecondaryIndexUpdates = new java.util.ArrayList<GlobalSecondaryIndexUpdate>(
                globalSecondaryIndexUpdates);
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each
     * index in the array, you can request one action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an
     * existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     * >Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexUpdates <p>
     *            An array of one or more global secondary indexes for the
     *            table. For each index in the array, you can request one
     *            action:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Create</code> - add a new global secondary index to the
     *            table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Update</code> - modify the provisioned throughput
     *            settings of an existing global secondary index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Delete</code> - remove a global secondary index from the
     *            table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     *            >Managing Global Secondary Indexes</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withGlobalSecondaryIndexUpdates(
            GlobalSecondaryIndexUpdate... globalSecondaryIndexUpdates) {
        if (getGlobalSecondaryIndexUpdates() == null) {
            this.globalSecondaryIndexUpdates = new java.util.ArrayList<GlobalSecondaryIndexUpdate>(
                    globalSecondaryIndexUpdates.length);
        }
        for (GlobalSecondaryIndexUpdate value : globalSecondaryIndexUpdates) {
            this.globalSecondaryIndexUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of one or more global secondary indexes for the table. For each
     * index in the array, you can request one action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Create</code> - add a new global secondary index to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code> - modify the provisioned throughput settings of an
     * existing global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code> - remove a global secondary index from the table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     * >Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalSecondaryIndexUpdates <p>
     *            An array of one or more global secondary indexes for the
     *            table. For each index in the array, you can request one
     *            action:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Create</code> - add a new global secondary index to the
     *            table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Update</code> - modify the provisioned throughput
     *            settings of an existing global secondary index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Delete</code> - remove a global secondary index from the
     *            table.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html"
     *            >Managing Global Secondary Indexes</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withGlobalSecondaryIndexUpdates(
            java.util.Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        setGlobalSecondaryIndexUpdates(globalSecondaryIndexUpdates);
        return this;
    }

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <code>ResourceInUseException</code> if you attempt to
     * enable a stream on a table that already has a stream, or if you attempt
     * to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     *
     * @return <p>
     *         Represents the DynamoDB Streams configuration for the table.
     *         </p>
     *         <note>
     *         <p>
     *         You will receive a <code>ResourceInUseException</code> if you
     *         attempt to enable a stream on a table that already has a stream,
     *         or if you attempt to disable a stream on a table which does not
     *         have a stream.
     *         </p>
     *         </note>
     */
    public StreamSpecification getStreamSpecification() {
        return streamSpecification;
    }

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <code>ResourceInUseException</code> if you attempt to
     * enable a stream on a table that already has a stream, or if you attempt
     * to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     *
     * @param streamSpecification <p>
     *            Represents the DynamoDB Streams configuration for the table.
     *            </p>
     *            <note>
     *            <p>
     *            You will receive a <code>ResourceInUseException</code> if you
     *            attempt to enable a stream on a table that already has a
     *            stream, or if you attempt to disable a stream on a table which
     *            does not have a stream.
     *            </p>
     *            </note>
     */
    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    /**
     * <p>
     * Represents the DynamoDB Streams configuration for the table.
     * </p>
     * <note>
     * <p>
     * You will receive a <code>ResourceInUseException</code> if you attempt to
     * enable a stream on a table that already has a stream, or if you attempt
     * to disable a stream on a table which does not have a stream.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamSpecification <p>
     *            Represents the DynamoDB Streams configuration for the table.
     *            </p>
     *            <note>
     *            <p>
     *            You will receive a <code>ResourceInUseException</code> if you
     *            attempt to enable a stream on a table that already has a
     *            stream, or if you attempt to disable a stream on a table which
     *            does not have a stream.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
        return this;
    }

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     *
     * @return <p>
     *         The new server-side encryption settings for the specified table.
     *         </p>
     */
    public SSESpecification getSSESpecification() {
        return sSESpecification;
    }

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     *
     * @param sSESpecification <p>
     *            The new server-side encryption settings for the specified
     *            table.
     *            </p>
     */
    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    /**
     * <p>
     * The new server-side encryption settings for the specified table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSESpecification <p>
     *            The new server-side encryption settings for the specified
     *            table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
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
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getGlobalSecondaryIndexUpdates() != null)
            sb.append("GlobalSecondaryIndexUpdates: " + getGlobalSecondaryIndexUpdates() + ",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: " + getStreamSpecification() + ",");
        if (getSSESpecification() != null)
            sb.append("SSESpecification: " + getSSESpecification());
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
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalSecondaryIndexUpdates() == null) ? 0
                        : getGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime * hashCode
                + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getSSESpecification() == null) ? 0 : getSSESpecification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableRequest == false)
            return false;
        UpdateTableRequest other = (UpdateTableRequest) obj;

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
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null
                && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getGlobalSecondaryIndexUpdates() == null
                ^ this.getGlobalSecondaryIndexUpdates() == null)
            return false;
        if (other.getGlobalSecondaryIndexUpdates() != null
                && other.getGlobalSecondaryIndexUpdates().equals(
                        this.getGlobalSecondaryIndexUpdates()) == false)
            return false;
        if (other.getStreamSpecification() == null ^ this.getStreamSpecification() == null)
            return false;
        if (other.getStreamSpecification() != null
                && other.getStreamSpecification().equals(this.getStreamSpecification()) == false)
            return false;
        if (other.getSSESpecification() == null ^ this.getSSESpecification() == null)
            return false;
        if (other.getSSESpecification() != null
                && other.getSSESpecification().equals(this.getSSESpecification()) == false)
            return false;
        return true;
    }
}
