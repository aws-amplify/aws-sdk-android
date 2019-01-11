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

public class ListGlobalTablesResult implements Serializable {
    /**
     * <p>
     * List of global table names.
     * </p>
     */
    private java.util.List<GlobalTable> globalTables;

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String lastEvaluatedGlobalTableName;

    /**
     * <p>
     * List of global table names.
     * </p>
     *
     * @return <p>
     *         List of global table names.
     *         </p>
     */
    public java.util.List<GlobalTable> getGlobalTables() {
        return globalTables;
    }

    /**
     * <p>
     * List of global table names.
     * </p>
     *
     * @param globalTables <p>
     *            List of global table names.
     *            </p>
     */
    public void setGlobalTables(java.util.Collection<GlobalTable> globalTables) {
        if (globalTables == null) {
            this.globalTables = null;
            return;
        }

        this.globalTables = new java.util.ArrayList<GlobalTable>(globalTables);
    }

    /**
     * <p>
     * List of global table names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalTables <p>
     *            List of global table names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGlobalTablesResult withGlobalTables(GlobalTable... globalTables) {
        if (getGlobalTables() == null) {
            this.globalTables = new java.util.ArrayList<GlobalTable>(globalTables.length);
        }
        for (GlobalTable value : globalTables) {
            this.globalTables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of global table names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalTables <p>
     *            List of global table names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGlobalTablesResult withGlobalTables(java.util.Collection<GlobalTable> globalTables) {
        setGlobalTables(globalTables);
        return this;
    }

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Last evaluated global table name.
     *         </p>
     */
    public String getLastEvaluatedGlobalTableName() {
        return lastEvaluatedGlobalTableName;
    }

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedGlobalTableName <p>
     *            Last evaluated global table name.
     *            </p>
     */
    public void setLastEvaluatedGlobalTableName(String lastEvaluatedGlobalTableName) {
        this.lastEvaluatedGlobalTableName = lastEvaluatedGlobalTableName;
    }

    /**
     * <p>
     * Last evaluated global table name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedGlobalTableName <p>
     *            Last evaluated global table name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGlobalTablesResult withLastEvaluatedGlobalTableName(
            String lastEvaluatedGlobalTableName) {
        this.lastEvaluatedGlobalTableName = lastEvaluatedGlobalTableName;
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
        if (getGlobalTables() != null)
            sb.append("GlobalTables: " + getGlobalTables() + ",");
        if (getLastEvaluatedGlobalTableName() != null)
            sb.append("LastEvaluatedGlobalTableName: " + getLastEvaluatedGlobalTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGlobalTables() == null) ? 0 : getGlobalTables().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastEvaluatedGlobalTableName() == null) ? 0
                        : getLastEvaluatedGlobalTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGlobalTablesResult == false)
            return false;
        ListGlobalTablesResult other = (ListGlobalTablesResult) obj;

        if (other.getGlobalTables() == null ^ this.getGlobalTables() == null)
            return false;
        if (other.getGlobalTables() != null
                && other.getGlobalTables().equals(this.getGlobalTables()) == false)
            return false;
        if (other.getLastEvaluatedGlobalTableName() == null
                ^ this.getLastEvaluatedGlobalTableName() == null)
            return false;
        if (other.getLastEvaluatedGlobalTableName() != null
                && other.getLastEvaluatedGlobalTableName().equals(
                        this.getLastEvaluatedGlobalTableName()) == false)
            return false;
        return true;
    }
}
