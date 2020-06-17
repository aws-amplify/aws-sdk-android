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
 * Creates a virtual node within a service mesh.
 * </p>
 * <p>
 * A virtual node acts as a logical pointer to a particular task group, such as
 * an Amazon ECS service or a Kubernetes deployment. When you create a virtual
 * node, you can specify the service discovery information for your task group,
 * and whether the proxy running in a task group will communicate with other
 * proxies using Transport Layer Security (TLS).
 * </p>
 * <p>
 * You define a <code>listener</code> for any inbound traffic that your virtual
 * node expects. Any virtual service that your virtual node expects to
 * communicate to is specified as a <code>backend</code>.
 * </p>
 * <p>
 * The response metadata for your new virtual node contains the <code>arn</code>
 * that is associated with the virtual node. Set this value (either the full ARN
 * or the truncated resource name: for example,
 * <code>mesh/default/virtualNode/simpleapp</code>) as the
 * <code>APPMESH_VIRTUAL_NODE_NAME</code> environment variable for your task
 * group's Envoy proxy container in your task definition or pod spec. This is
 * then mapped to the <code>node.id</code> and <code>node.cluster</code> Envoy
 * parameters.
 * </p>
 * <note>
 * <p>
 * If you require your Envoy stats or tracing to use a different name, you can
 * override the <code>node.cluster</code> value that is set by
 * <code>APPMESH_VIRTUAL_NODE_NAME</code> with the
 * <code>APPMESH_VIRTUAL_NODE_CLUSTER</code> environment variable.
 * </p>
 * </note>
 * <p>
 * For more information about virtual nodes, see <a href=
 * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html"
 * >Virtual nodes</a>.
 * </p>
 */
public class CreateVirtualNodeRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the service mesh to create the virtual node in.
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
     * >Working with shared meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String meshOwner;

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     */
    private VirtualNodeSpec spec;

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     */
    private java.util.List<TagRef> tags;

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualNodeName;

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
    public CreateVirtualNodeRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh to create the virtual node in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to create the virtual node in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to create the virtual node in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualNodeRequest withMeshName(String meshName) {
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
     * >Working with shared meshes</a>.
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
     *         >Working with shared meshes</a>.
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
     * >Working with shared meshes</a>.
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
     *            >Working with shared meshes</a>.
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
     * >Working with shared meshes</a>.
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
     *            >Working with shared meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualNodeRequest withMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     *
     * @return <p>
     *         The virtual node specification to apply.
     *         </p>
     */
    public VirtualNodeSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     *
     * @param spec <p>
     *            The virtual node specification to apply.
     *            </p>
     */
    public void setSpec(VirtualNodeSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The virtual node specification to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualNodeRequest withSpec(VirtualNodeSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @return <p>
     *         Optional metadata that you can apply to the virtual node to
     *         assist with categorization and organization. Each tag consists of
     *         a key and an optional value, both of which you define. Tag keys
     *         can have a maximum character length of 128 characters, and tag
     *         values can have a maximum length of 256 characters.
     *         </p>
     */
    public java.util.List<TagRef> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with
     * categorization and organization. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @param tags <p>
     *            Optional metadata that you can apply to the virtual node to
     *            assist with categorization and organization. Each tag consists
     *            of a key and an optional value, both of which you define. Tag
     *            keys can have a maximum character length of 128 characters,
     *            and tag values can have a maximum length of 256 characters.
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
     * Optional metadata that you can apply to the virtual node to assist with
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
     *            Optional metadata that you can apply to the virtual node to
     *            assist with categorization and organization. Each tag consists
     *            of a key and an optional value, both of which you define. Tag
     *            keys can have a maximum character length of 128 characters,
     *            and tag values can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualNodeRequest withTags(TagRef... tags) {
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
     * Optional metadata that you can apply to the virtual node to assist with
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
     *            Optional metadata that you can apply to the virtual node to
     *            assist with categorization and organization. Each tag consists
     *            of a key and an optional value, both of which you define. Tag
     *            keys can have a maximum character length of 128 characters,
     *            and tag values can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualNodeRequest withTags(java.util.Collection<TagRef> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name to use for the virtual node.
     *         </p>
     */
    public String getVirtualNodeName() {
        return virtualNodeName;
    }

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name to use for the virtual node.
     *            </p>
     */
    public void setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name to use for the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualNodeRequest withVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
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
        if (getSpec() != null)
            sb.append("spec: " + getSpec() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getVirtualNodeName() != null)
            sb.append("virtualNodeName: " + getVirtualNodeName());
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
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualNodeName() == null) ? 0 : getVirtualNodeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualNodeRequest == false)
            return false;
        CreateVirtualNodeRequest other = (CreateVirtualNodeRequest) obj;

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
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVirtualNodeName() == null ^ this.getVirtualNodeName() == null)
            return false;
        if (other.getVirtualNodeName() != null
                && other.getVirtualNodeName().equals(this.getVirtualNodeName()) == false)
            return false;
        return true;
    }
}
