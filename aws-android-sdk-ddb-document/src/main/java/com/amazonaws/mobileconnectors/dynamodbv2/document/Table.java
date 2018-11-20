
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.mobileconnectors.dynamodbv2.document.Search.SearchType;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Document;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBEntry;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive.DynamoDBPrimitiveType;
import com.amazonaws.mobileconnectors.dynamodbv2.document.internal.Key;
import com.amazonaws.mobileconnectors.dynamodbv2.document.internal.KeyDescription;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteItemResult;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTableResult;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexDescription;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndexDescription;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;
import com.amazonaws.util.VersionInfoUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * The Table class is the starting object when using the Document API. It is
 * used to Get documents from the DynamnoDB table and write documents back to
 * the DynamoDB table.
 */
@SuppressWarnings("checkstyle:hiddenfield")
public class Table {

    private final AmazonDynamoDB client;
    private final String tableName;
    private TableDescription tableDescription;

    private Map<String, KeyDescription> keys = new HashMap<String, KeyDescription>();
    private Map<String, GlobalSecondaryIndexDescription> globalSecondaryIndexes = new HashMap<String, GlobalSecondaryIndexDescription>();
    private Map<String, LocalSecondaryIndexDescription> localSecondaryIndexes = new HashMap<String, LocalSecondaryIndexDescription>();
    private List<String> localSecondaryIndexNames = new ArrayList<String>();
    private List<String> globalSecondaryIndexNames = new ArrayList<String>();
    private List<String> hashKeys = new ArrayList<String>();
    private List<String> rangeKeys = new ArrayList<String>();
    private List<AttributeDefinition> attributes = new ArrayList<AttributeDefinition>();

    /**
     * Constructor.
     *
     * @param client the dynamodb client.
     * @param tableName the table name.
     */
    public Table(AmazonDynamoDB client, String tableName) {
        this(client, tableName, null);
    }

    /**
     * Constructor.
     *
     * @param client the dynamodb client.
     * @param tableName the table name.
     * @param tableDescription the table description.
     */
    public Table(AmazonDynamoDB client, String tableName,
            TableDescription tableDescription) {
        if (client == null) {
            throw new IllegalArgumentException("client must be specified");
        }
        if (tableName == null || tableName.trim().length() == 0) {
            throw new IllegalArgumentException("table name must not be null or empty");
        }
        this.client = client;
        this.tableName = tableName;
        this.tableDescription = tableDescription;
    }

    protected static <X extends AmazonWebServiceRequest> X appendDynamoDBDocumentUserAgentString(
            final X request) {
        request.getRequestClientOptions().appendUserAgent("DynamoDBv2Document/"
                + VersionInfoUtils.getVersion());
        return request;
    }

    /**
     * Load table configuration.
     *
     * @param client the dynamodb client.
     * @param tableName the tablename.
     * @return a table object.
     */
    public static Table loadTable(AmazonDynamoDB client, String tableName) {
        final Table table = new Table(client, tableName);
        // TODO: we need to be able to cache table information so that we can
        // avoid making too many describe table calls.
        table.loadTableDescription();
        return table;
    }

