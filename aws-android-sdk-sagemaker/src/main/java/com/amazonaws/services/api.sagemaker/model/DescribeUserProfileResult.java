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

public class DescribeUserProfileResult implements Serializable {
    /**
     * <p>
     * The ID of the domain that contains the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     */
    private String domainId;

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     */
    private String userProfileArn;

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String userProfileName;

    /**
     * <p>
     * The ID of the user's profile in the Amazon Elastic File System (EFS)
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String homeEfsFileSystemUid;

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleting, Failed, InService, Pending
     */
    private String status;

    /**
     * <p>
     * The last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     */
    private String singleSignOnUserIdentifier;

    /**
     * <p>
     * The SSO user value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String singleSignOnUserValue;

    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings userSettings;

    /**
     * <p>
     * The ID of the domain that contains the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @return <p>
     *         The ID of the domain that contains the profile.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The ID of the domain that contains the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The ID of the domain that contains the profile.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain that contains the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The ID of the domain that contains the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     *
     * @return <p>
     *         The user profile Amazon Resource Name (ARN).
     *         </p>
     */
    public String getUserProfileArn() {
        return userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     *
     * @param userProfileArn <p>
     *            The user profile Amazon Resource Name (ARN).
     *            </p>
     */
    public void setUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     *
     * @param userProfileArn <p>
     *            The user profile Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
        return this;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The user profile name.
     *         </p>
     */
    public String getUserProfileName() {
        return userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            The user profile name.
     *            </p>
     */
    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The user profile name.
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
     *            The user profile name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
        return this;
    }

    /**
     * <p>
     * The ID of the user's profile in the Amazon Elastic File System (EFS)
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         The ID of the user's profile in the Amazon Elastic File System
     *         (EFS) volume.
     *         </p>
     */
    public String getHomeEfsFileSystemUid() {
        return homeEfsFileSystemUid;
    }

    /**
     * <p>
     * The ID of the user's profile in the Amazon Elastic File System (EFS)
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param homeEfsFileSystemUid <p>
     *            The ID of the user's profile in the Amazon Elastic File System
     *            (EFS) volume.
     *            </p>
     */
    public void setHomeEfsFileSystemUid(String homeEfsFileSystemUid) {
        this.homeEfsFileSystemUid = homeEfsFileSystemUid;
    }

    /**
     * <p>
     * The ID of the user's profile in the Amazon Elastic File System (EFS)
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param homeEfsFileSystemUid <p>
     *            The ID of the user's profile in the Amazon Elastic File System
     *            (EFS) volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withHomeEfsFileSystemUid(String homeEfsFileSystemUid) {
        this.homeEfsFileSystemUid = homeEfsFileSystemUid;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleting, Failed, InService, Pending
     *
     * @return <p>
     *         The status.
     *         </p>
     * @see UserProfileStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see UserProfileStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserProfileStatus
     */
    public DescribeUserProfileResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see UserProfileStatus
     */
    public void setStatus(UserProfileStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Deleting, Failed, InService, Pending
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserProfileStatus
     */
    public DescribeUserProfileResult withStatus(UserProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     *
     * @return <p>
     *         The last modified time.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The last modified time.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The last modified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @return <p>
     *         The creation time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The failure reason.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The failure reason.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The failure reason.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     *
     * @return <p>
     *         The SSO user identifier.
     *         </p>
     */
    public String getSingleSignOnUserIdentifier() {
        return singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     *
     * @param singleSignOnUserIdentifier <p>
     *            The SSO user identifier.
     *            </p>
     */
    public void setSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * The SSO user identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>UserName<br/>
     *
     * @param singleSignOnUserIdentifier <p>
     *            The SSO user identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withSingleSignOnUserIdentifier(
            String singleSignOnUserIdentifier) {
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
        return this;
    }

    /**
     * <p>
     * The SSO user value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The SSO user value.
     *         </p>
     */
    public String getSingleSignOnUserValue() {
        return singleSignOnUserValue;
    }

    /**
     * <p>
     * The SSO user value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param singleSignOnUserValue <p>
     *            The SSO user value.
     *            </p>
     */
    public void setSingleSignOnUserValue(String singleSignOnUserValue) {
        this.singleSignOnUserValue = singleSignOnUserValue;
    }

    /**
     * <p>
     * The SSO user value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param singleSignOnUserValue <p>
     *            The SSO user value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserProfileResult withSingleSignOnUserValue(String singleSignOnUserValue) {
        this.singleSignOnUserValue = singleSignOnUserValue;
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
    public DescribeUserProfileResult withUserSettings(UserSettings userSettings) {
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
        if (getUserProfileArn() != null)
            sb.append("UserProfileArn: " + getUserProfileArn() + ",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: " + getUserProfileName() + ",");
        if (getHomeEfsFileSystemUid() != null)
            sb.append("HomeEfsFileSystemUid: " + getHomeEfsFileSystemUid() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getSingleSignOnUserIdentifier() != null)
            sb.append("SingleSignOnUserIdentifier: " + getSingleSignOnUserIdentifier() + ",");
        if (getSingleSignOnUserValue() != null)
            sb.append("SingleSignOnUserValue: " + getSingleSignOnUserValue() + ",");
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
                + ((getUserProfileArn() == null) ? 0 : getUserProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getHomeEfsFileSystemUid() == null) ? 0 : getHomeEfsFileSystemUid().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleSignOnUserIdentifier() == null) ? 0 : getSingleSignOnUserIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleSignOnUserValue() == null) ? 0 : getSingleSignOnUserValue().hashCode());
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

        if (obj instanceof DescribeUserProfileResult == false)
            return false;
        DescribeUserProfileResult other = (DescribeUserProfileResult) obj;

        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileArn() == null ^ this.getUserProfileArn() == null)
            return false;
        if (other.getUserProfileArn() != null
                && other.getUserProfileArn().equals(this.getUserProfileArn()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null
                && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getHomeEfsFileSystemUid() == null ^ this.getHomeEfsFileSystemUid() == null)
            return false;
        if (other.getHomeEfsFileSystemUid() != null
                && other.getHomeEfsFileSystemUid().equals(this.getHomeEfsFileSystemUid()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
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
        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null
                && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }
}
