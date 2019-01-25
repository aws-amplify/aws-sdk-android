/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Structure containing the estimated age range, in years, for a face.
 * </p>
 * <p>
 * Rekognition estimates an age-range for faces detected in the input image.
 * Estimated age ranges can overlap; a face of a 5 year old may have an
 * estimated range of 4-6 whilst the face of a 6 year old may have an estimated
 * range of 4-8.
 * </p>
 */
public class AgeRange implements Serializable {
    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer low;

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer high;

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The lowest estimated age.
     *         </p>
     */
    public Integer getLow() {
        return low;
    }

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param low <p>
     *            The lowest estimated age.
     *            </p>
     */
    public void setLow(Integer low) {
        this.low = low;
    }

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param low <p>
     *            The lowest estimated age.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgeRange withLow(Integer low) {
        this.low = low;
        return this;
    }

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The highest estimated age.
     *         </p>
     */
    public Integer getHigh() {
        return high;
    }

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param high <p>
     *            The highest estimated age.
     *            </p>
     */
    public void setHigh(Integer high) {
        this.high = high;
    }

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param high <p>
     *            The highest estimated age.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AgeRange withHigh(Integer high) {
        this.high = high;
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
        if (getLow() != null)
            sb.append("Low: " + getLow() + ",");
        if (getHigh() != null)
            sb.append("High: " + getHigh());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLow() == null) ? 0 : getLow().hashCode());
        hashCode = prime * hashCode + ((getHigh() == null) ? 0 : getHigh().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgeRange == false)
            return false;
        AgeRange other = (AgeRange) obj;

        if (other.getLow() == null ^ this.getLow() == null)
            return false;
        if (other.getLow() != null && other.getLow().equals(this.getLow()) == false)
            return false;
        if (other.getHigh() == null ^ this.getHigh() == null)
            return false;
        if (other.getHigh() != null && other.getHigh().equals(this.getHigh()) == false)
            return false;
        return true;
    }
}
