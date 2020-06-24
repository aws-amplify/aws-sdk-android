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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A list of port ranges that are permitted to allow inbound traffic from all
 * public IP addresses. To specify a single port, use the same value for
 * <code>MinRange</code> and <code>MaxRange</code>.
 * </p>
 */
public class PortRange implements Serializable {
    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer minRange;

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer maxRange;

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return <p>
     *         The smallest port number in a specified range of port numbers.
     *         </p>
     */
    public Integer getMinRange() {
        return minRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param minRange <p>
     *            The smallest port number in a specified range of port numbers.
     *            </p>
     */
    public void setMinRange(Integer minRange) {
        this.minRange = minRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param minRange <p>
     *            The smallest port number in a specified range of port numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortRange withMinRange(Integer minRange) {
        this.minRange = minRange;
        return this;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return <p>
     *         The smallest port number in a specified range of port numbers.
     *         </p>
     */
    public Integer getMaxRange() {
        return maxRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param maxRange <p>
     *            The smallest port number in a specified range of port numbers.
     *            </p>
     */
    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    /**
     * <p>
     * The smallest port number in a specified range of port numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param maxRange <p>
     *            The smallest port number in a specified range of port numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortRange withMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
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
        if (getMinRange() != null)
            sb.append("MinRange: " + getMinRange() + ",");
        if (getMaxRange() != null)
            sb.append("MaxRange: " + getMaxRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinRange() == null) ? 0 : getMinRange().hashCode());
        hashCode = prime * hashCode + ((getMaxRange() == null) ? 0 : getMaxRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortRange == false)
            return false;
        PortRange other = (PortRange) obj;

        if (other.getMinRange() == null ^ this.getMinRange() == null)
            return false;
        if (other.getMinRange() != null && other.getMinRange().equals(this.getMinRange()) == false)
            return false;
        if (other.getMaxRange() == null ^ this.getMaxRange() == null)
            return false;
        if (other.getMaxRange() != null && other.getMaxRange().equals(this.getMaxRange()) == false)
            return false;
        return true;
    }
}
