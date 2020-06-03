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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the virtual interface failover test history.
 * </p>
 */
public class ListVirtualInterfaceTestHistoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     */
    private String testId;

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual
     * interface failover test.
     * </p>
     */
    private java.util.List<String> bgpPeers;

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface failover test.
     *         </p>
     */
    public String getTestId() {
        return testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     *
     * @param testId <p>
     *            The ID of the virtual interface failover test.
     *            </p>
     */
    public void setTestId(String testId) {
        this.testId = testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testId <p>
     *            The ID of the virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withTestId(String testId) {
        this.testId = testId;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface that was tested.
     *         </p>
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface that was tested.
     *            </p>
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface that was tested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual
     * interface failover test.
     * </p>
     *
     * @return <p>
     *         The BGP peers that were placed in the DOWN state during the
     *         virtual interface failover test.
     *         </p>
     */
    public java.util.List<String> getBgpPeers() {
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual
     * interface failover test.
     * </p>
     *
     * @param bgpPeers <p>
     *            The BGP peers that were placed in the DOWN state during the
     *            virtual interface failover test.
     *            </p>
     */
    public void setBgpPeers(java.util.Collection<String> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new java.util.ArrayList<String>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual
     * interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers that were placed in the DOWN state during the
     *            virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withBgpPeers(String... bgpPeers) {
        if (getBgpPeers() == null) {
            this.bgpPeers = new java.util.ArrayList<String>(bgpPeers.length);
        }
        for (String value : bgpPeers) {
            this.bgpPeers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual
     * interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeers <p>
     *            The BGP peers that were placed in the DOWN state during the
     *            virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withBgpPeers(java.util.Collection<String> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     *
     * @return <p>
     *         The status of the virtual interface failover test.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     *
     * @param status <p>
     *            The status of the virtual interface failover test.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the virtual interface failover test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     *         <p>
     *         If <code>MaxResults</code> is given a value larger than 100, only
     *         100 results are returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     *            <p>
     *            If <code>MaxResults</code> is given a value larger than 100,
     *            only 100 results are returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     *            <p>
     *            If <code>MaxResults</code> is given a value larger than 100,
     *            only 100 results are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualInterfaceTestHistoryRequest withNextToken(String nextToken) {
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
        if (getTestId() != null)
            sb.append("testId: " + getTestId() + ",");
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getBgpPeers() != null)
            sb.append("bgpPeers: " + getBgpPeers() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestId() == null) ? 0 : getTestId().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (obj instanceof ListVirtualInterfaceTestHistoryRequest == false)
            return false;
        ListVirtualInterfaceTestHistoryRequest other = (ListVirtualInterfaceTestHistoryRequest) obj;

        if (other.getTestId() == null ^ this.getTestId() == null)
            return false;
        if (other.getTestId() != null && other.getTestId().equals(this.getTestId()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
