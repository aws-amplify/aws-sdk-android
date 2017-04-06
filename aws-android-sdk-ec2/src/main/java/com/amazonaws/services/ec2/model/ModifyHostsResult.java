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
 * Contains the output of ModifyHosts.
 * </p>
 */
public class ModifyHostsResult implements Serializable {

    /**
     * The IDs of the Dedicated hosts that were successfully modified.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> successful;

    /**
     * The IDs of the Dedicated hosts that could not be modified. Check
     * whether the setting you requested can be used.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessful;

    /**
     * The IDs of the Dedicated hosts that were successfully modified.
     *
     * @return The IDs of the Dedicated hosts that were successfully modified.
     */
    public java.util.List<String> getSuccessful() {
        if (successful == null) {
              successful = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              successful.setAutoConstruct(true);
        }
        return successful;
    }
    
    /**
     * The IDs of the Dedicated hosts that were successfully modified.
     *
     * @param successful The IDs of the Dedicated hosts that were successfully modified.
     */
    public void setSuccessful(java.util.Collection<String> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(successful.size());
        successfulCopy.addAll(successful);
        this.successful = successfulCopy;
    }
    
    /**
     * The IDs of the Dedicated hosts that were successfully modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful The IDs of the Dedicated hosts that were successfully modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHostsResult withSuccessful(String... successful) {
        if (getSuccessful() == null) setSuccessful(new java.util.ArrayList<String>(successful.length));
        for (String value : successful) {
            getSuccessful().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Dedicated hosts that were successfully modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful The IDs of the Dedicated hosts that were successfully modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHostsResult withSuccessful(java.util.Collection<String> successful) {
        if (successful == null) {
            this.successful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(successful.size());
            successfulCopy.addAll(successful);
            this.successful = successfulCopy;
        }

        return this;
    }

    /**
     * The IDs of the Dedicated hosts that could not be modified. Check
     * whether the setting you requested can be used.
     *
     * @return The IDs of the Dedicated hosts that could not be modified. Check
     *         whether the setting you requested can be used.
     */
    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
              unsuccessful = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>();
              unsuccessful.setAutoConstruct(true);
        }
        return unsuccessful;
    }
    
    /**
     * The IDs of the Dedicated hosts that could not be modified. Check
     * whether the setting you requested can be used.
     *
     * @param unsuccessful The IDs of the Dedicated hosts that could not be modified. Check
     *         whether the setting you requested can be used.
     */
    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>(unsuccessful.size());
        unsuccessfulCopy.addAll(unsuccessful);
        this.unsuccessful = unsuccessfulCopy;
    }
    
    /**
     * The IDs of the Dedicated hosts that could not be modified. Check
     * whether the setting you requested can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessful The IDs of the Dedicated hosts that could not be modified. Check
     *         whether the setting you requested can be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHostsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (getUnsuccessful() == null) setUnsuccessful(new java.util.ArrayList<UnsuccessfulItem>(unsuccessful.length));
        for (UnsuccessfulItem value : unsuccessful) {
            getUnsuccessful().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Dedicated hosts that could not be modified. Check
     * whether the setting you requested can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessful The IDs of the Dedicated hosts that could not be modified. Check
     *         whether the setting you requested can be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHostsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>(unsuccessful.size());
            unsuccessfulCopy.addAll(unsuccessful);
            this.unsuccessful = unsuccessfulCopy;
        }

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
        if (getSuccessful() != null) sb.append("Successful: " + getSuccessful() + ",");
        if (getUnsuccessful() != null) sb.append("Unsuccessful: " + getUnsuccessful() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode()); 
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyHostsResult == false) return false;
        ModifyHostsResult other = (ModifyHostsResult)obj;
        
        if (other.getSuccessful() == null ^ this.getSuccessful() == null) return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false) return false; 
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null) return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false) return false; 
        return true;
    }
    
}
    