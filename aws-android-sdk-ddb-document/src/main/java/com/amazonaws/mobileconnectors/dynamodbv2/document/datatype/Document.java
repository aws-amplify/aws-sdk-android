
package com.amazonaws.mobileconnectors.dynamodbv2.document.datatype;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive.DynamoDBPrimitiveType;
import com.amazonaws.mobileconnectors.dynamodbv2.document.internal.JsonUtils;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.google.common.base.Objects;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A collection of attribute key-value pairs that defines an item in DynamoDB.
 */
public class Document extends DynamoDBEntry implements Map<String, DynamoDBEntry> {

    private final Map<String, DynamoDBEntry> originalValues;
    private final Map<String, DynamoDBEntry> currentValues;

    /**
     * Constructor.
     */
    public Document() {
        this.originalValues = new HashMap<String, DynamoDBEntry>();
        this.currentValues = new HashMap<String, DynamoDBEntry>();
    }

    /**
     * Constructor.
     *
     * @param values attribute key-value pair
     */
    public Document(Map<String, DynamoDBEntry> values) {
        this.currentValues = new HashMap<String, DynamoDBEntry>(values);
        this.originalValues = new HashMap<String, DynamoDBEntry>();
    }

    @Override
    public DynamoDBEntry put(String key, DynamoDBEntry value) {
        return this.currentValues.put(key, value);
    }

    @Override
    public boolean containsKey(Object key) {
        return this.currentValues.containsKey(key);
    }

    @Override
    public DynamoDBEntry get(Object key) {
        return this.currentValues.get(key);
    }

    @Override
    public DynamoDBEntry remove(Object key) {
        return this.currentValues.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return this.currentValues.keySet();
    }

    @Override
    public Set<Entry<String, DynamoDBEntry>> entrySet() {
        return this.currentValues.entrySet();
    }

    @Override
    public int size() {
        return this.currentValues.size();
    }

    @Override
    public boolean isEmpty() {
        return this.currentValues.isEmpty();
    }

    @Override
    public boolean containsValue(Object paramObject) {
        return this.currentValues.containsValue(paramObject);
    }

    @Override
    public void putAll(java.util.Map<? extends String, ? extends DynamoDBEntry> m) {
        this.currentValues.putAll(m);
    }

    @Override
    public void clear() {
        this.currentValues.clear();
    }

    @Override
    public Collection<DynamoDBEntry> values() {
        return this.currentValues.values();
    }

    /**
     * Convert a JSON document to {@link Document}
     *
     * @param json the json string.
     * @return {@link Document}
     */
    public static Document fromJson(String json) {
        return JsonUtils.fromJson(json);
    }

    /**
     * Converts a {@link Document} to JSON String.
     *
     * @param document the {@link Document}.
     * @return the JSON string.
     * @throws IOException in case there is error reading the JSON.
     */
    public static String toJson(Document document) throws IOException {
        return JsonUtils.toJson(document);
    }

    /**
     * Converts a {@link Document} to JSON String with an optional pretty print.
     *
     * @param document the {@link Document}.
     * @param prettyPrint optionally pretty print.
     * @return the JSON string.
     * @throws IOException in case there is error reading the JSON.
     */
    public static String toJson(Document document, boolean prettyPrint) throws IOException {
        return JsonUtils.toJson(document, prettyPrint);
    }

    @Override
    public AttributeValue convertToAttributeValue() {
        final Map<String, AttributeValue> map = new HashMap<String, AttributeValue>();
        for (final Entry<String, DynamoDBEntry> item : this.currentValues.entrySet()) {
            final String key = item.getKey();
            final DynamoDBEntry entry = item.getValue();
            final AttributeValue entryAttributeValue = entry
                    .convertToAttributeValue();
            if (entryAttributeValue != null) {
                map.put(key, entryAttributeValue);
            }
        }

        final AttributeValue mapAttributeValue = new AttributeValue();
        mapAttributeValue.setM(map);
        return mapAttributeValue;
    }

