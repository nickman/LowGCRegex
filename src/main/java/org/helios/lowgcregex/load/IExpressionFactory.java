/**
 * lowgcregex
 */
package org.helios.lowgcregex.load;

/**
 * <p>Title: IExpressionFactory</p>
 * <p>Description: Defines a class that creates expressions to populate the {@link ContentStreamGenerator} stream.</p> 
 * @author Nicholas Whitehead
 * <p><code>org.helios.lowgcregex.load.IExpressionFactory</code></p>
 */
public interface IExpressionFactory {
	/**
	 * Returns the next expression
	 * @return the next expression
	 */
	public CharSequence nextExpression();
}
