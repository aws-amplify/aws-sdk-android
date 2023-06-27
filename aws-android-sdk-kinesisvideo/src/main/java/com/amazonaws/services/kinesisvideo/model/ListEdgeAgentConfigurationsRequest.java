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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of edge configurations associated with the specified Edge
 * Agent.
 * </p>
 * <p>
 * In the request, you must specify the Edge Agent <code>HubDeviceArn</code>.
 * </p>
 */
public class ListEdgeAgentConfigurationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     */
    private String hubDeviceArn;

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The
     * default is 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListEdgeAgentConfigurations</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of edge configurations, provide this token in your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @return <p>
     *         The "Internet of Things (IoT) Thing" Arn of the edge agent.
     *         </p>
     */
    public String getHubDeviceArn() {
        return hubDeviceArn;
    }

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @param hubDeviceArn <p>
     *            The "Internet of Things (IoT) Thing" Arn of the edge agent.
     *            </p>
     */
    public void setHubDeviceArn(String hubDeviceArn) {
        this.hubDeviceArn = hubDeviceArn;
    }

    /**
     * <p>
     * The "Internet of Things (IoT) Thing" Arn of the edge agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @param hubDeviceArn <p>
     *            The "Internet of Things (IoT) Thing" Arn of the edge agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsRequest withHubDeviceArn(String hubDeviceArn) {
        this.hubDeviceArn = hubDeviceArn;
        return this;
    }

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The
     * default is 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The maximum number of edge configurations to return in the
     *         response. The default is 5.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The
     * default is 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of edge configurations to return in the
     *            response. The default is 5.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of edge configurations to return in the response. The
     * default is 5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>
     *            The maximum number of edge configurations to return in the
     *            response. The default is 5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListEdgeAgentConfigurations</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of edge configurations, provide this token in your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @return <p>
     *         If you specify this parameter, when the result of a
     *         <code>ListEdgeAgentConfigurations</code> operation is truncated,
     *         the call returns the <code>NextToken</code> in the response. To
     *         get another batch of edge configurations, provide this token in
     *         your next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListEdgeAgentConfigurations</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of edge configurations, provide this token in your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If you specify this parameter, when the result of a
     *            <code>ListEdgeAgentConfigurations</code> operation is
     *            truncated, the call returns the <code>NextToken</code> in the
     *            response. To get another batch of edge configurations, provide
     *            this token in your next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListEdgeAgentConfigurations</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of edge configurations, provide this token in your next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If you specify this parameter, when the result of a
     *            <code>ListEdgeAgentConfigurations</code> operation is
     *            truncated, the call returns the <code>NextToken</code> in the
     *            response. To get another batch of edge configurations, provide
     *            this token in your next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsRequest withNextToken(String nextToken) {
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
        if (getHubDeviceArn() != null)
            sb.append("HubDeviceArn: " + getHubDeviceArn() + ",");
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

        hashCode = prime * hashCode
                + ((getHubDeviceArn() == null) ? 0 : getHubDeviceArn().hashCode());
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

        if (obj instanceof ListEdgeAgentConfigurationsRequest == false)
            return false;
        ListEdgeAgentConfigurationsRequest other = (ListEdgeAgentConfigurationsRequest) obj;

        if (other.getHubDeviceArn() == null ^ this.getHubDeviceArn() == null)
            return false;
        if (other.getHubDeviceArn() != null
                && other.getHubDeviceArn().equals(this.getHubDeviceArn()) == false)
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
