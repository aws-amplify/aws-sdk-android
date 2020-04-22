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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all Amazon ES domains associated with the package.
 * </p>
 */
public class ListDomainsForPackageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The package for which to list domains.
     * </p>
     */
    private String packageID;

    /**
     * <p>
     * Limits results to a maximum number of domains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The package for which to list domains.
     * </p>
     *
     * @return <p>
     *         The package for which to list domains.
     *         </p>
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * <p>
     * The package for which to list domains.
     * </p>
     *
     * @param packageID <p>
     *            The package for which to list domains.
     *            </p>
     */
    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * The package for which to list domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageID <p>
     *            The package for which to list domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsForPackageRequest withPackageID(String packageID) {
        this.packageID = packageID;
        return this;
    }

    /**
     * <p>
     * Limits results to a maximum number of domains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Limits results to a maximum number of domains.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of domains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Limits results to a maximum number of domains.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Limits results to a maximum number of domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsForPackageRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     *
     * @return <p>
     *         Used for pagination. Only necessary if a previous API call
     *         includes a non-null NextToken value. If provided, returns results
     *         for the next page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     *
     * @param nextToken <p>
     *            Used for pagination. Only necessary if a previous API call
     *            includes a non-null NextToken value. If provided, returns
     *            results for the next page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Used for pagination. Only necessary if a previous API call
     *            includes a non-null NextToken value. If provided, returns
     *            results for the next page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsForPackageRequest withNextToken(String nextToken) {
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
        if (getPackageID() != null)
            sb.append("PackageID: " + getPackageID() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainsForPackageRequest == false)
            return false;
        ListDomainsForPackageRequest other = (ListDomainsForPackageRequest) obj;

        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null
                && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
