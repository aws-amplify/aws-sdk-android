/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Spot fleet error.
 * </p>
 */
public class CancelSpotFleetRequestsError implements Serializable {

    /**
     * The error code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError
     */
    private String code;

    /**
     * The description for the error code.
     */
    private String message;

    /**
     * The error code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError
     *
     * @return The error code.
     *
     * @see CancelBatchErrorCode
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The error code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError
     *
     * @param code The error code.
     *
     * @see CancelBatchErrorCode
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The error code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError
     *
     * @param code The error code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CancelBatchErrorCode
     */
    public CancelSpotFleetRequestsError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The error code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError
     *
     * @param code The error code.
     *
     * @see CancelBatchErrorCode
     */
    public void setCode(CancelBatchErrorCode code) {
        this.code = code.toString();
    }
    
    /**
     * The error code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError
     *
     * @param code The error code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CancelBatchErrorCode
     */
    public CancelSpotFleetRequestsError withCode(CancelBatchErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * The description for the error code.
     *
     * @return The description for the error code.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The description for the error code.
     *
     * @param message The description for the error code.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The description for the error code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The description for the error code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsError withMessage(String message) {
        this.message = message;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelSpotFleetRequestsError == false) return false;
        CancelSpotFleetRequestsError other = (CancelSpotFleetRequestsError)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    