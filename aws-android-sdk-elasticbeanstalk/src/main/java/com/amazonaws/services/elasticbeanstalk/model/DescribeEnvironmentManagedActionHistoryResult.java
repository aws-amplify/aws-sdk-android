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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A result message containing a list of completed and failed managed actions.
 * </p>
 */
public class DescribeEnvironmentManagedActionHistoryResult implements Serializable {
    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     */
    private java.util.List<ManagedActionHistoryItem> managedActionHistoryItems;

    /**
     * <p>
     * A pagination token that you pass to
     * <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     *
     * @return <p>
     *         A list of completed and failed managed actions.
     *         </p>
     */
    public java.util.List<ManagedActionHistoryItem> getManagedActionHistoryItems() {
        return managedActionHistoryItems;
    }

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     *
     * @param managedActionHistoryItems <p>
     *            A list of completed and failed managed actions.
     *            </p>
     */
    public void setManagedActionHistoryItems(
            java.util.Collection<ManagedActionHistoryItem> managedActionHistoryItems) {
        if (managedActionHistoryItems == null) {
            this.managedActionHistoryItems = null;
            return;
        }

        this.managedActionHistoryItems = new java.util.ArrayList<ManagedActionHistoryItem>(
                managedActionHistoryItems);
    }

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedActionHistoryItems <p>
     *            A list of completed and failed managed actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionHistoryResult withManagedActionHistoryItems(
            ManagedActionHistoryItem... managedActionHistoryItems) {
        if (getManagedActionHistoryItems() == null) {
            this.managedActionHistoryItems = new java.util.ArrayList<ManagedActionHistoryItem>(
                    managedActionHistoryItems.length);
        }
        for (ManagedActionHistoryItem value : managedActionHistoryItems) {
            this.managedActionHistoryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of completed and failed managed actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedActionHistoryItems <p>
     *            A list of completed and failed managed actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionHistoryResult withManagedActionHistoryItems(
            java.util.Collection<ManagedActionHistoryItem> managedActionHistoryItems) {
        setManagedActionHistoryItems(managedActionHistoryItems);
        return this;
    }

    /**
     * <p>
     * A pagination token that you pass to
     * <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     *
     * @return <p>
     *         A pagination token that you pass to
     *         <a>DescribeEnvironmentManagedActionHistory</a> to get the next
     *         page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token that you pass to
     * <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token that you pass to
     *            <a>DescribeEnvironmentManagedActionHistory</a> to get the next
     *            page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that you pass to
     * <a>DescribeEnvironmentManagedActionHistory</a> to get the next page of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token that you pass to
     *            <a>DescribeEnvironmentManagedActionHistory</a> to get the next
     *            page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEnvironmentManagedActionHistoryResult withNextToken(String nextToken) {
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
        if (getManagedActionHistoryItems() != null)
            sb.append("ManagedActionHistoryItems: " + getManagedActionHistoryItems() + ",");
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
                + ((getManagedActionHistoryItems() == null) ? 0 : getManagedActionHistoryItems()
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

        if (obj instanceof DescribeEnvironmentManagedActionHistoryResult == false)
            return false;
        DescribeEnvironmentManagedActionHistoryResult other = (DescribeEnvironmentManagedActionHistoryResult) obj;

        if (other.getManagedActionHistoryItems() == null
                ^ this.getManagedActionHistoryItems() == null)
            return false;
        if (other.getManagedActionHistoryItems() != null
                && other.getManagedActionHistoryItems().equals(this.getManagedActionHistoryItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
