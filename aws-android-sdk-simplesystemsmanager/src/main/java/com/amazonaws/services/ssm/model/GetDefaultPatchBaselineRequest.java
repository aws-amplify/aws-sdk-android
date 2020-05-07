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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the default patch baseline. Note that Systems Manager supports
 * creating multiple default patch baselines. For example, you can create a
 * default patch baseline for each operating system.
 * </p>
 * <p>
 * If you do not specify an operating system value, the default patch baseline
 * for Windows is returned.
 * </p>
 */
public class GetDefaultPatchBaselineRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     */
    private String operatingSystem;

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @return <p>
     *         Returns the default patch baseline for the specified operating
     *         system.
     *         </p>
     * @see OperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Returns the default patch baseline for the specified operating
     *            system.
     *            </p>
     * @see OperatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Returns the default patch baseline for the specified operating
     *            system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatingSystem
     */
    public GetDefaultPatchBaselineRequest withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Returns the default patch baseline for the specified operating
     *            system.
     *            </p>
     * @see OperatingSystem
     */
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Returns the default patch baseline for the specified operating
     *            system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatingSystem
     */
    public GetDefaultPatchBaselineRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
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
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: " + getOperatingSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultPatchBaselineRequest == false)
            return false;
        GetDefaultPatchBaselineRequest other = (GetDefaultPatchBaselineRequest) obj;

        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null
                && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        return true;
    }
}
