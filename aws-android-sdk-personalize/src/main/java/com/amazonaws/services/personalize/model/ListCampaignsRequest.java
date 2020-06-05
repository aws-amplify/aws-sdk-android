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
 * Returns a list of campaigns that use the given solution. When a solution is
 * not specified, all the campaigns associated with the account are listed. The
 * response provides the properties for each campaign, including the Amazon
 * Resource Name (ARN). For more information on campaigns, see
 * <a>CreateCampaign</a>.
 * </p>
 */
public class ListCampaignsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution to list the campaigns for.
     * When a solution is not specified, all the campaigns associated with the
     * account are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionArn;

    /**
     * <p>
     * A token returned from the previous call to <code>ListCampaigns</code> for
     * getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of campaigns to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution to list the campaigns for.
     * When a solution is not specified, all the campaigns associated with the
     * account are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the solution to list the
     *         campaigns for. When a solution is not specified, all the
     *         campaigns associated with the account are listed.
     *         </p>
     */
    public String getSolutionArn() {
        return solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution to list the campaigns for.
     * When a solution is not specified, all the campaigns associated with the
     * account are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The Amazon Resource Name (ARN) of the solution to list the
     *            campaigns for. When a solution is not specified, all the
     *            campaigns associated with the account are listed.
     *            </p>
     */
    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution to list the campaigns for.
     * When a solution is not specified, all the campaigns associated with the
     * account are listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The Amazon Resource Name (ARN) of the solution to list the
     *            campaigns for. When a solution is not specified, all the
     *            campaigns associated with the account are listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCampaignsRequest withSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
        return this;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListCampaigns</code> for
     * getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token returned from the previous call to
     *         <code>ListCampaigns</code> for getting the next set of campaigns
     *         (if they exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListCampaigns</code> for
     * getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token returned from the previous call to
     *            <code>ListCampaigns</code> for getting the next set of
     *            campaigns (if they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListCampaigns</code> for
     * getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token returned from the previous call to
     *            <code>ListCampaigns</code> for getting the next set of
     *            campaigns (if they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCampaignsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of campaigns to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of campaigns to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of campaigns to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of campaigns to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of campaigns to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of campaigns to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCampaignsRequest withMaxResults(Integer maxResults) {
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
        if (getSolutionArn() != null)
            sb.append("solutionArn: " + getSolutionArn() + ",");
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
                + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
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

        if (obj instanceof ListCampaignsRequest == false)
            return false;
        ListCampaignsRequest other = (ListCampaignsRequest) obj;

        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null
                && other.getSolutionArn().equals(this.getSolutionArn()) == false)
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
