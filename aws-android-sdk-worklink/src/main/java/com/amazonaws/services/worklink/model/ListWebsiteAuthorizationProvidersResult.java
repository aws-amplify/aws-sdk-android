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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

public class ListWebsiteAuthorizationProvidersResult implements Serializable {
    /**
     * <p>
     * The website authorization providers.
     * </p>
     */
    private java.util.List<WebsiteAuthorizationProviderSummary> websiteAuthorizationProviders;

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this
     * operation. If this value is null, it retrieves the first page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The website authorization providers.
     * </p>
     *
     * @return <p>
     *         The website authorization providers.
     *         </p>
     */
    public java.util.List<WebsiteAuthorizationProviderSummary> getWebsiteAuthorizationProviders() {
        return websiteAuthorizationProviders;
    }

    /**
     * <p>
     * The website authorization providers.
     * </p>
     *
     * @param websiteAuthorizationProviders <p>
     *            The website authorization providers.
     *            </p>
     */
    public void setWebsiteAuthorizationProviders(
            java.util.Collection<WebsiteAuthorizationProviderSummary> websiteAuthorizationProviders) {
        if (websiteAuthorizationProviders == null) {
            this.websiteAuthorizationProviders = null;
            return;
        }

        this.websiteAuthorizationProviders = new java.util.ArrayList<WebsiteAuthorizationProviderSummary>(
                websiteAuthorizationProviders);
    }

    /**
     * <p>
     * The website authorization providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param websiteAuthorizationProviders <p>
     *            The website authorization providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWebsiteAuthorizationProvidersResult withWebsiteAuthorizationProviders(
            WebsiteAuthorizationProviderSummary... websiteAuthorizationProviders) {
        if (getWebsiteAuthorizationProviders() == null) {
            this.websiteAuthorizationProviders = new java.util.ArrayList<WebsiteAuthorizationProviderSummary>(
                    websiteAuthorizationProviders.length);
        }
        for (WebsiteAuthorizationProviderSummary value : websiteAuthorizationProviders) {
            this.websiteAuthorizationProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The website authorization providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param websiteAuthorizationProviders <p>
     *            The website authorization providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWebsiteAuthorizationProvidersResult withWebsiteAuthorizationProviders(
            java.util.Collection<WebsiteAuthorizationProviderSummary> websiteAuthorizationProviders) {
        setWebsiteAuthorizationProviders(websiteAuthorizationProviders);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this
     * operation. If this value is null, it retrieves the first page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The pagination token to use to retrieve the next page of results
     *         for this operation. If this value is null, it retrieves the first
     *         page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this
     * operation. If this value is null, it retrieves the first page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param nextToken <p>
     *            The pagination token to use to retrieve the next page of
     *            results for this operation. If this value is null, it
     *            retrieves the first page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this
     * operation. If this value is null, it retrieves the first page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param nextToken <p>
     *            The pagination token to use to retrieve the next page of
     *            results for this operation. If this value is null, it
     *            retrieves the first page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWebsiteAuthorizationProvidersResult withNextToken(String nextToken) {
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
        if (getWebsiteAuthorizationProviders() != null)
            sb.append("WebsiteAuthorizationProviders: " + getWebsiteAuthorizationProviders() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getWebsiteAuthorizationProviders() == null) ? 0
                        : getWebsiteAuthorizationProviders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWebsiteAuthorizationProvidersResult == false)
            return false;
        ListWebsiteAuthorizationProvidersResult other = (ListWebsiteAuthorizationProvidersResult) obj;

        if (other.getWebsiteAuthorizationProviders() == null
                ^ this.getWebsiteAuthorizationProviders() == null)
            return false;
        if (other.getWebsiteAuthorizationProviders() != null
                && other.getWebsiteAuthorizationProviders().equals(
                        this.getWebsiteAuthorizationProviders()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
