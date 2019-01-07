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
 * A structure containing the alert target ARN and the role ARN.
 * </p>
 */
public class AlertTarget implements Serializable {
    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     */
    private String alertTargetArn;

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the
     * notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     *
     * @return <p>
     *         The ARN of the notification target to which alerts are sent.
     *         </p>
     */
    public String getAlertTargetArn() {
        return alertTargetArn;
    }

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     *
     * @param alertTargetArn <p>
     *            The ARN of the notification target to which alerts are sent.
     *            </p>
     */
    public void setAlertTargetArn(String alertTargetArn) {
        this.alertTargetArn = alertTargetArn;
    }

    /**
     * <p>
     * The ARN of the notification target to which alerts are sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alertTargetArn <p>
     *            The ARN of the notification target to which alerts are sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlertTarget withAlertTargetArn(String alertTargetArn) {
        this.alertTargetArn = alertTargetArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the
     * notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the role that grants permission to send alerts to the
     *         notification target.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the
     * notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to send alerts to
     *            the notification target.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to send alerts to the
     * notification target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to send alerts to
     *            the notification target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlertTarget withRoleArn(String roleArn) {
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
        if (getAlertTargetArn() != null)
            sb.append("alertTargetArn: " + getAlertTargetArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlertTargetArn() == null) ? 0 : getAlertTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlertTarget == false)
            return false;
        AlertTarget other = (AlertTarget) obj;

        if (other.getAlertTargetArn() == null ^ this.getAlertTargetArn() == null)
            return false;
        if (other.getAlertTargetArn() != null
                && other.getAlertTargetArn().equals(this.getAlertTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
