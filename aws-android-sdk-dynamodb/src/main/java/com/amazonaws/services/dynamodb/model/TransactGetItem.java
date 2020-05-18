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
 * Specifies an item to be retrieved as part of the transaction.
 * </p>
 */
public class TransactGetItem implements Serializable {
    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with
     * the name of the table that contains the item, and optionally the specific
     * attributes of the item to retrieve.
     * </p>
     */
    private Get get;

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with
     * the name of the table that contains the item, and optionally the specific
     * attributes of the item to retrieve.
     * </p>
     *
     * @return <p>
     *         Contains the primary key that identifies the item to get,
     *         together with the name of the table that contains the item, and
     *         optionally the specific attributes of the item to retrieve.
     *         </p>
     */
    public Get getGet() {
        return get;
    }

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with
     * the name of the table that contains the item, and optionally the specific
     * attributes of the item to retrieve.
     * </p>
     *
     * @param get <p>
     *            Contains the primary key that identifies the item to get,
     *            together with the name of the table that contains the item,
     *            and optionally the specific attributes of the item to
     *            retrieve.
     *            </p>
     */
    public void setGet(Get get) {
        this.get = get;
    }

    /**
     * <p>
     * Contains the primary key that identifies the item to get, together with
     * the name of the table that contains the item, and optionally the specific
     * attributes of the item to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param get <p>
     *            Contains the primary key that identifies the item to get,
     *            together with the name of the table that contains the item,
     *            and optionally the specific attributes of the item to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItem withGet(Get get) {
        this.get = get;
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
        if (getGet() != null)
            sb.append("Get: " + getGet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGet() == null) ? 0 : getGet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactGetItem == false)
            return false;
        TransactGetItem other = (TransactGetItem) obj;

        if (other.getGet() == null ^ this.getGet() == null)
            return false;
        if (other.getGet() != null && other.getGet().equals(this.getGet()) == false)
            return false;
        return true;
    }
}
