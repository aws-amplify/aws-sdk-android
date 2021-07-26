/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an association between a geofence collection and a tracker resource.
 * This allows the tracker resource to communicate location data to the linked
 * geofence collection.
 * </p>
 * <p>
 * You can associate up to five geofence collections to each tracker resource.
 * </p>
 * <note>
 * <p>
 * Currently not supported — Cross-account configurations, such as creating
 * associations between a tracker resource in one account and a geofence
 * collection in another account.
 * </p>
 * </note>
 */
public class AssociateTrackerConsumerRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     */
    private String consumerArn;

    /**
     * <p>
     * The name of the tracker resource to be associated with a geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String trackerName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the geofence collection to be
     *         associated to tracker resource. Used when you need to specify a
     *         resource across all AWS.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getConsumerArn() {
        return consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @param consumerArn <p>
     *            The Amazon Resource Name (ARN) for the geofence collection to
     *            be associated to tracker resource. Used when you need to
     *            specify a resource across all AWS.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setConsumerArn(String consumerArn) {
        this.consumerArn = consumerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection to be
     * associated to tracker resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @param consumerArn <p>
     *            The Amazon Resource Name (ARN) for the geofence collection to
     *            be associated to tracker resource. Used when you need to
     *            specify a resource across all AWS.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTrackerConsumerRequest withConsumerArn(String consumerArn) {
        this.consumerArn = consumerArn;
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource to be associated with a geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the tracker resource to be associated with a geofence
     *         collection.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to be associated with a geofence
     * collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to be associated with a
     *            geofence collection.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to be associated with a geofence
     * collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to be associated with a
     *            geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTrackerConsumerRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
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
        if (getConsumerArn() != null)
            sb.append("ConsumerArn: " + getConsumerArn() + ",");
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConsumerArn() == null) ? 0 : getConsumerArn().hashCode());
        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTrackerConsumerRequest == false)
            return false;
        AssociateTrackerConsumerRequest other = (AssociateTrackerConsumerRequest) obj;

        if (other.getConsumerArn() == null ^ this.getConsumerArn() == null)
            return false;
        if (other.getConsumerArn() != null
                && other.getConsumerArn().equals(this.getConsumerArn()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }
}
