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
 * Provides summary information about a labeling job.
 * </p>
 */
public class LabelingJobSummary implements Serializable {
    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String labelingJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     */
    private String labelingJobArn;

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String labelingJobStatus;

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     */
    private LabelCounters labelCounters;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
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
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run
     * before each data object is sent to a worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String preHumanTaskLambdaArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate
     * the annotations from individual workers into a label for a data object.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String annotationConsolidationLambdaArn;

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this
     * field contains a description of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     */
    private LabelingJobOutput labelingJobOutput;

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     */
    private LabelingJobInputConfig inputConfig;

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the labeling job.
     *         </p>
     */
    public String getLabelingJobName() {
        return labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name of the labeling job.
     *            </p>
     */
    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) assigned to the labeling job when
     *         it was created.
     *         </p>
     */
    public String getLabelingJobArn() {
        return labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) assigned to the labeling job
     *            when it was created.
     *            </p>
     */
    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) assigned to the labeling job
     *            when it was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
        return this;
    }

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     *
     * @return <p>
     *         The date and time that the job was created (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the job was created (timestamp).
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the job was created (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     *
     * @return <p>
     *         The date and time that the job was last modified (timestamp).
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the job was last modified (timestamp).
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the job was last modified (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The current status of the labeling job.
     *         </p>
     * @see LabelingJobStatus
     */
    public String getLabelingJobStatus() {
        return labelingJobStatus;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The current status of the labeling job.
     *            </p>
     * @see LabelingJobStatus
     */
    public void setLabelingJobStatus(String labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The current status of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelingJobStatus
     */
    public LabelingJobSummary withLabelingJobStatus(String labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The current status of the labeling job.
     *            </p>
     * @see LabelingJobStatus
     */
    public void setLabelingJobStatus(LabelingJobStatus labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus.toString();
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The current status of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelingJobStatus
     */
    public LabelingJobSummary withLabelingJobStatus(LabelingJobStatus labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     *
     * @return <p>
     *         Counts showing the progress of the labeling job.
     *         </p>
     */
    public LabelCounters getLabelCounters() {
        return labelCounters;
    }

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     *
     * @param labelCounters <p>
     *            Counts showing the progress of the labeling job.
     *            </p>
     */
    public void setLabelCounters(LabelCounters labelCounters) {
        this.labelCounters = labelCounters;
    }

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCounters <p>
     *            Counts showing the progress of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withLabelCounters(LabelCounters labelCounters) {
        this.labelCounters = labelCounters;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the work team assigned to the
     *         job.
     *         </p>
     */
    public String getWorkteamArn() {
        return workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) of the work team assigned to
     *            the job.
     *            </p>
     */
    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
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
     *            The Amazon Resource Name (ARN) of the work team assigned to
     *            the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run
     * before each data object is sent to a worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a Lambda function. The function
     *         is run before each data object is sent to a worker.
     *         </p>
     */
    public String getPreHumanTaskLambdaArn() {
        return preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run
     * before each data object is sent to a worker.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param preHumanTaskLambdaArn <p>
     *            The Amazon Resource Name (ARN) of a Lambda function. The
     *            function is run before each data object is sent to a worker.
     *            </p>
     */
    public void setPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        this.preHumanTaskLambdaArn = preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run
     * before each data object is sent to a worker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param preHumanTaskLambdaArn <p>
     *            The Amazon Resource Name (ARN) of a Lambda function. The
     *            function is run before each data object is sent to a worker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        this.preHumanTaskLambdaArn = preHumanTaskLambdaArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate
     * the annotations from individual workers into a label for a data object.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Lambda function used to
     *         consolidate the annotations from individual workers into a label
     *         for a data object. For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     *         >Annotation Consolidation</a>.
     *         </p>
     */
    public String getAnnotationConsolidationLambdaArn() {
        return annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate
     * the annotations from individual workers into a label for a data object.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param annotationConsolidationLambdaArn <p>
     *            The Amazon Resource Name (ARN) of the Lambda function used to
     *            consolidate the annotations from individual workers into a
     *            label for a data object. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     *            >Annotation Consolidation</a>.
     *            </p>
     */
    public void setAnnotationConsolidationLambdaArn(String annotationConsolidationLambdaArn) {
        this.annotationConsolidationLambdaArn = annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate
     * the annotations from individual workers into a label for a data object.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param annotationConsolidationLambdaArn <p>
     *            The Amazon Resource Name (ARN) of the Lambda function used to
     *            consolidate the annotations from individual workers into a
     *            label for a data object. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     *            >Annotation Consolidation</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withAnnotationConsolidationLambdaArn(
            String annotationConsolidationLambdaArn) {
        this.annotationConsolidationLambdaArn = annotationConsolidationLambdaArn;
        return this;
    }

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this
     * field contains a description of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the <code>LabelingJobStatus</code> field is
     *         <code>Failed</code>, this field contains a description of the
     *         error.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this
     * field contains a description of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the <code>LabelingJobStatus</code> field is
     *            <code>Failed</code>, this field contains a description of the
     *            error.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this
     * field contains a description of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the <code>LabelingJobStatus</code> field is
     *            <code>Failed</code>, this field contains a description of the
     *            error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     *
     * @return <p>
     *         The location of the output produced by the labeling job.
     *         </p>
     */
    public LabelingJobOutput getLabelingJobOutput() {
        return labelingJobOutput;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     *
     * @param labelingJobOutput <p>
     *            The location of the output produced by the labeling job.
     *            </p>
     */
    public void setLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        this.labelingJobOutput = labelingJobOutput;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobOutput <p>
     *            The location of the output produced by the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        this.labelingJobOutput = labelingJobOutput;
        return this;
    }

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     *
     * @return <p>
     *         Input configuration for the labeling job.
     *         </p>
     */
    public LabelingJobInputConfig getInputConfig() {
        return inputConfig;
    }

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     *
     * @param inputConfig <p>
     *            Input configuration for the labeling job.
     *            </p>
     */
    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfig <p>
     *            Input configuration for the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobSummary withInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
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
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: " + getLabelingJobName() + ",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: " + getLabelingJobArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLabelingJobStatus() != null)
            sb.append("LabelingJobStatus: " + getLabelingJobStatus() + ",");
        if (getLabelCounters() != null)
            sb.append("LabelCounters: " + getLabelCounters() + ",");
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: " + getWorkteamArn() + ",");
        if (getPreHumanTaskLambdaArn() != null)
            sb.append("PreHumanTaskLambdaArn: " + getPreHumanTaskLambdaArn() + ",");
        if (getAnnotationConsolidationLambdaArn() != null)
            sb.append("AnnotationConsolidationLambdaArn: " + getAnnotationConsolidationLambdaArn()
                    + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getLabelingJobOutput() != null)
            sb.append("LabelingJobOutput: " + getLabelingJobOutput() + ",");
        if (getInputConfig() != null)
            sb.append("InputConfig: " + getInputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobStatus() == null) ? 0 : getLabelingJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLabelCounters() == null) ? 0 : getLabelCounters().hashCode());
        hashCode = prime * hashCode
                + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreHumanTaskLambdaArn() == null) ? 0 : getPreHumanTaskLambdaArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnnotationConsolidationLambdaArn() == null) ? 0
                        : getAnnotationConsolidationLambdaArn().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobOutput() == null) ? 0 : getLabelingJobOutput().hashCode());
        hashCode = prime * hashCode
                + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobSummary == false)
            return false;
        LabelingJobSummary other = (LabelingJobSummary) obj;

        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null
                && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null
                && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLabelingJobStatus() == null ^ this.getLabelingJobStatus() == null)
            return false;
        if (other.getLabelingJobStatus() != null
                && other.getLabelingJobStatus().equals(this.getLabelingJobStatus()) == false)
            return false;
        if (other.getLabelCounters() == null ^ this.getLabelCounters() == null)
            return false;
        if (other.getLabelCounters() != null
                && other.getLabelCounters().equals(this.getLabelCounters()) == false)
            return false;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null
                && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getPreHumanTaskLambdaArn() == null ^ this.getPreHumanTaskLambdaArn() == null)
            return false;
        if (other.getPreHumanTaskLambdaArn() != null
                && other.getPreHumanTaskLambdaArn().equals(this.getPreHumanTaskLambdaArn()) == false)
            return false;
        if (other.getAnnotationConsolidationLambdaArn() == null
                ^ this.getAnnotationConsolidationLambdaArn() == null)
            return false;
        if (other.getAnnotationConsolidationLambdaArn() != null
                && other.getAnnotationConsolidationLambdaArn().equals(
                        this.getAnnotationConsolidationLambdaArn()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLabelingJobOutput() == null ^ this.getLabelingJobOutput() == null)
            return false;
        if (other.getLabelingJobOutput() != null
                && other.getLabelingJobOutput().equals(this.getLabelingJobOutput()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null
                && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        return true;
    }
}
