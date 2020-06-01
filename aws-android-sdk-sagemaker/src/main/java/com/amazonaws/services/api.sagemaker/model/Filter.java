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
 * A conditional statement for a search expression that includes a resource
 * property, a Boolean operator, and a value. Resources that match the statement
 * are returned in the results from the <a>Search</a> API.
 * </p>
 * <p>
 * If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon
 * SageMaker uses the equals operator.
 * </p>
 * <p>
 * In search, there are several property types:
 * </p>
 * <dl>
 * <dt>Metrics</dt>
 * <dd>
 * <p>
 * To define a metric filter, enter a value using the form
 * <code>"Metrics.&lt;name&gt;"</code>, where <code>&lt;name&gt;</code> is a
 * metric name. For example, the following filter searches for training jobs
 * with an <code>"accuracy"</code> metric greater than <code>"0.9"</code>:
 * </p>
 * <p>
 * <code>{</code>
 * </p>
 * <p>
 * <code>"Name": "Metrics.accuracy",</code>
 * </p>
 * <p>
 * <code>"Operator": "GreaterThan",</code>
 * </p>
 * <p>
 * <code>"Value": "0.9"</code>
 * </p>
 * <p>
 * <code>}</code>
 * </p>
 * </dd>
 * <dt>HyperParameters</dt>
 * <dd>
 * <p>
 * To define a hyperparameter filter, enter a value with the form
 * <code>"HyperParameters.&lt;name&gt;"</code>. Decimal hyperparameter values
 * are treated as a decimal in a comparison if the specified <code>Value</code>
 * is also a decimal value. If the specified <code>Value</code> is an integer,
 * the decimal hyperparameter values are treated as integers. For example, the
 * following filter is satisfied by training jobs with a
 * <code>"learning_rate"</code> hyperparameter that is less than
 * <code>"0.5"</code>:
 * </p>
 * <p>
 * <code> {</code>
 * </p>
 * <p>
 * <code> "Name": "HyperParameters.learning_rate",</code>
 * </p>
 * <p>
 * <code> "Operator": "LessThan",</code>
 * </p>
 * <p>
 * <code> "Value": "0.5"</code>
 * </p>
 * <p>
 * <code> }</code>
 * </p>
 * </dd>
 * <dt>Tags</dt>
 * <dd>
 * <p>
 * To define a tag filter, enter a value with the form
 * <code>Tags.&lt;key&gt;</code>.
 * </p>
 * </dd>
 * </dl>
 */
public class Filter implements Serializable {
    /**
     * <p>
     * A resource property name. For example, <code>TrainingJobName</code>. For
     * valid property names, see <a>SearchRecord</a>. You must specify a valid
     * property for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String name;

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The
     * operator field contains one of the following values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> equals <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> doesn't equal <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> contains the string <code>Value</code>. A
     * <code>SearchExpression</code> can include only one <code>Contains</code>
     * operator. Only supported for text properties.
     * </p>
     * </dd>
     * <dt>Exists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property exists.
     * </p>
     * </dd>
     * <dt>NotExists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property does not exist.
     * </p>
     * </dd>
     * <dt>In</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is one of the comma delimited strings in
     * <code>Value</code>. Only supported for text properties.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, NotEquals, GreaterThan,
     * GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists,
     * NotExists, In
     */
    private String operator;

