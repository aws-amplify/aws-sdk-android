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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * An invocation is copy of a command sent to a specific instance. A command can
 * apply to one or more instances. A command invocation applies to one instance.
 * For example, if a user runs SendCommand against three instances, then a
 * command invocation is created for each requested instance ID.
 * ListCommandInvocations provide status about command execution.
 * </p>
 */
public class ListCommandInvocationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) The invocations for a specific command ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String commandId;

    /**
     * <p>
     * (Optional) The command execution details for a specific instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * </p>
     */
    private java.util.List<CommandFilter> filters;

    /**
     * <p>
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * </p>
     */
    private Boolean details;

    /**
     * <p>
     * (Optional) The invocations for a specific command ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         (Optional) The invocations for a specific command ID.
     *         </p>
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * <p>
     * (Optional) The invocations for a specific command ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>
     *            (Optional) The invocations for a specific command ID.
     *            </p>
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * (Optional) The invocations for a specific command ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>
     *            (Optional) The invocations for a specific command ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsRequest withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * <p>
     * (Optional) The command execution details for a specific instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         (Optional) The command execution details for a specific instance
     *         ID.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * (Optional) The command execution details for a specific instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            (Optional) The command execution details for a specific
     *            instance ID.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * (Optional) The command execution details for a specific instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            (Optional) The command execution details for a specific
     *            instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         (Optional) The maximum number of items to return for this call.
     *         The call also returns a token that you can specify in a
     *         subsequent call to get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            (Optional) The maximum number of items to return for this
     *            call. The call also returns a token that you can specify in a
     *            subsequent call to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            (Optional) The maximum number of items to return for this
     *            call. The call also returns a token that you can specify in a
     *            subsequent call to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public ListCommandInvocationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * </p>
     *
     * @return <p>
     *         (Optional) One or more filters. Use a filter to return a more
     *         specific list of results.
     *         </p>
     */
    public java.util.List<CommandFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * </p>
     *
     * @param filters <p>
     *            (Optional) One or more filters. Use a filter to return a more
     *            specific list of results.
     *            </p>
     */
    public void setFilters(java.util.Collection<CommandFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<CommandFilter>(filters);
    }

    /**
     * <p>
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            (Optional) One or more filters. Use a filter to return a more
     *            specific list of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsRequest withFilters(CommandFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<CommandFilter>(filters.length);
        }
        for (CommandFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            (Optional) One or more filters. Use a filter to return a more
     *            specific list of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsRequest withFilters(java.util.Collection<CommandFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * </p>
     *
     * @return <p>
     *         (Optional) If set this returns the response of the command
     *         executions and any command output. By default this is set to
     *         False.
     *         </p>
     */
    public Boolean isDetails() {
        return details;
    }

    /**
     * <p>
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * </p>
     *
     * @return <p>
     *         (Optional) If set this returns the response of the command
     *         executions and any command output. By default this is set to
     *         False.
     *         </p>
     */
    public Boolean getDetails() {
        return details;
    }

    /**
     * <p>
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * </p>
     *
     * @param details <p>
     *            (Optional) If set this returns the response of the command
     *            executions and any command output. By default this is set to
     *            False.
     *            </p>
     */
    public void setDetails(Boolean details) {
        this.details = details;
    }

    /**
     * <p>
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            (Optional) If set this returns the response of the command
     *            executions and any command output. By default this is set to
     *            False.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCommandInvocationsRequest withDetails(Boolean details) {
        this.details = details;
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
        if (getCommandId() != null)
            sb.append("CommandId: " + getCommandId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCommandInvocationsRequest == false)
            return false;
        ListCommandInvocationsRequest other = (ListCommandInvocationsRequest) obj;

        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null
                && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
