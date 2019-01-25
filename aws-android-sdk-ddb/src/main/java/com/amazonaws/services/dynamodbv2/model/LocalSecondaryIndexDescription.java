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
 * Represents the properties of a local secondary index.
 * </p>
 */
public class LocalSecondaryIndexDescription implements Serializable {
    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one
     * or more pairs of attribute names and key types:
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
     * </note>
     */
    private java.util.List<KeySchemaElement> keySchema;

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the
     * global secondary index. These are in addition to the primary key
     * attributes and index key attributes, which are automatically projected.
     * </p>
     */
    private Projection projection;

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     */
    private Long indexSizeBytes;

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     */
    private Long itemCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     */
    private String indexArn;

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Represents the name of the local secondary index.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            Represents the name of the local secondary index.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            Represents the name of the local secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one
     * or more pairs of attribute names and key types:
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
     * </note>
     *
     * @return <p>
     *         The complete key schema for the local secondary index, consisting
     *         of one or more pairs of attribute names and key types:
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
     *         </note>
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one
     * or more pairs of attribute names and key types:
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
     * </note>
     *
     * @param keySchema <p>
     *            The complete key schema for the local secondary index,
     *            consisting of one or more pairs of attribute names and key
     *            types:
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
     *            </note>
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
     * The complete key schema for the local secondary index, consisting of one
     * or more pairs of attribute names and key types:
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
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            The complete key schema for the local secondary index,
     *            consisting of one or more pairs of attribute names and key
     *            types:
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
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withKeySchema(KeySchemaElement... keySchema) {
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
     * The complete key schema for the local secondary index, consisting of one
     * or more pairs of attribute names and key types:
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
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            The complete key schema for the local secondary index,
     *            consisting of one or more pairs of attribute names and key
     *            types:
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
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withKeySchema(
            java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the
     * global secondary index. These are in addition to the primary key
     * attributes and index key attributes, which are automatically projected.
     * </p>
     *
     * @return <p>
     *         Represents attributes that are copied (projected) from the table
     *         into the global secondary index. These are in addition to the
     *         primary key attributes and index key attributes, which are
     *         automatically projected.
     *         </p>
     */
    public Projection getProjection() {
        return projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the
     * global secondary index. These are in addition to the primary key
     * attributes and index key attributes, which are automatically projected.
     * </p>
     *
     * @param projection <p>
     *            Represents attributes that are copied (projected) from the
     *            table into the global secondary index. These are in addition
     *            to the primary key attributes and index key attributes, which
     *            are automatically projected.
     *            </p>
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the
     * global secondary index. These are in addition to the primary key
     * attributes and index key attributes, which are automatically projected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projection <p>
     *            Represents attributes that are copied (projected) from the
     *            table into the global secondary index. These are in addition
     *            to the primary key attributes and index key attributes, which
     *            are automatically projected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withProjection(Projection projection) {
        this.projection = projection;
        return this;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     *
     * @return <p>
     *         The total size of the specified index, in bytes. DynamoDB updates
     *         this value approximately every six hours. Recent changes might
     *         not be reflected in this value.
     *         </p>
     */
    public Long getIndexSizeBytes() {
        return indexSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     *
     * @param indexSizeBytes <p>
     *            The total size of the specified index, in bytes. DynamoDB
     *            updates this value approximately every six hours. Recent
     *            changes might not be reflected in this value.
     *            </p>
     */
    public void setIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this
     * value approximately every six hours. Recent changes might not be
     * reflected in this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexSizeBytes <p>
     *            The total size of the specified index, in bytes. DynamoDB
     *            updates this value approximately every six hours. Recent
     *            changes might not be reflected in this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
        return this;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     *
     * @return <p>
     *         The number of items in the specified index. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be
     *         reflected in this value.
     *         </p>
     */
    public Long getItemCount() {
        return itemCount;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     *
     * @param itemCount <p>
     *            The number of items in the specified index. DynamoDB updates
     *            this value approximately every six hours. Recent changes might
     *            not be reflected in this value.
     *            </p>
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in
     * this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param itemCount <p>
     *            The number of items in the specified index. DynamoDB updates
     *            this value approximately every six hours. Recent changes might
     *            not be reflected in this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the
     *         index.
     *         </p>
     */
    public String getIndexArn() {
        return indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     *
     * @param indexArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            index.
     *            </p>
     */
    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalSecondaryIndexDescription withIndexArn(String indexArn) {
        this.indexArn = indexArn;
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getKeySchema() != null)
            sb.append("KeySchema: " + getKeySchema() + ",");
        if (getProjection() != null)
            sb.append("Projection: " + getProjection() + ",");
        if (getIndexSizeBytes() != null)
            sb.append("IndexSizeBytes: " + getIndexSizeBytes() + ",");
        if (getItemCount() != null)
            sb.append("ItemCount: " + getItemCount() + ",");
        if (getIndexArn() != null)
            sb.append("IndexArn: " + getIndexArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode());
        hashCode = prime * hashCode
                + ((getIndexSizeBytes() == null) ? 0 : getIndexSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalSecondaryIndexDescription == false)
            return false;
        LocalSecondaryIndexDescription other = (LocalSecondaryIndexDescription) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null
                && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getProjection() == null ^ this.getProjection() == null)
            return false;
        if (other.getProjection() != null
                && other.getProjection().equals(this.getProjection()) == false)
            return false;
        if (other.getIndexSizeBytes() == null ^ this.getIndexSizeBytes() == null)
            return false;
        if (other.getIndexSizeBytes() != null
                && other.getIndexSizeBytes().equals(this.getIndexSizeBytes()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null
                && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false)
            return false;
        return true;
    }
}
