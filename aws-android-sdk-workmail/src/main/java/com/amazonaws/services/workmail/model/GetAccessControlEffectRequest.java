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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the effects of an organization's access control rules as they apply to a
 * specified IPv4 address, access protocol action, or user ID.
 * </p>
 */
public class GetAccessControlEffectRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     */
    private String ipAddress;

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>,
     * <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z]+<br/>
     */
    private String action;

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String userId;

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier for the organization.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier for the organization.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier for the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessControlEffectRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @return <p>
     *         The IPv4 address.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param ipAddress <p>
     *            The IPv4 address.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IPv4 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern:
     * </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([
     * 0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param ipAddress <p>
     *            The IPv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessControlEffectRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>,
     * <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z]+<br/>
     *
     * @return <p>
     *         The access protocol action. Valid values include
     *         <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *         <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *         <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *         </p>
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>,
     * <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z]+<br/>
     *
     * @param action <p>
     *            The access protocol action. Valid values include
     *            <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The access protocol action. Valid values include <code>ActiveSync</code>,
     * <code>AutoDiscover</code>, <code>EWS</code>, <code>IMAP</code>,
     * <code>SMTP</code>, <code>WindowsOutlook</code>, and <code>WebMail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z]+<br/>
     *
     * @param action <p>
     *            The access protocol action. Valid values include
     *            <code>ActiveSync</code>, <code>AutoDiscover</code>,
     *            <code>EWS</code>, <code>IMAP</code>, <code>SMTP</code>,
     *            <code>WindowsOutlook</code>, and <code>WebMail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessControlEffectRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
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
     * <b>Length: </b>12 - 256<br/>
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
     * <b>Length: </b>12 - 256<br/>
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccessControlEffectRequest withUserId(String userId) {
        this.userId = userId;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessControlEffectRequest == false)
            return false;
        GetAccessControlEffectRequest other = (GetAccessControlEffectRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
