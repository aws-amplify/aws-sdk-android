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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration options for sending command output to CloudWatch Logs.
 * </p>
 */
public class CloudWatchOutputConfig implements Serializable {
    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command
     * output. If you don't specify a group name, Systems Manager automatically
     * creates a log group for you. The log group uses the following naming
     * format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String cloudWatchLogGroupName;

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     */
    private Boolean cloudWatchOutputEnabled;

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command
     * output. If you don't specify a group name, Systems Manager automatically
     * creates a log group for you. The log group uses the following naming
     * format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The name of the CloudWatch log group where you want to send
     *         command output. If you don't specify a group name, Systems
     *         Manager automatically creates a log group for you. The log group
     *         uses the following naming format:
     *         aws/ssm/<i>SystemsManagerDocumentName</i>.
     *         </p>
     */
    public String getCloudWatchLogGroupName() {
        return cloudWatchLogGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command
     * output. If you don't specify a group name, Systems Manager automatically
     * creates a log group for you. The log group uses the following naming
     * format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param cloudWatchLogGroupName <p>
     *            The name of the CloudWatch log group where you want to send
     *            command output. If you don't specify a group name, Systems
     *            Manager automatically creates a log group for you. The log
     *            group uses the following naming format:
     *            aws/ssm/<i>SystemsManagerDocumentName</i>.
     *            </p>
     */
    public void setCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where you want to send command
     * output. If you don't specify a group name, Systems Manager automatically
     * creates a log group for you. The log group uses the following naming
     * format: aws/ssm/<i>SystemsManagerDocumentName</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param cloudWatchLogGroupName <p>
     *            The name of the CloudWatch log group where you want to send
     *            command output. If you don't specify a group name, Systems
     *            Manager automatically creates a log group for you. The log
     *            group uses the following naming format:
     *            aws/ssm/<i>SystemsManagerDocumentName</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchOutputConfig withCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
        return this;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Enables Systems Manager to send command output to CloudWatch
     *         Logs.
     *         </p>
     */
    public Boolean isCloudWatchOutputEnabled() {
        return cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Enables Systems Manager to send command output to CloudWatch
     *         Logs.
     *         </p>
     */
    public Boolean getCloudWatchOutputEnabled() {
        return cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     *
     * @param cloudWatchOutputEnabled <p>
     *            Enables Systems Manager to send command output to CloudWatch
     *            Logs.
     *            </p>
     */
    public void setCloudWatchOutputEnabled(Boolean cloudWatchOutputEnabled) {
        this.cloudWatchOutputEnabled = cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchOutputEnabled <p>
     *            Enables Systems Manager to send command output to CloudWatch
     *            Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchOutputConfig withCloudWatchOutputEnabled(Boolean cloudWatchOutputEnabled) {
        this.cloudWatchOutputEnabled = cloudWatchOutputEnabled;
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
        if (getCloudWatchLogGroupName() != null)
            sb.append("CloudWatchLogGroupName: " + getCloudWatchLogGroupName() + ",");
        if (getCloudWatchOutputEnabled() != null)
            sb.append("CloudWatchOutputEnabled: " + getCloudWatchOutputEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudWatchLogGroupName() == null) ? 0 : getCloudWatchLogGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchOutputEnabled() == null) ? 0 : getCloudWatchOutputEnabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchOutputConfig == false)
            return false;
        CloudWatchOutputConfig other = (CloudWatchOutputConfig) obj;

        if (other.getCloudWatchLogGroupName() == null ^ this.getCloudWatchLogGroupName() == null)
            return false;
        if (other.getCloudWatchLogGroupName() != null
                && other.getCloudWatchLogGroupName().equals(this.getCloudWatchLogGroupName()) == false)
            return false;
        if (other.getCloudWatchOutputEnabled() == null ^ this.getCloudWatchOutputEnabled() == null)
            return false;
        if (other.getCloudWatchOutputEnabled() != null
                && other.getCloudWatchOutputEnabled().equals(this.getCloudWatchOutputEnabled()) == false)
            return false;
        return true;
    }
}
