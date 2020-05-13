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
 * Represents the progress of an online resharding operation.
 * </p>
 */
public class SlotMigration implements Serializable {
    /**
     * <p>
     * The percentage of the slot migration that is complete.
     * </p>
     */
    private Double progressPercentage;

    /**
     * <p>
     * The percentage of the slot migration that is complete.
     * </p>
     *
     * @return <p>
     *         The percentage of the slot migration that is complete.
     *         </p>
     */
    public Double getProgressPercentage() {
        return progressPercentage;
    }

    /**
     * <p>
     * The percentage of the slot migration that is complete.
     * </p>
     *
     * @param progressPercentage <p>
     *            The percentage of the slot migration that is complete.
     *            </p>
     */
    public void setProgressPercentage(Double progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    /**
     * <p>
     * The percentage of the slot migration that is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressPercentage <p>
     *            The percentage of the slot migration that is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SlotMigration withProgressPercentage(Double progressPercentage) {
        this.progressPercentage = progressPercentage;
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
        if (getProgressPercentage() != null)
            sb.append("ProgressPercentage: " + getProgressPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProgressPercentage() == null) ? 0 : getProgressPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotMigration == false)
            return false;
        SlotMigration other = (SlotMigration) obj;

        if (other.getProgressPercentage() == null ^ this.getProgressPercentage() == null)
            return false;
        if (other.getProgressPercentage() != null
                && other.getProgressPercentage().equals(this.getProgressPercentage()) == false)
            return false;
        return true;
    }
}
