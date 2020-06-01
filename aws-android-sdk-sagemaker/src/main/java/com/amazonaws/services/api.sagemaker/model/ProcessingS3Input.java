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
 * Information about where and how you want to obtain the inputs for an
 * processing job.
 * </p>
 */
public class ProcessingS3Input implements Serializable {
    /**
     * <p>
     * The URI for the Amazon S3 storage where you want Amazon SageMaker to
     * download the artifacts needed to run a processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The local path to the Amazon S3 bucket where you want Amazon SageMaker to
     * download the inputs to run a processing job. <code>LocalPath</code> is an
     * absolute path to the input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code>
     * for the data type. If you choose <code>S3Prefix</code>,
     * <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses
     * all objects with the specified key name prefix for the processing job. If
     * you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     * object that is a manifest file containing a list of object keys that you
     * want Amazon SageMaker to use for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     */
    private String s3DataType;

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In
     * <code>File</code> mode, Amazon SageMaker copies the data from the input
     * source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used
     * input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input
     * data from the source directly to your algorithm without using the EBS
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     */
    private String s3InputMode;

    /**
     * <p>
     * Whether the data stored in Amazon S3 is <code>FullyReplicated</code> or
     * <code>ShardedByS3Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     */
    private String s3DataDistributionType;

    /**
     * <p>
     * Whether to use <code>Gzip</code> compression for Amazon S3 storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     */
    private String s3CompressionType;

