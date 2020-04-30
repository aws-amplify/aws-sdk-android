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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

public class ListRegistriesResult implements Serializable {
    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of registry summaries.
     * </p>
     */
    private java.util.List<RegistrySummary> registries;

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @return <p>
     *         The token that specifies the next page of results to return. To
     *         request the first page, leave NextToken empty. The token will
     *         expire in 24 hours, and cannot be shared with other accounts.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegistriesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of registry summaries.
     * </p>
     *
     * @return <p>
     *         An array of registry summaries.
     *         </p>
     */
    public java.util.List<RegistrySummary> getRegistries() {
        return registries;
    }

    /**
     * <p>
     * An array of registry summaries.
     * </p>
     *
     * @param registries <p>
     *            An array of registry summaries.
     *            </p>
     */
    public void setRegistries(java.util.Collection<RegistrySummary> registries) {
        if (registries == null) {
            this.registries = null;
            return;
        }

        this.registries = new java.util.ArrayList<RegistrySummary>(registries);
    }

    /**
     * <p>
     * An array of registry summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registries <p>
     *            An array of registry summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegistriesResult withRegistries(RegistrySummary... registries) {
        if (getRegistries() == null) {
            this.registries = new java.util.ArrayList<RegistrySummary>(registries.length);
        }
        for (RegistrySummary value : registries) {
            this.registries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of registry summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registries <p>
     *            An array of registry summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegistriesResult withRegistries(java.util.Collection<RegistrySummary> registries) {
        setRegistries(registries);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getRegistries() != null)
            sb.append("Registries: " + getRegistries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegistries() == null) ? 0 : getRegistries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegistriesResult == false)
            return false;
        ListRegistriesResult other = (ListRegistriesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegistries() == null ^ this.getRegistries() == null)
            return false;
        if (other.getRegistries() != null
                && other.getRegistries().equals(this.getRegistries()) == false)
            return false;
        return true;
    }
}
