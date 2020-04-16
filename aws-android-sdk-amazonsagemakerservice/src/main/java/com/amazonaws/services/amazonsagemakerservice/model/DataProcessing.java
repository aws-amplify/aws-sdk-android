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
 * The data structure used to specify the data to be used for inference in a
 * batch transform job and to associate the data that is relevant to the
 * prediction results in the output. The input filter provided allows you to
 * exclude input data that is not needed for inference in a batch transform job.
 * The output filter provided allows you to include input data relevant to
 * interpreting the predictions in the output from the job. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
 * >Associate Prediction Results with their Corresponding Input Records</a>.
 * </p>
 */
public class DataProcessing implements Serializable {
    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the input data to
     * pass to the algorithm. Use the <code>InputFilter</code> parameter to
     * exclude fields, such as an ID column, from the input. If you want Amazon
     * SageMaker to pass the entire input dataset to the algorithm, accept the
     * default value <code>$</code>.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     * <code>"$.features"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     */
    private String inputFilter;

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the joined dataset
     * to save in the output file for a batch transform job. If you want Amazon
     * SageMaker to store the entire input dataset in the output file, leave the
     * default value, <code>$</code>. If you specify indexes that aren't within
     * the dimension size of the joined dataset, you get an error.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     * <code>"$['id','SageMakerOutput']"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     */
    private String outputFilter;

    /**
     * <p>
     * Specifies the source of the data to join with the transformed data. The
     * valid values are <code>None</code> and <code>Input</code>. The default
     * value is <code>None</code>, which specifies not to join the input with
     * the transformed data. If you want the batch transform job to join the
     * original input data with the transformed data, set
     * <code>JoinSource</code> to <code>Input</code>.
     * </p>
     * <p>
     * For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker
     * adds the transformed data to the input JSON object in an attribute called
     * <code>SageMakerOutput</code>. The joined result for JSON must be a
     * key-value pair object. If the input is not a key-value pair object,
     * Amazon SageMaker creates a new JSON file. In the new JSON file, and the
     * input data is stored under the <code>SageMakerInput</code> key and the
     * results are stored in <code>SageMakerOutput</code>.
     * </p>
     * <p>
     * For CSV files, Amazon SageMaker combines the transformed data with the
     * input data at the end of the input data and stores it in the output file.
     * The joined data has the joined input data followed by the transformed
     * data and the output is a CSV file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Input, None
     */
    private String joinSource;

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the input data to
     * pass to the algorithm. Use the <code>InputFilter</code> parameter to
     * exclude fields, such as an ID column, from the input. If you want Amazon
     * SageMaker to pass the entire input dataset to the algorithm, accept the
     * default value <code>$</code>.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     * <code>"$.features"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     *
     * @return <p>
     *         A <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     *         >JSONPath</a> expression used to select a portion of the input
     *         data to pass to the algorithm. Use the <code>InputFilter</code>
     *         parameter to exclude fields, such as an ID column, from the
     *         input. If you want Amazon SageMaker to pass the entire input
     *         dataset to the algorithm, accept the default value <code>$</code>
     *         .
     *         </p>
     *         <p>
     *         Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     *         <code>"$.features"</code>
     *         </p>
     */
    public String getInputFilter() {
        return inputFilter;
    }

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the input data to
     * pass to the algorithm. Use the <code>InputFilter</code> parameter to
     * exclude fields, such as an ID column, from the input. If you want Amazon
     * SageMaker to pass the entire input dataset to the algorithm, accept the
     * default value <code>$</code>.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     * <code>"$.features"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     *
     * @param inputFilter <p>
     *            A <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     *            >JSONPath</a> expression used to select a portion of the input
     *            data to pass to the algorithm. Use the
     *            <code>InputFilter</code> parameter to exclude fields, such as
     *            an ID column, from the input. If you want Amazon SageMaker to
     *            pass the entire input dataset to the algorithm, accept the
     *            default value <code>$</code>.
     *            </p>
     *            <p>
     *            Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     *            <code>"$.features"</code>
     *            </p>
     */
    public void setInputFilter(String inputFilter) {
        this.inputFilter = inputFilter;
    }

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the input data to
     * pass to the algorithm. Use the <code>InputFilter</code> parameter to
     * exclude fields, such as an ID column, from the input. If you want Amazon
     * SageMaker to pass the entire input dataset to the algorithm, accept the
     * default value <code>$</code>.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     * <code>"$.features"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     *
     * @param inputFilter <p>
     *            A <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     *            >JSONPath</a> expression used to select a portion of the input
     *            data to pass to the algorithm. Use the
     *            <code>InputFilter</code> parameter to exclude fields, such as
     *            an ID column, from the input. If you want Amazon SageMaker to
     *            pass the entire input dataset to the algorithm, accept the
     *            default value <code>$</code>.
     *            </p>
     *            <p>
     *            Examples: <code>"$"</code>, <code>"$[1:]"</code>,
     *            <code>"$.features"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataProcessing withInputFilter(String inputFilter) {
        this.inputFilter = inputFilter;
        return this;
    }

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the joined dataset
     * to save in the output file for a batch transform job. If you want Amazon
     * SageMaker to store the entire input dataset in the output file, leave the
     * default value, <code>$</code>. If you specify indexes that aren't within
     * the dimension size of the joined dataset, you get an error.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     * <code>"$['id','SageMakerOutput']"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     *
     * @return <p>
     *         A <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     *         >JSONPath</a> expression used to select a portion of the joined
     *         dataset to save in the output file for a batch transform job. If
     *         you want Amazon SageMaker to store the entire input dataset in
     *         the output file, leave the default value, <code>$</code>. If you
     *         specify indexes that aren't within the dimension size of the
     *         joined dataset, you get an error.
     *         </p>
     *         <p>
     *         Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     *         <code>"$['id','SageMakerOutput']"</code>
     *         </p>
     */
    public String getOutputFilter() {
        return outputFilter;
    }

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the joined dataset
     * to save in the output file for a batch transform job. If you want Amazon
     * SageMaker to store the entire input dataset in the output file, leave the
     * default value, <code>$</code>. If you specify indexes that aren't within
     * the dimension size of the joined dataset, you get an error.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     * <code>"$['id','SageMakerOutput']"</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     *
     * @param outputFilter <p>
     *            A <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     *            >JSONPath</a> expression used to select a portion of the
     *            joined dataset to save in the output file for a batch
     *            transform job. If you want Amazon SageMaker to store the
     *            entire input dataset in the output file, leave the default
     *            value, <code>$</code>. If you specify indexes that aren't
     *            within the dimension size of the joined dataset, you get an
     *            error.
     *            </p>
     *            <p>
     *            Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     *            <code>"$['id','SageMakerOutput']"</code>
     *            </p>
     */
    public void setOutputFilter(String outputFilter) {
        this.outputFilter = outputFilter;
    }

