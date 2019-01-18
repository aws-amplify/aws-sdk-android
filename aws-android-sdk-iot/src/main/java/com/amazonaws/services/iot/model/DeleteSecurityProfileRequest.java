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
 * Deletes a Device Defender security profile.
 * </p>
 */
public class DeleteSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the security profile to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the security profile to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile to be deleted.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile to be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile to be deleted.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile to be deleted.
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
     *            The name of the security profile to be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     *
     * @return <p>
     *         The expected version of the security profile. A new version is
     *         generated whenever the security profile is updated. If you
     *         specify a value that is different than the actual version, a
     *         <code>VersionConflictException</code> is thrown.
     *         </p>
     */
    public Long getExpectedVersion() {
        return expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     *
     * @param expectedVersion <p>
     *            The expected version of the security profile. A new version is
     *            generated whenever the security profile is updated. If you
     *            specify a value that is different than the actual version, a
     *            <code>VersionConflictException</code> is thrown.
     *            </p>
     */
    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedVersion <p>
     *            The expected version of the security profile. A new version is
     *            generated whenever the security profile is updated. If you
     *            specify a value that is different than the actual version, a
     *            <code>VersionConflictException</code> is thrown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSecurityProfileRequest withExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
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
        if (getExpectedVersion() != null)
            sb.append("expectedVersion: " + getExpectedVersion());
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
                + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSecurityProfileRequest == false)
            return false;
        DeleteSecurityProfileRequest other = (DeleteSecurityProfileRequest) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null
                && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }
}
