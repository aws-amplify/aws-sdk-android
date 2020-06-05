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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the event tracker. Does not delete the event-interactions dataset
 * from the associated dataset group. For more information on event trackers,
 * see <a>CreateEventTracker</a>.
 * </p>
 */
public class DeleteEventTrackerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String eventTrackerArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the event tracker to delete.
     *         </p>
     */
    public String getEventTrackerArn() {
        return eventTrackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param eventTrackerArn <p>
     *            The Amazon Resource Name (ARN) of the event tracker to delete.
     *            </p>
     */
    public void setEventTrackerArn(String eventTrackerArn) {
        this.eventTrackerArn = eventTrackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event tracker to delete.
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
     *            The Amazon Resource Name (ARN) of the event tracker to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteEventTrackerRequest withEventTrackerArn(String eventTrackerArn) {
        this.eventTrackerArn = eventTrackerArn;
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
            sb.append("eventTrackerArn: " + getEventTrackerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventTrackerArn() == null) ? 0 : getEventTrackerArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventTrackerRequest == false)
            return false;
        DeleteEventTrackerRequest other = (DeleteEventTrackerRequest) obj;

        if (other.getEventTrackerArn() == null ^ this.getEventTrackerArn() == null)
            return false;
        if (other.getEventTrackerArn() != null
                && other.getEventTrackerArn().equals(this.getEventTrackerArn()) == false)
            return false;
        return true;
    }
}
