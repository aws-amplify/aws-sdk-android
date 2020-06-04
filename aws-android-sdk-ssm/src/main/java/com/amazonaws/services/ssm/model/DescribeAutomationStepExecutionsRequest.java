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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Information about all active and terminated step executions in an Automation
 * workflow.
 * </p>
 */
public class DescribeAutomationStepExecutionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Automation execution ID for which you want step execution
     * descriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String automationExecutionId;

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by
     * the request.
     * </p>
     */
    private java.util.List<StepExecutionFilter> filters;

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order
     * by start time. The default value is false.
     * </p>
     */
    private Boolean reverseOrder;

    /**
     * <p>
     * The Automation execution ID for which you want step execution
     * descriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The Automation execution ID for which you want step execution
     *         descriptions.
     *         </p>
     */
    public String getAutomationExecutionId() {
        return automationExecutionId;
    }

    /**
     * <p>
     * The Automation execution ID for which you want step execution
     * descriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>
     *            The Automation execution ID for which you want step execution
     *            descriptions.
     *            </p>
     */
    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The Automation execution ID for which you want step execution
     * descriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>
     *            The Automation execution ID for which you want step execution
     *            descriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutomationStepExecutionsRequest withAutomationExecutionId(
            String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by
     * the request.
     * </p>
     *
     * @return <p>
     *         One or more filters to limit the number of step executions
     *         returned by the request.
     *         </p>
     */
    public java.util.List<StepExecutionFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by
     * the request.
     * </p>
     *
     * @param filters <p>
     *            One or more filters to limit the number of step executions
     *            returned by the request.
     *            </p>
     */
    public void setFilters(java.util.Collection<StepExecutionFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<StepExecutionFilter>(filters);
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by
     * the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters to limit the number of step executions
     *            returned by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutomationStepExecutionsRequest withFilters(StepExecutionFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<StepExecutionFilter>(filters.length);
        }
        for (StepExecutionFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by
     * the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters to limit the number of step executions
     *            returned by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutomationStepExecutionsRequest withFilters(
            java.util.Collection<StepExecutionFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutomationStepExecutionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutomationStepExecutionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order
     * by start time. The default value is false.
     * </p>
     *
     * @return <p>
     *         A boolean that indicates whether to list step executions in
     *         reverse order by start time. The default value is false.
     *         </p>
     */
    public Boolean isReverseOrder() {
        return reverseOrder;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order
     * by start time. The default value is false.
     * </p>
     *
     * @return <p>
     *         A boolean that indicates whether to list step executions in
     *         reverse order by start time. The default value is false.
     *         </p>
     */
    public Boolean getReverseOrder() {
        return reverseOrder;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order
     * by start time. The default value is false.
     * </p>
     *
     * @param reverseOrder <p>
     *            A boolean that indicates whether to list step executions in
     *            reverse order by start time. The default value is false.
     *            </p>
     */
    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order
     * by start time. The default value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reverseOrder <p>
     *            A boolean that indicates whether to list step executions in
     *            reverse order by start time. The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutomationStepExecutionsRequest withReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: " + getAutomationExecutionId() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: " + getReverseOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutomationStepExecutionsRequest == false)
            return false;
        DescribeAutomationStepExecutionsRequest other = (DescribeAutomationStepExecutionsRequest) obj;

        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null
                && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null
                && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        return true;
    }
}