    /**
     * Load table description.
     */
    public void loadTableDescription() {
        clear();

        final DescribeTableRequest request = Table
                .appendDynamoDBDocumentUserAgentString(new DescribeTableRequest(this.tableName));

        final DescribeTableResult result = client
                .describeTable(request);

        this.tableDescription = result.getTable();

        for (final KeySchemaElement element : this.tableDescription.getKeySchema()) {
            final String keyName = element.getAttributeName();
            for (final AttributeDefinition ad : this.tableDescription.getAttributeDefinitions()) {
                if (ad.getAttributeName().equals(keyName)) {
                    final KeyDescription kd = new KeyDescription();
                    kd.setHash("HASH".equalsIgnoreCase(element.getKeyType()));
                    kd.setType(getType(ad.getAttributeType()));
                    if (kd.isHash()) {
                        this.hashKeys.add(keyName);
                    } else {
                        this.rangeKeys.add(keyName);
                    }
                    this.keys.put(keyName, kd);
                    break;
                }
            }
        }

        if (this.tableDescription.getLocalSecondaryIndexes() != null) {
            for (final LocalSecondaryIndexDescription index : this.tableDescription
                    .getLocalSecondaryIndexes()) {
                this.localSecondaryIndexes.put(index.getIndexName(), index);
                this.localSecondaryIndexNames.add(index.getIndexName());
            }
        }

        if (this.tableDescription.getGlobalSecondaryIndexes() != null) {
            for (final GlobalSecondaryIndexDescription index : this.tableDescription
                    .getGlobalSecondaryIndexes()) {
                this.globalSecondaryIndexes.put(index.getIndexName(), index);
                this.globalSecondaryIndexNames.add(index.getIndexName());
            }
        }

        for (final AttributeDefinition ad : this.tableDescription.getAttributeDefinitions()) {
            this.attributes.add(ad);
        }
    }

    public String getTableName() {
        return tableName;
    }

    public TableDescription getTableDescription() {
        return tableDescription;
    }

    public Map<String, KeyDescription> getKeys() {
        return keys;
    }

    public Map<String, GlobalSecondaryIndexDescription> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    public Map<String, LocalSecondaryIndexDescription> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    public List<String> getLocalSecondaryIndexNames() {
        return localSecondaryIndexNames;
    }

    public List<String> getGlobalSecondaryIndexNames() {
        return globalSecondaryIndexNames;
    }

    public List<String> getHashKeys() {
        return hashKeys;
    }

    public List<String> getRangeKeys() {
        return rangeKeys;
    }

    public List<AttributeDefinition> getAttributes() {
        return attributes;
    }

    protected void setKeys(Map<String, KeyDescription> keys) {
        this.keys = keys;
    }

    protected void setGlobalSecondaryIndexes(
            Map<String, GlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
    }

    protected void setLocalSecondaryIndexes(
            Map<String, LocalSecondaryIndexDescription> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
    }

    protected void setLocalSecondaryIndexNames(List<String> localSecondaryIndexNames) {
        this.localSecondaryIndexNames = localSecondaryIndexNames;
    }

    protected void setGlobalSecondaryIndexNames(List<String> globalSecondaryIndexNames) {
        this.globalSecondaryIndexNames = globalSecondaryIndexNames;
    }

    protected void setHashKeys(List<String> hashKeys) {
        this.hashKeys = hashKeys;
    }

    protected void setRangeKeys(List<String> rangeKeys) {
        this.rangeKeys = rangeKeys;
    }

    protected void setAttributes(List<AttributeDefinition> attributes) {
        this.attributes = attributes;
    }

    private static DynamoDBPrimitiveType getType(String attributeType) {
        if ("N".equalsIgnoreCase(attributeType)) {
            return DynamoDBPrimitiveType.Number;
        }
        if ("S".equalsIgnoreCase(attributeType)) {
            return DynamoDBPrimitiveType.String;
        }
        if ("B".equalsIgnoreCase(attributeType)) {
            return DynamoDBPrimitiveType.Binary;
        }
        throw new IllegalStateException("Unknown attribute type");
    }

    /**
     * Puts a document into DynamoDB.
     *
     * @param document the {@link Document}.
     * @return the Document that was put in the table.
     */
    public Document putItem(Document document) {
        return this.putItem(document, null);
    }

    /**
     * Puts a document into DynamoDB.
     *
     * @param document the {@link Document}.
     * @param config {@link PutItemOperationConfig}.
     * @return the dynamodb {@link Document}.
     */
    public Document putItem(Document document, PutItemOperationConfig config) {
        final PutItemRequest request = new PutItemRequest();
        request.setTableName(this.tableName);
        request.setItem(toAttributeMap(document));
        if (config != null && config.getReturnValue().compareTo(ReturnValue.ALL_OLD) == 0) {
            request.setReturnValues(ReturnValue.ALL_OLD);
        }

        Table.appendDynamoDBDocumentUserAgentString(request);
        final PutItemResult result = client.putItem(request);

        Document ret = null;
        if (config != null && config.getReturnValue().compareTo(ReturnValue.ALL_OLD) == 0) {
            final Map<String, AttributeValue> values = result.getAttributes();
            ret = this.fromAttributeMap(values);
            ret.commit();
        }
        return ret;
    }

