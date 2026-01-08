/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information on the identity that created the file.
 * </p>
 */
public class CreatedByInfo implements Serializable {
    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     */
    private String connectUserArn;

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot
     * populate this and this value is calculated automatically if
     * <code>ConnectUserArn</code> is not provided.
     * </p>
     */
    private String aWSIdentityArn;

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     *
     * @return <p>
     *         An agent ARN representing a <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     *         >connect user</a>.
     *         </p>
     */
    public String getConnectUserArn() {
        return connectUserArn;
    }

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     *
     * @param connectUserArn <p>
     *            An agent ARN representing a <a href=
     *            "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     *            >connect user</a>.
     *            </p>
     */
    public void setConnectUserArn(String connectUserArn) {
        this.connectUserArn = connectUserArn;
    }

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectUserArn <p>
     *            An agent ARN representing a <a href=
     *            "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     *            >connect user</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatedByInfo withConnectUserArn(String connectUserArn) {
        this.connectUserArn = connectUserArn;
        return this;
    }

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot
     * populate this and this value is calculated automatically if
     * <code>ConnectUserArn</code> is not provided.
     * </p>
     *
     * @return <p>
     *         STS or IAM ARN representing the identity of API Caller. SDK users
     *         cannot populate this and this value is calculated automatically
     *         if <code>ConnectUserArn</code> is not provided.
     *         </p>
     */
    public String getAWSIdentityArn() {
        return aWSIdentityArn;
    }

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot
     * populate this and this value is calculated automatically if
     * <code>ConnectUserArn</code> is not provided.
     * </p>
     *
     * @param aWSIdentityArn <p>
     *            STS or IAM ARN representing the identity of API Caller. SDK
     *            users cannot populate this and this value is calculated
     *            automatically if <code>ConnectUserArn</code> is not provided.
     *            </p>
     */
    public void setAWSIdentityArn(String aWSIdentityArn) {
        this.aWSIdentityArn = aWSIdentityArn;
    }

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot
     * populate this and this value is calculated automatically if
     * <code>ConnectUserArn</code> is not provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSIdentityArn <p>
     *            STS or IAM ARN representing the identity of API Caller. SDK
     *            users cannot populate this and this value is calculated
     *            automatically if <code>ConnectUserArn</code> is not provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatedByInfo withAWSIdentityArn(String aWSIdentityArn) {
        this.aWSIdentityArn = aWSIdentityArn;
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
        if (getConnectUserArn() != null)
            sb.append("ConnectUserArn: " + getConnectUserArn() + ",");
        if (getAWSIdentityArn() != null)
            sb.append("AWSIdentityArn: " + getAWSIdentityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectUserArn() == null) ? 0 : getConnectUserArn().hashCode());
        hashCode = prime * hashCode
                + ((getAWSIdentityArn() == null) ? 0 : getAWSIdentityArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatedByInfo == false)
            return false;
        CreatedByInfo other = (CreatedByInfo) obj;

        if (other.getConnectUserArn() == null ^ this.getConnectUserArn() == null)
            return false;
        if (other.getConnectUserArn() != null
                && other.getConnectUserArn().equals(this.getConnectUserArn()) == false)
            return false;
        if (other.getAWSIdentityArn() == null ^ this.getAWSIdentityArn() == null)
            return false;
        if (other.getAWSIdentityArn() != null
                && other.getAWSIdentityArn().equals(this.getAWSIdentityArn()) == false)
            return false;
        return true;
    }
}
