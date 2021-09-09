/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Parameters used when defining a mitigation action that enable Amazon Web
 * Services IoT Core logging.
 * </p>
 */
public class EnableIoTLoggingParams implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArnForLogging;

    /**
     * <p>
     * Specifies the type of information to be logged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     */
    private String logLevel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role used for logging.
     *         </p>
     */
    public String getRoleArnForLogging() {
        return roleArnForLogging;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArnForLogging <p>
     *            The Amazon Resource Name (ARN) of the IAM role used for
     *            logging.
     *            </p>
     */
    public void setRoleArnForLogging(String roleArnForLogging) {
        this.roleArnForLogging = roleArnForLogging;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArnForLogging <p>
     *            The Amazon Resource Name (ARN) of the IAM role used for
     *            logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableIoTLoggingParams withRoleArnForLogging(String roleArnForLogging) {
        this.roleArnForLogging = roleArnForLogging;
        return this;
    }

    /**
     * <p>
     * Specifies the type of information to be logged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @return <p>
     *         Specifies the type of information to be logged.
     *         </p>
     * @see LogLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * <p>
     * Specifies the type of information to be logged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            Specifies the type of information to be logged.
     *            </p>
     * @see LogLevel
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Specifies the type of information to be logged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            Specifies the type of information to be logged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public EnableIoTLoggingParams withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * <p>
     * Specifies the type of information to be logged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            Specifies the type of information to be logged.
     *            </p>
     * @see LogLevel
     */
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
    }

    /**
     * <p>
     * Specifies the type of information to be logged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param logLevel <p>
     *            Specifies the type of information to be logged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public EnableIoTLoggingParams withLogLevel(LogLevel logLevel) {
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
        if (getRoleArnForLogging() != null)
            sb.append("roleArnForLogging: " + getRoleArnForLogging() + ",");
        if (getLogLevel() != null)
            sb.append("logLevel: " + getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleArnForLogging() == null) ? 0 : getRoleArnForLogging().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableIoTLoggingParams == false)
            return false;
        EnableIoTLoggingParams other = (EnableIoTLoggingParams) obj;

        if (other.getRoleArnForLogging() == null ^ this.getRoleArnForLogging() == null)
            return false;
        if (other.getRoleArnForLogging() != null
                && other.getRoleArnForLogging().equals(this.getRoleArnForLogging()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }
}
