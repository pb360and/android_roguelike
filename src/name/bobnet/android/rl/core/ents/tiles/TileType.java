package name.bobnet.android.rl.core.ents.tiles;

import name.bobnet.android.rl.core.ents.Entity;

/**
 * A basic tile type
 * 
 * @author boris
 */
public abstract class TileType implements Entity {

	/**
	 * The style of the tile
	 * 
	 * For example, a wall could be made of rocks, metal, wood, etc.
	 * 
	 * @author boris
	 */
	public enum TileStyle {
		ROCK, WOOD, GLASS, METAL
	}

	// variables
	protected TileStyle style;

	public TileType(TileStyle style) {
		setStyle(style);
	}

	/**
	 * @return the style
	 */
	public TileStyle getStyle() {
		return style;
	}

	/**
	 * @param style
	 *            the style to set
	 * @throws NullPointerException
	 *             thrown when style is null
	 */
	public void setStyle(TileStyle style) {
		if (style == null)
			throw new NullPointerException("style connot be null");

		// set style
		this.style = style;
	}

}