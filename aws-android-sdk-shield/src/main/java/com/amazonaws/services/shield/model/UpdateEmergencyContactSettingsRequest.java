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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the details of the list of email addresses and phone numbers that the
 * DDoS Response Team (DRT) can use to contact you if you have proactive
 * engagement enabled, for escalations to the DRT and to initiate proactive
 * customer support.
 * </p>
 */
public class UpdateEmergencyContactSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * If you have proactive engagement enabled, the contact list must include
     * at least one phone number.
     * </p>
     */
    private java.util.List<EmergencyContact> emergencyContactList;

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * If you have proactive engagement enabled, the contact list must include
     * at least one phone number.
     * </p>
     *
     * @return <p>
     *         A list of email addresses and phone numbers that the DDoS
     *         Response Team (DRT) can use to contact you if you have proactive
     *         engagement enabled, for escalations to the DRT and to initiate
     *         proactive customer support.
     *         </p>
     *         <p>
     *         If you have proactive engagement enabled, the contact list must
     *         include at least one phone number.
     *         </p>
     */
    public java.util.List<EmergencyContact> getEmergencyContactList() {
        return emergencyContactList;
    }

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * If you have proactive engagement enabled, the contact list must include
     * at least one phone number.
     * </p>
     *
     * @param emergencyContactList <p>
     *            A list of email addresses and phone numbers that the DDoS
     *            Response Team (DRT) can use to contact you if you have
     *            proactive engagement enabled, for escalations to the DRT and
     *            to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If you have proactive engagement enabled, the contact list
     *            must include at least one phone number.
     *            </p>
     */
    public void setEmergencyContactList(java.util.Collection<EmergencyContact> emergencyContactList) {
        if (emergencyContactList == null) {
            this.emergencyContactList = null;
            return;
        }

        this.emergencyContactList = new java.util.ArrayList<EmergencyContact>(emergencyContactList);
    }

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * If you have proactive engagement enabled, the contact list must include
     * at least one phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emergencyContactList <p>
     *            A list of email addresses and phone numbers that the DDoS
     *            Response Team (DRT) can use to contact you if you have
     *            proactive engagement enabled, for escalations to the DRT and
     *            to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If you have proactive engagement enabled, the contact list
     *            must include at least one phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEmergencyContactSettingsRequest withEmergencyContactList(
            EmergencyContact... emergencyContactList) {
        if (getEmergencyContactList() == null) {
            this.emergencyContactList = new java.util.ArrayList<EmergencyContact>(
                    emergencyContactList.length);
        }
        for (EmergencyContact value : emergencyContactList) {
            this.emergencyContactList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * If you have proactive engagement enabled, the contact list must include
     * at least one phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emergencyContactList <p>
     *            A list of email addresses and phone numbers that the DDoS
     *            Response Team (DRT) can use to contact you if you have
     *            proactive engagement enabled, for escalations to the DRT and
     *            to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If you have proactive engagement enabled, the contact list
     *            must include at least one phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEmergencyContactSettingsRequest withEmergencyContactList(
            java.util.Collection<EmergencyContact> emergencyContactList) {
        setEmergencyContactList(emergencyContactList);
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
        if (getEmergencyContactList() != null)
            sb.append("EmergencyContactList: " + getEmergencyContactList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEmergencyContactList() == null) ? 0 : getEmergencyContactList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEmergencyContactSettingsRequest == false)
            return false;
        UpdateEmergencyContactSettingsRequest other = (UpdateEmergencyContactSettingsRequest) obj;

        if (other.getEmergencyContactList() == null ^ this.getEmergencyContactList() == null)
            return false;
        if (other.getEmergencyContactList() != null
                && other.getEmergencyContactList().equals(this.getEmergencyContactList()) == false)
            return false;
        return true;
    }
}
