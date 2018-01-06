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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetConsoleScreenshotRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#getConsoleScreenshot(GetConsoleScreenshotRequest) GetConsoleScreenshot operation}.
 * <p>
 * Retrieve a JPG-format screenshot of a running instance to help with
 * troubleshooting.
 * </p>
 * <p>
 * The returned content is base64-encoded.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#getConsoleScreenshot(GetConsoleScreenshotRequest)
 */
public class GetConsoleScreenshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<GetConsoleScreenshotRequest> {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * When set to <code>true</code>, acts as keystroke input and wakes up an
     * instance that's in standby or "sleep" mode.
     */
    private Boolean wakeUp;

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
    public GetConsoleScreenshotRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * When set to <code>true</code>, acts as keystroke input and wakes up an
     * instance that's in standby or "sleep" mode.
     *
     * @return When set to <code>true</code>, acts as keystroke input and wakes up an
     *         instance that's in standby or "sleep" mode.
     */
    public Boolean isWakeUp() {
        return wakeUp;
    }
    
    /**
     * When set to <code>true</code>, acts as keystroke input and wakes up an
     * instance that's in standby or "sleep" mode.
     *
     * @param wakeUp When set to <code>true</code>, acts as keystroke input and wakes up an
     *         instance that's in standby or "sleep" mode.
     */
    public void setWakeUp(Boolean wakeUp) {
        this.wakeUp = wakeUp;
    }
    
    /**
     * When set to <code>true</code>, acts as keystroke input and wakes up an
     * instance that's in standby or "sleep" mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param wakeUp When set to <code>true</code>, acts as keystroke input and wakes up an
     *         instance that's in standby or "sleep" mode.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConsoleScreenshotRequest withWakeUp(Boolean wakeUp) {
        this.wakeUp = wakeUp;
        return this;
    }

    /**
     * When set to <code>true</code>, acts as keystroke input and wakes up an
     * instance that's in standby or "sleep" mode.
     *
     * @return When set to <code>true</code>, acts as keystroke input and wakes up an
     *         instance that's in standby or "sleep" mode.
     */
    public Boolean getWakeUp() {
        return wakeUp;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<GetConsoleScreenshotRequest> getDryRunRequest() {
        Request<GetConsoleScreenshotRequest> request = new GetConsoleScreenshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (isWakeUp() != null) sb.append("WakeUp: " + isWakeUp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((isWakeUp() == null) ? 0 : isWakeUp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetConsoleScreenshotRequest == false) return false;
        GetConsoleScreenshotRequest other = (GetConsoleScreenshotRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.isWakeUp() == null ^ this.isWakeUp() == null) return false;
        if (other.isWakeUp() != null && other.isWakeUp().equals(this.isWakeUp()) == false) return false; 
        return true;
    }
    
}
    