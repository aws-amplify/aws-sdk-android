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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Snowflake parameters.
 * </p>
 */
public class SnowflakeParameters implements Serializable {
    /**
     * <p>
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String host;

    /**
     * <p>
     * Database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String database;

    /**
     * <p>
     * Warehouse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String warehouse;

    /**
     * <p>
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Host.
     *         </p>
     */
    public String getHost() {
        return host;
    }

    /**
     * <p>
     * Host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param host <p>
     *            Host.
     *            </p>
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param host <p>
     *            Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnowflakeParameters withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * <p>
     * Database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Database.
     *         </p>
     */
    public String getDatabase() {
        return database;
    }

    /**
     * <p>
     * Database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param database <p>
     *            Database.
     *            </p>
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * Database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param database <p>
     *            Database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnowflakeParameters withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * <p>
     * Warehouse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         Warehouse.
     *         </p>
     */
    public String getWarehouse() {
        return warehouse;
    }

    /**
     * <p>
     * Warehouse.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param warehouse <p>
     *            Warehouse.
     *            </p>
     */
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * <p>
     * Warehouse.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param warehouse <p>
     *            Warehouse.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnowflakeParameters withWarehouse(String warehouse) {
        this.warehouse = warehouse;
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
        if (getHost() != null)
            sb.append("Host: " + getHost() + ",");
        if (getDatabase() != null)
            sb.append("Database: " + getDatabase() + ",");
        if (getWarehouse() != null)
            sb.append("Warehouse: " + getWarehouse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getWarehouse() == null) ? 0 : getWarehouse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeParameters == false)
            return false;
        SnowflakeParameters other = (SnowflakeParameters) obj;

        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getWarehouse() == null ^ this.getWarehouse() == null)
            return false;
        if (other.getWarehouse() != null
                && other.getWarehouse().equals(this.getWarehouse()) == false)
            return false;
        return true;
    }
}
