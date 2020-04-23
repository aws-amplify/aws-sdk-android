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
 * Gets the resources or principals for the resource shares that you own.
 * </p>
 */
public class GetResourceShareAssociationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The association type. Specify <code>PRINCIPAL</code> to list the
     * principals that are associated with the specified resource share. Specify
     * <code>RESOURCE</code> to list the resources that are associated with the
     * specified resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     */
    private String associationType;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     */
    private java.util.List<String> resourceShareArns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. You cannot specify this
     * parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The principal. You cannot specify this parameter if the association type
     * is <code>RESOURCE</code>.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The association status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     */
    private String associationStatus;

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
     * The association type. Specify <code>PRINCIPAL</code> to list the
     * principals that are associated with the specified resource share. Specify
     * <code>RESOURCE</code> to list the resources that are associated with the
     * specified resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @return <p>
     *         The association type. Specify <code>PRINCIPAL</code> to list the
     *         principals that are associated with the specified resource share.
     *         Specify <code>RESOURCE</code> to list the resources that are
     *         associated with the specified resource share.
     *         </p>
     * @see ResourceShareAssociationType
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * <p>
     * The association type. Specify <code>PRINCIPAL</code> to list the
     * principals that are associated with the specified resource share. Specify
     * <code>RESOURCE</code> to list the resources that are associated with the
     * specified resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type. Specify <code>PRINCIPAL</code> to list
     *            the principals that are associated with the specified resource
     *            share. Specify <code>RESOURCE</code> to list the resources
     *            that are associated with the specified resource share.
     *            </p>
     * @see ResourceShareAssociationType
     */
    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The association type. Specify <code>PRINCIPAL</code> to list the
     * principals that are associated with the specified resource share. Specify
     * <code>RESOURCE</code> to list the resources that are associated with the
     * specified resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type. Specify <code>PRINCIPAL</code> to list
     *            the principals that are associated with the specified resource
     *            share. Specify <code>RESOURCE</code> to list the resources
     *            that are associated with the specified resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationType
     */
    public GetResourceShareAssociationsRequest withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * <p>
     * The association type. Specify <code>PRINCIPAL</code> to list the
     * principals that are associated with the specified resource share. Specify
     * <code>RESOURCE</code> to list the resources that are associated with the
     * specified resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type. Specify <code>PRINCIPAL</code> to list
     *            the principals that are associated with the specified resource
     *            share. Specify <code>RESOURCE</code> to list the resources
     *            that are associated with the specified resource share.
     *            </p>
     * @see ResourceShareAssociationType
     */
    public void setAssociationType(ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
    }

    /**
     * <p>
     * The association type. Specify <code>PRINCIPAL</code> to list the
     * principals that are associated with the specified resource share. Specify
     * <code>RESOURCE</code> to list the resources that are associated with the
     * specified resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type. Specify <code>PRINCIPAL</code> to list
     *            the principals that are associated with the specified resource
     *            share. Specify <code>RESOURCE</code> to list the resources
     *            that are associated with the specified resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationType
     */
    public GetResourceShareAssociationsRequest withAssociationType(
            ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
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
    public GetResourceShareAssociationsRequest withResourceShareArns(String... resourceShareArns) {
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
    public GetResourceShareAssociationsRequest withResourceShareArns(
            java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. You cannot specify this
     * parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource. You cannot
     *         specify this parameter if the association type is
     *         <code>PRINCIPAL</code>.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. You cannot specify this
     * parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource. You cannot
     *            specify this parameter if the association type is
     *            <code>PRINCIPAL</code>.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. You cannot specify this
     * parameter if the association type is <code>PRINCIPAL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource. You cannot
     *            specify this parameter if the association type is
     *            <code>PRINCIPAL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareAssociationsRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The principal. You cannot specify this parameter if the association type
     * is <code>RESOURCE</code>.
     * </p>
     *
     * @return <p>
     *         The principal. You cannot specify this parameter if the
     *         association type is <code>RESOURCE</code>.
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The principal. You cannot specify this parameter if the association type
     * is <code>RESOURCE</code>.
     * </p>
     *
     * @param principal <p>
     *            The principal. You cannot specify this parameter if the
     *            association type is <code>RESOURCE</code>.
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal. You cannot specify this parameter if the association type
     * is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The principal. You cannot specify this parameter if the
     *            association type is <code>RESOURCE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareAssociationsRequest withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @return <p>
     *         The association status.
     *         </p>
     * @see ResourceShareAssociationStatus
     */
    public String getAssociationStatus() {
        return associationStatus;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param associationStatus <p>
     *            The association status.
     *            </p>
     * @see ResourceShareAssociationStatus
     */
    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param associationStatus <p>
     *            The association status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationStatus
     */
    public GetResourceShareAssociationsRequest withAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param associationStatus <p>
     *            The association status.
     *            </p>
     * @see ResourceShareAssociationStatus
     */
    public void setAssociationStatus(ResourceShareAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
    }

    /**
     * <p>
     * The association status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param associationStatus <p>
     *            The association status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationStatus
     */
    public GetResourceShareAssociationsRequest withAssociationStatus(
            ResourceShareAssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
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
    public GetResourceShareAssociationsRequest withNextToken(String nextToken) {
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
    public GetResourceShareAssociationsRequest withMaxResults(Integer maxResults) {
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
        if (getAssociationType() != null)
            sb.append("associationType: " + getAssociationType() + ",");
        if (getResourceShareArns() != null)
            sb.append("resourceShareArns: " + getResourceShareArns() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal() + ",");
        if (getAssociationStatus() != null)
            sb.append("associationStatus: " + getAssociationStatus() + ",");
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
                + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
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

        if (obj instanceof GetResourceShareAssociationsRequest == false)
            return false;
        GetResourceShareAssociationsRequest other = (GetResourceShareAssociationsRequest) obj;

        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null
                && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null
                && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null
                && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
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
