/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class DescribeResourcePoliciesResult implements Serializable {
    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     */
    private java.util.List<ResourcePolicy> resourcePolicies;

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     *
     * @return <p>
     *         The resource policies that exist in this account.
     *         </p>
     */
    public java.util.List<ResourcePolicy> getResourcePolicies() {
        return resourcePolicies;
    }

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     *
     * @param resourcePolicies <p>
     *            The resource policies that exist in this account.
     *            </p>
     */
    public void setResourcePolicies(java.util.Collection<ResourcePolicy> resourcePolicies) {
        if (resourcePolicies == null) {
            this.resourcePolicies = null;
            return;
        }

        this.resourcePolicies = new java.util.ArrayList<ResourcePolicy>(resourcePolicies);
    }

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcePolicies <p>
     *            The resource policies that exist in this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourcePoliciesResult withResourcePolicies(ResourcePolicy... resourcePolicies) {
        if (getResourcePolicies() == null) {
            this.resourcePolicies = new java.util.ArrayList<ResourcePolicy>(resourcePolicies.length);
        }
        for (ResourcePolicy value : resourcePolicies) {
            this.resourcePolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resource policies that exist in this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcePolicies <p>
     *            The resource policies that exist in this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourcePoliciesResult withResourcePolicies(
            java.util.Collection<ResourcePolicy> resourcePolicies) {
        setResourcePolicies(resourcePolicies);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. The token expires
     *         after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResourcePoliciesResult withNextToken(String nextToken) {
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
        if (getResourcePolicies() != null)
            sb.append("resourcePolicies: " + getResourcePolicies() + ",");
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
                + ((getResourcePolicies() == null) ? 0 : getResourcePolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourcePoliciesResult == false)
            return false;
        DescribeResourcePoliciesResult other = (DescribeResourcePoliciesResult) obj;

        if (other.getResourcePolicies() == null ^ this.getResourcePolicies() == null)
            return false;
        if (other.getResourcePolicies() != null
                && other.getResourcePolicies().equals(this.getResourcePolicies()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
