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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * Contains logging configuration information for a type.
 * </p>
 */
public class LoggingConfig implements Serializable {
    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log
     * entries to CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     */
    private String logRoleArn;

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error
     * logging information when invoking the type's handlers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log
     * entries to CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The ARN of the role that CloudFormation should assume when
     *         sending log entries to CloudWatch logs.
     *         </p>
     */
    public String getLogRoleArn() {
        return logRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log
     * entries to CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     *
     * @param logRoleArn <p>
     *            The ARN of the role that CloudFormation should assume when
     *            sending log entries to CloudWatch logs.
     *            </p>
     */
    public void setLogRoleArn(String logRoleArn) {
        this.logRoleArn = logRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log
     * entries to CloudWatch logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     *
     * @param logRoleArn <p>
     *            The ARN of the role that CloudFormation should assume when
     *            sending log entries to CloudWatch logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withLogRoleArn(String logRoleArn) {
        this.logRoleArn = logRoleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error
     * logging information when invoking the type's handlers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The Amazon CloudWatch log group to which CloudFormation sends
     *         error logging information when invoking the type's handlers.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error
     * logging information when invoking the type's handlers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The Amazon CloudWatch log group to which CloudFormation sends
     *            error logging information when invoking the type's handlers.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error
     * logging information when invoking the type's handlers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The Amazon CloudWatch log group to which CloudFormation sends
     *            error logging information when invoking the type's handlers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfig withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
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
        if (getLogRoleArn() != null)
            sb.append("LogRoleArn: " + getLogRoleArn() + ",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogRoleArn() == null) ? 0 : getLogRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;

        if (other.getLogRoleArn() == null ^ this.getLogRoleArn() == null)
            return false;
        if (other.getLogRoleArn() != null
                && other.getLogRoleArn().equals(this.getLogRoleArn()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }
}
