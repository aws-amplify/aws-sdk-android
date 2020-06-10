/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance
 * from an exported Amazon Lightsail snapshot. This operation results in a
 * CloudFormation stack record that can be used to track the AWS CloudFormation
 * stack created. Use the <code>get cloud formation stack records</code>
 * operation to get a list of the CloudFormation stacks created.
 * </p>
 * <important>
 * <p>
 * Wait until after your new Amazon EC2 instance is created before running the
 * <code>create cloud formation stack</code> operation again with the same
 * export snapshot record.
 * </p>
 * </important>
 */
public class CreateCloudFormationStackRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2
     * instance. You can only pass one instance entry at a time in this array.
     * You will get an invalid parameter error if you pass more than one
     * instance entry in this array.
     * </p>
     */
    private java.util.List<InstanceEntry> instances;

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2
     * instance. You can only pass one instance entry at a time in this array.
     * You will get an invalid parameter error if you pass more than one
     * instance entry in this array.
     * </p>
     *
     * @return <p>
     *         An array of parameters that will be used to create the new Amazon
     *         EC2 instance. You can only pass one instance entry at a time in
     *         this array. You will get an invalid parameter error if you pass
     *         more than one instance entry in this array.
     *         </p>
     */
    public java.util.List<InstanceEntry> getInstances() {
        return instances;
    }

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2
     * instance. You can only pass one instance entry at a time in this array.
     * You will get an invalid parameter error if you pass more than one
     * instance entry in this array.
     * </p>
     *
     * @param instances <p>
     *            An array of parameters that will be used to create the new
     *            Amazon EC2 instance. You can only pass one instance entry at a
     *            time in this array. You will get an invalid parameter error if
     *            you pass more than one instance entry in this array.
     *            </p>
     */
    public void setInstances(java.util.Collection<InstanceEntry> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<InstanceEntry>(instances);
    }

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2
     * instance. You can only pass one instance entry at a time in this array.
     * You will get an invalid parameter error if you pass more than one
     * instance entry in this array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            An array of parameters that will be used to create the new
     *            Amazon EC2 instance. You can only pass one instance entry at a
     *            time in this array. You will get an invalid parameter error if
     *            you pass more than one instance entry in this array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCloudFormationStackRequest withInstances(InstanceEntry... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<InstanceEntry>(instances.length);
        }
        for (InstanceEntry value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2
     * instance. You can only pass one instance entry at a time in this array.
     * You will get an invalid parameter error if you pass more than one
     * instance entry in this array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            An array of parameters that will be used to create the new
     *            Amazon EC2 instance. You can only pass one instance entry at a
     *            time in this array. You will get an invalid parameter error if
     *            you pass more than one instance entry in this array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCloudFormationStackRequest withInstances(
            java.util.Collection<InstanceEntry> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstances() != null)
            sb.append("instances: " + getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationStackRequest == false)
            return false;
        CreateCloudFormationStackRequest other = (CreateCloudFormationStackRequest) obj;

        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }
}
