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

/**
 * <p>
 * A single private workforce, which is automatically created when you create
 * your first private work team. You can create one private work force in each
 * AWS Region. By default, any workforce-related API operation used in a
 * specific region will apply to the workforce created in that region. To learn
 * how to create a private workforce, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
 * >Create a Private Workforce</a>.
 * </p>
 */
public class Workforce implements Serializable {
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
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workforce/.*<br/>
     */
    private String workforceArn;

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP
     * address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to a private workforce's allow list.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * A list of one to four IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to be added to the workforce allow list.
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
    public Workforce withWorkforceName(String workforceName) {
        this.workforceName = workforceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workforce/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the private workforce.
     *         </p>
     */
    public String getWorkforceArn() {
        return workforceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workforce/.*<br/>
     *
     * @param workforceArn <p>
     *            The Amazon Resource Name (ARN) of the private workforce.
     *            </p>
     */
    public void setWorkforceArn(String workforceArn) {
        this.workforceArn = workforceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workforce/.*<br/>
     *
     * @param workforceArn <p>
     *            The Amazon Resource Name (ARN) of the private workforce.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workforce withWorkforceArn(String workforceArn) {
        this.workforceArn = workforceArn;
        return this;
    }

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP
     * address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to a private workforce's allow list.
     * </p>
     *
     * @return <p>
     *         The most recent date that was used to successfully add one or
     *         more IP address ranges (<a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *         >CIDRs</a>) to a private workforce's allow list.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP
     * address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to a private workforce's allow list.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The most recent date that was used to successfully add one or
     *            more IP address ranges (<a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >CIDRs</a>) to a private workforce's allow list.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP
     * address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to a private workforce's allow list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The most recent date that was used to successfully add one or
     *            more IP address ranges (<a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >CIDRs</a>) to a private workforce's allow list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workforce withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * A list of one to four IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to be added to the workforce allow list.
     * </p>
     *
     * @return <p>
     *         A list of one to four IP address ranges (<a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *         >CIDRs</a>) to be added to the workforce allow list.
     *         </p>
     */
    public SourceIpConfig getSourceIpConfig() {
        return sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to four IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to be added to the workforce allow list.
     * </p>
     *
     * @param sourceIpConfig <p>
     *            A list of one to four IP address ranges (<a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >CIDRs</a>) to be added to the workforce allow list.
     *            </p>
     */
    public void setSourceIpConfig(SourceIpConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to four IP address ranges (<a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>) to be added to the workforce allow list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIpConfig <p>
     *            A list of one to four IP address ranges (<a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     *            >CIDRs</a>) to be added to the workforce allow list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workforce withSourceIpConfig(SourceIpConfig sourceIpConfig) {
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
        if (getWorkforceArn() != null)
            sb.append("WorkforceArn: " + getWorkforceArn() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: " + getLastUpdatedDate() + ",");
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
                + ((getWorkforceArn() == null) ? 0 : getWorkforceArn().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
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

        if (obj instanceof Workforce == false)
            return false;
        Workforce other = (Workforce) obj;

        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null
                && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        if (other.getWorkforceArn() == null ^ this.getWorkforceArn() == null)
            return false;
        if (other.getWorkforceArn() != null
                && other.getWorkforceArn().equals(this.getWorkforceArn()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null
                && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getSourceIpConfig() == null ^ this.getSourceIpConfig() == null)
            return false;
        if (other.getSourceIpConfig() != null
                && other.getSourceIpConfig().equals(this.getSourceIpConfig()) == false)
            return false;
        return true;
    }
}
