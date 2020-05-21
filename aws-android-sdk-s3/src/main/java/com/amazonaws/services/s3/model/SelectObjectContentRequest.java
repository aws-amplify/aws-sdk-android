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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation filters the contents of an Amazon S3 object based on a simple
 * structured query language (SQL) statement. In the request, along with the SQL
 * expression, you must also specify a data serialization format (JSON, CSV, or
 * Apache Parquet) of the object. Amazon S3 uses this format to parse object
 * data into records, and returns only records that match the specified SQL
 * expression. You must also specify the data serialization format for the
 * response.
 * </p>
 * <p>
 * For more information about Amazon S3 Select, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/selecting-content-from-objects.html"
 * >Selecting Content from Objects</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * For more information about using SQL with Amazon S3 Select, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html"
 * > SQL Reference for Amazon S3 Select and S3 Glacier Select</a> in the
 * <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 * <p/>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * You must have <code>s3:GetObject</code> permission for this operation. Amazon
 * S3 Select does not support anonymous access. For more information about
 * permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html"
 * >Specifying Permissions in a Policy</a> in the <i>Amazon Simple Storage
 * Service Developer Guide</i>.
 * </p>
 * <p/>
 * <p>
 * <i>Object Data Formats</i>
 * </p>
 * <p>
 * You can use Amazon S3 Select to query objects that have the following format
 * properties:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>CSV, JSON, and Parquet</i> - Objects must be in CSV, JSON, or Parquet
 * format.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>UTF-8</i> - UTF-8 is the only encoding type Amazon S3 Select supports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>GZIP or BZIP2</i> - CSV and JSON files can be compressed using GZIP or
 * BZIP2. GZIP and BZIP2 are the only compression formats that Amazon S3 Select
 * supports for CSV and JSON files. Amazon S3 Select supports columnar
 * compression for Parquet using GZIP or Snappy. Amazon S3 Select does not
 * support whole-object compression for Parquet objects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Server-side encryption</i> - Amazon S3 Select supports querying objects
 * that are protected with server-side encryption.
 * </p>
 * <p>
 * For objects that are encrypted with customer-provided encryption keys
 * (SSE-C), you must use HTTPS, and you must use the headers that are documented
 * in the <a>GetObject</a>. For more information about SSE-C, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
 * >Server-Side Encryption (Using Customer-Provided Encryption Keys)</a> in the
 * <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * For objects that are encrypted with Amazon S3 managed encryption keys
 * (SSE-S3) and customer master keys (CMKs) stored in AWS Key Management Service
 * (SSE-KMS), server-side encryption is handled transparently, so you don't need
 * to specify anything. For more information about server-side encryption,
 * including SSE-S3 and SSE-KMS, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html"
 * >Protecting Data Using Server-Side Encryption</a> in the <i>Amazon Simple
 * Storage Service Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Working with the Response Body</b>
 * </p>
 * <p>
 * Given the response size is unknown, Amazon S3 Select streams the response as
 * a series of messages and includes a <code>Transfer-Encoding</code> header
 * with <code>chunked</code> as its value in the response. For more information,
 * see <a>RESTSelectObjectAppendix</a> .
 * </p>
 * <p/>
 * <p>
 * <b>GetObject Support</b>
 * </p>
 * <p>
 * The <code>SelectObjectContent</code> operation does not support the following
 * <code>GetObject</code> functionality. For more information, see
 * <a>GetObject</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Range</code>: Although you can specify a scan range for an Amazon S3
 * Select request (see <a>SelectObjectContentRequest$ScanRange</a> in the
 * request parameters), you cannot specify the range of bytes of an object to
 * return.
 * </p>
 * </li>
 * <li>
 * <p>
 * GLACIER, DEEP_ARCHIVE and REDUCED_REDUNDANCY storage classes: You cannot
 * specify the GLACIER, DEEP_ARCHIVE, or <code>REDUCED_REDUNDANCY</code> storage
 * classes. For more information, about storage classes see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#storage-class-intro"
 * >Storage Classes</a> in the <i>Amazon Simple Storage Service Developer
 * Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p/>
 * <p>
 * <b>Special Errors</b>
 * </p>
 * <p>
 * For a list of special errors for this operation, see
 * <a>SelectObjectContentErrorCodeList</a>
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * </ul>
 */
