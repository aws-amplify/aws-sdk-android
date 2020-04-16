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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

/**
 * <p>
 * Identifies
 * </p>
 */
public class LambdaResource implements Serializable {
    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to
     * be triggered by PUT object actions on the associated local Amazon S3
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String lambdaArn;

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the
     * <a>LambdaResource</a> objects associated with this job.
     * </p>
     */
    private java.util.List<EventTriggerDefinition> eventTriggers;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to
     * be triggered by PUT object actions on the associated local Amazon S3
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that represents an AWS Lambda
     *         function to be triggered by PUT object actions on the associated
     *         local Amazon S3 resource.
     *         </p>
     */
    public String getLambdaArn() {
        return lambdaArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to
     * be triggered by PUT object actions on the associated local Amazon S3
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param lambdaArn <p>
     *            An Amazon Resource Name (ARN) that represents an AWS Lambda
     *            function to be triggered by PUT object actions on the
     *            associated local Amazon S3 resource.
     *            </p>
     */
    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to
     * be triggered by PUT object actions on the associated local Amazon S3
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param lambdaArn <p>
     *            An Amazon Resource Name (ARN) that represents an AWS Lambda
     *            function to be triggered by PUT object actions on the
     *            associated local Amazon S3 resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaResource withLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
        return this;
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the
     * <a>LambdaResource</a> objects associated with this job.
     * </p>
     *
     * @return <p>
     *         The array of ARNs for <a>S3Resource</a> objects to trigger the
     *         <a>LambdaResource</a> objects associated with this job.
     *         </p>
     */
    public java.util.List<EventTriggerDefinition> getEventTriggers() {
        return eventTriggers;
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the
     * <a>LambdaResource</a> objects associated with this job.
     * </p>
     *
     * @param eventTriggers <p>
     *            The array of ARNs for <a>S3Resource</a> objects to trigger the
     *            <a>LambdaResource</a> objects associated with this job.
     *            </p>
     */
    public void setEventTriggers(java.util.Collection<EventTriggerDefinition> eventTriggers) {
        if (eventTriggers == null) {
            this.eventTriggers = null;
            return;
        }

        this.eventTriggers = new java.util.ArrayList<EventTriggerDefinition>(eventTriggers);
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the
     * <a>LambdaResource</a> objects associated with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTriggers <p>
     *            The array of ARNs for <a>S3Resource</a> objects to trigger the
     *            <a>LambdaResource</a> objects associated with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaResource withEventTriggers(EventTriggerDefinition... eventTriggers) {
        if (getEventTriggers() == null) {
            this.eventTriggers = new java.util.ArrayList<EventTriggerDefinition>(
                    eventTriggers.length);
        }
        for (EventTriggerDefinition value : eventTriggers) {
            this.eventTriggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the
     * <a>LambdaResource</a> objects associated with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTriggers <p>
     *            The array of ARNs for <a>S3Resource</a> objects to trigger the
     *            <a>LambdaResource</a> objects associated with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaResource withEventTriggers(
            java.util.Collection<EventTriggerDefinition> eventTriggers) {
        setEventTriggers(eventTriggers);
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
        if (getLambdaArn() != null)
            sb.append("LambdaArn: " + getLambdaArn() + ",");
        if (getEventTriggers() != null)
            sb.append("EventTriggers: " + getEventTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        hashCode = prime * hashCode
                + ((getEventTriggers() == null) ? 0 : getEventTriggers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaResource == false)
            return false;
        LambdaResource other = (LambdaResource) obj;

        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null
                && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        if (other.getEventTriggers() == null ^ this.getEventTriggers() == null)
            return false;
        if (other.getEventTriggers() != null
                && other.getEventTriggers().equals(this.getEventTriggers()) == false)
            return false;
        return true;
    }
}
