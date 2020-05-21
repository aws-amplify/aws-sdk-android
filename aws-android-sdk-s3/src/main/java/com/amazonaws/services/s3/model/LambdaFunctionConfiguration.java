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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container for specifying the configuration for AWS Lambda notifications.
 * </p>
 */
public class LambdaFunctionConfiguration implements Serializable {
    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
     * invokes when the specified event type occurs.
     * </p>
     */
    private String lambdaFunctionArn;

    /**
     * <p>
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Supported Event Types</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * Specifies object key name filtering rules. For information about key name
     * filtering, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     */
    private NotificationConfigurationFilter filter;

    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     *
     * @return <p>
     *         An optional unique identifier for configurations in a
     *         notification configuration. If you don't provide one, Amazon S3
     *         will assign an ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     *
     * @param id <p>
     *            An optional unique identifier for configurations in a
     *            notification configuration. If you don't provide one, Amazon
     *            S3 will assign an ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An optional unique identifier for configurations in a notification
     * configuration. If you don't provide one, Amazon S3 will assign an ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            An optional unique identifier for configurations in a
     *            notification configuration. If you don't provide one, Amazon
     *            S3 will assign an ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
     * invokes when the specified event type occurs.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Lambda function that
     *         Amazon S3 invokes when the specified event type occurs.
     *         </p>
     */
    public String getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
     * invokes when the specified event type occurs.
     * </p>
     *
     * @param lambdaFunctionArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Lambda function that
     *            Amazon S3 invokes when the specified event type occurs.
     *            </p>
     */
    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
     * invokes when the specified event type occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Lambda function that
     *            Amazon S3 invokes when the specified event type occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionConfiguration withLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Supported Event Types</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket event for which to invoke the AWS Lambda
     *         function. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *         >Supported Event Types</a> in the <i>Amazon Simple Storage
     *         Service Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Supported Event Types</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param events <p>
     *            The Amazon S3 bucket event for which to invoke the AWS Lambda
     *            function. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Supported Event Types</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Supported Event Types</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The Amazon S3 bucket event for which to invoke the AWS Lambda
     *            function. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Supported Event Types</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionConfiguration withEvents(String... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<String>(events.length);
        }
        for (String value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Supported Event Types</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The Amazon S3 bucket event for which to invoke the AWS Lambda
     *            function. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Supported Event Types</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionConfiguration withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Specifies object key name filtering rules. For information about key name
     * filtering, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies object key name filtering rules. For information about
     *         key name filtering, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *         >Configuring Event Notifications</a> in the <i>Amazon Simple
     *         Storage Service Developer Guide</i>.
     *         </p>
     */
    public NotificationConfigurationFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * Specifies object key name filtering rules. For information about key name
     * filtering, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     *
     * @param filter <p>
     *            Specifies object key name filtering rules. For information
     *            about key name filtering, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Configuring Event Notifications</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide</i>.
     *            </p>
     */
    public void setFilter(NotificationConfigurationFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies object key name filtering rules. For information about key name
     * filtering, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Specifies object key name filtering rules. For information
     *            about key name filtering, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
     *            >Configuring Event Notifications</a> in the <i>Amazon Simple
     *            Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionConfiguration withFilter(NotificationConfigurationFilter filter) {
        this.filter = filter;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: " + getLambdaFunctionArn() + ",");
        if (getEvents() != null)
            sb.append("Events: " + getEvents() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionConfiguration == false)
            return false;
        LambdaFunctionConfiguration other = (LambdaFunctionConfiguration) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null
                && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}
