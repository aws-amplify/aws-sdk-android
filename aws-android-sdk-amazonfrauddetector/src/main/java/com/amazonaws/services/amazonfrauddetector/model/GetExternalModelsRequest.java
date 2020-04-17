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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the details for one or more Amazon SageMaker models that have been
 * imported into the service. This is a paginated API. If you provide a null
 * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10 records
 * per page. If you provide a <code>maxSizePerPage</code>, the value must be
 * between 5 and 10. To get the next page results, provide the pagination token
 * from the <code>GetExternalModelsResult</code> as part of your request. A null
 * pagination token fetches the records from the beginning.
 * </p>
 */
public class GetExternalModelsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon SageMaker model endpoint.
     * </p>
     */
    private String modelEndpoint;

    /**
     * <p>
     * The next page token for the request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon SageMaker model endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon SageMaker model endpoint.
     *         </p>
     */
    public String getModelEndpoint() {
        return modelEndpoint;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint.
     * </p>
     *
     * @param modelEndpoint <p>
     *            The Amazon SageMaker model endpoint.
     *            </p>
     */
    public void setModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelEndpoint <p>
     *            The Amazon SageMaker model endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExternalModelsRequest withModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
        return this;
    }

    /**
     * <p>
     * The next page token for the request.
     * </p>
     *
     * @return <p>
     *         The next page token for the request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next page token for the request.
     * </p>
     *
     * @param nextToken <p>
     *            The next page token for the request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next page token for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExternalModelsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 10<br/>
     *
     * @return <p>
     *         The maximum number of objects to return for the request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of objects to return for the request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of objects to return for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExternalModelsRequest withMaxResults(Integer maxResults) {
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
        if (getModelEndpoint() != null)
            sb.append("modelEndpoint: " + getModelEndpoint() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelEndpoint() == null) ? 0 : getModelEndpoint().hashCode());
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

        if (obj instanceof GetExternalModelsRequest == false)
            return false;
        GetExternalModelsRequest other = (GetExternalModelsRequest) obj;

        if (other.getModelEndpoint() == null ^ this.getModelEndpoint() == null)
            return false;
        if (other.getModelEndpoint() != null
                && other.getModelEndpoint().equals(this.getModelEndpoint()) == false)
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
