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

/**
 * <p>
 * Identifies the version of a specific slot.
 * </p>
 */
public class Slot implements Serializable {
    /**
     * <p>
     * The name of the slot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z](-|_|.)?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the slot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Required, Optional
     */
    private String slotConstraint;

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one
     * of the built-in slot types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     */
    private String slotType;

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String slotTypeVersion;

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     */
    private Prompt valueElicitationPrompt;

    /**
     * <p>
     * Directs Amazon Lex the order in which to elicit this slot value from the
     * user. For example, if the intent has two slots with priorities 1 and 2,
     * AWS Amazon Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Amazon Lex
     * elicits values is arbitrary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer priority;

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an
     * Amazon Lex request for a slot value, you can provide those utterances to
     * improve accuracy. This is optional. In most cases, Amazon Lex is capable
     * of understanding user utterances.
     * </p>
     */
    private java.util.List<String> sampleUtterances;

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients.
     * A user chooses an option from the response card, instead of using text to
     * reply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     */
    private String responseCard;

    /**
     * <p>
     * Determines whether a slot is obfuscated in conversation logs and stored
     * utterances. When you obfuscate a slot, the value is replaced by the slot
     * name in curly braces ({}). For example, if the slot name is "full_name",
     * obfuscated values are replaced with "{full_name}". For more information,
     * see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"> Slot
     * Obfuscation </a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DEFAULT_OBFUSCATION
     */
    private String obfuscationSetting;

