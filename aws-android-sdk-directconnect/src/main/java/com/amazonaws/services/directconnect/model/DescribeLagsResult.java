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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DescribeLagsResult implements Serializable {
    /**
     * <p>
     * The LAGs.
     * </p>
     */
    private java.util.List<Lag> lags;

    /**
     * <p>
     * The LAGs.
     * </p>
     *
     * @return <p>
     *         The LAGs.
     *         </p>
     */
    public java.util.List<Lag> getLags() {
        return lags;
    }

    /**
     * <p>
     * The LAGs.
     * </p>
     *
     * @param lags <p>
     *            The LAGs.
     *            </p>
     */
    public void setLags(java.util.Collection<Lag> lags) {
        if (lags == null) {
            this.lags = null;
            return;
        }

        this.lags = new java.util.ArrayList<Lag>(lags);
    }

    /**
     * <p>
     * The LAGs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lags <p>
     *            The LAGs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLagsResult withLags(Lag... lags) {
        if (getLags() == null) {
            this.lags = new java.util.ArrayList<Lag>(lags.length);
        }
        for (Lag value : lags) {
            this.lags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The LAGs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lags <p>
     *            The LAGs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLagsResult withLags(java.util.Collection<Lag> lags) {
        setLags(lags);
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
        if (getLags() != null)
            sb.append("lags: " + getLags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLags() == null) ? 0 : getLags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLagsResult == false)
            return false;
        DescribeLagsResult other = (DescribeLagsResult) obj;

        if (other.getLags() == null ^ this.getLags() == null)
            return false;
        if (other.getLags() != null && other.getLags().equals(this.getLags()) == false)
            return false;
        return true;
    }
}
