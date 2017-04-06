/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents a new global secondary index to be added to an existing table.
 * </p>
 */
public class CreateGlobalSecondaryIndexAction implements Serializable {
    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The key schema for the global secondary index.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an
     * index. These are in addition to the primary key attributes and index key
     * attributes, which are automatically projected.
     * </p>
     */
    private Projection projection;

    /**
     * <p>
     * Represents the provisioned throughput settings for a specified table or
     * index. The settings can be modified using the <i>UpdateTable</i>
     * operation.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the global secondary index to be created.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName <p>
     *            The name of the global secondary index to be created.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index to be created.
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
     *            The name of the global secondary index to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalSecondaryIndexAction withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The key schema for the global secondary index.
     * </p>
     *
     * @return <p>
     *         The key schema for the global secondary index.
     *         </p>
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The key schema for the global secondary index.
     * </p>
     *
     * @param keySchema <p>
     *            The key schema for the global secondary index.
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
     * The key schema for the global secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            The key schema for the global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalSecondaryIndexAction withKeySchema(KeySchemaElement... keySchema) {
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
     * The key schema for the global secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keySchema <p>
     *            The key schema for the global secondary index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalSecondaryIndexAction withKeySchema(
            java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an
     * index. These are in addition to the primary key attributes and index key
     * attributes, which are automatically projected.
     * </p>
     *
     * @return <p>
     *         Represents attributes that are copied (projected) from the table
     *         into an index. These are in addition to the primary key
     *         attributes and index key attributes, which are automatically
     *         projected.
     *         </p>
     */
    public Projection getProjection() {
        return projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an
     * index. These are in addition to the primary key attributes and index key
     * attributes, which are automatically projected.
     * </p>
     *
     * @param projection <p>
     *            Represents attributes that are copied (projected) from the
     *            table into an index. These are in addition to the primary key
     *            attributes and index key attributes, which are automatically
     *            projected.
     *            </p>
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an
     * index. These are in addition to the primary key attributes and index key
     * attributes, which are automatically projected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projection <p>
     *            Represents attributes that are copied (projected) from the
     *            table into an index. These are in addition to the primary key
     *            attributes and index key attributes, which are automatically
     *            projected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalSecondaryIndexAction withProjection(Projection projection) {
        this.projection = projection;
        return this;
    }

    /**
     * <p>
     * Represents the provisioned throughput settings for a specified table or
     * index. The settings can be modified using the <i>UpdateTable</i>
     * operation.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Represents the provisioned throughput settings for a specified
     *         table or index. The settings can be modified using the
     *         <i>UpdateTable</i> operation.
     *         </p>
     *         <p>
     *         For current minimum and maximum provisioned throughput values,
     *         see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *         >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * <p>
     * Represents the provisioned throughput settings for a specified table or
     * index. The settings can be modified using the <i>UpdateTable</i>
     * operation.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param provisionedThroughput <p>
     *            Represents the provisioned throughput settings for a specified
     *            table or index. The settings can be modified using the
     *            <i>UpdateTable</i> operation.
     *            </p>
     *            <p>
     *            For current minimum and maximum provisioned throughput values,
     *            see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *            >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Represents the provisioned throughput settings for a specified table or
     * index. The settings can be modified using the <i>UpdateTable</i>
     * operation.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedThroughput <p>
     *            Represents the provisioned throughput settings for a specified
     *            table or index. The settings can be modified using the
     *            <i>UpdateTable</i> operation.
     *            </p>
     *            <p>
     *            For current minimum and maximum provisioned throughput values,
     *            see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *            >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalSecondaryIndexAction withProvisionedThroughput(
            ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
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
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput());
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
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGlobalSecondaryIndexAction == false)
            return false;
        CreateGlobalSecondaryIndexAction other = (CreateGlobalSecondaryIndexAction) obj;

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
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null
                && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        return true;
    }
}
