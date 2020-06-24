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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * A description of the data repository task. You use data repository tasks to
 * perform bulk transfer operations between your Amazon FSx file system and its
 * linked data repository.
 * </p>
 */
public class DataRepositoryTask implements Serializable {
    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     */
    private String taskId;

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data
     * repository tasks for the file system in the <code>PENDING</code> or
     * <code>EXECUTING</code> states. Please retry when the data repository task
     * is finished (with a status of <code>CANCELED</code>,
     * <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the
     * FSx team if you need to delete your file system immediately.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     */
    private String lifecycle;

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type
     * currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     */
    private String type;

    /**
     * <p>
     * The time that the resource was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after
     * the task is complete.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a given resource. ARNs uniquely
     * identify AWS resources. We require an ARN when you need to specify a
     * resource unambiguously across all of AWS. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify
     * the data for the data repository task to process. For example, in an
     * EXPORT_TO_REPOSITORY task, the paths specify which data to export to the
     * linked data repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the
     * file system root directory.
     * </p>
     */
    private java.util.List<String> paths;

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when
     * <code>Lifecycle</code> is set to <code>FAILED</code>.
     * </p>
     */
    private DataRepositoryTaskFailureDetails failureDetails;

    /**
     * <p>
     * Provides the status of the number of files that the task has processed
     * successfully and failed to process.
     * </p>
     */
    private DataRepositoryTaskStatus status;

    /**
     * <p>
     * Provides a report detailing the data repository task results of the files
     * processed that match the criteria specified in the report
     * <code>Scope</code> parameter. FSx delivers the report to the file
     * system's linked data repository in Amazon S3, using the path specified in
     * the report <code>Path</code> parameter. You can specify whether or not a
     * report gets generated for a task using the <code>Enabled</code>
     * parameter.
     * </p>
     */
    private CompletionReport report;

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @return <p>
     *         The system-generated, unique 17-digit ID of the data repository
     *         task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @param taskId <p>
     *            The system-generated, unique 17-digit ID of the data
     *            repository task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(task-[0-9a-f]{17,})$<br/>
     *
     * @param taskId <p>
     *            The system-generated, unique 17-digit ID of the data
     *            repository task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data
     * repository tasks for the file system in the <code>PENDING</code> or
     * <code>EXECUTING</code> states. Please retry when the data repository task
     * is finished (with a status of <code>CANCELED</code>,
     * <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the
     * FSx team if you need to delete your file system immediately.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @return <p>
     *         The lifecycle status of the data repository task, as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx has not started the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXECUTING</code> - Amazon FSx is processing the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx was not able to complete the
     *         task. For example, there may be files the task failed to process.
     *         The <a>DataRepositoryTaskFailureDetails</a> property provides
     *         more information about task failures.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - FSx completed the task successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELED</code> - Amazon FSx canceled the task and it did
     *         not complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELING</code> - FSx is in process of canceling the task.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You cannot delete an FSx for Lustre file system if there are data
     *         repository tasks for the file system in the <code>PENDING</code>
     *         or <code>EXECUTING</code> states. Please retry when the data
     *         repository task is finished (with a status of
     *         <code>CANCELED</code>, <code>SUCCEEDED</code>, or
     *         <code>FAILED</code>). You can use the DescribeDataRepositoryTask
     *         action to monitor the task status. Contact the FSx team if you
     *         need to delete your file system immediately.
     *         </p>
     *         </note>
     * @see DataRepositoryTaskLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data
     * repository tasks for the file system in the <code>PENDING</code> or
     * <code>EXECUTING</code> states. Please retry when the data repository task
     * is finished (with a status of <code>CANCELED</code>,
     * <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the
     * FSx team if you need to delete your file system immediately.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You cannot delete an FSx for Lustre file system if there are
     *            data repository tasks for the file system in the
     *            <code>PENDING</code> or <code>EXECUTING</code> states. Please
     *            retry when the data repository task is finished (with a status
     *            of <code>CANCELED</code>, <code>SUCCEEDED</code>, or
     *            <code>FAILED</code>). You can use the
     *            DescribeDataRepositoryTask action to monitor the task status.
     *            Contact the FSx team if you need to delete your file system
     *            immediately.
     *            </p>
     *            </note>
     * @see DataRepositoryTaskLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data
     * repository tasks for the file system in the <code>PENDING</code> or
     * <code>EXECUTING</code> states. Please retry when the data repository task
     * is finished (with a status of <code>CANCELED</code>,
     * <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the
     * FSx team if you need to delete your file system immediately.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You cannot delete an FSx for Lustre file system if there are
     *            data repository tasks for the file system in the
     *            <code>PENDING</code> or <code>EXECUTING</code> states. Please
     *            retry when the data repository task is finished (with a status
     *            of <code>CANCELED</code>, <code>SUCCEEDED</code>, or
     *            <code>FAILED</code>). You can use the
     *            DescribeDataRepositoryTask action to monitor the task status.
     *            Contact the FSx team if you need to delete your file system
     *            immediately.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskLifecycle
     */
    public DataRepositoryTask withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data
     * repository tasks for the file system in the <code>PENDING</code> or
     * <code>EXECUTING</code> states. Please retry when the data repository task
     * is finished (with a status of <code>CANCELED</code>,
     * <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the
     * FSx team if you need to delete your file system immediately.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You cannot delete an FSx for Lustre file system if there are
     *            data repository tasks for the file system in the
     *            <code>PENDING</code> or <code>EXECUTING</code> states. Please
     *            retry when the data repository task is finished (with a status
     *            of <code>CANCELED</code>, <code>SUCCEEDED</code>, or
     *            <code>FAILED</code>). You can use the
     *            DescribeDataRepositoryTask action to monitor the task status.
     *            Contact the FSx team if you need to delete your file system
     *            immediately.
     *            </p>
     *            </note>
     * @see DataRepositoryTaskLifecycle
     */
    public void setLifecycle(DataRepositoryTaskLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For
     * example, there may be files the task failed to process. The
     * <a>DataRepositoryTaskFailureDetails</a> property provides more
     * information about task failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not
     * complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data
     * repository tasks for the file system in the <code>PENDING</code> or
     * <code>EXECUTING</code> states. Please retry when the data repository task
     * is finished (with a status of <code>CANCELED</code>,
     * <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the
     * FSx team if you need to delete your file system immediately.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED,
     * CANCELING
     *
     * @param lifecycle <p>
     *            The lifecycle status of the data repository task, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx has not started the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXECUTING</code> - Amazon FSx is processing the task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx was not able to complete the
     *            task. For example, there may be files the task failed to
     *            process. The <a>DataRepositoryTaskFailureDetails</a> property
     *            provides more information about task failures.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - FSx completed the task successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELED</code> - Amazon FSx canceled the task and it
     *            did not complete.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANCELING</code> - FSx is in process of canceling the
     *            task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You cannot delete an FSx for Lustre file system if there are
     *            data repository tasks for the file system in the
     *            <code>PENDING</code> or <code>EXECUTING</code> states. Please
     *            retry when the data repository task is finished (with a status
     *            of <code>CANCELED</code>, <code>SUCCEEDED</code>, or
     *            <code>FAILED</code>). You can use the
     *            DescribeDataRepositoryTask action to monitor the task status.
     *            Contact the FSx team if you need to delete your file system
     *            immediately.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskLifecycle
     */
    public DataRepositoryTask withLifecycle(DataRepositoryTaskLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type
     * currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @return <p>
     *         The type of data repository task; EXPORT_TO_REPOSITORY is the
     *         only type currently supported.
     *         </p>
     * @see DataRepositoryTaskType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type
     * currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            The type of data repository task; EXPORT_TO_REPOSITORY is the
     *            only type currently supported.
     *            </p>
     * @see DataRepositoryTaskType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type
     * currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            The type of data repository task; EXPORT_TO_REPOSITORY is the
     *            only type currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskType
     */
    public DataRepositoryTask withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type
     * currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            The type of data repository task; EXPORT_TO_REPOSITORY is the
     *            only type currently supported.
     *            </p>
     * @see DataRepositoryTaskType
     */
    public void setType(DataRepositoryTaskType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type
     * currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            The type of data repository task; EXPORT_TO_REPOSITORY is the
     *            only type currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskType
     */
    public DataRepositoryTask withType(DataRepositoryTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time that the resource was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     *
     * @return <p>
     *         The time that the resource was created, in seconds (since
     *         1970-01-01T00:00:00Z), also known as Unix time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that the resource was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     *
     * @param creationTime <p>
     *            The time that the resource was created, in seconds (since
     *            1970-01-01T00:00:00Z), also known as Unix time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the resource was created, in seconds (since
     * 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that the resource was created, in seconds (since
     *            1970-01-01T00:00:00Z), also known as Unix time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     *
     * @return <p>
     *         The time that Amazon FSx began processing the task.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     *
     * @param startTime <p>
     *            The time that Amazon FSx began processing the task.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time that Amazon FSx began processing the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after
     * the task is complete.
     * </p>
     *
     * @return <p>
     *         The time that Amazon FSx completed processing the task, populated
     *         after the task is complete.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after
     * the task is complete.
     * </p>
     *
     * @param endTime <p>
     *            The time that Amazon FSx completed processing the task,
     *            populated after the task is complete.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after
     * the task is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that Amazon FSx completed processing the task,
     *            populated after the task is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a given resource. ARNs uniquely
     * identify AWS resources. We require an ARN when you need to specify a
     * resource unambiguously across all of AWS. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for a given resource. ARNs
     *         uniquely identify AWS resources. We require an ARN when you need
     *         to specify a resource unambiguously across all of AWS. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a given resource. ARNs uniquely
     * identify AWS resources. We require an ARN when you need to specify a
     * resource unambiguously across all of AWS. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) for a given resource. ARNs
     *            uniquely identify AWS resources. We require an ARN when you
     *            need to specify a resource unambiguously across all of AWS.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a given resource. ARNs uniquely
     * identify AWS resources. We require an ARN when you need to specify a
     * resource unambiguously across all of AWS. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) for a given resource. ARNs
     *            uniquely identify AWS resources. We require an ARN when you
     *            need to specify a resource unambiguously across all of AWS.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     *
     * @return <p>
     *         A list of <code>Tag</code> values, with a maximum of 50 elements.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     *
     * @param tags <p>
     *            A list of <code>Tag</code> values, with a maximum of 50
     *            elements.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of <code>Tag</code> values, with a maximum of 50
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of <code>Tag</code> values, with a maximum of 50
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The globally unique ID of the file system, assigned by Amazon
     *         FSx.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The globally unique ID of the file system, assigned by Amazon
     *            FSx.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The globally unique ID of the file system, assigned by Amazon
     *            FSx.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify
     * the data for the data repository task to process. For example, in an
     * EXPORT_TO_REPOSITORY task, the paths specify which data to export to the
     * linked data repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the
     * file system root directory.
     * </p>
     *
     * @return <p>
     *         An array of paths on the Amazon FSx for Lustre file system that
     *         specify the data for the data repository task to process. For
     *         example, in an EXPORT_TO_REPOSITORY task, the paths specify which
     *         data to export to the linked data repository.
     *         </p>
     *         <p>
     *         (Default) If <code>Paths</code> is not specified, Amazon FSx uses
     *         the file system root directory.
     *         </p>
     */
    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify
     * the data for the data repository task to process. For example, in an
     * EXPORT_TO_REPOSITORY task, the paths specify which data to export to the
     * linked data repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the
     * file system root directory.
     * </p>
     *
     * @param paths <p>
     *            An array of paths on the Amazon FSx for Lustre file system
     *            that specify the data for the data repository task to process.
     *            For example, in an EXPORT_TO_REPOSITORY task, the paths
     *            specify which data to export to the linked data repository.
     *            </p>
     *            <p>
     *            (Default) If <code>Paths</code> is not specified, Amazon FSx
     *            uses the file system root directory.
     *            </p>
     */
    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify
     * the data for the data repository task to process. For example, in an
     * EXPORT_TO_REPOSITORY task, the paths specify which data to export to the
     * linked data repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the
     * file system root directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param paths <p>
     *            An array of paths on the Amazon FSx for Lustre file system
     *            that specify the data for the data repository task to process.
     *            For example, in an EXPORT_TO_REPOSITORY task, the paths
     *            specify which data to export to the linked data repository.
     *            </p>
     *            <p>
     *            (Default) If <code>Paths</code> is not specified, Amazon FSx
     *            uses the file system root directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withPaths(String... paths) {
        if (getPaths() == null) {
            this.paths = new java.util.ArrayList<String>(paths.length);
        }
        for (String value : paths) {
            this.paths.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify
     * the data for the data repository task to process. For example, in an
     * EXPORT_TO_REPOSITORY task, the paths specify which data to export to the
     * linked data repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the
     * file system root directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param paths <p>
     *            An array of paths on the Amazon FSx for Lustre file system
     *            that specify the data for the data repository task to process.
     *            For example, in an EXPORT_TO_REPOSITORY task, the paths
     *            specify which data to export to the linked data repository.
     *            </p>
     *            <p>
     *            (Default) If <code>Paths</code> is not specified, Amazon FSx
     *            uses the file system root directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when
     * <code>Lifecycle</code> is set to <code>FAILED</code>.
     * </p>
     *
     * @return <p>
     *         Failure message describing why the task failed, it is populated
     *         only when <code>Lifecycle</code> is set to <code>FAILED</code>.
     *         </p>
     */
    public DataRepositoryTaskFailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when
     * <code>Lifecycle</code> is set to <code>FAILED</code>.
     * </p>
     *
     * @param failureDetails <p>
     *            Failure message describing why the task failed, it is
     *            populated only when <code>Lifecycle</code> is set to
     *            <code>FAILED</code>.
     *            </p>
     */
    public void setFailureDetails(DataRepositoryTaskFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when
     * <code>Lifecycle</code> is set to <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            Failure message describing why the task failed, it is
     *            populated only when <code>Lifecycle</code> is set to
     *            <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withFailureDetails(DataRepositoryTaskFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    /**
     * <p>
     * Provides the status of the number of files that the task has processed
     * successfully and failed to process.
     * </p>
     *
     * @return <p>
     *         Provides the status of the number of files that the task has
     *         processed successfully and failed to process.
     *         </p>
     */
    public DataRepositoryTaskStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * Provides the status of the number of files that the task has processed
     * successfully and failed to process.
     * </p>
     *
     * @param status <p>
     *            Provides the status of the number of files that the task has
     *            processed successfully and failed to process.
     *            </p>
     */
    public void setStatus(DataRepositoryTaskStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the number of files that the task has processed
     * successfully and failed to process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Provides the status of the number of files that the task has
     *            processed successfully and failed to process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withStatus(DataRepositoryTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Provides a report detailing the data repository task results of the files
     * processed that match the criteria specified in the report
     * <code>Scope</code> parameter. FSx delivers the report to the file
     * system's linked data repository in Amazon S3, using the path specified in
     * the report <code>Path</code> parameter. You can specify whether or not a
     * report gets generated for a task using the <code>Enabled</code>
     * parameter.
     * </p>
     *
     * @return <p>
     *         Provides a report detailing the data repository task results of
     *         the files processed that match the criteria specified in the
     *         report <code>Scope</code> parameter. FSx delivers the report to
     *         the file system's linked data repository in Amazon S3, using the
     *         path specified in the report <code>Path</code> parameter. You can
     *         specify whether or not a report gets generated for a task using
     *         the <code>Enabled</code> parameter.
     *         </p>
     */
    public CompletionReport getReport() {
        return report;
    }

    /**
     * <p>
     * Provides a report detailing the data repository task results of the files
     * processed that match the criteria specified in the report
     * <code>Scope</code> parameter. FSx delivers the report to the file
     * system's linked data repository in Amazon S3, using the path specified in
     * the report <code>Path</code> parameter. You can specify whether or not a
     * report gets generated for a task using the <code>Enabled</code>
     * parameter.
     * </p>
     *
     * @param report <p>
     *            Provides a report detailing the data repository task results
     *            of the files processed that match the criteria specified in
     *            the report <code>Scope</code> parameter. FSx delivers the
     *            report to the file system's linked data repository in Amazon
     *            S3, using the path specified in the report <code>Path</code>
     *            parameter. You can specify whether or not a report gets
     *            generated for a task using the <code>Enabled</code> parameter.
     *            </p>
     */
    public void setReport(CompletionReport report) {
        this.report = report;
    }

    /**
     * <p>
     * Provides a report detailing the data repository task results of the files
     * processed that match the criteria specified in the report
     * <code>Scope</code> parameter. FSx delivers the report to the file
     * system's linked data repository in Amazon S3, using the path specified in
     * the report <code>Path</code> parameter. You can specify whether or not a
     * report gets generated for a task using the <code>Enabled</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param report <p>
     *            Provides a report detailing the data repository task results
     *            of the files processed that match the criteria specified in
     *            the report <code>Scope</code> parameter. FSx delivers the
     *            report to the file system's linked data repository in Amazon
     *            S3, using the path specified in the report <code>Path</code>
     *            parameter. You can specify whether or not a report gets
     *            generated for a task using the <code>Enabled</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTask withReport(CompletionReport report) {
        this.report = report;
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
        if (getTaskId() != null)
            sb.append("TaskId: " + getTaskId() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getPaths() != null)
            sb.append("Paths: " + getPaths() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getReport() != null)
            sb.append("Report: " + getReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryTask == false)
            return false;
        DataRepositoryTask other = (DataRepositoryTask) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        return true;
    }
}
