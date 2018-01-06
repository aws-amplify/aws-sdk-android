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
import com.amazonaws.services.ec2.model.transform.GetPasswordDataRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#getPasswordData(GetPasswordDataRequest) GetPasswordData operation}.
 * <p>
 * Retrieves the encrypted administrator password for an instance running
 * Windows.
 * </p>
 * <p>
 * The Windows password is generated at boot if the
 * <code>EC2Config</code> service plugin, <code>Ec2SetPassword</code> ,
 * is enabled. This usually only happens the first time an AMI is
 * launched, and then <code>Ec2SetPassword</code> is automatically
 * disabled. The password is not generated for rebundled AMIs unless
 * <code>Ec2SetPassword</code> is enabled before bundling.
 * </p>
 * <p>
 * The password is encrypted using the key pair that you specified when
 * you launched the instance. You must provide the corresponding key pair
 * file.
 * </p>
 * <p>
 * Password generation and encryption takes a few moments. We recommend
 * that you wait up to 15 minutes after launching an instance before
 * trying to retrieve the generated password.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#getPasswordData(GetPasswordDataRequest)
 */
public class GetPasswordDataRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<GetPasswordDataRequest> {

    /**
     * The ID of the Windows instance.
     */
    private String instanceId;

    /**
     * Default constructor for a new GetPasswordDataRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetPasswordDataRequest() {}
    
    /**
     * Constructs a new GetPasswordDataRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the Windows instance.
     */
    public GetPasswordDataRequest(String instanceId) {
        setInstanceId(instanceId);
    }

    /**
     * The ID of the Windows instance.
     *
     * @return The ID of the Windows instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the Windows instance.
     *
     * @param instanceId The ID of the Windows instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the Windows instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the Windows instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetPasswordDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<GetPasswordDataRequest> getDryRunRequest() {
        Request<GetPasswordDataRequest> request = new GetPasswordDataRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPasswordDataRequest == false) return false;
        GetPasswordDataRequest other = (GetPasswordDataRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
}
    