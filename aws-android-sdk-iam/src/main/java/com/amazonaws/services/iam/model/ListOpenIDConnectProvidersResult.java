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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>ListOpenIDConnectProviders</a>
 * request.
 * </p>
 */
public class ListOpenIDConnectProvidersResult implements Serializable {
    /**
     * <p>
     * The list of IAM OIDC provider resource objects defined in the AWS
     * account.
     * </p>
     */
    private java.util.List<OpenIDConnectProviderListEntry> openIDConnectProviderList;

    /**
     * <p>
     * The list of IAM OIDC provider resource objects defined in the AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The list of IAM OIDC provider resource objects defined in the AWS
     *         account.
     *         </p>
     */
    public java.util.List<OpenIDConnectProviderListEntry> getOpenIDConnectProviderList() {
        return openIDConnectProviderList;
    }

    /**
     * <p>
     * The list of IAM OIDC provider resource objects defined in the AWS
     * account.
     * </p>
     *
     * @param openIDConnectProviderList <p>
     *            The list of IAM OIDC provider resource objects defined in the
     *            AWS account.
     *            </p>
     */
    public void setOpenIDConnectProviderList(
            java.util.Collection<OpenIDConnectProviderListEntry> openIDConnectProviderList) {
        if (openIDConnectProviderList == null) {
            this.openIDConnectProviderList = null;
            return;
        }

        this.openIDConnectProviderList = new java.util.ArrayList<OpenIDConnectProviderListEntry>(
                openIDConnectProviderList);
    }

    /**
     * <p>
     * The list of IAM OIDC provider resource objects defined in the AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openIDConnectProviderList <p>
     *            The list of IAM OIDC provider resource objects defined in the
     *            AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOpenIDConnectProvidersResult withOpenIDConnectProviderList(
            OpenIDConnectProviderListEntry... openIDConnectProviderList) {
        if (getOpenIDConnectProviderList() == null) {
            this.openIDConnectProviderList = new java.util.ArrayList<OpenIDConnectProviderListEntry>(
                    openIDConnectProviderList.length);
        }
        for (OpenIDConnectProviderListEntry value : openIDConnectProviderList) {
            this.openIDConnectProviderList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of IAM OIDC provider resource objects defined in the AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openIDConnectProviderList <p>
     *            The list of IAM OIDC provider resource objects defined in the
     *            AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOpenIDConnectProvidersResult withOpenIDConnectProviderList(
            java.util.Collection<OpenIDConnectProviderListEntry> openIDConnectProviderList) {
        setOpenIDConnectProviderList(openIDConnectProviderList);
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
        if (getOpenIDConnectProviderList() != null)
            sb.append("OpenIDConnectProviderList: " + getOpenIDConnectProviderList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOpenIDConnectProviderList() == null) ? 0 : getOpenIDConnectProviderList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOpenIDConnectProvidersResult == false)
            return false;
        ListOpenIDConnectProvidersResult other = (ListOpenIDConnectProvidersResult) obj;

        if (other.getOpenIDConnectProviderList() == null
                ^ this.getOpenIDConnectProviderList() == null)
            return false;
        if (other.getOpenIDConnectProviderList() != null
                && other.getOpenIDConnectProviderList().equals(this.getOpenIDConnectProviderList()) == false)
            return false;
        return true;
    }
}
