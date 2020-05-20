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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a route that is associated with a virtual router.
 * </p>
 * <p>
 * You can route several different protocols and define a retry policy for a
 * route. Traffic can be routed to one or more virtual nodes.
 * </p>
 * <p>
 * For more information about routes, see <a
 * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html"
 * >Routes</a>.
 * </p>
 */
public class CreateRouteRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 36 letters, numbers, hyphens, and
     * underscores are allowed.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the service mesh to create the route in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For
     * more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String meshOwner;

    /**
     * <p>
     * The name to use for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String routeName;

    /**
     * <p>
     * The route specification to apply.
     * </p>
     */
    private RouteSpec spec;

    /**
     * <p>
     * Optional metadata that you can apply to the route to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     */
    private java.util.List<TagRef> tags;

    /**
     * <p>
     * The name of the virtual router in which to create the route. If the
     * virtual router is in a shared mesh, then you must be the owner of the
     * virtual router resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualRouterName;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 36 letters, numbers, hyphens, and
     * underscores are allowed.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. Up to 36 letters, numbers, hyphens,
     *         and underscores are allowed.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 36 letters, numbers, hyphens, and
     * underscores are allowed.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. Up to 36 letters, numbers,
     *            hyphens, and underscores are allowed.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 36 letters, numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. Up to 36 letters, numbers,
     *            hyphens, and underscores are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to create the route in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh to create the route in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the route in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to create the route in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the route in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to create the route in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For
     * more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return <p>
     *         The AWS IAM account ID of the service mesh owner. If the account
     *         ID is not your own, then the account that you specify must share
     *         the mesh with your account before you can create the resource in
     *         the service mesh. For more information about mesh sharing, see <a
     *         href=
     *         "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *         >Working with Shared Meshes</a>.
     *         </p>
     */
    public String getMeshOwner() {
        return meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For
     * more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param meshOwner <p>
     *            The AWS IAM account ID of the service mesh owner. If the
     *            account ID is not your own, then the account that you specify
     *            must share the mesh with your account before you can create
     *            the resource in the service mesh. For more information about
     *            mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with Shared Meshes</a>.
     *            </p>
     */
    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For
     * more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with Shared Meshes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param meshOwner <p>
     *            The AWS IAM account ID of the service mesh owner. If the
     *            account ID is not your own, then the account that you specify
     *            must share the mesh with your account before you can create
     *            the resource in the service mesh. For more information about
     *            mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with Shared Meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * <p>
     * The name to use for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name to use for the route.
     *         </p>
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * <p>
     * The name to use for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param routeName <p>
     *            The name to use for the route.
     *            </p>
     */
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    /**
     * <p>
     * The name to use for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param routeName <p>
     *            The name to use for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    /**
     * <p>
     * The route specification to apply.
     * </p>
     *
     * @return <p>
     *         The route specification to apply.
     *         </p>
     */
    public RouteSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The route specification to apply.
     * </p>
     *
     * @param spec <p>
     *            The route specification to apply.
     *            </p>
     */
    public void setSpec(RouteSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The route specification to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The route specification to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withSpec(RouteSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the route to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @return <p>
     *         Optional metadata that you can apply to the route to assist with
     *         categorization and organization. Each tag consists of a key and
     *         an optional value, both of which you define. Tag keys can have a
     *         maximum character length of 128 characters, and tag values can
     *         have a maximum length of 256 characters.
     *         </p>
     */
    public java.util.List<TagRef> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the route to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @param tags <p>
     *            Optional metadata that you can apply to the route to assist
     *            with categorization and organization. Each tag consists of a
     *            key and an optional value, both of which you define. Tag keys
     *            can have a maximum character length of 128 characters, and tag
     *            values can have a maximum length of 256 characters.
     *            </p>
     */
    public void setTags(java.util.Collection<TagRef> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagRef>(tags);
    }

    /**
     * <p>
     * Optional metadata that you can apply to the route to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you can apply to the route to assist
     *            with categorization and organization. Each tag consists of a
     *            key and an optional value, both of which you define. Tag keys
     *            can have a maximum character length of 128 characters, and tag
     *            values can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withTags(TagRef... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<TagRef>(tags.length);
        }
        for (TagRef value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the route to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you can apply to the route to assist
     *            with categorization and organization. Each tag consists of a
     *            key and an optional value, both of which you define. Tag keys
     *            can have a maximum character length of 128 characters, and tag
     *            values can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withTags(java.util.Collection<TagRef> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the virtual router in which to create the route. If the
     * virtual router is in a shared mesh, then you must be the owner of the
     * virtual router resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the virtual router in which to create the route. If
     *         the virtual router is in a shared mesh, then you must be the
     *         owner of the virtual router resource.
     *         </p>
     */
    public String getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router in which to create the route. If the
     * virtual router is in a shared mesh, then you must be the owner of the
     * virtual router resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The name of the virtual router in which to create the route.
     *            If the virtual router is in a shared mesh, then you must be
     *            the owner of the virtual router resource.
     *            </p>
     */
    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router in which to create the route. If the
     * virtual router is in a shared mesh, then you must be the owner of the
     * virtual router resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The name of the virtual router in which to create the route.
     *            If the virtual router is in a shared mesh, then you must be
     *            the owner of the virtual router resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRouteRequest withVirtualRouterName(String virtualRouterName) {
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
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getMeshName() != null)
            sb.append("meshName: " + getMeshName() + ",");
        if (getMeshOwner() != null)
            sb.append("meshOwner: " + getMeshOwner() + ",");
        if (getRouteName() != null)
            sb.append("routeName: " + getRouteName() + ",");
        if (getSpec() != null)
            sb.append("spec: " + getSpec() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getVirtualRouterName() != null)
            sb.append("virtualRouterName: " + getVirtualRouterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getRouteName() == null) ? 0 : getRouteName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreateRouteRequest == false)
            return false;
        CreateRouteRequest other = (CreateRouteRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null
                && other.getMeshOwner().equals(this.getMeshOwner()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null
                && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }
}
