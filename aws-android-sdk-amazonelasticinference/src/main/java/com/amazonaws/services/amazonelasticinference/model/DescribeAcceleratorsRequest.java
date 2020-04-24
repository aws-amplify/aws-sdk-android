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

package com.amazonaws.services.amazonelasticinference.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes information over a provided set of accelerators belonging to an
 * account.
 * </p>
 */
public class DescribeAcceleratorsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     */
    private java.util.List<String> acceleratorIds;

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid
     * filter names are: accelerator-types: can provide a list of accelerator
     * type names to filter for. instance-id: can provide a list of EC2 instance
     * ids to filter for.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The total number of items to return in the command's output. If the total
     * number of items available is more than the value specified, a NextToken
     * is provided in the command's output. To resume pagination, provide the
     * NextToken value in the starting-token argument of a subsequent command.
     * Do not use the NextToken response element directly outside of the AWS
     * CLI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+/]+={0,2}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     *
     * @return <p>
     *         The IDs of the accelerators to describe.
     *         </p>
     */
    public java.util.List<String> getAcceleratorIds() {
        return acceleratorIds;
    }

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     *
     * @param acceleratorIds <p>
     *            The IDs of the accelerators to describe.
     *            </p>
     */
    public void setAcceleratorIds(java.util.Collection<String> acceleratorIds) {
        if (acceleratorIds == null) {
            this.acceleratorIds = null;
            return;
        }

        this.acceleratorIds = new java.util.ArrayList<String>(acceleratorIds);
    }

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorIds <p>
     *            The IDs of the accelerators to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorsRequest withAcceleratorIds(String... acceleratorIds) {
        if (getAcceleratorIds() == null) {
            this.acceleratorIds = new java.util.ArrayList<String>(acceleratorIds.length);
        }
        for (String value : acceleratorIds) {
            this.acceleratorIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorIds <p>
     *            The IDs of the accelerators to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorsRequest withAcceleratorIds(
            java.util.Collection<String> acceleratorIds) {
        setAcceleratorIds(acceleratorIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid
     * filter names are: accelerator-types: can provide a list of accelerator
     * type names to filter for. instance-id: can provide a list of EC2 instance
     * ids to filter for.
     * </p>
     *
     * @return <p>
     *         One or more filters. Filter names and values are case-sensitive.
     *         Valid filter names are: accelerator-types: can provide a list of
     *         accelerator type names to filter for. instance-id: can provide a
     *         list of EC2 instance ids to filter for.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid
     * filter names are: accelerator-types: can provide a list of accelerator
     * type names to filter for. instance-id: can provide a list of EC2 instance
     * ids to filter for.
     * </p>
     *
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive. Valid filter names are: accelerator-types: can
     *            provide a list of accelerator type names to filter for.
     *            instance-id: can provide a list of EC2 instance ids to filter
     *            for.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid
     * filter names are: accelerator-types: can provide a list of accelerator
     * type names to filter for. instance-id: can provide a list of EC2 instance
     * ids to filter for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive. Valid filter names are: accelerator-types: can
     *            provide a list of accelerator type names to filter for.
     *            instance-id: can provide a list of EC2 instance ids to filter
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid
     * filter names are: accelerator-types: can provide a list of accelerator
     * type names to filter for. instance-id: can provide a list of EC2 instance
     * ids to filter for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters. Filter names and values are
     *            case-sensitive. Valid filter names are: accelerator-types: can
     *            provide a list of accelerator type names to filter for.
     *            instance-id: can provide a list of EC2 instance ids to filter
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of items to return in the command's output. If the total
     * number of items available is more than the value specified, a NextToken
     * is provided in the command's output. To resume pagination, provide the
     * NextToken value in the starting-token argument of a subsequent command.
     * Do not use the NextToken response element directly outside of the AWS
     * CLI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The total number of items to return in the command's output. If
     *         the total number of items available is more than the value
     *         specified, a NextToken is provided in the command's output. To
     *         resume pagination, provide the NextToken value in the
     *         starting-token argument of a subsequent command. Do not use the
     *         NextToken response element directly outside of the AWS CLI.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the command's output. If the total
     * number of items available is more than the value specified, a NextToken
     * is provided in the command's output. To resume pagination, provide the
     * NextToken value in the starting-token argument of a subsequent command.
     * Do not use the NextToken response element directly outside of the AWS
     * CLI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxResults <p>
     *            The total number of items to return in the command's output.
     *            If the total number of items available is more than the value
     *            specified, a NextToken is provided in the command's output. To
     *            resume pagination, provide the NextToken value in the
     *            starting-token argument of a subsequent command. Do not use
     *            the NextToken response element directly outside of the AWS
     *            CLI.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the command's output. If the total
     * number of items available is more than the value specified, a NextToken
     * is provided in the command's output. To resume pagination, provide the
     * NextToken value in the starting-token argument of a subsequent command.
     * Do not use the NextToken response element directly outside of the AWS
     * CLI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxResults <p>
     *            The total number of items to return in the command's output.
     *            If the total number of items available is more than the value
     *            specified, a NextToken is provided in the command's output. To
     *            resume pagination, provide the NextToken value in the
     *            starting-token argument of a subsequent command. Do not use
     *            the NextToken response element directly outside of the AWS
     *            CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+/]+={0,2}$<br/>
     *
     * @return <p>
     *         A token to specify where to start paginating. This is the
     *         NextToken from a previously truncated response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+/]+={0,2}$<br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            NextToken from a previously truncated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9+/]+={0,2}$<br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            NextToken from a previously truncated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorsRequest withNextToken(String nextToken) {
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
        if (getAcceleratorIds() != null)
            sb.append("acceleratorIds: " + getAcceleratorIds() + ",");
        if (getFilters() != null)
            sb.append("filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
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
                + ((getAcceleratorIds() == null) ? 0 : getAcceleratorIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorsRequest == false)
            return false;
        DescribeAcceleratorsRequest other = (DescribeAcceleratorsRequest) obj;

        if (other.getAcceleratorIds() == null ^ this.getAcceleratorIds() == null)
            return false;
        if (other.getAcceleratorIds() != null
                && other.getAcceleratorIds().equals(this.getAcceleratorIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
