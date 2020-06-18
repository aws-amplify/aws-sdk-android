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
 * Lists all the private hosted zones that a specified VPC is associated with,
 * regardless of which AWS account or AWS service owns the hosted zones. The
 * <code>HostedZoneOwner</code> structure in the response contains one of the
 * following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An <code>OwningAccount</code> element, which contains the account number of
 * either the current AWS account or another AWS account. Some services, such as
 * AWS Cloud Map, create hosted zones using the current account.
 * </p>
 * </li>
 * <li>
 * <p>
 * An <code>OwningService</code> element, which identifies the AWS service that
 * created and owns the hosted zone. For example, if a hosted zone was created
 * by Amazon Elastic File System (Amazon EFS), the value of <code>Owner</code>
 * is <code>efs.amazonaws.com</code>.
 * </p>
 * </li>
 * </ul>
 */
public class ListHostedZonesByVPCRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String vPCId;

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS
     * Region that you created the VPC in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1, eu-south-1
     */
    private String vPCRegion;

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route
     * 53 to return. If the specified VPC is associated with more than
     * <code>MaxItems</code> hosted zones, the response includes a
     * <code>NextToken</code> element. <code>NextToken</code> contains the
     * hosted zone ID of the first hosted zone that Route 53 will return if you
     * submit another request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the
     * specified VPC is associated with more hosted zones. To get more hosted
     * zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element,
     * there are no more hosted zones to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The ID of the Amazon VPC that you want to list hosted zones for.
     *         </p>
     */
    public String getVPCId() {
        return vPCId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param vPCId <p>
     *            The ID of the Amazon VPC that you want to list hosted zones
     *            for.
     *            </p>
     */
    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param vPCId <p>
     *            The ID of the Amazon VPC that you want to list hosted zones
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCRequest withVPCId(String vPCId) {
        this.vPCId = vPCId;
        return this;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS
     * Region that you created the VPC in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1, eu-south-1
     *
     * @return <p>
     *         For the Amazon VPC that you specified for <code>VPCId</code>, the
     *         AWS Region that you created the VPC in.
     *         </p>
     * @see VPCRegion
     */
    public String getVPCRegion() {
        return vPCRegion;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS
     * Region that you created the VPC in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1, eu-south-1
     *
     * @param vPCRegion <p>
     *            For the Amazon VPC that you specified for <code>VPCId</code>,
     *            the AWS Region that you created the VPC in.
     *            </p>
     * @see VPCRegion
     */
    public void setVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS
     * Region that you created the VPC in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1, eu-south-1
     *
     * @param vPCRegion <p>
     *            For the Amazon VPC that you specified for <code>VPCId</code>,
     *            the AWS Region that you created the VPC in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VPCRegion
     */
    public ListHostedZonesByVPCRequest withVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
        return this;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS
     * Region that you created the VPC in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1, eu-south-1
     *
     * @param vPCRegion <p>
     *            For the Amazon VPC that you specified for <code>VPCId</code>,
     *            the AWS Region that you created the VPC in.
     *            </p>
     * @see VPCRegion
     */
    public void setVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS
     * Region that you created the VPC in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1, eu-south-1
     *
     * @param vPCRegion <p>
     *            For the Amazon VPC that you specified for <code>VPCId</code>,
     *            the AWS Region that you created the VPC in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VPCRegion
     */
    public ListHostedZonesByVPCRequest withVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route
     * 53 to return. If the specified VPC is associated with more than
     * <code>MaxItems</code> hosted zones, the response includes a
     * <code>NextToken</code> element. <code>NextToken</code> contains the
     * hosted zone ID of the first hosted zone that Route 53 will return if you
     * submit another request.
     * </p>
     *
     * @return <p>
     *         (Optional) The maximum number of hosted zones that you want
     *         Amazon Route 53 to return. If the specified VPC is associated
     *         with more than <code>MaxItems</code> hosted zones, the response
     *         includes a <code>NextToken</code> element. <code>NextToken</code>
     *         contains the hosted zone ID of the first hosted zone that Route
     *         53 will return if you submit another request.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route
     * 53 to return. If the specified VPC is associated with more than
     * <code>MaxItems</code> hosted zones, the response includes a
     * <code>NextToken</code> element. <code>NextToken</code> contains the
     * hosted zone ID of the first hosted zone that Route 53 will return if you
     * submit another request.
     * </p>
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of hosted zones that you want
     *            Amazon Route 53 to return. If the specified VPC is associated
     *            with more than <code>MaxItems</code> hosted zones, the
     *            response includes a <code>NextToken</code> element.
     *            <code>NextToken</code> contains the hosted zone ID of the
     *            first hosted zone that Route 53 will return if you submit
     *            another request.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route
     * 53 to return. If the specified VPC is associated with more than
     * <code>MaxItems</code> hosted zones, the response includes a
     * <code>NextToken</code> element. <code>NextToken</code> contains the
     * hosted zone ID of the first hosted zone that Route 53 will return if you
     * submit another request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of hosted zones that you want
     *            Amazon Route 53 to return. If the specified VPC is associated
     *            with more than <code>MaxItems</code> hosted zones, the
     *            response includes a <code>NextToken</code> element.
     *            <code>NextToken</code> contains the hosted zone ID of the
     *            first hosted zone that Route 53 will return if you submit
     *            another request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the
     * specified VPC is associated with more hosted zones. To get more hosted
     * zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element,
     * there are no more hosted zones to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the previous response included a <code>NextToken</code>
     *         element, the specified VPC is associated with more hosted zones.
     *         To get more hosted zones, submit another
     *         <code>ListHostedZonesByVPC</code> request.
     *         </p>
     *         <p>
     *         For the value of <code>NextToken</code>, specify the value of
     *         <code>NextToken</code> from the previous response.
     *         </p>
     *         <p>
     *         If the previous response didn't include a <code>NextToken</code>
     *         element, there are no more hosted zones to get.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the
     * specified VPC is associated with more hosted zones. To get more hosted
     * zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element,
     * there are no more hosted zones to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous response included a <code>NextToken</code>
     *            element, the specified VPC is associated with more hosted
     *            zones. To get more hosted zones, submit another
     *            <code>ListHostedZonesByVPC</code> request.
     *            </p>
     *            <p>
     *            For the value of <code>NextToken</code>, specify the value of
     *            <code>NextToken</code> from the previous response.
     *            </p>
     *            <p>
     *            If the previous response didn't include a
     *            <code>NextToken</code> element, there are no more hosted zones
     *            to get.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the
     * specified VPC is associated with more hosted zones. To get more hosted
     * zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element,
     * there are no more hosted zones to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous response included a <code>NextToken</code>
     *            element, the specified VPC is associated with more hosted
     *            zones. To get more hosted zones, submit another
     *            <code>ListHostedZonesByVPC</code> request.
     *            </p>
     *            <p>
     *            For the value of <code>NextToken</code>, specify the value of
     *            <code>NextToken</code> from the previous response.
     *            </p>
     *            <p>
     *            If the previous response didn't include a
     *            <code>NextToken</code> element, there are no more hosted zones
     *            to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCRequest withNextToken(String nextToken) {
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
        if (getVPCId() != null)
            sb.append("VPCId: " + getVPCId() + ",");
        if (getVPCRegion() != null)
            sb.append("VPCRegion: " + getVPCRegion() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        hashCode = prime * hashCode + ((getVPCRegion() == null) ? 0 : getVPCRegion().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostedZonesByVPCRequest == false)
            return false;
        ListHostedZonesByVPCRequest other = (ListHostedZonesByVPCRequest) obj;

        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getVPCRegion() == null ^ this.getVPCRegion() == null)
            return false;
        if (other.getVPCRegion() != null
                && other.getVPCRegion().equals(this.getVPCRegion()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
