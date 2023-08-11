/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The CloudWatch logging destination of a user pool detailed activity logging
 * configuration.
 * </p>
 */
public class CloudWatchLogsConfigurationType implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
     * user pool sends logs. The log group must not be encrypted with Key
     * Management Service and must be in the same Amazon Web Services account as
     * your user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String logGroupArn;

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
     * user pool sends logs. The log group must not be encrypted with Key
     * Management Service and must be in the same Amazon Web Services account as
     * your user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (arn) of a CloudWatch Logs log group
     *         where your user pool sends logs. The log group must not be
     *         encrypted with Key Management Service and must be in the same
     *         Amazon Web Services account as your user pool.
     *         </p>
     */
    public String getLogGroupArn() {
        return logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
     * user pool sends logs. The log group must not be encrypted with Key
     * Management Service and must be in the same Amazon Web Services account as
     * your user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param logGroupArn <p>
     *            The Amazon Resource Name (arn) of a CloudWatch Logs log group
     *            where your user pool sends logs. The log group must not be
     *            encrypted with Key Management Service and must be in the same
     *            Amazon Web Services account as your user pool.
     *            </p>
     */
    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
     * user pool sends logs. The log group must not be encrypted with Key
     * Management Service and must be in the same Amazon Web Services account as
     * your user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param logGroupArn <p>
     *            The Amazon Resource Name (arn) of a CloudWatch Logs log group
     *            where your user pool sends logs. The log group must not be
     *            encrypted with Key Management Service and must be in the same
     *            Amazon Web Services account as your user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchLogsConfigurationType withLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
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
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: " + getLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogsConfigurationType == false)
            return false;
        CloudWatchLogsConfigurationType other = (CloudWatchLogsConfigurationType) obj;

        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null
                && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        return true;
    }
}
