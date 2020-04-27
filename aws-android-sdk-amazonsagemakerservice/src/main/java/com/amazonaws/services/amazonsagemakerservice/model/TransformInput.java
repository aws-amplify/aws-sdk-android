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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the input source of a transform job and the way the transform job
 * consumes it.
 * </p>
 */
public class TransformInput implements Serializable {
    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of
     * the input data that the model can consume.
     * </p>
     */
    private TransformDataSource dataSource;

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon
     * SageMaker uses the MIME type with each http call to transfer data to the
     * transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String contentType;

    /**
     * <p>
     * If your transform data is compressed, specify the compression type.
     * Amazon SageMaker automatically decompresses the data for the transform
     * job accordingly. The default value is <code>None</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     */
    private String compressionType;

    /**
     * <p>
     * The method to use to split the transform job's data files into smaller
     * batches. Splitting is necessary when the total size of each object is too
     * large to fit in a single request. You can also use data splitting to
     * improve performance by processing multiple concurrent mini-batches. The
     * default value for <code>SplitType</code> is <code>None</code>, which
     * indicates that input data files are not split, and request payloads
     * contain the entire contents of an input object. Set the value of this
     * parameter to <code>Line</code> to split records on a newline character
     * boundary. <code>SplitType</code> also supports a number of
     * record-oriented binary data formats.
     * </p>
     * <p>
     * When splitting is enabled, the size of a mini-batch depends on the values
     * of the <code>BatchStrategy</code> and <code>MaxPayloadInMB</code>
     * parameters. When the value of <code>BatchStrategy</code> is
     * <code>MultiRecord</code>, Amazon SageMaker sends the maximum number of
     * records in each request, up to the <code>MaxPayloadInMB</code> limit. If
     * the value of <code>BatchStrategy</code> is <code>SingleRecord</code>,
     * Amazon SageMaker sends individual records in each request.
     * </p>
     * <note>
     * <p>
     * Some data formats represent a record as a binary payload wrapped with
     * extra padding bytes. When splitting is applied to a binary data format,
     * padding is removed if the value of <code>BatchStrategy</code> is set to
     * <code>SingleRecord</code>. Padding is not removed if the value of
     * <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     * </p>
     * <p>
     * For more information about <code>RecordIO</code>, see <a
     * href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset Using
     * RecordIO</a> in the MXNet documentation. For more information about
     * <code>TFRecord</code>, see <a href=
     * "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     * >Consuming TFRecord data</a> in the TensorFlow documentation.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Line, RecordIO, TFRecord
     */
    private String splitType;

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of
     * the input data that the model can consume.
     * </p>
     *
     * @return <p>
     *         Describes the location of the channel data, which is, the S3
     *         location of the input data that the model can consume.
     *         </p>
     */
    public TransformDataSource getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of
     * the input data that the model can consume.
     * </p>
     *
     * @param dataSource <p>
     *            Describes the location of the channel data, which is, the S3
     *            location of the input data that the model can consume.
     *            </p>
     */
    public void setDataSource(TransformDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Describes the location of the channel data, which is, the S3 location of
     * the input data that the model can consume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            Describes the location of the channel data, which is, the S3
     *            location of the input data that the model can consume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformInput withDataSource(TransformDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon
     * SageMaker uses the MIME type with each http call to transfer data to the
     * transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The multipurpose internet mail extension (MIME) type of the data.
     *         Amazon SageMaker uses the MIME type with each http call to
     *         transfer data to the transform job.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon
     * SageMaker uses the MIME type with each http call to transfer data to the
     * transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param contentType <p>
     *            The multipurpose internet mail extension (MIME) type of the
     *            data. Amazon SageMaker uses the MIME type with each http call
     *            to transfer data to the transform job.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the data. Amazon
     * SageMaker uses the MIME type with each http call to transfer data to the
     * transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param contentType <p>
     *            The multipurpose internet mail extension (MIME) type of the
     *            data. Amazon SageMaker uses the MIME type with each http call
     *            to transfer data to the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformInput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type.
     * Amazon SageMaker automatically decompresses the data for the transform
     * job accordingly. The default value is <code>None</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @return <p>
     *         If your transform data is compressed, specify the compression
     *         type. Amazon SageMaker automatically decompresses the data for
     *         the transform job accordingly. The default value is
     *         <code>None</code>.
     *         </p>
     * @see CompressionType
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type.
     * Amazon SageMaker automatically decompresses the data for the transform
     * job accordingly. The default value is <code>None</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            If your transform data is compressed, specify the compression
     *            type. Amazon SageMaker automatically decompresses the data for
     *            the transform job accordingly. The default value is
     *            <code>None</code>.
     *            </p>
     * @see CompressionType
     */
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type.
     * Amazon SageMaker automatically decompresses the data for the transform
     * job accordingly. The default value is <code>None</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            If your transform data is compressed, specify the compression
     *            type. Amazon SageMaker automatically decompresses the data for
     *            the transform job accordingly. The default value is
     *            <code>None</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionType
     */
    public TransformInput withCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type.
     * Amazon SageMaker automatically decompresses the data for the transform
     * job accordingly. The default value is <code>None</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            If your transform data is compressed, specify the compression
     *            type. Amazon SageMaker automatically decompresses the data for
     *            the transform job accordingly. The default value is
     *            <code>None</code>.
     *            </p>
     * @see CompressionType
     */
    public void setCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
    }

    /**
     * <p>
     * If your transform data is compressed, specify the compression type.
     * Amazon SageMaker automatically decompresses the data for the transform
     * job accordingly. The default value is <code>None</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            If your transform data is compressed, specify the compression
     *            type. Amazon SageMaker automatically decompresses the data for
     *            the transform job accordingly. The default value is
     *            <code>None</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionType
     */
    public TransformInput withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The method to use to split the transform job's data files into smaller
     * batches. Splitting is necessary when the total size of each object is too
     * large to fit in a single request. You can also use data splitting to
     * improve performance by processing multiple concurrent mini-batches. The
     * default value for <code>SplitType</code> is <code>None</code>, which
     * indicates that input data files are not split, and request payloads
     * contain the entire contents of an input object. Set the value of this
     * parameter to <code>Line</code> to split records on a newline character
     * boundary. <code>SplitType</code> also supports a number of
     * record-oriented binary data formats.
     * </p>
     * <p>
     * When splitting is enabled, the size of a mini-batch depends on the values
     * of the <code>BatchStrategy</code> and <code>MaxPayloadInMB</code>
     * parameters. When the value of <code>BatchStrategy</code> is
     * <code>MultiRecord</code>, Amazon SageMaker sends the maximum number of
     * records in each request, up to the <code>MaxPayloadInMB</code> limit. If
     * the value of <code>BatchStrategy</code> is <code>SingleRecord</code>,
     * Amazon SageMaker sends individual records in each request.
     * </p>
     * <note>
     * <p>
     * Some data formats represent a record as a binary payload wrapped with
     * extra padding bytes. When splitting is applied to a binary data format,
     * padding is removed if the value of <code>BatchStrategy</code> is set to
     * <code>SingleRecord</code>. Padding is not removed if the value of
     * <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     * </p>
     * <p>
     * For more information about <code>RecordIO</code>, see <a
     * href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset Using
     * RecordIO</a> in the MXNet documentation. For more information about
     * <code>TFRecord</code>, see <a href=
     * "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     * >Consuming TFRecord data</a> in the TensorFlow documentation.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Line, RecordIO, TFRecord
     *
     * @return <p>
     *         The method to use to split the transform job's data files into
     *         smaller batches. Splitting is necessary when the total size of
     *         each object is too large to fit in a single request. You can also
     *         use data splitting to improve performance by processing multiple
     *         concurrent mini-batches. The default value for
     *         <code>SplitType</code> is <code>None</code>, which indicates that
     *         input data files are not split, and request payloads contain the
     *         entire contents of an input object. Set the value of this
     *         parameter to <code>Line</code> to split records on a newline
     *         character boundary. <code>SplitType</code> also supports a number
     *         of record-oriented binary data formats.
     *         </p>
     *         <p>
     *         When splitting is enabled, the size of a mini-batch depends on
     *         the values of the <code>BatchStrategy</code> and
     *         <code>MaxPayloadInMB</code> parameters. When the value of
     *         <code>BatchStrategy</code> is <code>MultiRecord</code>, Amazon
     *         SageMaker sends the maximum number of records in each request, up
     *         to the <code>MaxPayloadInMB</code> limit. If the value of
     *         <code>BatchStrategy</code> is <code>SingleRecord</code>, Amazon
     *         SageMaker sends individual records in each request.
     *         </p>
     *         <note>
     *         <p>
     *         Some data formats represent a record as a binary payload wrapped
     *         with extra padding bytes. When splitting is applied to a binary
     *         data format, padding is removed if the value of
     *         <code>BatchStrategy</code> is set to <code>SingleRecord</code>.
     *         Padding is not removed if the value of <code>BatchStrategy</code>
     *         is set to <code>MultiRecord</code>.
     *         </p>
     *         <p>
     *         For more information about <code>RecordIO</code>, see <a
     *         href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset
     *         Using RecordIO</a> in the MXNet documentation. For more
     *         information about <code>TFRecord</code>, see <a href=
     *         "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     *         >Consuming TFRecord data</a> in the TensorFlow documentation.
     *         </p>
     *         </note>
     * @see SplitType
     */
    public String getSplitType() {
        return splitType;
    }

    /**
     * <p>
     * The method to use to split the transform job's data files into smaller
     * batches. Splitting is necessary when the total size of each object is too
     * large to fit in a single request. You can also use data splitting to
     * improve performance by processing multiple concurrent mini-batches. The
     * default value for <code>SplitType</code> is <code>None</code>, which
     * indicates that input data files are not split, and request payloads
     * contain the entire contents of an input object. Set the value of this
     * parameter to <code>Line</code> to split records on a newline character
     * boundary. <code>SplitType</code> also supports a number of
     * record-oriented binary data formats.
     * </p>
     * <p>
     * When splitting is enabled, the size of a mini-batch depends on the values
     * of the <code>BatchStrategy</code> and <code>MaxPayloadInMB</code>
     * parameters. When the value of <code>BatchStrategy</code> is
     * <code>MultiRecord</code>, Amazon SageMaker sends the maximum number of
     * records in each request, up to the <code>MaxPayloadInMB</code> limit. If
     * the value of <code>BatchStrategy</code> is <code>SingleRecord</code>,
     * Amazon SageMaker sends individual records in each request.
     * </p>
     * <note>
     * <p>
     * Some data formats represent a record as a binary payload wrapped with
     * extra padding bytes. When splitting is applied to a binary data format,
     * padding is removed if the value of <code>BatchStrategy</code> is set to
     * <code>SingleRecord</code>. Padding is not removed if the value of
     * <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     * </p>
     * <p>
     * For more information about <code>RecordIO</code>, see <a
     * href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset Using
     * RecordIO</a> in the MXNet documentation. For more information about
     * <code>TFRecord</code>, see <a href=
     * "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     * >Consuming TFRecord data</a> in the TensorFlow documentation.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Line, RecordIO, TFRecord
     *
     * @param splitType <p>
     *            The method to use to split the transform job's data files into
     *            smaller batches. Splitting is necessary when the total size of
     *            each object is too large to fit in a single request. You can
     *            also use data splitting to improve performance by processing
     *            multiple concurrent mini-batches. The default value for
     *            <code>SplitType</code> is <code>None</code>, which indicates
     *            that input data files are not split, and request payloads
     *            contain the entire contents of an input object. Set the value
     *            of this parameter to <code>Line</code> to split records on a
     *            newline character boundary. <code>SplitType</code> also
     *            supports a number of record-oriented binary data formats.
     *            </p>
     *            <p>
     *            When splitting is enabled, the size of a mini-batch depends on
     *            the values of the <code>BatchStrategy</code> and
     *            <code>MaxPayloadInMB</code> parameters. When the value of
     *            <code>BatchStrategy</code> is <code>MultiRecord</code>, Amazon
     *            SageMaker sends the maximum number of records in each request,
     *            up to the <code>MaxPayloadInMB</code> limit. If the value of
     *            <code>BatchStrategy</code> is <code>SingleRecord</code>,
     *            Amazon SageMaker sends individual records in each request.
     *            </p>
     *            <note>
     *            <p>
     *            Some data formats represent a record as a binary payload
     *            wrapped with extra padding bytes. When splitting is applied to
     *            a binary data format, padding is removed if the value of
     *            <code>BatchStrategy</code> is set to <code>SingleRecord</code>
     *            . Padding is not removed if the value of
     *            <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     *            </p>
     *            <p>
     *            For more information about <code>RecordIO</code>, see <a
     *            href="https://mxnet.apache.org/api/faq/recordio">Create a
     *            Dataset Using RecordIO</a> in the MXNet documentation. For
     *            more information about <code>TFRecord</code>, see <a href=
     *            "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     *            >Consuming TFRecord data</a> in the TensorFlow documentation.
     *            </p>
     *            </note>
     * @see SplitType
     */
    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    /**
     * <p>
     * The method to use to split the transform job's data files into smaller
     * batches. Splitting is necessary when the total size of each object is too
     * large to fit in a single request. You can also use data splitting to
     * improve performance by processing multiple concurrent mini-batches. The
     * default value for <code>SplitType</code> is <code>None</code>, which
     * indicates that input data files are not split, and request payloads
     * contain the entire contents of an input object. Set the value of this
     * parameter to <code>Line</code> to split records on a newline character
     * boundary. <code>SplitType</code> also supports a number of
     * record-oriented binary data formats.
     * </p>
     * <p>
     * When splitting is enabled, the size of a mini-batch depends on the values
     * of the <code>BatchStrategy</code> and <code>MaxPayloadInMB</code>
     * parameters. When the value of <code>BatchStrategy</code> is
     * <code>MultiRecord</code>, Amazon SageMaker sends the maximum number of
     * records in each request, up to the <code>MaxPayloadInMB</code> limit. If
     * the value of <code>BatchStrategy</code> is <code>SingleRecord</code>,
     * Amazon SageMaker sends individual records in each request.
     * </p>
     * <note>
     * <p>
     * Some data formats represent a record as a binary payload wrapped with
     * extra padding bytes. When splitting is applied to a binary data format,
     * padding is removed if the value of <code>BatchStrategy</code> is set to
     * <code>SingleRecord</code>. Padding is not removed if the value of
     * <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     * </p>
     * <p>
     * For more information about <code>RecordIO</code>, see <a
     * href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset Using
     * RecordIO</a> in the MXNet documentation. For more information about
     * <code>TFRecord</code>, see <a href=
     * "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     * >Consuming TFRecord data</a> in the TensorFlow documentation.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Line, RecordIO, TFRecord
     *
     * @param splitType <p>
     *            The method to use to split the transform job's data files into
     *            smaller batches. Splitting is necessary when the total size of
     *            each object is too large to fit in a single request. You can
     *            also use data splitting to improve performance by processing
     *            multiple concurrent mini-batches. The default value for
     *            <code>SplitType</code> is <code>None</code>, which indicates
     *            that input data files are not split, and request payloads
     *            contain the entire contents of an input object. Set the value
     *            of this parameter to <code>Line</code> to split records on a
     *            newline character boundary. <code>SplitType</code> also
     *            supports a number of record-oriented binary data formats.
     *            </p>
     *            <p>
     *            When splitting is enabled, the size of a mini-batch depends on
     *            the values of the <code>BatchStrategy</code> and
     *            <code>MaxPayloadInMB</code> parameters. When the value of
     *            <code>BatchStrategy</code> is <code>MultiRecord</code>, Amazon
     *            SageMaker sends the maximum number of records in each request,
     *            up to the <code>MaxPayloadInMB</code> limit. If the value of
     *            <code>BatchStrategy</code> is <code>SingleRecord</code>,
     *            Amazon SageMaker sends individual records in each request.
     *            </p>
     *            <note>
     *            <p>
     *            Some data formats represent a record as a binary payload
     *            wrapped with extra padding bytes. When splitting is applied to
     *            a binary data format, padding is removed if the value of
     *            <code>BatchStrategy</code> is set to <code>SingleRecord</code>
     *            . Padding is not removed if the value of
     *            <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     *            </p>
     *            <p>
     *            For more information about <code>RecordIO</code>, see <a
     *            href="https://mxnet.apache.org/api/faq/recordio">Create a
     *            Dataset Using RecordIO</a> in the MXNet documentation. For
     *            more information about <code>TFRecord</code>, see <a href=
     *            "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     *            >Consuming TFRecord data</a> in the TensorFlow documentation.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SplitType
     */
    public TransformInput withSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }

