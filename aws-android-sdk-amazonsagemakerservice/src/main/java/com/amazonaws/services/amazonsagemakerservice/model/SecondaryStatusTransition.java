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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * An array element of
 * <a>DescribeTrainingJobResponse$SecondaryStatusTransitions</a>. It provides
 * additional details about a status that the training job has transitioned
 * through. A training job can be in one of several states, for example,
 * starting, downloading, training, or uploading. Within each state, there are a
 * number of intermediate states. For example, within the starting state, Amazon
 * SageMaker could be starting the training job or launching the ML instances.
 * These transitional states are referred to as the job's secondary status.
 * </p>
 * <p/>
 */
public class SecondaryStatusTransition implements Serializable {
    /**
     * <p>
     * Contains a secondary status information from a training job.
     * </p>
     * <p>
     * Status might be one of the following secondary statuses:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     */
    private String status;

    /**
     * <p>
     * A timestamp that shows when the training job transitioned to the current
     * secondary status state.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A timestamp that shows when the training job transitioned out of this
     * secondary status state into another secondary status state or when the
     * training job has ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * A detailed description of the progress within a secondary status.
     * </p>
     * <p>
     * Amazon SageMaker provides secondary statuses and status messages that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>Starting</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launching requested ML instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Insufficient capacity error from EC2 while launching instances, retrying!
     * </p>
     * </li>
     * <li>
     * <p>
     * Launched instance was unhealthy, replacing it!
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing the instances for training.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Training</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Downloading the training image.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training image download completed. Training in progress.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Status messages are subject to change. Therefore, we recommend not
     * including them in code that programmatically initiates actions. For
     * examples, don't use status messages in if statements.
     * </p>
     * </important>
     * <p>
     * To have an overview of your training job's progress, view
     * <code>TrainingJobStatus</code> and <code>SecondaryStatus</code> in
     * <a>DescribeTrainingJob</a>, and <code>StatusMessage</code> together. For
     * example, at the start of a training job, you might see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TrainingJobStatus</code> - InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecondaryStatus</code> - Training
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StatusMessage</code> - Downloading the training image
     * </p>
     * </li>
     * </ul>
     */
    private String statusMessage;

