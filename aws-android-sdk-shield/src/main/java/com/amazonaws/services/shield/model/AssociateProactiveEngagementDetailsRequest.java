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
 * Initializes proactive engagement and sets the list of contacts for the DDoS
 * Response Team (DRT) to use. You must provide at least one phone number in the
 * emergency contact list.
 * </p>
 * <p>
 * After you have initialized proactive engagement using this call, to disable
 * or enable proactive engagement, use the calls
 * <code>DisableProactiveEngagement</code> and
 * <code>EnableProactiveEngagement</code>.
 * </p>
 * <note>
 * <p>
 * This call defines the list of email addresses and phone numbers that the DDoS
 * Response Team (DRT) can use to contact you for escalations to the DRT and to
 * initiate proactive customer support.
 * </p>
 * <p>
 * The contacts that you provide in the request replace any contacts that were
 * already defined. If you already have contacts defined and want to use them,
 * retrieve the list using <code>DescribeEmergencyContactSettings</code> and
 * then provide it to this call.
 * </p>
 * </note>
 */
public class AssociateProactiveEngagementDetailsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you for escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * To enable proactive engagement, the contact list must include at least
     * one phone number.
     * </p>
     * <note>
     * <p>
     * The contacts that you provide here replace any contacts that were already
     * defined. If you already have contacts defined and want to use them,
     * retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it here.
     * </p>
     * </note>
     */
    private java.util.List<EmergencyContact> emergencyContactList;

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you for escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * To enable proactive engagement, the contact list must include at least
     * one phone number.
     * </p>
     * <note>
     * <p>
     * The contacts that you provide here replace any contacts that were already
     * defined. If you already have contacts defined and want to use them,
     * retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it here.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of email addresses and phone numbers that the DDoS
     *         Response Team (DRT) can use to contact you for escalations to the
     *         DRT and to initiate proactive customer support.
     *         </p>
     *         <p>
     *         To enable proactive engagement, the contact list must include at
     *         least one phone number.
     *         </p>
     *         <note>
     *         <p>
     *         The contacts that you provide here replace any contacts that were
     *         already defined. If you already have contacts defined and want to
     *         use them, retrieve the list using
     *         <code>DescribeEmergencyContactSettings</code> and then provide it
     *         here.
     *         </p>
     *         </note>
     */
    public java.util.List<EmergencyContact> getEmergencyContactList() {
        return emergencyContactList;
    }

    /**
     * <p>
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you for escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * To enable proactive engagement, the contact list must include at least
     * one phone number.
     * </p>
     * <note>
     * <p>
     * The contacts that you provide here replace any contacts that were already
     * defined. If you already have contacts defined and want to use them,
     * retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it here.
     * </p>
     * </note>
     *
     * @param emergencyContactList <p>
     *            A list of email addresses and phone numbers that the DDoS
     *            Response Team (DRT) can use to contact you for escalations to
     *            the DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            To enable proactive engagement, the contact list must include
     *            at least one phone number.
     *            </p>
     *            <note>
     *            <p>
     *            The contacts that you provide here replace any contacts that
     *            were already defined. If you already have contacts defined and
     *            want to use them, retrieve the list using
     *            <code>DescribeEmergencyContactSettings</code> and then provide
     *            it here.
     *            </p>
     *            </note>
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
     * (DRT) can use to contact you for escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * To enable proactive engagement, the contact list must include at least
     * one phone number.
     * </p>
     * <note>
     * <p>
     * The contacts that you provide here replace any contacts that were already
     * defined. If you already have contacts defined and want to use them,
     * retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it here.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emergencyContactList <p>
     *            A list of email addresses and phone numbers that the DDoS
     *            Response Team (DRT) can use to contact you for escalations to
     *            the DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            To enable proactive engagement, the contact list must include
     *            at least one phone number.
     *            </p>
     *            <note>
     *            <p>
     *            The contacts that you provide here replace any contacts that
     *            were already defined. If you already have contacts defined and
     *            want to use them, retrieve the list using
     *            <code>DescribeEmergencyContactSettings</code> and then provide
     *            it here.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateProactiveEngagementDetailsRequest withEmergencyContactList(
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
     * (DRT) can use to contact you for escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * To enable proactive engagement, the contact list must include at least
     * one phone number.
     * </p>
     * <note>
     * <p>
     * The contacts that you provide here replace any contacts that were already
     * defined. If you already have contacts defined and want to use them,
     * retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it here.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emergencyContactList <p>
     *            A list of email addresses and phone numbers that the DDoS
     *            Response Team (DRT) can use to contact you for escalations to
     *            the DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            To enable proactive engagement, the contact list must include
     *            at least one phone number.
     *            </p>
     *            <note>
     *            <p>
     *            The contacts that you provide here replace any contacts that
     *            were already defined. If you already have contacts defined and
     *            want to use them, retrieve the list using
     *            <code>DescribeEmergencyContactSettings</code> and then provide
     *            it here.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateProactiveEngagementDetailsRequest withEmergencyContactList(
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

        if (obj instanceof AssociateProactiveEngagementDetailsRequest == false)
            return false;
        AssociateProactiveEngagementDetailsRequest other = (AssociateProactiveEngagementDetailsRequest) obj;

        if (other.getEmergencyContactList() == null ^ this.getEmergencyContactList() == null)
            return false;
        if (other.getEmergencyContactList() != null
                && other.getEmergencyContactList().equals(this.getEmergencyContactList()) == false)
            return false;
        return true;
    }
}
