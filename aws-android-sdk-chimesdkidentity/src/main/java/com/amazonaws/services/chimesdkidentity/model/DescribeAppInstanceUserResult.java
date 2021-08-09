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

public class DescribeAppInstanceUserResult implements Serializable {
    /**
     * <p>
     * The name of the <code>AppInstanceUser</code>.
     * </p>
     */
    private AppInstanceUser appInstanceUser;

    /**
     * <p>
     * The name of the <code>AppInstanceUser</code>.
     * </p>
     *
     * @return <p>
     *         The name of the <code>AppInstanceUser</code>.
     *         </p>
     */
    public AppInstanceUser getAppInstanceUser() {
        return appInstanceUser;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUser</code>.
     * </p>
     *
     * @param appInstanceUser <p>
     *            The name of the <code>AppInstanceUser</code>.
     *            </p>
     */
    public void setAppInstanceUser(AppInstanceUser appInstanceUser) {
        this.appInstanceUser = appInstanceUser;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceUser <p>
     *            The name of the <code>AppInstanceUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAppInstanceUserResult withAppInstanceUser(AppInstanceUser appInstanceUser) {
        this.appInstanceUser = appInstanceUser;
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
        if (getAppInstanceUser() != null)
            sb.append("AppInstanceUser: " + getAppInstanceUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceUser() == null) ? 0 : getAppInstanceUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppInstanceUserResult == false)
            return false;
        DescribeAppInstanceUserResult other = (DescribeAppInstanceUserResult) obj;

        if (other.getAppInstanceUser() == null ^ this.getAppInstanceUser() == null)
            return false;
        if (other.getAppInstanceUser() != null
                && other.getAppInstanceUser().equals(this.getAppInstanceUser()) == false)
            return false;
        return true;
    }
}
