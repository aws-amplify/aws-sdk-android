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
 * Contains the details of the table when the backup was created.
 * </p>
 */
public class SourceTableDetails implements Serializable {
    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

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
     * ARN of the table for which backup was created.
     * </p>
     */
    private String tableArn;

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     */
    private Long tableSizeBytes;

    /**
     * <p>
     * Schema of the table.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     */
    private java.util.Date tableCreationDateTime;

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long itemCount;

    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table for which the backup was created.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table for which the backup was created.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table for which the backup was created.
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
     *            The name of the table for which the backup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withTableName(String tableName) {
        this.tableName = tableName;
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
    public SourceTableDetails withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     *
     * @return <p>
     *         ARN of the table for which backup was created.
     *         </p>
     */
    public String getTableArn() {
        return tableArn;
    }

    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     *
     * @param tableArn <p>
     *            ARN of the table for which backup was created.
     *            </p>
     */
    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableArn <p>
     *            ARN of the table for which backup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withTableArn(String tableArn) {
        this.tableArn = tableArn;
        return this;
    }

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     *
     * @return <p>
     *         Size of the table in bytes. Please note this is an approximate
     *         value.
     *         </p>
     */
    public Long getTableSizeBytes() {
        return tableSizeBytes;
    }

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     *
     * @param tableSizeBytes <p>
     *            Size of the table in bytes. Please note this is an approximate
     *            value.
     *            </p>
     */
    public void setTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
    }

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableSizeBytes <p>
     *            Size of the table in bytes. Please note this is an approximate
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
        return this;
    }

    /**
     * <p>
     * Schema of the table.
     * </p>
     *
     * @return <p>
     *         Schema of the table.
     *         </p>
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * Schema of the table.
     * </p>
     *
     * @param keySchema <p>
     *            Schema of the table.
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
     * Schema of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            Schema of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withKeySchema(KeySchemaElement... keySchema) {
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
     * Schema of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            Schema of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     *
     * @return <p>
     *         Time when the source table was created.
     *         </p>
     */
    public java.util.Date getTableCreationDateTime() {
        return tableCreationDateTime;
    }

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     *
     * @param tableCreationDateTime <p>
     *            Time when the source table was created.
     *            </p>
     */
    public void setTableCreationDateTime(java.util.Date tableCreationDateTime) {
        this.tableCreationDateTime = tableCreationDateTime;
    }

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableCreationDateTime <p>
     *            Time when the source table was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withTableCreationDateTime(java.util.Date tableCreationDateTime) {
        this.tableCreationDateTime = tableCreationDateTime;
        return this;
    }

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     *
     * @return <p>
     *         Read IOPs and Write IOPS on the table when the backup was
     *         created.
     *         </p>
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     *
     * @param provisionedThroughput <p>
     *            Read IOPs and Write IOPS on the table when the backup was
     *            created.
     *            </p>
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughput <p>
     *            Read IOPs and Write IOPS on the table when the backup was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of items in the table. Please note this is an approximate
     *         value.
     *         </p>
     */
    public Long getItemCount() {
        return itemCount;
    }

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param itemCount <p>
     *            Number of items in the table. Please note this is an
     *            approximate value.
     *            </p>
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param itemCount <p>
     *            Number of items in the table. Please note this is an
     *            approximate value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceTableDetails withItemCount(Long itemCount) {
        this.itemCount = itemCount;
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getTableId() != null)
            sb.append("TableId: " + getTableId() + ",");
        if (getTableArn() != null)
            sb.append("TableArn: " + getTableArn() + ",");
        if (getTableSizeBytes() != null)
            sb.append("TableSizeBytes: " + getTableSizeBytes() + ",");
        if (getKeySchema() != null)
            sb.append("KeySchema: " + getKeySchema() + ",");
        if (getTableCreationDateTime() != null)
            sb.append("TableCreationDateTime: " + getTableCreationDateTime() + ",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getItemCount() != null)
            sb.append("ItemCount: " + getItemCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode
                + ((getTableSizeBytes() == null) ? 0 : getTableSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime
                * hashCode
                + ((getTableCreationDateTime() == null) ? 0 : getTableCreationDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceTableDetails == false)
            return false;
        SourceTableDetails other = (SourceTableDetails) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getTableSizeBytes() == null ^ this.getTableSizeBytes() == null)
            return false;
        if (other.getTableSizeBytes() != null
                && other.getTableSizeBytes().equals(this.getTableSizeBytes()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null
                && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getTableCreationDateTime() == null ^ this.getTableCreationDateTime() == null)
            return false;
        if (other.getTableCreationDateTime() != null
                && other.getTableCreationDateTime().equals(this.getTableCreationDateTime()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null
                && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null
                && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        return true;
    }
}
