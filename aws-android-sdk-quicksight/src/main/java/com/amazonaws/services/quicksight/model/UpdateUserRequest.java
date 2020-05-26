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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an Amazon QuickSight user.
 * </p>
 */
public class UpdateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     */
    private String namespace;

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The Amazon QuickSight role of the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     */
    private String role;

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The Amazon QuickSight user name that you want to update.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param userName <p>
     *            The Amazon QuickSight user name that you want to update.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param userName <p>
     *            The Amazon QuickSight user name that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID for the AWS account that the user is in. Currently, you
     *         use the ID for the AWS account that contains your Amazon
     *         QuickSight account.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that the user is in. Currently, you
     *            use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that the user is in. Currently, you
     *            use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @return <p>
     *         The namespace. Currently, you should set this to
     *         <code>default</code>.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace. Currently, you should set this to
     *            <code>default</code>.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace. Currently, you should set this to
     *            <code>default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     *
     * @return <p>
     *         The email address of the user that you want to update.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     *
     * @param email <p>
     *            The email address of the user that you want to update.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the user that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address of the user that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @return <p>
     *         The Amazon QuickSight role of the user. The user role can be one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READER</code>: A user who has read-only access to
     *         dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHOR</code>: A user who can create data sources,
     *         datasets, analyses, and dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN</code>: A user who is an author, who can also manage
     *         Amazon QuickSight settings.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserRole
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role of the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserRole
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role of the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public UpdateUserRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role of the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserRole
     */
    public void setRole(UserRole role) {
        this.role = role.toString();
    }

    /**
     * <p>
     * The Amazon QuickSight role of the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role of the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public UpdateUserRequest withRole(UserRole role) {
        this.role = role.toString();
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }
}
