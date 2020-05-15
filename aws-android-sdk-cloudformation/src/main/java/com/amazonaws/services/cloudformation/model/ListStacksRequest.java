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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the summary information for stacks whose status matches the specified
 * StackStatusFilter. Summary information for stacks that have been deleted is
 * kept for 90 days after the stack is deleted. If no StackStatusFilter is
 * specified, summary information for all stacks is returned (including existing
 * stacks and stacks that have been deleted).
 * </p>
 */
public class ListStacksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string that identifies the next page of stacks that you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     */
    private java.util.List<String> stackStatusFilter;

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A string that identifies the next page of stacks that you want to
     *         retrieve.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to
     * retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that identifies the next page of stacks that you want
     *            to retrieve.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stacks that you want to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that identifies the next page of stacks that you want
     *            to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStacksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     *
     * @return <p>
     *         Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the
     *         <code>StackStatus</code> parameter of the <a>Stack</a> data type.
     *         </p>
     */
    public java.util.List<String> getStackStatusFilter() {
        return stackStatusFilter;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     *
     * @param stackStatusFilter <p>
     *            Stack status to use as a filter. Specify one or more stack
     *            status codes to list only stacks with the specified status
     *            codes. For a complete list of stack status codes, see the
     *            <code>StackStatus</code> parameter of the <a>Stack</a> data
     *            type.
     *            </p>
     */
    public void setStackStatusFilter(java.util.Collection<String> stackStatusFilter) {
        if (stackStatusFilter == null) {
            this.stackStatusFilter = null;
            return;
        }

        this.stackStatusFilter = new java.util.ArrayList<String>(stackStatusFilter);
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackStatusFilter <p>
     *            Stack status to use as a filter. Specify one or more stack
     *            status codes to list only stacks with the specified status
     *            codes. For a complete list of stack status codes, see the
     *            <code>StackStatus</code> parameter of the <a>Stack</a> data
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStacksRequest withStackStatusFilter(String... stackStatusFilter) {
        if (getStackStatusFilter() == null) {
            this.stackStatusFilter = new java.util.ArrayList<String>(stackStatusFilter.length);
        }
        for (String value : stackStatusFilter) {
            this.stackStatusFilter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Stack status to use as a filter. Specify one or more stack status codes
     * to list only stacks with the specified status codes. For a complete list
     * of stack status codes, see the <code>StackStatus</code> parameter of the
     * <a>Stack</a> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackStatusFilter <p>
     *            Stack status to use as a filter. Specify one or more stack
     *            status codes to list only stacks with the specified status
     *            codes. For a complete list of stack status codes, see the
     *            <code>StackStatus</code> parameter of the <a>Stack</a> data
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStacksRequest withStackStatusFilter(java.util.Collection<String> stackStatusFilter) {
        setStackStatusFilter(stackStatusFilter);
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
        if (getStackStatusFilter() != null)
            sb.append("StackStatusFilter: " + getStackStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getStackStatusFilter() == null) ? 0 : getStackStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStacksRequest == false)
            return false;
        ListStacksRequest other = (ListStacksRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStackStatusFilter() == null ^ this.getStackStatusFilter() == null)
            return false;
        if (other.getStackStatusFilter() != null
                && other.getStackStatusFilter().equals(this.getStackStatusFilter()) == false)
            return false;
        return true;
    }
}
