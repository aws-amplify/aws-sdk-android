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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeSchemaResult implements Serializable {
    /**
     * <p>
     * The requested schema.
     * </p>
     */
    private DatasetSchema schema;

    /**
     * <p>
     * The requested schema.
     * </p>
     *
     * @return <p>
     *         The requested schema.
     *         </p>
     */
    public DatasetSchema getSchema() {
        return schema;
    }

    /**
     * <p>
     * The requested schema.
     * </p>
     *
     * @param schema <p>
     *            The requested schema.
     *            </p>
     */
    public void setSchema(DatasetSchema schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The requested schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            The requested schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSchemaResult withSchema(DatasetSchema schema) {
        this.schema = schema;
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
        if (getSchema() != null)
            sb.append("schema: " + getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSchemaResult == false)
            return false;
        DescribeSchemaResult other = (DescribeSchemaResult) obj;

        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }
}
