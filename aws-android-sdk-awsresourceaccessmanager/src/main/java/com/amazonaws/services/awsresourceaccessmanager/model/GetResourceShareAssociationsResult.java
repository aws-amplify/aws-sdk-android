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

public class GetResourceShareAssociationsResult implements Serializable {
    /**
     * <p>
     * Information about the associations.
     * </p>
     */
    private java.util.List<ResourceShareAssociation> resourceShareAssociations;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the associations.
     * </p>
     *
     * @return <p>
     *         Information about the associations.
     *         </p>
     */
    public java.util.List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     *
     * @param resourceShareAssociations <p>
     *            Information about the associations.
     *            </p>
     */
    public void setResourceShareAssociations(
            java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        if (resourceShareAssociations == null) {
            this.resourceShareAssociations = null;
            return;
        }

        this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(
                resourceShareAssociations);
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareAssociations <p>
     *            Information about the associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareAssociationsResult withResourceShareAssociations(
            ResourceShareAssociation... resourceShareAssociations) {
        if (getResourceShareAssociations() == null) {
            this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(
                    resourceShareAssociations.length);
        }
        for (ResourceShareAssociation value : resourceShareAssociations) {
            this.resourceShareAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareAssociations <p>
     *            Information about the associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareAssociationsResult withResourceShareAssociations(
            java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        setResourceShareAssociations(resourceShareAssociations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareAssociationsResult withNextToken(String nextToken) {
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
        if (getResourceShareAssociations() != null)
            sb.append("resourceShareAssociations: " + getResourceShareAssociations() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceShareAssociations() == null) ? 0 : getResourceShareAssociations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceShareAssociationsResult == false)
            return false;
        GetResourceShareAssociationsResult other = (GetResourceShareAssociationsResult) obj;

        if (other.getResourceShareAssociations() == null
                ^ this.getResourceShareAssociations() == null)
            return false;
        if (other.getResourceShareAssociations() != null
                && other.getResourceShareAssociations().equals(this.getResourceShareAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
