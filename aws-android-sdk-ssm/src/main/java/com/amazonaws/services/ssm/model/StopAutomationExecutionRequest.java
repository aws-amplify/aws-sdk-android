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
 * Stop an Automation that is currently running.
 * </p>
 */
public class StopAutomationExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String automationExecutionId;

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and
     * Complete. The default type is Cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Complete, Cancel
     */
    private String type;

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The execution ID of the Automation to stop.
     *         </p>
     */
    public String getAutomationExecutionId() {
        return automationExecutionId;
    }

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>
     *            The execution ID of the Automation to stop.
     *            </p>
     */
    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>
     *            The execution ID of the Automation to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopAutomationExecutionRequest withAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
        return this;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and
     * Complete. The default type is Cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Complete, Cancel
     *
     * @return <p>
     *         The stop request type. Valid types include the following: Cancel
     *         and Complete. The default type is Cancel.
     *         </p>
     * @see StopType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and
     * Complete. The default type is Cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Complete, Cancel
     *
     * @param type <p>
     *            The stop request type. Valid types include the following:
     *            Cancel and Complete. The default type is Cancel.
     *            </p>
     * @see StopType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and
     * Complete. The default type is Cancel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Complete, Cancel
     *
     * @param type <p>
     *            The stop request type. Valid types include the following:
     *            Cancel and Complete. The default type is Cancel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StopType
     */
    public StopAutomationExecutionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and
     * Complete. The default type is Cancel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Complete, Cancel
     *
     * @param type <p>
     *            The stop request type. Valid types include the following:
     *            Cancel and Complete. The default type is Cancel.
     *            </p>
     * @see StopType
     */
    public void setType(StopType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and
     * Complete. The default type is Cancel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Complete, Cancel
     *
     * @param type <p>
     *            The stop request type. Valid types include the following:
     *            Cancel and Complete. The default type is Cancel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StopType
     */
    public StopAutomationExecutionRequest withType(StopType type) {
        this.type = type.toString();
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: " + getAutomationExecutionId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopAutomationExecutionRequest == false)
            return false;
        StopAutomationExecutionRequest other = (StopAutomationExecutionRequest) obj;

        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null
                && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
