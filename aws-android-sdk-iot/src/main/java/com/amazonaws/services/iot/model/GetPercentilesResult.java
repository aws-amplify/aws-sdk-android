/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class GetPercentilesResult implements Serializable {
    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     */
    private java.util.List<PercentPair> percentiles;

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     *
     * @return <p>
     *         The percentile values of the aggregated fields.
     *         </p>
     */
    public java.util.List<PercentPair> getPercentiles() {
        return percentiles;
    }

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     *
     * @param percentiles <p>
     *            The percentile values of the aggregated fields.
     *            </p>
     */
    public void setPercentiles(java.util.Collection<PercentPair> percentiles) {
        if (percentiles == null) {
            this.percentiles = null;
            return;
        }

        this.percentiles = new java.util.ArrayList<PercentPair>(percentiles);
    }

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentiles <p>
     *            The percentile values of the aggregated fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPercentilesResult withPercentiles(PercentPair... percentiles) {
        if (getPercentiles() == null) {
            this.percentiles = new java.util.ArrayList<PercentPair>(percentiles.length);
        }
        for (PercentPair value : percentiles) {
            this.percentiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The percentile values of the aggregated fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentiles <p>
     *            The percentile values of the aggregated fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPercentilesResult withPercentiles(java.util.Collection<PercentPair> percentiles) {
        setPercentiles(percentiles);
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
        if (getPercentiles() != null)
            sb.append("percentiles: " + getPercentiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPercentiles() == null) ? 0 : getPercentiles().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPercentilesResult == false)
            return false;
        GetPercentilesResult other = (GetPercentilesResult) obj;

        if (other.getPercentiles() == null ^ this.getPercentiles() == null)
            return false;
        if (other.getPercentiles() != null
                && other.getPercentiles().equals(this.getPercentiles()) == false)
            return false;
        return true;
    }
}