    /**
     * <p>
     * The method to use to split the transform job's data files into smaller
     * batches. Splitting is necessary when the total size of each object is too
     * large to fit in a single request. You can also use data splitting to
     * improve performance by processing multiple concurrent mini-batches. The
     * default value for <code>SplitType</code> is <code>None</code>, which
     * indicates that input data files are not split, and request payloads
     * contain the entire contents of an input object. Set the value of this
     * parameter to <code>Line</code> to split records on a newline character
     * boundary. <code>SplitType</code> also supports a number of
     * record-oriented binary data formats.
     * </p>
     * <p>
     * When splitting is enabled, the size of a mini-batch depends on the values
     * of the <code>BatchStrategy</code> and <code>MaxPayloadInMB</code>
     * parameters. When the value of <code>BatchStrategy</code> is
     * <code>MultiRecord</code>, Amazon SageMaker sends the maximum number of
     * records in each request, up to the <code>MaxPayloadInMB</code> limit. If
     * the value of <code>BatchStrategy</code> is <code>SingleRecord</code>,
     * Amazon SageMaker sends individual records in each request.
     * </p>
     * <note>
     * <p>
     * Some data formats represent a record as a binary payload wrapped with
     * extra padding bytes. When splitting is applied to a binary data format,
     * padding is removed if the value of <code>BatchStrategy</code> is set to
     * <code>SingleRecord</code>. Padding is not removed if the value of
     * <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     * </p>
     * <p>
     * For more information about <code>RecordIO</code>, see <a
     * href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset Using
     * RecordIO</a> in the MXNet documentation. For more information about
     * <code>TFRecord</code>, see <a href=
     * "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     * >Consuming TFRecord data</a> in the TensorFlow documentation.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Line, RecordIO, TFRecord
     *
     * @param splitType <p>
     *            The method to use to split the transform job's data files into
     *            smaller batches. Splitting is necessary when the total size of
     *            each object is too large to fit in a single request. You can
     *            also use data splitting to improve performance by processing
     *            multiple concurrent mini-batches. The default value for
     *            <code>SplitType</code> is <code>None</code>, which indicates
     *            that input data files are not split, and request payloads
     *            contain the entire contents of an input object. Set the value
     *            of this parameter to <code>Line</code> to split records on a
     *            newline character boundary. <code>SplitType</code> also
     *            supports a number of record-oriented binary data formats.
     *            </p>
     *            <p>
     *            When splitting is enabled, the size of a mini-batch depends on
     *            the values of the <code>BatchStrategy</code> and
     *            <code>MaxPayloadInMB</code> parameters. When the value of
     *            <code>BatchStrategy</code> is <code>MultiRecord</code>, Amazon
     *            SageMaker sends the maximum number of records in each request,
     *            up to the <code>MaxPayloadInMB</code> limit. If the value of
     *            <code>BatchStrategy</code> is <code>SingleRecord</code>,
     *            Amazon SageMaker sends individual records in each request.
     *            </p>
     *            <note>
     *            <p>
     *            Some data formats represent a record as a binary payload
     *            wrapped with extra padding bytes. When splitting is applied to
     *            a binary data format, padding is removed if the value of
     *            <code>BatchStrategy</code> is set to <code>SingleRecord</code>
     *            . Padding is not removed if the value of
     *            <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     *            </p>
     *            <p>
     *            For more information about <code>RecordIO</code>, see <a
     *            href="https://mxnet.apache.org/api/faq/recordio">Create a
     *            Dataset Using RecordIO</a> in the MXNet documentation. For
     *            more information about <code>TFRecord</code>, see <a href=
     *            "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     *            >Consuming TFRecord data</a> in the TensorFlow documentation.
     *            </p>
     *            </note>
     * @see SplitType
     */
    public void setSplitType(SplitType splitType) {
        this.splitType = splitType.toString();
    }

