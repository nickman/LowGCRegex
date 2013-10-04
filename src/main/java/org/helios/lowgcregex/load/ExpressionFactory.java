/**
 * lowgcregex
 */
package org.helios.lowgcregex.load;

/**
 * <p>Title: ExpressionFactory</p>
 * <p>Description: Enumerates the available expression factories.</p> 
 * @author Nicholas Whitehead
 * <p><code>org.helios.lowgcregex.load.ExpressionFactory</code></p>
 */
public enum ExpressionFactory {
	STRING,
	STRBUILDER,
	CHARBUFF,
	DIRECT_CHARBUFF;
}
