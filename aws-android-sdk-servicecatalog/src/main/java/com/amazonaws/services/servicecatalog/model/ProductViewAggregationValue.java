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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * A single product view aggregation value/count pair, containing metadata about
 * each product to which the calling user has access.
 * </p>
 */
public class ProductViewAggregationValue implements Serializable {
    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     */
    private String value;

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     */
    private Integer approximateCount;

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     *
     * @return <p>
     *         The value of the product view aggregation.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     *
     * @param value <p>
     *            The value of the product view aggregation.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the product view aggregation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewAggregationValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     *
     * @return <p>
     *         An approximate count of the products that match the value.
     *         </p>
     */
    public Integer getApproximateCount() {
        return approximateCount;
    }

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     *
     * @param approximateCount <p>
     *            An approximate count of the products that match the value.
     *            </p>
     */
    public void setApproximateCount(Integer approximateCount) {
        this.approximateCount = approximateCount;
    }

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateCount <p>
     *            An approximate count of the products that match the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductViewAggregationValue withApproximateCount(Integer approximateCount) {
        this.approximateCount = approximateCount;
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getApproximateCount() != null)
            sb.append("ApproximateCount: " + getApproximateCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getApproximateCount() == null) ? 0 : getApproximateCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductViewAggregationValue == false)
            return false;
        ProductViewAggregationValue other = (ProductViewAggregationValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getApproximateCount() == null ^ this.getApproximateCount() == null)
            return false;
        if (other.getApproximateCount() != null
                && other.getApproximateCount().equals(this.getApproximateCount()) == false)
            return false;
        return true;
    }
}
