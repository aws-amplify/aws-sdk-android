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

/**
 * <p>
 * Information related to a user.
 * </p>
 */
public class UserData implements Serializable {
    /**
     * <p>
     * The ARN of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String userArn;

    /**
     * <p>
     * The first name of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     */
    private String firstName;

    /**
     * <p>
     * The last name of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     */
    private String lastName;

    /**
     * <p>
     * The email of a user.
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
     * The enrollment status of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, PENDING, REGISTERED, DISASSOCIATING,
     * DEREGISTERING
     */
    private String enrollmentStatus;

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String enrollmentId;

    /**
     * <p>
     * The ARN of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of a user.
     *         </p>
     */
    public String getUserArn() {
        return userArn;
    }

    /**
     * <p>
     * The ARN of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param userArn <p>
     *            The ARN of a user.
     *            </p>
     */
    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The ARN of a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param userArn <p>
     *            The ARN of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withUserArn(String userArn) {
        this.userArn = userArn;
        return this;
    }

    /**
     * <p>
     * The first name of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @return <p>
     *         The first name of a user.
     *         </p>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * <p>
     * The first name of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @param firstName <p>
     *            The first name of a user.
     *            </p>
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of a user.
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
     *            The first name of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * <p>
     * The last name of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @return <p>
     *         The last name of a user.
     *         </p>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * <p>
     * The last name of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     * <b>Pattern: </b>([A-Za-z\-' 0-9._]|\p{IsLetter})*<br/>
     *
     * @param lastName <p>
     *            The last name of a user.
     *            </p>
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of a user.
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
     *            The last name of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * <p>
     * The email of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @return <p>
     *         The email of a user.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern:
     * </b>([0-9a-zA-Z]([+-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z]([-\w]*[0-9
     * a-zA-Z]+)*\.)+[a-zA-Z]{2,9})<br/>
     *
     * @param email <p>
     *            The email of a user.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of a user.
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
     *            The email of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, PENDING, REGISTERED, DISASSOCIATING,
     * DEREGISTERING
     *
     * @return <p>
     *         The enrollment status of a user.
     *         </p>
     * @see EnrollmentStatus
     */
    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, PENDING, REGISTERED, DISASSOCIATING,
     * DEREGISTERING
     *
     * @param enrollmentStatus <p>
     *            The enrollment status of a user.
     *            </p>
     * @see EnrollmentStatus
     */
    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, PENDING, REGISTERED, DISASSOCIATING,
     * DEREGISTERING
     *
     * @param enrollmentStatus <p>
     *            The enrollment status of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnrollmentStatus
     */
    public UserData withEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, PENDING, REGISTERED, DISASSOCIATING,
     * DEREGISTERING
     *
     * @param enrollmentStatus <p>
     *            The enrollment status of a user.
     *            </p>
     * @see EnrollmentStatus
     */
    public void setEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus.toString();
    }

    /**
     * <p>
     * The enrollment status of a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, PENDING, REGISTERED, DISASSOCIATING,
     * DEREGISTERING
     *
     * @param enrollmentStatus <p>
     *            The enrollment status of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnrollmentStatus
     */
    public UserData withEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The enrollment ARN of a user.
     *         </p>
     */
    public String getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param enrollmentId <p>
     *            The enrollment ARN of a user.
     *            </p>
     */
    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * <p>
     * The enrollment ARN of a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param enrollmentId <p>
     *            The enrollment ARN of a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
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
        if (getUserArn() != null)
            sb.append("UserArn: " + getUserArn() + ",");
        if (getFirstName() != null)
            sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null)
            sb.append("LastName: " + getLastName() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getEnrollmentStatus() != null)
            sb.append("EnrollmentStatus: " + getEnrollmentStatus() + ",");
        if (getEnrollmentId() != null)
            sb.append("EnrollmentId: " + getEnrollmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode
                + ((getEnrollmentStatus() == null) ? 0 : getEnrollmentStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEnrollmentId() == null) ? 0 : getEnrollmentId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserData == false)
            return false;
        UserData other = (UserData) obj;

        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
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
        if (other.getEnrollmentStatus() == null ^ this.getEnrollmentStatus() == null)
            return false;
        if (other.getEnrollmentStatus() != null
                && other.getEnrollmentStatus().equals(this.getEnrollmentStatus()) == false)
            return false;
        if (other.getEnrollmentId() == null ^ this.getEnrollmentId() == null)
            return false;
        if (other.getEnrollmentId() != null
                && other.getEnrollmentId().equals(this.getEnrollmentId()) == false)
            return false;
        return true;
    }
}
