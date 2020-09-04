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
 * <p>Information about a scheduled execution for a maintenance window.</p>
 */
public class ScheduledWindowExecution implements Serializable {
    /**
     * <p>The ID of the maintenance window to be run.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>The name of the maintenance window to be run.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     */
    private String executionTime;

    /**
     * <p>The ID of the maintenance window to be run.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>The ID of the maintenance window to be run.</p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>The ID of the maintenance window to be run.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the maintenance window to be run.</p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>The ID of the maintenance window to be run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>The ID of the maintenance window to be run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ScheduledWindowExecution withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>The name of the maintenance window to be run.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the maintenance window to be run.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the maintenance window to be run.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the maintenance window to be run.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the maintenance window to be run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the maintenance window to be run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ScheduledWindowExecution withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     *
     * @return <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     */
    public String getExecutionTime() {
        return executionTime;
    }

    /**
     * <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     *
     * @param executionTime <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     */
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionTime <p>The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ScheduledWindowExecution withExecutionTime(String executionTime) {
        this.executionTime = executionTime;
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
        if (getWindowId() != null) sb.append("WindowId: " + getWindowId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getExecutionTime() != null) sb.append("ExecutionTime: " + getExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledWindowExecution == false) return false;
        ScheduledWindowExecution other = (ScheduledWindowExecution)obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null) return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null) return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false) return false;
        return true;
    }
}
