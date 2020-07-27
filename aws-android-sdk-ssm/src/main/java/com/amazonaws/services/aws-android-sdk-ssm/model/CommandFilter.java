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


/**
 * <p>Describes a command filter.</p> <note> <p>An instance ID can't be specified when a command status is <code>Pending</code> because the command hasn't run on the instance yet.</p> </note>
 */
public class CommandFilter implements Serializable {
    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName
     */
    private String key;

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String value;

    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName
     *
     * @return <p>The name of the filter.</p>
     *
     * @see CommandFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName
     *
     * @param key <p>The name of the filter.</p>
     *
     * @see CommandFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName
     *
     * @param key <p>The name of the filter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CommandFilterKey
     */
    public CommandFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName
     *
     * @param key <p>The name of the filter.</p>
     *
     * @see CommandFilterKey
     */
    public void setKey(CommandFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Status, ExecutionStage, DocumentName
     *
     * @param key <p>The name of the filter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CommandFilterKey
     */
    public CommandFilter withKey(CommandFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param value <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param value <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p> <b>InvokedAfter</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions occurring July 7, 2018, and later.</p> </li> <li> <p> <b>InvokedBefore</b>: Specify a timestamp to limit your results. For example, specify <code>2018-07-07T00:00:00Z</code> to see a list of command executions from before July 7, 2018.</p> </li> <li> <p> <b>Status</b>: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:</p> <ul> <li> <p> <code>Pending</code> </p> </li> <li> <p> <code>InProgress</code> </p> </li> <li> <p> <code>Success</code> </p> </li> <li> <p> <code>Cancelled</code> </p> </li> <li> <p> <code>Failed</code> </p> </li> <li> <p> <code>TimedOut</code> </p> </li> <li> <p> <code>Cancelling</code> </p> </li> </ul> </li> <li> <p> <b>DocumentName</b>: Specify name of the SSM document for which you want to see command execution results. For example, specify <code>AWS-RunPatchBaseline</code> to see command executions that used this SSM document to perform security patching operations on instances. </p> </li> <li> <p> <b>ExecutionStage</b>: Specify one of the following values:</p> <ul> <li> <p> <code>Executing</code>: Returns a list of command executions that are currently still running.</p> </li> <li> <p> <code>Complete</code>: Returns a list of command executions that have already completed. </p> </li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandFilter withValue(String value) {
        this.value = value;
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
        if (getKey() != null) sb.append("key: " + getKey() + ",");
        if (getValue() != null) sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CommandFilter == false) return false;
        CommandFilter other = (CommandFilter)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        return true;
    }
}
