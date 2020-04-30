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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the discoverer
 * </p>
 */
public class UpdateDiscovererRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     */
    private String discovererId;

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         The description of the discoverer to update.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description <p>
     *            The description of the discoverer to update.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the discoverer to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description <p>
     *            The description of the discoverer to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDiscovererRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     *
     * @return <p>
     *         The ID of the discoverer.
     *         </p>
     */
    public String getDiscovererId() {
        return discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     *
     * @param discovererId <p>
     *            The ID of the discoverer.
     *            </p>
     */
    public void setDiscovererId(String discovererId) {
        this.discovererId = discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discovererId <p>
     *            The ID of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDiscovererRequest withDiscovererId(String discovererId) {
        this.discovererId = discovererId;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDiscovererId() != null)
            sb.append("DiscovererId: " + getDiscovererId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDiscovererId() == null) ? 0 : getDiscovererId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDiscovererRequest == false)
            return false;
        UpdateDiscovererRequest other = (UpdateDiscovererRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiscovererId() == null ^ this.getDiscovererId() == null)
            return false;
        if (other.getDiscovererId() != null
                && other.getDiscovererId().equals(this.getDiscovererId()) == false)
            return false;
        return true;
    }
}
