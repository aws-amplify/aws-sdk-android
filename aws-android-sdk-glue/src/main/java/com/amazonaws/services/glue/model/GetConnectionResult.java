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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetConnectionResult implements Serializable {
    /**
     * <p>
     * The requested connection definition.
     * </p>
     */
    private Connection connection;

    /**
     * <p>
     * The requested connection definition.
     * </p>
     *
     * @return <p>
     *         The requested connection definition.
     *         </p>
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * <p>
     * The requested connection definition.
     * </p>
     *
     * @param connection <p>
     *            The requested connection definition.
     *            </p>
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * <p>
     * The requested connection definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connection <p>
     *            The requested connection definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionResult withConnection(Connection connection) {
        this.connection = connection;
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
        if (getConnection() != null)
            sb.append("Connection: " + getConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnection() == null) ? 0 : getConnection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionResult == false)
            return false;
        GetConnectionResult other = (GetConnectionResult) obj;

        if (other.getConnection() == null ^ this.getConnection() == null)
            return false;
        if (other.getConnection() != null
                && other.getConnection().equals(this.getConnection()) == false)
            return false;
        return true;
    }
}
