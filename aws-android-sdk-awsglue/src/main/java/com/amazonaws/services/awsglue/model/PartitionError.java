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

/**
 * <p>
 * Contains information about a partition error.
 * </p>
 */
public class PartitionError implements Serializable {
    /**
     * <p>
     * The values that define the partition.
     * </p>
     */
    private java.util.List<String> partitionValues;

    /**
     * <p>
     * The details about the partition error.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * The values that define the partition.
     * </p>
     *
     * @return <p>
     *         The values that define the partition.
     *         </p>
     */
    public java.util.List<String> getPartitionValues() {
        return partitionValues;
    }

    /**
     * <p>
     * The values that define the partition.
     * </p>
     *
     * @param partitionValues <p>
     *            The values that define the partition.
     *            </p>
     */
    public void setPartitionValues(java.util.Collection<String> partitionValues) {
        if (partitionValues == null) {
            this.partitionValues = null;
            return;
        }

        this.partitionValues = new java.util.ArrayList<String>(partitionValues);
    }

    /**
     * <p>
     * The values that define the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionValues <p>
     *            The values that define the partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PartitionError withPartitionValues(String... partitionValues) {
        if (getPartitionValues() == null) {
            this.partitionValues = new java.util.ArrayList<String>(partitionValues.length);
        }
        for (String value : partitionValues) {
            this.partitionValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The values that define the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionValues <p>
     *            The values that define the partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PartitionError withPartitionValues(java.util.Collection<String> partitionValues) {
        setPartitionValues(partitionValues);
        return this;
    }

    /**
     * <p>
     * The details about the partition error.
     * </p>
     *
     * @return <p>
     *         The details about the partition error.
     *         </p>
     */
    public ErrorDetail getErrorDetail() {
        return errorDetail;
    }

    /**
     * <p>
     * The details about the partition error.
     * </p>
     *
     * @param errorDetail <p>
     *            The details about the partition error.
     *            </p>
     */
    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * The details about the partition error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDetail <p>
     *            The details about the partition error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PartitionError withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
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
        if (getPartitionValues() != null)
            sb.append("PartitionValues: " + getPartitionValues() + ",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: " + getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPartitionValues() == null) ? 0 : getPartitionValues().hashCode());
        hashCode = prime * hashCode
                + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartitionError == false)
            return false;
        PartitionError other = (PartitionError) obj;

        if (other.getPartitionValues() == null ^ this.getPartitionValues() == null)
            return false;
        if (other.getPartitionValues() != null
                && other.getPartitionValues().equals(this.getPartitionValues()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null
                && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }
}
