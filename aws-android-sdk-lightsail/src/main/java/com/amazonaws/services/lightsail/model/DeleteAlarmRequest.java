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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an alarm.
 * </p>
 * <p>
 * An alarm is used to monitor a single metric for one of your resources. When a
 * metric condition is met, the alarm can notify you by email, SMS text message,
 * and a banner displayed on the Amazon Lightsail console. For more information,
 * see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
 * >Alarms in Amazon Lightsail</a>.
 * </p>
 */
public class DeleteAlarmRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the alarm to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The name of the alarm to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the alarm to delete.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The name of the alarm to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm to delete.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAlarmRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
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
        if (getAlarmName() != null)
            sb.append("alarmName: " + getAlarmName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAlarmRequest == false)
            return false;
        DeleteAlarmRequest other = (DeleteAlarmRequest) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        return true;
    }
}
