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

/**
 * <p>
 * Performs an aggregation that will return a list of buckets. The list of
 * buckets is a ranked list of the number of occurrences of an aggregation field
 * value.
 * </p>
 */
public class TermsAggregation implements Serializable {
    /**
     * <p>
     * The number of buckets to return in the response. Default to 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxBuckets;

    /**
     * <p>
     * The number of buckets to return in the response. Default to 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The number of buckets to return in the response. Default to 10.
     *         </p>
     */
    public Integer getMaxBuckets() {
        return maxBuckets;
    }

    /**
     * <p>
     * The number of buckets to return in the response. Default to 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxBuckets <p>
     *            The number of buckets to return in the response. Default to
     *            10.
     *            </p>
     */
    public void setMaxBuckets(Integer maxBuckets) {
        this.maxBuckets = maxBuckets;
    }

    /**
     * <p>
     * The number of buckets to return in the response. Default to 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxBuckets <p>
     *            The number of buckets to return in the response. Default to
     *            10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TermsAggregation withMaxBuckets(Integer maxBuckets) {
        this.maxBuckets = maxBuckets;
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
        if (getMaxBuckets() != null)
            sb.append("maxBuckets: " + getMaxBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxBuckets() == null) ? 0 : getMaxBuckets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TermsAggregation == false)
            return false;
        TermsAggregation other = (TermsAggregation) obj;

        if (other.getMaxBuckets() == null ^ this.getMaxBuckets() == null)
            return false;
        if (other.getMaxBuckets() != null
                && other.getMaxBuckets().equals(this.getMaxBuckets()) == false)
            return false;
        return true;
    }
}
