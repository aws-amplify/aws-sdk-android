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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains aggregated asset property values (for example, average, minimum, and
 * maximum).
 * </p>
 */
public class AggregatedValue implements Serializable {
    /**
     * <p>
     * The date the aggregating computations occurred, in Unix epoch time.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The quality of the aggregated data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOOD, BAD, UNCERTAIN
     */
    private String quality;

    /**
     * <p>
     * The value of the aggregates.
     * </p>
     */
    private Aggregates value;

    /**
     * <p>
     * The date the aggregating computations occurred, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the aggregating computations occurred, in Unix epoch
     *         time.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The date the aggregating computations occurred, in Unix epoch time.
     * </p>
     *
     * @param timestamp <p>
     *            The date the aggregating computations occurred, in Unix epoch
     *            time.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date the aggregating computations occurred, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The date the aggregating computations occurred, in Unix epoch
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AggregatedValue withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The quality of the aggregated data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOOD, BAD, UNCERTAIN
     *
     * @return <p>
     *         The quality of the aggregated data.
     *         </p>
     * @see Quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * <p>
     * The quality of the aggregated data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOOD, BAD, UNCERTAIN
     *
     * @param quality <p>
     *            The quality of the aggregated data.
     *            </p>
     * @see Quality
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * The quality of the aggregated data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOOD, BAD, UNCERTAIN
     *
     * @param quality <p>
     *            The quality of the aggregated data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Quality
     */
    public AggregatedValue withQuality(String quality) {
        this.quality = quality;
        return this;
    }

    /**
     * <p>
     * The quality of the aggregated data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOOD, BAD, UNCERTAIN
     *
     * @param quality <p>
     *            The quality of the aggregated data.
     *            </p>
     * @see Quality
     */
    public void setQuality(Quality quality) {
        this.quality = quality.toString();
    }

    /**
     * <p>
     * The quality of the aggregated data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOOD, BAD, UNCERTAIN
     *
     * @param quality <p>
     *            The quality of the aggregated data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Quality
     */
    public AggregatedValue withQuality(Quality quality) {
        this.quality = quality.toString();
        return this;
    }

    /**
     * <p>
     * The value of the aggregates.
     * </p>
     *
     * @return <p>
     *         The value of the aggregates.
     *         </p>
     */
    public Aggregates getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the aggregates.
     * </p>
     *
     * @param value <p>
     *            The value of the aggregates.
     *            </p>
     */
    public void setValue(Aggregates value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the aggregates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the aggregates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AggregatedValue withValue(Aggregates value) {
        this.value = value;
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
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getQuality() != null)
            sb.append("quality: " + getQuality() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregatedValue == false)
            return false;
        AggregatedValue other = (AggregatedValue) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
