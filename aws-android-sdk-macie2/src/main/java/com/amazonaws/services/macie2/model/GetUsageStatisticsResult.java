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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class GetUsageStatisticsResult implements Serializable {
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for an account that meets the filter criteria specified
     * in the request.
     * </p>
     */
    private java.util.List<UsageRecord> records;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null if there are
     *         no additional pages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for an account that meets the filter criteria specified
     * in the request.
     * </p>
     *
     * @return <p>
     *         An array of objects that contains the results of the query. Each
     *         object contains the data for an account that meets the filter
     *         criteria specified in the request.
     *         </p>
     */
    public java.util.List<UsageRecord> getRecords() {
        return records;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for an account that meets the filter criteria specified
     * in the request.
     * </p>
     *
     * @param records <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the data for an account that meets the
     *            filter criteria specified in the request.
     *            </p>
     */
    public void setRecords(java.util.Collection<UsageRecord> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<UsageRecord>(records);
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for an account that meets the filter criteria specified
     * in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the data for an account that meets the
     *            filter criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsResult withRecords(UsageRecord... records) {
        if (getRecords() == null) {
            this.records = new java.util.ArrayList<UsageRecord>(records.length);
        }
        for (UsageRecord value : records) {
            this.records.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for an account that meets the filter criteria specified
     * in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the data for an account that meets the
     *            filter criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsResult withRecords(java.util.Collection<UsageRecord> records) {
        setRecords(records);
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
            sb.append("nextToken: " + getNextToken() + ",");
        if (getRecords() != null)
            sb.append("records: " + getRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageStatisticsResult == false)
            return false;
        GetUsageStatisticsResult other = (GetUsageStatisticsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        return true;
    }
}
