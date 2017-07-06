
package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.google.common.base.Objects;

import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * A DynamoDBEntry that represents a scalar DynamoDB type.
 */
public class Primitive extends DynamoDBEntry {

    /**
     * Enumerator describing type of DynamoDB data in a Primitive or
     * PrimitiveList.
     */
    public enum DynamoDBPrimitiveType {
        /**
         * DynamoDB String type.
         */
        String,
        /**
         * DynamoDB Number type.
         */
        Number,
        /**
         * DynamoDB Binary type.
         */
        Binary
    }

    private final DynamoDBPrimitiveType type;
    private final Object value;

    /**
     * Constructor.
     */
    public Primitive() {
        this(null, DynamoDBPrimitiveType.String);
    }

    /**
     * Constructor.
     *
     * @param value a primitive string.
     */
    public Primitive(String value) {
        this(value, DynamoDBPrimitiveType.String);
    }

    /**
     * Constructor.
     *
     * @param value a primitive number.
     */
    public Primitive(Number value) {
        this(value, DynamoDBPrimitiveType.Number);
    }

    /**
     * Constructor.
     *
     * @param value a primitive number represented as string.
     * @param saveAsNumeric boolean indicating if the data should be saved as
     *            numeric.
     */
    public Primitive(String value, boolean saveAsNumeric) {
        this(value, saveAsNumeric ? DynamoDBPrimitiveType.Number : DynamoDBPrimitiveType.String);
    }

    /**
     * Constructor.
     *
     * @param value a primitive integer.
     * @param saveAsNumeric boolean indicating if the data should be saved as
     *            numeric.
     */
    public Primitive(Integer value, boolean saveAsNumeric) {
        this(value, saveAsNumeric ? DynamoDBPrimitiveType.Number : DynamoDBPrimitiveType.String);
    }

    /**
     * Constructor.
     *
     * @param value a byte buffer.
     */
    public Primitive(ByteBuffer value) {
        this(value, DynamoDBPrimitiveType.Binary);
    }

    private Primitive(final Object value, DynamoDBPrimitiveType type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String asString() {
        if (this.type != DynamoDBPrimitiveType.Binary) {
            return String.valueOf(this.value);
        }

        return super.asString();
    }

    @Override
    public ByteBuffer asByteBuffer() {
        if (this.type == DynamoDBPrimitiveType.Binary) {
            return (ByteBuffer) this.value;
        }

        return super.asByteBuffer();
    }

    @Override
    public Number asNumber() {
        if (this.type == DynamoDBPrimitiveType.Number) {
            if (this.value instanceof String) {
                try {
                    return NumberFormat.getInstance().parse((String) this.value);
                } catch (final ParseException e) {
                    throw new NumberFormatException("cannot parse " + this.value + " as number");
                }
            } else {
                return (Number) this.value;
            }
        }

        return super.asNumber();
    }

    @Override
    public Integer asInt() {
        if (this.type == DynamoDBPrimitiveType.Number) {
            if (this.value instanceof String) {
                return Integer.parseInt((String) this.value);
            } else {
                return (Integer) this.value;
            }
        }
        return super.asInt();
    }

    @Override
    public Double asDouble() {
        if (this.type == DynamoDBPrimitiveType.Number) {
            if (this.value instanceof String) {
                return Double.parseDouble((String) this.value);
            } else {
                return (Double) this.value;
            }
        }
        return super.asDouble();
    }

    @Override
    public Long asLong() {
        if (this.type == DynamoDBPrimitiveType.Number) {
            if (this.value instanceof String) {
                return Long.parseLong((String) this.value);
            } else {
                return (Long) this.value;
            }
        }
        return super.asLong();
    }

    @Override
    public Float asFloat() {
        if (this.type == DynamoDBPrimitiveType.Number) {
            if (this.value instanceof String) {
                return Float.parseFloat((String) this.value);
            } else {
                return (Float) this.value;
            }
        }
        return super.asFloat();
    }

    @Override
    public AttributeValue convertToAttributeValue() {
        if (value == null) {
            return null;
        }
        final AttributeValue av = new AttributeValue();
        switch (type) {
            case String:
                av.setS(String.valueOf(this.value));
                break;
            case Number:
                av.setN(String.valueOf(this.value));
                break;
            case Binary:
                av.setB((ByteBuffer) this.value);
                break;
            default:
                throw new IllegalStateException("invalid primitive type");
        }
        return av;
    }

    /**
     * Returns the DynamoDBPrimitive Type.
     *
     * @return {@link DynamoDBPrimitiveType}.
     */
    public DynamoDBPrimitiveType getType() {
        return type;
    }

    /**
     * The primitive value.
     *
     * @return the primitive value.
     */
    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Primitive other = (Primitive) obj;
        return Objects.equal(this.type, other.type) && Objects.equal(this.value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.type, this.value);
    }

    @Override
    public Primitive asPrimitive() {
        return this;
    }

}
