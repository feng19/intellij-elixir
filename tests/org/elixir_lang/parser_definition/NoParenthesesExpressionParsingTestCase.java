package org.elixir_lang.parser_definition;

public class NoParenthesesExpressionParsingTestCase extends ParsingTestCase {
    public void testCharTokenNumber() {
        doTest(true);
    }

    public void testFunction() {
        doTest(true);
    }

    public void testFunctionEOLPositional() {
        doTest(true);
    }

    public void testFunctionSpaceEmptyParentheses() {
        doTest(true);
    }

    public void testFunctionSpaceKeywordsInParentheses() {
        doTest(true);
    }

    public void testFunctionSpacePositionalsAndKeywordsInParentheses() {
        doTest(true);
    }

    public void testFunctionSpacePositionalsInParentheses() {
        doTest(true);
    }

    public void testKeywords() {
        doTest(true);
    }

    public void testKeywordValue() {
        doTest(true);
    }

    public void testKeywordValueEOLComma() {
        doTest(true);
    }

    public void testNoParenthesesExpressionKeywordValue() {
        doTest(true);
    }

    public void testPositional() {
        doTest(true);
    }

    public void testPositionalEOLComma() {
        doTest(true);
    }

    public void testPositionalsEOLComma() {
        doTest(true);
    }

    public void testPositionalsWithKeywords() {
        doTest(true);
    }

    public void testPositionalsWithoutKeywords() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/no_parentheses_expression_parsing_test_case";
    }
}