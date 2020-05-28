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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class LoggingInfo implements Serializable {
    /**
     * The new value for the brokerLogs property for this object.
     */
    private BrokerLogs brokerLogs;

    /**
     * Returns the value of the brokerLogs property for this object.
     *
     * @return The value of the brokerLogs property for this object.
     */
    public BrokerLogs getBrokerLogs() {
        return brokerLogs;
    }

    /**
     * Sets the value of brokerLogs
     *
     * @param brokerLogs The new value for the brokerLogs property for this
     *            object.
     */
    public void setBrokerLogs(BrokerLogs brokerLogs) {
        this.brokerLogs = brokerLogs;
    }

    /**
     * Sets the value of the brokerLogs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerLogs The new value for the brokerLogs property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingInfo withBrokerLogs(BrokerLogs brokerLogs) {
        this.brokerLogs = brokerLogs;
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
        if (getBrokerLogs() != null)
            sb.append("BrokerLogs: " + getBrokerLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerLogs() == null) ? 0 : getBrokerLogs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingInfo == false)
            return false;
        LoggingInfo other = (LoggingInfo) obj;

        if (other.getBrokerLogs() == null ^ this.getBrokerLogs() == null)
            return false;
        if (other.getBrokerLogs() != null
                && other.getBrokerLogs().equals(this.getBrokerLogs()) == false)
            return false;
        return true;
    }
}
