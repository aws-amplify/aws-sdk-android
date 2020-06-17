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
 * An object that represents metadata for a resource.
 * </p>
 */
public class ResourceMetadata implements Serializable {
    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last
     * updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

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
     * The AWS IAM account ID of the resource owner. If the account ID is not
     * your own, then it's the ID of the mesh owner or of another account that
     * the mesh is shared with. For more information about mesh sharing, see <a
     * href
     * ="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">
     * Working with shared meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String resourceOwner;

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     */
    private String uid;

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this
     * version is incremented each time that they're updated.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     *
     * @return <p>
     *         The full Amazon Resource Name (ARN) for the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     *
     * @param arn <p>
     *            The full Amazon Resource Name (ARN) for the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The full Amazon Resource Name (ARN) for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceMetadata withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     *
     * @return <p>
     *         The Unix epoch timestamp in seconds for when the resource was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix epoch timestamp in seconds for when the resource was
     *            created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix epoch timestamp in seconds for when the resource was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceMetadata withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last
     * updated.
     * </p>
     *
     * @return <p>
     *         The Unix epoch timestamp in seconds for when the resource was
     *         last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last
     * updated.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The Unix epoch timestamp in seconds for when the resource was
     *            last updated.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The Unix epoch timestamp in seconds for when the resource was
     *            last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceMetadata withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
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
    public ResourceMetadata withMeshOwner(String meshOwner) {
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
     * Working with shared meshes</a>.
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
     *         >Working with shared meshes</a>.
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
     * Working with shared meshes</a>.
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
     *            >Working with shared meshes</a>.
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
     * Working with shared meshes</a>.
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
     *            >Working with shared meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceMetadata withResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the resource.
     *         </p>
     */
    public String getUid() {
        return uid;
    }

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     *
     * @param uid <p>
     *            The unique identifier for the resource.
     *            </p>
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The unique identifier for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uid <p>
     *            The unique identifier for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this
     * version is incremented each time that they're updated.
     * </p>
     *
     * @return <p>
     *         The version of the resource. Resources are created at version 1,
     *         and this version is incremented each time that they're updated.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this
     * version is incremented each time that they're updated.
     * </p>
     *
     * @param version <p>
     *            The version of the resource. Resources are created at version
     *            1, and this version is incremented each time that they're
     *            updated.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this
     * version is incremented each time that they're updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the resource. Resources are created at version
     *            1, and this version is incremented each time that they're
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceMetadata withVersion(Long version) {
        this.version = version;
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
        if (getMeshOwner() != null)
            sb.append("meshOwner: " + getMeshOwner() + ",");
        if (getResourceOwner() != null)
            sb.append("resourceOwner: " + getResourceOwner() + ",");
        if (getUid() != null)
            sb.append("uid: " + getUid() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion());
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
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceMetadata == false)
            return false;
        ResourceMetadata other = (ResourceMetadata) obj;

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
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
