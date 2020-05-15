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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves an authorization token. An authorization token represents your IAM
 * authentication credentials and can be used to access any Amazon ECR registry
 * that your IAM principal has access to. The authorization token is valid for
 * 12 hours.
 * </p>
 * <p>
 * The <code>authorizationToken</code> returned is a base64 encoded string that
 * can be decoded and used in a <code>docker login</code> command to
 * authenticate to a registry. The AWS CLI offers an
 * <code>get-login-password</code> command that simplifies the login process.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html#registry_auth"
 * >Registry Authentication</a> in the <i>Amazon Elastic Container Registry User
 * Guide</i>.
 * </p>
 */
public class GetAuthorizationTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for
     * which to get AuthorizationData objects. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     */
    private java.util.List<String> registryIds;

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for
     * which to get AuthorizationData objects. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     *
     * @return <p>
     *         A list of AWS account IDs that are associated with the registries
     *         for which to get AuthorizationData objects. If you do not specify
     *         a registry, the default registry is assumed.
     *         </p>
     */
    public java.util.List<String> getRegistryIds() {
        return registryIds;
    }

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for
     * which to get AuthorizationData objects. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     *
     * @param registryIds <p>
     *            A list of AWS account IDs that are associated with the
     *            registries for which to get AuthorizationData objects. If you
     *            do not specify a registry, the default registry is assumed.
     *            </p>
     */
    public void setRegistryIds(java.util.Collection<String> registryIds) {
        if (registryIds == null) {
            this.registryIds = null;
            return;
        }

        this.registryIds = new java.util.ArrayList<String>(registryIds);
    }

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for
     * which to get AuthorizationData objects. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryIds <p>
     *            A list of AWS account IDs that are associated with the
     *            registries for which to get AuthorizationData objects. If you
     *            do not specify a registry, the default registry is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizationTokenRequest withRegistryIds(String... registryIds) {
        if (getRegistryIds() == null) {
            this.registryIds = new java.util.ArrayList<String>(registryIds.length);
        }
        for (String value : registryIds) {
            this.registryIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for
     * which to get AuthorizationData objects. If you do not specify a registry,
     * the default registry is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryIds <p>
     *            A list of AWS account IDs that are associated with the
     *            registries for which to get AuthorizationData objects. If you
     *            do not specify a registry, the default registry is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizationTokenRequest withRegistryIds(java.util.Collection<String> registryIds) {
        setRegistryIds(registryIds);
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
        if (getRegistryIds() != null)
            sb.append("registryIds: " + getRegistryIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegistryIds() == null) ? 0 : getRegistryIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizationTokenRequest == false)
            return false;
        GetAuthorizationTokenRequest other = (GetAuthorizationTokenRequest) obj;

        if (other.getRegistryIds() == null ^ this.getRegistryIds() == null)
            return false;
        if (other.getRegistryIds() != null
                && other.getRegistryIds().equals(this.getRegistryIds()) == false)
            return false;
        return true;
    }
}
