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

public class DescribeNotificationConfigurationsResult implements Serializable {
    /**
     * <p>
     * The notification configurations.
     * </p>
     */
    private java.util.List<NotificationConfiguration> notificationConfigurations = new java.util.ArrayList<NotificationConfiguration>();

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The notification configurations.
     * </p>
     *
     * @return <p>
     *         The notification configurations.
     *         </p>
     */
    public java.util.List<NotificationConfiguration> getNotificationConfigurations() {
        return notificationConfigurations;
    }

    /**
     * <p>
     * The notification configurations.
     * </p>
     *
     * @param notificationConfigurations <p>
     *            The notification configurations.
     *            </p>
     */
    public void setNotificationConfigurations(
            java.util.Collection<NotificationConfiguration> notificationConfigurations) {
        if (notificationConfigurations == null) {
            this.notificationConfigurations = null;
            return;
        }

        this.notificationConfigurations = new java.util.ArrayList<NotificationConfiguration>(
                notificationConfigurations);
    }

    /**
     * <p>
     * The notification configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfigurations <p>
     *            The notification configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotificationConfigurationsResult withNotificationConfigurations(
            NotificationConfiguration... notificationConfigurations) {
        if (getNotificationConfigurations() == null) {
            this.notificationConfigurations = new java.util.ArrayList<NotificationConfiguration>(
                    notificationConfigurations.length);
        }
        for (NotificationConfiguration value : notificationConfigurations) {
            this.notificationConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The notification configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfigurations <p>
     *            The notification configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotificationConfigurationsResult withNotificationConfigurations(
            java.util.Collection<NotificationConfiguration> notificationConfigurations) {
        setNotificationConfigurations(notificationConfigurations);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNotificationConfigurationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNotificationConfigurations() != null)
            sb.append("NotificationConfigurations: " + getNotificationConfigurations() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNotificationConfigurations() == null) ? 0 : getNotificationConfigurations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNotificationConfigurationsResult == false)
            return false;
        DescribeNotificationConfigurationsResult other = (DescribeNotificationConfigurationsResult) obj;

        if (other.getNotificationConfigurations() == null
                ^ this.getNotificationConfigurations() == null)
            return false;
        if (other.getNotificationConfigurations() != null
                && other.getNotificationConfigurations().equals(
                        this.getNotificationConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
