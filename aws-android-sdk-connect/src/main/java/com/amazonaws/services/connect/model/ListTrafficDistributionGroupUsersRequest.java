/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists traffic distribution group users.
 * </p>
 */
public class ListTrafficDistributionGroupUsersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String trafficDistributionGroupId;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The identifier of the traffic distribution group. This can be the
     *         ID or the ARN if the API is being called in the Region where the
     *         traffic distribution group was created. The ARN must be provided
     *         if the call is from the replicated Region.
     *         </p>
     */
    public String getTrafficDistributionGroupId() {
        return trafficDistributionGroupId;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param trafficDistributionGroupId <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     */
    public void setTrafficDistributionGroupId(String trafficDistributionGroupId) {
        this.trafficDistributionGroupId = trafficDistributionGroupId;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z-]+-[0-9]{1}:[
     * 0-9]{1,20}:traffic
     * -distribution-group/)?[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4
     * }-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param trafficDistributionGroupId <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupUsersRequest withTrafficDistributionGroupId(
            String trafficDistributionGroupId) {
        this.trafficDistributionGroupId = trafficDistributionGroupId;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupUsersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupUsersRequest withNextToken(String nextToken) {
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
        if (getTrafficDistributionGroupId() != null)
            sb.append("TrafficDistributionGroupId: " + getTrafficDistributionGroupId() + ",");
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

        hashCode = prime
                * hashCode
                + ((getTrafficDistributionGroupId() == null) ? 0 : getTrafficDistributionGroupId()
                        .hashCode());
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

        if (obj instanceof ListTrafficDistributionGroupUsersRequest == false)
            return false;
        ListTrafficDistributionGroupUsersRequest other = (ListTrafficDistributionGroupUsersRequest) obj;

        if (other.getTrafficDistributionGroupId() == null
                ^ this.getTrafficDistributionGroupId() == null)
            return false;
        if (other.getTrafficDistributionGroupId() != null
                && other.getTrafficDistributionGroupId().equals(
                        this.getTrafficDistributionGroupId()) == false)
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
