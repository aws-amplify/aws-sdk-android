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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a boolean column statistics.
 * </p>
 */
public class BooleanColumnStatisticsData implements Serializable {
    /**
     * <p>
     * Number of true value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfTrues;

    /**
     * <p>
     * Number of false value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfFalses;

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfNulls;

    /**
     * <p>
     * Number of true value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of true value.
     *         </p>
     */
    public Long getNumberOfTrues() {
        return numberOfTrues;
    }

    /**
     * <p>
     * Number of true value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfTrues <p>
     *            Number of true value.
     *            </p>
     */
    public void setNumberOfTrues(Long numberOfTrues) {
        this.numberOfTrues = numberOfTrues;
    }

    /**
     * <p>
     * Number of true value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfTrues <p>
     *            Number of true value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BooleanColumnStatisticsData withNumberOfTrues(Long numberOfTrues) {
        this.numberOfTrues = numberOfTrues;
        return this;
    }

    /**
     * <p>
     * Number of false value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of false value.
     *         </p>
     */
    public Long getNumberOfFalses() {
        return numberOfFalses;
    }

    /**
     * <p>
     * Number of false value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfFalses <p>
     *            Number of false value.
     *            </p>
     */
    public void setNumberOfFalses(Long numberOfFalses) {
        this.numberOfFalses = numberOfFalses;
    }

    /**
     * <p>
     * Number of false value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfFalses <p>
     *            Number of false value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BooleanColumnStatisticsData withNumberOfFalses(Long numberOfFalses) {
        this.numberOfFalses = numberOfFalses;
        return this;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of nulls.
     *         </p>
     */
    public Long getNumberOfNulls() {
        return numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfNulls <p>
     *            Number of nulls.
     *            </p>
     */
    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfNulls <p>
     *            Number of nulls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BooleanColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
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
        if (getNumberOfTrues() != null)
            sb.append("NumberOfTrues: " + getNumberOfTrues() + ",");
        if (getNumberOfFalses() != null)
            sb.append("NumberOfFalses: " + getNumberOfFalses() + ",");
        if (getNumberOfNulls() != null)
            sb.append("NumberOfNulls: " + getNumberOfNulls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfTrues() == null) ? 0 : getNumberOfTrues().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfFalses() == null) ? 0 : getNumberOfFalses().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BooleanColumnStatisticsData == false)
            return false;
        BooleanColumnStatisticsData other = (BooleanColumnStatisticsData) obj;

        if (other.getNumberOfTrues() == null ^ this.getNumberOfTrues() == null)
            return false;
        if (other.getNumberOfTrues() != null
                && other.getNumberOfTrues().equals(this.getNumberOfTrues()) == false)
            return false;
        if (other.getNumberOfFalses() == null ^ this.getNumberOfFalses() == null)
            return false;
        if (other.getNumberOfFalses() != null
                && other.getNumberOfFalses().equals(this.getNumberOfFalses()) == false)
            return false;
        if (other.getNumberOfNulls() == null ^ this.getNumberOfNulls() == null)
            return false;
        if (other.getNumberOfNulls() != null
                && other.getNumberOfNulls().equals(this.getNumberOfNulls()) == false)
            return false;
        return true;
    }
}
