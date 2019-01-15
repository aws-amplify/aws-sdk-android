/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class DescribeAutoScalingNotificationTypesResult implements Serializable {
    /**
     * <p>
     * The notification types.
     * </p>
     */
    private java.util.List<String> autoScalingNotificationTypes = new java.util.ArrayList<String>();

    /**
     * <p>
     * The notification types.
     * </p>
     *
     * @return <p>
     *         The notification types.
     *         </p>
     */
    public java.util.List<String> getAutoScalingNotificationTypes() {
        return autoScalingNotificationTypes;
    }

    /**
     * <p>
     * The notification types.
     * </p>
     *
     * @param autoScalingNotificationTypes <p>
     *            The notification types.
     *            </p>
     */
    public void setAutoScalingNotificationTypes(
            java.util.Collection<String> autoScalingNotificationTypes) {
        if (autoScalingNotificationTypes == null) {
            this.autoScalingNotificationTypes = null;
            return;
        }

        this.autoScalingNotificationTypes = new java.util.ArrayList<String>(
                autoScalingNotificationTypes);
    }

    /**
     * <p>
     * The notification types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingNotificationTypes <p>
     *            The notification types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(
            String... autoScalingNotificationTypes) {
        if (getAutoScalingNotificationTypes() == null) {
            this.autoScalingNotificationTypes = new java.util.ArrayList<String>(
                    autoScalingNotificationTypes.length);
        }
        for (String value : autoScalingNotificationTypes) {
            this.autoScalingNotificationTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The notification types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingNotificationTypes <p>
     *            The notification types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(
            java.util.Collection<String> autoScalingNotificationTypes) {
        setAutoScalingNotificationTypes(autoScalingNotificationTypes);
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
        if (getAutoScalingNotificationTypes() != null)
            sb.append("AutoScalingNotificationTypes: " + getAutoScalingNotificationTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutoScalingNotificationTypes() == null) ? 0
                        : getAutoScalingNotificationTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutoScalingNotificationTypesResult == false)
            return false;
        DescribeAutoScalingNotificationTypesResult other = (DescribeAutoScalingNotificationTypesResult) obj;

        if (other.getAutoScalingNotificationTypes() == null
                ^ this.getAutoScalingNotificationTypes() == null)
            return false;
        if (other.getAutoScalingNotificationTypes() != null
                && other.getAutoScalingNotificationTypes().equals(
                        this.getAutoScalingNotificationTypes()) == false)
            return false;
        return true;
    }
}
