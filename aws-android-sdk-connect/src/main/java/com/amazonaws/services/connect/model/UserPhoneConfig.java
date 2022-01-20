/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the phone configuration settings for a user.
 * </p>
 */
public class UserPhoneConfig implements Serializable {
    /**
     * <p>
     * The phone type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOFT_PHONE, DESK_PHONE
     */
    private String phoneType;

    /**
     * <p>
     * The Auto accept setting.
     * </p>
     */
    private Boolean autoAccept;

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer afterContactWorkTimeLimit;

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     */
    private String deskPhoneNumber;

    /**
     * <p>
     * The phone type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOFT_PHONE, DESK_PHONE
     *
     * @return <p>
     *         The phone type.
     *         </p>
     * @see PhoneType
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * <p>
     * The phone type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOFT_PHONE, DESK_PHONE
     *
     * @param phoneType <p>
     *            The phone type.
     *            </p>
     * @see PhoneType
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * <p>
     * The phone type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOFT_PHONE, DESK_PHONE
     *
     * @param phoneType <p>
     *            The phone type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneType
     */
    public UserPhoneConfig withPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    /**
     * <p>
     * The phone type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOFT_PHONE, DESK_PHONE
     *
     * @param phoneType <p>
     *            The phone type.
     *            </p>
     * @see PhoneType
     */
    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType.toString();
    }

    /**
     * <p>
     * The phone type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOFT_PHONE, DESK_PHONE
     *
     * @param phoneType <p>
     *            The phone type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneType
     */
    public UserPhoneConfig withPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType.toString();
        return this;
    }

    /**
     * <p>
     * The Auto accept setting.
     * </p>
     *
     * @return <p>
     *         The Auto accept setting.
     *         </p>
     */
    public Boolean isAutoAccept() {
        return autoAccept;
    }

    /**
     * <p>
     * The Auto accept setting.
     * </p>
     *
     * @return <p>
     *         The Auto accept setting.
     *         </p>
     */
    public Boolean getAutoAccept() {
        return autoAccept;
    }

    /**
     * <p>
     * The Auto accept setting.
     * </p>
     *
     * @param autoAccept <p>
     *            The Auto accept setting.
     *            </p>
     */
    public void setAutoAccept(Boolean autoAccept) {
        this.autoAccept = autoAccept;
    }

    /**
     * <p>
     * The Auto accept setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoAccept <p>
     *            The Auto accept setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPhoneConfig withAutoAccept(Boolean autoAccept) {
        this.autoAccept = autoAccept;
        return this;
    }

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The After Call Work (ACW) timeout setting, in seconds.
     *         </p>
     */
    public Integer getAfterContactWorkTimeLimit() {
        return afterContactWorkTimeLimit;
    }

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param afterContactWorkTimeLimit <p>
     *            The After Call Work (ACW) timeout setting, in seconds.
     *            </p>
     */
    public void setAfterContactWorkTimeLimit(Integer afterContactWorkTimeLimit) {
        this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
    }

    /**
     * <p>
     * The After Call Work (ACW) timeout setting, in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param afterContactWorkTimeLimit <p>
     *            The After Call Work (ACW) timeout setting, in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPhoneConfig withAfterContactWorkTimeLimit(Integer afterContactWorkTimeLimit) {
        this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
        return this;
    }

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     *
     * @return <p>
     *         The phone number for the user's desk phone.
     *         </p>
     */
    public String getDeskPhoneNumber() {
        return deskPhoneNumber;
    }

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     *
     * @param deskPhoneNumber <p>
     *            The phone number for the user's desk phone.
     *            </p>
     */
    public void setDeskPhoneNumber(String deskPhoneNumber) {
        this.deskPhoneNumber = deskPhoneNumber;
    }

    /**
     * <p>
     * The phone number for the user's desk phone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deskPhoneNumber <p>
     *            The phone number for the user's desk phone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPhoneConfig withDeskPhoneNumber(String deskPhoneNumber) {
        this.deskPhoneNumber = deskPhoneNumber;
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
        if (getPhoneType() != null)
            sb.append("PhoneType: " + getPhoneType() + ",");
        if (getAutoAccept() != null)
            sb.append("AutoAccept: " + getAutoAccept() + ",");
        if (getAfterContactWorkTimeLimit() != null)
            sb.append("AfterContactWorkTimeLimit: " + getAfterContactWorkTimeLimit() + ",");
        if (getDeskPhoneNumber() != null)
            sb.append("DeskPhoneNumber: " + getDeskPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneType() == null) ? 0 : getPhoneType().hashCode());
        hashCode = prime * hashCode + ((getAutoAccept() == null) ? 0 : getAutoAccept().hashCode());
        hashCode = prime
                * hashCode
                + ((getAfterContactWorkTimeLimit() == null) ? 0 : getAfterContactWorkTimeLimit()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeskPhoneNumber() == null) ? 0 : getDeskPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPhoneConfig == false)
            return false;
        UserPhoneConfig other = (UserPhoneConfig) obj;

        if (other.getPhoneType() == null ^ this.getPhoneType() == null)
            return false;
        if (other.getPhoneType() != null
                && other.getPhoneType().equals(this.getPhoneType()) == false)
            return false;
        if (other.getAutoAccept() == null ^ this.getAutoAccept() == null)
            return false;
        if (other.getAutoAccept() != null
                && other.getAutoAccept().equals(this.getAutoAccept()) == false)
            return false;
        if (other.getAfterContactWorkTimeLimit() == null
                ^ this.getAfterContactWorkTimeLimit() == null)
            return false;
        if (other.getAfterContactWorkTimeLimit() != null
                && other.getAfterContactWorkTimeLimit().equals(this.getAfterContactWorkTimeLimit()) == false)
            return false;
        if (other.getDeskPhoneNumber() == null ^ this.getDeskPhoneNumber() == null)
            return false;
        if (other.getDeskPhoneNumber() != null
                && other.getDeskPhoneNumber().equals(this.getDeskPhoneNumber()) == false)
            return false;
        return true;
    }
}
