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
 * Deletes an existing virtual node.
 * </p>
 * <p>
 * You must delete any virtual services that list a virtual node as a service
 * provider before you can delete the virtual node itself.
 * </p>
 */
public class DeleteVirtualNodeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the service mesh to delete the virtual node in.
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
     * >Working with shared meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String meshOwner;

    /**
     * <p>
     * The name of the virtual node to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualNodeName;

    /**
     * <p>
     * The name of the service mesh to delete the virtual node in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh to delete the virtual node in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh to delete the virtual node in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to delete the virtual node in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to delete the virtual node in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to delete the virtual node in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVirtualNodeRequest withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with shared meshes</a>.
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
     *         >Working with shared meshes</a>.
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
     * >Working with shared meshes</a>.
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
     *            >Working with shared meshes</a>.
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
     *            account ID is not your own, then it's the ID of the account
     *            that shared the mesh with your account. For more information
     *            about mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with shared meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVirtualNodeRequest withMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * <p>
     * The name of the virtual node to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the virtual node to delete.
     *         </p>
     */
    public String getVirtualNodeName() {
        return virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name of the virtual node to delete.
     *            </p>
     */
    public void setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * <p>
     * The name of the virtual node to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualNodeName <p>
     *            The name of the virtual node to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVirtualNodeRequest withVirtualNodeName(String virtualNodeName) {
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
        if (getMeshName() != null)
            sb.append("meshName: " + getMeshName() + ",");
        if (getMeshOwner() != null)
            sb.append("meshOwner: " + getMeshOwner() + ",");
        if (getVirtualNodeName() != null)
            sb.append("virtualNodeName: " + getVirtualNodeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
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

        if (obj instanceof DeleteVirtualNodeRequest == false)
            return false;
        DeleteVirtualNodeRequest other = (DeleteVirtualNodeRequest) obj;

        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null
                && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getVirtualNodeName() == null ^ this.getVirtualNodeName() == null)
            return false;
        if (other.getVirtualNodeName() != null
                && other.getVirtualNodeName().equals(this.getVirtualNodeName()) == false)
            return false;
        return true;
    }
}
