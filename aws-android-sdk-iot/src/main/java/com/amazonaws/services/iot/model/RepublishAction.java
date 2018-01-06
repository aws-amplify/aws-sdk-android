/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an action to republish to another topic.
 * </p>
 */
public class RepublishAction implements Serializable {
    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that grants access.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepublishAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     *
     * @return <p>
     *         The name of the MQTT topic.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     *
     * @param topic <p>
     *            The name of the MQTT topic.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The name of the MQTT topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepublishAction withTopic(String topic) {
        this.topic = topic;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getTopic() != null)
            sb.append("topic: " + getTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepublishAction == false)
            return false;
        RepublishAction other = (RepublishAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        return true;
    }
}
