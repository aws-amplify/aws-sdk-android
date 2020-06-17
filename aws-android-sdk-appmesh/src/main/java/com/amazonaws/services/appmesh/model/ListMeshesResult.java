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
 * 
 */
public class ListMeshesResult implements Serializable {
    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     */
    private java.util.List<MeshRef> meshes;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     *
     * @return <p>
     *         The list of existing service meshes.
     *         </p>
     */
    public java.util.List<MeshRef> getMeshes() {
        return meshes;
    }

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     *
     * @param meshes <p>
     *            The list of existing service meshes.
     *            </p>
     */
    public void setMeshes(java.util.Collection<MeshRef> meshes) {
        if (meshes == null) {
            this.meshes = null;
            return;
        }

        this.meshes = new java.util.ArrayList<MeshRef>(meshes);
    }

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meshes <p>
     *            The list of existing service meshes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeshesResult withMeshes(MeshRef... meshes) {
        if (getMeshes() == null) {
            this.meshes = new java.util.ArrayList<MeshRef>(meshes.length);
        }
        for (MeshRef value : meshes) {
            this.meshes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing service meshes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meshes <p>
     *            The list of existing service meshes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeshesResult withMeshes(java.util.Collection<MeshRef> meshes) {
        setMeshes(meshes);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListMeshes</code> request. When the results of a
     *         <code>ListMeshes</code> request exceed <code>limit</code>, you
     *         can use this value to retrieve the next page of results. This
     *         value is <code>null</code> when there are no more results to
     *         return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListMeshes</code> request. When the results of a
     *            <code>ListMeshes</code> request exceed <code>limit</code>, you
     *            can use this value to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListMeshes</code> request. When the results of a
     * <code>ListMeshes</code> request exceed <code>limit</code>, you can use
     * this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListMeshes</code> request. When the results of a
     *            <code>ListMeshes</code> request exceed <code>limit</code>, you
     *            can use this value to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeshesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getMeshes() != null)
            sb.append("meshes: " + getMeshes() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshes() == null) ? 0 : getMeshes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMeshesResult == false)
            return false;
        ListMeshesResult other = (ListMeshesResult) obj;

        if (other.getMeshes() == null ^ this.getMeshes() == null)
            return false;
        if (other.getMeshes() != null && other.getMeshes().equals(this.getMeshes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