    /**
     * Returns an attribute key to {@link AttributeValue} map.
     *
     * @return an attribute key to {@link AttributeValue} map.
     */
    public Map<String, AttributeValue> toAttributeMap() {
        final Map<String, AttributeValue> ret = new HashMap<String, AttributeValue>();

        for (final Entry<String, DynamoDBEntry> kvp : this.currentValues.entrySet()) {
            final String attributeName = kvp.getKey();
            final DynamoDBEntry entry = kvp.getValue();

            final AttributeValue value = entry.convertToAttributeValue();
            if (value != null) {
                ret.put(attributeName, value);
            }
        }
        return ret;
    }

    /**
     * Returns an attribute key to {@link AttributeValueUpdate} value map.
     *
     * @param changeAttributesOnly bool value indicating to return only changed
     *            attributes.
     * @return an attribute key to {@link AttributeValueUpdate} map.
     */
    public Map<String, AttributeValueUpdate> toAttributeUpdateMap(boolean changeAttributesOnly) {
        final Map<String, AttributeValueUpdate> ret = new HashMap<String, AttributeValueUpdate>();

        for (final Entry<String, DynamoDBEntry> kvp : this.currentValues.entrySet()) {
            final String attributeName = kvp.getKey();
            final DynamoDBEntry entry = kvp.getValue();

            final AttributeValueUpdate value = entry.convertToAttributeUpdateValue();
            if (value != null) {
                if (!changeAttributesOnly || this.hasAttributeChanged(attributeName)) {
                    ret.put(attributeName, value);
                }
            }
        }
        return ret;
    }

    /**
     * Construct a {@link Document} from an attribute key to
     * {@link AttributeValueUpdate} value map.
     *
     * @param attributes an attribute key to {@link AttributeValueUpdate} value
     *            map.
     * @return {@link Document}.
     */
    public static Document fromAttributeMap(final Map<String, AttributeValue> attributes) {
        final Document doc = new Document();
        if (attributes != null) {
            // Add Primitives and PrimitiveLists
            for (final Entry<String, AttributeValue> attribute : attributes.entrySet()) {
                final String key = attribute.getKey();
                final AttributeValue value = attribute.getValue();

                final DynamoDBEntry convertedValue = attributeValueToDynamoDBEntry(value);
                if (convertedValue != null) {
                    doc.put(key, convertedValue);
                }
            }
        }

        return doc;
    }

    /**
     * Returns is the given attribute has changed.
     *
     * @param attributeName the name of the attribute.
     * @return true if the attribute value has changed.
     */
    public boolean hasAttributeChanged(String attributeName) {
        final DynamoDBEntry originalEntry = this.originalValues.get(attributeName);
        final DynamoDBEntry currentEntry = this.currentValues.get(attributeName);
        if (originalEntry == null || currentEntry == null) {

            return false;
        }

        final boolean flag = !originalEntry.equals(currentEntry);
        return flag;
    }

    private static DynamoDBEntry attributeValueToDynamoDBEntry(AttributeValue value) {
        final Primitive primitive = toPrimitive(value);
        if (primitive != null) {
            return primitive;
        }

        final PrimitiveList primitiveList = toPrimitiveList(value);
        if (primitiveList != null) {
            return primitiveList;
        }

        final DynamoDBBool bool = toDynamoDBBool(value);
        if (bool != null) {
            return bool;
        }

        final DynamoDBNull nullEntry = toDynamoDBNull(value);
        if (nullEntry != null) {
            return nullEntry;
        }

        final DynamoDBList listEntry = toDynamoDBList(value);
        if (listEntry != null) {
            return listEntry;
        }

        final Document document = toDynamoDBDocument(value);
        if (document != null) {
            return document;
        }

        return null;
    }

    private static Primitive toPrimitive(final AttributeValue attributeValue) {
        Primitive primitive = null;
        if (attributeValue.getS() != null) {
            primitive = new Primitive(attributeValue.getS());
        } else if (attributeValue.getN() != null) {
            primitive = new Primitive(attributeValue.getN(), true);
        } else if (attributeValue.getB() != null) {
            primitive = new Primitive(attributeValue.getB());
        }
        return primitive;
    }

