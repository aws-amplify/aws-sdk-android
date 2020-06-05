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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class DescribeProvisionedProductPlanResult implements Serializable {
    /**
     * <p>
     * Information about the plan.
     * </p>
     */
    private ProvisionedProductPlanDetails provisionedProductPlanDetails;

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is
     * executed.
     * </p>
     */
    private java.util.List<ResourceChange> resourceChanges;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the plan.
     * </p>
     *
     * @return <p>
     *         Information about the plan.
     *         </p>
     */
    public ProvisionedProductPlanDetails getProvisionedProductPlanDetails() {
        return provisionedProductPlanDetails;
    }

    /**
     * <p>
     * Information about the plan.
     * </p>
     *
     * @param provisionedProductPlanDetails <p>
     *            Information about the plan.
     *            </p>
     */
    public void setProvisionedProductPlanDetails(
            ProvisionedProductPlanDetails provisionedProductPlanDetails) {
        this.provisionedProductPlanDetails = provisionedProductPlanDetails;
    }

    /**
     * <p>
     * Information about the plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedProductPlanDetails <p>
     *            Information about the plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisionedProductPlanResult withProvisionedProductPlanDetails(
            ProvisionedProductPlanDetails provisionedProductPlanDetails) {
        this.provisionedProductPlanDetails = provisionedProductPlanDetails;
        return this;
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is
     * executed.
     * </p>
     *
     * @return <p>
     *         Information about the resource changes that will occur when the
     *         plan is executed.
     *         </p>
     */
    public java.util.List<ResourceChange> getResourceChanges() {
        return resourceChanges;
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is
     * executed.
     * </p>
     *
     * @param resourceChanges <p>
     *            Information about the resource changes that will occur when
     *            the plan is executed.
     *            </p>
     */
    public void setResourceChanges(java.util.Collection<ResourceChange> resourceChanges) {
        if (resourceChanges == null) {
            this.resourceChanges = null;
            return;
        }

        this.resourceChanges = new java.util.ArrayList<ResourceChange>(resourceChanges);
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is
     * executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceChanges <p>
     *            Information about the resource changes that will occur when
     *            the plan is executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisionedProductPlanResult withResourceChanges(
            ResourceChange... resourceChanges) {
        if (getResourceChanges() == null) {
            this.resourceChanges = new java.util.ArrayList<ResourceChange>(resourceChanges.length);
        }
        for (ResourceChange value : resourceChanges) {
            this.resourceChanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource changes that will occur when the plan is
     * executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceChanges <p>
     *            Information about the resource changes that will occur when
     *            the plan is executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisionedProductPlanResult withResourceChanges(
            java.util.Collection<ResourceChange> resourceChanges) {
        setResourceChanges(resourceChanges);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token to use to retrieve the next set of results. If
     *         there are no additional results, this value is null.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisionedProductPlanResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getProvisionedProductPlanDetails() != null)
            sb.append("ProvisionedProductPlanDetails: " + getProvisionedProductPlanDetails() + ",");
        if (getResourceChanges() != null)
            sb.append("ResourceChanges: " + getResourceChanges() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProvisionedProductPlanDetails() == null) ? 0
                        : getProvisionedProductPlanDetails().hashCode());
        hashCode = prime * hashCode
                + ((getResourceChanges() == null) ? 0 : getResourceChanges().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisionedProductPlanResult == false)
            return false;
        DescribeProvisionedProductPlanResult other = (DescribeProvisionedProductPlanResult) obj;

        if (other.getProvisionedProductPlanDetails() == null
                ^ this.getProvisionedProductPlanDetails() == null)
            return false;
        if (other.getProvisionedProductPlanDetails() != null
                && other.getProvisionedProductPlanDetails().equals(
                        this.getProvisionedProductPlanDetails()) == false)
            return false;
        if (other.getResourceChanges() == null ^ this.getResourceChanges() == null)
            return false;
        if (other.getResourceChanges() != null
                && other.getResourceChanges().equals(this.getResourceChanges()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
