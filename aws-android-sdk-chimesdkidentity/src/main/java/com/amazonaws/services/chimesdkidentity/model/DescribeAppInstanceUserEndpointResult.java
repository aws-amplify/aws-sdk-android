/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

public class DescribeAppInstanceUserEndpointResult implements Serializable {
    /**
     * <p>
     * The full details of an <code>AppInstanceUserEndpoint</code>: the
     * <code>AppInstanceUserArn</code>, ID, name, type, resource ARN,
     * attributes, allow messages, state, and created and last updated
     * timestamps. All timestamps use epoch milliseconds.
     * </p>
     */
    private AppInstanceUserEndpoint appInstanceUserEndpoint;

    /**
     * <p>
     * The full details of an <code>AppInstanceUserEndpoint</code>: the
     * <code>AppInstanceUserArn</code>, ID, name, type, resource ARN,
     * attributes, allow messages, state, and created and last updated
     * timestamps. All timestamps use epoch milliseconds.
     * </p>
     *
     * @return <p>
     *         The full details of an <code>AppInstanceUserEndpoint</code>: the
     *         <code>AppInstanceUserArn</code>, ID, name, type, resource ARN,
     *         attributes, allow messages, state, and created and last updated
     *         timestamps. All timestamps use epoch milliseconds.
     *         </p>
     */
    public AppInstanceUserEndpoint getAppInstanceUserEndpoint() {
        return appInstanceUserEndpoint;
    }

    /**
     * <p>
     * The full details of an <code>AppInstanceUserEndpoint</code>: the
     * <code>AppInstanceUserArn</code>, ID, name, type, resource ARN,
     * attributes, allow messages, state, and created and last updated
     * timestamps. All timestamps use epoch milliseconds.
     * </p>
     *
     * @param appInstanceUserEndpoint <p>
     *            The full details of an <code>AppInstanceUserEndpoint</code>:
     *            the <code>AppInstanceUserArn</code>, ID, name, type, resource
     *            ARN, attributes, allow messages, state, and created and last
     *            updated timestamps. All timestamps use epoch milliseconds.
     *            </p>
     */
    public void setAppInstanceUserEndpoint(AppInstanceUserEndpoint appInstanceUserEndpoint) {
        this.appInstanceUserEndpoint = appInstanceUserEndpoint;
    }

    /**
     * <p>
     * The full details of an <code>AppInstanceUserEndpoint</code>: the
     * <code>AppInstanceUserArn</code>, ID, name, type, resource ARN,
     * attributes, allow messages, state, and created and last updated
     * timestamps. All timestamps use epoch milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceUserEndpoint <p>
     *            The full details of an <code>AppInstanceUserEndpoint</code>:
     *            the <code>AppInstanceUserArn</code>, ID, name, type, resource
     *            ARN, attributes, allow messages, state, and created and last
     *            updated timestamps. All timestamps use epoch milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppInstanceUserEndpointResult withAppInstanceUserEndpoint(
            AppInstanceUserEndpoint appInstanceUserEndpoint) {
        this.appInstanceUserEndpoint = appInstanceUserEndpoint;
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
        if (getAppInstanceUserEndpoint() != null)
            sb.append("AppInstanceUserEndpoint: " + getAppInstanceUserEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAppInstanceUserEndpoint() == null) ? 0 : getAppInstanceUserEndpoint()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppInstanceUserEndpointResult == false)
            return false;
        DescribeAppInstanceUserEndpointResult other = (DescribeAppInstanceUserEndpointResult) obj;

        if (other.getAppInstanceUserEndpoint() == null ^ this.getAppInstanceUserEndpoint() == null)
            return false;
        if (other.getAppInstanceUserEndpoint() != null
                && other.getAppInstanceUserEndpoint().equals(this.getAppInstanceUserEndpoint()) == false)
            return false;
        return true;
    }
}
