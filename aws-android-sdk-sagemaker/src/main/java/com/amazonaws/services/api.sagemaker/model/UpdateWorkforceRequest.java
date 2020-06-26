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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Restricts access to tasks assigned to workers in the specified workforce to
 * those within specific ranges of IP addresses. You specify allowed IP
 * addresses by creating a list of up to four <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
 * >CIDRs</a>.
 * </p>
 * <p>
 * By default, a workforce isn't restricted to specific IP addresses. If you
 * specify a range of IP addresses, workers who attempt to access tasks using
 * any IP address outside the specified range are denied access and get a
 * <code>Not Found</code> error message on the worker portal. After restricting
 * access with this operation, you can see the allowed IP values for a private
 * workforce with the operation.
 * </p>
 * <important>
 * <p>
 * This operation applies only to private workforces.
 * </p>
 * </important>
 */
public class UpdateWorkforceRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A list of one to four worker IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) that can be used to access tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     */
    private SourceIpConfig sourceIpConfig;

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
    public UpdateWorkforceRequest withWorkforceName(String workforceName) {
        this.workforceName = workforceName;
        return this;
    }

    /**
     * <p>
     * A list of one to four worker IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) that can be used to access tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     *
     * @return <p>
     *         A list of one to four worker IP address ranges (<a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *         >CIDRs</a>) that can be used to access tasks assigned to this
     *         workforce.
     *         </p>
     *         <p>
     *         Maximum: Four CIDR values
     *         </p>
     */
    public SourceIpConfig getSourceIpConfig() {
        return sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to four worker IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) that can be used to access tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     *
     * @param sourceIpConfig <p>
     *            A list of one to four worker IP address ranges (<a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >CIDRs</a>) that can be used to access tasks assigned to this
     *            workforce.
     *            </p>
     *            <p>
     *            Maximum: Four CIDR values
     *            </p>
     */
    public void setSourceIpConfig(SourceIpConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to four worker IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) that can be used to access tasks assigned to this workforce.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIpConfig <p>
     *            A list of one to four worker IP address ranges (<a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >CIDRs</a>) that can be used to access tasks assigned to this
     *            workforce.
     *            </p>
     *            <p>
     *            Maximum: Four CIDR values
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkforceRequest withSourceIpConfig(SourceIpConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
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
            sb.append("WorkforceName: " + getWorkforceName() + ",");
        if (getSourceIpConfig() != null)
            sb.append("SourceIpConfig: " + getSourceIpConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceIpConfig() == null) ? 0 : getSourceIpConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkforceRequest == false)
            return false;
        UpdateWorkforceRequest other = (UpdateWorkforceRequest) obj;

        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null
                && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        if (other.getSourceIpConfig() == null ^ this.getSourceIpConfig() == null)
            return false;
        if (other.getSourceIpConfig() != null
                && other.getSourceIpConfig().equals(this.getSourceIpConfig()) == false)
            return false;
        return true;
    }
}
