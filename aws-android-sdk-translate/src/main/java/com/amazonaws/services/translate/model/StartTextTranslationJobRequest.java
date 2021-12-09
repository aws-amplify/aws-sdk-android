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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts an asynchronous batch translation job. Batch translation jobs can be
 * used to translate large volumes of text across multiple documents at once.
 * For more information, see <a>async</a>.
 * </p>
 * <p>
 * Batch translation jobs can be described with the
 * <a>DescribeTextTranslationJob</a> operation, listed with the
 * <a>ListTextTranslationJobs</a> operation, and stopped with the
 * <a>StopTextTranslationJob</a> operation.
 * </p>
 * <note>
 * <p>
 * Amazon Translate does not support batch translation of multiple source
 * languages at once.
 * </p>
 * </note>
 */
public class StartTextTranslationJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the
     * translation job.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that grants Amazon Translate read access to your input data.
     * For more information, see <a>identity-and-access-management</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The language code of the input language. For a list of language codes,
     * see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during
     * batch translation jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language code of the output language.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;

    /**
     * <p>
     * The name of a custom terminology resource to add to the translation job.
     * This resource lists examples source terms and the desired translation for
     * each term.
     * </p>
     * <p>
     * This parameter accepts only one custom terminology resource.
     * </p>
     * <p>
     * For a list of available custom terminology resources, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * <p>
     * For more information, see <a>how-custom-terminology</a>.
     * </p>
     */
    private java.util.List<String> terminologyNames;

    /**
     * <p>
     * The name of a parallel data resource to add to the translation job. This
     * resource consists of examples that show how you want segments of text to
     * be translated. When you add parallel data to a translation job, you
     * create an <i>Active Custom Translation</i> job.
     * </p>
     * <p>
     * This parameter accepts only one parallel data resource.
     * </p>
     * <note>
     * <p>
     * Active Custom Translation jobs are priced at a higher rate than other
     * jobs that don't use parallel data. For more information, see <a
     * href="http://aws.amazon.com/translate/pricing/">Amazon Translate
     * pricing</a>.
     * </p>
     * </note>
     * <p>
     * For a list of available parallel data resources, use the
     * <a>ListParallelData</a> operation.
     * </p>
     * <p>
     * For more information, see <a>customizing-translations-parallel-data</a>.
     * </p>
     */
    private java.util.List<String> parallelDataNames;

    /**
     * <p>
     * A unique identifier for the request. This token is auto-generated when
     * using the Amazon Translate SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * mask profane words and phrases.
     * </p>
     */
    private TranslationSettings settings;

    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The name of the batch translation job to be performed.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the batch translation job to be performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The name of the batch translation job to be performed.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch translation job to be performed.
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
     *            The name of the batch translation job to be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the
     * translation job.
     * </p>
     *
     * @return <p>
     *         Specifies the format and S3 location of the input documents for
     *         the translation job.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the
     * translation job.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Specifies the format and S3 location of the input documents
     *            for the translation job.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the input documents for the
     * translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Specifies the format and S3 location of the input documents
     *            for the translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     *
     * @return <p>
     *         Specifies the S3 folder to which your job output will be saved.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Specifies the S3 folder to which your job output will be
     *            saved.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Specifies the S3 folder to which your job output will be saved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Specifies the S3 folder to which your job output will be
     *            saved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that grants Amazon Translate read access to your input data.
     * For more information, see <a>identity-and-access-management</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Identity Access and
     *         Management (IAM) role that grants Amazon Translate read access to
     *         your input data. For more information, see
     *         <a>identity-and-access-management</a>.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that grants Amazon Translate read access to your input data.
     * For more information, see <a>identity-and-access-management</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity Access and
     *            Management (IAM) role that grants Amazon Translate read access
     *            to your input data. For more information, see
     *            <a>identity-and-access-management</a>.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity Access and Management
     * (IAM) role that grants Amazon Translate read access to your input data.
     * For more information, see <a>identity-and-access-management</a>.
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
     *            Management (IAM) role that grants Amazon Translate read access
     *            to your input data. For more information, see
     *            <a>identity-and-access-management</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The language code of the input language. For a list of language codes,
     * see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during
     * batch translation jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code of the input language. For a list of language
     *         codes, see <a>what-is-languages</a>.
     *         </p>
     *         <p>
     *         Amazon Translate does not automatically detect a source language
     *         during batch translation jobs.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the input language. For a list of language codes,
     * see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during
     * batch translation jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code of the input language. For a list of
     *            language codes, see <a>what-is-languages</a>.
     *            </p>
     *            <p>
     *            Amazon Translate does not automatically detect a source
     *            language during batch translation jobs.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the input language. For a list of language codes,
     * see <a>what-is-languages</a>.
     * </p>
     * <p>
     * Amazon Translate does not automatically detect a source language during
     * batch translation jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code of the input language. For a list of
     *            language codes, see <a>what-is-languages</a>.
     *            </p>
     *            <p>
     *            Amazon Translate does not automatically detect a source
     *            language during batch translation jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the output language.
     * </p>
     *
     * @return <p>
     *         The language code of the output language.
     *         </p>
     */
    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language code of the output language.
     * </p>
     *
     * @param targetLanguageCodes <p>
     *            The language code of the output language.
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
     * The language code of the output language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language code of the output language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withTargetLanguageCodes(String... targetLanguageCodes) {
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
     * The language code of the output language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language code of the output language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withTargetLanguageCodes(
            java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * The name of a custom terminology resource to add to the translation job.
     * This resource lists examples source terms and the desired translation for
     * each term.
     * </p>
     * <p>
     * This parameter accepts only one custom terminology resource.
     * </p>
     * <p>
     * For a list of available custom terminology resources, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * <p>
     * For more information, see <a>how-custom-terminology</a>.
     * </p>
     *
     * @return <p>
     *         The name of a custom terminology resource to add to the
     *         translation job. This resource lists examples source terms and
     *         the desired translation for each term.
     *         </p>
     *         <p>
     *         This parameter accepts only one custom terminology resource.
     *         </p>
     *         <p>
     *         For a list of available custom terminology resources, use the
     *         <a>ListTerminologies</a> operation.
     *         </p>
     *         <p>
     *         For more information, see <a>how-custom-terminology</a>.
     *         </p>
     */
    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * The name of a custom terminology resource to add to the translation job.
     * This resource lists examples source terms and the desired translation for
     * each term.
     * </p>
     * <p>
     * This parameter accepts only one custom terminology resource.
     * </p>
     * <p>
     * For a list of available custom terminology resources, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * <p>
     * For more information, see <a>how-custom-terminology</a>.
     * </p>
     *
     * @param terminologyNames <p>
     *            The name of a custom terminology resource to add to the
     *            translation job. This resource lists examples source terms and
     *            the desired translation for each term.
     *            </p>
     *            <p>
     *            This parameter accepts only one custom terminology resource.
     *            </p>
     *            <p>
     *            For a list of available custom terminology resources, use the
     *            <a>ListTerminologies</a> operation.
     *            </p>
     *            <p>
     *            For more information, see <a>how-custom-terminology</a>.
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
     * The name of a custom terminology resource to add to the translation job.
     * This resource lists examples source terms and the desired translation for
     * each term.
     * </p>
     * <p>
     * This parameter accepts only one custom terminology resource.
     * </p>
     * <p>
     * For a list of available custom terminology resources, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * <p>
     * For more information, see <a>how-custom-terminology</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            The name of a custom terminology resource to add to the
     *            translation job. This resource lists examples source terms and
     *            the desired translation for each term.
     *            </p>
     *            <p>
     *            This parameter accepts only one custom terminology resource.
     *            </p>
     *            <p>
     *            For a list of available custom terminology resources, use the
     *            <a>ListTerminologies</a> operation.
     *            </p>
     *            <p>
     *            For more information, see <a>how-custom-terminology</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withTerminologyNames(String... terminologyNames) {
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
     * The name of a custom terminology resource to add to the translation job.
     * This resource lists examples source terms and the desired translation for
     * each term.
     * </p>
     * <p>
     * This parameter accepts only one custom terminology resource.
     * </p>
     * <p>
     * For a list of available custom terminology resources, use the
     * <a>ListTerminologies</a> operation.
     * </p>
     * <p>
     * For more information, see <a>how-custom-terminology</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            The name of a custom terminology resource to add to the
     *            translation job. This resource lists examples source terms and
     *            the desired translation for each term.
     *            </p>
     *            <p>
     *            This parameter accepts only one custom terminology resource.
     *            </p>
     *            <p>
     *            For a list of available custom terminology resources, use the
     *            <a>ListTerminologies</a> operation.
     *            </p>
     *            <p>
     *            For more information, see <a>how-custom-terminology</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withTerminologyNames(
            java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * The name of a parallel data resource to add to the translation job. This
     * resource consists of examples that show how you want segments of text to
     * be translated. When you add parallel data to a translation job, you
     * create an <i>Active Custom Translation</i> job.
     * </p>
     * <p>
     * This parameter accepts only one parallel data resource.
     * </p>
     * <note>
     * <p>
     * Active Custom Translation jobs are priced at a higher rate than other
     * jobs that don't use parallel data. For more information, see <a
     * href="http://aws.amazon.com/translate/pricing/">Amazon Translate
     * pricing</a>.
     * </p>
     * </note>
     * <p>
     * For a list of available parallel data resources, use the
     * <a>ListParallelData</a> operation.
     * </p>
     * <p>
     * For more information, see <a>customizing-translations-parallel-data</a>.
     * </p>
     *
     * @return <p>
     *         The name of a parallel data resource to add to the translation
     *         job. This resource consists of examples that show how you want
     *         segments of text to be translated. When you add parallel data to
     *         a translation job, you create an <i>Active Custom Translation</i>
     *         job.
     *         </p>
     *         <p>
     *         This parameter accepts only one parallel data resource.
     *         </p>
     *         <note>
     *         <p>
     *         Active Custom Translation jobs are priced at a higher rate than
     *         other jobs that don't use parallel data. For more information,
     *         see <a href="http://aws.amazon.com/translate/pricing/">Amazon
     *         Translate pricing</a>.
     *         </p>
     *         </note>
     *         <p>
     *         For a list of available parallel data resources, use the
     *         <a>ListParallelData</a> operation.
     *         </p>
     *         <p>
     *         For more information, see
     *         <a>customizing-translations-parallel-data</a>.
     *         </p>
     */
    public java.util.List<String> getParallelDataNames() {
        return parallelDataNames;
    }

    /**
     * <p>
     * The name of a parallel data resource to add to the translation job. This
     * resource consists of examples that show how you want segments of text to
     * be translated. When you add parallel data to a translation job, you
     * create an <i>Active Custom Translation</i> job.
     * </p>
     * <p>
     * This parameter accepts only one parallel data resource.
     * </p>
     * <note>
     * <p>
     * Active Custom Translation jobs are priced at a higher rate than other
     * jobs that don't use parallel data. For more information, see <a
     * href="http://aws.amazon.com/translate/pricing/">Amazon Translate
     * pricing</a>.
     * </p>
     * </note>
     * <p>
     * For a list of available parallel data resources, use the
     * <a>ListParallelData</a> operation.
     * </p>
     * <p>
     * For more information, see <a>customizing-translations-parallel-data</a>.
     * </p>
     *
     * @param parallelDataNames <p>
     *            The name of a parallel data resource to add to the translation
     *            job. This resource consists of examples that show how you want
     *            segments of text to be translated. When you add parallel data
     *            to a translation job, you create an <i>Active Custom
     *            Translation</i> job.
     *            </p>
     *            <p>
     *            This parameter accepts only one parallel data resource.
     *            </p>
     *            <note>
     *            <p>
     *            Active Custom Translation jobs are priced at a higher rate
     *            than other jobs that don't use parallel data. For more
     *            information, see <a
     *            href="http://aws.amazon.com/translate/pricing/">Amazon
     *            Translate pricing</a>.
     *            </p>
     *            </note>
     *            <p>
     *            For a list of available parallel data resources, use the
     *            <a>ListParallelData</a> operation.
     *            </p>
     *            <p>
     *            For more information, see
     *            <a>customizing-translations-parallel-data</a>.
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
     * The name of a parallel data resource to add to the translation job. This
     * resource consists of examples that show how you want segments of text to
     * be translated. When you add parallel data to a translation job, you
     * create an <i>Active Custom Translation</i> job.
     * </p>
     * <p>
     * This parameter accepts only one parallel data resource.
     * </p>
     * <note>
     * <p>
     * Active Custom Translation jobs are priced at a higher rate than other
     * jobs that don't use parallel data. For more information, see <a
     * href="http://aws.amazon.com/translate/pricing/">Amazon Translate
     * pricing</a>.
     * </p>
     * </note>
     * <p>
     * For a list of available parallel data resources, use the
     * <a>ListParallelData</a> operation.
     * </p>
     * <p>
     * For more information, see <a>customizing-translations-parallel-data</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataNames <p>
     *            The name of a parallel data resource to add to the translation
     *            job. This resource consists of examples that show how you want
     *            segments of text to be translated. When you add parallel data
     *            to a translation job, you create an <i>Active Custom
     *            Translation</i> job.
     *            </p>
     *            <p>
     *            This parameter accepts only one parallel data resource.
     *            </p>
     *            <note>
     *            <p>
     *            Active Custom Translation jobs are priced at a higher rate
     *            than other jobs that don't use parallel data. For more
     *            information, see <a
     *            href="http://aws.amazon.com/translate/pricing/">Amazon
     *            Translate pricing</a>.
     *            </p>
     *            </note>
     *            <p>
     *            For a list of available parallel data resources, use the
     *            <a>ListParallelData</a> operation.
     *            </p>
     *            <p>
     *            For more information, see
     *            <a>customizing-translations-parallel-data</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withParallelDataNames(String... parallelDataNames) {
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
     * The name of a parallel data resource to add to the translation job. This
     * resource consists of examples that show how you want segments of text to
     * be translated. When you add parallel data to a translation job, you
     * create an <i>Active Custom Translation</i> job.
     * </p>
     * <p>
     * This parameter accepts only one parallel data resource.
     * </p>
     * <note>
     * <p>
     * Active Custom Translation jobs are priced at a higher rate than other
     * jobs that don't use parallel data. For more information, see <a
     * href="http://aws.amazon.com/translate/pricing/">Amazon Translate
     * pricing</a>.
     * </p>
     * </note>
     * <p>
     * For a list of available parallel data resources, use the
     * <a>ListParallelData</a> operation.
     * </p>
     * <p>
     * For more information, see <a>customizing-translations-parallel-data</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataNames <p>
     *            The name of a parallel data resource to add to the translation
     *            job. This resource consists of examples that show how you want
     *            segments of text to be translated. When you add parallel data
     *            to a translation job, you create an <i>Active Custom
     *            Translation</i> job.
     *            </p>
     *            <p>
     *            This parameter accepts only one parallel data resource.
     *            </p>
     *            <note>
     *            <p>
     *            Active Custom Translation jobs are priced at a higher rate
     *            than other jobs that don't use parallel data. For more
     *            information, see <a
     *            href="http://aws.amazon.com/translate/pricing/">Amazon
     *            Translate pricing</a>.
     *            </p>
     *            </note>
     *            <p>
     *            For a list of available parallel data resources, use the
     *            <a>ListParallelData</a> operation.
     *            </p>
     *            <p>
     *            For more information, see
     *            <a>customizing-translations-parallel-data</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withParallelDataNames(
            java.util.Collection<String> parallelDataNames) {
        setParallelDataNames(parallelDataNames);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is auto-generated when
     * using the Amazon Translate SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the request. This token is auto-generated
     *         when using the Amazon Translate SDK.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is auto-generated when
     * using the Amazon Translate SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientToken <p>
     *            A unique identifier for the request. This token is
     *            auto-generated when using the Amazon Translate SDK.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is auto-generated when
     * using the Amazon Translate SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientToken <p>
     *            A unique identifier for the request. This token is
     *            auto-generated when using the Amazon Translate SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * mask profane words and phrases.
     * </p>
     *
     * @return <p>
     *         Settings to configure your translation output, including the
     *         option to mask profane words and phrases.
     *         </p>
     */
    public TranslationSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * mask profane words and phrases.
     * </p>
     *
     * @param settings <p>
     *            Settings to configure your translation output, including the
     *            option to mask profane words and phrases.
     *            </p>
     */
    public void setSettings(TranslationSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * mask profane words and phrases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Settings to configure your translation output, including the
     *            option to mask profane words and phrases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextTranslationJobRequest withSettings(TranslationSettings settings) {
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
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: " + getTargetLanguageCodes() + ",");
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: " + getTerminologyNames() + ",");
        if (getParallelDataNames() != null)
            sb.append("ParallelDataNames: " + getParallelDataNames() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode
                + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
        hashCode = prime * hashCode
                + ((getParallelDataNames() == null) ? 0 : getParallelDataNames().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTextTranslationJobRequest == false)
            return false;
        StartTextTranslationJobRequest other = (StartTextTranslationJobRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
