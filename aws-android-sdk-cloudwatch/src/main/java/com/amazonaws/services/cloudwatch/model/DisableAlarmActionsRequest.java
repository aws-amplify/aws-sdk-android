/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables actions for the specified alarms. When an alarm's actions are
 * disabled the alarm's state may change, but none of the alarm's actions will
 * execute.
 * </p>
 */
public class DisableAlarmActionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The names of the alarms to disable actions for.
     * </p>
     */
    private java.util.List<String> alarmNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The names of the alarms to disable actions for.
     * </p>
     *
     * @return <p>
     *         The names of the alarms to disable actions for.
     *         </p>
     */
    public java.util.List<String> getAlarmNames() {
        return alarmNames;
    }

    /**
     * <p>
     * The names of the alarms to disable actions for.
     * </p>
     *
     * @param alarmNames <p>
     *            The names of the alarms to disable actions for.
     *            </p>
     */
    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new java.util.ArrayList<String>(alarmNames);
    }

    /**
     * <p>
     * The names of the alarms to disable actions for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmNames <p>
     *            The names of the alarms to disable actions for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableAlarmActionsRequest withAlarmNames(String... alarmNames) {
        if (getAlarmNames() == null) {
            this.alarmNames = new java.util.ArrayList<String>(alarmNames.length);
        }
        for (String value : alarmNames) {
            this.alarmNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the alarms to disable actions for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmNames <p>
     *            The names of the alarms to disable actions for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableAlarmActionsRequest withAlarmNames(java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: " + getAlarmNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAlarmActionsRequest == false)
            return false;
        DisableAlarmActionsRequest other = (DisableAlarmActionsRequest) obj;

        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null
                && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        return true;
    }
}
