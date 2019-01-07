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

public class CreateSecurityProfileResult implements Serializable {
    /**
     * <p>
     * The name you gave to the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     */
    private String securityProfileArn;

    /**
     * <p>
     * The name you gave to the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name you gave to the security profile.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name you gave to the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name you gave to the security profile.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name you gave to the security profile.
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
     *            The name you gave to the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileResult withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     *
     * @return <p>
     *         The ARN of the security profile.
     *         </p>
     */
    public String getSecurityProfileArn() {
        return securityProfileArn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     *
     * @param securityProfileArn <p>
     *            The ARN of the security profile.
     *            </p>
     */
    public void setSecurityProfileArn(String securityProfileArn) {
        this.securityProfileArn = securityProfileArn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileArn <p>
     *            The ARN of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileResult withSecurityProfileArn(String securityProfileArn) {
        this.securityProfileArn = securityProfileArn;
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
        if (getSecurityProfileArn() != null)
            sb.append("securityProfileArn: " + getSecurityProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileArn() == null) ? 0 : getSecurityProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityProfileResult == false)
            return false;
        CreateSecurityProfileResult other = (CreateSecurityProfileResult) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileArn() == null ^ this.getSecurityProfileArn() == null)
            return false;
        if (other.getSecurityProfileArn() != null
                && other.getSecurityProfileArn().equals(this.getSecurityProfileArn()) == false)
            return false;
        return true;
    }
}