public class SelectObjectContentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The S3 bucket.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * The SSE Algorithm used to encrypt the object. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     */
    private String sSECustomerAlgorithm;

    /**
     * <p>
     * The SSE Customer Key. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     */
    private String sSECustomerKey;

    /**
     * <p>
     * The SSE Customer Key MD5. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     */
    private String sSECustomerKeyMD5;

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     */
    private String expressionType;

    /**
     * <p>
     * Specifies if periodic request progress information should be enabled.
     * </p>
     */
    private RequestProgress requestProgress;

    /**
     * <p>
     * Describes the format of the data in the object that is being queried.
     * </p>
     */
    private InputSerialization inputSerialization;

    /**
     * <p>
     * Describes the format of the data that you want Amazon S3 to return in
     * response.
     * </p>
     */
    private OutputSerialization outputSerialization;

    /**
     * <p>
     * Specifies the byte range of the object to get the records from. A record
     * is processed when its first byte is contained by the range. This
     * parameter is optional, but when specified, it must not be empty. See RFC
     * 2616, Section 14.35.1 about how to specify the start and end of the
     * range.
     * </p>
     * <p>
     * <code>ScanRange</code>may be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting between the bytes 50 and 100
     * (inclusive, counting from zero)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting after the byte 50
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records within the last 50 bytes of the file.
     * </p>
     * </li>
     * </ul>
     */
    private ScanRange scanRange;

    /**
     * <p>
     * The S3 bucket.
     * </p>
     *
     * @return <p>
     *         The S3 bucket.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The S3 bucket.
     * </p>
     *
     * @param bucket <p>
     *            The S3 bucket.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The object key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The SSE Algorithm used to encrypt the object. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     *
     * @return <p>
     *         The SSE Algorithm used to encrypt the object. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *         >Server-Side Encryption (Using Customer-Provided Encryption
     *         Keys</a>.
     *         </p>
     */
    public String getSSECustomerAlgorithm() {
        return sSECustomerAlgorithm;
    }

    /**
     * <p>
     * The SSE Algorithm used to encrypt the object. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     *
     * @param sSECustomerAlgorithm <p>
     *            The SSE Algorithm used to encrypt the object. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *            >Server-Side Encryption (Using Customer-Provided Encryption
     *            Keys</a>.
     *            </p>
     */
    public void setSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
    }

    /**
     * <p>
     * The SSE Algorithm used to encrypt the object. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerAlgorithm <p>
     *            The SSE Algorithm used to encrypt the object. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *            >Server-Side Encryption (Using Customer-Provided Encryption
     *            Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withSSECustomerAlgorithm(String sSECustomerAlgorithm) {
        this.sSECustomerAlgorithm = sSECustomerAlgorithm;
        return this;
    }

    /**
     * <p>
     * The SSE Customer Key. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     *
     * @return <p>
     *         The SSE Customer Key. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *         >Server-Side Encryption (Using Customer-Provided Encryption
     *         Keys</a>.
     *         </p>
     */
    public String getSSECustomerKey() {
        return sSECustomerKey;
    }

    /**
     * <p>
     * The SSE Customer Key. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     *
     * @param sSECustomerKey <p>
     *            The SSE Customer Key. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *            >Server-Side Encryption (Using Customer-Provided Encryption
     *            Keys</a>.
     *            </p>
     */
    public void setSSECustomerKey(String sSECustomerKey) {
        this.sSECustomerKey = sSECustomerKey;
    }

    /**
     * <p>
     * The SSE Customer Key. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKey <p>
     *            The SSE Customer Key. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *            >Server-Side Encryption (Using Customer-Provided Encryption
     *            Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withSSECustomerKey(String sSECustomerKey) {
        this.sSECustomerKey = sSECustomerKey;
        return this;
    }

    /**
     * <p>
     * The SSE Customer Key MD5. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     *
     * @return <p>
     *         The SSE Customer Key MD5. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *         >Server-Side Encryption (Using Customer-Provided Encryption
     *         Keys</a>.
     *         </p>
     */
    public String getSSECustomerKeyMD5() {
        return sSECustomerKeyMD5;
    }

    /**
     * <p>
     * The SSE Customer Key MD5. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     *
     * @param sSECustomerKeyMD5 <p>
     *            The SSE Customer Key MD5. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *            >Server-Side Encryption (Using Customer-Provided Encryption
     *            Keys</a>.
     *            </p>
     */
    public void setSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
    }

    /**
     * <p>
     * The SSE Customer Key MD5. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     * >Server-Side Encryption (Using Customer-Provided Encryption Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sSECustomerKeyMD5 <p>
     *            The SSE Customer Key MD5. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
     *            >Server-Side Encryption (Using Customer-Provided Encryption
     *            Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withSSECustomerKeyMD5(String sSECustomerKeyMD5) {
        this.sSECustomerKeyMD5 = sSECustomerKeyMD5;
        return this;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     *
     * @return <p>
     *         The expression that is used to query the object.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     *
     * @param expression <p>
     *            The expression that is used to query the object.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expression <p>
     *            The expression that is used to query the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @return <p>
     *         The type of the provided expression (for example, SQL).
     *         </p>
     * @see ExpressionType
     */
    public String getExpressionType() {
        return expressionType;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @see ExpressionType
     */
    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpressionType
     */
    public SelectObjectContentRequest withExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @see ExpressionType
     */
    public void setExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpressionType
     */
    public SelectObjectContentRequest withExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies if periodic request progress information should be enabled.
     * </p>
     *
     * @return <p>
     *         Specifies if periodic request progress information should be
     *         enabled.
     *         </p>
     */
    public RequestProgress getRequestProgress() {
        return requestProgress;
    }

    /**
     * <p>
     * Specifies if periodic request progress information should be enabled.
     * </p>
     *
     * @param requestProgress <p>
     *            Specifies if periodic request progress information should be
     *            enabled.
     *            </p>
     */
    public void setRequestProgress(RequestProgress requestProgress) {
        this.requestProgress = requestProgress;
    }

    /**
     * <p>
     * Specifies if periodic request progress information should be enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestProgress <p>
     *            Specifies if periodic request progress information should be
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withRequestProgress(RequestProgress requestProgress) {
        this.requestProgress = requestProgress;
        return this;
    }

    /**
     * <p>
     * Describes the format of the data in the object that is being queried.
     * </p>
     *
     * @return <p>
     *         Describes the format of the data in the object that is being
     *         queried.
     *         </p>
     */
    public InputSerialization getInputSerialization() {
        return inputSerialization;
    }

    /**
     * <p>
     * Describes the format of the data in the object that is being queried.
     * </p>
     *
     * @param inputSerialization <p>
     *            Describes the format of the data in the object that is being
     *            queried.
     *            </p>
     */
    public void setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
    }

    /**
     * <p>
     * Describes the format of the data in the object that is being queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSerialization <p>
     *            Describes the format of the data in the object that is being
     *            queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
        return this;
    }

    /**
     * <p>
     * Describes the format of the data that you want Amazon S3 to return in
     * response.
     * </p>
     *
     * @return <p>
     *         Describes the format of the data that you want Amazon S3 to
     *         return in response.
     *         </p>
     */
    public OutputSerialization getOutputSerialization() {
        return outputSerialization;
    }

    /**
     * <p>
     * Describes the format of the data that you want Amazon S3 to return in
     * response.
     * </p>
     *
     * @param outputSerialization <p>
     *            Describes the format of the data that you want Amazon S3 to
     *            return in response.
     *            </p>
     */
    public void setOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
    }

    /**
     * <p>
     * Describes the format of the data that you want Amazon S3 to return in
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputSerialization <p>
     *            Describes the format of the data that you want Amazon S3 to
     *            return in response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withOutputSerialization(
            OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
        return this;
    }

    /**
     * <p>
     * Specifies the byte range of the object to get the records from. A record
     * is processed when its first byte is contained by the range. This
     * parameter is optional, but when specified, it must not be empty. See RFC
     * 2616, Section 14.35.1 about how to specify the start and end of the
     * range.
     * </p>
     * <p>
     * <code>ScanRange</code>may be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting between the bytes 50 and 100
     * (inclusive, counting from zero)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting after the byte 50
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records within the last 50 bytes of the file.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the byte range of the object to get the records from. A
     *         record is processed when its first byte is contained by the
     *         range. This parameter is optional, but when specified, it must
     *         not be empty. See RFC 2616, Section 14.35.1 about how to specify
     *         the start and end of the range.
     *         </p>
     *         <p>
     *         <code>ScanRange</code>may be used in the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     *         - process only the records starting between the bytes 50 and 100
     *         (inclusive, counting from zero)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *         - process only the records starting after the byte 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     *         - process only the records within the last 50 bytes of the file.
     *         </p>
     *         </li>
     *         </ul>
     */
    public ScanRange getScanRange() {
        return scanRange;
    }

    /**
     * <p>
     * Specifies the byte range of the object to get the records from. A record
     * is processed when its first byte is contained by the range. This
     * parameter is optional, but when specified, it must not be empty. See RFC
     * 2616, Section 14.35.1 about how to specify the start and end of the
     * range.
     * </p>
     * <p>
     * <code>ScanRange</code>may be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting between the bytes 50 and 100
     * (inclusive, counting from zero)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting after the byte 50
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records within the last 50 bytes of the file.
     * </p>
     * </li>
     * </ul>
     *
     * @param scanRange <p>
     *            Specifies the byte range of the object to get the records
     *            from. A record is processed when its first byte is contained
     *            by the range. This parameter is optional, but when specified,
     *            it must not be empty. See RFC 2616, Section 14.35.1 about how
     *            to specify the start and end of the range.
     *            </p>
     *            <p>
     *            <code>ScanRange</code>may be used in the following ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     *            - process only the records starting between the bytes 50 and
     *            100 (inclusive, counting from zero)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *            - process only the records starting after the byte 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     *            - process only the records within the last 50 bytes of the
     *            file.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setScanRange(ScanRange scanRange) {
        this.scanRange = scanRange;
    }

    /**
     * <p>
     * Specifies the byte range of the object to get the records from. A record
     * is processed when its first byte is contained by the range. This
     * parameter is optional, but when specified, it must not be empty. See RFC
     * 2616, Section 14.35.1 about how to specify the start and end of the
     * range.
     * </p>
     * <p>
     * <code>ScanRange</code>may be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting between the bytes 50 and 100
     * (inclusive, counting from zero)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * - process only the records starting after the byte 50
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * - process only the records within the last 50 bytes of the file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scanRange <p>
     *            Specifies the byte range of the object to get the records
     *            from. A record is processed when its first byte is contained
     *            by the range. This parameter is optional, but when specified,
     *            it must not be empty. See RFC 2616, Section 14.35.1 about how
     *            to specify the start and end of the range.
     *            </p>
     *            <p>
     *            <code>ScanRange</code>may be used in the following ways:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
     *            - process only the records starting between the bytes 50 and
     *            100 (inclusive, counting from zero)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *            - process only the records starting after the byte 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     *            - process only the records within the last 50 bytes of the
     *            file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentRequest withScanRange(ScanRange scanRange) {
        this.scanRange = scanRange;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getSSECustomerAlgorithm() != null)
            sb.append("SSECustomerAlgorithm: " + getSSECustomerAlgorithm() + ",");
        if (getSSECustomerKey() != null)
            sb.append("SSECustomerKey: " + getSSECustomerKey() + ",");
        if (getSSECustomerKeyMD5() != null)
            sb.append("SSECustomerKeyMD5: " + getSSECustomerKeyMD5() + ",");
        if (getExpression() != null)
            sb.append("Expression: " + getExpression() + ",");
        if (getExpressionType() != null)
            sb.append("ExpressionType: " + getExpressionType() + ",");
        if (getRequestProgress() != null)
            sb.append("RequestProgress: " + getRequestProgress() + ",");
        if (getInputSerialization() != null)
            sb.append("InputSerialization: " + getInputSerialization() + ",");
        if (getOutputSerialization() != null)
            sb.append("OutputSerialization: " + getOutputSerialization() + ",");
        if (getScanRange() != null)
            sb.append("ScanRange: " + getScanRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerAlgorithm() == null) ? 0 : getSSECustomerAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKey() == null) ? 0 : getSSECustomerKey().hashCode());
        hashCode = prime * hashCode
                + ((getSSECustomerKeyMD5() == null) ? 0 : getSSECustomerKeyMD5().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode
                + ((getExpressionType() == null) ? 0 : getExpressionType().hashCode());
        hashCode = prime * hashCode
                + ((getRequestProgress() == null) ? 0 : getRequestProgress().hashCode());
        hashCode = prime * hashCode
                + ((getInputSerialization() == null) ? 0 : getInputSerialization().hashCode());
        hashCode = prime * hashCode
                + ((getOutputSerialization() == null) ? 0 : getOutputSerialization().hashCode());
        hashCode = prime * hashCode + ((getScanRange() == null) ? 0 : getScanRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectObjectContentRequest == false)
            return false;
        SelectObjectContentRequest other = (SelectObjectContentRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getSSECustomerAlgorithm() == null ^ this.getSSECustomerAlgorithm() == null)
            return false;
        if (other.getSSECustomerAlgorithm() != null
                && other.getSSECustomerAlgorithm().equals(this.getSSECustomerAlgorithm()) == false)
            return false;
        if (other.getSSECustomerKey() == null ^ this.getSSECustomerKey() == null)
            return false;
        if (other.getSSECustomerKey() != null
                && other.getSSECustomerKey().equals(this.getSSECustomerKey()) == false)
            return false;
        if (other.getSSECustomerKeyMD5() == null ^ this.getSSECustomerKeyMD5() == null)
            return false;
        if (other.getSSECustomerKeyMD5() != null
                && other.getSSECustomerKeyMD5().equals(this.getSSECustomerKeyMD5()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null
                && other.getExpressionType().equals(this.getExpressionType()) == false)
            return false;
        if (other.getRequestProgress() == null ^ this.getRequestProgress() == null)
            return false;
        if (other.getRequestProgress() != null
                && other.getRequestProgress().equals(this.getRequestProgress()) == false)
            return false;
        if (other.getInputSerialization() == null ^ this.getInputSerialization() == null)
            return false;
        if (other.getInputSerialization() != null
                && other.getInputSerialization().equals(this.getInputSerialization()) == false)
            return false;
        if (other.getOutputSerialization() == null ^ this.getOutputSerialization() == null)
            return false;
        if (other.getOutputSerialization() != null
                && other.getOutputSerialization().equals(this.getOutputSerialization()) == false)
            return false;
        if (other.getScanRange() == null ^ this.getScanRange() == null)
            return false;
        if (other.getScanRange() != null
                && other.getScanRange().equals(this.getScanRange()) == false)
            return false;
        return true;
    }
}
