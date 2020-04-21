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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

public class GetCostAndUsageResult implements Serializable {
    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or
     * <code>GroupBy</code> parameters in the request.
     * </p>
     */
    private java.util.List<GroupDefinition> groupDefinitions;

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     */
    private java.util.List<ResultByTime> resultsByTime;

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token for the next set of retrievable results. AWS provides
     *         the token when the response from a previous call has more results
     *         than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or
     * <code>GroupBy</code> parameters in the request.
     * </p>
     *
     * @return <p>
     *         The groups that are specified by the <code>Filter</code> or
     *         <code>GroupBy</code> parameters in the request.
     *         </p>
     */
    public java.util.List<GroupDefinition> getGroupDefinitions() {
        return groupDefinitions;
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or
     * <code>GroupBy</code> parameters in the request.
     * </p>
     *
     * @param groupDefinitions <p>
     *            The groups that are specified by the <code>Filter</code> or
     *            <code>GroupBy</code> parameters in the request.
     *            </p>
     */
    public void setGroupDefinitions(java.util.Collection<GroupDefinition> groupDefinitions) {
        if (groupDefinitions == null) {
            this.groupDefinitions = null;
            return;
        }

        this.groupDefinitions = new java.util.ArrayList<GroupDefinition>(groupDefinitions);
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or
     * <code>GroupBy</code> parameters in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupDefinitions <p>
     *            The groups that are specified by the <code>Filter</code> or
     *            <code>GroupBy</code> parameters in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageResult withGroupDefinitions(GroupDefinition... groupDefinitions) {
        if (getGroupDefinitions() == null) {
            this.groupDefinitions = new java.util.ArrayList<GroupDefinition>(
                    groupDefinitions.length);
        }
        for (GroupDefinition value : groupDefinitions) {
            this.groupDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or
     * <code>GroupBy</code> parameters in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupDefinitions <p>
     *            The groups that are specified by the <code>Filter</code> or
     *            <code>GroupBy</code> parameters in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageResult withGroupDefinitions(
            java.util.Collection<GroupDefinition> groupDefinitions) {
        setGroupDefinitions(groupDefinitions);
        return this;
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     *
     * @return <p>
     *         The time period that is covered by the results in the response.
     *         </p>
     */
    public java.util.List<ResultByTime> getResultsByTime() {
        return resultsByTime;
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     *
     * @param resultsByTime <p>
     *            The time period that is covered by the results in the
     *            response.
     *            </p>
     */
    public void setResultsByTime(java.util.Collection<ResultByTime> resultsByTime) {
        if (resultsByTime == null) {
            this.resultsByTime = null;
            return;
        }

        this.resultsByTime = new java.util.ArrayList<ResultByTime>(resultsByTime);
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultsByTime <p>
     *            The time period that is covered by the results in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageResult withResultsByTime(ResultByTime... resultsByTime) {
        if (getResultsByTime() == null) {
            this.resultsByTime = new java.util.ArrayList<ResultByTime>(resultsByTime.length);
        }
        for (ResultByTime value : resultsByTime) {
            this.resultsByTime.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultsByTime <p>
     *            The time period that is covered by the results in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCostAndUsageResult withResultsByTime(java.util.Collection<ResultByTime> resultsByTime) {
        setResultsByTime(resultsByTime);
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getGroupDefinitions() != null)
            sb.append("GroupDefinitions: " + getGroupDefinitions() + ",");
        if (getResultsByTime() != null)
            sb.append("ResultsByTime: " + getResultsByTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode
                + ((getGroupDefinitions() == null) ? 0 : getGroupDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getResultsByTime() == null) ? 0 : getResultsByTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostAndUsageResult == false)
            return false;
        GetCostAndUsageResult other = (GetCostAndUsageResult) obj;

        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getGroupDefinitions() == null ^ this.getGroupDefinitions() == null)
            return false;
        if (other.getGroupDefinitions() != null
                && other.getGroupDefinitions().equals(this.getGroupDefinitions()) == false)
            return false;
        if (other.getResultsByTime() == null ^ this.getResultsByTime() == null)
            return false;
        if (other.getResultsByTime() != null
                && other.getResultsByTime().equals(this.getResultsByTime()) == false)
            return false;
        return true;
    }
}