    /**
     * <p>
     * A value used with <code>Name</code> and <code>Operator</code> to
     * determine which resources satisfy the filter's condition. For numerical
     * properties, <code>Value</code> must be an integer or floating-point
     * decimal. For timestamp properties, <code>Value</code> must be an ISO 8601
     * date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String value;

    /**
     * <p>
     * A resource property name. For example, <code>TrainingJobName</code>. For
     * valid property names, see <a>SearchRecord</a>. You must specify a valid
     * property for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A resource property name. For example,
     *         <code>TrainingJobName</code>. For valid property names, see
     *         <a>SearchRecord</a>. You must specify a valid property for the
     *         resource.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A resource property name. For example, <code>TrainingJobName</code>. For
     * valid property names, see <a>SearchRecord</a>. You must specify a valid
     * property for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param name <p>
     *            A resource property name. For example,
     *            <code>TrainingJobName</code>. For valid property names, see
     *            <a>SearchRecord</a>. You must specify a valid property for the
     *            resource.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A resource property name. For example, <code>TrainingJobName</code>. For
     * valid property names, see <a>SearchRecord</a>. You must specify a valid
     * property for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param name <p>
     *            A resource property name. For example,
     *            <code>TrainingJobName</code>. For valid property names, see
     *            <a>SearchRecord</a>. You must specify a valid property for the
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The
     * operator field contains one of the following values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> equals <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> doesn't equal <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> contains the string <code>Value</code>. A
     * <code>SearchExpression</code> can include only one <code>Contains</code>
     * operator. Only supported for text properties.
     * </p>
     * </dd>
     * <dt>Exists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property exists.
     * </p>
     * </dd>
     * <dt>NotExists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property does not exist.
     * </p>
     * </dd>
     * <dt>In</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is one of the comma delimited strings in
     * <code>Value</code>. Only supported for text properties.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, NotEquals, GreaterThan,
     * GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists,
     * NotExists, In
     *
     * @return <p>
     *         A Boolean binary operator that is used to evaluate the filter.
     *         The operator field contains one of the following values:
     *         </p>
     *         <dl>
     *         <dt>Equals</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> equals <code>Value</code>.
     *         </p>
     *         </dd>
     *         <dt>NotEquals</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> doesn't equal <code>Value</code>.
     *         </p>
     *         </dd>
     *         <dt>GreaterThan</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> is greater than <code>Value</code>
     *         . Not supported for text properties.
     *         </p>
     *         </dd>
     *         <dt>GreaterThanOrEqualTo</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> is greater than or equal to
     *         <code>Value</code>. Not supported for text properties.
     *         </p>
     *         </dd>
     *         <dt>LessThan</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> is less than <code>Value</code>.
     *         Not supported for text properties.
     *         </p>
     *         </dd>
     *         <dt>LessThanOrEqualTo</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> is less than or equal to
     *         <code>Value</code>. Not supported for text properties.
     *         </p>
     *         </dd>
     *         <dt>Contains</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> contains the string
     *         <code>Value</code>. A <code>SearchExpression</code> can include
     *         only one <code>Contains</code> operator. Only supported for text
     *         properties.
     *         </p>
     *         </dd>
     *         <dt>Exists</dt>
     *         <dd>
     *         <p>
     *         The <code>Name</code> property exists.
     *         </p>
     *         </dd>
     *         <dt>NotExists</dt>
     *         <dd>
     *         <p>
     *         The <code>Name</code> property does not exist.
     *         </p>
     *         </dd>
     *         <dt>In</dt>
     *         <dd>
     *         <p>
     *         The value of <code>Name</code> is one of the comma delimited
     *         strings in <code>Value</code>. Only supported for text
     *         properties.
     *         </p>
     *         </dd>
     *         </dl>
     * @see Operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The
     * operator field contains one of the following values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> equals <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> doesn't equal <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> contains the string <code>Value</code>. A
     * <code>SearchExpression</code> can include only one <code>Contains</code>
     * operator. Only supported for text properties.
     * </p>
     * </dd>
     * <dt>Exists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property exists.
     * </p>
     * </dd>
     * <dt>NotExists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property does not exist.
     * </p>
     * </dd>
     * <dt>In</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is one of the comma delimited strings in
     * <code>Value</code>. Only supported for text properties.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, NotEquals, GreaterThan,
     * GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists,
     * NotExists, In
     *
     * @param operator <p>
     *            A Boolean binary operator that is used to evaluate the filter.
     *            The operator field contains one of the following values:
     *            </p>
     *            <dl>
     *            <dt>Equals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> equals <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>NotEquals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> doesn't equal
     *            <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>GreaterThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>GreaterThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than <code>Value</code>
     *            . Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Contains</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> contains the string
     *            <code>Value</code>. A <code>SearchExpression</code> can
     *            include only one <code>Contains</code> operator. Only
     *            supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Exists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property exists.
     *            </p>
     *            </dd>
     *            <dt>NotExists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property does not exist.
     *            </p>
     *            </dd>
     *            <dt>In</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is one of the comma delimited
     *            strings in <code>Value</code>. Only supported for text
     *            properties.
     *            </p>
     *            </dd>
     *            </dl>
     * @see Operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The
     * operator field contains one of the following values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> equals <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> doesn't equal <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> contains the string <code>Value</code>. A
     * <code>SearchExpression</code> can include only one <code>Contains</code>
     * operator. Only supported for text properties.
     * </p>
     * </dd>
     * <dt>Exists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property exists.
     * </p>
     * </dd>
     * <dt>NotExists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property does not exist.
     * </p>
     * </dd>
     * <dt>In</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is one of the comma delimited strings in
     * <code>Value</code>. Only supported for text properties.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, NotEquals, GreaterThan,
     * GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists,
     * NotExists, In
     *
     * @param operator <p>
     *            A Boolean binary operator that is used to evaluate the filter.
     *            The operator field contains one of the following values:
     *            </p>
     *            <dl>
     *            <dt>Equals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> equals <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>NotEquals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> doesn't equal
     *            <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>GreaterThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>GreaterThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than <code>Value</code>
     *            . Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Contains</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> contains the string
     *            <code>Value</code>. A <code>SearchExpression</code> can
     *            include only one <code>Contains</code> operator. Only
     *            supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Exists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property exists.
     *            </p>
     *            </dd>
     *            <dt>NotExists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property does not exist.
     *            </p>
     *            </dd>
     *            <dt>In</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is one of the comma delimited
     *            strings in <code>Value</code>. Only supported for text
     *            properties.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Operator
     */
    public Filter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The
     * operator field contains one of the following values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> equals <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> doesn't equal <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> contains the string <code>Value</code>. A
     * <code>SearchExpression</code> can include only one <code>Contains</code>
     * operator. Only supported for text properties.
     * </p>
     * </dd>
     * <dt>Exists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property exists.
     * </p>
     * </dd>
     * <dt>NotExists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property does not exist.
     * </p>
     * </dd>
     * <dt>In</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is one of the comma delimited strings in
     * <code>Value</code>. Only supported for text properties.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, NotEquals, GreaterThan,
     * GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists,
     * NotExists, In
     *
     * @param operator <p>
     *            A Boolean binary operator that is used to evaluate the filter.
     *            The operator field contains one of the following values:
     *            </p>
     *            <dl>
     *            <dt>Equals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> equals <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>NotEquals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> doesn't equal
     *            <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>GreaterThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>GreaterThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than <code>Value</code>
     *            . Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Contains</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> contains the string
     *            <code>Value</code>. A <code>SearchExpression</code> can
     *            include only one <code>Contains</code> operator. Only
     *            supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Exists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property exists.
     *            </p>
     *            </dd>
     *            <dt>NotExists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property does not exist.
     *            </p>
     *            </dd>
     *            <dt>In</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is one of the comma delimited
     *            strings in <code>Value</code>. Only supported for text
     *            properties.
     *            </p>
     *            </dd>
     *            </dl>
     * @see Operator
     */
    public void setOperator(Operator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The
     * operator field contains one of the following values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> equals <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> doesn't equal <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is greater than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than <code>Value</code>. Not
     * supported for text properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is less than or equal to
     * <code>Value</code>. Not supported for text properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> contains the string <code>Value</code>. A
     * <code>SearchExpression</code> can include only one <code>Contains</code>
     * operator. Only supported for text properties.
     * </p>
     * </dd>
     * <dt>Exists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property exists.
     * </p>
     * </dd>
     * <dt>NotExists</dt>
     * <dd>
     * <p>
     * The <code>Name</code> property does not exist.
     * </p>
     * </dd>
     * <dt>In</dt>
     * <dd>
     * <p>
     * The value of <code>Name</code> is one of the comma delimited strings in
     * <code>Value</code>. Only supported for text properties.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equals, NotEquals, GreaterThan,
     * GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists,
     * NotExists, In
     *
     * @param operator <p>
     *            A Boolean binary operator that is used to evaluate the filter.
     *            The operator field contains one of the following values:
     *            </p>
     *            <dl>
     *            <dt>Equals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> equals <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>NotEquals</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> doesn't equal
     *            <code>Value</code>.
     *            </p>
     *            </dd>
     *            <dt>GreaterThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>GreaterThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is greater than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThan</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than <code>Value</code>
     *            . Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>LessThanOrEqualTo</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is less than or equal to
     *            <code>Value</code>. Not supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Contains</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> contains the string
     *            <code>Value</code>. A <code>SearchExpression</code> can
     *            include only one <code>Contains</code> operator. Only
     *            supported for text properties.
     *            </p>
     *            </dd>
     *            <dt>Exists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property exists.
     *            </p>
     *            </dd>
     *            <dt>NotExists</dt>
     *            <dd>
     *            <p>
     *            The <code>Name</code> property does not exist.
     *            </p>
     *            </dd>
     *            <dt>In</dt>
     *            <dd>
     *            <p>
     *            The value of <code>Name</code> is one of the comma delimited
     *            strings in <code>Value</code>. Only supported for text
     *            properties.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Operator
     */
    public Filter withOperator(Operator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * A value used with <code>Name</code> and <code>Operator</code> to
     * determine which resources satisfy the filter's condition. For numerical
     * properties, <code>Value</code> must be an integer or floating-point
     * decimal. For timestamp properties, <code>Value</code> must be an ISO 8601
     * date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A value used with <code>Name</code> and <code>Operator</code> to
     *         determine which resources satisfy the filter's condition. For
     *         numerical properties, <code>Value</code> must be an integer or
     *         floating-point decimal. For timestamp properties,
     *         <code>Value</code> must be an ISO 8601 date-time string of the
     *         following format: <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * A value used with <code>Name</code> and <code>Operator</code> to
     * determine which resources satisfy the filter's condition. For numerical
     * properties, <code>Value</code> must be an integer or floating-point
     * decimal. For timestamp properties, <code>Value</code> must be an ISO 8601
     * date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param value <p>
     *            A value used with <code>Name</code> and <code>Operator</code>
     *            to determine which resources satisfy the filter's condition.
     *            For numerical properties, <code>Value</code> must be an
     *            integer or floating-point decimal. For timestamp properties,
     *            <code>Value</code> must be an ISO 8601 date-time string of the
     *            following format: <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A value used with <code>Name</code> and <code>Operator</code> to
     * determine which resources satisfy the filter's condition. For numerical
     * properties, <code>Value</code> must be an integer or floating-point
     * decimal. For timestamp properties, <code>Value</code> must be an ISO 8601
     * date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param value <p>
     *            A value used with <code>Name</code> and <code>Operator</code>
     *            to determine which resources satisfy the filter's condition.
     *            For numerical properties, <code>Value</code> must be an
     *            integer or floating-point decimal. For timestamp properties,
     *            <code>Value</code> must be an ISO 8601 date-time string of the
     *            following format: <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withValue(String value) {
        this.value = value;
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
        if (getOperator() != null)
            sb.append("Operator: " + getOperator() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