    /**
     * <p>
     * A <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     * >JSONPath</a> expression used to select a portion of the joined dataset
     * to save in the output file for a batch transform job. If you want Amazon
     * SageMaker to store the entire input dataset in the output file, leave the
     * default value, <code>$</code>. If you specify indexes that aren't within
     * the dimension size of the joined dataset, you get an error.
     * </p>
     * <p>
     * Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     * <code>"$['id','SageMakerOutput']"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 63<br/>
     *
     * @param outputFilter <p>
     *            A <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html#data-processing-operators"
     *            >JSONPath</a> expression used to select a portion of the
     *            joined dataset to save in the output file for a batch
     *            transform job. If you want Amazon SageMaker to store the
     *            entire input dataset in the output file, leave the default
     *            value, <code>$</code>. If you specify indexes that aren't
     *            within the dimension size of the joined dataset, you get an
     *            error.
     *            </p>
     *            <p>
     *            Examples: <code>"$"</code>, <code>"$[0,5:]"</code>,
     *            <code>"$['id','SageMakerOutput']"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataProcessing withOutputFilter(String outputFilter) {
        this.outputFilter = outputFilter;
        return this;
    }

    /**
     * <p>
     * Specifies the source of the data to join with the transformed data. The
     * valid values are <code>None</code> and <code>Input</code>. The default
     * value is <code>None</code>, which specifies not to join the input with
     * the transformed data. If you want the batch transform job to join the
     * original input data with the transformed data, set
     * <code>JoinSource</code> to <code>Input</code>.
     * </p>
     * <p>
     * For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker
     * adds the transformed data to the input JSON object in an attribute called
     * <code>SageMakerOutput</code>. The joined result for JSON must be a
     * key-value pair object. If the input is not a key-value pair object,
     * Amazon SageMaker creates a new JSON file. In the new JSON file, and the
     * input data is stored under the <code>SageMakerInput</code> key and the
     * results are stored in <code>SageMakerOutput</code>.
     * </p>
     * <p>
     * For CSV files, Amazon SageMaker combines the transformed data with the
     * input data at the end of the input data and stores it in the output file.
     * The joined data has the joined input data followed by the transformed
     * data and the output is a CSV file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Input, None
     *
     * @return <p>
     *         Specifies the source of the data to join with the transformed
     *         data. The valid values are <code>None</code> and
     *         <code>Input</code>. The default value is <code>None</code>, which
     *         specifies not to join the input with the transformed data. If you
     *         want the batch transform job to join the original input data with
     *         the transformed data, set <code>JoinSource</code> to
     *         <code>Input</code>.
     *         </p>
     *         <p>
     *         For JSON or JSONLines objects, such as a JSON array, Amazon
     *         SageMaker adds the transformed data to the input JSON object in
     *         an attribute called <code>SageMakerOutput</code>. The joined
     *         result for JSON must be a key-value pair object. If the input is
     *         not a key-value pair object, Amazon SageMaker creates a new JSON
     *         file. In the new JSON file, and the input data is stored under
     *         the <code>SageMakerInput</code> key and the results are stored in
     *         <code>SageMakerOutput</code>.
     *         </p>
     *         <p>
     *         For CSV files, Amazon SageMaker combines the transformed data
     *         with the input data at the end of the input data and stores it in
     *         the output file. The joined data has the joined input data
     *         followed by the transformed data and the output is a CSV file.
     *         </p>
     * @see JoinSource
     */
    public String getJoinSource() {
        return joinSource;
    }

