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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the file transfer protocol-enabled servers that are associated with
 * your AWS account.
 * </p>
 */
public class ListServersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the number of file transfer protocol-enabled servers to return
     * as a response to the <code>ListServers</code> query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When additional results are obtained from the<code>ListServers</code>
     * command, a <code>NextToken</code> parameter is returned in the output.
     * You can then pass the <code>NextToken</code> parameter in a subsequent
     * command to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the number of file transfer protocol-enabled servers to return
     * as a response to the <code>ListServers</code> query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Specifies the number of file transfer protocol-enabled servers to
     *         return as a response to the <code>ListServers</code> query.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specifies the number of file transfer protocol-enabled servers to return
     * as a response to the <code>ListServers</code> query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of file transfer protocol-enabled servers
     *            to return as a response to the <code>ListServers</code> query.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of file transfer protocol-enabled servers to return
     * as a response to the <code>ListServers</code> query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of file transfer protocol-enabled servers
     *            to return as a response to the <code>ListServers</code> query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * When additional results are obtained from the<code>ListServers</code>
     * command, a <code>NextToken</code> parameter is returned in the output.
     * You can then pass the <code>NextToken</code> parameter in a subsequent
     * command to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         When additional results are obtained from the
     *         <code>ListServers</code> command, a <code>NextToken</code>
     *         parameter is returned in the output. You can then pass the
     *         <code>NextToken</code> parameter in a subsequent command to
     *         continue listing additional file transfer protocol-enabled
     *         servers.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When additional results are obtained from the<code>ListServers</code>
     * command, a <code>NextToken</code> parameter is returned in the output.
     * You can then pass the <code>NextToken</code> parameter in a subsequent
     * command to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When additional results are obtained from the
     *            <code>ListServers</code> command, a <code>NextToken</code>
     *            parameter is returned in the output. You can then pass the
     *            <code>NextToken</code> parameter in a subsequent command to
     *            continue listing additional file transfer protocol-enabled
     *            servers.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When additional results are obtained from the<code>ListServers</code>
     * command, a <code>NextToken</code> parameter is returned in the output.
     * You can then pass the <code>NextToken</code> parameter in a subsequent
     * command to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When additional results are obtained from the
     *            <code>ListServers</code> command, a <code>NextToken</code>
     *            parameter is returned in the output. You can then pass the
     *            <code>NextToken</code> parameter in a subsequent command to
     *            continue listing additional file transfer protocol-enabled
     *            servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServersRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListServersRequest == false)
            return false;
        ListServersRequest other = (ListServersRequest) obj;

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
