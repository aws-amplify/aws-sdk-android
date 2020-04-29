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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * The Amazon Kinesis Data Firehose, <code>RedactedFields</code> information,
 * and the web ACL Amazon Resource Name (ARN).
 * </p>
 */
public class LoggingConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with <code>LogDestinationConfigs</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * An array of Amazon Kinesis Data Firehose ARNs.
     * </p>
     */
    private java.util.List<String> logDestinationConfigs;

    /**
     * <p>
     * The parts of the request that you want redacted from the logs. For
     * example, if you redact the cookie field, the cookie field in the firehose
     * will be <code>xxx</code>.
     * </p>
     */
    private java.util.List<FieldToMatch> redactedFields;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with <code>LogDestinationConfigs</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the web ACL that you want to
     *         associate with <code>LogDestinationConfigs</code>.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with <code>LogDestinationConfigs</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the web ACL that you want to
     *            associate with <code>LogDestinationConfigs</code>.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate
     * with <code>LogDestinationConfigs</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the web ACL that you want to
     *            associate with <code>LogDestinationConfigs</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfiguration withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * An array of Amazon Kinesis Data Firehose ARNs.
     * </p>
     *
     * @return <p>
     *         An array of Amazon Kinesis Data Firehose ARNs.
     *         </p>
     */
    public java.util.List<String> getLogDestinationConfigs() {
        return logDestinationConfigs;
    }

    /**
     * <p>
     * An array of Amazon Kinesis Data Firehose ARNs.
     * </p>
     *
     * @param logDestinationConfigs <p>
     *            An array of Amazon Kinesis Data Firehose ARNs.
     *            </p>
     */
    public void setLogDestinationConfigs(java.util.Collection<String> logDestinationConfigs) {
        if (logDestinationConfigs == null) {
            this.logDestinationConfigs = null;
            return;
        }

        this.logDestinationConfigs = new java.util.ArrayList<String>(logDestinationConfigs);
    }

    /**
     * <p>
     * An array of Amazon Kinesis Data Firehose ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logDestinationConfigs <p>
     *            An array of Amazon Kinesis Data Firehose ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfiguration withLogDestinationConfigs(String... logDestinationConfigs) {
        if (getLogDestinationConfigs() == null) {
            this.logDestinationConfigs = new java.util.ArrayList<String>(
                    logDestinationConfigs.length);
        }
        for (String value : logDestinationConfigs) {
            this.logDestinationConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Kinesis Data Firehose ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logDestinationConfigs <p>
     *            An array of Amazon Kinesis Data Firehose ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfiguration withLogDestinationConfigs(
            java.util.Collection<String> logDestinationConfigs) {
        setLogDestinationConfigs(logDestinationConfigs);
        return this;
    }

    /**
     * <p>
     * The parts of the request that you want redacted from the logs. For
     * example, if you redact the cookie field, the cookie field in the firehose
     * will be <code>xxx</code>.
     * </p>
     *
     * @return <p>
     *         The parts of the request that you want redacted from the logs.
     *         For example, if you redact the cookie field, the cookie field in
     *         the firehose will be <code>xxx</code>.
     *         </p>
     */
    public java.util.List<FieldToMatch> getRedactedFields() {
        return redactedFields;
    }

    /**
     * <p>
     * The parts of the request that you want redacted from the logs. For
     * example, if you redact the cookie field, the cookie field in the firehose
     * will be <code>xxx</code>.
     * </p>
     *
     * @param redactedFields <p>
     *            The parts of the request that you want redacted from the logs.
     *            For example, if you redact the cookie field, the cookie field
     *            in the firehose will be <code>xxx</code>.
     *            </p>
     */
    public void setRedactedFields(java.util.Collection<FieldToMatch> redactedFields) {
        if (redactedFields == null) {
            this.redactedFields = null;
            return;
        }

        this.redactedFields = new java.util.ArrayList<FieldToMatch>(redactedFields);
    }

    /**
     * <p>
     * The parts of the request that you want redacted from the logs. For
     * example, if you redact the cookie field, the cookie field in the firehose
     * will be <code>xxx</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redactedFields <p>
     *            The parts of the request that you want redacted from the logs.
     *            For example, if you redact the cookie field, the cookie field
     *            in the firehose will be <code>xxx</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfiguration withRedactedFields(FieldToMatch... redactedFields) {
        if (getRedactedFields() == null) {
            this.redactedFields = new java.util.ArrayList<FieldToMatch>(redactedFields.length);
        }
        for (FieldToMatch value : redactedFields) {
            this.redactedFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The parts of the request that you want redacted from the logs. For
     * example, if you redact the cookie field, the cookie field in the firehose
     * will be <code>xxx</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redactedFields <p>
     *            The parts of the request that you want redacted from the logs.
     *            For example, if you redact the cookie field, the cookie field
     *            in the firehose will be <code>xxx</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingConfiguration withRedactedFields(java.util.Collection<FieldToMatch> redactedFields) {
        setRedactedFields(redactedFields);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getLogDestinationConfigs() != null)
            sb.append("LogDestinationConfigs: " + getLogDestinationConfigs() + ",");
        if (getRedactedFields() != null)
            sb.append("RedactedFields: " + getRedactedFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getLogDestinationConfigs() == null) ? 0 : getLogDestinationConfigs().hashCode());
        hashCode = prime * hashCode
                + ((getRedactedFields() == null) ? 0 : getRedactedFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getLogDestinationConfigs() == null ^ this.getLogDestinationConfigs() == null)
            return false;
        if (other.getLogDestinationConfigs() != null
                && other.getLogDestinationConfigs().equals(this.getLogDestinationConfigs()) == false)
            return false;
        if (other.getRedactedFields() == null ^ this.getRedactedFields() == null)
            return false;
        if (other.getRedactedFields() != null
                && other.getRedactedFields().equals(this.getRedactedFields()) == false)
            return false;
        return true;
    }
}
