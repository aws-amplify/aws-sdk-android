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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

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
 * Associates a <a>LoggingConfiguration</a> with a specified web ACL.
 * </p>
 * <p>
 * You can access information about all traffic that AWS WAF inspects using the
 * following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create an Amazon Kinesis Data Firehose.
 * </p>
 * <p>
 * Create the data firehose with a PUT source and in the region that you are
 * operating. However, if you are capturing logs for Amazon CloudFront, always
 * create the firehose in US East (N. Virginia).
 * </p>
 * <note>
 * <p>
 * Do not create the data firehose using a <code>Kinesis stream</code> as your
 * source.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * Associate that firehose to your web ACL using a
 * <code>PutLoggingConfiguration</code> request.
 * </p>
 * </li>
 * </ol>
 * <p>
 * When you successfully enable logging using a
 * <code>PutLoggingConfiguration</code> request, AWS WAF will create a service
 * linked role with the necessary permissions to write logs to the Amazon
 * Kinesis Data Firehose. For more information, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
 * >Logging Web ACL Traffic Information</a> in the <i>AWS WAF Developer
 * Guide</i>.
 * </p>
 */
public class PutLoggingConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic
     * information, the redacted fields details, and the Amazon Resource Name
     * (ARN) of the web ACL to monitor.
     * </p>
     * <note>
     * <p>
     * When specifying <code>Type</code> in <code>RedactedFields</code>, you
     * must use one of the following values: <code>URI</code>,
     * <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </note>
     */
    private LoggingConfiguration loggingConfiguration;

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic
     * information, the redacted fields details, and the Amazon Resource Name
     * (ARN) of the web ACL to monitor.
     * </p>
     * <note>
     * <p>
     * When specifying <code>Type</code> in <code>RedactedFields</code>, you
     * must use one of the following values: <code>URI</code>,
     * <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Kinesis Data Firehose that contains the inspected
     *         traffic information, the redacted fields details, and the Amazon
     *         Resource Name (ARN) of the web ACL to monitor.
     *         </p>
     *         <note>
     *         <p>
     *         When specifying <code>Type</code> in <code>RedactedFields</code>,
     *         you must use one of the following values: <code>URI</code>,
     *         <code>QUERY_STRING</code>, <code>HEADER</code>, or
     *         <code>METHOD</code>.
     *         </p>
     *         </note>
     */
    public LoggingConfiguration getLoggingConfiguration() {
        return loggingConfiguration;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic
     * information, the redacted fields details, and the Amazon Resource Name
     * (ARN) of the web ACL to monitor.
     * </p>
     * <note>
     * <p>
     * When specifying <code>Type</code> in <code>RedactedFields</code>, you
     * must use one of the following values: <code>URI</code>,
     * <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </note>
     *
     * @param loggingConfiguration <p>
     *            The Amazon Kinesis Data Firehose that contains the inspected
     *            traffic information, the redacted fields details, and the
     *            Amazon Resource Name (ARN) of the web ACL to monitor.
     *            </p>
     *            <note>
     *            <p>
     *            When specifying <code>Type</code> in
     *            <code>RedactedFields</code>, you must use one of the following
     *            values: <code>URI</code>, <code>QUERY_STRING</code>,
     *            <code>HEADER</code>, or <code>METHOD</code>.
     *            </p>
     *            </note>
     */
    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Firehose that contains the inspected traffic
     * information, the redacted fields details, and the Amazon Resource Name
     * (ARN) of the web ACL to monitor.
     * </p>
     * <note>
     * <p>
     * When specifying <code>Type</code> in <code>RedactedFields</code>, you
     * must use one of the following values: <code>URI</code>,
     * <code>QUERY_STRING</code>, <code>HEADER</code>, or <code>METHOD</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingConfiguration <p>
     *            The Amazon Kinesis Data Firehose that contains the inspected
     *            traffic information, the redacted fields details, and the
     *            Amazon Resource Name (ARN) of the web ACL to monitor.
     *            </p>
     *            <note>
     *            <p>
     *            When specifying <code>Type</code> in
     *            <code>RedactedFields</code>, you must use one of the following
     *            values: <code>URI</code>, <code>QUERY_STRING</code>,
     *            <code>HEADER</code>, or <code>METHOD</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLoggingConfigurationRequest withLoggingConfiguration(
            LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
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
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: " + getLoggingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLoggingConfigurationRequest == false)
            return false;
        PutLoggingConfigurationRequest other = (PutLoggingConfigurationRequest) obj;

        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null
                && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        return true;
    }
}
