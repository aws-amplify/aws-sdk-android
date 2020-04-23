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
 * Lists the principals that you have shared resources with or that have shared
 * resources with you.
 * </p>
 */
public class ListPrincipalsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The principals.
     * </p>
     */
    private java.util.List<String> principals;

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
    public ListPrincipalsRequest withResourceOwner(String resourceOwner) {
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
    public ListPrincipalsRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPrincipalsRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The principals.
     * </p>
     *
     * @return <p>
     *         The principals.
     *         </p>
     */
    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals.
     * </p>
     *
     * @param principals <p>
     *            The principals.
     *            </p>
     */
    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The principals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principals <p>
     *            The principals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPrincipalsRequest withPrincipals(String... principals) {
        if (getPrincipals() == null) {
            this.principals = new java.util.ArrayList<String>(principals.length);
        }
        for (String value : principals) {
            this.principals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The principals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principals <p>
     *            The principals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPrincipalsRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
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
    public ListPrincipalsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
    public ListPrincipalsRequest withResourceShareArns(String... resourceShareArns) {
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
    public ListPrincipalsRequest withResourceShareArns(
            java.util.Collection<String> resourceShareArns) {
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
    public ListPrincipalsRequest withNextToken(String nextToken) {
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
    public ListPrincipalsRequest withMaxResults(Integer maxResults) {
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
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getPrincipals() != null)
            sb.append("principals: " + getPrincipals() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
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
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
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

        if (obj instanceof ListPrincipalsRequest == false)
            return false;
        ListPrincipalsRequest other = (ListPrincipalsRequest) obj;

        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null
                && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null
                && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
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
