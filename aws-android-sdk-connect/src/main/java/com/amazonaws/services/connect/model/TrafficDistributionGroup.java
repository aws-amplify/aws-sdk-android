/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a traffic distribution group.
 * </p>
 */
public class TrafficDistributionGroup implements Serializable {
    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9-]{1}:[0-
     * 9]{1,20}:instance
     * /[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     */
    private String instanceArn;

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * PENDING_DELETION, DELETION_FAILED, UPDATE_IN_PROGRESS
     */
    private String status;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Whether this is the default traffic distribution group created during
     * instance replication. The default traffic distribution group cannot be
     * deleted by the <code>DeleteTrafficDistributionGroup</code> API. The
     * default traffic distribution group is deleted as part of the process for
     * deleting a replica.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The identifier of the traffic distribution group. This can be the
     *         ID or the ARN if the API is being called in the Region where the
     *         traffic distribution group was created. The ARN must be provided
     *         if the call is from the replicated Region.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or
     * the ARN if the API is being called in the Region where the traffic
     * distribution group was created. The ARN must be provided if the call is
     * from the replicated Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param id <p>
     *            The identifier of the traffic distribution group. This can be
     *            the ID or the ARN if the API is being called in the Region
     *            where the traffic distribution group was created. The ARN must
     *            be provided if the call is from the replicated Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the traffic distribution group.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the traffic distribution
     *            group.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9]{1}:[0-
     * 9]{1,20}:traffic
     * -distribution-group/[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a
     * -f0-9]{4}-[a-f0-9]{12}$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the traffic distribution
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     *
     * @return <p>
     *         The name of the traffic distribution group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     *
     * @param name <p>
     *            The name of the traffic distribution group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     *
     * @param name <p>
     *            The name of the traffic distribution group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     *
     * @return <p>
     *         The description of the traffic distribution group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the traffic distribution group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     *
     * @param description <p>
     *            The description of the traffic distribution group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     * <b>Pattern: </b>(^[\S].*[\S]$)|(^[\S]$)<br/>
     *
     * @param description <p>
     *            The description of the traffic distribution group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9-]{1}:[0-
     * 9]{1,20}:instance
     * /[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN).
     *         </p>
     */
    public String getInstanceArn() {
        return instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9-]{1}:[0-
     * 9]{1,20}:instance
     * /[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     *
     * @param instanceArn <p>
     *            The Amazon Resource Name (ARN).
     *            </p>
     */
    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:(aws|aws-us-gov):connect:[a-z]{2}-[a-z]+-[0-9-]{1}:[0-
     * 9]{1,20}:instance
     * /[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}<br/>
     *
     * @param instanceArn <p>
     *            The Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
        return this;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * PENDING_DELETION, DELETION_FAILED, UPDATE_IN_PROGRESS
     *
     * @return <p>
     *         The status of the traffic distribution group.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *         >CreateTrafficDistributionGroup</a> operation is still in
     *         progress and has not yet completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> means the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *         >CreateTrafficDistributionGroup</a> operation has succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATION_FAILED</code> indicates that the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *         >CreateTrafficDistributionGroup</a> operation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_DELETION</code> means the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *         >DeleteTrafficDistributionGroup</a> operation is still in
     *         progress and has not yet completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETION_FAILED</code> means the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *         >DeleteTrafficDistributionGroup</a> operation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *         >UpdateTrafficDistributionGroup</a> operation is still in
     *         progress and has not yet completed.
     *         </p>
     *         </li>
     *         </ul>
     * @see TrafficDistributionGroupStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * PENDING_DELETION, DELETION_FAILED, UPDATE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the traffic distribution group.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATION_FAILED</code> indicates that the previous <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING_DELETION</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETION_FAILED</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *            >UpdateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            </ul>
     * @see TrafficDistributionGroupStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * PENDING_DELETION, DELETION_FAILED, UPDATE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the traffic distribution group.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATION_FAILED</code> indicates that the previous <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING_DELETION</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETION_FAILED</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *            >UpdateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDistributionGroupStatus
     */
    public TrafficDistributionGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * PENDING_DELETION, DELETION_FAILED, UPDATE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the traffic distribution group.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATION_FAILED</code> indicates that the previous <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING_DELETION</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETION_FAILED</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *            >UpdateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            </ul>
     * @see TrafficDistributionGroupStatus
     */
    public void setStatus(TrafficDistributionGroupStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and
     * has not yet completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * PENDING_DELETION, DELETION_FAILED, UPDATE_IN_PROGRESS
     *
     * @param status <p>
     *            The status of the traffic distribution group.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATION_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CREATION_FAILED</code> indicates that the previous <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *            >CreateTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING_DELETION</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETION_FAILED</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *            >DeleteTrafficDistributionGroup</a> operation has failed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE_IN_PROGRESS</code> means the previous <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *            >UpdateTrafficDistributionGroup</a> operation is still in
     *            progress and has not yet completed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficDistributionGroupStatus
     */
    public TrafficDistributionGroup withStatus(TrafficDistributionGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TrafficDistributionGroup clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Whether this is the default traffic distribution group created during
     * instance replication. The default traffic distribution group cannot be
     * deleted by the <code>DeleteTrafficDistributionGroup</code> API. The
     * default traffic distribution group is deleted as part of the process for
     * deleting a replica.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     *
     * @return <p>
     *         Whether this is the default traffic distribution group created
     *         during instance replication. The default traffic distribution
     *         group cannot be deleted by the
     *         <code>DeleteTrafficDistributionGroup</code> API. The default
     *         traffic distribution group is deleted as part of the process for
     *         deleting a replica.
     *         </p>
     *         <note>
     *         <p>
     *         You can change the <code>SignInConfig</code> only for a default
     *         <code>TrafficDistributionGroup</code>. If you call
     *         <code>UpdateTrafficDistribution</code> with a modified
     *         <code>SignInConfig</code> and a non-default
     *         <code>TrafficDistributionGroup</code>, an
     *         <code>InvalidRequestException</code> is returned.
     *         </p>
     *         </note>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Whether this is the default traffic distribution group created during
     * instance replication. The default traffic distribution group cannot be
     * deleted by the <code>DeleteTrafficDistributionGroup</code> API. The
     * default traffic distribution group is deleted as part of the process for
     * deleting a replica.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     *
     * @return <p>
     *         Whether this is the default traffic distribution group created
     *         during instance replication. The default traffic distribution
     *         group cannot be deleted by the
     *         <code>DeleteTrafficDistributionGroup</code> API. The default
     *         traffic distribution group is deleted as part of the process for
     *         deleting a replica.
     *         </p>
     *         <note>
     *         <p>
     *         You can change the <code>SignInConfig</code> only for a default
     *         <code>TrafficDistributionGroup</code>. If you call
     *         <code>UpdateTrafficDistribution</code> with a modified
     *         <code>SignInConfig</code> and a non-default
     *         <code>TrafficDistributionGroup</code>, an
     *         <code>InvalidRequestException</code> is returned.
     *         </p>
     *         </note>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Whether this is the default traffic distribution group created during
     * instance replication. The default traffic distribution group cannot be
     * deleted by the <code>DeleteTrafficDistributionGroup</code> API. The
     * default traffic distribution group is deleted as part of the process for
     * deleting a replica.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     *
     * @param isDefault <p>
     *            Whether this is the default traffic distribution group created
     *            during instance replication. The default traffic distribution
     *            group cannot be deleted by the
     *            <code>DeleteTrafficDistributionGroup</code> API. The default
     *            traffic distribution group is deleted as part of the process
     *            for deleting a replica.
     *            </p>
     *            <note>
     *            <p>
     *            You can change the <code>SignInConfig</code> only for a
     *            default <code>TrafficDistributionGroup</code>. If you call
     *            <code>UpdateTrafficDistribution</code> with a modified
     *            <code>SignInConfig</code> and a non-default
     *            <code>TrafficDistributionGroup</code>, an
     *            <code>InvalidRequestException</code> is returned.
     *            </p>
     *            </note>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Whether this is the default traffic distribution group created during
     * instance replication. The default traffic distribution group cannot be
     * deleted by the <code>DeleteTrafficDistributionGroup</code> API. The
     * default traffic distribution group is deleted as part of the process for
     * deleting a replica.
     * </p>
     * <note>
     * <p>
     * You can change the <code>SignInConfig</code> only for a default
     * <code>TrafficDistributionGroup</code>. If you call
     * <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default
     * <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Whether this is the default traffic distribution group created
     *            during instance replication. The default traffic distribution
     *            group cannot be deleted by the
     *            <code>DeleteTrafficDistributionGroup</code> API. The default
     *            traffic distribution group is deleted as part of the process
     *            for deleting a replica.
     *            </p>
     *            <note>
     *            <p>
     *            You can change the <code>SignInConfig</code> only for a
     *            default <code>TrafficDistributionGroup</code>. If you call
     *            <code>UpdateTrafficDistribution</code> with a modified
     *            <code>SignInConfig</code> and a non-default
     *            <code>TrafficDistributionGroup</code>, an
     *            <code>InvalidRequestException</code> is returned.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficDistributionGroup withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: " + getInstanceArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficDistributionGroup == false)
            return false;
        TrafficDistributionGroup other = (TrafficDistributionGroup) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null
                && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }
}
