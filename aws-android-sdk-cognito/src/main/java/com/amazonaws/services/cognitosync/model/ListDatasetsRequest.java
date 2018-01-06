/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists datasets for an identity. With Amazon Cognito Sync, each identity has
 * access only to its own data. Thus, the credentials used to make this API call
 * need to have access to the identity data.
 * </p>
 * <p>
 * ListDatasets can be called with temporary user credentials provided by
 * Cognito Identity or with developer credentials. You should use the Cognito
 * Identity credentials to make this API call.
 * </p>
 */
public class ListDatasetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A pagination token for obtaining the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to be returned.
     */
    private Integer maxResults;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *            us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by
     *            Amazon Cognito. GUID generation is unique within a region.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *            us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by
     *            Amazon Cognito. GUID generation is unique within a region.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *            us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by
     *            Amazon Cognito. GUID generation is unique within a region.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *            us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by
     *            Amazon Cognito. GUID generation is unique within a region.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     *
     * @return A pagination token for obtaining the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     *
     * @param nextToken A pagination token for obtaining the next page of
     *            results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken A pagination token for obtaining the next page of
     *            results.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to be returned.
     *
     * @return The maximum number of results to be returned.
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * The maximum number of results to be returned.
     *
     * @param maxResults The maximum number of results to be returned.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults The maximum number of results to be returned.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null)
            sb.append("IdentityId: " + getIdentityId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetsRequest == false)
            return false;
        ListDatasetsRequest other = (ListDatasetsRequest) obj;

        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null
                && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
