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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * The container element for an Object Lock rule.
 * </p>
 */
public class ObjectLockRule implements Serializable {
    /**
     * <p>
     * The default retention period that you want to apply to new objects placed
     * in the specified bucket.
     * </p>
     */
    private DefaultRetention defaultRetention;

    /**
     * <p>
     * The default retention period that you want to apply to new objects placed
     * in the specified bucket.
     * </p>
     *
     * @return <p>
     *         The default retention period that you want to apply to new
     *         objects placed in the specified bucket.
     *         </p>
     */
    public DefaultRetention getDefaultRetention() {
        return defaultRetention;
    }

    /**
     * <p>
     * The default retention period that you want to apply to new objects placed
     * in the specified bucket.
     * </p>
     *
     * @param defaultRetention <p>
     *            The default retention period that you want to apply to new
     *            objects placed in the specified bucket.
     *            </p>
     */
    public void setDefaultRetention(DefaultRetention defaultRetention) {
        this.defaultRetention = defaultRetention;
    }

    /**
     * <p>
     * The default retention period that you want to apply to new objects placed
     * in the specified bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultRetention <p>
     *            The default retention period that you want to apply to new
     *            objects placed in the specified bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ObjectLockRule withDefaultRetention(DefaultRetention defaultRetention) {
        this.defaultRetention = defaultRetention;
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
        if (getDefaultRetention() != null)
            sb.append("DefaultRetention: " + getDefaultRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultRetention() == null) ? 0 : getDefaultRetention().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLockRule == false)
            return false;
        ObjectLockRule other = (ObjectLockRule) obj;

        if (other.getDefaultRetention() == null ^ this.getDefaultRetention() == null)
            return false;
        if (other.getDefaultRetention() != null
                && other.getDefaultRetention().equals(this.getDefaultRetention()) == false)
            return false;
        return true;
    }
}
