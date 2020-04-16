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
 * The container for the <a>EventTriggerDefinition$EventResourceARN</a>.
 * </p>
 */
public class EventTriggerDefinition implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is
     * an AWS Lambda function's event trigger associated with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String eventResourceARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is
     * an AWS Lambda function's event trigger associated with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for any local Amazon S3 resource
     *         that is an AWS Lambda function's event trigger associated with
     *         this job.
     *         </p>
     */
    public String getEventResourceARN() {
        return eventResourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is
     * an AWS Lambda function's event trigger associated with this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param eventResourceARN <p>
     *            The Amazon Resource Name (ARN) for any local Amazon S3
     *            resource that is an AWS Lambda function's event trigger
     *            associated with this job.
     *            </p>
     */
    public void setEventResourceARN(String eventResourceARN) {
        this.eventResourceARN = eventResourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is
     * an AWS Lambda function's event trigger associated with this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param eventResourceARN <p>
     *            The Amazon Resource Name (ARN) for any local Amazon S3
     *            resource that is an AWS Lambda function's event trigger
     *            associated with this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTriggerDefinition withEventResourceARN(String eventResourceARN) {
        this.eventResourceARN = eventResourceARN;
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
        if (getEventResourceARN() != null)
            sb.append("EventResourceARN: " + getEventResourceARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventResourceARN() == null) ? 0 : getEventResourceARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTriggerDefinition == false)
            return false;
        EventTriggerDefinition other = (EventTriggerDefinition) obj;

        if (other.getEventResourceARN() == null ^ this.getEventResourceARN() == null)
            return false;
        if (other.getEventResourceARN() != null
                && other.getEventResourceARN().equals(this.getEventResourceARN()) == false)
            return false;
        return true;
    }
}
