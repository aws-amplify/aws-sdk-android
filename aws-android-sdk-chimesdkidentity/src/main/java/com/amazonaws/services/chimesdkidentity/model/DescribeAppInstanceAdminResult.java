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

public class DescribeAppInstanceAdminResult implements Serializable {
    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the
     * <code>AppInstance</code>, and the created and last-updated timestamps.
     * All timestamps use epoch milliseconds.
     * </p>
     */
    private AppInstanceAdmin appInstanceAdmin;

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the
     * <code>AppInstance</code>, and the created and last-updated timestamps.
     * All timestamps use epoch milliseconds.
     * </p>
     *
     * @return <p>
     *         The ARN and name of the <code>AppInstanceUser</code>, the ARN of
     *         the <code>AppInstance</code>, and the created and last-updated
     *         timestamps. All timestamps use epoch milliseconds.
     *         </p>
     */
    public AppInstanceAdmin getAppInstanceAdmin() {
        return appInstanceAdmin;
    }

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the
     * <code>AppInstance</code>, and the created and last-updated timestamps.
     * All timestamps use epoch milliseconds.
     * </p>
     *
     * @param appInstanceAdmin <p>
     *            The ARN and name of the <code>AppInstanceUser</code>, the ARN
     *            of the <code>AppInstance</code>, and the created and
     *            last-updated timestamps. All timestamps use epoch
     *            milliseconds.
     *            </p>
     */
    public void setAppInstanceAdmin(AppInstanceAdmin appInstanceAdmin) {
        this.appInstanceAdmin = appInstanceAdmin;
    }

    /**
     * <p>
     * The ARN and name of the <code>AppInstanceUser</code>, the ARN of the
     * <code>AppInstance</code>, and the created and last-updated timestamps.
     * All timestamps use epoch milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceAdmin <p>
     *            The ARN and name of the <code>AppInstanceUser</code>, the ARN
     *            of the <code>AppInstance</code>, and the created and
     *            last-updated timestamps. All timestamps use epoch
     *            milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppInstanceAdminResult withAppInstanceAdmin(AppInstanceAdmin appInstanceAdmin) {
        this.appInstanceAdmin = appInstanceAdmin;
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
        if (getAppInstanceAdmin() != null)
            sb.append("AppInstanceAdmin: " + getAppInstanceAdmin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceAdmin() == null) ? 0 : getAppInstanceAdmin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppInstanceAdminResult == false)
            return false;
        DescribeAppInstanceAdminResult other = (DescribeAppInstanceAdminResult) obj;

        if (other.getAppInstanceAdmin() == null ^ this.getAppInstanceAdmin() == null)
            return false;
        if (other.getAppInstanceAdmin() != null
                && other.getAppInstanceAdmin().equals(this.getAppInstanceAdmin()) == false)
            return false;
        return true;
    }
}
