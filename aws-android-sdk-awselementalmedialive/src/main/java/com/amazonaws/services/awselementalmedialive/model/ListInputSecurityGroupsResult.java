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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for ListInputSecurityGroupsResponse
 */
public class ListInputSecurityGroupsResult implements Serializable {
    /**
     * List of input security groups
     */
    private java.util.List<InputSecurityGroup> inputSecurityGroups;

    /**
     * Placeholder documentation for __string
     */
    private String nextToken;

    /**
     * List of input security groups
     *
     * @return List of input security groups
     */
    public java.util.List<InputSecurityGroup> getInputSecurityGroups() {
        return inputSecurityGroups;
    }

    /**
     * List of input security groups
     *
     * @param inputSecurityGroups List of input security groups
     */
    public void setInputSecurityGroups(java.util.Collection<InputSecurityGroup> inputSecurityGroups) {
        if (inputSecurityGroups == null) {
            this.inputSecurityGroups = null;
            return;
        }

        this.inputSecurityGroups = new java.util.ArrayList<InputSecurityGroup>(inputSecurityGroups);
    }

    /**
     * List of input security groups
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSecurityGroups List of input security groups
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputSecurityGroupsResult withInputSecurityGroups(
            InputSecurityGroup... inputSecurityGroups) {
        if (getInputSecurityGroups() == null) {
            this.inputSecurityGroups = new java.util.ArrayList<InputSecurityGroup>(
                    inputSecurityGroups.length);
        }
        for (InputSecurityGroup value : inputSecurityGroups) {
            this.inputSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * List of input security groups
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSecurityGroups List of input security groups
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputSecurityGroupsResult withInputSecurityGroups(
            java.util.Collection<InputSecurityGroup> inputSecurityGroups) {
        setInputSecurityGroups(inputSecurityGroups);
        return this;
    }

    /**
     * Placeholder documentation for __string
     *
     * @return Placeholder documentation for __string
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Placeholder documentation for __string
     *
     * @param nextToken Placeholder documentation for __string
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Placeholder documentation for __string
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Placeholder documentation for __string
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInputSecurityGroupsResult withNextToken(String nextToken) {
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
        if (getInputSecurityGroups() != null)
            sb.append("InputSecurityGroups: " + getInputSecurityGroups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputSecurityGroups() == null) ? 0 : getInputSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInputSecurityGroupsResult == false)
            return false;
        ListInputSecurityGroupsResult other = (ListInputSecurityGroupsResult) obj;

        if (other.getInputSecurityGroups() == null ^ this.getInputSecurityGroups() == null)
            return false;
        if (other.getInputSecurityGroups() != null
                && other.getInputSecurityGroups().equals(this.getInputSecurityGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
