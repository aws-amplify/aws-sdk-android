
package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive.DynamoDBPrimitiveType;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.google.common.base.Objects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * A DynamoDBEntry that represents a primitive list DynamoDB type.
 */
public class PrimitiveList extends DynamoDBEntry {
    private final DynamoDBPrimitiveType type;
    private final List<Primitive> entries;

    /**
     * Constructor.
     */
    public PrimitiveList() {
        this(DynamoDBPrimitiveType.String);
    }

    /**
     * Constructor.
     *
     * @param type the type of Primitive List.
     */
    public PrimitiveList(DynamoDBPrimitiveType type) {
        this.type = type;
        this.entries = new ArrayList<Primitive>();
    }

    /**
     * Adds an String to the primitive list.
     *
     * @param value the string value to be added.
     */
    public void add(String value) {
        if (this.type != DynamoDBPrimitiveType.String) {
            throw new IllegalArgumentException("Invalid parameter type string");
        }
        this.entries.add(new Primitive(value));
    }

    /**
     * Adds a Number to the primitive List.
     *
     * @param value the number to be added.
     */
    public void add(Number value) {
        if (this.type != DynamoDBPrimitiveType.Number) {
            throw new IllegalArgumentException("Invalid parameter type Number");
        }
        this.entries.add(new Primitive(value));
    }

    /**
     * Adds a ByteBuffer to the primitive list.
     *
     * @param value the byte buffer to be added.
     */
    public void add(ByteBuffer value) {
        if (this.type != DynamoDBPrimitiveType.Binary) {
            throw new IllegalArgumentException("Invalid parameter type ByteBuffer");
        }
        this.entries.add(new Primitive(value));
    }

    /**
     * Adds a set of typed items.
     *
     * @param <T> the type of set.
     * @param set the set to be added.
     */
    public <T> void addAll(Set<T> set) {
        for (final T t : set) {
            if (t instanceof String) {
                this.entries.add(new Primitive((String) t));
            } else if (t instanceof Number) {
                this.entries.add(new Primitive((Number) t));
            } else if (t instanceof ByteBuffer) {
                this.entries.add(new Primitive((ByteBuffer) t));
            } else {
                throw new IllegalArgumentException("Invalid type = " + t.getClass());
            }
        }
    }

    /**
     * Adds a primitive value.
     *
     * @param value the primitive value to be added to list.
     */
    public void add(Primitive value) {
        this.entries.add(value);
    }

    /**
     * Gets the primitive represented by an Index.
     *
     * @param index the index.
     * @return the primitive value at the give index.
     */
    public Primitive get(Integer index) {
        return this.entries.get(index);
    }

    @Override
    public AttributeValue convertToAttributeValue() {
        if (entries == null || entries.size() == 0) {
            return null;
        }

        final AttributeValue av = new AttributeValue();
        if (this.type != DynamoDBPrimitiveType.Binary) {
            final List<String> values = new ArrayList<String>();
            for (final Primitive entry : entries) {
                values.add(entry.asString());
            }

            if (this.type == DynamoDBPrimitiveType.Number) {
                av.setNS(values);
            } else {
                av.setSS(values);
            }
        } else {
            final List<ByteBuffer> values = new ArrayList<ByteBuffer>();
            for (final Primitive entry : entries) {
                values.add(entry.asByteBuffer());
            }

            av.setBS(values);
        }
        return av;
    }

    /**
     * Returns a list of primitives
     *
     * @return list of primitives.
     */
    public List<Primitive> getEntries() {
        return entries;
    }

    /**
     * Type of the Primitive List.
     *
     * @return {@link DynamoDBPrimitiveType}
     */
    public DynamoDBPrimitiveType getType() {
        return type;
    }

    @Override
    public PrimitiveList asPrimitiveList() {
        return this;
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
        final PrimitiveList other = (PrimitiveList) obj;
        return Objects.equal(this.type, other.type)
                && Objects.equal(this.entries, other.entries);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.type, this.entries);
    }

}
