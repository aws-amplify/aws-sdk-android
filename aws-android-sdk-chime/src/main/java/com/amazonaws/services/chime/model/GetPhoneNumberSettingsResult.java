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

public class GetPhoneNumberSettingsResult implements Serializable {
    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     */
    private String callingName;

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date callingNameUpdatedTimestamp;

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @return <p>
     *         The default outbound calling name for the account.
     *         </p>
     */
    public String getCallingName() {
        return callingName;
    }

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @param callingName <p>
     *            The default outbound calling name for the account.
     *            </p>
     */
    public void setCallingName(String callingName) {
        this.callingName = callingName;
    }

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @param callingName <p>
     *            The default outbound calling name for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPhoneNumberSettingsResult withCallingName(String callingName) {
        this.callingName = callingName;
        return this;
    }

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The updated outbound calling name timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCallingNameUpdatedTimestamp() {
        return callingNameUpdatedTimestamp;
    }

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     *
     * @param callingNameUpdatedTimestamp <p>
     *            The updated outbound calling name timestamp, in ISO 8601
     *            format.
     *            </p>
     */
    public void setCallingNameUpdatedTimestamp(java.util.Date callingNameUpdatedTimestamp) {
        this.callingNameUpdatedTimestamp = callingNameUpdatedTimestamp;
    }

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callingNameUpdatedTimestamp <p>
     *            The updated outbound calling name timestamp, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPhoneNumberSettingsResult withCallingNameUpdatedTimestamp(
            java.util.Date callingNameUpdatedTimestamp) {
        this.callingNameUpdatedTimestamp = callingNameUpdatedTimestamp;
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
        if (getCallingName() != null)
            sb.append("CallingName: " + getCallingName() + ",");
        if (getCallingNameUpdatedTimestamp() != null)
            sb.append("CallingNameUpdatedTimestamp: " + getCallingNameUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallingName() == null) ? 0 : getCallingName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCallingNameUpdatedTimestamp() == null) ? 0
                        : getCallingNameUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPhoneNumberSettingsResult == false)
            return false;
        GetPhoneNumberSettingsResult other = (GetPhoneNumberSettingsResult) obj;

        if (other.getCallingName() == null ^ this.getCallingName() == null)
            return false;
        if (other.getCallingName() != null
                && other.getCallingName().equals(this.getCallingName()) == false)
            return false;
        if (other.getCallingNameUpdatedTimestamp() == null
                ^ this.getCallingNameUpdatedTimestamp() == null)
            return false;
        if (other.getCallingNameUpdatedTimestamp() != null
                && other.getCallingNameUpdatedTimestamp().equals(
                        this.getCallingNameUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}