    /**
     * <p>
     * The URI for the Amazon S3 storage where you want Amazon SageMaker to
     * download the artifacts needed to run a processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The URI for the Amazon S3 storage where you want Amazon SageMaker
     *         to download the artifacts needed to run a processing job.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The URI for the Amazon S3 storage where you want Amazon SageMaker to
     * download the artifacts needed to run a processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            The URI for the Amazon S3 storage where you want Amazon
     *            SageMaker to download the artifacts needed to run a processing
     *            job.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI for the Amazon S3 storage where you want Amazon SageMaker to
     * download the artifacts needed to run a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            The URI for the Amazon S3 storage where you want Amazon
     *            SageMaker to download the artifacts needed to run a processing
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingS3Input withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * The local path to the Amazon S3 bucket where you want Amazon SageMaker to
     * download the inputs to run a processing job. <code>LocalPath</code> is an
     * absolute path to the input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The local path to the Amazon S3 bucket where you want Amazon
     *         SageMaker to download the inputs to run a processing job.
     *         <code>LocalPath</code> is an absolute path to the input data.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * The local path to the Amazon S3 bucket where you want Amazon SageMaker to
     * download the inputs to run a processing job. <code>LocalPath</code> is an
     * absolute path to the input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            The local path to the Amazon S3 bucket where you want Amazon
     *            SageMaker to download the inputs to run a processing job.
     *            <code>LocalPath</code> is an absolute path to the input data.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * The local path to the Amazon S3 bucket where you want Amazon SageMaker to
     * download the inputs to run a processing job. <code>LocalPath</code> is an
     * absolute path to the input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            The local path to the Amazon S3 bucket where you want Amazon
     *            SageMaker to download the inputs to run a processing job.
     *            <code>LocalPath</code> is an absolute path to the input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingS3Input withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code>
     * for the data type. If you choose <code>S3Prefix</code>,
     * <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses
     * all objects with the specified key name prefix for the processing job. If
     * you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     * object that is a manifest file containing a list of object keys that you
     * want Amazon SageMaker to use for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @return <p>
     *         Whether you use an <code>S3Prefix</code> or a
     *         <code>ManifestFile</code> for the data type. If you choose
     *         <code>S3Prefix</code>, <code>S3Uri</code> identifies a key name
     *         prefix. Amazon SageMaker uses all objects with the specified key
     *         name prefix for the processing job. If you choose
     *         <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     *         object that is a manifest file containing a list of object keys
     *         that you want Amazon SageMaker to use for the processing job.
     *         </p>
     * @see ProcessingS3DataType
     */
    public String getS3DataType() {
        return s3DataType;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code>
     * for the data type. If you choose <code>S3Prefix</code>,
     * <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses
     * all objects with the specified key name prefix for the processing job. If
     * you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     * object that is a manifest file containing a list of object keys that you
     * want Amazon SageMaker to use for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            Whether you use an <code>S3Prefix</code> or a
     *            <code>ManifestFile</code> for the data type. If you choose
     *            <code>S3Prefix</code>, <code>S3Uri</code> identifies a key
     *            name prefix. Amazon SageMaker uses all objects with the
     *            specified key name prefix for the processing job. If you
     *            choose <code>ManifestFile</code>, <code>S3Uri</code>
     *            identifies an object that is a manifest file containing a list
     *            of object keys that you want Amazon SageMaker to use for the
     *            processing job.
     *            </p>
     * @see ProcessingS3DataType
     */
    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code>
     * for the data type. If you choose <code>S3Prefix</code>,
     * <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses
     * all objects with the specified key name prefix for the processing job. If
     * you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     * object that is a manifest file containing a list of object keys that you
     * want Amazon SageMaker to use for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            Whether you use an <code>S3Prefix</code> or a
     *            <code>ManifestFile</code> for the data type. If you choose
     *            <code>S3Prefix</code>, <code>S3Uri</code> identifies a key
     *            name prefix. Amazon SageMaker uses all objects with the
     *            specified key name prefix for the processing job. If you
     *            choose <code>ManifestFile</code>, <code>S3Uri</code>
     *            identifies an object that is a manifest file containing a list
     *            of object keys that you want Amazon SageMaker to use for the
     *            processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3DataType
     */
    public ProcessingS3Input withS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
        return this;
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code>
     * for the data type. If you choose <code>S3Prefix</code>,
     * <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses
     * all objects with the specified key name prefix for the processing job. If
     * you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     * object that is a manifest file containing a list of object keys that you
     * want Amazon SageMaker to use for the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            Whether you use an <code>S3Prefix</code> or a
     *            <code>ManifestFile</code> for the data type. If you choose
     *            <code>S3Prefix</code>, <code>S3Uri</code> identifies a key
     *            name prefix. Amazon SageMaker uses all objects with the
     *            specified key name prefix for the processing job. If you
     *            choose <code>ManifestFile</code>, <code>S3Uri</code>
     *            identifies an object that is a manifest file containing a list
     *            of object keys that you want Amazon SageMaker to use for the
     *            processing job.
     *            </p>
     * @see ProcessingS3DataType
     */
    public void setS3DataType(ProcessingS3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
    }

    /**
     * <p>
     * Whether you use an <code>S3Prefix</code> or a <code>ManifestFile</code>
     * for the data type. If you choose <code>S3Prefix</code>,
     * <code>S3Uri</code> identifies a key name prefix. Amazon SageMaker uses
     * all objects with the specified key name prefix for the processing job. If
     * you choose <code>ManifestFile</code>, <code>S3Uri</code> identifies an
     * object that is a manifest file containing a list of object keys that you
     * want Amazon SageMaker to use for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            Whether you use an <code>S3Prefix</code> or a
     *            <code>ManifestFile</code> for the data type. If you choose
     *            <code>S3Prefix</code>, <code>S3Uri</code> identifies a key
     *            name prefix. Amazon SageMaker uses all objects with the
     *            specified key name prefix for the processing job. If you
     *            choose <code>ManifestFile</code>, <code>S3Uri</code>
     *            identifies an object that is a manifest file containing a list
     *            of object keys that you want Amazon SageMaker to use for the
     *            processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3DataType
     */
    public ProcessingS3Input withS3DataType(ProcessingS3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In
     * <code>File</code> mode, Amazon SageMaker copies the data from the input
     * source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used
     * input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input
     * data from the source directly to your algorithm without using the EBS
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @return <p>
     *         Whether to use <code>File</code> or <code>Pipe</code> input mode.
     *         In <code>File</code> mode, Amazon SageMaker copies the data from
     *         the input source onto the local Amazon Elastic Block Store
     *         (Amazon EBS) volumes before starting your training algorithm.
     *         This is the most commonly used input mode. In <code>Pipe</code>
     *         mode, Amazon SageMaker streams input data from the source
     *         directly to your algorithm without using the EBS volume.
     *         </p>
     * @see ProcessingS3InputMode
     */
    public String getS3InputMode() {
        return s3InputMode;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In
     * <code>File</code> mode, Amazon SageMaker copies the data from the input
     * source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used
     * input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input
     * data from the source directly to your algorithm without using the EBS
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether to use <code>File</code> or <code>Pipe</code> input
     *            mode. In <code>File</code> mode, Amazon SageMaker copies the
     *            data from the input source onto the local Amazon Elastic Block
     *            Store (Amazon EBS) volumes before starting your training
     *            algorithm. This is the most commonly used input mode. In
     *            <code>Pipe</code> mode, Amazon SageMaker streams input data
     *            from the source directly to your algorithm without using the
     *            EBS volume.
     *            </p>
     * @see ProcessingS3InputMode
     */
    public void setS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In
     * <code>File</code> mode, Amazon SageMaker copies the data from the input
     * source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used
     * input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input
     * data from the source directly to your algorithm without using the EBS
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether to use <code>File</code> or <code>Pipe</code> input
     *            mode. In <code>File</code> mode, Amazon SageMaker copies the
     *            data from the input source onto the local Amazon Elastic Block
     *            Store (Amazon EBS) volumes before starting your training
     *            algorithm. This is the most commonly used input mode. In
     *            <code>Pipe</code> mode, Amazon SageMaker streams input data
     *            from the source directly to your algorithm without using the
     *            EBS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3InputMode
     */
    public ProcessingS3Input withS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
        return this;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In
     * <code>File</code> mode, Amazon SageMaker copies the data from the input
     * source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used
     * input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input
     * data from the source directly to your algorithm without using the EBS
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether to use <code>File</code> or <code>Pipe</code> input
     *            mode. In <code>File</code> mode, Amazon SageMaker copies the
     *            data from the input source onto the local Amazon Elastic Block
     *            Store (Amazon EBS) volumes before starting your training
     *            algorithm. This is the most commonly used input mode. In
     *            <code>Pipe</code> mode, Amazon SageMaker streams input data
     *            from the source directly to your algorithm without using the
     *            EBS volume.
     *            </p>
     * @see ProcessingS3InputMode
     */
    public void setS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In
     * <code>File</code> mode, Amazon SageMaker copies the data from the input
     * source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used
     * input mode. In <code>Pipe</code> mode, Amazon SageMaker streams input
     * data from the source directly to your algorithm without using the EBS
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param s3InputMode <p>
     *            Whether to use <code>File</code> or <code>Pipe</code> input
     *            mode. In <code>File</code> mode, Amazon SageMaker copies the
     *            data from the input source onto the local Amazon Elastic Block
     *            Store (Amazon EBS) volumes before starting your training
     *            algorithm. This is the most commonly used input mode. In
     *            <code>Pipe</code> mode, Amazon SageMaker streams input data
     *            from the source directly to your algorithm without using the
     *            EBS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3InputMode
     */
    public ProcessingS3Input withS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether the data stored in Amazon S3 is <code>FullyReplicated</code> or
     * <code>ShardedByS3Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @return <p>
     *         Whether the data stored in Amazon S3 is
     *         <code>FullyReplicated</code> or <code>ShardedByS3Key</code>.
     *         </p>
     * @see ProcessingS3DataDistributionType
     */
    public String getS3DataDistributionType() {
        return s3DataDistributionType;
    }

    /**
     * <p>
     * Whether the data stored in Amazon S3 is <code>FullyReplicated</code> or
     * <code>ShardedByS3Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether the data stored in Amazon S3 is
     *            <code>FullyReplicated</code> or <code>ShardedByS3Key</code>.
     *            </p>
     * @see ProcessingS3DataDistributionType
     */
    public void setS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
    }

    /**
     * <p>
     * Whether the data stored in Amazon S3 is <code>FullyReplicated</code> or
     * <code>ShardedByS3Key</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether the data stored in Amazon S3 is
     *            <code>FullyReplicated</code> or <code>ShardedByS3Key</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3DataDistributionType
     */
    public ProcessingS3Input withS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
        return this;
    }

    /**
     * <p>
     * Whether the data stored in Amazon S3 is <code>FullyReplicated</code> or
     * <code>ShardedByS3Key</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether the data stored in Amazon S3 is
     *            <code>FullyReplicated</code> or <code>ShardedByS3Key</code>.
     *            </p>
     * @see ProcessingS3DataDistributionType
     */
    public void setS3DataDistributionType(ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
    }

    /**
     * <p>
     * Whether the data stored in Amazon S3 is <code>FullyReplicated</code> or
     * <code>ShardedByS3Key</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FullyReplicated, ShardedByS3Key
     *
     * @param s3DataDistributionType <p>
     *            Whether the data stored in Amazon S3 is
     *            <code>FullyReplicated</code> or <code>ShardedByS3Key</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3DataDistributionType
     */
    public ProcessingS3Input withS3DataDistributionType(
            ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to use <code>Gzip</code> compression for Amazon S3 storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @return <p>
     *         Whether to use <code>Gzip</code> compression for Amazon S3
     *         storage.
     *         </p>
     * @see ProcessingS3CompressionType
     */
    public String getS3CompressionType() {
        return s3CompressionType;
    }

    /**
     * <p>
     * Whether to use <code>Gzip</code> compression for Amazon S3 storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param s3CompressionType <p>
     *            Whether to use <code>Gzip</code> compression for Amazon S3
     *            storage.
     *            </p>
     * @see ProcessingS3CompressionType
     */
    public void setS3CompressionType(String s3CompressionType) {
        this.s3CompressionType = s3CompressionType;
    }

    /**
     * <p>
     * Whether to use <code>Gzip</code> compression for Amazon S3 storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param s3CompressionType <p>
     *            Whether to use <code>Gzip</code> compression for Amazon S3
     *            storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3CompressionType
     */
    public ProcessingS3Input withS3CompressionType(String s3CompressionType) {
        this.s3CompressionType = s3CompressionType;
        return this;
    }

    /**
     * <p>
     * Whether to use <code>Gzip</code> compression for Amazon S3 storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param s3CompressionType <p>
     *            Whether to use <code>Gzip</code> compression for Amazon S3
     *            storage.
     *            </p>
     * @see ProcessingS3CompressionType
     */
    public void setS3CompressionType(ProcessingS3CompressionType s3CompressionType) {
        this.s3CompressionType = s3CompressionType.toString();
    }

    /**
     * <p>
     * Whether to use <code>Gzip</code> compression for Amazon S3 storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param s3CompressionType <p>
     *            Whether to use <code>Gzip</code> compression for Amazon S3
     *            storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingS3CompressionType
     */
    public ProcessingS3Input withS3CompressionType(ProcessingS3CompressionType s3CompressionType) {
        this.s3CompressionType = s3CompressionType.toString();
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getLocalPath() != null)
            sb.append("LocalPath: " + getLocalPath() + ",");
        if (getS3DataType() != null)
            sb.append("S3DataType: " + getS3DataType() + ",");
        if (getS3InputMode() != null)
            sb.append("S3InputMode: " + getS3InputMode() + ",");
        if (getS3DataDistributionType() != null)
            sb.append("S3DataDistributionType: " + getS3DataDistributionType() + ",");
        if (getS3CompressionType() != null)
            sb.append("S3CompressionType: " + getS3CompressionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode
                + ((getS3InputMode() == null) ? 0 : getS3InputMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3DataDistributionType() == null) ? 0 : getS3DataDistributionType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getS3CompressionType() == null) ? 0 : getS3CompressionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingS3Input == false)
            return false;
        ProcessingS3Input other = (ProcessingS3Input) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null
                && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getS3InputMode() == null ^ this.getS3InputMode() == null)
            return false;
        if (other.getS3InputMode() != null
                && other.getS3InputMode().equals(this.getS3InputMode()) == false)
            return false;
        if (other.getS3DataDistributionType() == null ^ this.getS3DataDistributionType() == null)
            return false;
        if (other.getS3DataDistributionType() != null
                && other.getS3DataDistributionType().equals(this.getS3DataDistributionType()) == false)
            return false;
        if (other.getS3CompressionType() == null ^ this.getS3CompressionType() == null)
            return false;
        if (other.getS3CompressionType() != null
                && other.getS3CompressionType().equals(this.getS3CompressionType()) == false)
            return false;
        return true;
    }
}
