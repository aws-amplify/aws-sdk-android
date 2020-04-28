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
package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Creates or updates the lifecycle policy for the specified repository. For more information, see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html">Lifecycle Policy Template</a>.</p>
 */
public class PutLifecyclePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The name of the repository to receive the policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The JSON repository policy text to apply to the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     */
    private String lifecyclePolicyText;

    /**
     * <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutLifecyclePolicyRequest withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The name of the repository to receive the policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The name of the repository to receive the policy.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The name of the repository to receive the policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository to receive the policy.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The name of the repository to receive the policy.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The name of the repository to receive the policy.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutLifecyclePolicyRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The JSON repository policy text to apply to the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @return <p>The JSON repository policy text to apply to the repository.</p>
     */
    public String getLifecyclePolicyText() {
        return lifecyclePolicyText;
    }

    /**
     * <p>The JSON repository policy text to apply to the repository.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @param lifecyclePolicyText <p>The JSON repository policy text to apply to the repository.</p>
     */
    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>The JSON repository policy text to apply to the repository.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @param lifecyclePolicyText <p>The JSON repository policy text to apply to the repository.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutLifecyclePolicyRequest withLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegistryId() != null) sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null) sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getLifecyclePolicyText() != null) sb.append("lifecyclePolicyText: " + getLifecyclePolicyText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyText() == null) ? 0 : getLifecyclePolicyText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutLifecyclePolicyRequest == false) return false;
        PutLifecyclePolicyRequest other = (PutLifecyclePolicyRequest)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getLifecyclePolicyText() == null ^ this.getLifecyclePolicyText() == null) return false;
        if (other.getLifecyclePolicyText() != null && other.getLifecyclePolicyText().equals(this.getLifecyclePolicyText()) == false) return false;
        return true;
    }
}
