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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the attributes of the specified link aggregation group (LAG).
 * </p>
 * <p>
 * You can update the following attributes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The name of the LAG.
 * </p>
 * </li>
 * <li>
 * <p>
 * The value for the minimum number of connections that must be operational for
 * the LAG itself to be operational.
 * </p>
 * </li>
 * </ul>
 * <p>
 * When you create a LAG, the default value for the minimum number of
 * operational connections is zero (0). If you update this value and the number
 * of operational connections falls below the specified value, the LAG
 * automatically goes down to avoid over-utilization of the remaining
 * connections. Adjust this value with care, as it could force the LAG down if
 * it is set higher than the current number of operational connections.
 * </p>
 */
public class UpdateLagRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;

    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     */
    private Integer minimumLinks;

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     *
     * @return <p>
     *         The ID of the LAG.
     *         </p>
     */
    public String getLagId() {
        return lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     *
     * @param lagId <p>
     *            The ID of the LAG.
     *            </p>
     */
    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagId <p>
     *            The ID of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLagRequest withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     *
     * @return <p>
     *         The name of the LAG.
     *         </p>
     */
    public String getLagName() {
        return lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     *
     * @param lagName <p>
     *            The name of the LAG.
     *            </p>
     */
    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagName <p>
     *            The name of the LAG.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLagRequest withLagName(String lagName) {
        this.lagName = lagName;
        return this;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     *
     * @return <p>
     *         The minimum number of physical connections that must be
     *         operational for the LAG itself to be operational.
     *         </p>
     */
    public Integer getMinimumLinks() {
        return minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     *
     * @param minimumLinks <p>
     *            The minimum number of physical connections that must be
     *            operational for the LAG itself to be operational.
     *            </p>
     */
    public void setMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for
     * the LAG itself to be operational.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumLinks <p>
     *            The minimum number of physical connections that must be
     *            operational for the LAG itself to be operational.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLagRequest withMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
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
        if (getLagId() != null)
            sb.append("lagId: " + getLagId() + ",");
        if (getLagName() != null)
            sb.append("lagName: " + getLagName() + ",");
        if (getMinimumLinks() != null)
            sb.append("minimumLinks: " + getMinimumLinks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumLinks() == null) ? 0 : getMinimumLinks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLagRequest == false)
            return false;
        UpdateLagRequest other = (UpdateLagRequest) obj;

        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getMinimumLinks() == null ^ this.getMinimumLinks() == null)
            return false;
        if (other.getMinimumLinks() != null
                && other.getMinimumLinks().equals(this.getMinimumLinks()) == false)
            return false;
        return true;
    }
}
