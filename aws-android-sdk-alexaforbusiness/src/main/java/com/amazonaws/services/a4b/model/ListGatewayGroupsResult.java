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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class ListGatewayGroupsResult implements Serializable {
    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     */
    private java.util.List<GatewayGroupSummary> gatewayGroups;

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group
     * summaries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     *
     * @return <p>
     *         The gateway groups in the list.
     *         </p>
     */
    public java.util.List<GatewayGroupSummary> getGatewayGroups() {
        return gatewayGroups;
    }

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     *
     * @param gatewayGroups <p>
     *            The gateway groups in the list.
     *            </p>
     */
    public void setGatewayGroups(java.util.Collection<GatewayGroupSummary> gatewayGroups) {
        if (gatewayGroups == null) {
            this.gatewayGroups = null;
            return;
        }

        this.gatewayGroups = new java.util.ArrayList<GatewayGroupSummary>(gatewayGroups);
    }

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayGroups <p>
     *            The gateway groups in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGatewayGroupsResult withGatewayGroups(GatewayGroupSummary... gatewayGroups) {
        if (getGatewayGroups() == null) {
            this.gatewayGroups = new java.util.ArrayList<GatewayGroupSummary>(gatewayGroups.length);
        }
        for (GatewayGroupSummary value : gatewayGroups) {
            this.gatewayGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayGroups <p>
     *            The gateway groups in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGatewayGroupsResult withGatewayGroups(
            java.util.Collection<GatewayGroupSummary> gatewayGroups) {
        setGatewayGroups(gatewayGroups);
        return this;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group
     * summaries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The token used to paginate though multiple pages of gateway group
     *         summaries.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group
     * summaries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token used to paginate though multiple pages of gateway
     *            group summaries.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group
     * summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token used to paginate though multiple pages of gateway
     *            group summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGatewayGroupsResult withNextToken(String nextToken) {
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
        if (getGatewayGroups() != null)
            sb.append("GatewayGroups: " + getGatewayGroups() + ",");
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
                + ((getGatewayGroups() == null) ? 0 : getGatewayGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGatewayGroupsResult == false)
            return false;
        ListGatewayGroupsResult other = (ListGatewayGroupsResult) obj;

        if (other.getGatewayGroups() == null ^ this.getGatewayGroups() == null)
            return false;
        if (other.getGatewayGroups() != null
                && other.getGatewayGroups().equals(this.getGatewayGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
