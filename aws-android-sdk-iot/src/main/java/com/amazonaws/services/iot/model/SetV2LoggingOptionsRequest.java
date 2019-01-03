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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the logging options for the V2 logging service.
 * </p>
 */
public class SetV2LoggingOptionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The default logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     */
    private String defaultLogLevel;

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     */
    private Boolean disableAllLogs;

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     *
     * @return <p>
     *         The ARN of the role that allows IoT to write to Cloudwatch logs.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the role that allows IoT to write to Cloudwatch
     *            logs.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the role that allows IoT to write to Cloudwatch
     *            logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetV2LoggingOptionsRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @return <p>
     *         The default logging level.
     *         </p>
     * @see LogLevel
     */
    public String getDefaultLogLevel() {
        return defaultLogLevel;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param defaultLogLevel <p>
     *            The default logging level.
     *            </p>
     * @see LogLevel
     */
    public void setDefaultLogLevel(String defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param defaultLogLevel <p>
     *            The default logging level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public SetV2LoggingOptionsRequest withDefaultLogLevel(String defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel;
        return this;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param defaultLogLevel <p>
     *            The default logging level.
     *            </p>
     * @see LogLevel
     */
    public void setDefaultLogLevel(LogLevel defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel.toString();
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEBUG, INFO, ERROR, WARN, DISABLED
     *
     * @param defaultLogLevel <p>
     *            The default logging level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogLevel
     */
    public SetV2LoggingOptionsRequest withDefaultLogLevel(LogLevel defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     *
     * @return <p>
     *         If true all logs are disabled. The default is false.
     *         </p>
     */
    public Boolean isDisableAllLogs() {
        return disableAllLogs;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     *
     * @return <p>
     *         If true all logs are disabled. The default is false.
     *         </p>
     */
    public Boolean getDisableAllLogs() {
        return disableAllLogs;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     *
     * @param disableAllLogs <p>
     *            If true all logs are disabled. The default is false.
     *            </p>
     */
    public void setDisableAllLogs(Boolean disableAllLogs) {
        this.disableAllLogs = disableAllLogs;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableAllLogs <p>
     *            If true all logs are disabled. The default is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetV2LoggingOptionsRequest withDisableAllLogs(Boolean disableAllLogs) {
        this.disableAllLogs = disableAllLogs;
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
        if (getDefaultLogLevel() != null)
            sb.append("defaultLogLevel: " + getDefaultLogLevel() + ",");
        if (getDisableAllLogs() != null)
            sb.append("disableAllLogs: " + getDisableAllLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultLogLevel() == null) ? 0 : getDefaultLogLevel().hashCode());
        hashCode = prime * hashCode
                + ((getDisableAllLogs() == null) ? 0 : getDisableAllLogs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetV2LoggingOptionsRequest == false)
            return false;
        SetV2LoggingOptionsRequest other = (SetV2LoggingOptionsRequest) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDefaultLogLevel() == null ^ this.getDefaultLogLevel() == null)
            return false;
        if (other.getDefaultLogLevel() != null
                && other.getDefaultLogLevel().equals(this.getDefaultLogLevel()) == false)
            return false;
        if (other.getDisableAllLogs() == null ^ this.getDisableAllLogs() == null)
            return false;
        if (other.getDisableAllLogs() != null
                && other.getDisableAllLogs().equals(this.getDisableAllLogs()) == false)
            return false;
        return true;
    }
}
