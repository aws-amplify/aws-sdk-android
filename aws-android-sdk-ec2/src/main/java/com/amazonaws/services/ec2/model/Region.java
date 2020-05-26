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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Region.
 * </p>
 */
public class Region implements Serializable {
    /**
     * <p>
     * The Region service endpoint.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The Region opt-in status. The possible values are
     * <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     */
    private String optInStatus;

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     *
     * @return <p>
     *         The Region service endpoint.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     *
     * @param endpoint <p>
     *            The Region service endpoint.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The Region service endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The Region service endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     *
     * @return <p>
     *         The name of the Region.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     *
     * @param regionName <p>
     *            The name of the Region.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            The name of the Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * The Region opt-in status. The possible values are
     * <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     *
     * @return <p>
     *         The Region opt-in status. The possible values are
     *         <code>opt-in-not-required</code>, <code>opted-in</code>, and
     *         <code>not-opted-in</code>.
     *         </p>
     */
    public String getOptInStatus() {
        return optInStatus;
    }

    /**
     * <p>
     * The Region opt-in status. The possible values are
     * <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     *
     * @param optInStatus <p>
     *            The Region opt-in status. The possible values are
     *            <code>opt-in-not-required</code>, <code>opted-in</code>, and
     *            <code>not-opted-in</code>.
     *            </p>
     */
    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * The Region opt-in status. The possible values are
     * <code>opt-in-not-required</code>, <code>opted-in</code>, and
     * <code>not-opted-in</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optInStatus <p>
     *            The Region opt-in status. The possible values are
     *            <code>opt-in-not-required</code>, <code>opted-in</code>, and
     *            <code>not-opted-in</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Region withOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
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
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getRegionName() != null)
            sb.append("RegionName: " + getRegionName() + ",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: " + getOptInStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode
                + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Region == false)
            return false;
        Region other = (Region) obj;

        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null
                && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        return true;
    }
}
