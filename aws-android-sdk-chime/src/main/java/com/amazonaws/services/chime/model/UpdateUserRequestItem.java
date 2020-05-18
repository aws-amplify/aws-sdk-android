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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The user ID and user fields to update, used with the <a>BatchUpdateUser</a>
 * action.
 * </p>
 */
public class UpdateUserRequestItem implements Serializable {
    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String userId;

    /**
     * <p>
     * The user license type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     */
    private String licenseType;

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     */
    private String userType;

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     */
    private AlexaForBusinessMetadata alexaForBusinessMetadata;

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The user ID.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequestItem withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @return <p>
     *         The user license type.
     *         </p>
     * @see License
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The user license type.
     *            </p>
     * @see License
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The user license type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see License
     */
    public UpdateUserRequestItem withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The user license type.
     *            </p>
     * @see License
     */
    public void setLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Basic, Plus, Pro, ProTrial
     *
     * @param licenseType <p>
     *            The user license type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see License
     */
    public UpdateUserRequestItem withLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @return <p>
     *         The user type.
     *         </p>
     * @see UserType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public UpdateUserRequestItem withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(UserType userType) {
        this.userType = userType.toString();
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public UpdateUserRequestItem withUserType(UserType userType) {
        this.userType = userType.toString();
        return this;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     *
     * @return <p>
     *         The Alexa for Business metadata.
     *         </p>
     */
    public AlexaForBusinessMetadata getAlexaForBusinessMetadata() {
        return alexaForBusinessMetadata;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     *
     * @param alexaForBusinessMetadata <p>
     *            The Alexa for Business metadata.
     *            </p>
     */
    public void setAlexaForBusinessMetadata(AlexaForBusinessMetadata alexaForBusinessMetadata) {
        this.alexaForBusinessMetadata = alexaForBusinessMetadata;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alexaForBusinessMetadata <p>
     *            The Alexa for Business metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequestItem withAlexaForBusinessMetadata(
            AlexaForBusinessMetadata alexaForBusinessMetadata) {
        this.alexaForBusinessMetadata = alexaForBusinessMetadata;
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getUserType() != null)
            sb.append("UserType: " + getUserType() + ",");
        if (getAlexaForBusinessMetadata() != null)
            sb.append("AlexaForBusinessMetadata: " + getAlexaForBusinessMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlexaForBusinessMetadata() == null) ? 0 : getAlexaForBusinessMetadata()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequestItem == false)
            return false;
        UpdateUserRequestItem other = (UpdateUserRequestItem) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null
                && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        if (other.getAlexaForBusinessMetadata() == null
                ^ this.getAlexaForBusinessMetadata() == null)
            return false;
        if (other.getAlexaForBusinessMetadata() != null
                && other.getAlexaForBusinessMetadata().equals(this.getAlexaForBusinessMetadata()) == false)
            return false;
        return true;
    }
}
