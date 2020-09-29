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


public class StartAutomationExecutionResult implements Serializable {
    /**
     * <p>The unique ID of a newly scheduled automation execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String automationExecutionId;

    /**
     * <p>The unique ID of a newly scheduled automation execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>The unique ID of a newly scheduled automation execution.</p>
     */
    public String getAutomationExecutionId() {
        return automationExecutionId;
    }

    /**
     * <p>The unique ID of a newly scheduled automation execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>The unique ID of a newly scheduled automation execution.</p>
     */
    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>The unique ID of a newly scheduled automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>The unique ID of a newly scheduled automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StartAutomationExecutionResult withAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
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
        if (getAutomationExecutionId() != null) sb.append("AutomationExecutionId: " + getAutomationExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartAutomationExecutionResult == false) return false;
        StartAutomationExecutionResult other = (StartAutomationExecutionResult)obj;

        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null) return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false) return false;
        return true;
    }
}
