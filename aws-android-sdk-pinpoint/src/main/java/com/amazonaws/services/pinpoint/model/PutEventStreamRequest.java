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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new event stream for an application or updates the settings of an
 * existing event stream for an application.
 * </p>
 */
public class PutEventStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an event stream to publish
     * events to and the AWS Identity and Access Management (IAM) role to use
     * when publishing those events.
     * </p>
     */
    private WriteEventStream writeEventStream;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventStreamRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an event stream to publish
     * events to and the AWS Identity and Access Management (IAM) role to use
     * when publishing those events.
     * </p>
     *
     * @return <p>
     *         Specifies the Amazon Resource Name (ARN) of an event stream to
     *         publish events to and the AWS Identity and Access Management
     *         (IAM) role to use when publishing those events.
     *         </p>
     */
    public WriteEventStream getWriteEventStream() {
        return writeEventStream;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an event stream to publish
     * events to and the AWS Identity and Access Management (IAM) role to use
     * when publishing those events.
     * </p>
     *
     * @param writeEventStream <p>
     *            Specifies the Amazon Resource Name (ARN) of an event stream to
     *            publish events to and the AWS Identity and Access Management
     *            (IAM) role to use when publishing those events.
     *            </p>
     */
    public void setWriteEventStream(WriteEventStream writeEventStream) {
        this.writeEventStream = writeEventStream;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an event stream to publish
     * events to and the AWS Identity and Access Management (IAM) role to use
     * when publishing those events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeEventStream <p>
     *            Specifies the Amazon Resource Name (ARN) of an event stream to
     *            publish events to and the AWS Identity and Access Management
     *            (IAM) role to use when publishing those events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventStreamRequest withWriteEventStream(WriteEventStream writeEventStream) {
        this.writeEventStream = writeEventStream;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getWriteEventStream() != null)
            sb.append("WriteEventStream: " + getWriteEventStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getWriteEventStream() == null) ? 0 : getWriteEventStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventStreamRequest == false)
            return false;
        PutEventStreamRequest other = (PutEventStreamRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWriteEventStream() == null ^ this.getWriteEventStream() == null)
            return false;
        if (other.getWriteEventStream() != null
                && other.getWriteEventStream().equals(this.getWriteEventStream()) == false)
            return false;
        return true;
    }
}
