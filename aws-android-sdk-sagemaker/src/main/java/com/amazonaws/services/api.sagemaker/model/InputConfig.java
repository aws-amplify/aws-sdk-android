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
 * Contains information about the location of input model artifacts, the name
 * and shape of the expected data inputs, and the framework in which the model
 * was trained.
 * </p>
 */
public class InputConfig implements Serializable {
    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained
     * model with a JSON dictionary form. The data inputs are
     * <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC
     * format) of the expected data inputs using a dictionary format for your
     * trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of
     * expected data inputs using a dictionary format for your trained model.
     * Note that while Keras model artifacts should be uploaded in NHWC
     * (channel-last) format, <code>DataInputConfig</code> should be specified
     * in NCHW (channel-first) format. The dictionary formats required for the
     * console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX</code>: You must specify the name and shape (NCHW
     * format) of the expected data inputs in order using a dictionary format
     * for your trained model. The dictionary formats required for the console
     * and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW
     * format) of expected data inputs in order using a dictionary format for
     * your trained model or you can specify the shape only using a list format.
     * The dictionary formats required for the console and CLI are different.
     * The list formats for the console and CLI are the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format:
     * <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     */
    private String dataInputConfig;

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example:
     * TENSORFLOW.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST,
     * TFLITE
     */
    private String framework;

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The S3 path where the model artifacts, which result from model
     *         training, are stored. This path must point to a single gzip
     *         compressed tar archive (.tar.gz suffix).
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            The S3 path where the model artifacts, which result from model
     *            training, are stored. This path must point to a single gzip
     *            compressed tar archive (.tar.gz suffix).
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training,
     * are stored. This path must point to a single gzip compressed tar archive
     * (.tar.gz suffix).
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
     *            The S3 path where the model artifacts, which result from model
     *            training, are stored. This path must point to a single gzip
     *            compressed tar archive (.tar.gz suffix).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained
     * model with a JSON dictionary form. The data inputs are
     * <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC
     * format) of the expected data inputs using a dictionary format for your
     * trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of
     * expected data inputs using a dictionary format for your trained model.
     * Note that while Keras model artifacts should be uploaded in NHWC
     * (channel-last) format, <code>DataInputConfig</code> should be specified
     * in NCHW (channel-first) format. The dictionary formats required for the
     * console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX</code>: You must specify the name and shape (NCHW
     * format) of the expected data inputs in order using a dictionary format
     * for your trained model. The dictionary formats required for the console
     * and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW
     * format) of expected data inputs in order using a dictionary format for
     * your trained model or you can specify the shape only using a list format.
     * The dictionary formats required for the console and CLI are different.
     * The list formats for the console and CLI are the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format:
     * <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @return <p>
     *         Specifies the name and shape of the expected data inputs for your
     *         trained model with a JSON dictionary form. The data inputs are
     *         <a>InputConfig$Framework</a> specific.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TensorFlow</code>: You must specify the name and shape
     *         (NHWC format) of the expected data inputs using a dictionary
     *         format for your trained model. The dictionary formats required
     *         for the console and CLI are different.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input":[1,1024,1024,3]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console,
     *         <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI,
     *         <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KERAS</code>: You must specify the name and shape (NCHW
     *         format) of expected data inputs using a dictionary format for
     *         your trained model. Note that while Keras model artifacts should
     *         be uploaded in NHWC (channel-last) format,
     *         <code>DataInputConfig</code> should be specified in NCHW
     *         (channel-first) format. The dictionary formats required for the
     *         console and CLI are different.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input_1":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console,
     *         <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI,
     *         <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MXNET/ONNX</code>: You must specify the name and shape
     *         (NCHW format) of the expected data inputs in order using a
     *         dictionary format for your trained model. The dictionary formats
     *         required for the console and CLI are different.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"data":[1,3,1024,1024]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console,
     *         <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI,
     *         <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PyTorch</code>: You can either specify the name and shape
     *         (NCHW format) of expected data inputs in order using a dictionary
     *         format for your trained model or you can specify the shape only
     *         using a list format. The dictionary formats required for the
     *         console and CLI are different. The list formats for the console
     *         and CLI are the same.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Examples for one input in dictionary format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console, <code>{"input0":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Example for one input in list format:
     *         <code>[[1,3,224,224]]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Examples for two inputs in dictionary format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If using the console,
     *         <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If using the CLI,
     *         <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Example for two inputs in list format:
     *         <code>[[1,3,224,224], [1,3,224,224]]</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XGBOOST</code>: input data name and shape are not needed.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDataInputConfig() {
        return dataInputConfig;
    }

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained
     * model with a JSON dictionary form. The data inputs are
     * <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC
     * format) of the expected data inputs using a dictionary format for your
     * trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of
     * expected data inputs using a dictionary format for your trained model.
     * Note that while Keras model artifacts should be uploaded in NHWC
     * (channel-last) format, <code>DataInputConfig</code> should be specified
     * in NCHW (channel-first) format. The dictionary formats required for the
     * console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX</code>: You must specify the name and shape (NCHW
     * format) of the expected data inputs in order using a dictionary format
     * for your trained model. The dictionary formats required for the console
     * and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW
     * format) of expected data inputs in order using a dictionary format for
     * your trained model or you can specify the shape only using a list format.
     * The dictionary formats required for the console and CLI are different.
     * The list formats for the console and CLI are the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format:
     * <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @param dataInputConfig <p>
     *            Specifies the name and shape of the expected data inputs for
     *            your trained model with a JSON dictionary form. The data
     *            inputs are <a>InputConfig$Framework</a> specific.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TensorFlow</code>: You must specify the name and shape
     *            (NHWC format) of the expected data inputs using a dictionary
     *            format for your trained model. The dictionary formats required
     *            for the console and CLI are different.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"input":[1,1024,1024,3]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KERAS</code>: You must specify the name and shape (NCHW
     *            format) of expected data inputs using a dictionary format for
     *            your trained model. Note that while Keras model artifacts
     *            should be uploaded in NHWC (channel-last) format,
     *            <code>DataInputConfig</code> should be specified in NCHW
     *            (channel-first) format. The dictionary formats required for
     *            the console and CLI are different.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"input_1":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MXNET/ONNX</code>: You must specify the name and shape
     *            (NCHW format) of the expected data inputs in order using a
     *            dictionary format for your trained model. The dictionary
     *            formats required for the console and CLI are different.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"data":[1,3,1024,1024]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PyTorch</code>: You can either specify the name and
     *            shape (NCHW format) of expected data inputs in order using a
     *            dictionary format for your trained model or you can specify
     *            the shape only using a list format. The dictionary formats
     *            required for the console and CLI are different. The list
     *            formats for the console and CLI are the same.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input in dictionary format:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"input0":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Example for one input in list format:
     *            <code>[[1,3,224,224]]</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs in dictionary format:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Example for two inputs in list format:
     *            <code>[[1,3,224,224], [1,3,224,224]]</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>XGBOOST</code>: input data name and shape are not
     *            needed.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDataInputConfig(String dataInputConfig) {
        this.dataInputConfig = dataInputConfig;
    }

    /**
     * <p>
     * Specifies the name and shape of the expected data inputs for your trained
     * model with a JSON dictionary form. The data inputs are
     * <a>InputConfig$Framework</a> specific.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TensorFlow</code>: You must specify the name and shape (NHWC
     * format) of the expected data inputs using a dictionary format for your
     * trained model. The dictionary formats required for the console and CLI
     * are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>KERAS</code>: You must specify the name and shape (NCHW format) of
     * expected data inputs using a dictionary format for your trained model.
     * Note that while Keras model artifacts should be uploaded in NHWC
     * (channel-last) format, <code>DataInputConfig</code> should be specified
     * in NCHW (channel-first) format. The dictionary formats required for the
     * console and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input_1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>MXNET/ONNX</code>: You must specify the name and shape (NCHW
     * format) of the expected data inputs in order using a dictionary format
     * for your trained model. The dictionary formats required for the console
     * and CLI are different.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"data":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PyTorch</code>: You can either specify the name and shape (NCHW
     * format) of expected data inputs in order using a dictionary format for
     * your trained model or you can specify the shape only using a list format.
     * The dictionary formats required for the console and CLI are different.
     * The list formats for the console and CLI are the same.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Examples for one input in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console, <code>{"input0":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for one input in list format: <code>[[1,3,224,224]]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples for two inputs in dictionary format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If using the console,
     * <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If using the CLI,
     * <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Example for two inputs in list format:
     * <code>[[1,3,224,224], [1,3,224,224]]</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>XGBOOST</code>: input data name and shape are not needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @param dataInputConfig <p>
     *            Specifies the name and shape of the expected data inputs for
     *            your trained model with a JSON dictionary form. The data
     *            inputs are <a>InputConfig$Framework</a> specific.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TensorFlow</code>: You must specify the name and shape
     *            (NHWC format) of the expected data inputs using a dictionary
     *            format for your trained model. The dictionary formats required
     *            for the console and CLI are different.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"input":[1,1024,1024,3]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"input\":[1,1024,1024,3]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"data1": [1,28,28,1], "data2":[1,28,28,1]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"data1\": [1,28,28,1], \"data2\":[1,28,28,1]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KERAS</code>: You must specify the name and shape (NCHW
     *            format) of expected data inputs using a dictionary format for
     *            your trained model. Note that while Keras model artifacts
     *            should be uploaded in NHWC (channel-last) format,
     *            <code>DataInputConfig</code> should be specified in NCHW
     *            (channel-first) format. The dictionary formats required for
     *            the console and CLI are different.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"input_1":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"input_1\":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"input_1": [1,3,224,224], "input_2":[1,3,224,224]} </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"input_1\": [1,3,224,224], \"input_2\":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MXNET/ONNX</code>: You must specify the name and shape
     *            (NCHW format) of the expected data inputs in order using a
     *            dictionary format for your trained model. The dictionary
     *            formats required for the console and CLI are different.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"data":[1,3,1024,1024]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"data\":[1,3,1024,1024]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"var1": [1,1,28,28], "var2":[1,1,28,28]} </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"var1\": [1,1,28,28], \"var2\":[1,1,28,28]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PyTorch</code>: You can either specify the name and
     *            shape (NCHW format) of expected data inputs in order using a
     *            dictionary format for your trained model or you can specify
     *            the shape only using a list format. The dictionary formats
     *            required for the console and CLI are different. The list
     *            formats for the console and CLI are the same.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Examples for one input in dictionary format:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console, <code>{"input0":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI, <code>{\"input0\":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Example for one input in list format:
     *            <code>[[1,3,224,224]]</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Examples for two inputs in dictionary format:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If using the console,
     *            <code>{"input0":[1,3,224,224], "input1":[1,3,224,224]}</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If using the CLI,
     *            <code>{\"input0\":[1,3,224,224], \"input1\":[1,3,224,224]} </code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Example for two inputs in list format:
     *            <code>[[1,3,224,224], [1,3,224,224]]</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>XGBOOST</code>: input data name and shape are not
     *            needed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputConfig withDataInputConfig(String dataInputConfig) {
        this.dataInputConfig = dataInputConfig;
        return this;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example:
     * TENSORFLOW.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST,
     * TFLITE
     *
     * @return <p>
     *         Identifies the framework in which the model was trained. For
     *         example: TENSORFLOW.
     *         </p>
     * @see Framework
     */
    public String getFramework() {
        return framework;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example:
     * TENSORFLOW.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST,
     * TFLITE
     *
     * @param framework <p>
     *            Identifies the framework in which the model was trained. For
     *            example: TENSORFLOW.
     *            </p>
     * @see Framework
     */
    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example:
     * TENSORFLOW.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST,
     * TFLITE
     *
     * @param framework <p>
     *            Identifies the framework in which the model was trained. For
     *            example: TENSORFLOW.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Framework
     */
    public InputConfig withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example:
     * TENSORFLOW.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST,
     * TFLITE
     *
     * @param framework <p>
     *            Identifies the framework in which the model was trained. For
     *            example: TENSORFLOW.
     *            </p>
     * @see Framework
     */
    public void setFramework(Framework framework) {
        this.framework = framework.toString();
    }

    /**
     * <p>
     * Identifies the framework in which the model was trained. For example:
     * TENSORFLOW.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST,
     * TFLITE
     *
     * @param framework <p>
     *            Identifies the framework in which the model was trained. For
     *            example: TENSORFLOW.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Framework
     */
    public InputConfig withFramework(Framework framework) {
        this.framework = framework.toString();
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
        if (getDataInputConfig() != null)
            sb.append("DataInputConfig: " + getDataInputConfig() + ",");
        if (getFramework() != null)
            sb.append("Framework: " + getFramework());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getDataInputConfig() == null) ? 0 : getDataInputConfig().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputConfig == false)
            return false;
        InputConfig other = (InputConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getDataInputConfig() == null ^ this.getDataInputConfig() == null)
            return false;
        if (other.getDataInputConfig() != null
                && other.getDataInputConfig().equals(this.getDataInputConfig()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null
                && other.getFramework().equals(this.getFramework()) == false)
            return false;
        return true;
    }
}
