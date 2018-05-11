/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the output of the request.
 * </p>
 */
public class GetConsoleScreenshotResult implements Serializable {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The data that comprises the image.
     */
    private String imageData;

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConsoleScreenshotResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The data that comprises the image.
     *
     * @return The data that comprises the image.
     */
    public String getImageData() {
        return imageData;
    }
    
    /**
     * The data that comprises the image.
     *
     * @param imageData The data that comprises the image.
     */
    public void setImageData(String imageData) {
        this.imageData = imageData;
    }
    
    /**
     * The data that comprises the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageData The data that comprises the image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConsoleScreenshotResult withImageData(String imageData) {
        this.imageData = imageData;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getImageData() != null) sb.append("ImageData: " + getImageData() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getImageData() == null) ? 0 : getImageData().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetConsoleScreenshotResult == false) return false;
        GetConsoleScreenshotResult other = (GetConsoleScreenshotResult)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getImageData() == null ^ this.getImageData() == null) return false;
        if (other.getImageData() != null && other.getImageData().equals(this.getImageData()) == false) return false; 
        return true;
    }
    
}
    