    private static PrimitiveList toPrimitiveList(final AttributeValue attributeValue) {
        PrimitiveList primitiveList = null;
        Primitive primitive = null;
        if (attributeValue.getSS() != null) {
            primitiveList = new PrimitiveList(DynamoDBPrimitiveType.String);
            for (final String s : attributeValue.getSS()) {
                primitive = new Primitive(s);
                primitiveList.add(primitive);
            }
        } else if (attributeValue.getNS() != null) {
            primitiveList = new PrimitiveList(DynamoDBPrimitiveType.Number);
            for (final String s : attributeValue.getNS()) {
                primitive = new Primitive(s, true);
                primitiveList.add(primitive);
            }
        } else if (attributeValue.getBS() != null) {
            primitiveList = new PrimitiveList(DynamoDBPrimitiveType.Binary);
            for (final ByteBuffer b : attributeValue.getBS()) {
                primitive = new Primitive(b);
                primitiveList.add(primitive);
            }
        }
        return primitiveList;
    }

    private static DynamoDBBool toDynamoDBBool(final AttributeValue attributeValue) {
        if (attributeValue.getBOOL() != null) {
            return new DynamoDBBool(attributeValue.getBOOL());
        }
        return null;
    }

    private static DynamoDBNull toDynamoDBNull(final AttributeValue attributeValue) {
        if (attributeValue != null && attributeValue.getNULL() != null) {
            return DynamoDBNull.NULL;
        }
        return null;
    }

    private static DynamoDBList toDynamoDBList(final AttributeValue attributeValue) {
        DynamoDBList list = null;
        if (attributeValue.getL() != null) {
            list = new DynamoDBList();
            final List<AttributeValue> listAttributes = attributeValue.getL();
            for (final AttributeValue av : listAttributes) {
                final DynamoDBEntry entry = attributeValueToDynamoDBEntry(av);
                list.add(entry);
            }
        }
        return list;
    }

    private static Document toDynamoDBDocument(final AttributeValue attributeValue) {
        Document document = null;
        if (attributeValue.getM() != null) {
            document = new Document();
            final Map<String, AttributeValue> mapAttributes = attributeValue.getM();
            for (final Entry<String, AttributeValue> entry : mapAttributes.entrySet()) {
                document.put(entry.getKey(), attributeValueToDynamoDBEntry(entry.getValue()));
            }
        }
        return document;
    }

    /**
     * Attribute accessor, allows getting or setting of an individual attribute.
     *
     * @param key Name of the attribute.
     * @param value Current value of the attribute.
     */
    public void put(String key, String value) {
        this.put(key, new Primitive(value));
    }

    /**
     * Fluent Api to add a string value for a attribute.
     *
     * @param key the attribute name.
     * @param value the attribute value.
     * @return the current instance of {@link Document}.
     */
    public Document withString(String key, String value) {
        this.put(key, value);
        return this;
    }

    /**
     * add a set for a attribute.
     *
     * @param key the attribute name.
     * @param <T> the type of set.
     * @param set a typed set.
     */
    public <T> void put(String key, Set<T> set) {
        final PrimitiveList pl = new PrimitiveList();
        pl.addAll(set);
        this.put(key, pl);
    }

    /**
     * Fluent Api add a set for a attribute.
     *
     * @param key the attribute name.
     * @param set the type of set.
     * @param <T> the type of the set.
     * @return the current instance of {@link Document}.
     */
    public <T> Document withSet(String key, Set<T> set) {
        this.put(key, set);
        return this;
    }

    /**
     * add a number for an attribute.
     *
     * @param key the attribute name.
     * @param value the attribute value.
     */
    public void put(String key, Number value) {
        this.put(key, new Primitive(value));
    }

    /**
     * add a bool for an attribute.
     *
     * @param key the attribute name.
     * @param value the attribute value.
     */
    public void put(String key, boolean value) {
        this.put(key, new DynamoDBBool(value));
    }

    @Override
    public Document asDocument() {
        return this;
    }

    /**
     * Commit the new values.
     */
    public void commit() {
        this.originalValues.clear();
        for (final Entry<String, DynamoDBEntry> entry : this.currentValues.entrySet()) {
            this.originalValues.put(entry.getKey(), entry.getValue());
        }
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
        final Document other = (Document) obj;
        return Objects.equal(this.currentValues, other.currentValues);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.currentValues);
    }

}