    /**
     * <p>
     * The name of the slot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z](-|_|.)?)+$<br/>
     *
     * @return <p>
     *         The name of the slot.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the slot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z](-|_|.)?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z](-|_|.)?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the slot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the slot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the slot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the slot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the slot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Required, Optional
     *
     * @return <p>
     *         Specifies whether the slot is required or optional.
     *         </p>
     * @see SlotConstraint
     */
    public String getSlotConstraint() {
        return slotConstraint;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Required, Optional
     *
     * @param slotConstraint <p>
     *            Specifies whether the slot is required or optional.
     *            </p>
     * @see SlotConstraint
     */
    public void setSlotConstraint(String slotConstraint) {
        this.slotConstraint = slotConstraint;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Required, Optional
     *
     * @param slotConstraint <p>
     *            Specifies whether the slot is required or optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlotConstraint
     */
    public Slot withSlotConstraint(String slotConstraint) {
        this.slotConstraint = slotConstraint;
        return this;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Required, Optional
     *
     * @param slotConstraint <p>
     *            Specifies whether the slot is required or optional.
     *            </p>
     * @see SlotConstraint
     */
    public void setSlotConstraint(SlotConstraint slotConstraint) {
        this.slotConstraint = slotConstraint.toString();
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Required, Optional
     *
     * @param slotConstraint <p>
     *            Specifies whether the slot is required or optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlotConstraint
     */
    public Slot withSlotConstraint(SlotConstraint slotConstraint) {
        this.slotConstraint = slotConstraint.toString();
        return this;
    }

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one
     * of the built-in slot types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @return <p>
     *         The type of the slot, either a custom slot type that you defined
     *         or one of the built-in slot types.
     *         </p>
     */
    public String getSlotType() {
        return slotType;
    }

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one
     * of the built-in slot types.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @param slotType <p>
     *            The type of the slot, either a custom slot type that you
     *            defined or one of the built-in slot types.
     *            </p>
     */
    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one
     * of the built-in slot types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @param slotType <p>
     *            The type of the slot, either a custom slot type that you
     *            defined or one of the built-in slot types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withSlotType(String slotType) {
        this.slotType = slotType;
        return this;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the slot type.
     *         </p>
     */
    public String getSlotTypeVersion() {
        return slotTypeVersion;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param slotTypeVersion <p>
     *            The version of the slot type.
     *            </p>
     */
    public void setSlotTypeVersion(String slotTypeVersion) {
        this.slotTypeVersion = slotTypeVersion;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param slotTypeVersion <p>
     *            The version of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withSlotTypeVersion(String slotTypeVersion) {
        this.slotTypeVersion = slotTypeVersion;
        return this;
    }

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     *
     * @return <p>
     *         The prompt that Amazon Lex uses to elicit the slot value from the
     *         user.
     *         </p>
     */
    public Prompt getValueElicitationPrompt() {
        return valueElicitationPrompt;
    }

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     *
     * @param valueElicitationPrompt <p>
     *            The prompt that Amazon Lex uses to elicit the slot value from
     *            the user.
     *            </p>
     */
    public void setValueElicitationPrompt(Prompt valueElicitationPrompt) {
        this.valueElicitationPrompt = valueElicitationPrompt;
    }

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueElicitationPrompt <p>
     *            The prompt that Amazon Lex uses to elicit the slot value from
     *            the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withValueElicitationPrompt(Prompt valueElicitationPrompt) {
        this.valueElicitationPrompt = valueElicitationPrompt;
        return this;
    }

    /**
     * <p>
     * Directs Amazon Lex the order in which to elicit this slot value from the
     * user. For example, if the intent has two slots with priorities 1 and 2,
     * AWS Amazon Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Amazon Lex
     * elicits values is arbitrary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         Directs Amazon Lex the order in which to elicit this slot value
     *         from the user. For example, if the intent has two slots with
     *         priorities 1 and 2, AWS Amazon Lex first elicits a value for the
     *         slot with priority 1.
     *         </p>
     *         <p>
     *         If multiple slots share the same priority, the order in which
     *         Amazon Lex elicits values is arbitrary.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * Directs Amazon Lex the order in which to elicit this slot value from the
     * user. For example, if the intent has two slots with priorities 1 and 2,
     * AWS Amazon Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Amazon Lex
     * elicits values is arbitrary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param priority <p>
     *            Directs Amazon Lex the order in which to elicit this slot
     *            value from the user. For example, if the intent has two slots
     *            with priorities 1 and 2, AWS Amazon Lex first elicits a value
     *            for the slot with priority 1.
     *            </p>
     *            <p>
     *            If multiple slots share the same priority, the order in which
     *            Amazon Lex elicits values is arbitrary.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Directs Amazon Lex the order in which to elicit this slot value from the
     * user. For example, if the intent has two slots with priorities 1 and 2,
     * AWS Amazon Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Amazon Lex
     * elicits values is arbitrary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param priority <p>
     *            Directs Amazon Lex the order in which to elicit this slot
     *            value from the user. For example, if the intent has two slots
     *            with priorities 1 and 2, AWS Amazon Lex first elicits a value
     *            for the slot with priority 1.
     *            </p>
     *            <p>
     *            If multiple slots share the same priority, the order in which
     *            Amazon Lex elicits values is arbitrary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an
     * Amazon Lex request for a slot value, you can provide those utterances to
     * improve accuracy. This is optional. In most cases, Amazon Lex is capable
     * of understanding user utterances.
     * </p>
     *
     * @return <p>
     *         If you know a specific pattern with which users might respond to
     *         an Amazon Lex request for a slot value, you can provide those
     *         utterances to improve accuracy. This is optional. In most cases,
     *         Amazon Lex is capable of understanding user utterances.
     *         </p>
     */
    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an
     * Amazon Lex request for a slot value, you can provide those utterances to
     * improve accuracy. This is optional. In most cases, Amazon Lex is capable
     * of understanding user utterances.
     * </p>
     *
     * @param sampleUtterances <p>
     *            If you know a specific pattern with which users might respond
     *            to an Amazon Lex request for a slot value, you can provide
     *            those utterances to improve accuracy. This is optional. In
     *            most cases, Amazon Lex is capable of understanding user
     *            utterances.
     *            </p>
     */
    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an
     * Amazon Lex request for a slot value, you can provide those utterances to
     * improve accuracy. This is optional. In most cases, Amazon Lex is capable
     * of understanding user utterances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            If you know a specific pattern with which users might respond
     *            to an Amazon Lex request for a slot value, you can provide
     *            those utterances to improve accuracy. This is optional. In
     *            most cases, Amazon Lex is capable of understanding user
     *            utterances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withSampleUtterances(String... sampleUtterances) {
        if (getSampleUtterances() == null) {
            this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances.length);
        }
        for (String value : sampleUtterances) {
            this.sampleUtterances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an
     * Amazon Lex request for a slot value, you can provide those utterances to
     * improve accuracy. This is optional. In most cases, Amazon Lex is capable
     * of understanding user utterances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            If you know a specific pattern with which users might respond
     *            to an Amazon Lex request for a slot value, you can provide
     *            those utterances to improve accuracy. This is optional. In
     *            most cases, Amazon Lex is capable of understanding user
     *            utterances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients.
     * A user chooses an option from the response card, instead of using text to
     * reply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @return <p>
     *         A set of possible responses for the slot type used by text-based
     *         clients. A user chooses an option from the response card, instead
     *         of using text to reply.
     *         </p>
     */
    public String getResponseCard() {
        return responseCard;
    }

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients.
     * A user chooses an option from the response card, instead of using text to
     * reply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @param responseCard <p>
     *            A set of possible responses for the slot type used by
     *            text-based clients. A user chooses an option from the response
     *            card, instead of using text to reply.
     *            </p>
     */
    public void setResponseCard(String responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients.
     * A user chooses an option from the response card, instead of using text to
     * reply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @param responseCard <p>
     *            A set of possible responses for the slot type used by
     *            text-based clients. A user chooses an option from the response
     *            card, instead of using text to reply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Slot withResponseCard(String responseCard) {
        this.responseCard = responseCard;
        return this;
    }

    /**
     * <p>
     * Determines whether a slot is obfuscated in conversation logs and stored
     * utterances. When you obfuscate a slot, the value is replaced by the slot
     * name in curly braces ({}). For example, if the slot name is "full_name",
     * obfuscated values are replaced with "{full_name}". For more information,
     * see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"> Slot
     * Obfuscation </a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DEFAULT_OBFUSCATION
     *
     * @return <p>
     *         Determines whether a slot is obfuscated in conversation logs and
     *         stored utterances. When you obfuscate a slot, the value is
     *         replaced by the slot name in curly braces ({}). For example, if
     *         the slot name is "full_name", obfuscated values are replaced with
     *         "{full_name}". For more information, see <a href=
     *         "https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html">
     *         Slot Obfuscation </a>.
     *         </p>
     * @see ObfuscationSetting
     */
    public String getObfuscationSetting() {
        return obfuscationSetting;
    }

    /**
     * <p>
     * Determines whether a slot is obfuscated in conversation logs and stored
     * utterances. When you obfuscate a slot, the value is replaced by the slot
     * name in curly braces ({}). For example, if the slot name is "full_name",
     * obfuscated values are replaced with "{full_name}". For more information,
     * see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"> Slot
     * Obfuscation </a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DEFAULT_OBFUSCATION
     *
     * @param obfuscationSetting <p>
     *            Determines whether a slot is obfuscated in conversation logs
     *            and stored utterances. When you obfuscate a slot, the value is
     *            replaced by the slot name in curly braces ({}). For example,
     *            if the slot name is "full_name", obfuscated values are
     *            replaced with "{full_name}". For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"
     *            > Slot Obfuscation </a>.
     *            </p>
     * @see ObfuscationSetting
     */
    public void setObfuscationSetting(String obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting;
    }

    /**
     * <p>
     * Determines whether a slot is obfuscated in conversation logs and stored
     * utterances. When you obfuscate a slot, the value is replaced by the slot
     * name in curly braces ({}). For example, if the slot name is "full_name",
     * obfuscated values are replaced with "{full_name}". For more information,
     * see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"> Slot
     * Obfuscation </a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DEFAULT_OBFUSCATION
     *
     * @param obfuscationSetting <p>
     *            Determines whether a slot is obfuscated in conversation logs
     *            and stored utterances. When you obfuscate a slot, the value is
     *            replaced by the slot name in curly braces ({}). For example,
     *            if the slot name is "full_name", obfuscated values are
     *            replaced with "{full_name}". For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"
     *            > Slot Obfuscation </a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObfuscationSetting
     */
    public Slot withObfuscationSetting(String obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting;
        return this;
    }

    /**
     * <p>
     * Determines whether a slot is obfuscated in conversation logs and stored
     * utterances. When you obfuscate a slot, the value is replaced by the slot
     * name in curly braces ({}). For example, if the slot name is "full_name",
     * obfuscated values are replaced with "{full_name}". For more information,
     * see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"> Slot
     * Obfuscation </a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DEFAULT_OBFUSCATION
     *
     * @param obfuscationSetting <p>
     *            Determines whether a slot is obfuscated in conversation logs
     *            and stored utterances. When you obfuscate a slot, the value is
     *            replaced by the slot name in curly braces ({}). For example,
     *            if the slot name is "full_name", obfuscated values are
     *            replaced with "{full_name}". For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"
     *            > Slot Obfuscation </a>.
     *            </p>
     * @see ObfuscationSetting
     */
    public void setObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting.toString();
    }

    /**
     * <p>
     * Determines whether a slot is obfuscated in conversation logs and stored
     * utterances. When you obfuscate a slot, the value is replaced by the slot
     * name in curly braces ({}). For example, if the slot name is "full_name",
     * obfuscated values are replaced with "{full_name}". For more information,
     * see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"> Slot
     * Obfuscation </a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DEFAULT_OBFUSCATION
     *
     * @param obfuscationSetting <p>
     *            Determines whether a slot is obfuscated in conversation logs
     *            and stored utterances. When you obfuscate a slot, the value is
     *            replaced by the slot name in curly braces ({}). For example,
     *            if the slot name is "full_name", obfuscated values are
     *            replaced with "{full_name}". For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/how-obfuscate.html"
     *            > Slot Obfuscation </a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObfuscationSetting
     */
    public Slot withObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting.toString();
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
        if (getSlotConstraint() != null)
            sb.append("slotConstraint: " + getSlotConstraint() + ",");
        if (getSlotType() != null)
            sb.append("slotType: " + getSlotType() + ",");
        if (getSlotTypeVersion() != null)
            sb.append("slotTypeVersion: " + getSlotTypeVersion() + ",");
        if (getValueElicitationPrompt() != null)
            sb.append("valueElicitationPrompt: " + getValueElicitationPrompt() + ",");
        if (getPriority() != null)
            sb.append("priority: " + getPriority() + ",");
        if (getSampleUtterances() != null)
            sb.append("sampleUtterances: " + getSampleUtterances() + ",");
        if (getResponseCard() != null)
            sb.append("responseCard: " + getResponseCard() + ",");
        if (getObfuscationSetting() != null)
            sb.append("obfuscationSetting: " + getObfuscationSetting());
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
                + ((getSlotConstraint() == null) ? 0 : getSlotConstraint().hashCode());
        hashCode = prime * hashCode + ((getSlotType() == null) ? 0 : getSlotType().hashCode());
        hashCode = prime * hashCode
                + ((getSlotTypeVersion() == null) ? 0 : getSlotTypeVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getValueElicitationPrompt() == null) ? 0 : getValueElicitationPrompt()
                        .hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode
                + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        hashCode = prime * hashCode
                + ((getObfuscationSetting() == null) ? 0 : getObfuscationSetting().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Slot == false)
            return false;
        Slot other = (Slot) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlotConstraint() == null ^ this.getSlotConstraint() == null)
            return false;
        if (other.getSlotConstraint() != null
                && other.getSlotConstraint().equals(this.getSlotConstraint()) == false)
            return false;
        if (other.getSlotType() == null ^ this.getSlotType() == null)
            return false;
        if (other.getSlotType() != null && other.getSlotType().equals(this.getSlotType()) == false)
            return false;
        if (other.getSlotTypeVersion() == null ^ this.getSlotTypeVersion() == null)
            return false;
        if (other.getSlotTypeVersion() != null
                && other.getSlotTypeVersion().equals(this.getSlotTypeVersion()) == false)
            return false;
        if (other.getValueElicitationPrompt() == null ^ this.getValueElicitationPrompt() == null)
            return false;
        if (other.getValueElicitationPrompt() != null
                && other.getValueElicitationPrompt().equals(this.getValueElicitationPrompt()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null
                && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null
                && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        if (other.getObfuscationSetting() == null ^ this.getObfuscationSetting() == null)
            return false;
        if (other.getObfuscationSetting() != null
                && other.getObfuscationSetting().equals(this.getObfuscationSetting()) == false)
            return false;
        return true;
    }
}
