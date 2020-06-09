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

public class ListServersResult implements Serializable {
    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code>
     * operation, a <code>NextToken</code> parameter is returned in the output.
     * In a following command, you can pass in the <code>NextToken</code>
     * parameter to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of file transfer protocol-enabled servers that were listed.
     * </p>
     */
    private java.util.List<ListedServer> servers;

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code>
     * operation, a <code>NextToken</code> parameter is returned in the output.
     * In a following command, you can pass in the <code>NextToken</code>
     * parameter to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         When you can get additional results from the
     *         <code>ListServers</code> operation, a <code>NextToken</code>
     *         parameter is returned in the output. In a following command, you
     *         can pass in the <code>NextToken</code> parameter to continue
     *         listing additional file transfer protocol-enabled servers.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code>
     * operation, a <code>NextToken</code> parameter is returned in the output.
     * In a following command, you can pass in the <code>NextToken</code>
     * parameter to continue listing additional file transfer protocol-enabled
     * servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you can get additional results from the
     *            <code>ListServers</code> operation, a <code>NextToken</code>
     *            parameter is returned in the output. In a following command,
     *            you can pass in the <code>NextToken</code> parameter to
     *            continue listing additional file transfer protocol-enabled
     *            servers.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code>
     * operation, a <code>NextToken</code> parameter is returned in the output.
     * In a following command, you can pass in the <code>NextToken</code>
     * parameter to continue listing additional file transfer protocol-enabled
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
     *            When you can get additional results from the
     *            <code>ListServers</code> operation, a <code>NextToken</code>
     *            parameter is returned in the output. In a following command,
     *            you can pass in the <code>NextToken</code> parameter to
     *            continue listing additional file transfer protocol-enabled
     *            servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of file transfer protocol-enabled servers that were listed.
     * </p>
     *
     * @return <p>
     *         An array of file transfer protocol-enabled servers that were
     *         listed.
     *         </p>
     */
    public java.util.List<ListedServer> getServers() {
        return servers;
    }

    /**
     * <p>
     * An array of file transfer protocol-enabled servers that were listed.
     * </p>
     *
     * @param servers <p>
     *            An array of file transfer protocol-enabled servers that were
     *            listed.
     *            </p>
     */
    public void setServers(java.util.Collection<ListedServer> servers) {
        if (servers == null) {
            this.servers = null;
            return;
        }

        this.servers = new java.util.ArrayList<ListedServer>(servers);
    }

    /**
     * <p>
     * An array of file transfer protocol-enabled servers that were listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param servers <p>
     *            An array of file transfer protocol-enabled servers that were
     *            listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServersResult withServers(ListedServer... servers) {
        if (getServers() == null) {
            this.servers = new java.util.ArrayList<ListedServer>(servers.length);
        }
        for (ListedServer value : servers) {
            this.servers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of file transfer protocol-enabled servers that were listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param servers <p>
     *            An array of file transfer protocol-enabled servers that were
     *            listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServersResult withServers(java.util.Collection<ListedServer> servers) {
        setServers(servers);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getServers() != null)
            sb.append("Servers: " + getServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServersResult == false)
            return false;
        ListServersResult other = (ListServersResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        return true;
    }
}
