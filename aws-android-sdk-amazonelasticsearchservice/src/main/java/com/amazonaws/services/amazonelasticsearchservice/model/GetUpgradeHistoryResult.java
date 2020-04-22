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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for response returned by <code> <a>GetUpgradeHistory</a> </code>
 * operation.
 * </p>
 */
public class GetUpgradeHistoryResult implements Serializable {
    /**
     * <p>
     * A list of <code> <a>UpgradeHistory</a> </code> objects corresponding to
     * each Upgrade or Upgrade Eligibility Check performed on a domain returned
     * as part of <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     * </p>
     */
    private java.util.List<UpgradeHistory> upgradeHistories;

    /**
     * <p>
     * Pagination token that needs to be supplied to the next call to get the
     * next page of results
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code> <a>UpgradeHistory</a> </code> objects corresponding to
     * each Upgrade or Upgrade Eligibility Check performed on a domain returned
     * as part of <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     * </p>
     *
     * @return <p>
     *         A list of <code> <a>UpgradeHistory</a> </code> objects
     *         corresponding to each Upgrade or Upgrade Eligibility Check
     *         performed on a domain returned as part of
     *         <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     *         </p>
     */
    public java.util.List<UpgradeHistory> getUpgradeHistories() {
        return upgradeHistories;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeHistory</a> </code> objects corresponding to
     * each Upgrade or Upgrade Eligibility Check performed on a domain returned
     * as part of <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     * </p>
     *
     * @param upgradeHistories <p>
     *            A list of <code> <a>UpgradeHistory</a> </code> objects
     *            corresponding to each Upgrade or Upgrade Eligibility Check
     *            performed on a domain returned as part of
     *            <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     *            </p>
     */
    public void setUpgradeHistories(java.util.Collection<UpgradeHistory> upgradeHistories) {
        if (upgradeHistories == null) {
            this.upgradeHistories = null;
            return;
        }

        this.upgradeHistories = new java.util.ArrayList<UpgradeHistory>(upgradeHistories);
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeHistory</a> </code> objects corresponding to
     * each Upgrade or Upgrade Eligibility Check performed on a domain returned
     * as part of <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upgradeHistories <p>
     *            A list of <code> <a>UpgradeHistory</a> </code> objects
     *            corresponding to each Upgrade or Upgrade Eligibility Check
     *            performed on a domain returned as part of
     *            <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeHistoryResult withUpgradeHistories(UpgradeHistory... upgradeHistories) {
        if (getUpgradeHistories() == null) {
            this.upgradeHistories = new java.util.ArrayList<UpgradeHistory>(upgradeHistories.length);
        }
        for (UpgradeHistory value : upgradeHistories) {
            this.upgradeHistories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeHistory</a> </code> objects corresponding to
     * each Upgrade or Upgrade Eligibility Check performed on a domain returned
     * as part of <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upgradeHistories <p>
     *            A list of <code> <a>UpgradeHistory</a> </code> objects
     *            corresponding to each Upgrade or Upgrade Eligibility Check
     *            performed on a domain returned as part of
     *            <code> <a>GetUpgradeHistoryResponse</a> </code> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeHistoryResult withUpgradeHistories(
            java.util.Collection<UpgradeHistory> upgradeHistories) {
        setUpgradeHistories(upgradeHistories);
        return this;
    }

    /**
     * <p>
     * Pagination token that needs to be supplied to the next call to get the
     * next page of results
     * </p>
     *
     * @return <p>
     *         Pagination token that needs to be supplied to the next call to
     *         get the next page of results
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token that needs to be supplied to the next call to get the
     * next page of results
     * </p>
     *
     * @param nextToken <p>
     *            Pagination token that needs to be supplied to the next call to
     *            get the next page of results
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token that needs to be supplied to the next call to get the
     * next page of results
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Pagination token that needs to be supplied to the next call to
     *            get the next page of results
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUpgradeHistoryResult withNextToken(String nextToken) {
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
        if (getUpgradeHistories() != null)
            sb.append("UpgradeHistories: " + getUpgradeHistories() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUpgradeHistories() == null) ? 0 : getUpgradeHistories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUpgradeHistoryResult == false)
            return false;
        GetUpgradeHistoryResult other = (GetUpgradeHistoryResult) obj;

        if (other.getUpgradeHistories() == null ^ this.getUpgradeHistories() == null)
            return false;
        if (other.getUpgradeHistories() != null
                && other.getUpgradeHistories().equals(this.getUpgradeHistories()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