    /**
     * <p>
     * The method to use to split the transform job's data files into smaller
     * batches. Splitting is necessary when the total size of each object is too
     * large to fit in a single request. You can also use data splitting to
     * improve performance by processing multiple concurrent mini-batches. The
     * default value for <code>SplitType</code> is <code>None</code>, which
     * indicates that input data files are not split, and request payloads
     * contain the entire contents of an input object. Set the value of this
     * parameter to <code>Line</code> to split records on a newline character
     * boundary. <code>SplitType</code> also supports a number of
     * record-oriented binary data formats.
     * </p>
     * <p>
     * When splitting is enabled, the size of a mini-batch depends on the values
     * of the <code>BatchStrategy</code> and <code>MaxPayloadInMB</code>
     * parameters. When the value of <code>BatchStrategy</code> is
     * <code>MultiRecord</code>, Amazon SageMaker sends the maximum number of
     * records in each request, up to the <code>MaxPayloadInMB</code> limit. If
     * the value of <code>BatchStrategy</code> is <code>SingleRecord</code>,
     * Amazon SageMaker sends individual records in each request.
     * </p>
     * <note>
     * <p>
     * Some data formats represent a record as a binary payload wrapped with
     * extra padding bytes. When splitting is applied to a binary data format,
     * padding is removed if the value of <code>BatchStrategy</code> is set to
     * <code>SingleRecord</code>. Padding is not removed if the value of
     * <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     * </p>
     * <p>
     * For more information about <code>RecordIO</code>, see <a
     * href="https://mxnet.apache.org/api/faq/recordio">Create a Dataset Using
     * RecordIO</a> in the MXNet documentation. For more information about
     * <code>TFRecord</code>, see <a href=
     * "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     * >Consuming TFRecord data</a> in the TensorFlow documentation.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Line, RecordIO, TFRecord
     *
     * @param splitType <p>
     *            The method to use to split the transform job's data files into
     *            smaller batches. Splitting is necessary when the total size of
     *            each object is too large to fit in a single request. You can
     *            also use data splitting to improve performance by processing
     *            multiple concurrent mini-batches. The default value for
     *            <code>SplitType</code> is <code>None</code>, which indicates
     *            that input data files are not split, and request payloads
     *            contain the entire contents of an input object. Set the value
     *            of this parameter to <code>Line</code> to split records on a
     *            newline character boundary. <code>SplitType</code> also
     *            supports a number of record-oriented binary data formats.
     *            </p>
     *            <p>
     *            When splitting is enabled, the size of a mini-batch depends on
     *            the values of the <code>BatchStrategy</code> and
     *            <code>MaxPayloadInMB</code> parameters. When the value of
     *            <code>BatchStrategy</code> is <code>MultiRecord</code>, Amazon
     *            SageMaker sends the maximum number of records in each request,
     *            up to the <code>MaxPayloadInMB</code> limit. If the value of
     *            <code>BatchStrategy</code> is <code>SingleRecord</code>,
     *            Amazon SageMaker sends individual records in each request.
     *            </p>
     *            <note>
     *            <p>
     *            Some data formats represent a record as a binary payload
     *            wrapped with extra padding bytes. When splitting is applied to
     *            a binary data format, padding is removed if the value of
     *            <code>BatchStrategy</code> is set to <code>SingleRecord</code>
     *            . Padding is not removed if the value of
     *            <code>BatchStrategy</code> is set to <code>MultiRecord</code>.
     *            </p>
     *            <p>
     *            For more information about <code>RecordIO</code>, see <a
     *            href="https://mxnet.apache.org/api/faq/recordio">Create a
     *            Dataset Using RecordIO</a> in the MXNet documentation. For
     *            more information about <code>TFRecord</code>, see <a href=
     *            "https://www.tensorflow.org/guide/datasets#consuming_tfrecord_data"
     *            >Consuming TFRecord data</a> in the TensorFlow documentation.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SplitType
     */
    public TransformInput withSplitType(SplitType splitType) {
        this.splitType = splitType.toString();
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
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getCompressionType() != null)
            sb.append("CompressionType: " + getCompressionType() + ",");
        if (getSplitType() != null)
            sb.append("SplitType: " + getSplitType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getSplitType() == null) ? 0 : getSplitType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformInput == false)
            return false;
        TransformInput other = (TransformInput) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null
                && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getSplitType() == null ^ this.getSplitType() == null)
            return false;
        if (other.getSplitType() != null
                && other.getSplitType().equals(this.getSplitType()) == false)
            return false;
        return true;
    }
}
