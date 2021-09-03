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

public class DescribeAppInstanceResult implements Serializable {
    /**
     * <p>
     * The ARN, metadata, created and last-updated timestamps, and the name of
     * the <code>AppInstance</code>. All timestamps use epoch milliseconds.
     * </p>
     */
    private AppInstance appInstance;

    /**
     * <p>
     * The ARN, metadata, created and last-updated timestamps, and the name of
     * the <code>AppInstance</code>. All timestamps use epoch milliseconds.
     * </p>
     *
     * @return <p>
     *         The ARN, metadata, created and last-updated timestamps, and the
     *         name of the <code>AppInstance</code>. All timestamps use epoch
     *         milliseconds.
     *         </p>
     */
    public AppInstance getAppInstance() {
        return appInstance;
    }

    /**
     * <p>
     * The ARN, metadata, created and last-updated timestamps, and the name of
     * the <code>AppInstance</code>. All timestamps use epoch milliseconds.
     * </p>
     *
     * @param appInstance <p>
     *            The ARN, metadata, created and last-updated timestamps, and
     *            the name of the <code>AppInstance</code>. All timestamps use
     *            epoch milliseconds.
     *            </p>
     */
    public void setAppInstance(AppInstance appInstance) {
        this.appInstance = appInstance;
    }

    /**
     * <p>
     * The ARN, metadata, created and last-updated timestamps, and the name of
     * the <code>AppInstance</code>. All timestamps use epoch milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstance <p>
     *            The ARN, metadata, created and last-updated timestamps, and
     *            the name of the <code>AppInstance</code>. All timestamps use
     *            epoch milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppInstanceResult withAppInstance(AppInstance appInstance) {
        this.appInstance = appInstance;
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
        if (getAppInstance() != null)
            sb.append("AppInstance: " + getAppInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstance() == null) ? 0 : getAppInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppInstanceResult == false)
            return false;
        DescribeAppInstanceResult other = (DescribeAppInstanceResult) obj;

        if (other.getAppInstance() == null ^ this.getAppInstance() == null)
            return false;
        if (other.getAppInstance() != null
                && other.getAppInstance().equals(this.getAppInstance()) == false)
            return false;
        return true;
    }
}
