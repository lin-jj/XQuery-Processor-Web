package com.jjlin.processor;
// Generated from XQuery.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code apitself}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApitself(XQueryParser.ApitselfContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(XQueryParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDot(XQueryParser.RpDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpSlash(XQueryParser.RpSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDoubleDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDoubleDot(XQueryParser.RpDoubleDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpParentheses}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParentheses(XQueryParser.RpParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpStar(XQueryParser.RpStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpAttribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAttribute(XQueryParser.RpAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpName(XQueryParser.RpNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpComma}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpComma(XQueryParser.RpCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDoubleSlash}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDoubleSlash(XQueryParser.RpDoubleSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterIs}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterIs(XQueryParser.FilterIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterParentheses}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterParentheses(XQueryParser.FilterParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterOr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(XQueryParser.FilterOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterEqual}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqual(XQueryParser.FilterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterAnd}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(XQueryParser.FilterAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterNot}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(XQueryParser.FilterNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqVar(XQueryParser.XqVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqFLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqFLWR(XQueryParser.XqFLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqName}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqName(XQueryParser.XqNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqDoubleSlash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqDoubleSlash(XQueryParser.XqDoubleSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqSlash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSlash(XQueryParser.XqSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqParentheses}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqParentheses(XQueryParser.XqParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqStringConstant}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqStringConstant(XQueryParser.XqStringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqLet(XQueryParser.XqLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqComma}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqComma(XQueryParser.XqCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEmpty(XQueryParser.CondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condParentheses}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParentheses(XQueryParser.CondParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIs(XQueryParser.CondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condSatisfy}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondSatisfy(XQueryParser.CondSatisfyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(XQueryParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(XQueryParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqual(XQueryParser.CondEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(XQueryParser.CondNotContext ctx);
}