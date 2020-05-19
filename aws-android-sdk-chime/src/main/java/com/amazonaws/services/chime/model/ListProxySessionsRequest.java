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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the proxy sessions for the specified Amazon Chime Voice Connector.
 * </p>
 */
public class ListProxySessionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorId;

    /**
     * <p>
     * The proxy session status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Closed
     */
    private String status;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime voice connector ID.
     *         </p>
     */
    public String getVoiceConnectorId() {
        return voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime voice connector ID.
     *            </p>
     */
    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorId <p>
     *            The Amazon Chime voice connector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProxySessionsRequest withVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
        return this;
    }

    /**
     * <p>
     * The proxy session status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Closed
     *
     * @return <p>
     *         The proxy session status.
     *         </p>
     * @see ProxySessionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The proxy session status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Closed
     *
     * @param status <p>
     *            The proxy session status.
     *            </p>
     * @see ProxySessionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The proxy session status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Closed
     *
     * @param status <p>
     *            The proxy session status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProxySessionStatus
     */
    public ListProxySessionsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The proxy session status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Closed
     *
     * @param status <p>
     *            The proxy session status.
     *            </p>
     * @see ProxySessionStatus
     */
    public void setStatus(ProxySessionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The proxy session status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Open, InProgress, Closed
     *
     * @param status <p>
     *            The proxy session status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProxySessionStatus
     */
    public ListProxySessionsRequest withStatus(ProxySessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProxySessionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProxySessionsRequest withMaxResults(Integer maxResults) {
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: " + getVoiceConnectorId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
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
                + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (obj instanceof ListProxySessionsRequest == false)
            return false;
        ListProxySessionsRequest other = (ListProxySessionsRequest) obj;

        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null
                && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
