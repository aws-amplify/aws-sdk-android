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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a route returned by a describe operation.
 * </p>
 */
public class RouteData implements Serializable {
    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     */
    private ResourceMetadata metadata;

    /**
     * <p>
     * The name of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String routeName;

    /**
     * <p>
     * The specifications of the route.
     * </p>
     */
    private RouteSpec spec;

    /**
     * <p>
     * The status of the route.
     * </p>
     */
    private RouteStatus status;

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualRouterName;

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh that the route resides in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the route resides in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the route resides in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteData withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     *
     * @return <p>
     *         The associated metadata for the route.
     *         </p>
     */
    public ResourceMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     *
     * @param metadata <p>
     *            The associated metadata for the route.
     *            </p>
     */
    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The associated metadata for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteData withMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the route.
     *         </p>
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param routeName <p>
     *            The name of the route.
     *            </p>
     */
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param routeName <p>
     *            The name of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteData withRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    /**
     * <p>
     * The specifications of the route.
     * </p>
     *
     * @return <p>
     *         The specifications of the route.
     *         </p>
     */
    public RouteSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The specifications of the route.
     * </p>
     *
     * @param spec <p>
     *            The specifications of the route.
     *            </p>
     */
    public void setSpec(RouteSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The specifications of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteData withSpec(RouteSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>
     * The status of the route.
     * </p>
     *
     * @return <p>
     *         The status of the route.
     *         </p>
     */
    public RouteStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the route.
     * </p>
     *
     * @param status <p>
     *            The status of the route.
     *            </p>
     */
    public void setStatus(RouteStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteData withStatus(RouteStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The virtual router that the route is associated with.
     *         </p>
     */
    public String getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The virtual router that the route is associated with.
     *            </p>
     */
    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The virtual router that the route is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteData withVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
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
        if (getMeshName() != null)
            sb.append("meshName: " + getMeshName() + ",");
        if (getMetadata() != null)
            sb.append("metadata: " + getMetadata() + ",");
        if (getRouteName() != null)
            sb.append("routeName: " + getRouteName() + ",");
        if (getSpec() != null)
            sb.append("spec: " + getSpec() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getVirtualRouterName() != null)
            sb.append("virtualRouterName: " + getVirtualRouterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getRouteName() == null) ? 0 : getRouteName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualRouterName() == null) ? 0 : getVirtualRouterName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteData == false)
            return false;
        RouteData other = (RouteData) obj;

        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getRouteName() == null ^ this.getRouteName() == null)
            return false;
        if (other.getRouteName() != null
                && other.getRouteName().equals(this.getRouteName()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null
                && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }
}
