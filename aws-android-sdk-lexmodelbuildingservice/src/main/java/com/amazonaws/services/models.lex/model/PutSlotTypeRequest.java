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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a custom slot type or replaces an existing custom slot type.
 * </p>
 * <p>
 * To create a custom slot type, specify a name for the slot type and a set of
 * enumeration values, which are the values that a slot of this type can assume.
 * For more information, see <a>how-it-works</a>.
 * </p>
 * <p>
 * If you specify the name of an existing slot type, the fields in the request
 * replace the existing values in the <code>$LATEST</code> version of the slot
 * type. Amazon Lex removes the fields that you don't provide in the request. If
 * you don't specify required fields, Amazon Lex throws an exception. When you
 * update the <code>$LATEST</code> version of a slot type, if a bot uses the
 * <code>$LATEST</code> version of an intent that contains the slot type, the
 * bot's <code>status</code> field is set to <code>NOT_BUILT</code>.
 * </p>
 * <p>
 * This operation requires permissions for the <code>lex:PutSlotType</code>
 * action.
 * </p>
 */
public class PutSlotTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type
     * name with "AMAZON." removed. For example, because there is a built-in
     * slot type called <code>AMAZON.DATE</code>, you can't create a custom slot
     * type called <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take. Each value can have a list of
     * <code>synonyms</code>, which are additional values that help train the
     * machine learning model about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list
     * that contains up to five possible values for the slot. If you are using a
     * Lambda function, this resolution list is passed to the function. If you
     * are not using a Lambda function you can choose to return the value that
     * the user entered or the first value in the resolution list as the slot
     * value. The <code>valueSelectionStrategy</code> field indicates the option
     * to use.
     * </p>
     */
    private java.util.List<EnumerationValue> enumerationValues;

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return
     * slot type values. The field can be set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if
     * the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot,
     * return the first value in the resolution list as the slot type value. If
     * there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default
     * is <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     */
    private String valueSelectionStrategy;

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the slot type is
     * created. This is the same as calling the
     * <code>CreateSlotTypeVersion</code> operation. If you do not specify
     * <code>createVersion</code>, the default is <code>false</code>.
     * </p>
     */
    private Boolean createVersion;

    /**
     * <p>
     * The built-in slot type used as the parent of the slot type. When you
     * define a parent slot type, the new slot type has all of the same
     * configuration as the parent.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     */
    private String parentSlotTypeSignature;

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type. The
     * configuration is added to the settings for the parent slot type.
     * </p>
     */
    private java.util.List<SlotTypeConfiguration> slotTypeConfigurations;

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type
     * name with "AMAZON." removed. For example, because there is a built-in
     * slot type called <code>AMAZON.DATE</code>, you can't create a custom slot
     * type called <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the slot type. The name is <i>not</i> case sensitive.
     *         </p>
     *         <p>
     *         The name can't match a built-in slot type name, or a built-in
     *         slot type name with "AMAZON." removed. For example, because there
     *         is a built-in slot type called <code>AMAZON.DATE</code>, you
     *         can't create a custom slot type called <code>DATE</code>.
     *         </p>
     *         <p>
     *         For a list of built-in slot types, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     *         >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type
     * name with "AMAZON." removed. For example, because there is a built-in
     * slot type called <code>AMAZON.DATE</code>, you can't create a custom slot
     * type called <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot type. The name is <i>not</i> case
     *            sensitive.
     *            </p>
     *            <p>
     *            The name can't match a built-in slot type name, or a built-in
     *            slot type name with "AMAZON." removed. For example, because
     *            there is a built-in slot type called <code>AMAZON.DATE</code>,
     *            you can't create a custom slot type called <code>DATE</code>.
     *            </p>
     *            <p>
     *            For a list of built-in slot types, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     *            >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in slot type name, or a built-in slot type
     * name with "AMAZON." removed. For example, because there is a built-in
     * slot type called <code>AMAZON.DATE</code>, you can't create a custom slot
     * type called <code>DATE</code>.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot type. The name is <i>not</i> case
     *            sensitive.
     *            </p>
     *            <p>
     *            The name can't match a built-in slot type name, or a built-in
     *            slot type name with "AMAZON." removed. For example, because
     *            there is a built-in slot type called <code>AMAZON.DATE</code>,
     *            you can't create a custom slot type called <code>DATE</code>.
     *            </p>
     *            <p>
     *            For a list of built-in slot types, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     *            >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the slot type.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the slot type.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take. Each value can have a list of
     * <code>synonyms</code>, which are additional values that help train the
     * machine learning model about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list
     * that contains up to five possible values for the slot. If you are using a
     * Lambda function, this resolution list is passed to the function. If you
     * are not using a Lambda function you can choose to return the value that
     * the user entered or the first value in the resolution list as the slot
     * value. The <code>valueSelectionStrategy</code> field indicates the option
     * to use.
     * </p>
     *
     * @return <p>
     *         A list of <code>EnumerationValue</code> objects that defines the
     *         values that the slot type can take. Each value can have a list of
     *         <code>synonyms</code>, which are additional values that help
     *         train the machine learning model about the values that it
     *         resolves for a slot.
     *         </p>
     *         <p>
     *         When Amazon Lex resolves a slot value, it generates a resolution
     *         list that contains up to five possible values for the slot. If
     *         you are using a Lambda function, this resolution list is passed
     *         to the function. If you are not using a Lambda function you can
     *         choose to return the value that the user entered or the first
     *         value in the resolution list as the slot value. The
     *         <code>valueSelectionStrategy</code> field indicates the option to
     *         use.
     *         </p>
     */
    public java.util.List<EnumerationValue> getEnumerationValues() {
        return enumerationValues;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take. Each value can have a list of
     * <code>synonyms</code>, which are additional values that help train the
     * machine learning model about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list
     * that contains up to five possible values for the slot. If you are using a
     * Lambda function, this resolution list is passed to the function. If you
     * are not using a Lambda function you can choose to return the value that
     * the user entered or the first value in the resolution list as the slot
     * value. The <code>valueSelectionStrategy</code> field indicates the option
     * to use.
     * </p>
     *
     * @param enumerationValues <p>
     *            A list of <code>EnumerationValue</code> objects that defines
     *            the values that the slot type can take. Each value can have a
     *            list of <code>synonyms</code>, which are additional values
     *            that help train the machine learning model about the values
     *            that it resolves for a slot.
     *            </p>
     *            <p>
     *            When Amazon Lex resolves a slot value, it generates a
     *            resolution list that contains up to five possible values for
     *            the slot. If you are using a Lambda function, this resolution
     *            list is passed to the function. If you are not using a Lambda
     *            function you can choose to return the value that the user
     *            entered or the first value in the resolution list as the slot
     *            value. The <code>valueSelectionStrategy</code> field indicates
     *            the option to use.
     *            </p>
     */
    public void setEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        if (enumerationValues == null) {
            this.enumerationValues = null;
            return;
        }

        this.enumerationValues = new java.util.ArrayList<EnumerationValue>(enumerationValues);
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take. Each value can have a list of
     * <code>synonyms</code>, which are additional values that help train the
     * machine learning model about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list
     * that contains up to five possible values for the slot. If you are using a
     * Lambda function, this resolution list is passed to the function. If you
     * are not using a Lambda function you can choose to return the value that
     * the user entered or the first value in the resolution list as the slot
     * value. The <code>valueSelectionStrategy</code> field indicates the option
     * to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enumerationValues <p>
     *            A list of <code>EnumerationValue</code> objects that defines
     *            the values that the slot type can take. Each value can have a
     *            list of <code>synonyms</code>, which are additional values
     *            that help train the machine learning model about the values
     *            that it resolves for a slot.
     *            </p>
     *            <p>
     *            When Amazon Lex resolves a slot value, it generates a
     *            resolution list that contains up to five possible values for
     *            the slot. If you are using a Lambda function, this resolution
     *            list is passed to the function. If you are not using a Lambda
     *            function you can choose to return the value that the user
     *            entered or the first value in the resolution list as the slot
     *            value. The <code>valueSelectionStrategy</code> field indicates
     *            the option to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withEnumerationValues(EnumerationValue... enumerationValues) {
        if (getEnumerationValues() == null) {
            this.enumerationValues = new java.util.ArrayList<EnumerationValue>(
                    enumerationValues.length);
        }
        for (EnumerationValue value : enumerationValues) {
            this.enumerationValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take. Each value can have a list of
     * <code>synonyms</code>, which are additional values that help train the
     * machine learning model about the values that it resolves for a slot.
     * </p>
     * <p>
     * When Amazon Lex resolves a slot value, it generates a resolution list
     * that contains up to five possible values for the slot. If you are using a
     * Lambda function, this resolution list is passed to the function. If you
     * are not using a Lambda function you can choose to return the value that
     * the user entered or the first value in the resolution list as the slot
     * value. The <code>valueSelectionStrategy</code> field indicates the option
     * to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enumerationValues <p>
     *            A list of <code>EnumerationValue</code> objects that defines
     *            the values that the slot type can take. Each value can have a
     *            list of <code>synonyms</code>, which are additional values
     *            that help train the machine learning model about the values
     *            that it resolves for a slot.
     *            </p>
     *            <p>
     *            When Amazon Lex resolves a slot value, it generates a
     *            resolution list that contains up to five possible values for
     *            the slot. If you are using a Lambda function, this resolution
     *            list is passed to the function. If you are not using a Lambda
     *            function you can choose to return the value that the user
     *            entered or the first value in the resolution list as the slot
     *            value. The <code>valueSelectionStrategy</code> field indicates
     *            the option to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withEnumerationValues(
            java.util.Collection<EnumerationValue> enumerationValues) {
        setEnumerationValues(enumerationValues);
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @return <p>
     *         Identifies a specific revision of the <code>$LATEST</code>
     *         version.
     *         </p>
     *         <p>
     *         When you create a new slot type, leave the <code>checksum</code>
     *         field blank. If you specify a checksum you get a
     *         <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a slot type, set the
     *         <code>checksum</code> field to the checksum of the most recent
     *         revision of the <code>$LATEST</code> version. If you don't
     *         specify the <code> checksum</code> field, or if the checksum does
     *         not match the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new slot type, leave the
     *            <code>checksum</code> field blank. If you specify a checksum
     *            you get a <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a slot type, set the
     *            <code>checksum</code> field to the checksum of the most recent
     *            revision of the <code>$LATEST</code> version. If you don't
     *            specify the <code> checksum</code> field, or if the checksum
     *            does not match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new slot type, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a slot type, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new slot type, leave the
     *            <code>checksum</code> field blank. If you specify a checksum
     *            you get a <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a slot type, set the
     *            <code>checksum</code> field to the checksum of the most recent
     *            revision of the <code>$LATEST</code> version. If you don't
     *            specify the <code> checksum</code> field, or if the checksum
     *            does not match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return
     * slot type values. The field can be set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if
     * the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot,
     * return the first value in the resolution list as the slot type value. If
     * there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default
     * is <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @return <p>
     *         Determines the slot resolution strategy that Amazon Lex uses to
     *         return slot type values. The field can be set to one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ORIGINAL_VALUE</code> - Returns the value entered by the
     *         user, if the user value is similar to the slot value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOP_RESOLUTION</code> - If there is a resolution list for
     *         the slot, return the first value in the resolution list as the
     *         slot type value. If there is no resolution list, null is
     *         returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify the <code>valueSelectionStrategy</code>, the
     *         default is <code>ORIGINAL_VALUE</code>.
     *         </p>
     * @see SlotValueSelectionStrategy
     */
    public String getValueSelectionStrategy() {
        return valueSelectionStrategy;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return
     * slot type values. The field can be set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if
     * the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot,
     * return the first value in the resolution list as the slot type value. If
     * there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default
     * is <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            Determines the slot resolution strategy that Amazon Lex uses
     *            to return slot type values. The field can be set to one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORIGINAL_VALUE</code> - Returns the value entered by the
     *            user, if the user value is similar to the slot value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_RESOLUTION</code> - If there is a resolution list
     *            for the slot, return the first value in the resolution list as
     *            the slot type value. If there is no resolution list, null is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify the <code>valueSelectionStrategy</code>,
     *            the default is <code>ORIGINAL_VALUE</code>.
     *            </p>
     * @see SlotValueSelectionStrategy
     */
    public void setValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return
     * slot type values. The field can be set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if
     * the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot,
     * return the first value in the resolution list as the slot type value. If
     * there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default
     * is <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            Determines the slot resolution strategy that Amazon Lex uses
     *            to return slot type values. The field can be set to one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORIGINAL_VALUE</code> - Returns the value entered by the
     *            user, if the user value is similar to the slot value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_RESOLUTION</code> - If there is a resolution list
     *            for the slot, return the first value in the resolution list as
     *            the slot type value. If there is no resolution list, null is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify the <code>valueSelectionStrategy</code>,
     *            the default is <code>ORIGINAL_VALUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlotValueSelectionStrategy
     */
    public PutSlotTypeRequest withValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
        return this;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return
     * slot type values. The field can be set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if
     * the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot,
     * return the first value in the resolution list as the slot type value. If
     * there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default
     * is <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            Determines the slot resolution strategy that Amazon Lex uses
     *            to return slot type values. The field can be set to one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORIGINAL_VALUE</code> - Returns the value entered by the
     *            user, if the user value is similar to the slot value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_RESOLUTION</code> - If there is a resolution list
     *            for the slot, return the first value in the resolution list as
     *            the slot type value. If there is no resolution list, null is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify the <code>valueSelectionStrategy</code>,
     *            the default is <code>ORIGINAL_VALUE</code>.
     *            </p>
     * @see SlotValueSelectionStrategy
     */
    public void setValueSelectionStrategy(SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return
     * slot type values. The field can be set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORIGINAL_VALUE</code> - Returns the value entered by the user, if
     * the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_RESOLUTION</code> - If there is a resolution list for the slot,
     * return the first value in the resolution list as the slot type value. If
     * there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionStrategy</code>, the default
     * is <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            Determines the slot resolution strategy that Amazon Lex uses
     *            to return slot type values. The field can be set to one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ORIGINAL_VALUE</code> - Returns the value entered by the
     *            user, if the user value is similar to the slot value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_RESOLUTION</code> - If there is a resolution list
     *            for the slot, return the first value in the resolution list as
     *            the slot type value. If there is no resolution list, null is
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify the <code>valueSelectionStrategy</code>,
     *            the default is <code>ORIGINAL_VALUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlotValueSelectionStrategy
     */
    public PutSlotTypeRequest withValueSelectionStrategy(
            SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the slot type is
     * created. This is the same as calling the
     * <code>CreateSlotTypeVersion</code> operation. If you do not specify
     * <code>createVersion</code>, the default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> a new numbered version of the slot
     *         type is created. This is the same as calling the
     *         <code>CreateSlotTypeVersion</code> operation. If you do not
     *         specify <code>createVersion</code>, the default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the slot type is
     * created. This is the same as calling the
     * <code>CreateSlotTypeVersion</code> operation. If you do not specify
     * <code>createVersion</code>, the default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> a new numbered version of the slot
     *         type is created. This is the same as calling the
     *         <code>CreateSlotTypeVersion</code> operation. If you do not
     *         specify <code>createVersion</code>, the default is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the slot type is
     * created. This is the same as calling the
     * <code>CreateSlotTypeVersion</code> operation. If you do not specify
     * <code>createVersion</code>, the default is <code>false</code>.
     * </p>
     *
     * @param createVersion <p>
     *            When set to <code>true</code> a new numbered version of the
     *            slot type is created. This is the same as calling the
     *            <code>CreateSlotTypeVersion</code> operation. If you do not
     *            specify <code>createVersion</code>, the default is
     *            <code>false</code>.
     *            </p>
     */
    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the slot type is
     * created. This is the same as calling the
     * <code>CreateSlotTypeVersion</code> operation. If you do not specify
     * <code>createVersion</code>, the default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVersion <p>
     *            When set to <code>true</code> a new numbered version of the
     *            slot type is created. This is the same as calling the
     *            <code>CreateSlotTypeVersion</code> operation. If you do not
     *            specify <code>createVersion</code>, the default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
        return this;
    }

    /**
     * <p>
     * The built-in slot type used as the parent of the slot type. When you
     * define a parent slot type, the new slot type has all of the same
     * configuration as the parent.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @return <p>
     *         The built-in slot type used as the parent of the slot type. When
     *         you define a parent slot type, the new slot type has all of the
     *         same configuration as the parent.
     *         </p>
     *         <p>
     *         Only <code>AMAZON.AlphaNumeric</code> is supported.
     *         </p>
     */
    public String getParentSlotTypeSignature() {
        return parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used as the parent of the slot type. When you
     * define a parent slot type, the new slot type has all of the same
     * configuration as the parent.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @param parentSlotTypeSignature <p>
     *            The built-in slot type used as the parent of the slot type.
     *            When you define a parent slot type, the new slot type has all
     *            of the same configuration as the parent.
     *            </p>
     *            <p>
     *            Only <code>AMAZON.AlphaNumeric</code> is supported.
     *            </p>
     */
    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used as the parent of the slot type. When you
     * define a parent slot type, the new slot type has all of the same
     * configuration as the parent.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @param parentSlotTypeSignature <p>
     *            The built-in slot type used as the parent of the slot type.
     *            When you define a parent slot type, the new slot type has all
     *            of the same configuration as the parent.
     *            </p>
     *            <p>
     *            Only <code>AMAZON.AlphaNumeric</code> is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
        return this;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type. The
     * configuration is added to the settings for the parent slot type.
     * </p>
     *
     * @return <p>
     *         Configuration information that extends the parent built-in slot
     *         type. The configuration is added to the settings for the parent
     *         slot type.
     *         </p>
     */
    public java.util.List<SlotTypeConfiguration> getSlotTypeConfigurations() {
        return slotTypeConfigurations;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type. The
     * configuration is added to the settings for the parent slot type.
     * </p>
     *
     * @param slotTypeConfigurations <p>
     *            Configuration information that extends the parent built-in
     *            slot type. The configuration is added to the settings for the
     *            parent slot type.
     *            </p>
     */
    public void setSlotTypeConfigurations(
            java.util.Collection<SlotTypeConfiguration> slotTypeConfigurations) {
        if (slotTypeConfigurations == null) {
            this.slotTypeConfigurations = null;
            return;
        }

        this.slotTypeConfigurations = new java.util.ArrayList<SlotTypeConfiguration>(
                slotTypeConfigurations);
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type. The
     * configuration is added to the settings for the parent slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypeConfigurations <p>
     *            Configuration information that extends the parent built-in
     *            slot type. The configuration is added to the settings for the
     *            parent slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withSlotTypeConfigurations(
            SlotTypeConfiguration... slotTypeConfigurations) {
        if (getSlotTypeConfigurations() == null) {
            this.slotTypeConfigurations = new java.util.ArrayList<SlotTypeConfiguration>(
                    slotTypeConfigurations.length);
        }
        for (SlotTypeConfiguration value : slotTypeConfigurations) {
            this.slotTypeConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type. The
     * configuration is added to the settings for the parent slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypeConfigurations <p>
     *            Configuration information that extends the parent built-in
     *            slot type. The configuration is added to the settings for the
     *            parent slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSlotTypeRequest withSlotTypeConfigurations(
            java.util.Collection<SlotTypeConfiguration> slotTypeConfigurations) {
        setSlotTypeConfigurations(slotTypeConfigurations);
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
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getEnumerationValues() != null)
            sb.append("enumerationValues: " + getEnumerationValues() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getValueSelectionStrategy() != null)
            sb.append("valueSelectionStrategy: " + getValueSelectionStrategy() + ",");
        if (getCreateVersion() != null)
            sb.append("createVersion: " + getCreateVersion() + ",");
        if (getParentSlotTypeSignature() != null)
            sb.append("parentSlotTypeSignature: " + getParentSlotTypeSignature() + ",");
        if (getSlotTypeConfigurations() != null)
            sb.append("slotTypeConfigurations: " + getSlotTypeConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEnumerationValues() == null) ? 0 : getEnumerationValues().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime
                * hashCode
                + ((getValueSelectionStrategy() == null) ? 0 : getValueSelectionStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getParentSlotTypeSignature() == null) ? 0 : getParentSlotTypeSignature()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSlotTypeConfigurations() == null) ? 0 : getSlotTypeConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSlotTypeRequest == false)
            return false;
        PutSlotTypeRequest other = (PutSlotTypeRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnumerationValues() == null ^ this.getEnumerationValues() == null)
            return false;
        if (other.getEnumerationValues() != null
                && other.getEnumerationValues().equals(this.getEnumerationValues()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getValueSelectionStrategy() == null ^ this.getValueSelectionStrategy() == null)
            return false;
        if (other.getValueSelectionStrategy() != null
                && other.getValueSelectionStrategy().equals(this.getValueSelectionStrategy()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null
                && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        if (other.getParentSlotTypeSignature() == null ^ this.getParentSlotTypeSignature() == null)
            return false;
        if (other.getParentSlotTypeSignature() != null
                && other.getParentSlotTypeSignature().equals(this.getParentSlotTypeSignature()) == false)
            return false;
        if (other.getSlotTypeConfigurations() == null ^ this.getSlotTypeConfigurations() == null)
            return false;
        if (other.getSlotTypeConfigurations() != null
                && other.getSlotTypeConfigurations().equals(this.getSlotTypeConfigurations()) == false)
            return false;
        return true;
    }
}
