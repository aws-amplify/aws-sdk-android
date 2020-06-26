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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a user profile. A user profile represents a single user within a
 * domain, and is the main way to reference a "person" for the purposes of
 * sharing, reporting, and other user-oriented features. This entity is created
 * when a user onboards to Amazon SageMaker Studio. If an administrator invites
 * a person by email or imports them from SSO, a user profile is automatically
 * created. A user profile is the primary holder of settings for an individual
 * user and has a reference to the user's private Amazon Elastic File System
 * (EFS) home directory.
 * </p>
 */
public class CreateUserProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     */
    private String domainId;

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String userProfileName;

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue.
     * Currently, the only supported value is "UserName". If the Domain's
     * AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     * SSO, this field cannot be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     */
    private String singleSignOnUserIdentifier;

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this
     * UserProfile. If the Domain's AuthMode is SSO, this field is required, and
     * must match a valid username of a user in your directory. If the Domain's
     * AuthMode is not SSO, this field cannot be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String singleSignOnUserValue;

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings userSettings;

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @return <p>
     *         The ID of the associated Domain.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The ID of the associated Domain.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The ID of the associated Domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A name for the UserProfile.
     *         </p>
     */
    public String getUserProfileName() {
        return userProfileName;
    }

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            A name for the UserProfile.
     *            </p>
     */
    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            A name for the UserProfile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
        return this;
    }

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue.
     * Currently, the only supported value is "UserName". If the Domain's
     * AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     * SSO, this field cannot be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     *
     * @return <p>
     *         A specifier for the type of value specified in
     *         SingleSignOnUserValue. Currently, the only supported value is
     *         "UserName". If the Domain's AuthMode is SSO, this field is
     *         required. If the Domain's AuthMode is not SSO, this field cannot
     *         be specified.
     *         </p>
     */
    public String getSingleSignOnUserIdentifier() {
        return singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue.
     * Currently, the only supported value is "UserName". If the Domain's
     * AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     * SSO, this field cannot be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     *
     * @param singleSignOnUserIdentifier <p>
     *            A specifier for the type of value specified in
     *            SingleSignOnUserValue. Currently, the only supported value is
     *            "UserName". If the Domain's AuthMode is SSO, this field is
     *            required. If the Domain's AuthMode is not SSO, this field
     *            cannot be specified.
     *            </p>
     */
    public void setSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue.
     * Currently, the only supported value is "UserName". If the Domain's
     * AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     * SSO, this field cannot be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     *
     * @param singleSignOnUserIdentifier <p>
     *            A specifier for the type of value specified in
     *            SingleSignOnUserValue. Currently, the only supported value is
     *            "UserName". If the Domain's AuthMode is SSO, this field is
     *            required. If the Domain's AuthMode is not SSO, this field
     *            cannot be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
        return this;
    }

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this
     * UserProfile. If the Domain's AuthMode is SSO, this field is required, and
     * must match a valid username of a user in your directory. If the Domain's
     * AuthMode is not SSO, this field cannot be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The username of the associated AWS Single Sign-On User for this
     *         UserProfile. If the Domain's AuthMode is SSO, this field is
     *         required, and must match a valid username of a user in your
     *         directory. If the Domain's AuthMode is not SSO, this field cannot
     *         be specified.
     *         </p>
     */
    public String getSingleSignOnUserValue() {
        return singleSignOnUserValue;
    }

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this
     * UserProfile. If the Domain's AuthMode is SSO, this field is required, and
     * must match a valid username of a user in your directory. If the Domain's
     * AuthMode is not SSO, this field cannot be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param singleSignOnUserValue <p>
     *            The username of the associated AWS Single Sign-On User for
     *            this UserProfile. If the Domain's AuthMode is SSO, this field
     *            is required, and must match a valid username of a user in your
     *            directory. If the Domain's AuthMode is not SSO, this field
     *            cannot be specified.
     *            </p>
     */
    public void setSingleSignOnUserValue(String singleSignOnUserValue) {
        this.singleSignOnUserValue = singleSignOnUserValue;
    }

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this
     * UserProfile. If the Domain's AuthMode is SSO, this field is required, and
     * must match a valid username of a user in your directory. If the Domain's
     * AuthMode is not SSO, this field cannot be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param singleSignOnUserValue <p>
     *            The username of the associated AWS Single Sign-On User for
     *            this UserProfile. If the Domain's AuthMode is SSO, this field
     *            is required, and must match a valid username of a user in your
     *            directory. If the Domain's AuthMode is not SSO, this field
     *            cannot be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withSingleSignOnUserValue(String singleSignOnUserValue) {
        this.singleSignOnUserValue = singleSignOnUserValue;
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     *
     * @return <p>
     *         Each tag consists of a key and an optional value. Tag keys must
     *         be unique per resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     *
     * @return <p>
     *         A collection of settings.
     *         </p>
     */
    public UserSettings getUserSettings() {
        return userSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     *
     * @param userSettings <p>
     *            A collection of settings.
     *            </p>
     */
    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userSettings <p>
     *            A collection of settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileRequest withUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
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
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId() + ",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: " + getUserProfileName() + ",");
        if (getSingleSignOnUserIdentifier() != null)
            sb.append("SingleSignOnUserIdentifier: " + getSingleSignOnUserIdentifier() + ",");
        if (getSingleSignOnUserValue() != null)
            sb.append("SingleSignOnUserValue: " + getSingleSignOnUserValue() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUserSettings() != null)
            sb.append("UserSettings: " + getUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleSignOnUserIdentifier() == null) ? 0 : getSingleSignOnUserIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleSignOnUserValue() == null) ? 0 : getSingleSignOnUserValue().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getUserSettings() == null) ? 0 : getUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserProfileRequest == false)
            return false;
        CreateUserProfileRequest other = (CreateUserProfileRequest) obj;

        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null
                && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getSingleSignOnUserIdentifier() == null
                ^ this.getSingleSignOnUserIdentifier() == null)
            return false;
        if (other.getSingleSignOnUserIdentifier() != null
                && other.getSingleSignOnUserIdentifier().equals(
                        this.getSingleSignOnUserIdentifier()) == false)
            return false;
        if (other.getSingleSignOnUserValue() == null ^ this.getSingleSignOnUserValue() == null)
            return false;
        if (other.getSingleSignOnUserValue() != null
                && other.getSingleSignOnUserValue().equals(this.getSingleSignOnUserValue()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null
                && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }
}
