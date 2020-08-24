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


public class SendCommandResult implements Serializable {
    /**
     * <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     */
    private Command command;

    /**
     * <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     *
     * @return <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     */
    public Command getCommand() {
        return command;
    }

    /**
     * <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     *
     * @param command <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command <p>The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SendCommandResult withCommand(Command command) {
        this.command = command;
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
        if (getCommand() != null) sb.append("Command: " + getCommand());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendCommandResult == false) return false;
        SendCommandResult other = (SendCommandResult)obj;

        if (other.getCommand() == null ^ this.getCommand() == null) return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false) return false;
        return true;
    }
}
