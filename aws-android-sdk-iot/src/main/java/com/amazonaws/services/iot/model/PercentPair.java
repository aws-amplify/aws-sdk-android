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
 * Describes the percentile and percentile value.
 * </p>
 */
public class PercentPair implements Serializable {
    /**
     * <p>
     * The percentile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Double percent;

    /**
     * <p>
     * The value of the percentile.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The percentile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentile.
     *         </p>
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * <p>
     * The percentile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percent <p>
     *            The percentile.
     *            </p>
     */
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    /**
     * <p>
     * The percentile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percent <p>
     *            The percentile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PercentPair withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * <p>
     * The value of the percentile.
     * </p>
     *
     * @return <p>
     *         The value of the percentile.
     *         </p>
     */
    public Double getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the percentile.
     * </p>
     *
     * @param value <p>
     *            The value of the percentile.
     *            </p>
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the percentile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the percentile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PercentPair withValue(Double value) {
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
        if (getPercent() != null)
            sb.append("percent: " + getPercent() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercent() == null) ? 0 : getPercent().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PercentPair == false)
            return false;
        PercentPair other = (PercentPair) obj;

        if (other.getPercent() == null ^ this.getPercent() == null)
            return false;
        if (other.getPercent() != null && other.getPercent().equals(this.getPercent()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