    /**
     * Gets a document from DynamoDB by hash primary key.
     *
     * @param hashKey the hash key.
     * @return the dynamodb {@link Document}.
     */
    public Document getItem(Primitive hashKey) {
        return getItem(makeKey(hashKey, null), null);
    }

    /**
     * Gets a document from DynamoDB by hash-and-range primary key.
     *
     * @param hashKey the hash key.
     * @param rangeKey the range key.
     * @return the dynamodb {@link Document}.
     */
    public Document getItem(Primitive hashKey, Primitive rangeKey) {
        return getItem(makeKey(hashKey, rangeKey), null);
    }

    /**
     * Gets a document from DynamoDB by hash primary key, using specified
     * configs.
     *
     * @param hashKey the hash key.
     * @param config the {@link GetItemOperationConfig}.
     * @return the dynamodb {@link Document}.
     */
    public Document getItem(Primitive hashKey, GetItemOperationConfig config) {
        return getItem(makeKey(hashKey, null), config);
    }

    /**
     * Gets a document from DynamoDB by hash-and-range primary key, using
     * specified configs.
     *
     * @param hashKey the hash key.
     * @param rangeKey the range key
     * @param config the {@link GetItemOperationConfig}.
     * @return the dynamodb {@link Document}.
     */
    public Document getItem(Primitive hashKey, Primitive rangeKey, GetItemOperationConfig config) {
        return getItem(makeKey(hashKey, rangeKey), config);
    }

    private Document getItem(Key key, GetItemOperationConfig config) {
        final GetItemRequest request = new GetItemRequest(tableName, key);
        if (config != null) {
            request.setConsistentRead(config.isConsistentRead());
            if (config.getAttributesToGet() != null && config.getAttributesToGet().size() > 0) {
                request.setAttributesToGet(config.getAttributesToGet());
            }
        }

        Table.appendDynamoDBDocumentUserAgentString(request);
        final GetItemResult response = this.client.getItem(request);

        final Map<String, AttributeValue> item = response.getItem();
        if (item == null || item.size() == 0) {
            return null;
        }

        final Document returnDocument = fromAttributeMap(item);
        returnDocument.commit();
        return returnDocument;
    }

    /**
     * Delete a document in DynamoDB.
     *
     * @param hashKey the hash key.
     * @return the dynamodb document that was deleted.
     */
    public Document deleteItem(Primitive hashKey) {
        return deleteItem(hashKey, (DeleteItemOperationConfig) null);
    }

    /**
     * Delete a document in DynamoDB.
     *
     * @param hashKey the hash key.
     * @param rangeKey the range key.
     * @return the dynamodb document that was deleted.
     */
    public Document deleteItem(Primitive hashKey, Primitive rangeKey) {
        return deleteItem(hashKey, rangeKey, null);
    }

    /**
     * Delete a document in DynamoDB.
     *
     * @param hashKey the hash key.
     * @param config the {@link DeleteItemOperationConfig}.
     * @return the dynamodb document that was deleted.
     */
    public Document deleteItem(Primitive hashKey, DeleteItemOperationConfig config) {
        return deleteItem(makeKey(hashKey, null), config);
    }

    /**
     * Delete a document in DynamoDB.
     *
     * @param hashKey the hash key.
     * @param rangeKey the range key.
     * @param config the {@link DeleteItemOperationConfig}.
     * @return the dynamodb document that was deleted.
     */
    public Document deleteItem(Primitive hashKey, Primitive rangeKey,
            DeleteItemOperationConfig config) {
        return deleteItem(makeKey(hashKey, rangeKey), config);
    }

