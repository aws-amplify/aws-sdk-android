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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of the VPCs that were created by other accounts and that can be
 * associated with a specified hosted zone because you've submitted one or more
 * <code>CreateVPCAssociationAuthorization</code> requests.
 * </p>
 * <p>
 * The response includes a <code>VPCs</code> element with a <code>VPC</code>
 * child element for each VPC that can be associated with the hosted zone.
 * </p>
 */
public class ListVPCAssociationAuthorizationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element,
     * there are more VPCs that can be associated with the specified hosted
     * zone. To get the next page of results, submit another request, and
     * include the value of <code>NextToken</code> from the response in the
     * <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String nextToken;

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs
     * that you want Amazon Route 53 to return. If you don't specify a value for
     * <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     */
    private String maxResults;

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone for which you want a list of VPCs that
     *         can be associated with the hosted zone.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone for which you want a list of VPCs
     *            that can be associated with the hosted zone.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone for which you want a list of VPCs
     *            that can be associated with the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element,
     * there are more VPCs that can be associated with the specified hosted
     * zone. To get the next page of results, submit another request, and
     * include the value of <code>NextToken</code> from the response in the
     * <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         <i>Optional</i>: If a response includes a <code>NextToken</code>
     *         element, there are more VPCs that can be associated with the
     *         specified hosted zone. To get the next page of results, submit
     *         another request, and include the value of <code>NextToken</code>
     *         from the response in the <code>nexttoken</code> parameter in
     *         another <code>ListVPCAssociationAuthorizations</code> request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element,
     * there are more VPCs that can be associated with the specified hosted
     * zone. To get the next page of results, submit another request, and
     * include the value of <code>NextToken</code> from the response in the
     * <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            <i>Optional</i>: If a response includes a
     *            <code>NextToken</code> element, there are more VPCs that can
     *            be associated with the specified hosted zone. To get the next
     *            page of results, submit another request, and include the value
     *            of <code>NextToken</code> from the response in the
     *            <code>nexttoken</code> parameter in another
     *            <code>ListVPCAssociationAuthorizations</code> request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element,
     * there are more VPCs that can be associated with the specified hosted
     * zone. To get the next page of results, submit another request, and
     * include the value of <code>NextToken</code> from the response in the
     * <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            <i>Optional</i>: If a response includes a
     *            <code>NextToken</code> element, there are more VPCs that can
     *            be associated with the specified hosted zone. To get the next
     *            page of results, submit another request, and include the value
     *            of <code>NextToken</code> from the response in the
     *            <code>nexttoken</code> parameter in another
     *            <code>ListVPCAssociationAuthorizations</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs
     * that you want Amazon Route 53 to return. If you don't specify a value for
     * <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     *
     * @return <p>
     *         <i>Optional</i>: An integer that specifies the maximum number of
     *         VPCs that you want Amazon Route 53 to return. If you don't
     *         specify a value for <code>MaxResults</code>, Route 53 returns up
     *         to 50 VPCs per page.
     *         </p>
     */
    public String getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs
     * that you want Amazon Route 53 to return. If you don't specify a value for
     * <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     *
     * @param maxResults <p>
     *            <i>Optional</i>: An integer that specifies the maximum number
     *            of VPCs that you want Amazon Route 53 to return. If you don't
     *            specify a value for <code>MaxResults</code>, Route 53 returns
     *            up to 50 VPCs per page.
     *            </p>
     */
    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs
     * that you want Amazon Route 53 to return. If you don't specify a value for
     * <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            <i>Optional</i>: An integer that specifies the maximum number
     *            of VPCs that you want Amazon Route 53 to return. If you don't
     *            specify a value for <code>MaxResults</code>, Route 53 returns
     *            up to 50 VPCs per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVPCAssociationAuthorizationsRequest withMaxResults(String maxResults) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
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
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
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

        if (obj instanceof ListVPCAssociationAuthorizationsRequest == false)
            return false;
        ListVPCAssociationAuthorizationsRequest other = (ListVPCAssociationAuthorizationsRequest) obj;

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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
