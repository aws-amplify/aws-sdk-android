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
import com.amazonaws.services.ec2.model.transform.BundleInstanceRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#bundleInstance(BundleInstanceRequest) BundleInstance operation}.
 * <p>
 * Bundles an Amazon instance store-backed Windows instance.
 * </p>
 * <p>
 * During bundling, only the root device volume (C:\) is bundled. Data on
 * other instance store volumes is not preserved.
 * </p>
 * <p>
 * <b>NOTE:</b> This action is not applicable for Linux/Unix instances or
 * Windows instances that are backed by Amazon EBS.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/Creating_InstanceStoreBacked_WinAMI.html"> Creating an Instance Store-Backed Windows AMI </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#bundleInstance(BundleInstanceRequest)
 */
public class BundleInstanceRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<BundleInstanceRequest> {

    /**
     * The ID of the instance to bundle. <p>Type: String <p>Default: None
     * <p>Required: Yes
     */
    private String instanceId;

    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. If you specify a bucket that belongs to someone else, Amazon
     * EC2 returns an error.
     */
    private Storage storage;

    /**
     * Default constructor for a new BundleInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BundleInstanceRequest() {}
    
    /**
     * Constructs a new BundleInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance to bundle. <p>Type: String
     * <p>Default: None <p>Required: Yes
     * @param storage The bucket in which to store the AMI. You can specify a
     * bucket that you already own or a new bucket that Amazon EC2 creates on
     * your behalf. If you specify a bucket that belongs to someone else,
     * Amazon EC2 returns an error.
     */
    public BundleInstanceRequest(String instanceId, Storage storage) {
        setInstanceId(instanceId);
        setStorage(storage);
    }

    /**
     * The ID of the instance to bundle. <p>Type: String <p>Default: None
     * <p>Required: Yes
     *
     * @return The ID of the instance to bundle. <p>Type: String <p>Default: None
     *         <p>Required: Yes
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance to bundle. <p>Type: String <p>Default: None
     * <p>Required: Yes
     *
     * @param instanceId The ID of the instance to bundle. <p>Type: String <p>Default: None
     *         <p>Required: Yes
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance to bundle. <p>Type: String <p>Default: None
     * <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance to bundle. <p>Type: String <p>Default: None
     *         <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BundleInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. If you specify a bucket that belongs to someone else, Amazon
     * EC2 returns an error.
     *
     * @return The bucket in which to store the AMI. You can specify a bucket that
     *         you already own or a new bucket that Amazon EC2 creates on your
     *         behalf. If you specify a bucket that belongs to someone else, Amazon
     *         EC2 returns an error.
     */
    public Storage getStorage() {
        return storage;
    }
    
    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. If you specify a bucket that belongs to someone else, Amazon
     * EC2 returns an error.
     *
     * @param storage The bucket in which to store the AMI. You can specify a bucket that
     *         you already own or a new bucket that Amazon EC2 creates on your
     *         behalf. If you specify a bucket that belongs to someone else, Amazon
     *         EC2 returns an error.
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    
    /**
     * The bucket in which to store the AMI. You can specify a bucket that
     * you already own or a new bucket that Amazon EC2 creates on your
     * behalf. If you specify a bucket that belongs to someone else, Amazon
     * EC2 returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storage The bucket in which to store the AMI. You can specify a bucket that
     *         you already own or a new bucket that Amazon EC2 creates on your
     *         behalf. If you specify a bucket that belongs to someone else, Amazon
     *         EC2 returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BundleInstanceRequest withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<BundleInstanceRequest> getDryRunRequest() {
        Request<BundleInstanceRequest> request = new BundleInstanceRequestMarshaller().marshall(this);
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
        if (getStorage() != null) sb.append("Storage: " + getStorage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BundleInstanceRequest == false) return false;
        BundleInstanceRequest other = (BundleInstanceRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getStorage() == null ^ this.getStorage() == null) return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false) return false; 
        return true;
    }
    
}
    