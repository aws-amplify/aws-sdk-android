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
 * Deletes a specified user by user ARN and enrollment ARN.
 * </p>
 */
public class DeleteUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
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
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String enrollmentId;

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the user to delete in the organization. Required.
     *         </p>
     */
    public String getUserArn() {
        return userArn;
    }

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param userArn <p>
     *            The ARN of the user to delete in the organization. Required.
     *            </p>
     */
    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The ARN of the user to delete in the organization. Required.
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
     *            The ARN of the user to delete in the organization. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUserRequest withUserArn(String userArn) {
        this.userArn = userArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The ARN of the user's enrollment in the organization. Required.
     *         </p>
     */
    public String getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param enrollmentId <p>
     *            The ARN of the user's enrollment in the organization.
     *            Required.
     *            </p>
     */
    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * <p>
     * The ARN of the user's enrollment in the organization. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param enrollmentId <p>
     *            The ARN of the user's enrollment in the organization.
     *            Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUserRequest withEnrollmentId(String enrollmentId) {
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

        if (obj instanceof DeleteUserRequest == false)
            return false;
        DeleteUserRequest other = (DeleteUserRequest) obj;

        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getEnrollmentId() == null ^ this.getEnrollmentId() == null)
            return false;
        if (other.getEnrollmentId() != null
                && other.getEnrollmentId().equals(this.getEnrollmentId()) == false)
            return false;
        return true;
    }
}
