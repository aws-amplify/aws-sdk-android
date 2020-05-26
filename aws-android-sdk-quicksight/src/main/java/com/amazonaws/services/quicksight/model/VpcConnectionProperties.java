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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * VPC connection properties.
 * </p>
 */
public class VpcConnectionProperties implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the VPC connection.
     * </p>
     */
    private String vpcConnectionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the VPC connection.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the VPC connection.
     *         </p>
     */
    public String getVpcConnectionArn() {
        return vpcConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the VPC connection.
     * </p>
     *
     * @param vpcConnectionArn <p>
     *            The Amazon Resource Name (ARN) for the VPC connection.
     *            </p>
     */
    public void setVpcConnectionArn(String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the VPC connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConnectionArn <p>
     *            The Amazon Resource Name (ARN) for the VPC connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConnectionProperties withVpcConnectionArn(String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
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
        if (getVpcConnectionArn() != null)
            sb.append("VpcConnectionArn: " + getVpcConnectionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVpcConnectionArn() == null) ? 0 : getVpcConnectionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConnectionProperties == false)
            return false;
        VpcConnectionProperties other = (VpcConnectionProperties) obj;

        if (other.getVpcConnectionArn() == null ^ this.getVpcConnectionArn() == null)
            return false;
        if (other.getVpcConnectionArn() != null
                && other.getVpcConnectionArn().equals(this.getVpcConnectionArn()) == false)
            return false;
        return true;
    }
}
