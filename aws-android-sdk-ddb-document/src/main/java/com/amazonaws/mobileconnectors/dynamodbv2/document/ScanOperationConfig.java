
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.Select;

import java.util.List;

/**
 * Configuration for the Table.Scan operation
 */
@SuppressWarnings("checkstyle:hiddenfield")
public class ScanOperationConfig {

    /**
     * If set to true, this flag ensures that the most recently written data is
     * returned.
     */
    private boolean consistentRead;

    /**
     * List of attributes to retrieve as part of the search
     */
    private List<String> attributesToGet;

    /**
     * Upper limit on the number of items to return per request
     */
    private int limit;

    /**
     * The expression that is evaluated for each item. Only items that pass the
     * expression are returned. Both KeyExpression and FilterExpression contain
     * ExpressionAttributeNames and ExpressionAttributeValues. Attribute names
     * or values can be added to either expression and can be referenced in
     * either expression statement. Conflicting attribute names or values will
     * lead to an exception being thrown.
     */
    private Expression filterExpression;

    /**
     * Filter for the search operation
     */
    private ScanFilter filter;

    /**
     * Name of the index to query against.
     */
    private String indexName;

    /**
     * Enum specifying what data to return from scan.
     */
    private Select select;

    /**
     * For parallel <i>Scan</i> requests, <i>TotalSegments</i>represents the
     * total number of segments for a table that is being scanned. Segments are
     * a way to logically divide a table into equally sized portions, for the
     * duration of the <i>Scan</i> request. The value of <i>TotalSegments</i>
     * corresponds to the number of application "workers" (such as threads or
     * processes) that will perform the parallel <i>Scan</i>. For example, if
     * you want to scan a table using four application threads, you would
     * specify a <i>TotalSegments</i> value of 4. The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than or
     * equal to 4096. If you specify a <i>TotalSegments</i> value of 1, the
     * <i>Scan</i> will be sequential rather than parallel. If you specify
     * <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     */
    private int totalSegments;

    /**
     * For parallel <i>Scan</i> requests, <i>Segment</i> identifies an
     * individual segment to be scanned by an application "worker" (such as a
     * thread or a process). Each worker issues a <i>Scan</i> request with a
     * distinct value for the segment it will scan. Segment IDs are zero-based,
     * so the first segment is always 0. For example, if you want to scan a
     * table using four application threads, the first thread would specify a
     * <i>Segment</i> value of 0, the second thread would specify 1, and so on.
     * LastEvaluatedKey returned from a parallel scan request must be used with
     * same Segment id in a subsequent operation. The value for <i>Segment</i>
     * must be less than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>. If you specify <i>Segment</i>, you must also
     * specify <i>TotalSegments</i>.
     */
    private int segment;

    /**
     * Whether to collect GetNextSet and GetRemaining results in Matches
     * property. Default is true. If set to false, Matches will always be empty.
     */
    private boolean collectResults;

    /**
     * A logical operator to apply to the conditions in the Filter property: AND
     * - If all of the conditions evaluate to true, then the entire filter
     * evaluates to true. OR - If at least one of the conditions evaluate to
     * true, then the entire filter evaluates to true. Default value is AND.
     */
    private ConditionalOperator conditionalOperator;

    protected boolean isConsistentRead() {
        return consistentRead;
    }

    protected List<String> getAttributesToGet() {
        return attributesToGet;
    }

    protected int getLimit() {
        return limit;
    }

    protected Expression getFilterExpression() {
        return filterExpression;
    }

    protected ScanFilter getFilter() {
        return filter;
    }

    protected String getIndexName() {
        return indexName;
    }

    protected Select getSelect() {
        return select;
    }

    protected int getTotalSegments() {
        return totalSegments;
    }

    protected int getSegment() {
        return segment;
    }

    protected boolean isCollectResults() {
        return collectResults;
    }

    protected ConditionalOperator getConditionalOperator() {
        return conditionalOperator;
    }

    /**
     * Set Consistent Read.
     *
     * @param consistentRead flag indicating if reads are consistent.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * Set attributes to get.
     *
     * @param attributesToGet the list of attributes to get.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withAttributesToGet(List<String> attributesToGet) {
        this.attributesToGet = attributesToGet;
        return this;
    }

    /**
     * The pagination size.
     *
     * @param limit the pagination limit.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Set filter expression.
     *
     * @param filterExpression the filter expression. see {@link Expression}.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withFilterExpression(Expression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    /**
     * Set Query Filter.
     *
     * @param filter the QueryFilter expression. see {@link QueryFilter}.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withFilter(ScanFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Name of the index to query.
     *
     * @param indexName the index name.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * Attributes to select.
     *
     * @param select {@link Select}.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withSelect(Select select) {
        this.select = select;
        return this;
    }

    /**
     * For parallel <i>Scan</i> requests, <i>TotalSegments</i>represents the
     * total number of segments for a table that is being scanned. Segments are
     * a way to logically divide a table into equally sized portions, for the
     * duration of the <i>Scan</i> request. The value of <i>TotalSegments</i>
     * corresponds to the number of application "workers" (such as threads or
     * processes) that will perform the parallel <i>Scan</i>. For example, if
     * you want to scan a table using four application threads, you would
     * specify a <i>TotalSegments</i> value of 4. The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than or
     * equal to 4096. If you specify a <i>TotalSegments</i> value of 1, the
     * <i>Scan</i> will be sequential rather than parallel. If you specify
     * <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     *
     * @param totalSegments value in range 1-4096
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withTotalSegments(int totalSegments) {
        this.totalSegments = totalSegments;
        return this;
    }

    /**
     * For parallel <i>Scan</i> requests, <i>Segment</i> identifies an
     * individual segment to be scanned by an application "worker" (such as a
     * thread or a process). Each worker issues a <i>Scan</i> request with a
     * distinct value for the segment it will scan. Segment IDs are zero-based,
     * so the first segment is always 0. For example, if you want to scan a
     * table using four application threads, the first thread would specify a
     * <i>Segment</i> value of 0, the second thread would specify 1, and so on.
     * LastEvaluatedKey returned from a parallel scan request must be used with
     * same Segment id in a subsequent operation. The value for <i>Segment</i>
     * must be less than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>. If you specify <i>Segment</i>, you must also
     * specify <i>TotalSegments</i>.
     *
     * @param segment values in range 0-4095.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withSegment(int segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Whether to collect GetNextSet and GetRemaining results in Matches
     * property. Default is true. If set to false, Matches will always be empty.
     *
     * @param collectResults Whether to collect GetNextSet and GetRemaining
     *            results in Matches property
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withCollectResults(boolean collectResults) {
        this.collectResults = collectResults;
        return this;
    }

    /**
     * A logical operator to apply to the conditions in the Filter property: AND
     * - If all of the conditions evaluate to true, then the entire filter
     * evaluates to true. OR - If at least one of the conditions evaluate to
     * true, then the entire filter evaluates to true. Default value is AND.
     *
     * @param conditionalOperator the Conditional operator. see
     *            {@link ConditionalOperator}.
     * @return current instance of {@link ScanOperationConfig}.
     */
    public ScanOperationConfig withConditionalOperator(
            ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

}
