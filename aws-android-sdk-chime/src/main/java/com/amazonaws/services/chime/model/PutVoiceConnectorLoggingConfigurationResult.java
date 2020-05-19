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

public class PutVoiceConnectorLoggingConfigurationResult implements Serializable {
    /**
     * <p>
     * The updated logging configuration details.
     * </p>
     */
    private LoggingConfiguration loggingConfiguration;

    /**
     * <p>
     * The updated logging configuration details.
     * </p>
     *
     * @return <p>
     *         The updated logging configuration details.
     *         </p>
     */
    public LoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * <p>
     * The updated logging configuration details.
     * </p>
     *
     * @param loggingConfiguration <p>
     *            The updated logging configuration details.
     *            </p>
     */
    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The updated logging configuration details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingConfiguration <p>
     *            The updated logging configuration details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorLoggingConfigurationResult withLoggingConfiguration(
            LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
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
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: " + getLoggingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorLoggingConfigurationResult == false)
            return false;
        PutVoiceConnectorLoggingConfigurationResult other = (PutVoiceConnectorLoggingConfigurationResult) obj;

        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null
                && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        return true;
    }
}
