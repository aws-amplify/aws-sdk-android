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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetTableVersionResult implements Serializable {
    /**
     * <p>
     * The requested table version.
     * </p>
     */
    private TableVersion tableVersion;

    /**
     * <p>
     * The requested table version.
     * </p>
     *
     * @return <p>
     *         The requested table version.
     *         </p>
     */
    public TableVersion getTableVersion() {
        return tableVersion;
    }

    /**
     * <p>
     * The requested table version.
     * </p>
     *
     * @param tableVersion <p>
     *            The requested table version.
     *            </p>
     */
    public void setTableVersion(TableVersion tableVersion) {
        this.tableVersion = tableVersion;
    }

    /**
     * <p>
     * The requested table version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableVersion <p>
     *            The requested table version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTableVersionResult withTableVersion(TableVersion tableVersion) {
        this.tableVersion = tableVersion;
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
        if (getTableVersion() != null)
            sb.append("TableVersion: " + getTableVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTableVersion() == null) ? 0 : getTableVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableVersionResult == false)
            return false;
        GetTableVersionResult other = (GetTableVersionResult) obj;

        if (other.getTableVersion() == null ^ this.getTableVersion() == null)
            return false;
        if (other.getTableVersion() != null
                && other.getTableVersion().equals(this.getTableVersion()) == false)
            return false;
        return true;
    }
}
