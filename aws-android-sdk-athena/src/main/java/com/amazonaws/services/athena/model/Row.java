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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The rows that comprise a query result table.
 * </p>
 */
public class Row implements Serializable {
    /**
     * <p>
     * The data that populates a row in a query result table.
     * </p>
     */
    private java.util.List<Datum> data;

    /**
     * <p>
     * The data that populates a row in a query result table.
     * </p>
     *
     * @return <p>
     *         The data that populates a row in a query result table.
     *         </p>
     */
    public java.util.List<Datum> getData() {
        return data;
    }

    /**
     * <p>
     * The data that populates a row in a query result table.
     * </p>
     *
     * @param data <p>
     *            The data that populates a row in a query result table.
     *            </p>
     */
    public void setData(java.util.Collection<Datum> data) {
        if (data == null) {
            this.data = null;
            return;
        }

        this.data = new java.util.ArrayList<Datum>(data);
    }

    /**
     * <p>
     * The data that populates a row in a query result table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The data that populates a row in a query result table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Row withData(Datum... data) {
        if (getData() == null) {
            this.data = new java.util.ArrayList<Datum>(data.length);
        }
        for (Datum value : data) {
            this.data.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The data that populates a row in a query result table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The data that populates a row in a query result table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Row withData(java.util.Collection<Datum> data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Row == false)
            return false;
        Row other = (Row) obj;

        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }
}
