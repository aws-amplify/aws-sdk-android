/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a translation job.
 * </p>
 */
public class TextTranslationJobProperties implements Serializable {
    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobId;

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during
     * the translation job.
     * </p>
     */
    private JobDetails jobDetails;

    /**
     * <p>
     * The language code of the language of the source text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language code of the language of the target text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation
     * job. Only one terminology can be applied per
     * <a>StartTextTranslationJob</a> request at this time.
     * </p>
     */
    private java.util.List<String> terminologyNames;

    /**
     * <p>
     * A list containing the names of the parallel data resources applied to the
     * translation job.
     * </p>
     */
    private java.util.List<String> parallelDataNames;

    /**
     * <p>
     * An explanation of any errors that may have occurred during the
     * translation job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     */
    private java.util.Date submittedTime;

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The input configuration properties that were specified when the job was
     * requested.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The output configuration properties that were specified when the job was
     * requested.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that granted Amazon Translate read access to the job's input
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Settings that configure the translation output.
     * </p>
     */
    private TranslationSettings settings;

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The ID of the translation job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The ID of the translation job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The ID of the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The user-defined name of the translation job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The user-defined name of the translation job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The user-defined name of the translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The user-defined name of the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         The status of the translation job.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the translation job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public TextTranslationJobProperties withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the translation job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The status of the translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public TextTranslationJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during
     * the translation job.
     * </p>
     *
     * @return <p>
     *         The number of documents successfully and unsuccessfully processed
     *         during the translation job.
     *         </p>
     */
    public JobDetails getJobDetails() {
        return jobDetails;
    }

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during
     * the translation job.
     * </p>
     *
     * @param jobDetails <p>
     *            The number of documents successfully and unsuccessfully
     *            processed during the translation job.
     *            </p>
     */
    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The number of documents successfully and unsuccessfully processed during
     * the translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobDetails <p>
     *            The number of documents successfully and unsuccessfully
     *            processed during the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
        return this;
    }

    /**
     * <p>
     * The language code of the language of the source text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code of the language of the source text. The
     *         language must be a language supported by Amazon Translate.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the language of the source text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code of the language of the source text. The
     *            language must be a language supported by Amazon Translate.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the language of the source text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code of the language of the source text. The
     *            language must be a language supported by Amazon Translate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     *
     * @return <p>
     *         The language code of the language of the target text. The
     *         language must be a language supported by Amazon Translate.
     *         </p>
     */
    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     *
     * @param targetLanguageCodes <p>
     *            The language code of the language of the target text. The
     *            language must be a language supported by Amazon Translate.
     *            </p>
     */
    public void setTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        if (targetLanguageCodes == null) {
            this.targetLanguageCodes = null;
            return;
        }

        this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes);
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language code of the language of the target text. The
     *            language must be a language supported by Amazon Translate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withTargetLanguageCodes(String... targetLanguageCodes) {
        if (getTargetLanguageCodes() == null) {
            this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes.length);
        }
        for (String value : targetLanguageCodes) {
            this.targetLanguageCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The language code of the language of the target text. The language must
     * be a language supported by Amazon Translate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language code of the language of the target text. The
     *            language must be a language supported by Amazon Translate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withTargetLanguageCodes(
            java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation
     * job. Only one terminology can be applied per
     * <a>StartTextTranslationJob</a> request at this time.
     * </p>
     *
     * @return <p>
     *         A list containing the names of the terminologies applied to a
     *         translation job. Only one terminology can be applied per
     *         <a>StartTextTranslationJob</a> request at this time.
     *         </p>
     */
    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation
     * job. Only one terminology can be applied per
     * <a>StartTextTranslationJob</a> request at this time.
     * </p>
     *
     * @param terminologyNames <p>
     *            A list containing the names of the terminologies applied to a
     *            translation job. Only one terminology can be applied per
     *            <a>StartTextTranslationJob</a> request at this time.
     *            </p>
     */
    public void setTerminologyNames(java.util.Collection<String> terminologyNames) {
        if (terminologyNames == null) {
            this.terminologyNames = null;
            return;
        }

        this.terminologyNames = new java.util.ArrayList<String>(terminologyNames);
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation
     * job. Only one terminology can be applied per
     * <a>StartTextTranslationJob</a> request at this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            A list containing the names of the terminologies applied to a
     *            translation job. Only one terminology can be applied per
     *            <a>StartTextTranslationJob</a> request at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withTerminologyNames(String... terminologyNames) {
        if (getTerminologyNames() == null) {
            this.terminologyNames = new java.util.ArrayList<String>(terminologyNames.length);
        }
        for (String value : terminologyNames) {
            this.terminologyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the names of the terminologies applied to a translation
     * job. Only one terminology can be applied per
     * <a>StartTextTranslationJob</a> request at this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            A list containing the names of the terminologies applied to a
     *            translation job. Only one terminology can be applied per
     *            <a>StartTextTranslationJob</a> request at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withTerminologyNames(
            java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * A list containing the names of the parallel data resources applied to the
     * translation job.
     * </p>
     *
     * @return <p>
     *         A list containing the names of the parallel data resources
     *         applied to the translation job.
     *         </p>
     */
    public java.util.List<String> getParallelDataNames() {
        return parallelDataNames;
    }

    /**
     * <p>
     * A list containing the names of the parallel data resources applied to the
     * translation job.
     * </p>
     *
     * @param parallelDataNames <p>
     *            A list containing the names of the parallel data resources
     *            applied to the translation job.
     *            </p>
     */
    public void setParallelDataNames(java.util.Collection<String> parallelDataNames) {
        if (parallelDataNames == null) {
            this.parallelDataNames = null;
            return;
        }

        this.parallelDataNames = new java.util.ArrayList<String>(parallelDataNames);
    }

    /**
     * <p>
     * A list containing the names of the parallel data resources applied to the
     * translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataNames <p>
     *            A list containing the names of the parallel data resources
     *            applied to the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withParallelDataNames(String... parallelDataNames) {
        if (getParallelDataNames() == null) {
            this.parallelDataNames = new java.util.ArrayList<String>(parallelDataNames.length);
        }
        for (String value : parallelDataNames) {
            this.parallelDataNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the names of the parallel data resources applied to the
     * translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataNames <p>
     *            A list containing the names of the parallel data resources
     *            applied to the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withParallelDataNames(
            java.util.Collection<String> parallelDataNames) {
        setParallelDataNames(parallelDataNames);
        return this;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the
     * translation job.
     * </p>
     *
     * @return <p>
     *         An explanation of any errors that may have occurred during the
     *         translation job.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the
     * translation job.
     * </p>
     *
     * @param message <p>
     *            An explanation of any errors that may have occurred during the
     *            translation job.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the
     * translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            An explanation of any errors that may have occurred during the
     *            translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     *
     * @return <p>
     *         The time at which the translation job was submitted.
     *         </p>
     */
    public java.util.Date getSubmittedTime() {
        return submittedTime;
    }

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     *
     * @param submittedTime <p>
     *            The time at which the translation job was submitted.
     *            </p>
     */
    public void setSubmittedTime(java.util.Date submittedTime) {
        this.submittedTime = submittedTime;
    }

    /**
     * <p>
     * The time at which the translation job was submitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedTime <p>
     *            The time at which the translation job was submitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withSubmittedTime(java.util.Date submittedTime) {
        this.submittedTime = submittedTime;
        return this;
    }

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     *
     * @return <p>
     *         The time at which the translation job ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     *
     * @param endTime <p>
     *            The time at which the translation job ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the translation job ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time at which the translation job ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The input configuration properties that were specified when the job was
     * requested.
     * </p>
     *
     * @return <p>
     *         The input configuration properties that were specified when the
     *         job was requested.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input configuration properties that were specified when the job was
     * requested.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input configuration properties that were specified when
     *            the job was requested.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input configuration properties that were specified when the job was
     * requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input configuration properties that were specified when
     *            the job was requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * The output configuration properties that were specified when the job was
     * requested.
     * </p>
     *
     * @return <p>
     *         The output configuration properties that were specified when the
     *         job was requested.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * The output configuration properties that were specified when the job was
     * requested.
     * </p>
     *
     * @param outputDataConfig <p>
     *            The output configuration properties that were specified when
     *            the job was requested.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output configuration properties that were specified when the job was
     * requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            The output configuration properties that were specified when
     *            the job was requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that granted Amazon Translate read access to the job's input
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Identity Access and
     *         Management (IAM) role that granted Amazon Translate read access
     *         to the job's input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that granted Amazon Translate read access to the job's input
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity Access and
     *            Management (IAM) role that granted Amazon Translate read
     *            access to the job's input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that granted Amazon Translate read access to the job's input
     * data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity Access and
     *            Management (IAM) role that granted Amazon Translate read
     *            access to the job's input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Settings that configure the translation output.
     * </p>
     *
     * @return <p>
     *         Settings that configure the translation output.
     *         </p>
     */
    public TranslationSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Settings that configure the translation output.
     * </p>
     *
     * @param settings <p>
     *            Settings that configure the translation output.
     *            </p>
     */
    public void setSettings(TranslationSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Settings that configure the translation output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Settings that configure the translation output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextTranslationJobProperties withSettings(TranslationSettings settings) {
        this.settings = settings;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getJobDetails() != null)
            sb.append("JobDetails: " + getJobDetails() + ",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: " + getTargetLanguageCodes() + ",");
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: " + getTerminologyNames() + ",");
        if (getParallelDataNames() != null)
            sb.append("ParallelDataNames: " + getParallelDataNames() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSubmittedTime() != null)
            sb.append("SubmittedTime: " + getSubmittedTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode
                + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
        hashCode = prime * hashCode
                + ((getParallelDataNames() == null) ? 0 : getParallelDataNames().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getSubmittedTime() == null) ? 0 : getSubmittedTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextTranslationJobProperties == false)
            return false;
        TextTranslationJobProperties other = (TextTranslationJobProperties) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null
                && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null
                && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCodes() == null ^ this.getTargetLanguageCodes() == null)
            return false;
        if (other.getTargetLanguageCodes() != null
                && other.getTargetLanguageCodes().equals(this.getTargetLanguageCodes()) == false)
            return false;
        if (other.getTerminologyNames() == null ^ this.getTerminologyNames() == null)
            return false;
        if (other.getTerminologyNames() != null
                && other.getTerminologyNames().equals(this.getTerminologyNames()) == false)
            return false;
        if (other.getParallelDataNames() == null ^ this.getParallelDataNames() == null)
            return false;
        if (other.getParallelDataNames() != null
                && other.getParallelDataNames().equals(this.getParallelDataNames()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmittedTime() == null ^ this.getSubmittedTime() == null)
            return false;
        if (other.getSubmittedTime() != null
                && other.getSubmittedTime().equals(this.getSubmittedTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null
                && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
