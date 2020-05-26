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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * The status of an online resharding operation.
 * </p>
 */
public class ReshardingStatus implements Serializable {
    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     */
    private SlotMigration slotMigration;

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     *
     * @return <p>
     *         Represents the progress of an online resharding operation.
     *         </p>
     */
    public SlotMigration getSlotMigration() {
        return slotMigration;
    }

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     *
     * @param slotMigration <p>
     *            Represents the progress of an online resharding operation.
     *            </p>
     */
    public void setSlotMigration(SlotMigration slotMigration) {
        this.slotMigration = slotMigration;
    }

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotMigration <p>
     *            Represents the progress of an online resharding operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReshardingStatus withSlotMigration(SlotMigration slotMigration) {
        this.slotMigration = slotMigration;
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
        if (getSlotMigration() != null)
            sb.append("SlotMigration: " + getSlotMigration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSlotMigration() == null) ? 0 : getSlotMigration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReshardingStatus == false)
            return false;
        ReshardingStatus other = (ReshardingStatus) obj;

        if (other.getSlotMigration() == null ^ this.getSlotMigration() == null)
            return false;
        if (other.getSlotMigration() != null
                && other.getSlotMigration().equals(this.getSlotMigration()) == false)
            return false;
        return true;
    }
}
