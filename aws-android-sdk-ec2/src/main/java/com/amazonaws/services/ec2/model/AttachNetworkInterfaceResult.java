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
 * Contains the output of AttachNetworkInterface.
 * </p>
 */
public class AttachNetworkInterfaceResult implements Serializable {

    /**
     * The ID of the network interface attachment.
     */
    private String attachmentId;

    /**
     * The ID of the network interface attachment.
     *
     * @return The ID of the network interface attachment.
     */
    public String getAttachmentId() {
        return attachmentId;
    }
    
    /**
     * The ID of the network interface attachment.
     *
     * @param attachmentId The ID of the network interface attachment.
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
    
    /**
     * The ID of the network interface attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentId The ID of the network interface attachment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AttachNetworkInterfaceResult withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
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
        if (getAttachmentId() != null) sb.append("AttachmentId: " + getAttachmentId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachNetworkInterfaceResult == false) return false;
        AttachNetworkInterfaceResult other = (AttachNetworkInterfaceResult)obj;
        
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null) return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false) return false; 
        return true;
    }
    
}
    