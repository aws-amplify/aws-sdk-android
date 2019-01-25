/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates a Device Defender security profile from a thing group or from
 * this account.
 * </p>
 */
public class DetachSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The security profile that is detached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The ARN of the thing group from which the security profile is detached.
     * </p>
     */
    private String securityProfileTargetArn;

    /**
     * <p>
     * The security profile that is detached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The security profile that is detached.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The security profile that is detached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The security profile that is detached.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The security profile that is detached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The security profile that is detached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The ARN of the thing group from which the security profile is detached.
     * </p>
     *
     * @return <p>
     *         The ARN of the thing group from which the security profile is
     *         detached.
     *         </p>
     */
    public String getSecurityProfileTargetArn() {
        return securityProfileTargetArn;
    }

    /**
     * <p>
     * The ARN of the thing group from which the security profile is detached.
     * </p>
     *
     * @param securityProfileTargetArn <p>
     *            The ARN of the thing group from which the security profile is
     *            detached.
     *            </p>
     */
    public void setSecurityProfileTargetArn(String securityProfileTargetArn) {
        this.securityProfileTargetArn = securityProfileTargetArn;
    }

    /**
     * <p>
     * The ARN of the thing group from which the security profile is detached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileTargetArn <p>
     *            The ARN of the thing group from which the security profile is
     *            detached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachSecurityProfileRequest withSecurityProfileTargetArn(String securityProfileTargetArn) {
        this.securityProfileTargetArn = securityProfileTargetArn;
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
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getSecurityProfileTargetArn() != null)
            sb.append("securityProfileTargetArn: " + getSecurityProfileTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityProfileTargetArn() == null) ? 0 : getSecurityProfileTargetArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachSecurityProfileRequest == false)
            return false;
        DetachSecurityProfileRequest other = (DetachSecurityProfileRequest) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileTargetArn() == null
                ^ this.getSecurityProfileTargetArn() == null)
            return false;
        if (other.getSecurityProfileTargetArn() != null
                && other.getSecurityProfileTargetArn().equals(this.getSecurityProfileTargetArn()) == false)
            return false;
        return true;
    }
}
