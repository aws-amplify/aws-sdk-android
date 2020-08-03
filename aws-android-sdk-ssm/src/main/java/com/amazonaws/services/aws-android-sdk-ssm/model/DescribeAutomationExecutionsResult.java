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


public class DescribeAutomationExecutionsResult implements Serializable {
    /**
     * <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     */
    private java.util.List<AutomationExecutionMetadata> automationExecutionMetadataList;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     *
     * @return <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     */
    public java.util.List<AutomationExecutionMetadata> getAutomationExecutionMetadataList() {
        return automationExecutionMetadataList;
    }

    /**
     * <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     *
     * @param automationExecutionMetadataList <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     */
    public void setAutomationExecutionMetadataList(java.util.Collection<AutomationExecutionMetadata> automationExecutionMetadataList) {
        if (automationExecutionMetadataList == null) {
            this.automationExecutionMetadataList = null;
            return;
        }

        this.automationExecutionMetadataList = new java.util.ArrayList<AutomationExecutionMetadata>(automationExecutionMetadataList);
    }

    /**
     * <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automationExecutionMetadataList <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAutomationExecutionsResult withAutomationExecutionMetadataList(AutomationExecutionMetadata... automationExecutionMetadataList) {
        if (getAutomationExecutionMetadataList() == null) {
            this.automationExecutionMetadataList = new java.util.ArrayList<AutomationExecutionMetadata>(automationExecutionMetadataList.length);
        }
        for (AutomationExecutionMetadata value : automationExecutionMetadataList) {
            this.automationExecutionMetadataList.add(value);
        }
        return this;
    }

    /**
     * <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automationExecutionMetadataList <p>The list of details about each automation execution which has occurred which matches the filter specification, if any.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeAutomationExecutionsResult withAutomationExecutionMetadataList(java.util.Collection<AutomationExecutionMetadata> automationExecutionMetadataList) {
        setAutomationExecutionMetadataList(automationExecutionMetadataList);
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
    public DescribeAutomationExecutionsResult withNextToken(String nextToken) {
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
        if (getAutomationExecutionMetadataList() != null) sb.append("AutomationExecutionMetadataList: " + getAutomationExecutionMetadataList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionMetadataList() == null) ? 0 : getAutomationExecutionMetadataList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAutomationExecutionsResult == false) return false;
        DescribeAutomationExecutionsResult other = (DescribeAutomationExecutionsResult)obj;

        if (other.getAutomationExecutionMetadataList() == null ^ this.getAutomationExecutionMetadataList() == null) return false;
        if (other.getAutomationExecutionMetadataList() != null && other.getAutomationExecutionMetadataList().equals(this.getAutomationExecutionMetadataList()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
