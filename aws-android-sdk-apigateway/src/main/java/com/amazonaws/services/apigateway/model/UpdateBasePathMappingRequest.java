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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes information about the <a>BasePathMapping</a> resource.
 * </p>
 */
public class UpdateBasePathMappingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * [Required] The base path of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     * <p>
     * To specify an empty base path, set this parameter to
     * <code>'(none)'</code>.
     * </p>
     */
    private String basePath;

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     *
     * @return <p>
     *         [Required] The domain name of the <a>BasePathMapping</a> resource
     *         to change.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     *
     * @param domainName <p>
     *            [Required] The domain name of the <a>BasePathMapping</a>
     *            resource to change.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * [Required] The domain name of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            [Required] The domain name of the <a>BasePathMapping</a>
     *            resource to change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBasePathMappingRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * [Required] The base path of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     * <p>
     * To specify an empty base path, set this parameter to
     * <code>'(none)'</code>.
     * </p>
     *
     * @return <p>
     *         [Required] The base path of the <a>BasePathMapping</a> resource
     *         to change.
     *         </p>
     *         <p>
     *         To specify an empty base path, set this parameter to
     *         <code>'(none)'</code>.
     *         </p>
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * <p>
     * [Required] The base path of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     * <p>
     * To specify an empty base path, set this parameter to
     * <code>'(none)'</code>.
     * </p>
     *
     * @param basePath <p>
     *            [Required] The base path of the <a>BasePathMapping</a>
     *            resource to change.
     *            </p>
     *            <p>
     *            To specify an empty base path, set this parameter to
     *            <code>'(none)'</code>.
     *            </p>
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * [Required] The base path of the <a>BasePathMapping</a> resource to
     * change.
     * </p>
     * <p>
     * To specify an empty base path, set this parameter to
     * <code>'(none)'</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param basePath <p>
     *            [Required] The base path of the <a>BasePathMapping</a>
     *            resource to change.
     *            </p>
     *            <p>
     *            To specify an empty base path, set this parameter to
     *            <code>'(none)'</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBasePathMappingRequest withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     *
     * @return <p>
     *         A list of update operations to be applied to the specified
     *         resource and in the order specified in this list.
     *         </p>
     */
    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     *
     * @param patchOperations <p>
     *            A list of update operations to be applied to the specified
     *            resource and in the order specified in this list.
     *            </p>
     */
    public void setPatchOperations(java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations);
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patchOperations <p>
     *            A list of update operations to be applied to the specified
     *            resource and in the order specified in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBasePathMappingRequest withPatchOperations(PatchOperation... patchOperations) {
        if (getPatchOperations() == null) {
            this.patchOperations = new java.util.ArrayList<PatchOperation>(patchOperations.length);
        }
        for (PatchOperation value : patchOperations) {
            this.patchOperations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of update operations to be applied to the specified resource and
     * in the order specified in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param patchOperations <p>
     *            A list of update operations to be applied to the specified
     *            resource and in the order specified in this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBasePathMappingRequest withPatchOperations(
            java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
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
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getBasePath() != null)
            sb.append("basePath: " + getBasePath() + ",");
        if (getPatchOperations() != null)
            sb.append("patchOperations: " + getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        hashCode = prime * hashCode
                + ((getPatchOperations() == null) ? 0 : getPatchOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBasePathMappingRequest == false)
            return false;
        UpdateBasePathMappingRequest other = (UpdateBasePathMappingRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getBasePath() == null ^ this.getBasePath() == null)
            return false;
        if (other.getBasePath() != null && other.getBasePath().equals(this.getBasePath()) == false)
            return false;
        if (other.getPatchOperations() == null ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null
                && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }
}
