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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of tasks for a specified cluster. You can filter the results
 * by family name, by a particular container instance, or by the desired status
 * of the task with the <code>family</code>, <code>containerInstance</code>, and
 * <code>desiredStatus</code> parameters.
 * </p>
 * <p>
 * Recently stopped tasks might appear in the returned results. Currently,
 * stopped tasks appear in the returned results for at least one hour.
 * </p>
 */
public class ListTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with
     * which to filter the <code>ListTasks</code> results. Specifying a
     * <code>containerInstance</code> limits the results to tasks that belong to
     * that container instance.
     * </p>
     */
    private String containerInstance;

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>family</code> limits the results to tasks
     * that belong to that family.
     * </p>
     */
    private String family;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a <code>ListTasks</code>
     * request indicating that more results are available to fulfill the request
     * and further calls will be needed. If <code>maxResults</code> was
     * provided, it is possible the number of results to be fewer than
     * <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in
     * paginated output. When this parameter is used, <code>ListTasks</code>
     * only returns <code>maxResults</code> results in a single page along with
     * a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListTasks</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If this parameter is not used, then
     * <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results.
     * Specifying a <code>startedBy</code> value limits the results to tasks
     * that were started with that value.
     * </p>
     */
    private String startedBy;

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>serviceName</code> limits the results to
     * tasks that belong to that service.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>desiredStatus</code> of <code>STOPPED</code>
     * limits the results to tasks that Amazon ECS has set the desired status to
     * <code>STOPPED</code>. This can be useful for debugging tasks that are not
     * starting properly or have died or finished. The default status filter is
     * <code>RUNNING</code>, which shows tasks that Amazon ECS has set the
     * desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of
     * <code>PENDING</code>, this does not return any results. Amazon ECS never
     * sets the desired status of a task to that value (only a task's
     * <code>lastStatus</code> may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PENDING, STOPPED
     */
    private String desiredStatus;

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     */
    private String launchType;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the tasks to list. If you do not specify a cluster,
     *         the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the tasks to list. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks to list. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the tasks to list. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with
     * which to filter the <code>ListTasks</code> results. Specifying a
     * <code>containerInstance</code> limits the results to tasks that belong to
     * that container instance.
     * </p>
     *
     * @return <p>
     *         The container instance ID or full ARN of the container instance
     *         with which to filter the <code>ListTasks</code> results.
     *         Specifying a <code>containerInstance</code> limits the results to
     *         tasks that belong to that container instance.
     *         </p>
     */
    public String getContainerInstance() {
        return containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with
     * which to filter the <code>ListTasks</code> results. Specifying a
     * <code>containerInstance</code> limits the results to tasks that belong to
     * that container instance.
     * </p>
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN of the container
     *            instance with which to filter the <code>ListTasks</code>
     *            results. Specifying a <code>containerInstance</code> limits
     *            the results to tasks that belong to that container instance.
     *            </p>
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }

    /**
     * <p>
     * The container instance ID or full ARN of the container instance with
     * which to filter the <code>ListTasks</code> results. Specifying a
     * <code>containerInstance</code> limits the results to tasks that belong to
     * that container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstance <p>
     *            The container instance ID or full ARN of the container
     *            instance with which to filter the <code>ListTasks</code>
     *            results. Specifying a <code>containerInstance</code> limits
     *            the results to tasks that belong to that container instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
    }

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>family</code> limits the results to tasks
     * that belong to that family.
     * </p>
     *
     * @return <p>
     *         The name of the family with which to filter the
     *         <code>ListTasks</code> results. Specifying a <code>family</code>
     *         limits the results to tasks that belong to that family.
     *         </p>
     */
    public String getFamily() {
        return family;
    }

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>family</code> limits the results to tasks
     * that belong to that family.
     * </p>
     *
     * @param family <p>
     *            The name of the family with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>family</code> limits the results to tasks that belong to
     *            that family.
     *            </p>
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of the family with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>family</code> limits the results to tasks
     * that belong to that family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param family <p>
     *            The name of the family with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>family</code> limits the results to tasks that belong to
     *            that family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a <code>ListTasks</code>
     * request indicating that more results are available to fulfill the request
     * and further calls will be needed. If <code>maxResults</code> was
     * provided, it is possible the number of results to be fewer than
     * <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a
     *         <code>ListTasks</code> request indicating that more results are
     *         available to fulfill the request and further calls will be
     *         needed. If <code>maxResults</code> was provided, it is possible
     *         the number of results to be fewer than <code>maxResults</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a <code>ListTasks</code>
     * request indicating that more results are available to fulfill the request
     * and further calls will be needed. If <code>maxResults</code> was
     * provided, it is possible the number of results to be fewer than
     * <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListTasks</code> request indicating that more results
     *            are available to fulfill the request and further calls will be
     *            needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a <code>ListTasks</code>
     * request indicating that more results are available to fulfill the request
     * and further calls will be needed. If <code>maxResults</code> was
     * provided, it is possible the number of results to be fewer than
     * <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListTasks</code> request indicating that more results
     *            are available to fulfill the request and further calls will be
     *            needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in
     * paginated output. When this parameter is used, <code>ListTasks</code>
     * only returns <code>maxResults</code> results in a single page along with
     * a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListTasks</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If this parameter is not used, then
     * <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of task results returned by
     *         <code>ListTasks</code> in paginated output. When this parameter
     *         is used, <code>ListTasks</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>ListTasks</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then <code>ListTasks</code>
     *         returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in
     * paginated output. When this parameter is used, <code>ListTasks</code>
     * only returns <code>maxResults</code> results in a single page along with
     * a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListTasks</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If this parameter is not used, then
     * <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of task results returned by
     *            <code>ListTasks</code> in paginated output. When this
     *            parameter is used, <code>ListTasks</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListTasks</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListTasks</code> returns up to 100 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of task results returned by <code>ListTasks</code> in
     * paginated output. When this parameter is used, <code>ListTasks</code>
     * only returns <code>maxResults</code> results in a single page along with
     * a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListTasks</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If this parameter is not used, then
     * <code>ListTasks</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of task results returned by
     *            <code>ListTasks</code> in paginated output. When this
     *            parameter is used, <code>ListTasks</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListTasks</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListTasks</code> returns up to 100 results and a
     *            <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results.
     * Specifying a <code>startedBy</code> value limits the results to tasks
     * that were started with that value.
     * </p>
     *
     * @return <p>
     *         The <code>startedBy</code> value with which to filter the task
     *         results. Specifying a <code>startedBy</code> value limits the
     *         results to tasks that were started with that value.
     *         </p>
     */
    public String getStartedBy() {
        return startedBy;
    }

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results.
     * Specifying a <code>startedBy</code> value limits the results to tasks
     * that were started with that value.
     * </p>
     *
     * @param startedBy <p>
     *            The <code>startedBy</code> value with which to filter the task
     *            results. Specifying a <code>startedBy</code> value limits the
     *            results to tasks that were started with that value.
     *            </p>
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The <code>startedBy</code> value with which to filter the task results.
     * Specifying a <code>startedBy</code> value limits the results to tasks
     * that were started with that value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedBy <p>
     *            The <code>startedBy</code> value with which to filter the task
     *            results. Specifying a <code>startedBy</code> value limits the
     *            results to tasks that were started with that value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>serviceName</code> limits the results to
     * tasks that belong to that service.
     * </p>
     *
     * @return <p>
     *         The name of the service with which to filter the
     *         <code>ListTasks</code> results. Specifying a
     *         <code>serviceName</code> limits the results to tasks that belong
     *         to that service.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>serviceName</code> limits the results to
     * tasks that belong to that service.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the service with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>serviceName</code> limits the results to tasks that
     *            belong to that service.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>serviceName</code> limits the results to
     * tasks that belong to that service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the service with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>serviceName</code> limits the results to tasks that
     *            belong to that service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTasksRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>desiredStatus</code> of <code>STOPPED</code>
     * limits the results to tasks that Amazon ECS has set the desired status to
     * <code>STOPPED</code>. This can be useful for debugging tasks that are not
     * starting properly or have died or finished. The default status filter is
     * <code>RUNNING</code>, which shows tasks that Amazon ECS has set the
     * desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of
     * <code>PENDING</code>, this does not return any results. Amazon ECS never
     * sets the desired status of a task to that value (only a task's
     * <code>lastStatus</code> may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PENDING, STOPPED
     *
     * @return <p>
     *         The task desired status with which to filter the
     *         <code>ListTasks</code> results. Specifying a
     *         <code>desiredStatus</code> of <code>STOPPED</code> limits the
     *         results to tasks that Amazon ECS has set the desired status to
     *         <code>STOPPED</code>. This can be useful for debugging tasks that
     *         are not starting properly or have died or finished. The default
     *         status filter is <code>RUNNING</code>, which shows tasks that
     *         Amazon ECS has set the desired status to <code>RUNNING</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Although you can filter results based on a desired status of
     *         <code>PENDING</code>, this does not return any results. Amazon
     *         ECS never sets the desired status of a task to that value (only a
     *         task's <code>lastStatus</code> may have a value of
     *         <code>PENDING</code>).
     *         </p>
     *         </note>
     * @see DesiredStatus
     */
    public String getDesiredStatus() {
        return desiredStatus;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>desiredStatus</code> of <code>STOPPED</code>
     * limits the results to tasks that Amazon ECS has set the desired status to
     * <code>STOPPED</code>. This can be useful for debugging tasks that are not
     * starting properly or have died or finished. The default status filter is
     * <code>RUNNING</code>, which shows tasks that Amazon ECS has set the
     * desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of
     * <code>PENDING</code>, this does not return any results. Amazon ECS never
     * sets the desired status of a task to that value (only a task's
     * <code>lastStatus</code> may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PENDING, STOPPED
     *
     * @param desiredStatus <p>
     *            The task desired status with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>desiredStatus</code> of <code>STOPPED</code> limits the
     *            results to tasks that Amazon ECS has set the desired status to
     *            <code>STOPPED</code>. This can be useful for debugging tasks
     *            that are not starting properly or have died or finished. The
     *            default status filter is <code>RUNNING</code>, which shows
     *            tasks that Amazon ECS has set the desired status to
     *            <code>RUNNING</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Although you can filter results based on a desired status of
     *            <code>PENDING</code>, this does not return any results. Amazon
     *            ECS never sets the desired status of a task to that value
     *            (only a task's <code>lastStatus</code> may have a value of
     *            <code>PENDING</code>).
     *            </p>
     *            </note>
     * @see DesiredStatus
     */
    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>desiredStatus</code> of <code>STOPPED</code>
     * limits the results to tasks that Amazon ECS has set the desired status to
     * <code>STOPPED</code>. This can be useful for debugging tasks that are not
     * starting properly or have died or finished. The default status filter is
     * <code>RUNNING</code>, which shows tasks that Amazon ECS has set the
     * desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of
     * <code>PENDING</code>, this does not return any results. Amazon ECS never
     * sets the desired status of a task to that value (only a task's
     * <code>lastStatus</code> may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PENDING, STOPPED
     *
     * @param desiredStatus <p>
     *            The task desired status with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>desiredStatus</code> of <code>STOPPED</code> limits the
     *            results to tasks that Amazon ECS has set the desired status to
     *            <code>STOPPED</code>. This can be useful for debugging tasks
     *            that are not starting properly or have died or finished. The
     *            default status filter is <code>RUNNING</code>, which shows
     *            tasks that Amazon ECS has set the desired status to
     *            <code>RUNNING</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Although you can filter results based on a desired status of
     *            <code>PENDING</code>, this does not return any results. Amazon
     *            ECS never sets the desired status of a task to that value
     *            (only a task's <code>lastStatus</code> may have a value of
     *            <code>PENDING</code>).
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DesiredStatus
     */
    public ListTasksRequest withDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
        return this;
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>desiredStatus</code> of <code>STOPPED</code>
     * limits the results to tasks that Amazon ECS has set the desired status to
     * <code>STOPPED</code>. This can be useful for debugging tasks that are not
     * starting properly or have died or finished. The default status filter is
     * <code>RUNNING</code>, which shows tasks that Amazon ECS has set the
     * desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of
     * <code>PENDING</code>, this does not return any results. Amazon ECS never
     * sets the desired status of a task to that value (only a task's
     * <code>lastStatus</code> may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PENDING, STOPPED
     *
     * @param desiredStatus <p>
     *            The task desired status with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>desiredStatus</code> of <code>STOPPED</code> limits the
     *            results to tasks that Amazon ECS has set the desired status to
     *            <code>STOPPED</code>. This can be useful for debugging tasks
     *            that are not starting properly or have died or finished. The
     *            default status filter is <code>RUNNING</code>, which shows
     *            tasks that Amazon ECS has set the desired status to
     *            <code>RUNNING</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Although you can filter results based on a desired status of
     *            <code>PENDING</code>, this does not return any results. Amazon
     *            ECS never sets the desired status of a task to that value
     *            (only a task's <code>lastStatus</code> may have a value of
     *            <code>PENDING</code>).
     *            </p>
     *            </note>
     * @see DesiredStatus
     */
    public void setDesiredStatus(DesiredStatus desiredStatus) {
        this.desiredStatus = desiredStatus.toString();
    }

    /**
     * <p>
     * The task desired status with which to filter the <code>ListTasks</code>
     * results. Specifying a <code>desiredStatus</code> of <code>STOPPED</code>
     * limits the results to tasks that Amazon ECS has set the desired status to
     * <code>STOPPED</code>. This can be useful for debugging tasks that are not
     * starting properly or have died or finished. The default status filter is
     * <code>RUNNING</code>, which shows tasks that Amazon ECS has set the
     * desired status to <code>RUNNING</code>.
     * </p>
     * <note>
     * <p>
     * Although you can filter results based on a desired status of
     * <code>PENDING</code>, this does not return any results. Amazon ECS never
     * sets the desired status of a task to that value (only a task's
     * <code>lastStatus</code> may have a value of <code>PENDING</code>).
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PENDING, STOPPED
     *
     * @param desiredStatus <p>
     *            The task desired status with which to filter the
     *            <code>ListTasks</code> results. Specifying a
     *            <code>desiredStatus</code> of <code>STOPPED</code> limits the
     *            results to tasks that Amazon ECS has set the desired status to
     *            <code>STOPPED</code>. This can be useful for debugging tasks
     *            that are not starting properly or have died or finished. The
     *            default status filter is <code>RUNNING</code>, which shows
     *            tasks that Amazon ECS has set the desired status to
     *            <code>RUNNING</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Although you can filter results based on a desired status of
     *            <code>PENDING</code>, this does not return any results. Amazon
     *            ECS never sets the desired status of a task to that value
     *            (only a task's <code>lastStatus</code> may have a value of
     *            <code>PENDING</code>).
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DesiredStatus
     */
    public ListTasksRequest withDesiredStatus(DesiredStatus desiredStatus) {
        this.desiredStatus = desiredStatus.toString();
        return this;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type for services to list.
     *         </p>
     * @see LaunchType
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for services to list.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for services to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public ListTasksRequest withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for services to list.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
    }

    /**
     * <p>
     * The launch type for services to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type for services to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public ListTasksRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getContainerInstance() != null)
            sb.append("containerInstance: " + getContainerInstance() + ",");
        if (getFamily() != null)
            sb.append("family: " + getFamily() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getStartedBy() != null)
            sb.append("startedBy: " + getStartedBy() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName() + ",");
        if (getDesiredStatus() != null)
            sb.append("desiredStatus: " + getDesiredStatus() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode
                + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredStatus() == null) ? 0 : getDesiredStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTasksRequest == false)
            return false;
        ListTasksRequest other = (ListTasksRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null)
            return false;
        if (other.getContainerInstance() != null
                && other.getContainerInstance().equals(this.getContainerInstance()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null
                && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getDesiredStatus() == null ^ this.getDesiredStatus() == null)
            return false;
        if (other.getDesiredStatus() != null
                && other.getDesiredStatus().equals(this.getDesiredStatus()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        return true;
    }
}
