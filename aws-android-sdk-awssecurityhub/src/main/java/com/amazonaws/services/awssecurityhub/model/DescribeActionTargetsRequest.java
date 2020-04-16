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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of the custom action targets in Security Hub in your account.
 * </p>
 */
public class DescribeActionTargetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to
     * retrieve.
     * </p>
     */
    private java.util.List<String> actionTargetArns;

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>DescribeActionTargets</code> operation, set the value of this
     * parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to
     * retrieve.
     * </p>
     *
     * @return <p>
     *         A list of custom action target ARNs for the custom action targets
     *         to retrieve.
     *         </p>
     */
    public java.util.List<String> getActionTargetArns() {
        return actionTargetArns;
    }

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to
     * retrieve.
     * </p>
     *
     * @param actionTargetArns <p>
     *            A list of custom action target ARNs for the custom action
     *            targets to retrieve.
     *            </p>
     */
    public void setActionTargetArns(java.util.Collection<String> actionTargetArns) {
        if (actionTargetArns == null) {
            this.actionTargetArns = null;
            return;
        }

        this.actionTargetArns = new java.util.ArrayList<String>(actionTargetArns);
    }

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionTargetArns <p>
     *            A list of custom action target ARNs for the custom action
     *            targets to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsRequest withActionTargetArns(String... actionTargetArns) {
        if (getActionTargetArns() == null) {
            this.actionTargetArns = new java.util.ArrayList<String>(actionTargetArns.length);
        }
        for (String value : actionTargetArns) {
            this.actionTargetArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionTargetArns <p>
     *            A list of custom action target ARNs for the custom action
     *            targets to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsRequest withActionTargetArns(
            java.util.Collection<String> actionTargetArns) {
        setActionTargetArns(actionTargetArns);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>DescribeActionTargets</code> operation, set the value of this
     * parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @return <p>
     *         The token that is required for pagination. On your first call to
     *         the <code>DescribeActionTargets</code> operation, set the value
     *         of this parameter to <code>NULL</code>.
     *         </p>
     *         <p>
     *         For subsequent calls to the operation, to continue listing data,
     *         set the value of this parameter to the value returned from the
     *         previous response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>DescribeActionTargets</code> operation, set the value of this
     * parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>DescribeActionTargets</code> operation, set the
     *            value of this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>DescribeActionTargets</code> operation, set the value of this
     * parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>DescribeActionTargets</code> operation, set the
     *            value of this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getActionTargetArns() != null)
            sb.append("ActionTargetArns: " + getActionTargetArns() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActionTargetArns() == null) ? 0 : getActionTargetArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActionTargetsRequest == false)
            return false;
        DescribeActionTargetsRequest other = (DescribeActionTargetsRequest) obj;

        if (other.getActionTargetArns() == null ^ this.getActionTargetArns() == null)
            return false;
        if (other.getActionTargetArns() != null
                && other.getActionTargetArns().equals(this.getActionTargetArns()) == false)
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
        return true;
    }
}
