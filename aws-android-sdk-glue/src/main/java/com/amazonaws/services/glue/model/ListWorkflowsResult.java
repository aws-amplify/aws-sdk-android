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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class ListWorkflowsResult implements Serializable {
    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     */
    private java.util.List<String> workflows;

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     *
     * @return <p>
     *         List of names of workflows in the account.
     *         </p>
     */
    public java.util.List<String> getWorkflows() {
        return workflows;
    }

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     *
     * @param workflows <p>
     *            List of names of workflows in the account.
     *            </p>
     */
    public void setWorkflows(java.util.Collection<String> workflows) {
        if (workflows == null) {
            this.workflows = null;
            return;
        }

        this.workflows = new java.util.ArrayList<String>(workflows);
    }

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workflows <p>
     *            List of names of workflows in the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkflowsResult withWorkflows(String... workflows) {
        if (getWorkflows() == null) {
            this.workflows = new java.util.ArrayList<String>(workflows.length);
        }
        for (String value : workflows) {
            this.workflows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of names of workflows in the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workflows <p>
     *            List of names of workflows in the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkflowsResult withWorkflows(java.util.Collection<String> workflows) {
        setWorkflows(workflows);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     *
     * @return <p>
     *         A continuation token, if not all workflow names have been
     *         returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if not all workflow names have been
     *            returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all workflow names have been returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if not all workflow names have been
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkflowsResult withNextToken(String nextToken) {
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
        if (getWorkflows() != null)
            sb.append("Workflows: " + getWorkflows() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflows() == null) ? 0 : getWorkflows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsResult == false)
            return false;
        ListWorkflowsResult other = (ListWorkflowsResult) obj;

        if (other.getWorkflows() == null ^ this.getWorkflows() == null)
            return false;
        if (other.getWorkflows() != null
                && other.getWorkflows().equals(this.getWorkflows()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
