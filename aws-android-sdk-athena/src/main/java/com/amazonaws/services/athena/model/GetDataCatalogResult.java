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

public class GetDataCatalogResult implements Serializable {
    /**
     * <p>
     * The data catalog returned.
     * </p>
     */
    private DataCatalog dataCatalog;

    /**
     * <p>
     * The data catalog returned.
     * </p>
     *
     * @return <p>
     *         The data catalog returned.
     *         </p>
     */
    public DataCatalog getDataCatalog() {
        return dataCatalog;
    }

    /**
     * <p>
     * The data catalog returned.
     * </p>
     *
     * @param dataCatalog <p>
     *            The data catalog returned.
     *            </p>
     */
    public void setDataCatalog(DataCatalog dataCatalog) {
        this.dataCatalog = dataCatalog;
    }

    /**
     * <p>
     * The data catalog returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataCatalog <p>
     *            The data catalog returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataCatalogResult withDataCatalog(DataCatalog dataCatalog) {
        this.dataCatalog = dataCatalog;
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
        if (getDataCatalog() != null)
            sb.append("DataCatalog: " + getDataCatalog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataCatalog() == null) ? 0 : getDataCatalog().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataCatalogResult == false)
            return false;
        GetDataCatalogResult other = (GetDataCatalogResult) obj;

        if (other.getDataCatalog() == null ^ this.getDataCatalog() == null)
            return false;
        if (other.getDataCatalog() != null
                && other.getDataCatalog().equals(this.getDataCatalog()) == false)
            return false;
        return true;
    }
}
