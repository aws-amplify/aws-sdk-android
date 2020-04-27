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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists private workforce information, including workforce name, Amazon
 * Resource Name (ARN), and, if applicable, allowed IP address ranges (<a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
 * >CIDRs</a>). Allowable IP address ranges are the IP addresses that workers
 * can use to access tasks.
 * </p>
 * <important>
 * <p>
 * This operation applies only to private workforces.
 * </p>
 * </important>
 */
public class DescribeWorkforceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the private workforce whose access you want to restrict.
     * <code>WorkforceName</code> is automatically set to <code>default</code>
     * when a workforce is created and cannot be modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]([a-zA-Z0-9\-])*$<br/>
     */
    private String workforceName;

    /**
     * <p>
     * The name of the private workforce whose access you want to restrict.
     * <code>WorkforceName</code> is automatically set to <code>default</code>
     * when a workforce is created and cannot be modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]([a-zA-Z0-9\-])*$<br/>
     *
     * @return <p>
     *         The name of the private workforce whose access you want to
     *         restrict. <code>WorkforceName</code> is automatically set to
     *         <code>default</code> when a workforce is created and cannot be
     *         modified.
     *         </p>
     */
    public String getWorkforceName() {
        return workforceName;
    }

    /**
     * <p>
     * The name of the private workforce whose access you want to restrict.
     * <code>WorkforceName</code> is automatically set to <code>default</code>
     * when a workforce is created and cannot be modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]([a-zA-Z0-9\-])*$<br/>
     *
     * @param workforceName <p>
     *            The name of the private workforce whose access you want to
     *            restrict. <code>WorkforceName</code> is automatically set to
     *            <code>default</code> when a workforce is created and cannot be
     *            modified.
     *            </p>
     */
    public void setWorkforceName(String workforceName) {
        this.workforceName = workforceName;
    }

    /**
     * <p>
     * The name of the private workforce whose access you want to restrict.
     * <code>WorkforceName</code> is automatically set to <code>default</code>
     * when a workforce is created and cannot be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]([a-zA-Z0-9\-])*$<br/>
     *
     * @param workforceName <p>
     *            The name of the private workforce whose access you want to
     *            restrict. <code>WorkforceName</code> is automatically set to
     *            <code>default</code> when a workforce is created and cannot be
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkforceRequest withWorkforceName(String workforceName) {
        this.workforceName = workforceName;
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
        if (getWorkforceName() != null)
            sb.append("WorkforceName: " + getWorkforceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkforceRequest == false)
            return false;
        DescribeWorkforceRequest other = (DescribeWorkforceRequest) obj;

        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null
                && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        return true;
    }
}
