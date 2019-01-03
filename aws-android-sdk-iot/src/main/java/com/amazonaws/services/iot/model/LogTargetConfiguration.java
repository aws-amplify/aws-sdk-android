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
 * The target configuration.
 * </p>
 */
public class LogTargetConfiguration implements Serializable {
    /**
     * <p>
     * A log target
     * </p>
     */
    private LogTarget logTarget;

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     */
    private String logLevel;

    /**
     * <p>
     * A log target
     * </p>
     *
     * @return <p>
     *         A log target
     *         </p>
     */
    public LogTarget getLogTarget() {
        return logTarget;
    }

    /**
     * <p>
     * A log target
     * </p>
     *
     * @param logTarget <p>
     *            A log target
     *            </p>
     */
    public void setLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
    }

    /**
     * <p>
     * A log target
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTarget <p>
     *            A log target
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogTargetConfiguration withLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @return <p>
     *         The logging level.
     *         </p>
     * @see LogLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            The logging level.
     *            </p>
     * @see LogLevel
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            The logging level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public LogTargetConfiguration withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            The logging level.
     *            </p>
     * @see LogLevel
     */
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            The logging level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public LogTargetConfiguration withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
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
        if (getLogTarget() != null)
            sb.append("logTarget: " + getLogTarget() + ",");
        if (getLogLevel() != null)
            sb.append("logLevel: " + getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogTarget() == null) ? 0 : getLogTarget().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogTargetConfiguration == false)
            return false;
        LogTargetConfiguration other = (LogTargetConfiguration) obj;

        if (other.getLogTarget() == null ^ this.getLogTarget() == null)
            return false;
        if (other.getLogTarget() != null
                && other.getLogTarget().equals(this.getLogTarget()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }
}
