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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * Settings for logging access in a stage.
 * </p>
 */
public class AccessLogSettings implements Serializable {
    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * $context variables. The format must include at least $context.requestId.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     *
     * @return <p>
     *         The ARN of the CloudWatch Logs log group to receive access logs.
     *         </p>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     *
     * @param destinationArn <p>
     *            The ARN of the CloudWatch Logs log group to receive access
     *            logs.
     *            </p>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log group to receive access logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationArn <p>
     *            The ARN of the CloudWatch Logs log group to receive access
     *            logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLogSettings withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * $context variables. The format must include at least $context.requestId.
     * </p>
     *
     * @return <p>
     *         A single line format of the access logs of data, as specified by
     *         selected $context variables. The format must include at least
     *         $context.requestId.
     *         </p>
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * $context variables. The format must include at least $context.requestId.
     * </p>
     *
     * @param format <p>
     *            A single line format of the access logs of data, as specified
     *            by selected $context variables. The format must include at
     *            least $context.requestId.
     *            </p>
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * $context variables. The format must include at least $context.requestId.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param format <p>
     *            A single line format of the access logs of data, as specified
     *            by selected $context variables. The format must include at
     *            least $context.requestId.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLogSettings withFormat(String format) {
        this.format = format;
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
        if (getDestinationArn() != null)
            sb.append("DestinationArn: " + getDestinationArn() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessLogSettings == false)
            return false;
        AccessLogSettings other = (AccessLogSettings) obj;

        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }
}
