// Generated from SetLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetLangParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SetLangParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareAssign}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAssign(SetLangParser.DeclareAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(SetLangParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SetLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Write}
	 * labeled alternative in {@link SetLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(SetLangParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(SetLangParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(SetLangParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(SetLangParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(SetLangParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(SetLangParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReal(SetLangParser.ExprRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(SetLangParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(SetLangParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(SetLangParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSet}
	 * labeled alternative in {@link SetLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSet(SetLangParser.ExprSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetLangParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SetLangParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SetLangParser.TypeContext ctx);
}