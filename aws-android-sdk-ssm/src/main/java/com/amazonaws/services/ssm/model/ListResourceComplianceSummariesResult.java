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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class ListResourceComplianceSummariesResult implements Serializable {
    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary
     * count includes information about compliant and non-compliant State
     * Manager associations, patch status, or custom items according to the
     * filter criteria that you specify.
     * </p>
     */
    private java.util.List<ResourceComplianceSummaryItem> resourceComplianceSummaryItems;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary
     * count includes information about compliant and non-compliant State
     * Manager associations, patch status, or custom items according to the
     * filter criteria that you specify.
     * </p>
     *
     * @return <p>
     *         A summary count for specified or targeted managed instances.
     *         Summary count includes information about compliant and
     *         non-compliant State Manager associations, patch status, or custom
     *         items according to the filter criteria that you specify.
     *         </p>
     */
    public java.util.List<ResourceComplianceSummaryItem> getResourceComplianceSummaryItems() {
        return resourceComplianceSummaryItems;
    }

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary
     * count includes information about compliant and non-compliant State
     * Manager associations, patch status, or custom items according to the
     * filter criteria that you specify.
     * </p>
     *
     * @param resourceComplianceSummaryItems <p>
     *            A summary count for specified or targeted managed instances.
     *            Summary count includes information about compliant and
     *            non-compliant State Manager associations, patch status, or
     *            custom items according to the filter criteria that you
     *            specify.
     *            </p>
     */
    public void setResourceComplianceSummaryItems(
            java.util.Collection<ResourceComplianceSummaryItem> resourceComplianceSummaryItems) {
        if (resourceComplianceSummaryItems == null) {
            this.resourceComplianceSummaryItems = null;
            return;
        }

        this.resourceComplianceSummaryItems = new java.util.ArrayList<ResourceComplianceSummaryItem>(
                resourceComplianceSummaryItems);
    }

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary
     * count includes information about compliant and non-compliant State
     * Manager associations, patch status, or custom items according to the
     * filter criteria that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceComplianceSummaryItems <p>
     *            A summary count for specified or targeted managed instances.
     *            Summary count includes information about compliant and
     *            non-compliant State Manager associations, patch status, or
     *            custom items according to the filter criteria that you
     *            specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceComplianceSummariesResult withResourceComplianceSummaryItems(
            ResourceComplianceSummaryItem... resourceComplianceSummaryItems) {
        if (getResourceComplianceSummaryItems() == null) {
            this.resourceComplianceSummaryItems = new java.util.ArrayList<ResourceComplianceSummaryItem>(
                    resourceComplianceSummaryItems.length);
        }
        for (ResourceComplianceSummaryItem value : resourceComplianceSummaryItems) {
            this.resourceComplianceSummaryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A summary count for specified or targeted managed instances. Summary
     * count includes information about compliant and non-compliant State
     * Manager associations, patch status, or custom items according to the
     * filter criteria that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceComplianceSummaryItems <p>
     *            A summary count for specified or targeted managed instances.
     *            Summary count includes information about compliant and
     *            non-compliant State Manager associations, patch status, or
     *            custom items according to the filter criteria that you
     *            specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceComplianceSummariesResult withResourceComplianceSummaryItems(
            java.util.Collection<ResourceComplianceSummaryItem> resourceComplianceSummaryItems) {
        setResourceComplianceSummaryItems(resourceComplianceSummaryItems);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. Use this token to
     *         get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceComplianceSummariesResult withNextToken(String nextToken) {
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
        if (getResourceComplianceSummaryItems() != null)
            sb.append("ResourceComplianceSummaryItems: " + getResourceComplianceSummaryItems()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceComplianceSummaryItems() == null) ? 0
                        : getResourceComplianceSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceComplianceSummariesResult == false)
            return false;
        ListResourceComplianceSummariesResult other = (ListResourceComplianceSummariesResult) obj;

        if (other.getResourceComplianceSummaryItems() == null
                ^ this.getResourceComplianceSummaryItems() == null)
            return false;
        if (other.getResourceComplianceSummaryItems() != null
                && other.getResourceComplianceSummaryItems().equals(
                        this.getResourceComplianceSummaryItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
