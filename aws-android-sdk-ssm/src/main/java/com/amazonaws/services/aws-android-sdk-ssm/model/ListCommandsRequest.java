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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Lists the commands requested by users of the AWS account.</p>
 */
public class ListCommandsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>(Optional) If provided, lists only the specified command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String commandId;

    /**
     * <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>(Optional) The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     */
    private java.util.List<CommandFilter> filters;

    /**
     * <p>(Optional) If provided, lists only the specified command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>(Optional) If provided, lists only the specified command.</p>
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * <p>(Optional) If provided, lists only the specified command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>(Optional) If provided, lists only the specified command.</p>
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>(Optional) If provided, lists only the specified command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>(Optional) If provided, lists only the specified command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsRequest withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>(Optional) Lists commands issued against this instance ID.</p> <note> <p>You can't specify an instance ID in the same command that you specify <code>Status</code> = <code>Pending</code>. This is because the command has not reached the instance yet.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>(Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public ListCommandsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     *
     * @return <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     */
    public java.util.List<CommandFilter> getFilters() {
        return filters;
    }

    /**
     * <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     *
     * @param filters <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     */
    public void setFilters(java.util.Collection<CommandFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<CommandFilter>(filters);
    }

    /**
     * <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsRequest withFilters(CommandFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<CommandFilter>(filters.length);
        }
        for (CommandFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>(Optional) One or more filters. Use a filter to return a more specific list of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListCommandsRequest withFilters(java.util.Collection<CommandFilter> filters) {
        setFilters(filters);
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
        if (getCommandId() != null) sb.append("CommandId: " + getCommandId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListCommandsRequest == false) return false;
        ListCommandsRequest other = (ListCommandsRequest)obj;

        if (other.getCommandId() == null ^ this.getCommandId() == null) return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false) return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        return true;
    }
}