    private Document deleteItem(Key key, DeleteItemOperationConfig config) {
        final DeleteItemRequest request = new DeleteItemRequest(tableName, key);
        if (config != null) {
            request.setReturnValues(config.getReturnValue());
        }
        Table.appendDynamoDBDocumentUserAgentString(request);

        final DeleteItemResult result = this.client.deleteItem(request);

        final Document returnDocument = this.fromAttributeMap(result.getAttributes());
        returnDocument.commit();
        return returnDocument;
    }

    /**
     * Update a document in DynamoDB.
     *
     * @param doc Document to update.
     * @param config the {@link UpdateItemOperationConfig}.
     * @return the updated {@link Document}.
     */
    public Document updateItem(Document doc, UpdateItemOperationConfig config) {
        return updateItem(doc, makeKey(doc), config);
    }

    /**
     * Update a document in DynamoDB.
     *
     * @param doc Document to update.
     * @param hashKey the hash key.
     * @param config the {@link UpdateItemOperationConfig}.
     * @return the updated {@link Document}.
     */
    public Document updateItem(Document doc, Primitive hashKey, UpdateItemOperationConfig config) {
        return updateItem(doc, makeKey(hashKey, null), config);
    }

    /**
     * Update a document in DynamoDB.
     *
     * @param doc Document to update.
     * @param hashKey the hash key.
     * @param rangeKey the range key.
     * @param config the {@link UpdateItemOperationConfig}.
     * @return the updated {@link Document}.
     */
    public Document updateItem(Document doc, Primitive hashKey, Primitive rangeKey,
            UpdateItemOperationConfig config) {
        return updateItem(doc, makeKey(hashKey, rangeKey), config);
    }

    /**
     * Initiates a Search object to Query a DynamoDB table, with the specified
     * hash primary key and filter. No calls are made until the Search object is
     * used.
     *
     * @param hashKey the hash key to query against.
     * @param filter the {@link QueryFilter}.
     * @return the {@link Search} object.
     */
    public Search query(Primitive hashKey, QueryFilter filter) {
        final String hashKeyName = this.hashKeys.get(0);
        final QueryFilter fullFilter = new QueryFilter(filter);

        final List<AttributeValue> attributes = new ArrayList<AttributeValue>();
        attributes.add(hashKey.convertToAttributeValue());
        fullFilter.addCondition(hashKeyName, ComparisonOperator.EQ, attributes);

        return query(fullFilter);
    }

    /**
     * Initiates a Search object to Query a DynamoDB table, with the specified
     * hash primary key and filterExpression. No calls are made until the Search
     * object is used.
     *
     * @param hashKey the hash Key
     * @param filterExpression the filter Expression.
     * @return the search object.
     */
    public Search query(Primitive hashKey, Expression filterExpression) {
        final String hashKeyName = this.hashKeys.get(0);
        final QueryFilter hashKeyFilter = new QueryFilter();

        final List<AttributeValue> attributes = new ArrayList<AttributeValue>();
        attributes.add(hashKey.convertToAttributeValue());
        hashKeyFilter.addCondition(hashKeyName, ComparisonOperator.EQ, attributes);

        final QueryOperationConfig config = new QueryOperationConfig();
        config.withFilter(hashKeyFilter)
                .withFilterExpression(filterExpression);

        return query(config);
    }

    /**
     * Initiates a Search object to Query a DynamoDB table, with the specified
     * hash primary key. No calls are made until the Search object is used.
     *
     * @param hashKey the hash key to query against.
     * @return the {@link Search} object.
     */
    public Search query(Primitive hashKey) {
        final String hashKeyName = this.hashKeys.get(0);
        final QueryFilter hashKeyFilter = new QueryFilter();

        final List<AttributeValue> attributes = new ArrayList<AttributeValue>();
        attributes.add(hashKey.convertToAttributeValue());
        hashKeyFilter.addCondition(hashKeyName, ComparisonOperator.EQ, attributes);
        final QueryOperationConfig config = new QueryOperationConfig();
        config.withFilter(hashKeyFilter);
        return query(config);
    }

