package com.jjlin.processor;
// Generated from XQuery.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code apitself}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApitself(XQueryParser.ApitselfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apitself}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApitself(XQueryParser.ApitselfContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XQueryParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XQueryParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDot(XQueryParser.RpDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDot(XQueryParser.RpDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpSlash(XQueryParser.RpSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpSlash(XQueryParser.RpSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDoubleDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDoubleDot(XQueryParser.RpDoubleDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDoubleDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDoubleDot(XQueryParser.RpDoubleDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpParentheses}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParentheses(XQueryParser.RpParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpParentheses}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParentheses(XQueryParser.RpParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpStar(XQueryParser.RpStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpStar(XQueryParser.RpStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAttribute(XQueryParser.RpAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAttribute(XQueryParser.RpAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpName(XQueryParser.RpNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpName(XQueryParser.RpNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpComma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpComma(XQueryParser.RpCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpComma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpComma(XQueryParser.RpCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDoubleSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDoubleSlash(XQueryParser.RpDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDoubleSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDoubleSlash(XQueryParser.RpDoubleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterIs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterIs(XQueryParser.FilterIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterIs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterIs(XQueryParser.FilterIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterParentheses}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterParentheses(XQueryParser.FilterParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterParentheses}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterParentheses(XQueryParser.FilterParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterOr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterOr(XQueryParser.FilterOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterOr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterOr(XQueryParser.FilterOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterEqual}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqual(XQueryParser.FilterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterEqual}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqual(XQueryParser.FilterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterAnd}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(XQueryParser.FilterAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterAnd}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(XQueryParser.FilterAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterNot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(XQueryParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterNot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(XQueryParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqVar(XQueryParser.XqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqVar(XQueryParser.XqVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqFLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqFLWR(XQueryParser.XqFLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqFLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqFLWR(XQueryParser.XqFLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqName}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqName(XQueryParser.XqNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqName}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqName(XQueryParser.XqNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqDoubleSlash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqDoubleSlash(XQueryParser.XqDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqDoubleSlash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqDoubleSlash(XQueryParser.XqDoubleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqSlash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqSlash(XQueryParser.XqSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqSlash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqSlash(XQueryParser.XqSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqParentheses}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqParentheses(XQueryParser.XqParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqParentheses}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqParentheses(XQueryParser.XqParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqStringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqStringConstant(XQueryParser.XqStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqStringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqStringConstant(XQueryParser.XqStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLet(XQueryParser.XqLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLet(XQueryParser.XqLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqComma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqComma(XQueryParser.XqCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqComma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqComma(XQueryParser.XqCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(XQueryParser.CondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(XQueryParser.CondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condParentheses}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParentheses(XQueryParser.CondParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condParentheses}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParentheses(XQueryParser.CondParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIs(XQueryParser.CondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIs(XQueryParser.CondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condSatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSatisfy(XQueryParser.CondSatisfyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condSatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSatisfy(XQueryParser.CondSatisfyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(XQueryParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(XQueryParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(XQueryParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(XQueryParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqual(XQueryParser.CondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqual(XQueryParser.CondEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(XQueryParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(XQueryParser.CondNotContext ctx);
}