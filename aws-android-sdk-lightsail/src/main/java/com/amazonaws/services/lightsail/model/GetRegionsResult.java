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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetRegionsResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about your get regions
     * request.
     * </p>
     */
    private java.util.List<Region> regions;

    /**
     * <p>
     * An array of key-value pairs containing information about your get regions
     * request.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about your get
     *         regions request.
     *         </p>
     */
    public java.util.List<Region> getRegions() {
        return regions;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your get regions
     * request.
     * </p>
     *
     * @param regions <p>
     *            An array of key-value pairs containing information about your
     *            get regions request.
     *            </p>
     */
    public void setRegions(java.util.Collection<Region> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<Region>(regions);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your get regions
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            An array of key-value pairs containing information about your
     *            get regions request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRegionsResult withRegions(Region... regions) {
        if (getRegions() == null) {
            this.regions = new java.util.ArrayList<Region>(regions.length);
        }
        for (Region value : regions) {
            this.regions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your get regions
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            An array of key-value pairs containing information about your
     *            get regions request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRegionsResult withRegions(java.util.Collection<Region> regions) {
        setRegions(regions);
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
        if (getRegions() != null)
            sb.append("regions: " + getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegionsResult == false)
            return false;
        GetRegionsResult other = (GetRegionsResult) obj;

        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }
}
