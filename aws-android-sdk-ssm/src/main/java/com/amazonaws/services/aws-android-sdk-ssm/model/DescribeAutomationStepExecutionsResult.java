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


public class DescribeAutomationStepExecutionsResult implements Serializable {
    /**
     * <p>A list of details about the current state of all steps that make up an execution.</p>
     */
    private java.util.List<StepExecution> stepExecutions;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>A list of details about the current state of all steps that make up an execution.</p>
     *
     * @return <p>A list of details about the current state of all steps that make up an execution.</p>
     */
    public java.util.List<StepExecution> getStepExecutions() {
        return stepExecutions;
    }

    /**
     * <p>A list of details about the current state of all steps that make up an execution.</p>
     *
     * @param stepExecutions <p>A list of details about the current state of all steps that make up an execution.</p>
     */
    public void setStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        if (stepExecutions == null) {
            this.stepExecutions = null;
            return;
        }

        this.stepExecutions = new java.util.ArrayList<StepExecution>(stepExecutions);
    }

    /**
     * <p>A list of details about the current state of all steps that make up an execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepExecutions <p>A list of details about the current state of all steps that make up an execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAutomationStepExecutionsResult withStepExecutions(StepExecution... stepExecutions) {
        if (getStepExecutions() == null) {
            this.stepExecutions = new java.util.ArrayList<StepExecution>(stepExecutions.length);
        }
        for (StepExecution value : stepExecutions) {
            this.stepExecutions.add(value);
        }
        return this;
    }

    /**
     * <p>A list of details about the current state of all steps that make up an execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepExecutions <p>A list of details about the current state of all steps that make up an execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAutomationStepExecutionsResult withStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        setStepExecutions(stepExecutions);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAutomationStepExecutionsResult withNextToken(String nextToken) {
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
        if (getStepExecutions() != null) sb.append("StepExecutions: " + getStepExecutions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepExecutions() == null) ? 0 : getStepExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAutomationStepExecutionsResult == false) return false;
        DescribeAutomationStepExecutionsResult other = (DescribeAutomationStepExecutionsResult)obj;

        if (other.getStepExecutions() == null ^ this.getStepExecutions() == null) return false;
        if (other.getStepExecutions() != null && other.getStepExecutions().equals(this.getStepExecutions()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
