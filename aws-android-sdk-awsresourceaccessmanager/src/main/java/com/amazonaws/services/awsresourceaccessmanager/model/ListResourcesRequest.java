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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the resources that you added to a resource shares or the resources that
 * are shared with you.
 * </p>
 */
public class ListResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     */
    private String resourceOwner;

    /**
     * <p>
     * The principal.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>codebuild:Project</code> |
     * <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code>
     * | <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     * <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     * <code>imagebuilder:ImageRecipe</code> |
     * <code>license-manager:LicenseConfiguration</code> I
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     * <code>route53resolver:ResolverRule</code>
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     */
    private java.util.List<String> resourceArns;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     */
    private java.util.List<String> resourceShareArns;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @return <p>
     *         The type of owner.
     *         </p>
     * @see ResourceOwner
     */
    public String getResourceOwner() {
        return resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @see ResourceOwner
     */
    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceOwner
     */
    public ListResourcesRequest withResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @see ResourceOwner
     */
    public void setResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceOwner
     */
    public ListResourcesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * The principal.
     * </p>
     *
     * @return <p>
     *         The principal.
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     *
     * @param principal <p>
     *            The principal.
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>codebuild:Project</code> |
     * <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code>
     * | <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     * <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     * <code>imagebuilder:ImageRecipe</code> |
     * <code>license-manager:LicenseConfiguration</code> I
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     * <code>route53resolver:ResolverRule</code>
     * </p>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     *         <p>
     *         Valid values: <code>codebuild:Project</code> |
     *         <code>codebuild:ReportGroup</code> |
     *         <code>ec2:CapacityReservation</code> |
     *         <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     *         <code>ec2:TrafficMirrorTarget</code> |
     *         <code>ec2:TransitGateway</code> |
     *         <code>imagebuilder:Component</code> |
     *         <code>imagebuilder:Image</code> |
     *         <code>imagebuilder:ImageRecipe</code> |
     *         <code>license-manager:LicenseConfiguration</code> I
     *         <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     *         <code>route53resolver:ResolverRule</code>
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>codebuild:Project</code> |
     * <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code>
     * | <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     * <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     * <code>imagebuilder:ImageRecipe</code> |
     * <code>license-manager:LicenseConfiguration</code> I
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     * <code>route53resolver:ResolverRule</code>
     * </p>
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     *            <p>
     *            Valid values: <code>codebuild:Project</code> |
     *            <code>codebuild:ReportGroup</code> |
     *            <code>ec2:CapacityReservation</code> |
     *            <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     *            <code>ec2:TrafficMirrorTarget</code> |
     *            <code>ec2:TransitGateway</code> |
     *            <code>imagebuilder:Component</code> |
     *            <code>imagebuilder:Image</code> |
     *            <code>imagebuilder:ImageRecipe</code> |
     *            <code>license-manager:LicenseConfiguration</code> I
     *            <code>resource-groups:Group</code> | <code>rds:Cluster</code>
     *            | <code>route53resolver:ResolverRule</code>
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Valid values: <code>codebuild:Project</code> |
     * <code>codebuild:ReportGroup</code> | <code>ec2:CapacityReservation</code>
     * | <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     * <code>ec2:TrafficMirrorTarget</code> | <code>ec2:TransitGateway</code> |
     * <code>imagebuilder:Component</code> | <code>imagebuilder:Image</code> |
     * <code>imagebuilder:ImageRecipe</code> |
     * <code>license-manager:LicenseConfiguration</code> I
     * <code>resource-groups:Group</code> | <code>rds:Cluster</code> |
     * <code>route53resolver:ResolverRule</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     *            <p>
     *            Valid values: <code>codebuild:Project</code> |
     *            <code>codebuild:ReportGroup</code> |
     *            <code>ec2:CapacityReservation</code> |
     *            <code>ec2:DedicatedHost</code> | <code>ec2:Subnet</code> |
     *            <code>ec2:TrafficMirrorTarget</code> |
     *            <code>ec2:TransitGateway</code> |
     *            <code>imagebuilder:Component</code> |
     *            <code>imagebuilder:Image</code> |
     *            <code>imagebuilder:ImageRecipe</code> |
     *            <code>license-manager:LicenseConfiguration</code> I
     *            <code>resource-groups:Group</code> | <code>rds:Cluster</code>
     *            | <code>route53resolver:ResolverRule</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the resources.
     *         </p>
     */
    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARN) of the resources.
     *            </p>
     */
    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARN) of the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withResourceArns(String... resourceArns) {
        if (getResourceArns() == null) {
            this.resourceArns = new java.util.ArrayList<String>(resourceArns.length);
        }
        for (String value : resourceArns) {
            this.resourceArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARN) of the resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the resource shares.
     *         </p>
     */
    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     */
    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withResourceShareArns(String... resourceShareArns) {
        if (getResourceShareArns() == null) {
            this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns.length);
        }
        for (String value : resourceShareArns) {
            this.resourceShareArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
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
    public ListResourcesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
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
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesRequest withMaxResults(Integer maxResults) {
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
        if (getResourceOwner() != null)
            sb.append("resourceOwner: " + getResourceOwner() + ",");
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getResourceArns() != null)
            sb.append("resourceArns: " + getResourceArns() + ",");
        if (getResourceShareArns() != null)
            sb.append("resourceShareArns: " + getResourceShareArns() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
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

        if (obj instanceof ListResourcesRequest == false)
            return false;
        ListResourcesRequest other = (ListResourcesRequest) obj;

        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null
                && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null
                && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null
                && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
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
