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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a user.
 * </p>
 */
public class CreateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9@_+.-]*<br/>
     */
    private String userId;

    /**
     * <p>
     * The first name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     */
    private String firstName;

    /**
     * <p>
     * The last name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     */
    private String lastName;

    /**
     * <p>
     * The email address for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     */
    private String email;

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures
     * idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The tags for the user.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9@_+.-]*<br/>
     *
     * @return <p>
     *         The ARN for the user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ARN for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9@_+.-]*<br/>
     *
     * @param userId <p>
     *            The ARN for the user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ARN for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9@_+.-]*<br/>
     *
     * @param userId <p>
     *            The ARN for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The first name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @return <p>
     *         The first name for the user.
     *         </p>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * <p>
     * The first name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @param firstName <p>
     *            The first name for the user.
     *            </p>
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @param firstName <p>
     *            The first name for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * <p>
     * The last name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @return <p>
     *         The last name for the user.
     *         </p>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * <p>
     * The last name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @param lastName <p>
     *            The last name for the user.
     *            </p>
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @param lastName <p>
     *            The last name for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * <p>
     * The email address for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @return <p>
     *         The email address for the user.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @param email <p>
     *            The email address for the user.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the user.
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
     * @param email <p>
     *            The email address for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures
     * idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         A unique, user-specified identifier for this request that ensures
     *         idempotency.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures
     * idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique, user-specified identifier for this request that
     *            ensures idempotency.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures
     * idempotency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique, user-specified identifier for this request that
     *            ensures idempotency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The tags for the user.
     * </p>
     *
     * @return <p>
     *         The tags for the user.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the user.
     * </p>
     *
     * @param tags <p>
     *            The tags for the user.
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
     * The tags for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withTags(Tag... tags) {
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
     * The tags for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getFirstName() != null)
            sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null)
            sb.append("LastName: " + getLastName() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null
                && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
