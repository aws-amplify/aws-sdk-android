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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Access log settings, including the access log format and access log
 * destination ARN.
 * </p>
 */
public class AccessLogSettings implements Serializable {
    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     * >$context variables</a>. The format must include at least
     * <code>$context.requestId</code>.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
     * Kinesis Data Firehose delivery stream to receive access logs. If you
     * specify a Kinesis Data Firehose delivery stream, the stream name must
     * begin with <code>amazon-apigateway-</code>.
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     * >$context variables</a>. The format must include at least
     * <code>$context.requestId</code>.
     * </p>
     *
     * @return <p>
     *         A single line format of the access logs of data, as specified by
     *         selected <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     *         >$context variables</a>. The format must include at least
     *         <code>$context.requestId</code>.
     *         </p>
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     * >$context variables</a>. The format must include at least
     * <code>$context.requestId</code>.
     * </p>
     *
     * @param format <p>
     *            A single line format of the access logs of data, as specified
     *            by selected <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     *            >$context variables</a>. The format must include at least
     *            <code>$context.requestId</code>.
     *            </p>
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A single line format of the access logs of data, as specified by selected
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     * >$context variables</a>. The format must include at least
     * <code>$context.requestId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param format <p>
     *            A single line format of the access logs of data, as specified
     *            by selected <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference"
     *            >$context variables</a>. The format must include at least
     *            <code>$context.requestId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLogSettings withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
     * Kinesis Data Firehose delivery stream to receive access logs. If you
     * specify a Kinesis Data Firehose delivery stream, the stream name must
     * begin with <code>amazon-apigateway-</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the CloudWatch Logs log group
     *         or Kinesis Data Firehose delivery stream to receive access logs.
     *         If you specify a Kinesis Data Firehose delivery stream, the
     *         stream name must begin with <code>amazon-apigateway-</code>.
     *         </p>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
     * Kinesis Data Firehose delivery stream to receive access logs. If you
     * specify a Kinesis Data Firehose delivery stream, the stream name must
     * begin with <code>amazon-apigateway-</code>.
     * </p>
     *
     * @param destinationArn <p>
     *            The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *            group or Kinesis Data Firehose delivery stream to receive
     *            access logs. If you specify a Kinesis Data Firehose delivery
     *            stream, the stream name must begin with
     *            <code>amazon-apigateway-</code>.
     *            </p>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
     * Kinesis Data Firehose delivery stream to receive access logs. If you
     * specify a Kinesis Data Firehose delivery stream, the stream name must
     * begin with <code>amazon-apigateway-</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationArn <p>
     *            The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *            group or Kinesis Data Firehose delivery stream to receive
     *            access logs. If you specify a Kinesis Data Firehose delivery
     *            stream, the stream name must begin with
     *            <code>amazon-apigateway-</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLogSettings withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
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
        if (getFormat() != null)
            sb.append("format: " + getFormat() + ",");
        if (getDestinationArn() != null)
            sb.append("destinationArn: " + getDestinationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
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

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        return true;
    }
}
