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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribeAssociationExecutionsResult implements Serializable {
    /**
     * <p>A list of the executions for the specified association ID.</p>
     */
    private java.util.List<AssociationExecution> associationExecutions;

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     */
    private String nextToken;

    /**
     * <p>A list of the executions for the specified association ID.</p>
     *
     * @return <p>A list of the executions for the specified association ID.</p>
     */
    public java.util.List<AssociationExecution> getAssociationExecutions() {
        return associationExecutions;
    }

    /**
     * <p>A list of the executions for the specified association ID.</p>
     *
     * @param associationExecutions <p>A list of the executions for the specified association ID.</p>
     */
    public void setAssociationExecutions(java.util.Collection<AssociationExecution> associationExecutions) {
        if (associationExecutions == null) {
            this.associationExecutions = null;
            return;
        }

        this.associationExecutions = new java.util.ArrayList<AssociationExecution>(associationExecutions);
    }

    /**
     * <p>A list of the executions for the specified association ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationExecutions <p>A list of the executions for the specified association ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAssociationExecutionsResult withAssociationExecutions(AssociationExecution... associationExecutions) {
        if (getAssociationExecutions() == null) {
            this.associationExecutions = new java.util.ArrayList<AssociationExecution>(associationExecutions.length);
        }
        for (AssociationExecution value : associationExecutions) {
            this.associationExecutions.add(value);
        }
        return this;
    }

    /**
     * <p>A list of the executions for the specified association ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationExecutions <p>A list of the executions for the specified association ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAssociationExecutionsResult withAssociationExecutions(java.util.Collection<AssociationExecution> associationExecutions) {
        setAssociationExecutions(associationExecutions);
        return this;
    }

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     *
     * @return <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     *
     * @param nextToken <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. Use this token to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAssociationExecutionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssociationExecutions() != null) sb.append("AssociationExecutions: " + getAssociationExecutions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationExecutions() == null) ? 0 : getAssociationExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAssociationExecutionsResult == false) return false;
        DescribeAssociationExecutionsResult other = (DescribeAssociationExecutionsResult)obj;

        if (other.getAssociationExecutions() == null ^ this.getAssociationExecutions() == null) return false;
        if (other.getAssociationExecutions() != null && other.getAssociationExecutions().equals(this.getAssociationExecutions()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
