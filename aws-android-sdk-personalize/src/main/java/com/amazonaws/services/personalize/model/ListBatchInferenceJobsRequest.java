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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of the batch inference jobs that have been performed off of a
 * solution version.
 * </p>
 */
public class ListBatchInferenceJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the
     * batch inference jobs were created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of batch inference job results to return in each page.
     * The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the
     * batch inference jobs were created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the solution version from which
     *         the batch inference jobs were created.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the
     * batch inference jobs were created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version from
     *            which the batch inference jobs were created.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the
     * batch inference jobs were created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version from
     *            which the batch inference jobs were created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBatchInferenceJobsRequest withSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBatchInferenceJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of batch inference job results to return in each page.
     * The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of batch inference job results to return in
     *         each page. The default value is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of batch inference job results to return in each page.
     * The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of batch inference job results to return in
     *            each page. The default value is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of batch inference job results to return in each page.
     * The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of batch inference job results to return in
     *            each page. The default value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBatchInferenceJobsRequest withMaxResults(Integer maxResults) {
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
        if (getSolutionVersionArn() != null)
            sb.append("solutionVersionArn: " + getSolutionVersionArn() + ",");
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
                + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
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

        if (obj instanceof ListBatchInferenceJobsRequest == false)
            return false;
        ListBatchInferenceJobsRequest other = (ListBatchInferenceJobsRequest) obj;

        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null
                && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
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
