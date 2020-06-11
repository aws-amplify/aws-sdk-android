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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The repository credentials for private registry authentication.
 * </p>
 */
public class RepositoryCredentials implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private
     * repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret
     * exists in the same Region as the task that you are launching then you can
     * use either the full ARN or the name of the secret. When you are using the
     * AWS Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     */
    private String credentialsParameter;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private
     * repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret
     * exists in the same Region as the task that you are launching then you can
     * use either the full ARN or the name of the secret. When you are using the
     * AWS Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the secret containing the
     *         private repository credentials.
     *         </p>
     *         <note>
     *         <p>
     *         When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if
     *         the secret exists in the same Region as the task that you are
     *         launching then you can use either the full ARN or the name of the
     *         secret. When you are using the AWS Management Console, you must
     *         specify the full ARN of the secret.
     *         </p>
     *         </note>
     */
    public String getCredentialsParameter() {
        return credentialsParameter;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private
     * repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret
     * exists in the same Region as the task that you are launching then you can
     * use either the full ARN or the name of the secret. When you are using the
     * AWS Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     *
     * @param credentialsParameter <p>
     *            The Amazon Resource Name (ARN) of the secret containing the
     *            private repository credentials.
     *            </p>
     *            <note>
     *            <p>
     *            When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if
     *            the secret exists in the same Region as the task that you are
     *            launching then you can use either the full ARN or the name of
     *            the secret. When you are using the AWS Management Console, you
     *            must specify the full ARN of the secret.
     *            </p>
     *            </note>
     */
    public void setCredentialsParameter(String credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret containing the private
     * repository credentials.
     * </p>
     * <note>
     * <p>
     * When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret
     * exists in the same Region as the task that you are launching then you can
     * use either the full ARN or the name of the secret. When you are using the
     * AWS Management Console, you must specify the full ARN of the secret.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentialsParameter <p>
     *            The Amazon Resource Name (ARN) of the secret containing the
     *            private repository credentials.
     *            </p>
     *            <note>
     *            <p>
     *            When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if
     *            the secret exists in the same Region as the task that you are
     *            launching then you can use either the full ARN or the name of
     *            the secret. When you are using the AWS Management Console, you
     *            must specify the full ARN of the secret.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryCredentials withCredentialsParameter(String credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
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
        if (getCredentialsParameter() != null)
            sb.append("credentialsParameter: " + getCredentialsParameter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCredentialsParameter() == null) ? 0 : getCredentialsParameter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryCredentials == false)
            return false;
        RepositoryCredentials other = (RepositoryCredentials) obj;

        if (other.getCredentialsParameter() == null ^ this.getCredentialsParameter() == null)
            return false;
        if (other.getCredentialsParameter() != null
                && other.getCredentialsParameter().equals(this.getCredentialsParameter()) == false)
            return false;
        return true;
    }
}
