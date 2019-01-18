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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Sends messge data to an AWS IoT Analytics channel.
 * </p>
 */
public class IotAnalyticsAction implements Serializable {
    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data
     * will be sent.
     * </p>
     */
    private String channelArn;

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     */
    private String channelName;

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics
     * permission to send message data via IoT Analytics
     * (iotanalytics:BatchPutMessage).
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data
     * will be sent.
     * </p>
     *
     * @return <p>
     *         (deprecated) The ARN of the IoT Analytics channel to which
     *         message data will be sent.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data
     * will be sent.
     * </p>
     *
     * @param channelArn <p>
     *            (deprecated) The ARN of the IoT Analytics channel to which
     *            message data will be sent.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * (deprecated) The ARN of the IoT Analytics channel to which message data
     * will be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelArn <p>
     *            (deprecated) The ARN of the IoT Analytics channel to which
     *            message data will be sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotAnalyticsAction withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     *
     * @return <p>
     *         The name of the IoT Analytics channel to which message data will
     *         be sent.
     *         </p>
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     *
     * @param channelName <p>
     *            The name of the IoT Analytics channel to which message data
     *            will be sent.
     *            </p>
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the IoT Analytics channel to which message data will be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelName <p>
     *            The name of the IoT Analytics channel to which message data
     *            will be sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotAnalyticsAction withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics
     * permission to send message data via IoT Analytics
     * (iotanalytics:BatchPutMessage).
     * </p>
     *
     * @return <p>
     *         The ARN of the role which has a policy that grants IoT Analytics
     *         permission to send message data via IoT Analytics
     *         (iotanalytics:BatchPutMessage).
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics
     * permission to send message data via IoT Analytics
     * (iotanalytics:BatchPutMessage).
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the role which has a policy that grants IoT
     *            Analytics permission to send message data via IoT Analytics
     *            (iotanalytics:BatchPutMessage).
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role which has a policy that grants IoT Analytics
     * permission to send message data via IoT Analytics
     * (iotanalytics:BatchPutMessage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the role which has a policy that grants IoT
     *            Analytics permission to send message data via IoT Analytics
     *            (iotanalytics:BatchPutMessage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotAnalyticsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getChannelArn() != null)
            sb.append("channelArn: " + getChannelArn() + ",");
        if (getChannelName() != null)
            sb.append("channelName: " + getChannelName() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode
                + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotAnalyticsAction == false)
            return false;
        IotAnalyticsAction other = (IotAnalyticsAction) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null
                && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
