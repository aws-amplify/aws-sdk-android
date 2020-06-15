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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The logging configuration associated with an Amazon Chime Voice Connector.
 * Specifies whether SIP message logs are enabled for sending to Amazon
 * CloudWatch Logs.
 * </p>
 */
public class LoggingConfiguration implements Serializable {
    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch
     * Logs.
     * </p>
     */
    private Boolean enableSIPLogs;

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch
     * Logs.
     * </p>
     *
     * @return <p>
     *         When true, enables SIP message logs for sending to Amazon
     *         CloudWatch Logs.
     *         </p>
     */
    public Boolean isEnableSIPLogs() {
        return enableSIPLogs;
    }

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch
     * Logs.
     * </p>
     *
     * @return <p>
     *         When true, enables SIP message logs for sending to Amazon
     *         CloudWatch Logs.
     *         </p>
     */
    public Boolean getEnableSIPLogs() {
        return enableSIPLogs;
    }

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch
     * Logs.
     * </p>
     *
     * @param enableSIPLogs <p>
     *            When true, enables SIP message logs for sending to Amazon
     *            CloudWatch Logs.
     *            </p>
     */
    public void setEnableSIPLogs(Boolean enableSIPLogs) {
        this.enableSIPLogs = enableSIPLogs;
    }

    /**
     * <p>
     * When true, enables SIP message logs for sending to Amazon CloudWatch
     * Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableSIPLogs <p>
     *            When true, enables SIP message logs for sending to Amazon
     *            CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfiguration withEnableSIPLogs(Boolean enableSIPLogs) {
        this.enableSIPLogs = enableSIPLogs;
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
        if (getEnableSIPLogs() != null)
            sb.append("EnableSIPLogs: " + getEnableSIPLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableSIPLogs() == null) ? 0 : getEnableSIPLogs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;

        if (other.getEnableSIPLogs() == null ^ this.getEnableSIPLogs() == null)
            return false;
        if (other.getEnableSIPLogs() != null
                && other.getEnableSIPLogs().equals(this.getEnableSIPLogs()) == false)
            return false;
        return true;
    }
}
