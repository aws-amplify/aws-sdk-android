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

public class GetCardinalityResult implements Serializable {
    /**
     * <p>
     * The approximate count of unique values that match the query.
     * </p>
     */
    private Integer cardinality;

    /**
     * <p>
     * The approximate count of unique values that match the query.
     * </p>
     *
     * @return <p>
     *         The approximate count of unique values that match the query.
     *         </p>
     */
    public Integer getCardinality() {
        return cardinality;
    }

    /**
     * <p>
     * The approximate count of unique values that match the query.
     * </p>
     *
     * @param cardinality <p>
     *            The approximate count of unique values that match the query.
     *            </p>
     */
    public void setCardinality(Integer cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * <p>
     * The approximate count of unique values that match the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cardinality <p>
     *            The approximate count of unique values that match the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCardinalityResult withCardinality(Integer cardinality) {
        this.cardinality = cardinality;
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
        if (getCardinality() != null)
            sb.append("cardinality: " + getCardinality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCardinality() == null) ? 0 : getCardinality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCardinalityResult == false)
            return false;
        GetCardinalityResult other = (GetCardinalityResult) obj;

        if (other.getCardinality() == null ^ this.getCardinality() == null)
            return false;
        if (other.getCardinality() != null
                && other.getCardinality().equals(this.getCardinality()) == false)
            return false;
        return true;
    }
}
