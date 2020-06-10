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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the IAM SAML identity provider used for federated authentication.
 * </p>
 */
public class FederatedAuthentication implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     */
    private String samlProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     *         </p>
     */
    public String getSamlProviderArn() {
        return samlProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     *
     * @param samlProviderArn <p>
     *            The Amazon Resource Name (ARN) of the IAM SAML identity
     *            provider.
     *            </p>
     */
    public void setSamlProviderArn(String samlProviderArn) {
        this.samlProviderArn = samlProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param samlProviderArn <p>
     *            The Amazon Resource Name (ARN) of the IAM SAML identity
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FederatedAuthentication withSamlProviderArn(String samlProviderArn) {
        this.samlProviderArn = samlProviderArn;
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
        if (getSamlProviderArn() != null)
            sb.append("SamlProviderArn: " + getSamlProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSamlProviderArn() == null) ? 0 : getSamlProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedAuthentication == false)
            return false;
        FederatedAuthentication other = (FederatedAuthentication) obj;

        if (other.getSamlProviderArn() == null ^ this.getSamlProviderArn() == null)
            return false;
        if (other.getSamlProviderArn() != null
                && other.getSamlProviderArn().equals(this.getSamlProviderArn()) == false)
            return false;
        return true;
    }
}
