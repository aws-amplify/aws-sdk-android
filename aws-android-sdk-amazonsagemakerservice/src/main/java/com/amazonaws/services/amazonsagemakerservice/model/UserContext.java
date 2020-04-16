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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the user who created or modified an experiment, trial, or
 * trial component.
 * </p>
 */
public class UserContext implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     */
    private String userProfileArn;

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     */
    private String userProfileName;

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     */
    private String domainId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user's profile.
     *         </p>
     */
    public String getUserProfileArn() {
        return userProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     *
     * @param userProfileArn <p>
     *            The Amazon Resource Name (ARN) of the user's profile.
     *            </p>
     */
    public void setUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user's profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userProfileArn <p>
     *            The Amazon Resource Name (ARN) of the user's profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserContext withUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
        return this;
    }

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     *
     * @return <p>
     *         The name of the user's profile.
     *         </p>
     */
    public String getUserProfileName() {
        return userProfileName;
    }

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     *
     * @param userProfileName <p>
     *            The name of the user's profile.
     *            </p>
     */
    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The name of the user's profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userProfileName <p>
     *            The name of the user's profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserContext withUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
        return this;
    }

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     *
     * @return <p>
     *         The domain associated with the user.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     *
     * @param domainId <p>
     *            The domain associated with the user.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain associated with the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainId <p>
     *            The domain associated with the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserContext withDomainId(String domainId) {
        this.domainId = domainId;
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
        if (getUserProfileArn() != null)
            sb.append("UserProfileArn: " + getUserProfileArn() + ",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: " + getUserProfileName() + ",");
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserProfileArn() == null) ? 0 : getUserProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContext == false)
            return false;
        UserContext other = (UserContext) obj;

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
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        return true;
    }
}
