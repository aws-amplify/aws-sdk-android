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
 * Updates an existing service mesh.
 * </p>
 */
public class UpdateMeshRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the service mesh to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The service mesh specification to apply.
     * </p>
     */
    private MeshSpec spec;

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
    public UpdateMeshRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh to update.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to update.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMeshRequest withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The service mesh specification to apply.
     * </p>
     *
     * @return <p>
     *         The service mesh specification to apply.
     *         </p>
     */
    public MeshSpec getSpec() {
        return spec;
    }

    /**
     * <p>
     * The service mesh specification to apply.
     * </p>
     *
     * @param spec <p>
     *            The service mesh specification to apply.
     *            </p>
     */
    public void setSpec(MeshSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The service mesh specification to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spec <p>
     *            The service mesh specification to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMeshRequest withSpec(MeshSpec spec) {
        this.spec = spec;
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
        if (getSpec() != null)
            sb.append("spec: " + getSpec());
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
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMeshRequest == false)
            return false;
        UpdateMeshRequest other = (UpdateMeshRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        return true;
    }
}