    /**
     * Initiates a Search object to Query a DynamoDB table, with the specified
     * query filter. No calls are made until the Search object is used.
     *
     * @param filter the {@link QueryFilter}.
     * @return the {@link Search} object.
     */
    public Search query(QueryFilter filter) {
        return query(new QueryOperationConfig().withFilter(filter));
    }

    /**
     * Initiates a Search object to Query a DynamoDB table, with the specified
     * query operation config. No calls are made until the Search object is
     * used.
     *
     * @param config the {@link QueryOperationConfig}.
     * @return the {@link Search} object.
     */
    public Search query(QueryOperationConfig config) {
        if (config == null) {
            throw new IllegalArgumentException("config is null");
        }

        final Search search = new Search(SearchType.QUERY);
        search.withAttributesToGet(config.getAttributesToGet())
                .withCollectResults(config.isCollectResults())
                .withConditionalOperator(config.getConditionalOperator())
                .withLimit(config.getLimit() <= 0 ? Integer.MAX_VALUE : config.getLimit())
                .withFilterExpression(
                        config.getFilterExpression() == null ? null : config.getFilterExpression())
                .withIndexName(config.getIndexName())
                .withTableName(tableName)
                .withIsConsistentRead(config.isConsistentRead())
                .withIsBackwardSearch(config.isBackwardSearch())
                .withKeyExpression(config.getKeyExpression())
                .withSelect(config.getSelect())
                .withTable(this);

        if (config.getFilter() != null && !config.getFilter().conditions.isEmpty()) {
            search.withFilter(config.getFilter());
        }

        return search;
    }

    /**
     * Initiates a Search object to Scan a DynamoDB table, with the specified
     * filter. No calls are made until the Search object is used.
     *
     * @param filter Filter to apply to the scan.
     * @return Resultant Search container.
     */
    public Search scan(ScanFilter filter) {
        return scan(new ScanOperationConfig().withFilter(filter));
    }

    /**
     * Initiates a Search object to Scan a DynamoDB table, with the specified
     * expression. No calls are made until the Search object is used.
     *
     * @param filterExpression Expression to apply to the scan.
     * @return Resultant Search container.
     */
    public Search scan(Expression filterExpression) {
        final ScanOperationConfig config = new ScanOperationConfig();
        config.withFilterExpression(filterExpression);
        return scan(config);
    }

    /**
     * Initiates a Search object to Query a DynamoDB table, with the specified
     * config. No calls are made until the Search object is used.
     *
     * @param config Configuration to use.
     * @return Resultant Search container.
     */
    public Search scan(ScanOperationConfig config) {
        if (config == null) {
            throw new IllegalArgumentException("config is null");
        }

        final Search search = new Search(SearchType.SCAN);
        search.withAttributesToGet(config.getAttributesToGet())
                .withCollectResults(config.isCollectResults())
                .withConditionalOperator(config.getConditionalOperator())
                .withLimit(config.getLimit() <= 0 ? Integer.MAX_VALUE : config.getLimit())
                .withFilter(config.getFilter())
                .withFilterExpression(config.getFilterExpression())
                .withIndexName(config.getIndexName())
                .withTableName(tableName)
                .withIsConsistentRead(config.isConsistentRead())
                .withSelect(config.getSelect())
                .withTable(this);

        if (config.getTotalSegments() != 0) {
            search.withTotalSegments(config.getTotalSegments())
                    .withSegment(config.getSegment());
        }

        return search;
    }

    private boolean haveKeysChanged(Document doc) {
        final Set<String> keyNames = this.keys.keySet();
        for (final String keyName : keyNames) {
            if (doc.hasAttributeChanged(keyName)) {
                return true;
            }
        }
        return false;
    }

    private Map<String, AttributeValue> toAttributeMap(Document document) {
        final Map<String, AttributeValue> ret = document.toAttributeMap();
        return ret;
    }

    private Map<String, AttributeValueUpdate> toAttributeUpdateMap(Document document,
            boolean changeAttributesOnly) {
        final Map<String, AttributeValueUpdate> ret = document
                .toAttributeUpdateMap(changeAttributesOnly);
        return ret;
    }

