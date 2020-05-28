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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class ListNodesResult implements Serializable {
    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListNodes operation is
     * truncated, the call returns NextToken in the response. To get another
     * batch of nodes, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * 
     <p>
     * List containing a NodeInfo object.
     * </p>
     */
    private java.util.List<NodeInfo> nodeInfoList;

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListNodes operation is
     * truncated, the call returns NextToken in the response. To get another
     * batch of nodes, provide this token in your next request.
     * </p>
     * 
     * @return <p>
     *         The paginated results marker. When the result of a ListNodes
     *         operation is truncated, the call returns NextToken in the
     *         response. To get another batch of nodes, provide this token in
     *         your next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListNodes operation is
     * truncated, the call returns NextToken in the response. To get another
     * batch of nodes, provide this token in your next request.
     * </p>
     * 
     * @param nextToken <p>
     *            The paginated results marker. When the result of a ListNodes
     *            operation is truncated, the call returns NextToken in the
     *            response. To get another batch of nodes, provide this token in
     *            your next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListNodes operation is
     * truncated, the call returns NextToken in the response. To get another
     * batch of nodes, provide this token in your next request.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The paginated results marker. When the result of a ListNodes
     *            operation is truncated, the call returns NextToken in the
     *            response. To get another batch of nodes, provide this token in
     *            your next request.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNodesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * 
     <p>
     * List containing a NodeInfo object.
     * </p>
     * 
     * @return <p>
     *         List containing a NodeInfo object.
     *         </p>
     */
    public java.util.List<NodeInfo> getNodeInfoList() {
        return nodeInfoList;
    }

    /**
     * 
     <p>
     * List containing a NodeInfo object.
     * </p>
     * 
     * @param nodeInfoList <p>
     *            List containing a NodeInfo object.
     *            </p>
     */
    public void setNodeInfoList(java.util.Collection<NodeInfo> nodeInfoList) {
        if (nodeInfoList == null) {
            this.nodeInfoList = null;
            return;
        }

        this.nodeInfoList = new java.util.ArrayList<NodeInfo>(nodeInfoList);
    }

    /**
     * 
     <p>
     * List containing a NodeInfo object.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeInfoList <p>
     *            List containing a NodeInfo object.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNodesResult withNodeInfoList(NodeInfo... nodeInfoList) {
        if (getNodeInfoList() == null) {
            this.nodeInfoList = new java.util.ArrayList<NodeInfo>(nodeInfoList.length);
        }
        for (NodeInfo value : nodeInfoList) {
            this.nodeInfoList.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * List containing a NodeInfo object.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeInfoList <p>
     *            List containing a NodeInfo object.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNodesResult withNodeInfoList(java.util.Collection<NodeInfo> nodeInfoList) {
        setNodeInfoList(nodeInfoList);
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
        if (getNodeInfoList() != null)
            sb.append("NodeInfoList: " + getNodeInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getNodeInfoList() == null) ? 0 : getNodeInfoList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNodesResult == false)
            return false;
        ListNodesResult other = (ListNodesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNodeInfoList() == null ^ this.getNodeInfoList() == null)
            return false;
        if (other.getNodeInfoList() != null
                && other.getNodeInfoList().equals(this.getNodeInfoList()) == false)
            return false;
        return true;
    }
}
