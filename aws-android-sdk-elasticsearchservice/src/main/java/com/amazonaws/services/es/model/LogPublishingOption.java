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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Log Publishing option that is set for given domain. <br/>
 * Attributes and their details:
 * <ul>
 * <li>CloudWatchLogsLogGroupArn: ARN of the Cloudwatch log group to which log
 * needs to be published.</li>
 * <li>Enabled: Whether the log publishing for given log type is enabled or not</li>
 * </ul>
 * </p>
 */
public class LogPublishingOption implements Serializable {
    /**
     * <p>
     * ARN of the Cloudwatch log group to which log needs to be published.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;

    /**
     * <p>
     * Specifies whether given log publishing option is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * ARN of the Cloudwatch log group to which log needs to be published.
     * </p>
     *
     * @return <p>
     *         ARN of the Cloudwatch log group to which log needs to be
     *         published.
     *         </p>
     */
    public String getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * ARN of the Cloudwatch log group to which log needs to be published.
     * </p>
     *
     * @param cloudWatchLogsLogGroupArn <p>
     *            ARN of the Cloudwatch log group to which log needs to be
     *            published.
     *            </p>
     */
    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * ARN of the Cloudwatch log group to which log needs to be published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogsLogGroupArn <p>
     *            ARN of the Cloudwatch log group to which log needs to be
     *            published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogPublishingOption withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
        return this;
    }

    /**
     * <p>
     * Specifies whether given log publishing option is enabled or not.
     * </p>
     *
     * @return <p>
     *         Specifies whether given log publishing option is enabled or not.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether given log publishing option is enabled or not.
     * </p>
     *
     * @return <p>
     *         Specifies whether given log publishing option is enabled or not.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether given log publishing option is enabled or not.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether given log publishing option is enabled or
     *            not.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether given log publishing option is enabled or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether given log publishing option is enabled or
     *            not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogPublishingOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: " + getCloudWatchLogsLogGroupArn() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCloudWatchLogsLogGroupArn() == null) ? 0 : getCloudWatchLogsLogGroupArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogPublishingOption == false)
            return false;
        LogPublishingOption other = (LogPublishingOption) obj;

        if (other.getCloudWatchLogsLogGroupArn() == null
                ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null
                && other.getCloudWatchLogsLogGroupArn().equals(this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
