/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class GetSignalingChannelEndpointResult implements Serializable {
    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     */
    private java.util.List<ResourceEndpointListItem> resourceEndpointList = new java.util.ArrayList<ResourceEndpointListItem>();

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     *
     * @return <p>
     *         A list of endpoints for the specified signaling channel.
     *         </p>
     */
    public java.util.List<ResourceEndpointListItem> getResourceEndpointList() {
        return resourceEndpointList;
    }

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     *
     * @param resourceEndpointList <p>
     *            A list of endpoints for the specified signaling channel.
     *            </p>
     */
    public void setResourceEndpointList(
            java.util.Collection<ResourceEndpointListItem> resourceEndpointList) {
        if (resourceEndpointList == null) {
            this.resourceEndpointList = null;
            return;
        }

        this.resourceEndpointList = new java.util.ArrayList<ResourceEndpointListItem>(
                resourceEndpointList);
    }

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceEndpointList <p>
     *            A list of endpoints for the specified signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSignalingChannelEndpointResult withResourceEndpointList(
            ResourceEndpointListItem... resourceEndpointList) {
        if (getResourceEndpointList() == null) {
            this.resourceEndpointList = new java.util.ArrayList<ResourceEndpointListItem>(
                    resourceEndpointList.length);
        }
        for (ResourceEndpointListItem value : resourceEndpointList) {
            this.resourceEndpointList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of endpoints for the specified signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceEndpointList <p>
     *            A list of endpoints for the specified signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSignalingChannelEndpointResult withResourceEndpointList(
            java.util.Collection<ResourceEndpointListItem> resourceEndpointList) {
        setResourceEndpointList(resourceEndpointList);
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
        if (getResourceEndpointList() != null)
            sb.append("ResourceEndpointList: " + getResourceEndpointList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceEndpointList() == null) ? 0 : getResourceEndpointList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSignalingChannelEndpointResult == false)
            return false;
        GetSignalingChannelEndpointResult other = (GetSignalingChannelEndpointResult) obj;

        if (other.getResourceEndpointList() == null ^ this.getResourceEndpointList() == null)
            return false;
        if (other.getResourceEndpointList() != null
                && other.getResourceEndpointList().equals(this.getResourceEndpointList()) == false)
            return false;
        return true;
    }
}
