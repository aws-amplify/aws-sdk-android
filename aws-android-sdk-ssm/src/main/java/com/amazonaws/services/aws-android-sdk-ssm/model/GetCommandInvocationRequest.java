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
 * <p>Returns detailed information about command execution for an invocation or plugin. </p>
 */
public class GetCommandInvocationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>(Required) The parent command ID of the invocation plugin.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String commandId;

    /**
     * <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     */
    private String pluginName;

    /**
     * <p>(Required) The parent command ID of the invocation plugin.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>(Required) The parent command ID of the invocation plugin.</p>
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * <p>(Required) The parent command ID of the invocation plugin.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>(Required) The parent command ID of the invocation plugin.</p>
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>(Required) The parent command ID of the invocation plugin.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>(Required) The parent command ID of the invocation plugin.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCommandInvocationRequest withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>(Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCommandInvocationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @return <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @param pluginName <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @param pluginName <p>(Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.</p> <p>Plugin names are also referred to as step names in Systems Manager documents.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCommandInvocationRequest withPluginName(String pluginName) {
        this.pluginName = pluginName;
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
        if (getPluginName() != null) sb.append("PluginName: " + getPluginName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPluginName() == null) ? 0 : getPluginName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetCommandInvocationRequest == false) return false;
        GetCommandInvocationRequest other = (GetCommandInvocationRequest)obj;

        if (other.getCommandId() == null ^ this.getCommandId() == null) return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false) return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getPluginName() == null ^ this.getPluginName() == null) return false;
        if (other.getPluginName() != null && other.getPluginName().equals(this.getPluginName()) == false) return false;
        return true;
    }
}
