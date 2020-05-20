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
 * An object that represents a virtual node returned by a list operation.
 * </p>
 */
public class VirtualNodeRef implements Serializable {
    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual node.
     * </p>
     */
    private String arn;

    /**
     * The new value for the createdAt property for this object.
     */
    private java.util.Date createdAt;

    /**
     * The new value for the lastUpdatedAt property for this object.
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
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
     * The AWS IAM account ID of the resource owner. If the account ID is not
     * your own, then it's the ID of the mesh owner or of another account that
     * the mesh is shared with. For more information about mesh sharing, see <a
     * href
     * ="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">
     * Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String resourceOwner;

    /**
     * The new value for the version property for this object.
     */
    private Long version;

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualNodeName;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual node.
     * </p>
     *
     * @return <p>
     *         The full Amazon Resource Name (ARN) for the virtual node.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual node.
     * </p>
     *
     * @param arn <p>
     *            The full Amazon Resource Name (ARN) for the virtual node.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The full Amazon Resource Name (ARN) for the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * Returns the value of the createdAt property for this object.
     *
     * @return The value of the createdAt property for this object.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of createdAt
     *
     * @param createdAt The new value for the createdAt property for this
     *            object.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets the value of the createdAt property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt The new value for the createdAt property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns the value of the lastUpdatedAt property for this object.
     *
     * @return The value of the lastUpdatedAt property for this object.
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * Sets the value of lastUpdatedAt
     *
     * @param lastUpdatedAt The new value for the lastUpdatedAt property for
     *            this object.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * Sets the value of the lastUpdatedAt property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt The new value for the lastUpdatedAt property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh that the virtual node resides in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual node resides in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual node resides in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual node resides in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return <p>
     *         The AWS IAM account ID of the service mesh owner. If the account
     *         ID is not your own, then it's the ID of the account that shared
     *         the mesh with your account. For more information about mesh
     *         sharing, see <a href=
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
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param meshOwner <p>
     *            The AWS IAM account ID of the service mesh owner. If the
     *            account ID is not your own, then it's the ID of the account
     *            that shared the mesh with your account. For more information
     *            about mesh sharing, see <a href=
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
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
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
     *            account ID is not your own, then it's the ID of the account
     *            that shared the mesh with your account. For more information
     *            about mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with Shared Meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not
     * your own, then it's the ID of the mesh owner or of another account that
     * the mesh is shared with. For more information about mesh sharing, see <a
     * href
     * ="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">
     * Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return <p>
     *         The AWS IAM account ID of the resource owner. If the account ID
     *         is not your own, then it's the ID of the mesh owner or of another
     *         account that the mesh is shared with. For more information about
     *         mesh sharing, see <a href=
     *         "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *         >Working with Shared Meshes</a>.
     *         </p>
     */
    public String getResourceOwner() {
        return resourceOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not
     * your own, then it's the ID of the mesh owner or of another account that
     * the mesh is shared with. For more information about mesh sharing, see <a
     * href
     * ="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">
     * Working with Shared Meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param resourceOwner <p>
     *            The AWS IAM account ID of the resource owner. If the account
     *            ID is not your own, then it's the ID of the mesh owner or of
     *            another account that the mesh is shared with. For more
     *            information about mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with Shared Meshes</a>.
     *            </p>
     */
    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not
     * your own, then it's the ID of the mesh owner or of another account that
     * the mesh is shared with. For more information about mesh sharing, see <a
     * href
     * ="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">
     * Working with Shared Meshes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param resourceOwner <p>
     *            The AWS IAM account ID of the resource owner. If the account
     *            ID is not your own, then it's the ID of the mesh owner or of
     *            another account that the mesh is shared with. For more
     *            information about mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with Shared Meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * Returns the value of the version property for this object.
     *
     * @return The value of the version property for this object.
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of version
     *
     * @param version The new value for the version property for this object.
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * Sets the value of the version property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version The new value for the version property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the virtual node.
     *         </p>
     */
    public String getVirtualNodeName() {
        return virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name of the virtual node.
     *            </p>
     */
    public void setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name of the virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualNodeRef withVirtualNodeName(String virtualNodeName) {
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getMeshName() != null)
            sb.append("meshName: " + getMeshName() + ",");
        if (getMeshOwner() != null)
            sb.append("meshOwner: " + getMeshOwner() + ",");
        if (getResourceOwner() != null)
            sb.append("resourceOwner: " + getResourceOwner() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getVirtualNodeName() != null)
            sb.append("virtualNodeName: " + getVirtualNodeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
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

        if (obj instanceof VirtualNodeRef == false)
            return false;
        VirtualNodeRef other = (VirtualNodeRef) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
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
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null
                && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVirtualNodeName() == null ^ this.getVirtualNodeName() == null)
            return false;
        if (other.getVirtualNodeName() != null
                && other.getVirtualNodeName().equals(this.getVirtualNodeName()) == false)
            return false;
        return true;
    }
}
