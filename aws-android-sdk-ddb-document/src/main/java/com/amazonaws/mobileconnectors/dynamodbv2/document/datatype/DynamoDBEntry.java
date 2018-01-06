package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.services.dynamodbv2.model.AttributeAction;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.google.gson.Gson;

import java.nio.ByteBuffer;

/**
 * Abstract class representing an arbitrary DynamoDB attribute value
 */
public abstract class DynamoDBEntry {

    private static final Gson GSON = new Gson();

    /**
     * Converts a {@link DynamoDBEntry} to {@link AttributeValue}
     *
     * @return {@link AttributeValue}.
     */
    public abstract AttributeValue convertToAttributeValue();

    /**
     * Converts a {@link DynamoDBEntry} to {@link AttributeValueUpdate}.
     *
     * @return {@link AttributeValueUpdate}.
     */
    public AttributeValueUpdate convertToAttributeUpdateValue() {
        final AttributeValue attributeValue = this.convertToAttributeValue();

        final AttributeValueUpdate attributeUpdate = new AttributeValueUpdate();
        if (attributeValue == null) {
            attributeUpdate.setAction(AttributeAction.DELETE);
        } else {
            attributeUpdate.setAction(AttributeAction.PUT);
            attributeUpdate.setValue(attributeValue);
        }

        return attributeUpdate;
    }

    /**
     * Explicitly convert DynamoDBEntry to Boolean
     *
     * @return bool value.
     */
    public Boolean asBoolean() {
        throw new ClassCastException("Not a boolean");
    }

    /**
     * Explicitly convert DynamoDBEntry to String
     *
     * @return String value.
     */
    public String asString() {
        throw new ClassCastException("Not a string");
    }

    /**
     * Explicitly convert DynamoDBEntry to ByteBuffer.
     *
     * @return ByteBuffer value.
     */
    public ByteBuffer asByteBuffer() {
        throw new ClassCastException("Not a byte buffer");
    }

    /**
     * Explicitly convert DynamoDBEntry to Number.
     *
     * @return Number value.
     */
    public Number asNumber() {
        throw new ClassCastException("Not a number");
    }

    /**
     * Explicitly convert DynamoDBEntry to Int.
     *
     * @return Integer value.
     */
    public Integer asInt() {
        throw new ClassCastException("Not an integer");
    }

    /**
     * Explicitly convert DynamoDBEntry to Double.
     *
     * @return Double value.
     */
    public Double asDouble() {
        throw new ClassCastException("Not a double");
    }

    /**
     * Explicitly convert DynamoDBEntry to Long.
     *
     * @return Long value.
     */
    public Long asLong() {
        throw new ClassCastException("Not a Long");
    }

    /**
     * Explicitly convert DynamoDBEntry to Float.
     *
     * @return Float value.
     */
    public Float asFloat() {
        throw new ClassCastException("Not a float");
    }

    /**
     * Explicitly convert DynamoDBEntry to {@link PrimitiveList}.
     *
     * @return {@link PrimitiveList}.
     */
    public PrimitiveList asPrimitiveList() {
        throw new ClassCastException("Not an array");
    }

    /**
     * Explicitly convert DynamoDBEntry to {@link DynamoDBList}.
     *
     * @return {@link DynamoDBList}.
     */
    public DynamoDBList asDynamoDBList() {
        throw new ClassCastException("Not a DynamoDB List");
    }

    /**
     * Explicitly convert DynamoDBEntry to {@link Document}.
     *
     * @return {@link Document}.
     */
    public Document asDocument() {
        throw new ClassCastException("Not a Document");
    }

    /**
     * Explicitly convert DynamoDBEntry to {@link Primitive}.
     *
     * @return {@link Primitive}.
     */
    public Primitive asPrimitive() {
        throw new ClassCastException("Not a primitive");
    }

    @Override
    public String toString() {
        return GSON.toJson(this);
    }

}
