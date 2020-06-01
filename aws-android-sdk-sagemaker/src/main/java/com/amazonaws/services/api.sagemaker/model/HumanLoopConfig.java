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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the work to be performed by human workers.
 * </p>
 */
public class HumanLoopConfig implements Serializable {
    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     */
    private String workteamArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     */
    private String humanTaskUiArn;

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     */
    private String taskTitle;

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String taskDescription;

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each
     * object. For example, if <code>TaskCount</code> is set to <code>3</code>
     * for an image classification labeling job, three workers will classify
     * each input image. Increasing <code>TaskCount</code> can improve label
     * accuracy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     */
    private Integer taskCount;

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 864000<br/>
     */
    private Integer taskAvailabilityLifetimeInSeconds;

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     */
    private Integer taskTimeLimitInSeconds;

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     */
    private java.util.List<String> taskKeywords;

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker for
     * each task performed.
     * </p>
     * <p>
     * Use one of the following prices for bounding box tasks. Prices are in US
     * dollars and should be based on the complexity of the task; the longer it
     * takes in your initial testing, the more you should offer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for image classification, text
     * classification, and custom tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for semantic segmentation tasks. Prices
     * are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Textract AnalyzeDocument Important
     * Form Key Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.400
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.160
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.040
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.920
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.680
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.560
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.440
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.320
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Rekognition DetectModerationLabels
     * Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Amazon Augmented AI custom human
     * review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     */
    private PublicWorkforceTaskPrice publicWorkforceTaskPrice;

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @return <p>
     *         Amazon Resource Name (ARN) of a team of workers.
     *         </p>
     */
    public String getWorkteamArn() {
        return workteamArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            Amazon Resource Name (ARN) of a team of workers.
     *            </p>
     */
    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of a team of workers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            Amazon Resource Name (ARN) of a team of workers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the human task user interface.
     *         </p>
     */
    public String getHumanTaskUiArn() {
        return humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The Amazon Resource Name (ARN) of the human task user
     *            interface.
     *            </p>
     */
    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The Amazon Resource Name (ARN) of the human task user
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
        return this;
    }

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     *
     * @return <p>
     *         A title for the human worker task.
     *         </p>
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     *
     * @param taskTitle <p>
     *            A title for the human worker task.
     *            </p>
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * <p>
     * A title for the human worker task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[\t\n\r -\uD7FF\uE000-\uFFFD]*$<br/>
     *
     * @param taskTitle <p>
     *            A title for the human worker task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
        return this;
    }

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A description for the human worker task.
     *         </p>
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param taskDescription <p>
     *            A description for the human worker task.
     *            </p>
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * <p>
     * A description for the human worker task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param taskDescription <p>
     *            A description for the human worker task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each
     * object. For example, if <code>TaskCount</code> is set to <code>3</code>
     * for an image classification labeling job, three workers will classify
     * each input image. Increasing <code>TaskCount</code> can improve label
     * accuracy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     *
     * @return <p>
     *         The number of distinct workers who will perform the same task on
     *         each object. For example, if <code>TaskCount</code> is set to
     *         <code>3</code> for an image classification labeling job, three
     *         workers will classify each input image. Increasing
     *         <code>TaskCount</code> can improve label accuracy.
     *         </p>
     */
    public Integer getTaskCount() {
        return taskCount;
    }

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each
     * object. For example, if <code>TaskCount</code> is set to <code>3</code>
     * for an image classification labeling job, three workers will classify
     * each input image. Increasing <code>TaskCount</code> can improve label
     * accuracy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     *
     * @param taskCount <p>
     *            The number of distinct workers who will perform the same task
     *            on each object. For example, if <code>TaskCount</code> is set
     *            to <code>3</code> for an image classification labeling job,
     *            three workers will classify each input image. Increasing
     *            <code>TaskCount</code> can improve label accuracy.
     *            </p>
     */
    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    /**
     * <p>
     * The number of distinct workers who will perform the same task on each
     * object. For example, if <code>TaskCount</code> is set to <code>3</code>
     * for an image classification labeling job, three workers will classify
     * each input image. Increasing <code>TaskCount</code> can improve label
     * accuracy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     *
     * @param taskCount <p>
     *            The number of distinct workers who will perform the same task
     *            on each object. For example, if <code>TaskCount</code> is set
     *            to <code>3</code> for an image classification labeling job,
     *            three workers will classify each input image. Increasing
     *            <code>TaskCount</code> can improve label accuracy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 864000<br/>
     *
     * @return <p>
     *         The length of time that a task remains available for labeling by
     *         human workers.
     *         </p>
     */
    public Integer getTaskAvailabilityLifetimeInSeconds() {
        return taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 864000<br/>
     *
     * @param taskAvailabilityLifetimeInSeconds <p>
     *            The length of time that a task remains available for labeling
     *            by human workers.
     *            </p>
     */
    public void setTaskAvailabilityLifetimeInSeconds(Integer taskAvailabilityLifetimeInSeconds) {
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labeling by human
     * workers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 864000<br/>
     *
     * @param taskAvailabilityLifetimeInSeconds <p>
     *            The length of time that a task remains available for labeling
     *            by human workers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskAvailabilityLifetimeInSeconds(
            Integer taskAvailabilityLifetimeInSeconds) {
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     *
     * @return <p>
     *         The amount of time that a worker has to complete a task.
     *         </p>
     */
    public Integer getTaskTimeLimitInSeconds() {
        return taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     *
     * @param taskTimeLimitInSeconds <p>
     *            The amount of time that a worker has to complete a task.
     *            </p>
     */
    public void setTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 28800<br/>
     *
     * @param taskTimeLimitInSeconds <p>
     *            The amount of time that a worker has to complete a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     *
     * @return <p>
     *         Keywords used to describe the task so that workers can discover
     *         the task.
     *         </p>
     */
    public java.util.List<String> getTaskKeywords() {
        return taskKeywords;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     *
     * @param taskKeywords <p>
     *            Keywords used to describe the task so that workers can
     *            discover the task.
     *            </p>
     */
    public void setTaskKeywords(java.util.Collection<String> taskKeywords) {
        if (taskKeywords == null) {
            this.taskKeywords = null;
            return;
        }

        this.taskKeywords = new java.util.ArrayList<String>(taskKeywords);
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskKeywords <p>
     *            Keywords used to describe the task so that workers can
     *            discover the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskKeywords(String... taskKeywords) {
        if (getTaskKeywords() == null) {
            this.taskKeywords = new java.util.ArrayList<String>(taskKeywords.length);
        }
        for (String value : taskKeywords) {
            this.taskKeywords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers can discover the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskKeywords <p>
     *            Keywords used to describe the task so that workers can
     *            discover the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withTaskKeywords(java.util.Collection<String> taskKeywords) {
        setTaskKeywords(taskKeywords);
        return this;
    }

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker for
     * each task performed.
     * </p>
     * <p>
     * Use one of the following prices for bounding box tasks. Prices are in US
     * dollars and should be based on the complexity of the task; the longer it
     * takes in your initial testing, the more you should offer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for image classification, text
     * classification, and custom tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for semantic segmentation tasks. Prices
     * are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Textract AnalyzeDocument Important
     * Form Key Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.400
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.160
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.040
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.920
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.680
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.560
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.440
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.320
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Rekognition DetectModerationLabels
     * Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Amazon Augmented AI custom human
     * review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Defines the amount of money paid to an Amazon Mechanical Turk
     *         worker for each task performed.
     *         </p>
     *         <p>
     *         Use one of the following prices for bounding box tasks. Prices
     *         are in US dollars and should be based on the complexity of the
     *         task; the longer it takes in your initial testing, the more you
     *         should offer.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         0.036
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.048
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.060
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.072
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.120
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.240
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.360
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.600
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.840
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.080
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.200
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use one of the following prices for image classification, text
     *         classification, and custom tasks. Prices are in US dollars.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         0.012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.024
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.036
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.048
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.060
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.072
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.120
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.240
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.360
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.600
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.840
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.080
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.200
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use one of the following prices for semantic segmentation tasks.
     *         Prices are in US dollars.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         0.840
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.080
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.200
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use one of the following prices for Textract AnalyzeDocument
     *         Important Form Key Amazon Augmented AI review tasks. Prices are
     *         in US dollars.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         2.400
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.280
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.160
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2.040
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.920
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.800
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.680
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.560
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.440
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.320
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.200
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.080
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.840
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.600
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.360
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.240
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.120
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.072
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.060
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.048
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.036
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.024
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.012
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use one of the following prices for Rekognition
     *         DetectModerationLabels Amazon Augmented AI review tasks. Prices
     *         are in US dollars.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1.200
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.080
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.840
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.600
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.360
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.240
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.120
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.072
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.060
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.048
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.036
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.024
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.012
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use one of the following prices for Amazon Augmented AI custom
     *         human review tasks. Prices are in US dollars.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1.200
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1.080
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.960
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.840
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.720
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.600
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.480
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.360
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.240
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.120
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.072
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.060
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.048
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.036
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.024
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0.012
     *         </p>
     *         </li>
     *         </ul>
     */
    public PublicWorkforceTaskPrice getPublicWorkforceTaskPrice() {
        return publicWorkforceTaskPrice;
    }

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker for
     * each task performed.
     * </p>
     * <p>
     * Use one of the following prices for bounding box tasks. Prices are in US
     * dollars and should be based on the complexity of the task; the longer it
     * takes in your initial testing, the more you should offer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for image classification, text
     * classification, and custom tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for semantic segmentation tasks. Prices
     * are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Textract AnalyzeDocument Important
     * Form Key Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.400
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.160
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.040
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.920
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.680
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.560
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.440
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.320
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Rekognition DetectModerationLabels
     * Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Amazon Augmented AI custom human
     * review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     *
     * @param publicWorkforceTaskPrice <p>
     *            Defines the amount of money paid to an Amazon Mechanical Turk
     *            worker for each task performed.
     *            </p>
     *            <p>
     *            Use one of the following prices for bounding box tasks. Prices
     *            are in US dollars and should be based on the complexity of the
     *            task; the longer it takes in your initial testing, the more
     *            you should offer.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for image classification, text
     *            classification, and custom tasks. Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for semantic segmentation
     *            tasks. Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for Textract AnalyzeDocument
     *            Important Form Key Amazon Augmented AI review tasks. Prices
     *            are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            2.400
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2.280
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2.160
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2.040
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.920
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.800
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.680
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.560
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.440
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.320
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for Rekognition
     *            DetectModerationLabels Amazon Augmented AI review tasks.
     *            Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for Amazon Augmented AI custom
     *            human review tasks. Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPublicWorkforceTaskPrice(PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
    }

    /**
     * <p>
     * Defines the amount of money paid to an Amazon Mechanical Turk worker for
     * each task performed.
     * </p>
     * <p>
     * Use one of the following prices for bounding box tasks. Prices are in US
     * dollars and should be based on the complexity of the task; the longer it
     * takes in your initial testing, the more you should offer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for image classification, text
     * classification, and custom tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for semantic segmentation tasks. Prices
     * are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Textract AnalyzeDocument Important
     * Form Key Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2.400
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.280
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.160
     * </p>
     * </li>
     * <li>
     * <p>
     * 2.040
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.920
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.800
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.680
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.560
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.440
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.320
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Rekognition DetectModerationLabels
     * Amazon Augmented AI review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use one of the following prices for Amazon Augmented AI custom human
     * review tasks. Prices are in US dollars.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1.200
     * </p>
     * </li>
     * <li>
     * <p>
     * 1.080
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.960
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.840
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.720
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.600
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.480
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.360
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.240
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.120
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.072
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.060
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.048
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.036
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.024
     * </p>
     * </li>
     * <li>
     * <p>
     * 0.012
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicWorkforceTaskPrice <p>
     *            Defines the amount of money paid to an Amazon Mechanical Turk
     *            worker for each task performed.
     *            </p>
     *            <p>
     *            Use one of the following prices for bounding box tasks. Prices
     *            are in US dollars and should be based on the complexity of the
     *            task; the longer it takes in your initial testing, the more
     *            you should offer.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for image classification, text
     *            classification, and custom tasks. Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for semantic segmentation
     *            tasks. Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for Textract AnalyzeDocument
     *            Important Form Key Amazon Augmented AI review tasks. Prices
     *            are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            2.400
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2.280
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2.160
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2.040
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.920
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.800
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.680
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.560
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.440
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.320
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for Rekognition
     *            DetectModerationLabels Amazon Augmented AI review tasks.
     *            Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Use one of the following prices for Amazon Augmented AI custom
     *            human review tasks. Prices are in US dollars.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            1.200
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1.080
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.960
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.840
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.720
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.600
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.480
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.360
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.240
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.120
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.072
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.060
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.048
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.036
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.024
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0.012
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopConfig withPublicWorkforceTaskPrice(
            PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: " + getWorkteamArn() + ",");
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: " + getHumanTaskUiArn() + ",");
        if (getTaskTitle() != null)
            sb.append("TaskTitle: " + getTaskTitle() + ",");
        if (getTaskDescription() != null)
            sb.append("TaskDescription: " + getTaskDescription() + ",");
        if (getTaskCount() != null)
            sb.append("TaskCount: " + getTaskCount() + ",");
        if (getTaskAvailabilityLifetimeInSeconds() != null)
            sb.append("TaskAvailabilityLifetimeInSeconds: "
                    + getTaskAvailabilityLifetimeInSeconds() + ",");
        if (getTaskTimeLimitInSeconds() != null)
            sb.append("TaskTimeLimitInSeconds: " + getTaskTimeLimitInSeconds() + ",");
        if (getTaskKeywords() != null)
            sb.append("TaskKeywords: " + getTaskKeywords() + ",");
        if (getPublicWorkforceTaskPrice() != null)
            sb.append("PublicWorkforceTaskPrice: " + getPublicWorkforceTaskPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode
                + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        hashCode = prime * hashCode + ((getTaskTitle() == null) ? 0 : getTaskTitle().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDescription() == null) ? 0 : getTaskDescription().hashCode());
        hashCode = prime * hashCode + ((getTaskCount() == null) ? 0 : getTaskCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getTaskAvailabilityLifetimeInSeconds() == null) ? 0
                        : getTaskAvailabilityLifetimeInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getTaskTimeLimitInSeconds() == null) ? 0 : getTaskTimeLimitInSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTaskKeywords() == null) ? 0 : getTaskKeywords().hashCode());
        hashCode = prime
                * hashCode
                + ((getPublicWorkforceTaskPrice() == null) ? 0 : getPublicWorkforceTaskPrice()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopConfig == false)
            return false;
        HumanLoopConfig other = (HumanLoopConfig) obj;

        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null
                && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null
                && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        if (other.getTaskTitle() == null ^ this.getTaskTitle() == null)
            return false;
        if (other.getTaskTitle() != null
                && other.getTaskTitle().equals(this.getTaskTitle()) == false)
            return false;
        if (other.getTaskDescription() == null ^ this.getTaskDescription() == null)
            return false;
        if (other.getTaskDescription() != null
                && other.getTaskDescription().equals(this.getTaskDescription()) == false)
            return false;
        if (other.getTaskCount() == null ^ this.getTaskCount() == null)
            return false;
        if (other.getTaskCount() != null
                && other.getTaskCount().equals(this.getTaskCount()) == false)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() == null
                ^ this.getTaskAvailabilityLifetimeInSeconds() == null)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() != null
                && other.getTaskAvailabilityLifetimeInSeconds().equals(
                        this.getTaskAvailabilityLifetimeInSeconds()) == false)
            return false;
        if (other.getTaskTimeLimitInSeconds() == null ^ this.getTaskTimeLimitInSeconds() == null)
            return false;
        if (other.getTaskTimeLimitInSeconds() != null
                && other.getTaskTimeLimitInSeconds().equals(this.getTaskTimeLimitInSeconds()) == false)
            return false;
        if (other.getTaskKeywords() == null ^ this.getTaskKeywords() == null)
            return false;
        if (other.getTaskKeywords() != null
                && other.getTaskKeywords().equals(this.getTaskKeywords()) == false)
            return false;
        if (other.getPublicWorkforceTaskPrice() == null
                ^ this.getPublicWorkforceTaskPrice() == null)
            return false;
        if (other.getPublicWorkforceTaskPrice() != null
                && other.getPublicWorkforceTaskPrice().equals(this.getPublicWorkforceTaskPrice()) == false)
            return false;
        return true;
    }
}
