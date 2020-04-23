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

public class ListResourceTypesResult implements Serializable {
    /**
     * <p>
     * The shareable resource types supported by AWS RAM.
     * </p>
     */
    private java.util.List<ServiceNameAndResourceType> resourceTypes;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The shareable resource types supported by AWS RAM.
     * </p>
     *
     * @return <p>
     *         The shareable resource types supported by AWS RAM.
     *         </p>
     */
    public java.util.List<ServiceNameAndResourceType> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The shareable resource types supported by AWS RAM.
     * </p>
     *
     * @param resourceTypes <p>
     *            The shareable resource types supported by AWS RAM.
     *            </p>
     */
    public void setResourceTypes(java.util.Collection<ServiceNameAndResourceType> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<ServiceNameAndResourceType>(resourceTypes);
    }

    /**
     * <p>
     * The shareable resource types supported by AWS RAM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The shareable resource types supported by AWS RAM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceTypesResult withResourceTypes(ServiceNameAndResourceType... resourceTypes) {
        if (getResourceTypes() == null) {
            this.resourceTypes = new java.util.ArrayList<ServiceNameAndResourceType>(
                    resourceTypes.length);
        }
        for (ServiceNameAndResourceType value : resourceTypes) {
            this.resourceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The shareable resource types supported by AWS RAM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The shareable resource types supported by AWS RAM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceTypesResult withResourceTypes(
            java.util.Collection<ServiceNameAndResourceType> resourceTypes) {
        setResourceTypes(resourceTypes);
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
    public ListResourceTypesResult withNextToken(String nextToken) {
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
        if (getResourceTypes() != null)
            sb.append("resourceTypes: " + getResourceTypes() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceTypesResult == false)
            return false;
        ListResourceTypesResult other = (ListResourceTypesResult) obj;

        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
