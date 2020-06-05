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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class CreateEventTrackerResult implements Serializable {
    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String eventTrackerArn;

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     * >PutEvents</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String trackingId;

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the event tracker.
     *         </p>
     */
    public String getEventTrackerArn() {
        return eventTrackerArn;
    }

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param eventTrackerArn <p>
     *            The ARN of the event tracker.
     *            </p>
     */
    public void setEventTrackerArn(String eventTrackerArn) {
        this.eventTrackerArn = eventTrackerArn;
    }

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param eventTrackerArn <p>
     *            The ARN of the event tracker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEventTrackerResult withEventTrackerArn(String eventTrackerArn) {
        this.eventTrackerArn = eventTrackerArn;
        return this;
    }

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     * >PutEvents</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The ID of the event tracker. Include this ID in requests to the
     *         <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     *         >PutEvents</a> API.
     *         </p>
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     * >PutEvents</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param trackingId <p>
     *            The ID of the event tracker. Include this ID in requests to
     *            the <a href=
     *            "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     *            >PutEvents</a> API.
     *            </p>
     */
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     * >PutEvents</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param trackingId <p>
     *            The ID of the event tracker. Include this ID in requests to
     *            the <a href=
     *            "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     *            >PutEvents</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEventTrackerResult withTrackingId(String trackingId) {
        this.trackingId = trackingId;
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
        if (getEventTrackerArn() != null)
            sb.append("eventTrackerArn: " + getEventTrackerArn() + ",");
        if (getTrackingId() != null)
            sb.append("trackingId: " + getTrackingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventTrackerArn() == null) ? 0 : getEventTrackerArn().hashCode());
        hashCode = prime * hashCode + ((getTrackingId() == null) ? 0 : getTrackingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventTrackerResult == false)
            return false;
        CreateEventTrackerResult other = (CreateEventTrackerResult) obj;

        if (other.getEventTrackerArn() == null ^ this.getEventTrackerArn() == null)
            return false;
        if (other.getEventTrackerArn() != null
                && other.getEventTrackerArn().equals(this.getEventTrackerArn()) == false)
            return false;
        if (other.getTrackingId() == null ^ this.getTrackingId() == null)
            return false;
        if (other.getTrackingId() != null
                && other.getTrackingId().equals(this.getTrackingId()) == false)
            return false;
        return true;
    }
}
