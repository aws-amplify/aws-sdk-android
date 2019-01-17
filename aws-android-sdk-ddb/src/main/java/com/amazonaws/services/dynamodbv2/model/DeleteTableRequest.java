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
 * The <code>DeleteTable</code> operation deletes a table and all of its items.
 * After a <code>DeleteTable</code> request, the specified table is in the
 * <code>DELETING</code> state until DynamoDB completes the deletion. If the
 * table is in the <code>ACTIVE</code> state, you can delete it. If a table is
 * in <code>CREATING</code> or <code>UPDATING</code> states, then DynamoDB
 * returns a <code>ResourceInUseException</code>. If the specified table does
 * not exist, DynamoDB returns a <code>ResourceNotFoundException</code>. If
 * table is already in the <code>DELETING</code> state, no error is returned.
 * </p>
 * <note>
 * <p>
 * DynamoDB might continue to accept data read and write operations, such as
 * <code>GetItem</code> and <code>PutItem</code>, on a table in the
 * <code>DELETING</code> state until the table deletion is complete.
 * </p>
 * </note>
 * <p>
 * When you delete a table, any indexes on that table are also deleted.
 * </p>
 * <p>
 * If you have DynamoDB Streams enabled on the table, then the corresponding
 * stream on that table goes into the <code>DISABLED</code> state, and the
 * stream is automatically deleted after 24 hours.
 * </p>
 * <p>
 * Use the <code>DescribeTable</code> action to check the status of the table.
 * </p>
 */
public class DeleteTableRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * Default constructor for DeleteTableRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public DeleteTableRequest() {
    }

    /**
     * Constructs a new DeleteTableRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName <p>
     *            The name of the table to delete.
     *            </p>
     */
    public DeleteTableRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * <p>
     * The name of the table to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table to delete.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table to delete.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to delete.
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
     *            The name of the table to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTableRequest withTableName(String tableName) {
        this.tableName = tableName;
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
            sb.append("TableName: " + getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTableRequest == false)
            return false;
        DeleteTableRequest other = (DeleteTableRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }
}
