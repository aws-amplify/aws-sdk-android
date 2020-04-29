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

package com.amazonaws.services.awswaf.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation failed because AWS WAF didn't recognize a parameter in the
 * request. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You specified an invalid parameter name.
 * </p>
 * </li>
 * <li>
 * <p>
 * You specified an invalid value.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>,
 * <code>Rule</code>, or <code>WebACL</code>) using an action other than
 * <code>INSERT</code> or <code>DELETE</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to create a <code>WebACL</code> with a <code>DefaultAction</code>
 * <code>Type</code> other than <code>ALLOW</code>, <code>BLOCK</code>, or
 * <code>COUNT</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code>
 * value other than <code>IP</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>WebACL</code> with a <code>WafAction</code>
 * <code>Type</code> other than <code>ALLOW</code>, <code>BLOCK</code>, or
 * <code>COUNT</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>ByteMatchSet</code> with a
 * <code>FieldToMatch</code> <code>Type</code> other than HEADER, METHOD,
 * QUERY_STRING, URI, or BODY.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of
 * <code>HEADER</code> but no value for <code>Data</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your request references an ARN that is malformed, or corresponds to a
 * resource with which a web ACL cannot be associated.
 * </p>
 * </li>
 * </ul>
 */
public class WAFInvalidParameterException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String field;

    private String parameter;

    private String reason;

    /**
     * Constructs a new WAFInvalidParameterException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public WAFInvalidParameterException(String message) {
        super(message);
    }

    /**
     * Returns the value of the field property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_ACTION, WAF_ACTION, WAF_OVERRIDE_ACTION,
     * PREDICATE_TYPE, IPSET_TYPE, BYTE_MATCH_FIELD_TYPE,
     * SQL_INJECTION_MATCH_FIELD_TYPE, BYTE_MATCH_TEXT_TRANSFORMATION,
     * BYTE_MATCH_POSITIONAL_CONSTRAINT, SIZE_CONSTRAINT_COMPARISON_OPERATOR,
     * GEO_MATCH_LOCATION_TYPE, GEO_MATCH_LOCATION_VALUE, RATE_KEY, RULE_TYPE,
     * NEXT_MARKER, RESOURCE_ARN, TAGS, TAG_KEYS
     *
     * @return The value of the field property for this object.
     * @see ParameterExceptionField
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of field
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_ACTION, WAF_ACTION, WAF_OVERRIDE_ACTION,
     * PREDICATE_TYPE, IPSET_TYPE, BYTE_MATCH_FIELD_TYPE,
     * SQL_INJECTION_MATCH_FIELD_TYPE, BYTE_MATCH_TEXT_TRANSFORMATION,
     * BYTE_MATCH_POSITIONAL_CONSTRAINT, SIZE_CONSTRAINT_COMPARISON_OPERATOR,
     * GEO_MATCH_LOCATION_TYPE, GEO_MATCH_LOCATION_VALUE, RATE_KEY, RULE_TYPE,
     * NEXT_MARKER, RESOURCE_ARN, TAGS, TAG_KEYS
     *
     * @param field The new value for the field property for this object.
     * @see ParameterExceptionField
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Returns the value of the parameter property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the parameter property for this object.
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of parameter
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param parameter The new value for the parameter property for this
     *            object.
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * Returns the value of the reason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_OPTION, ILLEGAL_COMBINATION,
     * ILLEGAL_ARGUMENT, INVALID_TAG_KEY
     *
     * @return The value of the reason property for this object.
     * @see ParameterExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_OPTION, ILLEGAL_COMBINATION,
     * ILLEGAL_ARGUMENT, INVALID_TAG_KEY
     *
     * @param reason The new value for the reason property for this object.
     * @see ParameterExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
