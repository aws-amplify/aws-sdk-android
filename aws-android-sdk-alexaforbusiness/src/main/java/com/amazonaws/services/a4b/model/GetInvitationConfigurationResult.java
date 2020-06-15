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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class GetInvitationConfigurationResult implements Serializable {
    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String organizationName;

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled
     * user can use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     */
    private String contactEmail;

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to
     * enable in the invitation.
     * </p>
     */
    private java.util.List<String> privateSkillIds;

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the organization sending the enrollment invite to a
     *         user.
     *         </p>
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param organizationName <p>
     *            The name of the organization sending the enrollment invite to
     *            a user.
     *            </p>
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * <p>
     * The name of the organization sending the enrollment invite to a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param organizationName <p>
     *            The name of the organization sending the enrollment invite to
     *            a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvitationConfigurationResult withOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled
     * user can use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @return <p>
     *         The email ID of the organization or individual contact that the
     *         enrolled user can use.
     *         </p>
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled
     * user can use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @param contactEmail <p>
     *            The email ID of the organization or individual contact that
     *            the enrolled user can use.
     *            </p>
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * <p>
     * The email ID of the organization or individual contact that the enrolled
     * user can use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @param contactEmail <p>
     *            The email ID of the organization or individual contact that
     *            the enrolled user can use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvitationConfigurationResult withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to
     * enable in the invitation.
     * </p>
     *
     * @return <p>
     *         The list of private skill IDs that you want to recommend to the
     *         user to enable in the invitation.
     *         </p>
     */
    public java.util.List<String> getPrivateSkillIds() {
        return privateSkillIds;
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to
     * enable in the invitation.
     * </p>
     *
     * @param privateSkillIds <p>
     *            The list of private skill IDs that you want to recommend to
     *            the user to enable in the invitation.
     *            </p>
     */
    public void setPrivateSkillIds(java.util.Collection<String> privateSkillIds) {
        if (privateSkillIds == null) {
            this.privateSkillIds = null;
            return;
        }

        this.privateSkillIds = new java.util.ArrayList<String>(privateSkillIds);
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to
     * enable in the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateSkillIds <p>
     *            The list of private skill IDs that you want to recommend to
     *            the user to enable in the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvitationConfigurationResult withPrivateSkillIds(String... privateSkillIds) {
        if (getPrivateSkillIds() == null) {
            this.privateSkillIds = new java.util.ArrayList<String>(privateSkillIds.length);
        }
        for (String value : privateSkillIds) {
            this.privateSkillIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of private skill IDs that you want to recommend to the user to
     * enable in the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateSkillIds <p>
     *            The list of private skill IDs that you want to recommend to
     *            the user to enable in the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInvitationConfigurationResult withPrivateSkillIds(
            java.util.Collection<String> privateSkillIds) {
        setPrivateSkillIds(privateSkillIds);
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
        if (getOrganizationName() != null)
            sb.append("OrganizationName: " + getOrganizationName() + ",");
        if (getContactEmail() != null)
            sb.append("ContactEmail: " + getContactEmail() + ",");
        if (getPrivateSkillIds() != null)
            sb.append("PrivateSkillIds: " + getPrivateSkillIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        hashCode = prime * hashCode
                + ((getContactEmail() == null) ? 0 : getContactEmail().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateSkillIds() == null) ? 0 : getPrivateSkillIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInvitationConfigurationResult == false)
            return false;
        GetInvitationConfigurationResult other = (GetInvitationConfigurationResult) obj;

        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null)
            return false;
        if (other.getOrganizationName() != null
                && other.getOrganizationName().equals(this.getOrganizationName()) == false)
            return false;
        if (other.getContactEmail() == null ^ this.getContactEmail() == null)
            return false;
        if (other.getContactEmail() != null
                && other.getContactEmail().equals(this.getContactEmail()) == false)
            return false;
        if (other.getPrivateSkillIds() == null ^ this.getPrivateSkillIds() == null)
            return false;
        if (other.getPrivateSkillIds() != null
                && other.getPrivateSkillIds().equals(this.getPrivateSkillIds()) == false)
            return false;
        return true;
    }
}
