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
 * The properties of a parallel data resource.
 * </p>
 */
public class ParallelDataProperties implements Serializable {
    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String arn;

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     */
    private String description;

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready
     * for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     */
    private String status;

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language codes for the target languages available in the parallel
     * data file. All possible target languages are returned as an array.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     */
    private ParallelDataConfig parallelDataConfig;

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data
     * resource.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the
     * parallel data input file. This number includes only the characters in
     * your translation examples. It does not include characters that are used
     * to format your file. For example, if you provided a Translation Memory
     * Exchange (.tmx) file, this number does not include the tags.
     * </p>
     */
    private Long importedDataSize;

    /**
     * <p>
     * The number of records successfully imported from the parallel data input
     * file.
     * </p>
     */
    private Long importedRecordCount;

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data
     * input file.
     * </p>
     */
    private Long failedRecordCount;

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when
     * you created or updated the parallel data resource. For example, Amazon
     * Translate skips empty records, empty target texts, and empty lines.
     * </p>
     */
    private Long skippedRecordCount;

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     */
    private String latestUpdateAttemptStatus;

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     */
    private java.util.Date latestUpdateAttemptAt;

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The custom name assigned to the parallel data resource.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The custom name assigned to the parallel data resource.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The custom name assigned to the parallel data resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the parallel data resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the parallel data resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the parallel data resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @return <p>
     *         The description assigned to the parallel data resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            The description assigned to the parallel data resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            The description assigned to the parallel data resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready
     * for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @return <p>
     *         The status of the parallel data resource. When the parallel data
     *         is ready for you to use, the status is <code>ACTIVE</code>.
     *         </p>
     * @see ParallelDataStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready
     * for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource. When the parallel
     *            data is ready for you to use, the status is
     *            <code>ACTIVE</code>.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready
     * for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource. When the parallel
     *            data is ready for you to use, the status is
     *            <code>ACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public ParallelDataProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready
     * for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource. When the parallel
     *            data is ready for you to use, the status is
     *            <code>ACTIVE</code>.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setStatus(ParallelDataStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready
     * for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource. When the parallel
     *            data is ready for you to use, the status is
     *            <code>ACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public ParallelDataProperties withStatus(ParallelDataStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The source language of the translations in the parallel data
     *         file.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The source language of the translations in the parallel data
     *            file.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The source language of the translations in the parallel data
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available in the parallel
     * data file. All possible target languages are returned as an array.
     * </p>
     *
     * @return <p>
     *         The language codes for the target languages available in the
     *         parallel data file. All possible target languages are returned as
     *         an array.
     *         </p>
     */
    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language codes for the target languages available in the parallel
     * data file. All possible target languages are returned as an array.
     * </p>
     *
     * @param targetLanguageCodes <p>
     *            The language codes for the target languages available in the
     *            parallel data file. All possible target languages are returned
     *            as an array.
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
     * The language codes for the target languages available in the parallel
     * data file. All possible target languages are returned as an array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language codes for the target languages available in the
     *            parallel data file. All possible target languages are returned
     *            as an array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withTargetLanguageCodes(String... targetLanguageCodes) {
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
     * The language codes for the target languages available in the parallel
     * data file. All possible target languages are returned as an array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language codes for the target languages available in the
     *            parallel data file. All possible target languages are returned
     *            as an array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withTargetLanguageCodes(
            java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     *
     * @return <p>
     *         Specifies the format and S3 location of the parallel data input
     *         file.
     *         </p>
     */
    public ParallelDataConfig getParallelDataConfig() {
        return parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     *
     * @param parallelDataConfig <p>
     *            Specifies the format and S3 location of the parallel data
     *            input file.
     *            </p>
     */
    public void setParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        this.parallelDataConfig = parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataConfig <p>
     *            Specifies the format and S3 location of the parallel data
     *            input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        this.parallelDataConfig = parallelDataConfig;
        return this;
    }

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data
     * resource.
     * </p>
     *
     * @return <p>
     *         Additional information from Amazon Translate about the parallel
     *         data resource.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data
     * resource.
     * </p>
     *
     * @param message <p>
     *            Additional information from Amazon Translate about the
     *            parallel data resource.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Additional information from Amazon Translate about the
     *            parallel data resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the
     * parallel data input file. This number includes only the characters in
     * your translation examples. It does not include characters that are used
     * to format your file. For example, if you provided a Translation Memory
     * Exchange (.tmx) file, this number does not include the tags.
     * </p>
     *
     * @return <p>
     *         The number of UTF-8 characters that Amazon Translate imported
     *         from the parallel data input file. This number includes only the
     *         characters in your translation examples. It does not include
     *         characters that are used to format your file. For example, if you
     *         provided a Translation Memory Exchange (.tmx) file, this number
     *         does not include the tags.
     *         </p>
     */
    public Long getImportedDataSize() {
        return importedDataSize;
    }

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the
     * parallel data input file. This number includes only the characters in
     * your translation examples. It does not include characters that are used
     * to format your file. For example, if you provided a Translation Memory
     * Exchange (.tmx) file, this number does not include the tags.
     * </p>
     *
     * @param importedDataSize <p>
     *            The number of UTF-8 characters that Amazon Translate imported
     *            from the parallel data input file. This number includes only
     *            the characters in your translation examples. It does not
     *            include characters that are used to format your file. For
     *            example, if you provided a Translation Memory Exchange (.tmx)
     *            file, this number does not include the tags.
     *            </p>
     */
    public void setImportedDataSize(Long importedDataSize) {
        this.importedDataSize = importedDataSize;
    }

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the
     * parallel data input file. This number includes only the characters in
     * your translation examples. It does not include characters that are used
     * to format your file. For example, if you provided a Translation Memory
     * Exchange (.tmx) file, this number does not include the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importedDataSize <p>
     *            The number of UTF-8 characters that Amazon Translate imported
     *            from the parallel data input file. This number includes only
     *            the characters in your translation examples. It does not
     *            include characters that are used to format your file. For
     *            example, if you provided a Translation Memory Exchange (.tmx)
     *            file, this number does not include the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withImportedDataSize(Long importedDataSize) {
        this.importedDataSize = importedDataSize;
        return this;
    }

    /**
     * <p>
     * The number of records successfully imported from the parallel data input
     * file.
     * </p>
     *
     * @return <p>
     *         The number of records successfully imported from the parallel
     *         data input file.
     *         </p>
     */
    public Long getImportedRecordCount() {
        return importedRecordCount;
    }

    /**
     * <p>
     * The number of records successfully imported from the parallel data input
     * file.
     * </p>
     *
     * @param importedRecordCount <p>
     *            The number of records successfully imported from the parallel
     *            data input file.
     *            </p>
     */
    public void setImportedRecordCount(Long importedRecordCount) {
        this.importedRecordCount = importedRecordCount;
    }

    /**
     * <p>
     * The number of records successfully imported from the parallel data input
     * file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importedRecordCount <p>
     *            The number of records successfully imported from the parallel
     *            data input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withImportedRecordCount(Long importedRecordCount) {
        this.importedRecordCount = importedRecordCount;
        return this;
    }

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data
     * input file.
     * </p>
     *
     * @return <p>
     *         The number of records unsuccessfully imported from the parallel
     *         data input file.
     *         </p>
     */
    public Long getFailedRecordCount() {
        return failedRecordCount;
    }

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data
     * input file.
     * </p>
     *
     * @param failedRecordCount <p>
     *            The number of records unsuccessfully imported from the
     *            parallel data input file.
     *            </p>
     */
    public void setFailedRecordCount(Long failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data
     * input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedRecordCount <p>
     *            The number of records unsuccessfully imported from the
     *            parallel data input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withFailedRecordCount(Long failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
        return this;
    }

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when
     * you created or updated the parallel data resource. For example, Amazon
     * Translate skips empty records, empty target texts, and empty lines.
     * </p>
     *
     * @return <p>
     *         The number of items in the input file that Amazon Translate
     *         skipped when you created or updated the parallel data resource.
     *         For example, Amazon Translate skips empty records, empty target
     *         texts, and empty lines.
     *         </p>
     */
    public Long getSkippedRecordCount() {
        return skippedRecordCount;
    }

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when
     * you created or updated the parallel data resource. For example, Amazon
     * Translate skips empty records, empty target texts, and empty lines.
     * </p>
     *
     * @param skippedRecordCount <p>
     *            The number of items in the input file that Amazon Translate
     *            skipped when you created or updated the parallel data
     *            resource. For example, Amazon Translate skips empty records,
     *            empty target texts, and empty lines.
     *            </p>
     */
    public void setSkippedRecordCount(Long skippedRecordCount) {
        this.skippedRecordCount = skippedRecordCount;
    }

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when
     * you created or updated the parallel data resource. For example, Amazon
     * Translate skips empty records, empty target texts, and empty lines.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skippedRecordCount <p>
     *            The number of items in the input file that Amazon Translate
     *            skipped when you created or updated the parallel data
     *            resource. For example, Amazon Translate skips empty records,
     *            empty target texts, and empty lines.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withSkippedRecordCount(Long skippedRecordCount) {
        this.skippedRecordCount = skippedRecordCount;
        return this;
    }

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     *
     * @return <p>
     *         The encryption key used to encrypt this object.
     *         </p>
     */
    public EncryptionKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     *
     * @param encryptionKey <p>
     *            The encryption key used to encrypt this object.
     *            </p>
     */
    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionKey <p>
     *            The encryption key used to encrypt this object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     *
     * @return <p>
     *         The time at which the parallel data resource was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time at which the parallel data resource was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time at which the parallel data resource was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which the parallel data resource was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The time at which the parallel data resource was last updated.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The time at which the parallel data resource was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @return <p>
     *         The status of the most recent update attempt for the parallel
     *         data resource.
     *         </p>
     * @see ParallelDataStatus
     */
    public String getLatestUpdateAttemptStatus() {
        return latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the most recent update attempt for the parallel
     *            data resource.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the most recent update attempt for the parallel
     *            data resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public ParallelDataProperties withLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus;
        return this;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the most recent update attempt for the parallel
     *            data resource.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setLatestUpdateAttemptStatus(ParallelDataStatus latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus.toString();
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the most recent update attempt for the parallel
     *            data resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public ParallelDataProperties withLatestUpdateAttemptStatus(
            ParallelDataStatus latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     *
     * @return <p>
     *         The time that the most recent update was attempted.
     *         </p>
     */
    public java.util.Date getLatestUpdateAttemptAt() {
        return latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     *
     * @param latestUpdateAttemptAt <p>
     *            The time that the most recent update was attempted.
     *            </p>
     */
    public void setLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        this.latestUpdateAttemptAt = latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestUpdateAttemptAt <p>
     *            The time that the most recent update was attempted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataProperties withLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        this.latestUpdateAttemptAt = latestUpdateAttemptAt;
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
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: " + getTargetLanguageCodes() + ",");
        if (getParallelDataConfig() != null)
            sb.append("ParallelDataConfig: " + getParallelDataConfig() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getImportedDataSize() != null)
            sb.append("ImportedDataSize: " + getImportedDataSize() + ",");
        if (getImportedRecordCount() != null)
            sb.append("ImportedRecordCount: " + getImportedRecordCount() + ",");
        if (getFailedRecordCount() != null)
            sb.append("FailedRecordCount: " + getFailedRecordCount() + ",");
        if (getSkippedRecordCount() != null)
            sb.append("SkippedRecordCount: " + getSkippedRecordCount() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getLatestUpdateAttemptStatus() != null)
            sb.append("LatestUpdateAttemptStatus: " + getLatestUpdateAttemptStatus() + ",");
        if (getLatestUpdateAttemptAt() != null)
            sb.append("LatestUpdateAttemptAt: " + getLatestUpdateAttemptAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode
                + ((getParallelDataConfig() == null) ? 0 : getParallelDataConfig().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getImportedDataSize() == null) ? 0 : getImportedDataSize().hashCode());
        hashCode = prime * hashCode
                + ((getImportedRecordCount() == null) ? 0 : getImportedRecordCount().hashCode());
        hashCode = prime * hashCode
                + ((getFailedRecordCount() == null) ? 0 : getFailedRecordCount().hashCode());
        hashCode = prime * hashCode
                + ((getSkippedRecordCount() == null) ? 0 : getSkippedRecordCount().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestUpdateAttemptStatus() == null) ? 0 : getLatestUpdateAttemptStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestUpdateAttemptAt() == null) ? 0 : getLatestUpdateAttemptAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelDataProperties == false)
            return false;
        ParallelDataProperties other = (ParallelDataProperties) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getParallelDataConfig() == null ^ this.getParallelDataConfig() == null)
            return false;
        if (other.getParallelDataConfig() != null
                && other.getParallelDataConfig().equals(this.getParallelDataConfig()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getImportedDataSize() == null ^ this.getImportedDataSize() == null)
            return false;
        if (other.getImportedDataSize() != null
                && other.getImportedDataSize().equals(this.getImportedDataSize()) == false)
            return false;
        if (other.getImportedRecordCount() == null ^ this.getImportedRecordCount() == null)
            return false;
        if (other.getImportedRecordCount() != null
                && other.getImportedRecordCount().equals(this.getImportedRecordCount()) == false)
            return false;
        if (other.getFailedRecordCount() == null ^ this.getFailedRecordCount() == null)
            return false;
        if (other.getFailedRecordCount() != null
                && other.getFailedRecordCount().equals(this.getFailedRecordCount()) == false)
            return false;
        if (other.getSkippedRecordCount() == null ^ this.getSkippedRecordCount() == null)
            return false;
        if (other.getSkippedRecordCount() != null
                && other.getSkippedRecordCount().equals(this.getSkippedRecordCount()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLatestUpdateAttemptStatus() == null
                ^ this.getLatestUpdateAttemptStatus() == null)
            return false;
        if (other.getLatestUpdateAttemptStatus() != null
                && other.getLatestUpdateAttemptStatus().equals(this.getLatestUpdateAttemptStatus()) == false)
            return false;
        if (other.getLatestUpdateAttemptAt() == null ^ this.getLatestUpdateAttemptAt() == null)
            return false;
        if (other.getLatestUpdateAttemptAt() != null
                && other.getLatestUpdateAttemptAt().equals(this.getLatestUpdateAttemptAt()) == false)
            return false;
        return true;
    }
}