    /**
     * <p>
     * Contains a secondary status information from a training job.
     * </p>
     * <p>
     * Status might be one of the following secondary statuses:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @return <p>
     *         Contains a secondary status information from a training job.
     *         </p>
     *         <p>
     *         Status might be one of the following secondary statuses:
     *         </p>
     *         <dl>
     *         <dt>InProgress</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Starting</code> - Starting the training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Downloading</code> - An optional stage for algorithms that
     *         support <code>File</code> training input mode. It indicates that
     *         data is being downloaded to the ML storage volumes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Training</code> - Training is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Uploading</code> - Training is complete and the model
     *         artifacts are being uploaded to the S3 location.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Completed</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The training job has completed.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The training job has failed. The reason for
     *         the failure is returned in the <code>FailureReason</code> field
     *         of <code>DescribeTrainingJobResponse</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Stopped</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MaxRuntimeExceeded</code> - The job stopped because it
     *         exceeded the maximum allowed runtime.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - The training job has stopped.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Stopping</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - Stopping the training job.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         </dl>
     *         <p>
     *         We no longer support the following secondary statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LaunchingMLInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PreparingTrainingStack</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DownloadingTrainingImage</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see SecondaryStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Contains a secondary status information from a training job.
     * </p>
     * <p>
     * Status might be one of the following secondary statuses:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param status <p>
     *            Contains a secondary status information from a training job.
     *            </p>
     *            <p>
     *            Status might be one of the following secondary statuses:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SecondaryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains a secondary status information from a training job.
     * </p>
     * <p>
     * Status might be one of the following secondary statuses:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param status <p>
     *            Contains a secondary status information from a training job.
     *            </p>
     *            <p>
     *            Status might be one of the following secondary statuses:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecondaryStatus
     */
    public SecondaryStatusTransition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Contains a secondary status information from a training job.
     * </p>
     * <p>
     * Status might be one of the following secondary statuses:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param status <p>
     *            Contains a secondary status information from a training job.
     *            </p>
     *            <p>
     *            Status might be one of the following secondary statuses:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see SecondaryStatus
     */
    public void setStatus(SecondaryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Contains a secondary status information from a training job.
     * </p>
     * <p>
     * Status might be one of the following secondary statuses:
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Starting</code> - Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Downloading</code> - An optional stage for algorithms that support
     * <code>File</code> training input mode. It indicates that data is being
     * downloaded to the ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Training</code> - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Uploading</code> - Training is complete and the model artifacts are
     * being uploaded to the S3 location.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Completed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Completed</code> - The training job has completed.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The training job has failed. The reason for the
     * failure is returned in the <code>FailureReason</code> field of
     * <code>DescribeTrainingJobResponse</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopped</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>MaxRuntimeExceeded</code> - The job stopped because it exceeded the
     * maximum allowed runtime.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - The training job has stopped.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Stopping</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * <code>Stopping</code> - Stopping the training job.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * We no longer support the following secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LaunchingMLInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreparingTrainingStack</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DownloadingTrainingImage</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, LaunchingMLInstances,
     * PreparingTrainingStack, Downloading, DownloadingTrainingImage, Training,
     * Uploading, Stopping, Stopped, MaxRuntimeExceeded, Completed, Failed,
     * Interrupted, MaxWaitTimeExceeded
     *
     * @param status <p>
     *            Contains a secondary status information from a training job.
     *            </p>
     *            <p>
     *            Status might be one of the following secondary statuses:
     *            </p>
     *            <dl>
     *            <dt>InProgress</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Starting</code> - Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Downloading</code> - An optional stage for algorithms
     *            that support <code>File</code> training input mode. It
     *            indicates that data is being downloaded to the ML storage
     *            volumes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Training</code> - Training is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Uploading</code> - Training is complete and the model
     *            artifacts are being uploaded to the S3 location.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Completed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Completed</code> - The training job has completed.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Failed</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The training job has failed. The reason
     *            for the failure is returned in the <code>FailureReason</code>
     *            field of <code>DescribeTrainingJobResponse</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopped</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>MaxRuntimeExceeded</code> - The job stopped because it
     *            exceeded the maximum allowed runtime.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - The training job has stopped.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Stopping</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - Stopping the training job.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <p>
     *            We no longer support the following secondary statuses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LaunchingMLInstances</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PreparingTrainingStack</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DownloadingTrainingImage</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecondaryStatus
     */
    public SecondaryStatusTransition withStatus(SecondaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the training job transitioned to the current
     * secondary status state.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the training job transitioned to the
     *         current secondary status state.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job transitioned to the current
     * secondary status state.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that shows when the training job transitioned to
     *            the current secondary status state.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job transitioned to the current
     * secondary status state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that shows when the training job transitioned to
     *            the current secondary status state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecondaryStatusTransition withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the training job transitioned out of this
     * secondary status state into another secondary status state or when the
     * training job has ended.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the training job transitioned out of
     *         this secondary status state into another secondary status state
     *         or when the training job has ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job transitioned out of this
     * secondary status state into another secondary status state or when the
     * training job has ended.
     * </p>
     *
     * @param endTime <p>
     *            A timestamp that shows when the training job transitioned out
     *            of this secondary status state into another secondary status
     *            state or when the training job has ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job transitioned out of this
     * secondary status state into another secondary status state or when the
     * training job has ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A timestamp that shows when the training job transitioned out
     *            of this secondary status state into another secondary status
     *            state or when the training job has ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecondaryStatusTransition withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * A detailed description of the progress within a secondary status.
     * </p>
     * <p>
     * Amazon SageMaker provides secondary statuses and status messages that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>Starting</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launching requested ML instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Insufficient capacity error from EC2 while launching instances, retrying!
     * </p>
     * </li>
     * <li>
     * <p>
     * Launched instance was unhealthy, replacing it!
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing the instances for training.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Training</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Downloading the training image.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training image download completed. Training in progress.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Status messages are subject to change. Therefore, we recommend not
     * including them in code that programmatically initiates actions. For
     * examples, don't use status messages in if statements.
     * </p>
     * </important>
     * <p>
     * To have an overview of your training job's progress, view
     * <code>TrainingJobStatus</code> and <code>SecondaryStatus</code> in
     * <a>DescribeTrainingJob</a>, and <code>StatusMessage</code> together. For
     * example, at the start of a training job, you might see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TrainingJobStatus</code> - InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecondaryStatus</code> - Training
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StatusMessage</code> - Downloading the training image
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A detailed description of the progress within a secondary status.
     *         </p>
     *         <p>
     *         Amazon SageMaker provides secondary statuses and status messages
     *         that apply to each of them:
     *         </p>
     *         <dl>
     *         <dt>Starting</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         Starting the training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Launching requested ML instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Insufficient capacity error from EC2 while launching instances,
     *         retrying!
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Launched instance was unhealthy, replacing it!
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Preparing the instances for training.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Training</dt>
     *         <dd>
     *         <ul>
     *         <li>
     *         <p>
     *         Downloading the training image.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Training image download completed. Training in progress.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         </dl>
     *         <important>
     *         <p>
     *         Status messages are subject to change. Therefore, we recommend
     *         not including them in code that programmatically initiates
     *         actions. For examples, don't use status messages in if
     *         statements.
     *         </p>
     *         </important>
     *         <p>
     *         To have an overview of your training job's progress, view
     *         <code>TrainingJobStatus</code> and <code>SecondaryStatus</code>
     *         in <a>DescribeTrainingJob</a>, and <code>StatusMessage</code>
     *         together. For example, at the start of a training job, you might
     *         see the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TrainingJobStatus</code> - InProgress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SecondaryStatus</code> - Training
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StatusMessage</code> - Downloading the training image
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A detailed description of the progress within a secondary status.
     * </p>
     * <p>
     * Amazon SageMaker provides secondary statuses and status messages that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>Starting</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launching requested ML instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Insufficient capacity error from EC2 while launching instances, retrying!
     * </p>
     * </li>
     * <li>
     * <p>
     * Launched instance was unhealthy, replacing it!
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing the instances for training.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Training</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Downloading the training image.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training image download completed. Training in progress.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Status messages are subject to change. Therefore, we recommend not
     * including them in code that programmatically initiates actions. For
     * examples, don't use status messages in if statements.
     * </p>
     * </important>
     * <p>
     * To have an overview of your training job's progress, view
     * <code>TrainingJobStatus</code> and <code>SecondaryStatus</code> in
     * <a>DescribeTrainingJob</a>, and <code>StatusMessage</code> together. For
     * example, at the start of a training job, you might see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TrainingJobStatus</code> - InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecondaryStatus</code> - Training
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StatusMessage</code> - Downloading the training image
     * </p>
     * </li>
     * </ul>
     *
     * @param statusMessage <p>
     *            A detailed description of the progress within a secondary
     *            status.
     *            </p>
     *            <p>
     *            Amazon SageMaker provides secondary statuses and status
     *            messages that apply to each of them:
     *            </p>
     *            <dl>
     *            <dt>Starting</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Launching requested ML instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Insufficient capacity error from EC2 while launching
     *            instances, retrying!
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Launched instance was unhealthy, replacing it!
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Preparing the instances for training.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Training</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            Downloading the training image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Training image download completed. Training in progress.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <important>
     *            <p>
     *            Status messages are subject to change. Therefore, we recommend
     *            not including them in code that programmatically initiates
     *            actions. For examples, don't use status messages in if
     *            statements.
     *            </p>
     *            </important>
     *            <p>
     *            To have an overview of your training job's progress, view
     *            <code>TrainingJobStatus</code> and
     *            <code>SecondaryStatus</code> in <a>DescribeTrainingJob</a>,
     *            and <code>StatusMessage</code> together. For example, at the
     *            start of a training job, you might see the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TrainingJobStatus</code> - InProgress
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SecondaryStatus</code> - Training
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StatusMessage</code> - Downloading the training image
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the progress within a secondary status.
     * </p>
     * <p>
     * Amazon SageMaker provides secondary statuses and status messages that
     * apply to each of them:
     * </p>
     * <dl>
     * <dt>Starting</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Starting the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launching requested ML instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Insufficient capacity error from EC2 while launching instances, retrying!
     * </p>
     * </li>
     * <li>
     * <p>
     * Launched instance was unhealthy, replacing it!
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing the instances for training.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Training</dt>
     * <dd>
     * <ul>
     * <li>
     * <p>
     * Downloading the training image.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training image download completed. Training in progress.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <important>
     * <p>
     * Status messages are subject to change. Therefore, we recommend not
     * including them in code that programmatically initiates actions. For
     * examples, don't use status messages in if statements.
     * </p>
     * </important>
     * <p>
     * To have an overview of your training job's progress, view
     * <code>TrainingJobStatus</code> and <code>SecondaryStatus</code> in
     * <a>DescribeTrainingJob</a>, and <code>StatusMessage</code> together. For
     * example, at the start of a training job, you might see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TrainingJobStatus</code> - InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SecondaryStatus</code> - Training
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StatusMessage</code> - Downloading the training image
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A detailed description of the progress within a secondary
     *            status.
     *            </p>
     *            <p>
     *            Amazon SageMaker provides secondary statuses and status
     *            messages that apply to each of them:
     *            </p>
     *            <dl>
     *            <dt>Starting</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            Starting the training job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Launching requested ML instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Insufficient capacity error from EC2 while launching
     *            instances, retrying!
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Launched instance was unhealthy, replacing it!
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Preparing the instances for training.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            <dt>Training</dt>
     *            <dd>
     *            <ul>
     *            <li>
     *            <p>
     *            Downloading the training image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Training image download completed. Training in progress.
     *            </p>
     *            </li>
     *            </ul>
     *            </dd>
     *            </dl>
     *            <important>
     *            <p>
     *            Status messages are subject to change. Therefore, we recommend
     *            not including them in code that programmatically initiates
     *            actions. For examples, don't use status messages in if
     *            statements.
     *            </p>
     *            </important>
     *            <p>
     *            To have an overview of your training job's progress, view
     *            <code>TrainingJobStatus</code> and
     *            <code>SecondaryStatus</code> in <a>DescribeTrainingJob</a>,
     *            and <code>StatusMessage</code> together. For example, at the
     *            start of a training job, you might see the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TrainingJobStatus</code> - InProgress
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SecondaryStatus</code> - Training
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StatusMessage</code> - Downloading the training image
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecondaryStatusTransition withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecondaryStatusTransition == false)
            return false;
        SecondaryStatusTransition other = (SecondaryStatusTransition) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }
}
