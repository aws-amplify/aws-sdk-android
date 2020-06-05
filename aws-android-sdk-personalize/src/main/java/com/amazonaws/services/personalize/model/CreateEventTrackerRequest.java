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
 * Creates an event tracker that you use when sending event data to the
 * specified dataset group using the <a href=
 * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
 * >PutEvents</a> API.
 * </p>
 * <p>
 * When Amazon Personalize creates an event tracker, it also creates an
 * <i>event-interactions</i> dataset in the dataset group associated with the
 * event tracker. The event-interactions dataset stores the event data from the
 * <code>PutEvents</code> call. The contents of this dataset are not available
 * to the user.
 * </p>
 * <note>
 * <p>
 * Only one event tracker can be associated with a dataset group. You will get
 * an error if you call <code>CreateEventTracker</code> using the same dataset
 * group as an existing event tracker.
 * </p>
 * </note>
 * <p>
 * When you send event data you include your tracking ID. The tracking ID
 * identifies the customer and authorizes the customer to send the data.
 * </p>
 * <p>
 * The event tracker can be in one of the following states:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * </p>
 * </li>
 * <li>
 * <p>
 * DELETE PENDING &gt; DELETE IN_PROGRESS
 * </p>
 * </li>
 * </ul>
 * <p>
 * To get the status of the event tracker, call <a>DescribeEventTracker</a>.
 * </p>
 * <note>
 * <p>
 * The event tracker must be in the ACTIVE state before using the tracking ID.
 * </p>
 * </note>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListEventTrackers</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventTracker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteEventTracker</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateEventTrackerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the event tracker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that receives the
     * event data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetGroupArn;

    /**
     * <p>
     * The name for the event tracker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name for the event tracker.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the event tracker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name for the event tracker.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the event tracker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name for the event tracker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEventTrackerRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that receives the
     * event data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset group that receives
     *         the event data.
     *         </p>
     */
    public String getDatasetGroupArn() {
        return datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that receives the
     * event data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group that
     *            receives the event data.
     *            </p>
     */
    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that receives the
     * event data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group that
     *            receives the event data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEventTrackerRequest withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDatasetGroupArn() != null)
            sb.append("datasetGroupArn: " + getDatasetGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventTrackerRequest == false)
            return false;
        CreateEventTrackerRequest other = (CreateEventTrackerRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null
                && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        return true;
    }
}
