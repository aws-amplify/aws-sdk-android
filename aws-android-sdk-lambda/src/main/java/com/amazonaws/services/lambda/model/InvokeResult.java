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

/**
 * Invoke Result
 */
public class InvokeResult implements Serializable {

    private Integer statusCode;

    private String functionError;

    private String logResult;

    private java.nio.ByteBuffer payload;

    /**
     * Returns the value of the StatusCode property for this object.
     *
     * @return The value of the StatusCode property for this object.
     */
    public Integer getStatusCode() {
        return statusCode;
    }
    
    /**
     * Sets the value of the StatusCode property for this object.
     *
     * @param statusCode The new value for the StatusCode property for this object.
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
    /**
     * Sets the value of the StatusCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusCode The new value for the StatusCode property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeResult withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Returns the value of the FunctionError property for this object.
     *
     * @return The value of the FunctionError property for this object.
     */
    public String getFunctionError() {
        return functionError;
    }
    
    /**
     * Sets the value of the FunctionError property for this object.
     *
     * @param functionError The new value for the FunctionError property for this object.
     */
    public void setFunctionError(String functionError) {
        this.functionError = functionError;
    }
    
    /**
     * Sets the value of the FunctionError property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param functionError The new value for the FunctionError property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeResult withFunctionError(String functionError) {
        this.functionError = functionError;
        return this;
    }

    /**
     * Returns the value of the LogResult property for this object.
     *
     * @return The value of the LogResult property for this object.
     */
    public String getLogResult() {
        return logResult;
    }
    
    /**
     * Sets the value of the LogResult property for this object.
     *
     * @param logResult The new value for the LogResult property for this object.
     */
    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }
    
    /**
     * Sets the value of the LogResult property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logResult The new value for the LogResult property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InvokeResult withLogResult(String logResult) {
        this.logResult = logResult;
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
    public InvokeResult withPayload(java.nio.ByteBuffer payload) {
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
        if (getStatusCode() != null) sb.append("StatusCode: " + getStatusCode() + ",");
        if (getFunctionError() != null) sb.append("FunctionError: " + getFunctionError() + ",");
        if (getLogResult() != null) sb.append("LogResult: " + getLogResult() + ",");
        if (getPayload() != null) sb.append("Payload: " + getPayload() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionError() == null) ? 0 : getFunctionError().hashCode()); 
        hashCode = prime * hashCode + ((getLogResult() == null) ? 0 : getLogResult().hashCode()); 
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InvokeResult == false) return false;
        InvokeResult other = (InvokeResult)obj;
        
        if (other.getStatusCode() == null ^ this.getStatusCode() == null) return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false) return false; 
        if (other.getFunctionError() == null ^ this.getFunctionError() == null) return false;
        if (other.getFunctionError() != null && other.getFunctionError().equals(this.getFunctionError()) == false) return false; 
        if (other.getLogResult() == null ^ this.getLogResult() == null) return false;
        if (other.getLogResult() != null && other.getLogResult().equals(this.getLogResult()) == false) return false; 
        if (other.getPayload() == null ^ this.getPayload() == null) return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false) return false; 
        return true;
    }
    
}
    