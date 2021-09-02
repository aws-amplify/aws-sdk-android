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
 * The type of bucketed aggregation performed.
 * </p>
 */
public class BucketsAggregationType implements Serializable {
    /**
     * <p>
     * Performs an aggregation that will return a list of buckets. The list of
     * buckets is a ranked list of the number of occurrences of an aggregation
     * field value.
     * </p>
     */
    private TermsAggregation termsAggregation;

    /**
     * <p>
     * Performs an aggregation that will return a list of buckets. The list of
     * buckets is a ranked list of the number of occurrences of an aggregation
     * field value.
     * </p>
     *
     * @return <p>
     *         Performs an aggregation that will return a list of buckets. The
     *         list of buckets is a ranked list of the number of occurrences of
     *         an aggregation field value.
     *         </p>
     */
    public TermsAggregation getTermsAggregation() {
        return termsAggregation;
    }

    /**
     * <p>
     * Performs an aggregation that will return a list of buckets. The list of
     * buckets is a ranked list of the number of occurrences of an aggregation
     * field value.
     * </p>
     *
     * @param termsAggregation <p>
     *            Performs an aggregation that will return a list of buckets.
     *            The list of buckets is a ranked list of the number of
     *            occurrences of an aggregation field value.
     *            </p>
     */
    public void setTermsAggregation(TermsAggregation termsAggregation) {
        this.termsAggregation = termsAggregation;
    }

    /**
     * <p>
     * Performs an aggregation that will return a list of buckets. The list of
     * buckets is a ranked list of the number of occurrences of an aggregation
     * field value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param termsAggregation <p>
     *            Performs an aggregation that will return a list of buckets.
     *            The list of buckets is a ranked list of the number of
     *            occurrences of an aggregation field value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketsAggregationType withTermsAggregation(TermsAggregation termsAggregation) {
        this.termsAggregation = termsAggregation;
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
        if (getTermsAggregation() != null)
            sb.append("termsAggregation: " + getTermsAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTermsAggregation() == null) ? 0 : getTermsAggregation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketsAggregationType == false)
            return false;
        BucketsAggregationType other = (BucketsAggregationType) obj;

        if (other.getTermsAggregation() == null ^ this.getTermsAggregation() == null)
            return false;
        if (other.getTermsAggregation() != null
                && other.getTermsAggregation().equals(this.getTermsAggregation()) == false)
            return false;
        return true;
    }
}
