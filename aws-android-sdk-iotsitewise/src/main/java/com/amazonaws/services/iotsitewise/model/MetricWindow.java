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
 * Contains a time interval window used for data aggregate computations (for
 * example, average, sum, count, and so on).
 * </p>
 */
public class MetricWindow implements Serializable {
    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     */
    private TumblingWindow tumbling;

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     *
     * @return <p>
     *         The tumbling time interval window.
     *         </p>
     */
    public TumblingWindow getTumbling() {
        return tumbling;
    }

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     *
     * @param tumbling <p>
     *            The tumbling time interval window.
     *            </p>
     */
    public void setTumbling(TumblingWindow tumbling) {
        this.tumbling = tumbling;
    }

    /**
     * <p>
     * The tumbling time interval window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tumbling <p>
     *            The tumbling time interval window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricWindow withTumbling(TumblingWindow tumbling) {
        this.tumbling = tumbling;
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
        if (getTumbling() != null)
            sb.append("tumbling: " + getTumbling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTumbling() == null) ? 0 : getTumbling().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricWindow == false)
            return false;
        MetricWindow other = (MetricWindow) obj;

        if (other.getTumbling() == null ^ this.getTumbling() == null)
            return false;
        if (other.getTumbling() != null && other.getTumbling().equals(this.getTumbling()) == false)
            return false;
        return true;
    }
}
