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


public class GetAutomationExecutionResult implements Serializable {
    /**
     * <p>Detailed information about the current state of an automation execution.</p>
     */
    private AutomationExecution automationExecution;

    /**
     * <p>Detailed information about the current state of an automation execution.</p>
     *
     * @return <p>Detailed information about the current state of an automation execution.</p>
     */
    public AutomationExecution getAutomationExecution() {
        return automationExecution;
    }

    /**
     * <p>Detailed information about the current state of an automation execution.</p>
     *
     * @param automationExecution <p>Detailed information about the current state of an automation execution.</p>
     */
    public void setAutomationExecution(AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
    }

    /**
     * <p>Detailed information about the current state of an automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automationExecution <p>Detailed information about the current state of an automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAutomationExecutionResult withAutomationExecution(AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
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
        if (getAutomationExecution() != null) sb.append("AutomationExecution: " + getAutomationExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecution() == null) ? 0 : getAutomationExecution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAutomationExecutionResult == false) return false;
        GetAutomationExecutionResult other = (GetAutomationExecutionResult)obj;

        if (other.getAutomationExecution() == null ^ this.getAutomationExecution() == null) return false;
        if (other.getAutomationExecution() != null && other.getAutomationExecution().equals(this.getAutomationExecution()) == false) return false;
        return true;
    }
}
