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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing the network configuration for a task or service.
 * </p>
 */
public class NetworkConfiguration implements Serializable {
    /**
     * <p>
     * The VPC subnets and security groups associated with a task.
     * </p>
     * <note>
     * <p>
     * All specified subnets and security groups must be from the same VPC.
     * </p>
     * </note>
     */
    private AwsVpcConfiguration awsvpcConfiguration;

    /**
     * <p>
     * The VPC subnets and security groups associated with a task.
     * </p>
     * <note>
     * <p>
     * All specified subnets and security groups must be from the same VPC.
     * </p>
     * </note>
     *
     * @return <p>
     *         The VPC subnets and security groups associated with a task.
     *         </p>
     *         <note>
     *         <p>
     *         All specified subnets and security groups must be from the same
     *         VPC.
     *         </p>
     *         </note>
     */
    public AwsVpcConfiguration getAwsvpcConfiguration() {
        return awsvpcConfiguration;
    }

    /**
     * <p>
     * The VPC subnets and security groups associated with a task.
     * </p>
     * <note>
     * <p>
     * All specified subnets and security groups must be from the same VPC.
     * </p>
     * </note>
     *
     * @param awsvpcConfiguration <p>
     *            The VPC subnets and security groups associated with a task.
     *            </p>
     *            <note>
     *            <p>
     *            All specified subnets and security groups must be from the
     *            same VPC.
     *            </p>
     *            </note>
     */
    public void setAwsvpcConfiguration(AwsVpcConfiguration awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
    }

    /**
     * <p>
     * The VPC subnets and security groups associated with a task.
     * </p>
     * <note>
     * <p>
     * All specified subnets and security groups must be from the same VPC.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsvpcConfiguration <p>
     *            The VPC subnets and security groups associated with a task.
     *            </p>
     *            <note>
     *            <p>
     *            All specified subnets and security groups must be from the
     *            same VPC.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConfiguration withAwsvpcConfiguration(AwsVpcConfiguration awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
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
        if (getAwsvpcConfiguration() != null)
            sb.append("awsvpcConfiguration: " + getAwsvpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsvpcConfiguration() == null) ? 0 : getAwsvpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConfiguration == false)
            return false;
        NetworkConfiguration other = (NetworkConfiguration) obj;

        if (other.getAwsvpcConfiguration() == null ^ this.getAwsvpcConfiguration() == null)
            return false;
        if (other.getAwsvpcConfiguration() != null
                && other.getAwsvpcConfiguration().equals(this.getAwsvpcConfiguration()) == false)
            return false;
        return true;
    }
}
