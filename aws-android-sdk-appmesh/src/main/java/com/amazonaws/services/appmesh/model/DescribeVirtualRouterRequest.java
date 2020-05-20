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
 * Describes an existing virtual router.
 * </p>
 */
public class DescribeVirtualRouterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the service mesh that the virtual router resides in.
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
     * The name of the virtual router to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String virtualRouterName;

    /**
     * <p>
     * The name of the service mesh that the virtual router resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh that the virtual router resides in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual router resides in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual router resides
     *            in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual router resides in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh that the virtual router resides
     *            in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVirtualRouterRequest withMeshName(String meshName) {
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
    public DescribeVirtualRouterRequest withMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * <p>
     * The name of the virtual router to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the virtual router to describe.
     *         </p>
     */
    public String getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The name of the virtual router to describe.
     *            </p>
     */
    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The name of the virtual router to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param virtualRouterName <p>
     *            The name of the virtual router to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVirtualRouterRequest withVirtualRouterName(String virtualRouterName) {
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
        if (getMeshOwner() != null)
            sb.append("meshOwner: " + getMeshOwner() + ",");
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
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
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

        if (obj instanceof DescribeVirtualRouterRequest == false)
            return false;
        DescribeVirtualRouterRequest other = (DescribeVirtualRouterRequest) obj;

        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null
                && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null
                && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }
}
