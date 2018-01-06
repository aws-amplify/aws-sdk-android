/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The input for the DynamoActionVS action that specifies the DynamoDB table to
 * which the message data will be written.
 * </p>
 */
public class PutItemInput implements Serializable {
    /**
     * <p>
     * The table where the message data will be written
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * The table where the message data will be written
     * </p>
     *
     * @return <p>
     *         The table where the message data will be written
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The table where the message data will be written
     * </p>
     *
     * @param tableName <p>
     *            The table where the message data will be written
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table where the message data will be written
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The table where the message data will be written
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutItemInput withTableName(String tableName) {
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
            sb.append("tableName: " + getTableName());
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

        if (obj instanceof PutItemInput == false)
            return false;
        PutItemInput other = (PutItemInput) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }
}
