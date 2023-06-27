/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class DescribeNotificationConfigurationResult implements Serializable {
    /**
     * <p>
     * The structure that contains the information required for notifications.
     * If the structure is null, the configuration will be deleted from the
     * stream.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * The structure that contains the information required for notifications.
     * If the structure is null, the configuration will be deleted from the
     * stream.
     * </p>
     *
     * @return <p>
     *         The structure that contains the information required for
     *         notifications. If the structure is null, the configuration will
     *         be deleted from the stream.
     *         </p>
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for notifications.
     * If the structure is null, the configuration will be deleted from the
     * stream.
     * </p>
     *
     * @param notificationConfiguration <p>
     *            The structure that contains the information required for
     *            notifications. If the structure is null, the configuration
     *            will be deleted from the stream.
     *            </p>
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for notifications.
     * If the structure is null, the configuration will be deleted from the
     * stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            The structure that contains the information required for
     *            notifications. If the structure is null, the configuration
     *            will be deleted from the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotificationConfigurationResult withNotificationConfiguration(
            NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
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
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotificationConfigurationResult == false)
            return false;
        DescribeNotificationConfigurationResult other = (DescribeNotificationConfigurationResult) obj;

        if (other.getNotificationConfiguration() == null
                ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null
                && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        return true;
    }
}
