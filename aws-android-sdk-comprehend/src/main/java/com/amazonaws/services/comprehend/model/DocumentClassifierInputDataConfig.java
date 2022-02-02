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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * The input properties for training a document classifier.
 * </p>
 * <p>
 * For more information on how the input file is formatted, see
 * <a>how-document-classification-training-data</a>.
 * </p>
 */
public class DocumentClassifierInputDataConfig implements Serializable {
    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are
     * provided in the first column, and documents are provided in the second.
     * If you use this value, you must provide the <code>S3Uri</code> parameter
     * in your request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by
     * Amazon SageMaker Ground Truth. This file is in JSON lines format. Each
     * line is a complete JSON object that contains a training document and its
     * associated labels.
     * </p>
     * <p>
     * If you use this value, you must provide the
     * <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses
     * <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     */
    private String dataFormat;

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The Amazon S3 URI for the input data. The Amazon S3 bucket must be in the
     * same AWS Region as the API endpoint that you are calling. The URI can
     * point to a single input file or it can provide the prefix for a
     * collection of input files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String testS3Uri;

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     */
    private String labelDelimiter;

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>AUGMENTED_MANIFEST</code>.
     * </p>
     */
    private java.util.List<AugmentedManifestsListItem> augmentedManifests;

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are
     * provided in the first column, and documents are provided in the second.
     * If you use this value, you must provide the <code>S3Uri</code> parameter
     * in your request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by
     * Amazon SageMaker Ground Truth. This file is in JSON lines format. Each
     * line is a complete JSON object that contains a training document and its
     * associated labels.
     * </p>
     * <p>
     * If you use this value, you must provide the
     * <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses
     * <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @return <p>
     *         The format of your training data:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels
     *         are provided in the first column, and documents are provided in
     *         the second. If you use this value, you must provide the
     *         <code>S3Uri</code> parameter in your request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is
     *         produced by Amazon SageMaker Ground Truth. This file is in JSON
     *         lines format. Each line is a complete JSON object that contains a
     *         training document and its associated labels.
     *         </p>
     *         <p>
     *         If you use this value, you must provide the
     *         <code>AugmentedManifests</code> parameter in your request.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value, Amazon Comprehend uses
     *         <code>COMPREHEND_CSV</code> as the default.
     *         </p>
     * @see DocumentClassifierDataFormat
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are
     * provided in the first column, and documents are provided in the second.
     * If you use this value, you must provide the <code>S3Uri</code> parameter
     * in your request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by
     * Amazon SageMaker Ground Truth. This file is in JSON lines format. Each
     * line is a complete JSON object that contains a training document and its
     * associated labels.
     * </p>
     * <p>
     * If you use this value, you must provide the
     * <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses
     * <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            The format of your training data:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPREHEND_CSV</code>: A two-column CSV file, where
     *            labels are provided in the first column, and documents are
     *            provided in the second. If you use this value, you must
     *            provide the <code>S3Uri</code> parameter in your request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is
     *            produced by Amazon SageMaker Ground Truth. This file is in
     *            JSON lines format. Each line is a complete JSON object that
     *            contains a training document and its associated labels.
     *            </p>
     *            <p>
     *            If you use this value, you must provide the
     *            <code>AugmentedManifests</code> parameter in your request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value, Amazon Comprehend uses
     *            <code>COMPREHEND_CSV</code> as the default.
     *            </p>
     * @see DocumentClassifierDataFormat
     */
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are
     * provided in the first column, and documents are provided in the second.
     * If you use this value, you must provide the <code>S3Uri</code> parameter
     * in your request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by
     * Amazon SageMaker Ground Truth. This file is in JSON lines format. Each
     * line is a complete JSON object that contains a training document and its
     * associated labels.
     * </p>
     * <p>
     * If you use this value, you must provide the
     * <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses
     * <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            The format of your training data:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPREHEND_CSV</code>: A two-column CSV file, where
     *            labels are provided in the first column, and documents are
     *            provided in the second. If you use this value, you must
     *            provide the <code>S3Uri</code> parameter in your request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is
     *            produced by Amazon SageMaker Ground Truth. This file is in
     *            JSON lines format. Each line is a complete JSON object that
     *            contains a training document and its associated labels.
     *            </p>
     *            <p>
     *            If you use this value, you must provide the
     *            <code>AugmentedManifests</code> parameter in your request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value, Amazon Comprehend uses
     *            <code>COMPREHEND_CSV</code> as the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentClassifierDataFormat
     */
    public DocumentClassifierInputDataConfig withDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are
     * provided in the first column, and documents are provided in the second.
     * If you use this value, you must provide the <code>S3Uri</code> parameter
     * in your request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by
     * Amazon SageMaker Ground Truth. This file is in JSON lines format. Each
     * line is a complete JSON object that contains a training document and its
     * associated labels.
     * </p>
     * <p>
     * If you use this value, you must provide the
     * <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses
     * <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            The format of your training data:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPREHEND_CSV</code>: A two-column CSV file, where
     *            labels are provided in the first column, and documents are
     *            provided in the second. If you use this value, you must
     *            provide the <code>S3Uri</code> parameter in your request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is
     *            produced by Amazon SageMaker Ground Truth. This file is in
     *            JSON lines format. Each line is a complete JSON object that
     *            contains a training document and its associated labels.
     *            </p>
     *            <p>
     *            If you use this value, you must provide the
     *            <code>AugmentedManifests</code> parameter in your request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value, Amazon Comprehend uses
     *            <code>COMPREHEND_CSV</code> as the default.
     *            </p>
     * @see DocumentClassifierDataFormat
     */
    public void setDataFormat(DocumentClassifierDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are
     * provided in the first column, and documents are provided in the second.
     * If you use this value, you must provide the <code>S3Uri</code> parameter
     * in your request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by
     * Amazon SageMaker Ground Truth. This file is in JSON lines format. Each
     * line is a complete JSON object that contains a training document and its
     * associated labels.
     * </p>
     * <p>
     * If you use this value, you must provide the
     * <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses
     * <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            The format of your training data:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>COMPREHEND_CSV</code>: A two-column CSV file, where
     *            labels are provided in the first column, and documents are
     *            provided in the second. If you use this value, you must
     *            provide the <code>S3Uri</code> parameter in your request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is
     *            produced by Amazon SageMaker Ground Truth. This file is in
     *            JSON lines format. Each line is a complete JSON object that
     *            contains a training document and its associated labels.
     *            </p>
     *            <p>
     *            If you use this value, you must provide the
     *            <code>AugmentedManifests</code> parameter in your request.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value, Amazon Comprehend uses
     *            <code>COMPREHEND_CSV</code> as the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentClassifierDataFormat
     */
    public DocumentClassifierInputDataConfig withDataFormat(DocumentClassifierDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The Amazon S3 URI for the input data. The S3 bucket must be in
     *         the same region as the API endpoint that you are calling. The URI
     *         can point to a single input file or it can provide the prefix for
     *         a collection of input files.
     *         </p>
     *         <p>
     *         For example, if you use the URI
     *         <code>S3://bucketName/prefix</code>, if the prefix is a single
     *         file, Amazon Comprehend uses that file as input. If more than one
     *         file begins with the prefix, Amazon Comprehend uses all of them
     *         as input.
     *         </p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to
     *         <code>COMPREHEND_CSV</code>.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 URI for the input data. The S3 bucket must be in
     *            the same region as the API endpoint that you are calling. The
     *            URI can point to a single input file or it can provide the
     *            prefix for a collection of input files.
     *            </p>
     *            <p>
     *            For example, if you use the URI
     *            <code>S3://bucketName/prefix</code>, if the prefix is a single
     *            file, Amazon Comprehend uses that file as input. If more than
     *            one file begins with the prefix, Amazon Comprehend uses all of
     *            them as input.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>COMPREHEND_CSV</code>.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 URI for the input data. The S3 bucket must be in
     *            the same region as the API endpoint that you are calling. The
     *            URI can point to a single input file or it can provide the
     *            prefix for a collection of input files.
     *            </p>
     *            <p>
     *            For example, if you use the URI
     *            <code>S3://bucketName/prefix</code>, if the prefix is a single
     *            file, Amazon Comprehend uses that file as input. If more than
     *            one file begins with the prefix, Amazon Comprehend uses all of
     *            them as input.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>COMPREHEND_CSV</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierInputDataConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The Amazon S3 bucket must be in the
     * same AWS Region as the API endpoint that you are calling. The URI can
     * point to a single input file or it can provide the prefix for a
     * collection of input files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The Amazon S3 URI for the input data. The Amazon S3 bucket must
     *         be in the same AWS Region as the API endpoint that you are
     *         calling. The URI can point to a single input file or it can
     *         provide the prefix for a collection of input files.
     *         </p>
     */
    public String getTestS3Uri() {
        return testS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The Amazon S3 bucket must be in the
     * same AWS Region as the API endpoint that you are calling. The URI can
     * point to a single input file or it can provide the prefix for a
     * collection of input files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param testS3Uri <p>
     *            The Amazon S3 URI for the input data. The Amazon S3 bucket
     *            must be in the same AWS Region as the API endpoint that you
     *            are calling. The URI can point to a single input file or it
     *            can provide the prefix for a collection of input files.
     *            </p>
     */
    public void setTestS3Uri(String testS3Uri) {
        this.testS3Uri = testS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The Amazon S3 bucket must be in the
     * same AWS Region as the API endpoint that you are calling. The URI can
     * point to a single input file or it can provide the prefix for a
     * collection of input files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param testS3Uri <p>
     *            The Amazon S3 URI for the input data. The Amazon S3 bucket
     *            must be in the same AWS Region as the API endpoint that you
     *            are calling. The URI can point to a single input file or it
     *            can provide the prefix for a collection of input files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierInputDataConfig withTestS3Uri(String testS3Uri) {
        this.testS3Uri = testS3Uri;
        return this;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     *
     * @return <p>
     *         Indicates the delimiter used to separate each label for training
     *         a multi-label classifier. The default delimiter between labels is
     *         a pipe (|). You can use a different character as a delimiter (if
     *         it's an allowed character) by specifying it under Delimiter for
     *         labels. If the training documents use a delimiter other than the
     *         default or the delimiter you specify, the labels on that line
     *         will be combined to make a single unique label, such as
     *         LABELLABELLABEL.
     *         </p>
     */
    public String getLabelDelimiter() {
        return labelDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     *
     * @param labelDelimiter <p>
     *            Indicates the delimiter used to separate each label for
     *            training a multi-label classifier. The default delimiter
     *            between labels is a pipe (|). You can use a different
     *            character as a delimiter (if it's an allowed character) by
     *            specifying it under Delimiter for labels. If the training
     *            documents use a delimiter other than the default or the
     *            delimiter you specify, the labels on that line will be
     *            combined to make a single unique label, such as
     *            LABELLABELLABEL.
     *            </p>
     */
    public void setLabelDelimiter(String labelDelimiter) {
        this.labelDelimiter = labelDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     *
     * @param labelDelimiter <p>
     *            Indicates the delimiter used to separate each label for
     *            training a multi-label classifier. The default delimiter
     *            between labels is a pipe (|). You can use a different
     *            character as a delimiter (if it's an allowed character) by
     *            specifying it under Delimiter for labels. If the training
     *            documents use a delimiter other than the default or the
     *            delimiter you specify, the labels on that line will be
     *            combined to make a single unique label, such as
     *            LABELLABELLABEL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierInputDataConfig withLabelDelimiter(String labelDelimiter) {
        this.labelDelimiter = labelDelimiter;
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>AUGMENTED_MANIFEST</code>.
     * </p>
     *
     * @return <p>
     *         A list of augmented manifest files that provide training data for
     *         your custom model. An augmented manifest file is a labeled
     *         dataset that is produced by Amazon SageMaker Ground Truth.
     *         </p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to
     *         <code>AUGMENTED_MANIFEST</code>.
     *         </p>
     */
    public java.util.List<AugmentedManifestsListItem> getAugmentedManifests() {
        return augmentedManifests;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>AUGMENTED_MANIFEST</code>.
     * </p>
     *
     * @param augmentedManifests <p>
     *            A list of augmented manifest files that provide training data
     *            for your custom model. An augmented manifest file is a labeled
     *            dataset that is produced by Amazon SageMaker Ground Truth.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>AUGMENTED_MANIFEST</code>.
     *            </p>
     */
    public void setAugmentedManifests(
            java.util.Collection<AugmentedManifestsListItem> augmentedManifests) {
        if (augmentedManifests == null) {
            this.augmentedManifests = null;
            return;
        }

        this.augmentedManifests = new java.util.ArrayList<AugmentedManifestsListItem>(
                augmentedManifests);
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param augmentedManifests <p>
     *            A list of augmented manifest files that provide training data
     *            for your custom model. An augmented manifest file is a labeled
     *            dataset that is produced by Amazon SageMaker Ground Truth.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>AUGMENTED_MANIFEST</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierInputDataConfig withAugmentedManifests(
            AugmentedManifestsListItem... augmentedManifests) {
        if (getAugmentedManifests() == null) {
            this.augmentedManifests = new java.util.ArrayList<AugmentedManifestsListItem>(
                    augmentedManifests.length);
        }
        for (AugmentedManifestsListItem value : augmentedManifests) {
            this.augmentedManifests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param augmentedManifests <p>
     *            A list of augmented manifest files that provide training data
     *            for your custom model. An augmented manifest file is a labeled
     *            dataset that is produced by Amazon SageMaker Ground Truth.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>AUGMENTED_MANIFEST</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierInputDataConfig withAugmentedManifests(
            java.util.Collection<AugmentedManifestsListItem> augmentedManifests) {
        setAugmentedManifests(augmentedManifests);
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
        if (getDataFormat() != null)
            sb.append("DataFormat: " + getDataFormat() + ",");
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getTestS3Uri() != null)
            sb.append("TestS3Uri: " + getTestS3Uri() + ",");
        if (getLabelDelimiter() != null)
            sb.append("LabelDelimiter: " + getLabelDelimiter() + ",");
        if (getAugmentedManifests() != null)
            sb.append("AugmentedManifests: " + getAugmentedManifests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getTestS3Uri() == null) ? 0 : getTestS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getLabelDelimiter() == null) ? 0 : getLabelDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getAugmentedManifests() == null) ? 0 : getAugmentedManifests().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassifierInputDataConfig == false)
            return false;
        DocumentClassifierInputDataConfig other = (DocumentClassifierInputDataConfig) obj;

        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null
                && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getTestS3Uri() == null ^ this.getTestS3Uri() == null)
            return false;
        if (other.getTestS3Uri() != null
                && other.getTestS3Uri().equals(this.getTestS3Uri()) == false)
            return false;
        if (other.getLabelDelimiter() == null ^ this.getLabelDelimiter() == null)
            return false;
        if (other.getLabelDelimiter() != null
                && other.getLabelDelimiter().equals(this.getLabelDelimiter()) == false)
            return false;
        if (other.getAugmentedManifests() == null ^ this.getAugmentedManifests() == null)
            return false;
        if (other.getAugmentedManifests() != null
                && other.getAugmentedManifests().equals(this.getAugmentedManifests()) == false)
            return false;
        return true;
    }
}
