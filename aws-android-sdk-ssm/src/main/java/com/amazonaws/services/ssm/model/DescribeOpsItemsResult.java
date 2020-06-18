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

public class DescribeOpsItemsResult implements Serializable {
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     */
    private java.util.List<OpsItemSummary> opsItemSummaries;

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
    public DescribeOpsItemsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     *
     * @return <p>
     *         A list of OpsItems.
     *         </p>
     */
    public java.util.List<OpsItemSummary> getOpsItemSummaries() {
        return opsItemSummaries;
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     *
     * @param opsItemSummaries <p>
     *            A list of OpsItems.
     *            </p>
     */
    public void setOpsItemSummaries(java.util.Collection<OpsItemSummary> opsItemSummaries) {
        if (opsItemSummaries == null) {
            this.opsItemSummaries = null;
            return;
        }

        this.opsItemSummaries = new java.util.ArrayList<OpsItemSummary>(opsItemSummaries);
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param opsItemSummaries <p>
     *            A list of OpsItems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOpsItemsResult withOpsItemSummaries(OpsItemSummary... opsItemSummaries) {
        if (getOpsItemSummaries() == null) {
            this.opsItemSummaries = new java.util.ArrayList<OpsItemSummary>(opsItemSummaries.length);
        }
        for (OpsItemSummary value : opsItemSummaries) {
            this.opsItemSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of OpsItems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param opsItemSummaries <p>
     *            A list of OpsItems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOpsItemsResult withOpsItemSummaries(
            java.util.Collection<OpsItemSummary> opsItemSummaries) {
        setOpsItemSummaries(opsItemSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOpsItemSummaries() != null)
            sb.append("OpsItemSummaries: " + getOpsItemSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getOpsItemSummaries() == null) ? 0 : getOpsItemSummaries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOpsItemsResult == false)
            return false;
        DescribeOpsItemsResult other = (DescribeOpsItemsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOpsItemSummaries() == null ^ this.getOpsItemSummaries() == null)
            return false;
        if (other.getOpsItemSummaries() != null
                && other.getOpsItemSummaries().equals(this.getOpsItemSummaries()) == false)
            return false;
        return true;
    }
}
