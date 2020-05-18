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
 * Replica-specific provisioned throughput settings. If not specified, uses the
 * source table's provisioned throughput settings.
 * </p>
 */
public class ProvisionedThroughputOverride implements Serializable {
    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source
     * table's read capacity settings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long readCapacityUnits;

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source
     * table's read capacity settings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Replica-specific read capacity units. If not specified, uses the
     *         source table's read capacity settings.
     *         </p>
     */
    public Long getReadCapacityUnits() {
        return readCapacityUnits;
    }

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source
     * table's read capacity settings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits <p>
     *            Replica-specific read capacity units. If not specified, uses
     *            the source table's read capacity settings.
     *            </p>
     */
    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source
     * table's read capacity settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits <p>
     *            Replica-specific read capacity units. If not specified, uses
     *            the source table's read capacity settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughputOverride withReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
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
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: " + getReadCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedThroughputOverride == false)
            return false;
        ProvisionedThroughputOverride other = (ProvisionedThroughputOverride) obj;

        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null
                && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        return true;
    }
}