    private Document fromAttributeMap(Map<String, AttributeValue> attributes) {
        return Document.fromAttributeMap(attributes);
    }

    private Document updateItem(Document doc, Key key, UpdateItemOperationConfig config) {
        final boolean updateChangedAttributes = !this.haveKeysChanged(doc);
        final Map<String, AttributeValueUpdate> attributeUpdateValues = this.toAttributeUpdateMap(
                doc,
                updateChangedAttributes);

        for (final String keyName : this.keys.keySet()) {
            attributeUpdateValues.remove(keyName);
        }

        final UpdateItemRequest updateRequest = new UpdateItemRequest();
        updateRequest.setTableName(this.tableName);
        updateRequest.setKey(key);
        updateRequest.setAttributeUpdates(
                attributeUpdateValues.size() == 0 ? null : attributeUpdateValues);
        updateRequest.setReturnValues(config.getReturnValue());

        Table.appendDynamoDBDocumentUserAgentString(updateRequest);

        final UpdateItemResult result = this.client.updateItem(updateRequest);
        doc.commit();

        if (config.getReturnValue() != ReturnValue.NONE) {
            return this.fromAttributeMap(result.getAttributes());
        }
        return null;
    }

    private void clear() {
        this.keys = new HashMap<String, KeyDescription>();
        this.hashKeys = new ArrayList<String>();
        this.rangeKeys = new ArrayList<String>();
        this.localSecondaryIndexes = new HashMap<String, LocalSecondaryIndexDescription>();
        this.localSecondaryIndexNames = new ArrayList<String>();
        this.globalSecondaryIndexes = new HashMap<String, GlobalSecondaryIndexDescription>();
        this.globalSecondaryIndexNames = new ArrayList<String>();
        this.attributes = new ArrayList<AttributeDefinition>();
    }

    private Key makeKey(Document doc) {
        final Key key = new Key();
        for (final Entry<String, KeyDescription> kvp : this.keys.entrySet()) {
            final String keyName = kvp.getKey();
            final KeyDescription description = kvp.getValue();
            final DynamoDBEntry value = doc.get(keyName);
            if (value == null) {
                throw new IllegalStateException("no value for key " + keyName);
            }
            final Primitive primitive = value.asPrimitive();
            if (primitive == null) {
                throw new IllegalStateException(
                        "Key attribute " + keyName + " must be a Primitive type");
            }
            if (primitive.getType() != description.getType()) {
                throw new IllegalStateException(
                        "Key attribute " + keyName + " must be of type " + description.getType());
            }
            key.put(keyName, primitive.convertToAttributeValue());
        }
        return key;
    }

    private Key makeKey(Primitive hashKey, Primitive rangeKey) {
        final Key key = new Key();

        if (this.hashKeys.size() != 1) {
            throw new IllegalStateException("no hashkeys in table");
        }

        final String hashKeyName = this.hashKeys.get(0);
        final KeyDescription keyDescription = this.keys.get(hashKeyName);

        if (keyDescription.getType() != hashKey.getType()) {
            throw new IllegalStateException(
                    "hash key type does not match the one in table definition");
        }

        final AttributeValue av = hashKey.convertToAttributeValue();
        key.put(hashKeyName, av);

        if (rangeKey == null && this.rangeKeys.size() > 0) {
            throw new IllegalStateException("range key not specificed for a table with range keys");
        } else if (rangeKey != null) {
            final String rangeKeyName = this.rangeKeys.get(0);
            final KeyDescription kd = this.keys.get(rangeKeyName);
            if (kd.getType() != rangeKey.getType()) {
                throw new IllegalStateException(
                        "range key type does not match that of table definition");
            }
            final AttributeValue rangeKeyAttributeValue = rangeKey.convertToAttributeValue();
            key.put(rangeKeyName, rangeKeyAttributeValue);
        }

        return key;
    }

    protected AmazonDynamoDB getClient() {
        return client;
    }

    protected void setTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
    }

}
