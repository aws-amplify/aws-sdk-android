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


public class ListCommandsResult implements Serializable {
    /**
     * <p>(Optional) The list of commands requested by the user. </p>
     */
    private java.util.List<Command> commands;

    /**
     * <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>(Optional) The list of commands requested by the user. </p>
     *
     * @return <p>(Optional) The list of commands requested by the user. </p>
     */
    public java.util.List<Command> getCommands() {
        return commands;
    }

    /**
     * <p>(Optional) The list of commands requested by the user. </p>
     *
     * @param commands <p>(Optional) The list of commands requested by the user. </p>
     */
    public void setCommands(java.util.Collection<Command> commands) {
        if (commands == null) {
            this.commands = null;
            return;
        }

        this.commands = new java.util.ArrayList<Command>(commands);
    }

    /**
     * <p>(Optional) The list of commands requested by the user. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commands <p>(Optional) The list of commands requested by the user. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsResult withCommands(Command... commands) {
        if (getCommands() == null) {
            this.commands = new java.util.ArrayList<Command>(commands.length);
        }
        for (Command value : commands) {
            this.commands.add(value);
        }
        return this;
    }

    /**
     * <p>(Optional) The list of commands requested by the user. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commands <p>(Optional) The list of commands requested by the user. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsResult withCommands(java.util.Collection<Command> commands) {
        setCommands(commands);
        return this;
    }

    /**
     * <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @param nextToken <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsResult withNextToken(String nextToken) {
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
        if (getCommands() != null) sb.append("Commands: " + getCommands() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommands() == null) ? 0 : getCommands().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListCommandsResult == false) return false;
        ListCommandsResult other = (ListCommandsResult)obj;

        if (other.getCommands() == null ^ this.getCommands() == null) return false;
        if (other.getCommands() != null && other.getCommands().equals(this.getCommands()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
