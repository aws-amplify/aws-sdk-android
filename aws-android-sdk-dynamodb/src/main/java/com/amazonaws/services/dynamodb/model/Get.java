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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies an item and related attribute values to retrieve in a
 * <code>TransactGetItem</code> object.
 * </p>
 */
public class Get implements Serializable {
    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that
     * specifies the primary key of the item to retrieve.
     * </p>
     */
    private java.util.Map<String, AttributeValue> key;

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to
     * retrieve from the table. The attributes in the expression must be
     * separated by commas. If no attribute names are specified, then all
     * attributes of the specified item are returned. If any of the requested
     * attributes are not found, they do not appear in the result.
     * </p>
     */
    private String projectionExpression;

    /**
     * <p>
     * One or more substitution tokens for attribute names in the
     * ProjectionExpression parameter.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that
     * specifies the primary key of the item to retrieve.
     * </p>
     *
     * @return <p>
     *         A map of attribute names to <code>AttributeValue</code> objects
     *         that specifies the primary key of the item to retrieve.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getKey() {
        return key;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that
     * specifies the primary key of the item to retrieve.
     * </p>
     *
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects that specifies the primary key of the item to
     *            retrieve.
     *            </p>
     */
    public void setKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that
     * specifies the primary key of the item to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects that specifies the primary key of the item to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Get withKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that
     * specifies the primary key of the item to retrieve.
     * </p>
     * <p>
     * The method adds a new key-value pair into Key parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Key.
     * @param value The corresponding value of the entry to be added into Key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Get addKeyEntry(String key, AttributeValue value) {
        if (null == this.key) {
            this.key = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.key.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.key.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Get clearKeyEntries() {
        this.key = null;
        return this;
    }

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table from which to retrieve the specified item.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table from which to retrieve the specified
     *            item.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
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
     *            The name of the table from which to retrieve the specified
     *            item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Get withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to
     * retrieve from the table. The attributes in the expression must be
     * separated by commas. If no attribute names are specified, then all
     * attributes of the specified item are returned. If any of the requested
     * attributes are not found, they do not appear in the result.
     * </p>
     *
     * @return <p>
     *         A string that identifies one or more attributes of the specified
     *         item to retrieve from the table. The attributes in the expression
     *         must be separated by commas. If no attribute names are specified,
     *         then all attributes of the specified item are returned. If any of
     *         the requested attributes are not found, they do not appear in the
     *         result.
     *         </p>
     */
    public String getProjectionExpression() {
        return projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to
     * retrieve from the table. The attributes in the expression must be
     * separated by commas. If no attribute names are specified, then all
     * attributes of the specified item are returned. If any of the requested
     * attributes are not found, they do not appear in the result.
     * </p>
     *
     * @param projectionExpression <p>
     *            A string that identifies one or more attributes of the
     *            specified item to retrieve from the table. The attributes in
     *            the expression must be separated by commas. If no attribute
     *            names are specified, then all attributes of the specified item
     *            are returned. If any of the requested attributes are not
     *            found, they do not appear in the result.
     *            </p>
     */
    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to
     * retrieve from the table. The attributes in the expression must be
     * separated by commas. If no attribute names are specified, then all
     * attributes of the specified item are returned. If any of the requested
     * attributes are not found, they do not appear in the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectionExpression <p>
     *            A string that identifies one or more attributes of the
     *            specified item to retrieve from the table. The attributes in
     *            the expression must be separated by commas. If no attribute
     *            names are specified, then all attributes of the specified item
     *            are returned. If any of the requested attributes are not
     *            found, they do not appear in the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Get withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the
     * ProjectionExpression parameter.
     * </p>
     *
     * @return <p>
     *         One or more substitution tokens for attribute names in the
     *         ProjectionExpression parameter.
     *         </p>
     */
    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the
     * ProjectionExpression parameter.
     * </p>
     *
     * @param expressionAttributeNames <p>
     *            One or more substitution tokens for attribute names in the
     *            ProjectionExpression parameter.
     *            </p>
     */
    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the
     * ProjectionExpression parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expressionAttributeNames <p>
     *            One or more substitution tokens for attribute names in the
     *            ProjectionExpression parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Get withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the
     * ProjectionExpression parameter.
     * </p>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeNames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Get addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Get clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get == false)
            return false;
        Get other = (Get) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null
                && other.getProjectionExpression().equals(this.getProjectionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null
                ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null
                && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        return true;
    }
}
