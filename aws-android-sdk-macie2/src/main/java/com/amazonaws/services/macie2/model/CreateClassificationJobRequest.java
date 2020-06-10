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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates and defines the settings for a classification job.
 * </p>
 */
public class CreateClassificationJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     */
    private java.util.List<String> customDataIdentifierIds;

    /**
     * <p>
     * A custom description of the job. The description can contain as many as
     * 512 characters.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether to run the job immediately, after it's created.
     * </p>
     */
    private Boolean initialRun;

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't
     * specify a value for the scheduleFrequency property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you
     * specify this value, use the scheduleFrequency property to define the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     */
    private String jobType;

    /**
     * <p>
     * A custom name for the job. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that
     * analysis.
     * </p>
     */
    private S3JobDefinition s3JobDefinition;

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects.
     * This value determines the percentage of eligible objects that the job
     * analyzes. If the value is less than 100, Amazon Macie randomly selects
     * the objects to analyze, up to the specified percentage.
     * </p>
     */
    private Integer samplingPercentage;

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once,
     * don't specify a value for this property and set the value of the jobType
     * property to ONE_TIME.
     * </p>
     */
    private JobScheduleFrequency scheduleFrequency;

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a required tag
     * key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive token that you provide to ensure the
     *         idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token that you provide to ensure the
     *            idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token that you provide to ensure the
     *            idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     *
     * @return <p>
     *         The custom data identifiers to use for data analysis and
     *         classification.
     *         </p>
     */
    public java.util.List<String> getCustomDataIdentifierIds() {
        return customDataIdentifierIds;
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     *
     * @param customDataIdentifierIds <p>
     *            The custom data identifiers to use for data analysis and
     *            classification.
     *            </p>
     */
    public void setCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        if (customDataIdentifierIds == null) {
            this.customDataIdentifierIds = null;
            return;
        }

        this.customDataIdentifierIds = new java.util.ArrayList<String>(customDataIdentifierIds);
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDataIdentifierIds <p>
     *            The custom data identifiers to use for data analysis and
     *            classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withCustomDataIdentifierIds(
            String... customDataIdentifierIds) {
        if (getCustomDataIdentifierIds() == null) {
            this.customDataIdentifierIds = new java.util.ArrayList<String>(
                    customDataIdentifierIds.length);
        }
        for (String value : customDataIdentifierIds) {
            this.customDataIdentifierIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The custom data identifiers to use for data analysis and classification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDataIdentifierIds <p>
     *            The custom data identifiers to use for data analysis and
     *            classification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withCustomDataIdentifierIds(
            java.util.Collection<String> customDataIdentifierIds) {
        setCustomDataIdentifierIds(customDataIdentifierIds);
        return this;
    }

    /**
     * <p>
     * A custom description of the job. The description can contain as many as
     * 512 characters.
     * </p>
     *
     * @return <p>
     *         A custom description of the job. The description can contain as
     *         many as 512 characters.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A custom description of the job. The description can contain as many as
     * 512 characters.
     * </p>
     *
     * @param description <p>
     *            A custom description of the job. The description can contain
     *            as many as 512 characters.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the job. The description can contain as many as
     * 512 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A custom description of the job. The description can contain
     *            as many as 512 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies whether to run the job immediately, after it's created.
     * </p>
     *
     * @return <p>
     *         Specifies whether to run the job immediately, after it's created.
     *         </p>
     */
    public Boolean isInitialRun() {
        return initialRun;
    }

    /**
     * <p>
     * Specifies whether to run the job immediately, after it's created.
     * </p>
     *
     * @return <p>
     *         Specifies whether to run the job immediately, after it's created.
     *         </p>
     */
    public Boolean getInitialRun() {
        return initialRun;
    }

    /**
     * <p>
     * Specifies whether to run the job immediately, after it's created.
     * </p>
     *
     * @param initialRun <p>
     *            Specifies whether to run the job immediately, after it's
     *            created.
     *            </p>
     */
    public void setInitialRun(Boolean initialRun) {
        this.initialRun = initialRun;
    }

    /**
     * <p>
     * Specifies whether to run the job immediately, after it's created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initialRun <p>
     *            Specifies whether to run the job immediately, after it's
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withInitialRun(Boolean initialRun) {
        this.initialRun = initialRun;
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't
     * specify a value for the scheduleFrequency property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you
     * specify this value, use the scheduleFrequency property to define the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @return <p>
     *         The schedule for running the job. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE_TIME - Run the job only once. If you specify this value,
     *         don't specify a value for the scheduleFrequency property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULED - Run the job on a daily, weekly, or monthly basis. If
     *         you specify this value, use the scheduleFrequency property to
     *         define the recurrence pattern for the job.
     *         </p>
     *         </li>
     *         </ul>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't
     * specify a value for the scheduleFrequency property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you
     * specify this value, use the scheduleFrequency property to define the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - Run the job only once. If you specify this value,
     *            don't specify a value for the scheduleFrequency property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - Run the job on a daily, weekly, or monthly basis.
     *            If you specify this value, use the scheduleFrequency property
     *            to define the recurrence pattern for the job.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't
     * specify a value for the scheduleFrequency property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you
     * specify this value, use the scheduleFrequency property to define the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - Run the job only once. If you specify this value,
     *            don't specify a value for the scheduleFrequency property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - Run the job on a daily, weekly, or monthly basis.
     *            If you specify this value, use the scheduleFrequency property
     *            to define the recurrence pattern for the job.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateClassificationJobRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't
     * specify a value for the scheduleFrequency property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you
     * specify this value, use the scheduleFrequency property to define the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - Run the job only once. If you specify this value,
     *            don't specify a value for the scheduleFrequency property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - Run the job on a daily, weekly, or monthly basis.
     *            If you specify this value, use the scheduleFrequency property
     *            to define the recurrence pattern for the job.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The schedule for running the job. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - Run the job only once. If you specify this value, don't
     * specify a value for the scheduleFrequency property.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - Run the job on a daily, weekly, or monthly basis. If you
     * specify this value, use the scheduleFrequency property to define the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_TIME, SCHEDULED
     *
     * @param jobType <p>
     *            The schedule for running the job. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE_TIME - Run the job only once. If you specify this value,
     *            don't specify a value for the scheduleFrequency property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCHEDULED - Run the job on a daily, weekly, or monthly basis.
     *            If you specify this value, use the scheduleFrequency property
     *            to define the recurrence pattern for the job.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateClassificationJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * A custom name for the job. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     *
     * @return <p>
     *         A custom name for the job. The name must contain at least 3
     *         characters and can contain as many as 64 characters.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A custom name for the job. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     *
     * @param name <p>
     *            A custom name for the job. The name must contain at least 3
     *            characters and can contain as many as 64 characters.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the job. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A custom name for the job. The name must contain at least 3
     *            characters and can contain as many as 64 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that
     * analysis.
     * </p>
     *
     * @return <p>
     *         The S3 buckets that contain the objects to analyze, and the scope
     *         of that analysis.
     *         </p>
     */
    public S3JobDefinition getS3JobDefinition() {
        return s3JobDefinition;
    }

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that
     * analysis.
     * </p>
     *
     * @param s3JobDefinition <p>
     *            The S3 buckets that contain the objects to analyze, and the
     *            scope of that analysis.
     *            </p>
     */
    public void setS3JobDefinition(S3JobDefinition s3JobDefinition) {
        this.s3JobDefinition = s3JobDefinition;
    }

    /**
     * <p>
     * The S3 buckets that contain the objects to analyze, and the scope of that
     * analysis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3JobDefinition <p>
     *            The S3 buckets that contain the objects to analyze, and the
     *            scope of that analysis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withS3JobDefinition(S3JobDefinition s3JobDefinition) {
        this.s3JobDefinition = s3JobDefinition;
        return this;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects.
     * This value determines the percentage of eligible objects that the job
     * analyzes. If the value is less than 100, Amazon Macie randomly selects
     * the objects to analyze, up to the specified percentage.
     * </p>
     *
     * @return <p>
     *         The sampling depth, as a percentage, to apply when processing
     *         objects. This value determines the percentage of eligible objects
     *         that the job analyzes. If the value is less than 100, Amazon
     *         Macie randomly selects the objects to analyze, up to the
     *         specified percentage.
     *         </p>
     */
    public Integer getSamplingPercentage() {
        return samplingPercentage;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects.
     * This value determines the percentage of eligible objects that the job
     * analyzes. If the value is less than 100, Amazon Macie randomly selects
     * the objects to analyze, up to the specified percentage.
     * </p>
     *
     * @param samplingPercentage <p>
     *            The sampling depth, as a percentage, to apply when processing
     *            objects. This value determines the percentage of eligible
     *            objects that the job analyzes. If the value is less than 100,
     *            Amazon Macie randomly selects the objects to analyze, up to
     *            the specified percentage.
     *            </p>
     */
    public void setSamplingPercentage(Integer samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, to apply when processing objects.
     * This value determines the percentage of eligible objects that the job
     * analyzes. If the value is less than 100, Amazon Macie randomly selects
     * the objects to analyze, up to the specified percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param samplingPercentage <p>
     *            The sampling depth, as a percentage, to apply when processing
     *            objects. This value determines the percentage of eligible
     *            objects that the job analyzes. If the value is less than 100,
     *            Amazon Macie randomly selects the objects to analyze, up to
     *            the specified percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withSamplingPercentage(Integer samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
        return this;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once,
     * don't specify a value for this property and set the value of the jobType
     * property to ONE_TIME.
     * </p>
     *
     * @return <p>
     *         The recurrence pattern for running the job. To run the job only
     *         once, don't specify a value for this property and set the value
     *         of the jobType property to ONE_TIME.
     *         </p>
     */
    public JobScheduleFrequency getScheduleFrequency() {
        return scheduleFrequency;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once,
     * don't specify a value for this property and set the value of the jobType
     * property to ONE_TIME.
     * </p>
     *
     * @param scheduleFrequency <p>
     *            The recurrence pattern for running the job. To run the job
     *            only once, don't specify a value for this property and set the
     *            value of the jobType property to ONE_TIME.
     *            </p>
     */
    public void setScheduleFrequency(JobScheduleFrequency scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. To run the job only once,
     * don't specify a value for this property and set the value of the jobType
     * property to ONE_TIME.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleFrequency <p>
     *            The recurrence pattern for running the job. To run the job
     *            only once, don't specify a value for this property and set the
     *            value of the jobType property to ONE_TIME.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withScheduleFrequency(
            JobScheduleFrequency scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a required tag
     * key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that specifies the tags to associate
     *         with the job.
     *         </p>
     *         <p>
     *         A job can have a maximum of 50 tags. Each tag consists of a
     *         required tag key and an associated tag value. The maximum length
     *         of a tag key is 128 characters. The maximum length of a tag value
     *         is 256 characters.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a required tag
     * key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that specifies the tags to associate
     *            with the job.
     *            </p>
     *            <p>
     *            A job can have a maximum of 50 tags. Each tag consists of a
     *            required tag key and an associated tag value. The maximum
     *            length of a tag key is 128 characters. The maximum length of a
     *            tag value is 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a required tag
     * key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that specifies the tags to associate
     *            with the job.
     *            </p>
     *            <p>
     *            A job can have a maximum of 50 tags. Each tag consists of a
     *            required tag key and an associated tag value. The maximum
     *            length of a tag key is 128 characters. The maximum length of a
     *            tag value is 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * job.
     * </p>
     * <p>
     * A job can have a maximum of 50 tags. Each tag consists of a required tag
     * key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassificationJobRequest addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateClassificationJobRequest cleartagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getCustomDataIdentifierIds() != null)
            sb.append("customDataIdentifierIds: " + getCustomDataIdentifierIds() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getInitialRun() != null)
            sb.append("initialRun: " + getInitialRun() + ",");
        if (getJobType() != null)
            sb.append("jobType: " + getJobType() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getS3JobDefinition() != null)
            sb.append("s3JobDefinition: " + getS3JobDefinition() + ",");
        if (getSamplingPercentage() != null)
            sb.append("samplingPercentage: " + getSamplingPercentage() + ",");
        if (getScheduleFrequency() != null)
            sb.append("scheduleFrequency: " + getScheduleFrequency() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomDataIdentifierIds() == null) ? 0 : getCustomDataIdentifierIds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInitialRun() == null) ? 0 : getInitialRun().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getS3JobDefinition() == null) ? 0 : getS3JobDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getSamplingPercentage() == null) ? 0 : getSamplingPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleFrequency() == null) ? 0 : getScheduleFrequency().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClassificationJobRequest == false)
            return false;
        CreateClassificationJobRequest other = (CreateClassificationJobRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCustomDataIdentifierIds() == null ^ this.getCustomDataIdentifierIds() == null)
            return false;
        if (other.getCustomDataIdentifierIds() != null
                && other.getCustomDataIdentifierIds().equals(this.getCustomDataIdentifierIds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInitialRun() == null ^ this.getInitialRun() == null)
            return false;
        if (other.getInitialRun() != null
                && other.getInitialRun().equals(this.getInitialRun()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3JobDefinition() == null ^ this.getS3JobDefinition() == null)
            return false;
        if (other.getS3JobDefinition() != null
                && other.getS3JobDefinition().equals(this.getS3JobDefinition()) == false)
            return false;
        if (other.getSamplingPercentage() == null ^ this.getSamplingPercentage() == null)
            return false;
        if (other.getSamplingPercentage() != null
                && other.getSamplingPercentage().equals(this.getSamplingPercentage()) == false)
            return false;
        if (other.getScheduleFrequency() == null ^ this.getScheduleFrequency() == null)
            return false;
        if (other.getScheduleFrequency() != null
                && other.getScheduleFrequency().equals(this.getScheduleFrequency()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
