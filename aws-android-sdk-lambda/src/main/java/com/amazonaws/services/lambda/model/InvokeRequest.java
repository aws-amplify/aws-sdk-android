/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#invoke(InvokeRequest) Invoke operation}.
 * 
 *
 * @see com.amazonaws.services.lambda.AWSLambda#invoke(InvokeRequest)
 */
public class InvokeRequest extends AmazonWebServiceRequest implements Serializable {

    private String functionName;

    private String invocationType;

    private String logType;

    private String clientContext;

    private java.nio.ByteBuffer payload;

    /**
     * Returns the value of the FunctionName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @return The value of the FunctionName property for this object.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * Sets the value of the FunctionName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The new value for the FunctionName property for this object.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * Sets the value of the FunctionName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The new value for the FunctionName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Returns the value of the InvocationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @return The value of the InvocationType property for this object.
     *
     * @see InvocationType
     */
    public String getInvocationType() {
        return invocationType;
    }
    
    /**
     * Sets the value of the InvocationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType The new value for the InvocationType property for this object.
     *
     * @see InvocationType
     */
    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }
    
    /**
     * Sets the value of the InvocationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType The new value for the InvocationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InvocationType
     */
    public InvokeRequest withInvocationType(String invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * Sets the value of the InvocationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType The new value for the InvocationType property for this object.
     *
     * @see InvocationType
     */
    public void setInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
    }
    
    /**
     * Sets the value of the InvocationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType The new value for the InvocationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InvocationType
     */
    public InvokeRequest withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
        return this;
    }

    /**
     * Returns the value of the LogType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @return The value of the LogType property for this object.
     *
     * @see LogType
     */
    public String getLogType() {
        return logType;
    }
    
    /**
     * Sets the value of the LogType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType The new value for the LogType property for this object.
     *
     * @see LogType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }
    
    /**
     * Sets the value of the LogType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType The new value for the LogType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogType
     */
    public InvokeRequest withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * Sets the value of the LogType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType The new value for the LogType property for this object.
     *
     * @see LogType
     */
    public void setLogType(LogType logType) {
        this.logType = logType.toString();
    }
    
    /**
     * Sets the value of the LogType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType The new value for the LogType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogType
     */
    public InvokeRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * Returns the value of the ClientContext property for this object.
     *
     * @return The value of the ClientContext property for this object.
     */
    public String getClientContext() {
        return clientContext;
    }
    
    /**
     * Sets the value of the ClientContext property for this object.
     *
     * @param clientContext The new value for the ClientContext property for this object.
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }
    
    /**
     * Sets the value of the ClientContext property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientContext The new value for the ClientContext property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * Returns the value of the Payload property for this object.
     *
     * @return The value of the Payload property for this object.
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }
    
    /**
     * Sets the value of the Payload property for this object.
     *
     * @param payload The new value for the Payload property for this object.
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }
    
    /**
     * Sets the value of the Payload property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param payload The new value for the Payload property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeRequest withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
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
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getInvocationType() != null) sb.append("InvocationType: " + getInvocationType() + ",");
        if (getLogType() != null) sb.append("LogType: " + getLogType() + ",");
        if (getClientContext() != null) sb.append("ClientContext: " + getClientContext() + ",");
        if (getPayload() != null) sb.append("Payload: " + getPayload() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode()); 
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode()); 
        hashCode = prime * hashCode + ((getClientContext() == null) ? 0 : getClientContext().hashCode()); 
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InvokeRequest == false) return false;
        InvokeRequest other = (InvokeRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getInvocationType() == null ^ this.getInvocationType() == null) return false;
        if (other.getInvocationType() != null && other.getInvocationType().equals(this.getInvocationType()) == false) return false; 
        if (other.getLogType() == null ^ this.getLogType() == null) return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false) return false; 
        if (other.getClientContext() == null ^ this.getClientContext() == null) return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false) return false; 
        if (other.getPayload() == null ^ this.getPayload() == null) return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false) return false; 
        return true;
    }
    
}
    