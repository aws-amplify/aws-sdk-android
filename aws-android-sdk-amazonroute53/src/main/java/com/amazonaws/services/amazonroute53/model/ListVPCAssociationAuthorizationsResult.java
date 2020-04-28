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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 */
public class ListVPCAssociationAuthorizationsResult implements Serializable {
    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are
     * more VPCs that can be associated with the specified hosted zone. To get
     * the next page of VPCs, submit another
     * <code>ListVPCAssociationAuthorizations</code> request, and include the
     * value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified
     * hosted zone.
     * </p>
     */
    private java.util.List<VPC> vPCs;

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that you can associate the listed VPCs
     *         with.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you can associate the listed
     *            VPCs with.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you can associate the listed
     *            VPCs with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsResult withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are
     * more VPCs that can be associated with the specified hosted zone. To get
     * the next page of VPCs, submit another
     * <code>ListVPCAssociationAuthorizations</code> request, and include the
     * value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         When the response includes a <code>NextToken</code> element,
     *         there are more VPCs that can be associated with the specified
     *         hosted zone. To get the next page of VPCs, submit another
     *         <code>ListVPCAssociationAuthorizations</code> request, and
     *         include the value of the <code>NextToken</code> element from the
     *         response in the <code>nexttoken</code> request parameter.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are
     * more VPCs that can be associated with the specified hosted zone. To get
     * the next page of VPCs, submit another
     * <code>ListVPCAssociationAuthorizations</code> request, and include the
     * value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            When the response includes a <code>NextToken</code> element,
     *            there are more VPCs that can be associated with the specified
     *            hosted zone. To get the next page of VPCs, submit another
     *            <code>ListVPCAssociationAuthorizations</code> request, and
     *            include the value of the <code>NextToken</code> element from
     *            the response in the <code>nexttoken</code> request parameter.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are
     * more VPCs that can be associated with the specified hosted zone. To get
     * the next page of VPCs, submit another
     * <code>ListVPCAssociationAuthorizations</code> request, and include the
     * value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            When the response includes a <code>NextToken</code> element,
     *            there are more VPCs that can be associated with the specified
     *            hosted zone. To get the next page of VPCs, submit another
     *            <code>ListVPCAssociationAuthorizations</code> request, and
     *            include the value of the <code>NextToken</code> element from
     *            the response in the <code>nexttoken</code> request parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified
     * hosted zone.
     * </p>
     *
     * @return <p>
     *         The list of VPCs that are authorized to be associated with the
     *         specified hosted zone.
     *         </p>
     */
    public java.util.List<VPC> getVPCs() {
        return vPCs;
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified
     * hosted zone.
     * </p>
     *
     * @param vPCs <p>
     *            The list of VPCs that are authorized to be associated with the
     *            specified hosted zone.
     *            </p>
     */
    public void setVPCs(java.util.Collection<VPC> vPCs) {
        if (vPCs == null) {
            this.vPCs = null;
            return;
        }

        this.vPCs = new java.util.ArrayList<VPC>(vPCs);
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified
     * hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCs <p>
     *            The list of VPCs that are authorized to be associated with the
     *            specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsResult withVPCs(VPC... vPCs) {
        if (getVPCs() == null) {
            this.vPCs = new java.util.ArrayList<VPC>(vPCs.length);
        }
        for (VPC value : vPCs) {
            this.vPCs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified
     * hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCs <p>
     *            The list of VPCs that are authorized to be associated with the
     *            specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsResult withVPCs(java.util.Collection<VPC> vPCs) {
        setVPCs(vPCs);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getVPCs() != null)
            sb.append("VPCs: " + getVPCs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVPCs() == null) ? 0 : getVPCs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVPCAssociationAuthorizationsResult == false)
            return false;
        ListVPCAssociationAuthorizationsResult other = (ListVPCAssociationAuthorizationsResult) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVPCs() == null ^ this.getVPCs() == null)
            return false;
        if (other.getVPCs() != null && other.getVPCs().equals(this.getVPCs()) == false)
            return false;
        return true;
    }
}
