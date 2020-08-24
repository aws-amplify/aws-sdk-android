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
 * <p>Sends a signal to an Automation execution to change the current behavior or status of the execution. </p>
 */
public class SendAutomationSignalRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String automationExecutionId;

    /**
     * <p>The type of signal to send to an Automation execution. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Approve, Reject, StartStep, StopStep, Resume
     */
    private String signalType;

    /**
     * <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     */
    private java.util.Map<String, java.util.List<String>> payload;

    /**
     * <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     */
    public String getAutomationExecutionId() {
        return automationExecutionId;
    }

    /**
     * <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     */
    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>The unique identifier for an existing Automation execution that you want to send the signal to.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SendAutomationSignalRequest withAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
        return this;
    }

    /**
     * <p>The type of signal to send to an Automation execution. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Approve, Reject, StartStep, StopStep, Resume
     *
     * @return <p>The type of signal to send to an Automation execution. </p>
     *
     * @see SignalType
     */
    public String getSignalType() {
        return signalType;
    }

    /**
     * <p>The type of signal to send to an Automation execution. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Approve, Reject, StartStep, StopStep, Resume
     *
     * @param signalType <p>The type of signal to send to an Automation execution. </p>
     *
     * @see SignalType
     */
    public void setSignalType(String signalType) {
        this.signalType = signalType;
    }

    /**
     * <p>The type of signal to send to an Automation execution. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Approve, Reject, StartStep, StopStep, Resume
     *
     * @param signalType <p>The type of signal to send to an Automation execution. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SignalType
     */
    public SendAutomationSignalRequest withSignalType(String signalType) {
        this.signalType = signalType;
        return this;
    }

    /**
     * <p>The type of signal to send to an Automation execution. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Approve, Reject, StartStep, StopStep, Resume
     *
     * @param signalType <p>The type of signal to send to an Automation execution. </p>
     *
     * @see SignalType
     */
    public void setSignalType(SignalType signalType) {
        this.signalType = signalType.toString();
    }

    /**
     * <p>The type of signal to send to an Automation execution. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Approve, Reject, StartStep, StopStep, Resume
     *
     * @param signalType <p>The type of signal to send to an Automation execution. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SignalType
     */
    public SendAutomationSignalRequest withSignalType(SignalType signalType) {
        this.signalType = signalType.toString();
        return this;
    }

    /**
     * <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     *
     * @return <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     */
    public java.util.Map<String, java.util.List<String>> getPayload() {
        return payload;
    }

    /**
     * <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     *
     * @param payload <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     */
    public void setPayload(java.util.Map<String, java.util.List<String>> payload) {
        this.payload = payload;
    }

    /**
     * <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param payload <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SendAutomationSignalRequest withPayload(java.util.Map<String, java.util.List<String>> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * <p>The data sent with the signal. The data schema depends on the type of signal used in the request.</p> <p>For <code>Approve</code> and <code>Reject</code> signal types, the payload is an optional comment that you can send with the signal type. For example:</p> <p> <code>Comment="Looks good"</code> </p> <p>For <code>StartStep</code> and <code>Resume</code> signal types, you must send the name of the Automation step to start or resume as the payload. For example:</p> <p> <code>StepName="step1"</code> </p> <p>For the <code>StopStep</code> signal type, you must send the step execution ID as the payload. For example:</p> <p> <code>StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab"</code> </p>
     * <p>
     * The method adds a new key-value pair into Payload parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Payload.
     * @param value The corresponding value of the entry to be added into Payload.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SendAutomationSignalRequest addPayloadEntry(String key, java.util.List<String> value) {
        if (null == this.payload) {
            this.payload = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.payload.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.payload.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Payload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public SendAutomationSignalRequest clearPayloadEntries() {
        this.payload = null;
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
        if (getAutomationExecutionId() != null) sb.append("AutomationExecutionId: " + getAutomationExecutionId() + ",");
        if (getSignalType() != null) sb.append("SignalType: " + getSignalType() + ",");
        if (getPayload() != null) sb.append("Payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getSignalType() == null) ? 0 : getSignalType().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendAutomationSignalRequest == false) return false;
        SendAutomationSignalRequest other = (SendAutomationSignalRequest)obj;

        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null) return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false) return false;
        if (other.getSignalType() == null ^ this.getSignalType() == null) return false;
        if (other.getSignalType() != null && other.getSignalType().equals(this.getSignalType()) == false) return false;
        if (other.getPayload() == null ^ this.getPayload() == null) return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false) return false;
        return true;
    }
}
