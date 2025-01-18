// Generated from SetLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetLangParser}.
 */
public interface SetLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetLangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SetLangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetLangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SetLangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareAssign}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAssign(SetLangParser.DeclareAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareAssign}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAssign(SetLangParser.DeclareAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(SetLangParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(SetLangParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SetLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SetLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Write}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(SetLangParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Write}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(SetLangParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(SetLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(SetLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(SetLangParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(SetLangParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(SetLangParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(SetLangParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(SetLangParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(SetLangParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(SetLangParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(SetLangParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReal(SetLangParser.ExprRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReal(SetLangParser.ExprRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(SetLangParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(SetLangParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(SetLangParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(SetLangParser.ExprStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(SetLangParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(SetLangParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSet(SetLangParser.ExprSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSet(SetLangParser.ExprSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetLangParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SetLangParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetLangParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SetLangParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SetLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SetLangParser.TypeContext ctx);
}