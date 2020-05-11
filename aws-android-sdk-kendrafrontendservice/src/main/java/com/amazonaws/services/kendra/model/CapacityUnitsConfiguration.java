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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies capacity units configured for your index. You can add and remove
 * capacity units to tune an index to your requirements.
 * </p>
 */
public class CapacityUnitsConfiguration implements Serializable {
    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit
     * provides 150 Gb of storage space or 500,000 documents, whichever is
     * reached first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer storageCapacityUnits;

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit
     * provides 0.5 queries per second and 40,000 queries per day.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer queryCapacityUnits;

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit
     * provides 150 Gb of storage space or 500,000 documents, whichever is
     * reached first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The amount of extra storage capacity for an index. Each capacity
     *         unit provides 150 Gb of storage space or 500,000 documents,
     *         whichever is reached first.
     *         </p>
     */
    public Integer getStorageCapacityUnits() {
        return storageCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit
     * provides 150 Gb of storage space or 500,000 documents, whichever is
     * reached first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storageCapacityUnits <p>
     *            The amount of extra storage capacity for an index. Each
     *            capacity unit provides 150 Gb of storage space or 500,000
     *            documents, whichever is reached first.
     *            </p>
     */
    public void setStorageCapacityUnits(Integer storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra storage capacity for an index. Each capacity unit
     * provides 150 Gb of storage space or 500,000 documents, whichever is
     * reached first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storageCapacityUnits <p>
     *            The amount of extra storage capacity for an index. Each
     *            capacity unit provides 150 Gb of storage space or 500,000
     *            documents, whichever is reached first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityUnitsConfiguration withStorageCapacityUnits(Integer storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit
     * provides 0.5 queries per second and 40,000 queries per day.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The amount of extra query capacity for an index. Each capacity
     *         unit provides 0.5 queries per second and 40,000 queries per day.
     *         </p>
     */
    public Integer getQueryCapacityUnits() {
        return queryCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit
     * provides 0.5 queries per second and 40,000 queries per day.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param queryCapacityUnits <p>
     *            The amount of extra query capacity for an index. Each capacity
     *            unit provides 0.5 queries per second and 40,000 queries per
     *            day.
     *            </p>
     */
    public void setQueryCapacityUnits(Integer queryCapacityUnits) {
        this.queryCapacityUnits = queryCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index. Each capacity unit
     * provides 0.5 queries per second and 40,000 queries per day.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param queryCapacityUnits <p>
     *            The amount of extra query capacity for an index. Each capacity
     *            unit provides 0.5 queries per second and 40,000 queries per
     *            day.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CapacityUnitsConfiguration withQueryCapacityUnits(Integer queryCapacityUnits) {
        this.queryCapacityUnits = queryCapacityUnits;
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
        if (getStorageCapacityUnits() != null)
            sb.append("StorageCapacityUnits: " + getStorageCapacityUnits() + ",");
        if (getQueryCapacityUnits() != null)
            sb.append("QueryCapacityUnits: " + getQueryCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStorageCapacityUnits() == null) ? 0 : getStorageCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getQueryCapacityUnits() == null) ? 0 : getQueryCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityUnitsConfiguration == false)
            return false;
        CapacityUnitsConfiguration other = (CapacityUnitsConfiguration) obj;

        if (other.getStorageCapacityUnits() == null ^ this.getStorageCapacityUnits() == null)
            return false;
        if (other.getStorageCapacityUnits() != null
                && other.getStorageCapacityUnits().equals(this.getStorageCapacityUnits()) == false)
            return false;
        if (other.getQueryCapacityUnits() == null ^ this.getQueryCapacityUnits() == null)
            return false;
        if (other.getQueryCapacityUnits() != null
                && other.getQueryCapacityUnits().equals(this.getQueryCapacityUnits()) == false)
            return false;
        return true;
    }
}
