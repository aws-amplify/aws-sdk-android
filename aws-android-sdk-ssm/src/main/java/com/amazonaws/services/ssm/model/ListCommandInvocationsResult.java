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

public class ListCommandInvocationsResult implements Serializable {
    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     */
    private java.util.List<CommandInvocation> commandInvocations;

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     *
     * @return <p>
     *         (Optional) A list of all invocations.
     *         </p>
     */
    public java.util.List<CommandInvocation> getCommandInvocations() {
        return commandInvocations;
    }

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     *
     * @param commandInvocations <p>
     *            (Optional) A list of all invocations.
     *            </p>
     */
    public void setCommandInvocations(java.util.Collection<CommandInvocation> commandInvocations) {
        if (commandInvocations == null) {
            this.commandInvocations = null;
            return;
        }

        this.commandInvocations = new java.util.ArrayList<CommandInvocation>(commandInvocations);
    }

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commandInvocations <p>
     *            (Optional) A list of all invocations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsResult withCommandInvocations(
            CommandInvocation... commandInvocations) {
        if (getCommandInvocations() == null) {
            this.commandInvocations = new java.util.ArrayList<CommandInvocation>(
                    commandInvocations.length);
        }
        for (CommandInvocation value : commandInvocations) {
            this.commandInvocations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commandInvocations <p>
     *            (Optional) A list of all invocations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsResult withCommandInvocations(
            java.util.Collection<CommandInvocation> commandInvocations) {
        setCommandInvocations(commandInvocations);
        return this;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * </p>
     *
     * @return <p>
     *         (Optional) The token for the next set of items to return. (You
     *         received this token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * </p>
     *
     * @param nextToken <p>
     *            (Optional) The token for the next set of items to return. (You
     *            received this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            (Optional) The token for the next set of items to return. (You
     *            received this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsResult withNextToken(String nextToken) {
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
        if (getCommandInvocations() != null)
            sb.append("CommandInvocations: " + getCommandInvocations() + ",");
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
                + ((getCommandInvocations() == null) ? 0 : getCommandInvocations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCommandInvocationsResult == false)
            return false;
        ListCommandInvocationsResult other = (ListCommandInvocationsResult) obj;

        if (other.getCommandInvocations() == null ^ this.getCommandInvocations() == null)
            return false;
        if (other.getCommandInvocations() != null
                && other.getCommandInvocations().equals(this.getCommandInvocations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