    /**
     * <p>
     * Specifies the source of the data to join with the transformed data. The
     * valid values are <code>None</code> and <code>Input</code>. The default
     * value is <code>None</code>, which specifies not to join the input with
     * the transformed data. If you want the batch transform job to join the
     * original input data with the transformed data, set
     * <code>JoinSource</code> to <code>Input</code>.
     * </p>
     * <p>
     * For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker
     * adds the transformed data to the input JSON object in an attribute called
     * <code>SageMakerOutput</code>. The joined result for JSON must be a
     * key-value pair object. If the input is not a key-value pair object,
     * Amazon SageMaker creates a new JSON file. In the new JSON file, and the
     * input data is stored under the <code>SageMakerInput</code> key and the
     * results are stored in <code>SageMakerOutput</code>.
     * </p>
     * <p>
     * For CSV files, Amazon SageMaker combines the transformed data with the
     * input data at the end of the input data and stores it in the output file.
     * The joined data has the joined input data followed by the transformed
     * data and the output is a CSV file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Input, None
     *
     * @param joinSource <p>
     *            Specifies the source of the data to join with the transformed
     *            data. The valid values are <code>None</code> and
     *            <code>Input</code>. The default value is <code>None</code>,
     *            which specifies not to join the input with the transformed
     *            data. If you want the batch transform job to join the original
     *            input data with the transformed data, set
     *            <code>JoinSource</code> to <code>Input</code>.
     *            </p>
     *            <p>
     *            For JSON or JSONLines objects, such as a JSON array, Amazon
     *            SageMaker adds the transformed data to the input JSON object
     *            in an attribute called <code>SageMakerOutput</code>. The
     *            joined result for JSON must be a key-value pair object. If the
     *            input is not a key-value pair object, Amazon SageMaker creates
     *            a new JSON file. In the new JSON file, and the input data is
     *            stored under the <code>SageMakerInput</code> key and the
     *            results are stored in <code>SageMakerOutput</code>.
     *            </p>
     *            <p>
     *            For CSV files, Amazon SageMaker combines the transformed data
     *            with the input data at the end of the input data and stores it
     *            in the output file. The joined data has the joined input data
     *            followed by the transformed data and the output is a CSV file.
     *            </p>
     * @see JoinSource
     */
    public void setJoinSource(String joinSource) {
        this.joinSource = joinSource;
    }

