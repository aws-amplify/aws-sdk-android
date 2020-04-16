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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * A range of double values.
 * </p>
 */
public class DoubleRange implements Serializable {
    /**
     * <p>
     * The minimum value in the range.
     * </p>
     */
    private Double from;

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     */
    private Double to;

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     *
     * @return <p>
     *         The minimum value in the range.
     *         </p>
     */
    public Double getFrom() {
        return from;
    }

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     *
     * @param from <p>
     *            The minimum value in the range.
     *            </p>
     */
    public void setFrom(Double from) {
        this.from = from;
    }

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param from <p>
     *            The minimum value in the range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DoubleRange withFrom(Double from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     *
     * @return <p>
     *         The maximum value in the range.
     *         </p>
     */
    public Double getTo() {
        return to;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     *
     * @param to <p>
     *            The maximum value in the range.
     *            </p>
     */
    public void setTo(Double to) {
        this.to = to;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param to <p>
     *            The maximum value in the range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DoubleRange withTo(Double to) {
        this.to = to;
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
        if (getFrom() != null)
            sb.append("From: " + getFrom() + ",");
        if (getTo() != null)
            sb.append("To: " + getTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DoubleRange == false)
            return false;
        DoubleRange other = (DoubleRange) obj;

        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }
}
