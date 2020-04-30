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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * The values of the AWS IoT Events logging options.
 * </p>
 */
public class LoggingOptions implements Serializable {
    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, DEBUG
     */
    private String level;

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Information that identifies those detector models and their detectors
     * (instances) for which the logging level is given.
     * </p>
     */
    private java.util.List<DetectorDebugOption> detectorDebugOptions;

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the role that grants permission to AWS IoT Events to
     *         perform logging.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to AWS IoT Events
     *            to perform logging.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform
     * logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to AWS IoT Events
     *            to perform logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingOptions withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, DEBUG
     *
     * @return <p>
     *         The logging level.
     *         </p>
     * @see LoggingLevel
     */
    public String getLevel() {
        return level;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, DEBUG
     *
     * @param level <p>
     *            The logging level.
     *            </p>
     * @see LoggingLevel
     */
    public void setLevel(String level) {
        this.level = level;
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
     * <b>Allowed Values: </b>ERROR, INFO, DEBUG
     *
     * @param level <p>
     *            The logging level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoggingLevel
     */
    public LoggingOptions withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * <p>
     * The logging level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, DEBUG
     *
     * @param level <p>
     *            The logging level.
     *            </p>
     * @see LoggingLevel
     */
    public void setLevel(LoggingLevel level) {
        this.level = level.toString();
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
     * <b>Allowed Values: </b>ERROR, INFO, DEBUG
     *
     * @param level <p>
     *            The logging level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoggingLevel
     */
    public LoggingOptions withLevel(LoggingLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     *
     * @return <p>
     *         If TRUE, logging is enabled for AWS IoT Events.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     *
     * @return <p>
     *         If TRUE, logging is enabled for AWS IoT Events.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     *
     * @param enabled <p>
     *            If TRUE, logging is enabled for AWS IoT Events.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If TRUE, logging is enabled for AWS IoT Events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            If TRUE, logging is enabled for AWS IoT Events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors
     * (instances) for which the logging level is given.
     * </p>
     *
     * @return <p>
     *         Information that identifies those detector models and their
     *         detectors (instances) for which the logging level is given.
     *         </p>
     */
    public java.util.List<DetectorDebugOption> getDetectorDebugOptions() {
        return detectorDebugOptions;
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors
     * (instances) for which the logging level is given.
     * </p>
     *
     * @param detectorDebugOptions <p>
     *            Information that identifies those detector models and their
     *            detectors (instances) for which the logging level is given.
     *            </p>
     */
    public void setDetectorDebugOptions(
            java.util.Collection<DetectorDebugOption> detectorDebugOptions) {
        if (detectorDebugOptions == null) {
            this.detectorDebugOptions = null;
            return;
        }

        this.detectorDebugOptions = new java.util.ArrayList<DetectorDebugOption>(
                detectorDebugOptions);
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors
     * (instances) for which the logging level is given.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorDebugOptions <p>
     *            Information that identifies those detector models and their
     *            detectors (instances) for which the logging level is given.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingOptions withDetectorDebugOptions(DetectorDebugOption... detectorDebugOptions) {
        if (getDetectorDebugOptions() == null) {
            this.detectorDebugOptions = new java.util.ArrayList<DetectorDebugOption>(
                    detectorDebugOptions.length);
        }
        for (DetectorDebugOption value : detectorDebugOptions) {
            this.detectorDebugOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information that identifies those detector models and their detectors
     * (instances) for which the logging level is given.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorDebugOptions <p>
     *            Information that identifies those detector models and their
     *            detectors (instances) for which the logging level is given.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingOptions withDetectorDebugOptions(
            java.util.Collection<DetectorDebugOption> detectorDebugOptions) {
        setDetectorDebugOptions(detectorDebugOptions);
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
        if (getLevel() != null)
            sb.append("level: " + getLevel() + ",");
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getDetectorDebugOptions() != null)
            sb.append("detectorDebugOptions: " + getDetectorDebugOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorDebugOptions() == null) ? 0 : getDetectorDebugOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingOptions == false)
            return false;
        LoggingOptions other = (LoggingOptions) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDetectorDebugOptions() == null ^ this.getDetectorDebugOptions() == null)
            return false;
        if (other.getDetectorDebugOptions() != null
                && other.getDetectorDebugOptions().equals(this.getDetectorDebugOptions()) == false)
            return false;
        return true;
    }
}