    /**
     * <p>
     * Specifies the source of the data to join with the transformed data. The
     * valid values are <code>None</code> and <code>Input</code>. The default
     * value is <code>None</code>, which specifies not to join the input with
     * the transformed data. If you want the batch transform job to join the
     * original input data with the transformed data, set
     * <code>JoinSource</code> to <code>Input</code>.
     * </p>
     * <p>
     * For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker
     * adds the transformed data to the input JSON object in an attribute called
     * <code>SageMakerOutput</code>. The joined result for JSON must be a
     * key-value pair object. If the input is not a key-value pair object,
     * Amazon SageMaker creates a new JSON file. In the new JSON file, and the
     * input data is stored under the <code>SageMakerInput</code> key and the
     * results are stored in <code>SageMakerOutput</code>.
     * </p>
     * <p>
     * For CSV files, Amazon SageMaker combines the transformed data with the
     * input data at the end of the input data and stores it in the output file.
     * The joined data has the joined input data followed by the transformed
     * data and the output is a CSV file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Input, None
     *
     * @param joinSource <p>
     *            Specifies the source of the data to join with the transformed
     *            data. The valid values are <code>None</code> and
     *            <code>Input</code>. The default value is <code>None</code>,
     *            which specifies not to join the input with the transformed
     *            data. If you want the batch transform job to join the original
     *            input data with the transformed data, set
     *            <code>JoinSource</code> to <code>Input</code>.
     *            </p>
     *            <p>
     *            For JSON or JSONLines objects, such as a JSON array, Amazon
     *            SageMaker adds the transformed data to the input JSON object
     *            in an attribute called <code>SageMakerOutput</code>. The
     *            joined result for JSON must be a key-value pair object. If the
     *            input is not a key-value pair object, Amazon SageMaker creates
     *            a new JSON file. In the new JSON file, and the input data is
     *            stored under the <code>SageMakerInput</code> key and the
     *            results are stored in <code>SageMakerOutput</code>.
     *            </p>
     *            <p>
     *            For CSV files, Amazon SageMaker combines the transformed data
     *            with the input data at the end of the input data and stores it
     *            in the output file. The joined data has the joined input data
     *            followed by the transformed data and the output is a CSV file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JoinSource
     */
    public DataProcessing withJoinSource(String joinSource) {
        this.joinSource = joinSource;
        return this;
    }

    /**
     * <p>
     * Specifies the source of the data to join with the transformed data. The
     * valid values are <code>None</code> and <code>Input</code>. The default
     * value is <code>None</code>, which specifies not to join the input with
     * the transformed data. If you want the batch transform job to join the
     * original input data with the transformed data, set
     * <code>JoinSource</code> to <code>Input</code>.
     * </p>
     * <p>
     * For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker
     * adds the transformed data to the input JSON object in an attribute called
     * <code>SageMakerOutput</code>. The joined result for JSON must be a
     * key-value pair object. If the input is not a key-value pair object,
     * Amazon SageMaker creates a new JSON file. In the new JSON file, and the
     * input data is stored under the <code>SageMakerInput</code> key and the
     * results are stored in <code>SageMakerOutput</code>.
     * </p>
     * <p>
     * For CSV files, Amazon SageMaker combines the transformed data with the
     * input data at the end of the input data and stores it in the output file.
     * The joined data has the joined input data followed by the transformed
     * data and the output is a CSV file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Input, None
     *
     * @param joinSource <p>
     *            Specifies the source of the data to join with the transformed
     *            data. The valid values are <code>None</code> and
     *            <code>Input</code>. The default value is <code>None</code>,
     *            which specifies not to join the input with the transformed
     *            data. If you want the batch transform job to join the original
     *            input data with the transformed data, set
     *            <code>JoinSource</code> to <code>Input</code>.
     *            </p>
     *            <p>
     *            For JSON or JSONLines objects, such as a JSON array, Amazon
     *            SageMaker adds the transformed data to the input JSON object
     *            in an attribute called <code>SageMakerOutput</code>. The
     *            joined result for JSON must be a key-value pair object. If the
     *            input is not a key-value pair object, Amazon SageMaker creates
     *            a new JSON file. In the new JSON file, and the input data is
     *            stored under the <code>SageMakerInput</code> key and the
     *            results are stored in <code>SageMakerOutput</code>.
     *            </p>
     *            <p>
     *            For CSV files, Amazon SageMaker combines the transformed data
     *            with the input data at the end of the input data and stores it
     *            in the output file. The joined data has the joined input data
     *            followed by the transformed data and the output is a CSV file.
     *            </p>
     * @see JoinSource
     */
    public void setJoinSource(JoinSource joinSource) {
        this.joinSource = joinSource.toString();
    }

