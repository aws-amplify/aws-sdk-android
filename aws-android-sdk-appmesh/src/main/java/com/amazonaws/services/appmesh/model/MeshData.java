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
 * An object that represents a service mesh returned by a describe operation.
 * </p>
 */
public class MeshData implements Serializable {
    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     */
    private ResourceMetadata metadata;

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     */
    private MeshSpec spec;

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     */
    private MeshStatus status;

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeshData withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     *
     * @return <p>
     *         The associated metadata for the service mesh.
     *         </p>
     */
    public ResourceMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     *
     * @param metadata <p>
     *            The associated metadata for the service mesh.
     *            </p>
     */
    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The associated metadata for the service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeshData withMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     *
     * @return <p>
     *         The associated specification for the service mesh.
     *         </p>
     */
    public MeshSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     *
     * @param spec <p>
     *            The associated specification for the service mesh.
     *            </p>
     */
    public void setSpec(MeshSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The associated specification for the service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeshData withSpec(MeshSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     *
     * @return <p>
     *         The status of the service mesh.
     *         </p>
     */
    public MeshStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     *
     * @param status <p>
     *            The status of the service mesh.
     *            </p>
     */
    public void setStatus(MeshStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeshData withStatus(MeshStatus status) {
        this.status = status;
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
        if (getSpec() != null)
            sb.append("spec: " + getSpec() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeshData == false)
            return false;
        MeshData other = (MeshData) obj;

        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
