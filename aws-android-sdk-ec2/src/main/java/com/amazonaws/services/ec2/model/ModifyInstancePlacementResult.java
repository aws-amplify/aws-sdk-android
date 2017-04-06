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
 * Contains the output of ModifyInstancePlacement.
 * </p>
 */
public class ModifyInstancePlacementResult implements Serializable {

    /**
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     */
    private Boolean returnValue;

    /**
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     *
     * @return Is <code>true</code> if the request succeeds, and an error otherwise.
     */
    public Boolean isReturn() {
        return returnValue;
    }
    
    /**
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     *
     * @param returnValue Is <code>true</code> if the request succeeds, and an error otherwise.
     */
    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }
    
    /**
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnValue Is <code>true</code> if the request succeeds, and an error otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyInstancePlacementResult withReturn(Boolean returnValue) {
        this.returnValue = returnValue;
        return this;
    }

    /**
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     *
     * @return Is <code>true</code> if the request succeeds, and an error otherwise.
     */
    public Boolean getReturn() {
        return returnValue;
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
        if (isReturn() != null) sb.append("Return: " + isReturn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isReturn() == null) ? 0 : isReturn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyInstancePlacementResult == false) return false;
        ModifyInstancePlacementResult other = (ModifyInstancePlacementResult)obj;
        
        if (other.isReturn() == null ^ this.isReturn() == null) return false;
        if (other.isReturn() != null && other.isReturn().equals(this.isReturn()) == false) return false; 
        return true;
    }
    
}
    