    /**
     * <p>
     * Specifies the source of the data to join with the transformed data. The
     * valid values are <code>None</code> and <code>Input</code>. The default
     * value is <code>None</code>, which specifies not to join the input with
     * the transformed data. If you want the batch transform job to join the
     * original input data with the transformed data, set
     * <code>JoinSource</code> to <code>Input</code>.
     * </p>
     * <p>
     * For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker
     * adds the transformed data to the input JSON object in an attribute called
     * <code>SageMakerOutput</code>. The joined result for JSON must be a
     * key-value pair object. If the input is not a key-value pair object,
     * Amazon SageMaker creates a new JSON file. In the new JSON file, and the
     * input data is stored under the <code>SageMakerInput</code> key and the
     * results are stored in <code>SageMakerOutput</code>.
     * </p>
     * <p>
     * For CSV files, Amazon SageMaker combines the transformed data with the
     * input data at the end of the input data and stores it in the output file.
     * The joined data has the joined input data followed by the transformed
     * data and the output is a CSV file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Input, None
     *
     * @param joinSource <p>
     *            Specifies the source of the data to join with the transformed
     *            data. The valid values are <code>None</code> and
     *            <code>Input</code>. The default value is <code>None</code>,
     *            which specifies not to join the input with the transformed
     *            data. If you want the batch transform job to join the original
     *            input data with the transformed data, set
     *            <code>JoinSource</code> to <code>Input</code>.
     *            </p>
     *            <p>
     *            For JSON or JSONLines objects, such as a JSON array, Amazon
     *            SageMaker adds the transformed data to the input JSON object
     *            in an attribute called <code>SageMakerOutput</code>. The
     *            joined result for JSON must be a key-value pair object. If the
     *            input is not a key-value pair object, Amazon SageMaker creates
     *            a new JSON file. In the new JSON file, and the input data is
     *            stored under the <code>SageMakerInput</code> key and the
     *            results are stored in <code>SageMakerOutput</code>.
     *            </p>
     *            <p>
     *            For CSV files, Amazon SageMaker combines the transformed data
     *            with the input data at the end of the input data and stores it
     *            in the output file. The joined data has the joined input data
     *            followed by the transformed data and the output is a CSV file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JoinSource
     */
    public DataProcessing withJoinSource(JoinSource joinSource) {
        this.joinSource = joinSource.toString();
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
        if (getInputFilter() != null)
            sb.append("InputFilter: " + getInputFilter() + ",");
        if (getOutputFilter() != null)
            sb.append("OutputFilter: " + getOutputFilter() + ",");
        if (getJoinSource() != null)
            sb.append("JoinSource: " + getJoinSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputFilter() == null) ? 0 : getInputFilter().hashCode());
        hashCode = prime * hashCode
                + ((getOutputFilter() == null) ? 0 : getOutputFilter().hashCode());
        hashCode = prime * hashCode + ((getJoinSource() == null) ? 0 : getJoinSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProcessing == false)
            return false;
        DataProcessing other = (DataProcessing) obj;

        if (other.getInputFilter() == null ^ this.getInputFilter() == null)
            return false;
        if (other.getInputFilter() != null
                && other.getInputFilter().equals(this.getInputFilter()) == false)
            return false;
        if (other.getOutputFilter() == null ^ this.getOutputFilter() == null)
            return false;
        if (other.getOutputFilter() != null
                && other.getOutputFilter().equals(this.getOutputFilter()) == false)
            return false;
        if (other.getJoinSource() == null ^ this.getJoinSource() == null)
            return false;
        if (other.getJoinSource() != null
                && other.getJoinSource().equals(this.getJoinSource()) == false)
            return false;
        return true;
    }
}
